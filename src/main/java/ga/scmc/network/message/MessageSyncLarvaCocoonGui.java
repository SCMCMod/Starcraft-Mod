package ga.scmc.network.message;

import ga.scmc.client.gui.GuiLarvaProgress;
import ga.scmc.entity.living.EntityLarvaCocoon;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSyncLarvaCocoonGui implements IMessage, IMessageHandler<MessageSyncLarvaCocoonGui, IMessage> {

	private int id;

	public MessageSyncLarvaCocoonGui() {
	}

	public MessageSyncLarvaCocoonGui(EntityLarvaCocoon larva) {
		this.id = larva.getEntityId();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(id);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		id = buf.readInt();
	}

	@Override
	public IMessage onMessage(MessageSyncLarvaCocoonGui message, MessageContext ctx) {
		EntityPlayer player = Minecraft.getMinecraft().player;
		World world = player.world;

		if (world.isRemote) {
			if (Minecraft.getMinecraft().currentScreen instanceof GuiLarvaProgress) {
				GuiLarvaProgress gui = (GuiLarvaProgress) Minecraft.getMinecraft().currentScreen;
				gui.setCocoon((EntityLarvaCocoon) world.getEntityByID(message.id));
			}
		}

		return null;
	}
}