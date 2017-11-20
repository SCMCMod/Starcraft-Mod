package ga.scmc.blocks;

import java.util.Random;

import ga.scmc.StarcraftDamageSources;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.FluidHandler;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Vespene Fluid<br>
 * Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team
 * 
 * @author Hypeirochus
 */
public class BlockVespeneFluid extends BlockFluidClassic {

	public BlockVespeneFluid() {
		super(FluidHandler.VESPENE, Material.WATER);
		setCreativeTab(null);
		setUnlocalizedName("fluid.vespene");
		setRegistryName("fluid.vespene");
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.GREEN;
	}

	@Override
	public int tickRate(World world) {
		return 120;
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		if (world.getBlockState(pos.up()) == Blocks.AIR.getDefaultState()) {
			if (rand.nextInt(100) < 25) {
				world.setBlockState(pos.up(), BlockHandler.GAS_VESPENE.getDefaultState());
			}
		}
		super.updateTick(world, pos, state, rand);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		entity.attackEntityFrom(StarcraftDamageSources.poisonFluid, 4);
	}
}
