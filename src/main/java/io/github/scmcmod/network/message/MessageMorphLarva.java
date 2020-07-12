package io.github.scmcmod.network.message;

import io.github.scmcmod.entity.living.EntityLarva;
import io.github.scmcmod.entity.living.EntityLarvaCocoon;
import io.github.scmcmod.lib.Library;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageMorphLarva implements IMessage, IMessageHandler<MessageMorphLarva, IMessage>
{

	private int id;
	private byte replaceId;

	public MessageMorphLarva()
	{
	}

	public MessageMorphLarva(EntityLarva larva, int replaceId)
	{
		this.id = larva.getEntityId();
		this.replaceId = (byte) replaceId;
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(id);
		buf.writeByte(replaceId);
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		id = buf.readInt();
		replaceId = buf.readByte();
	}

	@Override
	public IMessage onMessage(MessageMorphLarva message, MessageContext ctx)
	{
		EntityPlayer player = ctx.getServerHandler().player;
		World world = player.world;

		if (world.getEntityByID(message.id) instanceof EntityLarva)
		{
			EntityLarva larva = (EntityLarva) world.getEntityByID(message.id);
			EntityLarvaCocoon cocoon = new EntityLarvaCocoon(world, message.replaceId);
			cocoon.setColor(larva.getColor());
			Library.replaceEntity(true, larva, cocoon);
		}

		return null;
	}
}