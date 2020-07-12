package io.github.scmcmod.blocks;

import io.github.scmcmod.tileentity.TileEntityProtossPowerCore;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.rom.block.RegistryType;

public class ProtossPowerCoreBlock extends SCProtossCoreBlock implements ITileEntityProvider
{

	public ProtossPowerCoreBlock(MapColor color)
	{
		super(color);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
		return new TileEntityProtossPowerCore();
	}
}