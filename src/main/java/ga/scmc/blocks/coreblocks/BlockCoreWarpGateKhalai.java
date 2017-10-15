package ga.scmc.blocks.coreblocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.lib.Library;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCoreWarpGateKhalai extends Block {

	public BlockCoreWarpGateKhalai() {
		super(Material.IRON, MapColor.SAND);
		setUnlocalizedName("coreWarpGateKhalai");
		setRegistryName("core_warpgate_khalai");
		setSoundType(SoundType.METAL);
		setHardness(15.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockAdded(worldIn, pos, state);
		Library.truncatedPyramid(worldIn, pos.add(0, -5, 0), BlockHandler.PROTOSS_SHIELD.getDefaultState(), 16, 13, 3);
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		Library.truncatedPyramid(worldIn, pos.add(0, -5, 0), Blocks.AIR.getDefaultState(), 16, 13, 3);
		super.breakBlock(worldIn, pos, state);
	}
}
