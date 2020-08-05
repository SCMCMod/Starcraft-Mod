package io.github.scmcmod.blocks;

import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class DynamicRedstoneOreBlock extends BlockRedstoneOre {
	public DynamicRedstoneOreBlock(boolean isOn) {
		super(isOn);
	}

	@Override
	public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
		return layer == BlockRenderLayer.CUTOUT || layer == BlockRenderLayer.SOLID;
	}
}
