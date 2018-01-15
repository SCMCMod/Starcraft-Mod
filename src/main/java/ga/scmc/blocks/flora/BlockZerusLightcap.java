package ga.scmc.blocks.flora;

import ga.scmc.tileentity.TileEntityZerusLightcap;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockZerusLightcap extends BlockContainer {

	public BlockZerusLightcap() {
		super(Material.VINE, MapColor.GREEN);
		setRegistryName("flora.zerus.lightcap");
		setUnlocalizedName("flora.zerus.lightcap");
		setSoundType(SoundType.PLANT);
		// setCreativeTab(StarcraftCreativeTabs.FLORA);
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
		return new TileEntityZerusLightcap();
	}
}