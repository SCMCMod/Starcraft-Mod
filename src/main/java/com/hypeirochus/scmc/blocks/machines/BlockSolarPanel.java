package com.hypeirochus.scmc.blocks.machines;

import com.hypeirochus.scmc.tileentity.TileEntitySolarPanel;
import com.ruthless_bug13.rapi.api.energy.base.EnergyBlock;
import com.ruthless_bug13.rapi.api.tileentity.TileEntityEnergy;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class BlockSolarPanel extends EnergyBlock implements ITileEntityProvider
{
	public BlockSolarPanel(String name) { super(name, Material.IRON); }
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		if (!world.isRemote) 
		{
			TileEntityEnergy tile = (TileEntityEnergy) world.getTileEntity(pos);
			
			String message = "Energy: " + (int) tile.GetEnergy() + "/" + (int) tile.GetMaxEnergy() + "!";
			player.sendMessage(new TextComponentString(message).setStyle(new Style().setColor(TextFormatting.GOLD)));
		}
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) 
	{
		return new TileEntitySolarPanel();
	}
}