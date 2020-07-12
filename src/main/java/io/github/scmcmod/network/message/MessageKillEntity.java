package io.github.scmcmod.network.message;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageKillEntity implements IMessage, IMessageHandler<MessageKillEntity, IMessage>
{

	private int entityId;

	public MessageKillEntity()
	{
	}

	public MessageKillEntity(EntityLivingBase entity)
	{
		this.entityId = entity.getEntityId();
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(entityId);
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		entityId = buf.readInt();
	}

	@Override
	public IMessage onMessage(MessageKillEntity message, MessageContext ctx)
	{
		EntityPlayer player = ctx.getServerHandler().player;
		World world = player.world;

		if (!world.isRemote)
		{
			EntityLivingBase entity = (EntityLivingBase) world.getEntityByID(message.entityId);
			entity.onDeath(DamageSource.OUT_OF_WORLD);
			entity.setHealth(0);
		}

		return null;
	}
}