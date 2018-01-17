package ga.scmc.blocks;

import java.util.LinkedList;

import ga.scmc.tileentity.TileEntityProtossPowerCore;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ProtossPowerCoreBlock extends StarcraftProtossCoreBlock implements ITileEntityProvider {

	public static final LinkedList<BlockPos> CORE_POSITIONS = new LinkedList<BlockPos>();

	public ProtossPowerCoreBlock(String name, Material material, MapColor color) {
		super(name, RegistryType.FULL, material, color);
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		CORE_POSITIONS.remove(pos);
		super.breakBlock(world, pos, state);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityProtossPowerCore();
	}
}