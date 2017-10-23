package ga.scmc.network.message;

import ga.scmc.entity.living.EntityLarva;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageEditEntity implements IMessage, IMessageHandler<MessageEditEntity, IMessage> {

	private EntityLarva larva;

	public MessageEditEntity() {
	}

	public MessageEditEntity(EntityLarva larva) {
		this.larva = larva;
	}

	@Override
	public void toBytes(ByteBuf buf) {
	}

	@Override
	public void fromBytes(ByteBuf buf) {
	}

	@Override
	public IMessage onMessage(MessageEditEntity message, MessageContext ctx) {
		EntityPlayer player = ctx.getServerHandler().playerEntity;
		World world = player.world;
		return null;
	}
}