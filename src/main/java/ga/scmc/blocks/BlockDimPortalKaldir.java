package ga.scmc.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.TeleporterHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDimPortalKaldir extends Block {

	private int dim = ConfigurationHandler.INT_DIMENSION_KALDIR;

	public BlockDimPortalKaldir() {
		super(Material.PORTAL, MapColor.BLACK);
		setLightLevel(1.0F);
		setBlockUnbreakable();
		setUnlocalizedName("kaldirDimPortal");
		setRegistryName("kaldir_dim_portal");
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.INVISIBLE;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn) {
	}

	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return null;
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.OBSIDIAN;
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	 */
	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		if (!entity.isRiding() && !entity.isBeingRidden() && !world.isRemote) {

			try {
				EntityPlayerMP player = (EntityPlayerMP) entity;
				if (player.dimension != dim) {
					player.getServer().getPlayerList().transferPlayerToDimension(player, dim, new TeleporterHandler(player.mcServer.worldServerForDimension(dim), player.posX, player.posY, player.posZ));
				}
			} catch (ClassCastException e) {
				return; // Not a player
			}
		}
	}
}