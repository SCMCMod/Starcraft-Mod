package ga.scmc.blocks.flora;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.SoundHandler.SoundTypes;
import ga.scmc.tileentity.TileEntityZerusGlowPod;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * @author Ocelot5836
 */
public class BlockZerusGlowPod extends BlockContainer {

	public BlockZerusGlowPod() {
		super(Material.GOURD, MapColor.BROWN);
		setRegistryName("flora.zerus.glowpod");
		setUnlocalizedName("flora.zerus.glowpod");
		setSoundType(SoundTypes.FLESH);
		setHardness(0.5f);
		setLightLevel(13);
		setCreativeTab(StarcraftCreativeTabs.FLORA);
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
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.0625 * 3, 0, 0.0625 * 3, 0.0625 * 13, 0.0625 * 8, 0.0625 * 13);
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entity) {
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0625 * 4, 0, 0.0625 * 4, 0.0625 * 12, 0.0625 * 6, 0.0625 * 12));
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityZerusGlowPod();
	}
}