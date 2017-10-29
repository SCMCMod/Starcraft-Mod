package ga.scmc.network.message;

import ga.scmc.events.GuiOverlayEvent;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSyncPlayerShield implements IMessage, IMessageHandler<MessageSyncPlayerShield, IMessage> {

	private double shield;

	public MessageSyncPlayerShield() {
	}

	public MessageSyncPlayerShield(double shield) {
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
	public IMessage onMessage(MessageSyncPlayerShield message, MessageContext ctx) {
		if (message.shield != -1) {
			EntityPlayer player = ctx.getServerHandler().playerEntity;
			World world = player.world;
			if (world.isRemote) {
				GuiOverlayEvent.setShield(player, shield);
			} else {
				GuiOverlayEvent.setShield(player, shield);
			}
		}
		return null;
	}
}