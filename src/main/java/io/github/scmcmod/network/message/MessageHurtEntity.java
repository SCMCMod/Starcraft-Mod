package io.github.scmcmod.network.message;

import io.github.scmcmod.damagesource.SCDamageSourceManager;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageHurtEntity implements IMessage, IMessageHandler<MessageHurtEntity, IMessage>
{

	private int entityId;
	private float damage;

	public MessageHurtEntity()
	{
	}

	public MessageHurtEntity(EntityLivingBase entity, float damage)
	{
		this.entityId = entity.getEntityId();
		this.damage = damage;
	}

	@Override
	public void toBytes(ByteBuf buf)
	{
		buf.writeInt(entityId);
		buf.writeFloat(damage);
	}

	@Override
	public void fromBytes(ByteBuf buf)
	{
		entityId = buf.readInt();
		damage = buf.readFloat();
	}

	@Override
	public IMessage onMessage(MessageHurtEntity message, MessageContext ctx)
	{
		EntityPlayer player = ctx.getServerHandler().player;
		World world = player.world;

		if (!world.isRemote)
		{
			EntityLivingBase entity = (EntityLivingBase) world.getEntityByID(message.entityId);
			entity.attackEntityFrom(SCDamageSourceManager.causeBulletDamage(entity), message.damage);
			entity.hurtResistantTime = 0;
		}

		return null;
	}
}