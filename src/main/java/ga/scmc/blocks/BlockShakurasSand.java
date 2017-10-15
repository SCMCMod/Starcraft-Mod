package ga.scmc.blocks;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockShakurasSand extends BlockFalling {

	public BlockShakurasSand() {
		super(Material.SAND);
		setUnlocalizedName("shakurasSand");
		setRegistryName("shakuras_sand");
		setSoundType(SoundType.SAND);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("shovel", 0);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.LIGHT_BLUE;
	}

	@Override
	public int getDustColor(IBlockState p_189876_1_) {
		return 6724056;
	}
}