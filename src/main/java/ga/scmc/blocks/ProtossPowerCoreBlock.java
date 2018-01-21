package ga.scmc.blocks;

import java.util.LinkedList;

import ga.scmc.tileentity.TileEntityProtossPowerCore;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
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
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		System.out.println(CORE_POSITIONS);
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityProtossPowerCore();
	}
}