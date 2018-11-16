package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.creativetabs.SCCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * 
 * @author Ocelot5836
 */
public class StarcraftDirt extends StarcraftBlock
{

	private IBlockState farmland;

	public StarcraftDirt(String name, MapColor color, IBlockState farmland)
	{
		super(name, RegistryType.FULL, Material.GROUND, color);
		setSoundType(SoundType.GROUND);
		setHardness(0.5f);
		setResistance(0.83f);
		setHarvestLevel("shovel", -1);
		setCreativeTab(SCCreativeTabs.MISC);
		this.farmland = farmland;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		ItemStack heldItem = player.getHeldItem(hand);
		if (heldItem != null && heldItem.getItem() instanceof ItemHoe)
		{
			IBlockState iblockstate = world.getBlockState(pos);
			Block block = iblockstate.getBlock();

			if (facing != EnumFacing.DOWN && world.isAirBlock(pos.up()))
			{
				this.setBlock(heldItem, player, world, pos, farmland);
				return true;
			}
		}
		return false;
	}

	protected void setBlock(ItemStack stack, EntityPlayer player, World world, BlockPos pos, IBlockState state)
	{
		world.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

		if (!world.isRemote)
		{
			world.setBlockState(pos, state, 11);
			stack.damageItem(1, player);
		}
	}

	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable)
	{
		return plantable.getPlantType(world, pos) != EnumPlantType.Crop;
	}
}