package ga.scmc.blocks.flora;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockKaldirBrambles extends BlockContainer implements ITileEntityProvider {

	public BlockKaldirBrambles() {
		super(Material.GOURD, MapColor.GREEN);
		setRegistryName("flora.kaldir.brambles");
		setUnlocalizedName("flora.kaldir.brambles");
		setSoundType(SoundType.PLANT);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return null;
	}
}