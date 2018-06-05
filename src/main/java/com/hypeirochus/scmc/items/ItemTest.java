package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.worldgen.structure.BossSpawner;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemTest extends StarcraftItem {

	public ItemTest() {
		super("test.item");
		setCreativeTab(null);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		BossSpawner structure = new BossSpawner();
		structure.generate_r0(0, new EntityItem(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, new ItemStack(Blocks.DIAMOND_BLOCK)), TextFormatting.AQUA, world, 0, 0, 0, pos, false);
		return EnumActionResult.SUCCESS;
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
}