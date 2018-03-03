package com.hypeirochus.scmc.blocks.items;

import java.util.List;

import com.hypeirochus.scmc.handlers.BlockHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemBlockBrambles extends ItemBlockMeta {

	public ItemBlockBrambles() {
		super(BlockHandler.FLORA_BRAMBLES);
		setHasSubtypes(false);
	}

	@Override
	public int getMetadata(int damage) {
		return 0;
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