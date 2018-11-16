package com.hypeirochus.scmc.network.message;

import com.hypeirochus.scmc.network.NetworkHandler;
import com.hypeirochus.scmc.tileentity.TileEntityProtossFurnace;
import com.hypeirochus.scmc.tileentity.TileEntityStarcraftFurnace;

import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class MessageGetFurnaceData implements IMessage
{

	private boolean messageValid;

	private String className, burnTimeFieldName, cookTimeFieldName;

	private BlockPos pos;

	public MessageGetFurnaceData()
	{
		this.messageValid = false;
	}

	public MessageGetFurnaceData(BlockPos pos, String className, String burnTimeFieldName, String cookTimeFieldName)
	{
		this.pos = pos;
		this.className = className;
		this.burnTimeFieldName = burnTimeFieldName;
		this.cookTimeFieldName = cookTimeFieldName;
		this.messageValid = true;
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		try
		{
			this.pos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
			this.className = ByteBufUtils.readUTF8String(buf);
			this.burnTimeFieldName = ByteBufUtils.readUTF8String(buf);
			this.cookTimeFieldName = ByteBufUtils.readUTF8String(buf);
		} catch (IndexOutOfBoundsException ioe)
		{
			ioe.printStackTrace();
			return;
		}
		this.messageValid = true;
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		if (!this.messageValid)
			return;
		buf.writeInt(this.pos.getX());
		buf.writeInt(this.pos.getY());
		buf.writeInt(this.pos.getZ());
		ByteBufUtils.writeUTF8String(buf, this.className);
		ByteBufUtils.writeUTF8String(buf, this.burnTimeFieldName);
		ByteBufUtils.writeUTF8String(buf, this.cookTimeFieldName);
	}

	public static class Handler implements IMessageHandler<MessageGetFurnaceData, IMessage>
	{

		@Override
		public IMessage onMessage(MessageGetFurnaceData msg, MessageContext ctx)
		{
			if (!msg.messageValid || ctx.side != Side.SERVER)
				return null;
			FMLCommonHandler.instance().getWorldThread(ctx.netHandler).addScheduledTask(() -> processMessage(msg, ctx));
			return null;
		}

		void processMessage(MessageGetFurnaceData msg, MessageContext ctx)
		{
			TileEntity tile = ctx.getServerHandler().player.getServerWorld().getTileEntity(msg.pos);
			if (tile instanceof TileEntityStarcraftFurnace)
			{
				TileEntityStarcraftFurnace te = (TileEntityStarcraftFurnace) tile;
				if (te.getCurrentItemBurnTime() != 0)
					NetworkHandler.INSTANCE.sendTo(new MessageReturnFurnaceData((float) te.getBurnTime() / (float) te.getCurrentItemBurnTime(), (float) te.getCurrentCookTime() / (float) te.getTotalCookTime(), msg.className, msg.burnTimeFieldName, msg.cookTimeFieldName),
							ctx.getServerHandler().player);
				else
					NetworkHandler.INSTANCE.sendTo(new MessageReturnFurnaceData(0.0F, (float) te.getCurrentCookTime() / (float) te.getTotalCookTime(), msg.className, msg.burnTimeFieldName, msg.cookTimeFieldName), ctx.getServerHandler().player);
			}

			if (tile instanceof TileEntityProtossFurnace)
			{
				TileEntityProtossFurnace te = (TileEntityProtossFurnace) tile;
				NetworkHandler.INSTANCE.sendTo(new MessageReturnFurnaceData(0.0F, (float) te.getCurrentCookTime() / (float) te.getTotalCookTime(), msg.className, msg.burnTimeFieldName, msg.cookTimeFieldName), ctx.getServerHandler().player);
			}
		}
	}

}
