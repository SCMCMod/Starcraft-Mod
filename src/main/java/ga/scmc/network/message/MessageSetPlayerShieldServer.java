package ga.scmc.network.message;

import ga.scmc.debugging.ShieldProvider;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSetPlayerShieldServer implements IMessage, IMessageHandler<MessageSetPlayerShieldServer, IMessage> {

	private double shield;

	public MessageSetPlayerShieldServer() {
	}

	public MessageSetPlayerShieldServer(double shield) {
		this.shield = shield;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeDouble(shield);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		shield = buf.getDouble(0);
	}

	@Override
	public IMessage onMessage(MessageSetPlayerShieldServer message, MessageContext ctx) {
		EntityPlayer player = ctx.getServerHandler().playerEntity;
		if (!player.world.isRemote) {
			player.getCapability(ShieldProvider.SHIELD, null).set(message.shield);
		}
		return null;
	}
}