package com.hypeirochus.scmc.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemTest extends SCItem
{

	public ItemTest()
	{
		super("test.item");
		setCreativeTab(null);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		return EnumActionResult.SUCCESS;
	}

	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
}