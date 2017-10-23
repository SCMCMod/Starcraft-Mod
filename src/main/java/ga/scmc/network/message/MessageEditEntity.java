package ga.scmc.network.message;

import ga.scmc.entity.living.EntityDrone;
import ga.scmc.entity.living.EntityHydralisk;
import ga.scmc.entity.living.EntityLarva;
import ga.scmc.entity.living.EntityZerglingSC2;
import ga.scmc.enums.EnumLarvaGuiEntities;
import ga.scmc.lib.Library;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageEditEntity implements IMessage, IMessageHandler<MessageEditEntity, IMessage> {

	private int id;
	private short replaceId;

	public MessageEditEntity() {
	}
	
	public MessageEditEntity(EnumLarvaGuiEntities replaceEntity) {
		this.id = -1;
		this.replaceId = (short) replaceEntity.getId();
	}

	public MessageEditEntity(EntityLarva larva, EnumLarvaGuiEntities replaceEntity) {
		this.id = larva.getEntityId();
		this.replaceId = (short) replaceEntity.getId();
	}
	
	public MessageEditEntity(EntityLarva larva, int replaceEntityId) {
		this.id = larva.getEntityId();
		this.replaceId = (short) replaceEntityId;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(id);
		buf.writeShort(replaceId);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		id = buf.getInt(0);
		replaceId = buf.getShort(1);
	}

	@Override
	public IMessage onMessage(MessageEditEntity message, MessageContext ctx) {
		EntityPlayer player = ctx.getServerHandler().playerEntity;
		World world = player.world;
		
		if(message.id == -1) {
			
		}
		
		if (!(world.getEntityByID(message.id) instanceof EntityLarva)) {
			EntityLarva larva = (EntityLarva) world.getEntityByID(message.id);
			Entity entity = getById(ctx, message.replaceId);
			Library.replaceEntity(true, larva, entity);
		}

		return null;
	}

	private Entity getById(MessageContext ctx, short id) {
		EntityPlayer player = ctx.getServerHandler().playerEntity;
		World world = player.world;

		if (id == 0)
			return new EntityDrone(world);
		if (id == 1)
			return new EntityOcelot(world);
		if (id == 2)
			return new EntityZerglingSC2(world);
		if (id == 3)
			return new EntityOcelot(world);
		if (id == 4)
			return new EntityHydralisk(world);
		if (id == 5)
			return new EntityOcelot(world);
		if (id == 6)
			return new EntityOcelot(world);
		if (id == 7)
			return new EntityOcelot(world);
		if (id == 8)
			return new EntityOcelot(world);
		if (id == 9)
			return new EntityOcelot(world);
		if (id == 10)
			return new EntityOcelot(world);
		if (id == 11)
			return new EntityOcelot(world);
		if (id == 12)
			return new EntityOcelot(world);
		if (id == 13)
			return new EntityOcelot(world);

		return null;
	}
}