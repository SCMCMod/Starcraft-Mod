package ga.scmc.blocks.itemblocks;

import java.util.List;

import ga.scmc.handlers.BlockHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemBlockBrambles extends ItemBlockMeta {

	public ItemBlockBrambles() {
		super(BlockHandler.FLORA_BRAMBLES);
	}

	@Override
	public int getMetadata(int damage) {
		return 0;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		// TODO remove this when the brambles are done
		tooltip.add("WIP");
	}

	public static ItemStack getDefaultStack(int variant) {
		ItemStack stack = new ItemStack(Item.getItemFromBlock(BlockHandler.FLORA_BRAMBLES), 1, 0);
		NBTTagCompound nbt = new NBTTagCompound();
		NBTTagCompound blockData = new NBTTagCompound();
		blockData.setInteger("variant", variant);
		nbt.setTag("BlockEntityTag", blockData);
		stack.setTagCompound(nbt);
		return stack;
	}

	public enum Type {
		KALDIR, SHAKURAS, ZERUS;

		public int getId() {
			return this.ordinal();
		}

		public String getName() {
			return this.name().toLowerCase();
		}
	}
}