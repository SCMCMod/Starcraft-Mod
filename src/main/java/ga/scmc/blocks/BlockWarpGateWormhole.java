package ga.scmc.blocks;

import java.util.Random;

import ga.scmc.tileentity.TileEntityWarpGateWormhole;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockWarpGateWormhole extends Block implements ITileEntityProvider {

	public BlockWarpGateWormhole() {
		super(Material.ROCK, MapColor.BLACK);
		setUnlocalizedName("warpGateWormhole");
		setRegistryName("warp_gate_wormhole");
		setSoundType(SoundType.STONE);
		setBlockUnbreakable();
		setTickRandomly(true);
		setCreativeTab(null);
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return null;
	}

	@Override
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
		TileEntityWarpGateWormhole te = (TileEntityWarpGateWormhole) worldIn.getTileEntity(pos);
		for (int xx = -1; xx < 2; xx++) {
			for (int yy = -1; yy < 2; yy++) {
				for (int zz = -1; zz < 2; zz++) {
					double x = (double) pos.getX() + 0.5D;
					double y = (double) pos.getY() + rand.nextDouble() * 9.0D / 16.0D;
					double z = (double) pos.getZ() + 0.5D;

					worldIn.spawnParticle(EnumParticleTypes.SPELL_MOB, x + xx, y + yy, z + zz, te.getColor().x, te.getColor().y, te.getColor().z, new int[0]);
				}
			}
		}
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
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
		return NULL_AABB;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityWarpGateWormhole();
	}
}