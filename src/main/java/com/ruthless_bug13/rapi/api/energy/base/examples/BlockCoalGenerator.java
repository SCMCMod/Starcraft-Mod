package com.ruthless_bug13.rapi.api.energy.base.examples;

import javax.annotation.Nullable;

import com.ruthless_bug13.rapi.api.energy.IEnergyBlock;
import com.ruthless_bug13.rapi.api.energy.base.EnergyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * @author Ruthless_Bug13
 * 
 * This is an example class!
 */
/*public class BlockCoalGenerator extends EnergyBlock implements ITileEntityProvider
{
	public BlockCoalGenerator(String name) { super(name, Material.IRON); }
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		if (!worldIn.isRemote) 
			return false;
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return new TileEntityCoalGenerator();
	}
}*/