package ga.scmc.blocks;

import ga.scmc.blocks.metablocks.ModBlockLayered;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Ash block. Thin layer of ash that generates commonly on Char.<br>
 * Copyright 2017 the Starcraft Minecraft mod team
 * 
 * @author Hypeirochus
 */
public class BlockAsh extends ModBlockLayered {

	public BlockAsh() {
		super(Material.CARPET, MapColor.BLACK);
		setUnlocalizedName("char.ash");
		setRegistryName("char.ash");
		setSoundType(SoundType.SAND);
		setHardness(0.1F);
		setResistance(0.5f);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	// No @Override because the super method is private
	/**
	 * checks what to drop based on the number of layers of ash
	 * 
	 * @param world
	 *            the world
	 * @param pos
	 *            the position of the block
	 * @param state
	 *            the state of the block
	 * @return
	 */
	private boolean checkAndDropBlock(World world, BlockPos pos, IBlockState state) {
		if (!canPlaceBlockAt(world, pos)) {
			world.setBlockToAir(pos);
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		IBlockState iblockstate = worldIn.getBlockState(pos.down());
		Block block = iblockstate.getBlock();
		return block != Blocks.ICE && block != Blocks.PACKED_ICE ? (iblockstate.getBlock().isLeaves(iblockstate, worldIn, pos.down()) ? true : (block == this && ((Integer) iblockstate.getValue(LAYERS)).intValue() >= 7 ? true : iblockstate.isOpaqueCube() && iblockstate.getMaterial().blocksMovement())) : false;
	}
}
