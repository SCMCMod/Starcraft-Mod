package io.github.scmcmod.network.message;

import io.github.scmcmod.entity.vehicles.EntitySpaceship;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageShipAbility implements IMessage
{

	private int abilityIndex;

	public MessageShipAbility()
	{
	}

	public MessageShipAbility(int ability)
	{
		abilityIndex = ability;
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		abilityIndex = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(abilityIndex);
	}

	public static class Handler implements IMessageHandler<MessageShipAbility, IMessage>
	{

		@Override
		public IMessage onMessage(MessageShipAbility msg, MessageContext ctx)
		{
			FMLCommonHandler.instance().getWorldThread(ctx.netHandler).addScheduledTask(() -> processMessage(msg, ctx));
			return null;
		}

		void processMessage(MessageShipAbility msg, MessageContext ctx)
		{
			if (ctx.getServerHandler().player.getRidingEntity() instanceof EntitySpaceship)
			{
				EntitySpaceship ship = (EntitySpaceship) ctx.getServerHandler().player.getRidingEntity();
				ship.useAbility(msg.abilityIndex);
			}

		}
	}
}
