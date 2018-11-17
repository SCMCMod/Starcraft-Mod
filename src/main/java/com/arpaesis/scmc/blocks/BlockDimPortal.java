package com.arpaesis.scmc.blocks;

import java.util.List;
import java.util.Random;

import com.arpaesis.scmc.creativetabs.SCCreativeTabs;
import com.arpaesis.scmc.handlers.TeleporterHandler;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * This class is the base class for any type of dim portal. It only handles the
 * basics so the only thing you need to handle is the actual portal mechanics.
 * 
 * @author Ocelot5836
 */
public class BlockDimPortal extends SCBlock
{

	protected int dim = 0;

	public BlockDimPortal(String name, int dim)
	{
		super(name, RegistryType.BLOCK, Material.PORTAL, MapColor.BLACK);
		this.setBlockUnbreakable();
		this.setLightLevel(1.0F);
		this.setCreativeTab(SCCreativeTabs.MISC);
		this.dim = dim;
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
	{
		return EnumBlockRenderType.INVISIBLE;
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return ItemStack.EMPTY;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	{
		return FULL_BLOCK_AABB;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entity, boolean isActualState)
	{
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, NULL_AABB);
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player)
	{
		return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return null;
	}

	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		return false;
	}

	@Override
	public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity)
	{
		boolean hasNoSurface = false;
		if (dim == 9)
		{
			hasNoSurface = true;
		}
		if (!entity.isRiding() && !entity.isBeingRidden() && !world.isRemote)
		{
			try
			{
				if (entity instanceof EntityPlayer)
				{
					EntityPlayerMP player = (EntityPlayerMP) entity;
					if (player.dimension != dim)
					{
						player.getServer().getPlayerList().transferPlayerToDimension(player, dim, new TeleporterHandler(player.getServerWorld().provider.getDimension(), player.getServer().getWorld(dim), player.posX, player.posY, player.posZ, hasNoSurface));
					}
				}
			} catch (Exception e)
			{
				if (entity instanceof EntityPlayer)
				{
					EntityPlayerMP player = (EntityPlayerMP) entity;
					player.sendStatusMessage(new TextComponentString(String.format("Dimension %s could not be loaded...", dim)), true);
				}
			}
		}
	}
}