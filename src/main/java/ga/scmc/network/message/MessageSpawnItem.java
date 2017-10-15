package ga.scmc.network.message;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSpawnItem implements IMessage, IMessageHandler<MessageSpawnItem, IMessage> {

	private ItemStack stack;

	public MessageSpawnItem() {
	}

	public MessageSpawnItem(ItemStack stack) {
		this.stack = stack;
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(Item.getIdFromItem(stack.getItem()));
		buf.writeInt(stack.stackSize);
		buf.writeInt(stack.getMetadata());
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		stack = new ItemStack(Item.getItemById(buf.readInt()), buf.readInt(), buf.readInt());
	}

	@Override
	public IMessage onMessage(MessageSpawnItem message, MessageContext ctx) {
		if (message.stack != null && message.stack.stackSize > 0 && message.stack.getMetadata() >= 0) {
			EntityPlayer player = ctx.getServerHandler().playerEntity;
			World world = player.world;
			EntityItem item = new EntityItem(world, player.posX, player.posY, player.posZ, message.stack);
			world.spawnEntity(item);
		}
		return null;
	}
}