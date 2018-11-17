package com.arpaesis.scmc.network.message;

import com.arpaesis.scmc.client.gui.GuiLarvaMorph;
import com.arpaesis.scmc.entity.living.EntityLarva;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSyncLarvaGui implements IMessage, IMessageHandler<MessageSyncLarvaGui, IMessage>
{

	private int id;

	public MessageSyncLarvaGui()
	{
	}

	public MessageSyncLarvaGui(EntityLarva larva)
	{
		this.id = larva.getEntityId();
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(id);
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		id = buf.readInt();
	}

	@Override
	public IMessage onMessage(MessageSyncLarvaGui message, MessageContext ctx)
	{
		EntityPlayer player = Minecraft.getMinecraft().player;
		World world = player.world;

		if (world.isRemote)
		{
			if (Minecraft.getMinecraft().currentScreen instanceof GuiLarvaMorph)
			{
				GuiLarvaMorph gui = (GuiLarvaMorph) Minecraft.getMinecraft().currentScreen;
				gui.setLarva((EntityLarva) world.getEntityByID(message.id));
			}
		}

		return null;
	}
}