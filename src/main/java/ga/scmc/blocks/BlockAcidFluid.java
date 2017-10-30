package ga.scmc.blocks;

import ga.scmc.StarcraftDamageSources;
import ga.scmc.handlers.FluidHandler;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

/**
 * Acid fluid. Hurts entities that come into contact<br>
 * Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team
 * 
 * @author Hypeirochus
 */
public class BlockAcidFluid extends BlockFluidClassic {

	public BlockAcidFluid() {
		super(FluidHandler.acid, Material.WATER);
		setUnlocalizedName("fluidAcid");
		setRegistryName("fluid_acid");
		setCreativeTab(null);
	}
	
	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.GREEN;
	}

	/**
	 * Executes code when an entity collides with this block's bounds
	 * 
	 * @param world
	 *            the world
	 * @param pos
	 *            position of the block
	 * @param state
	 *            state of the block
	 * @param entity
	 *            that collides with the block
	 */
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		entity.attackEntityFrom(StarcraftDamageSources.acid, world.getDifficulty().getDifficultyId() + 1 + RANDOM.nextInt(2));
	}
}
