package com.arpaesis.scmc.blocks;

import java.util.List;
import java.util.Random;

import com.arpaesis.scmc.handlers.AccessHandler;
import com.arpaesis.scmc.tileentity.TileEntityProtossWormhole;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.rom.block.RegistryType;
import net.rom.client.entityfx.EntityFXElectricArc;

public class BlockProtossWormhole extends SCBlock implements ITileEntityProvider
{

	public BlockProtossWormhole()
	{
		super("protoss.wormhole", RegistryType.BLOCK, Material.ROCK, MapColor.BLACK);
		setSoundType(SoundType.STONE);
		setBlockUnbreakable();
		setTickRandomly(true);
		setCreativeTab(null);
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return ItemStack.EMPTY;
	}

	@Override
	public void randomDisplayTick(IBlockState stateIn, World world, BlockPos pos, Random rand)
	{
		if (world.getTileEntity(pos) instanceof TileEntityProtossWormhole)
		{
			TileEntityProtossWormhole te = (TileEntityProtossWormhole) world.getTileEntity(pos);
			this.spawnElectricArc(world, pos, rand, pos.getX(), pos.getY(), pos.getZ(), te.getColor());
		}
	}

	@SideOnly(Side.CLIENT)
	private void spawnElectricArc(World world, BlockPos pos, Random rand, double posX, double posY, double posZ, int color)
	{
		GlStateManager.enableBlend();
		GlStateManager.pushMatrix();
		AccessHandler.getMinecraft().effectRenderer.addEffect(new EntityFXElectricArc(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, posX + (rand.nextInt(4) - 1), posY, posZ + (rand.nextInt(4) - 1), 10, 2.5F, 0.5F, 0.05F, color));
		AccessHandler.getMinecraft().effectRenderer.addEffect(new EntityFXElectricArc(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, posX - (rand.nextInt(2) - 1), posY, posZ - (rand.nextInt(2) - 1), 10, 2.5F, 0.5F, 0.05F, color));
		AccessHandler.getMinecraft().effectRenderer.addEffect(new EntityFXElectricArc(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, posX + (rand.nextInt(4) - 1), posY, posZ - (rand.nextInt(4) - 1), 10, 2.5F, 0.5F, 0.05F, color));
		AccessHandler.getMinecraft().effectRenderer.addEffect(new EntityFXElectricArc(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, posX - (rand.nextInt(2) - 1), posY, posZ + (rand.nextInt(2) - 1), 10, 2.5F, 0.5F, 0.05F, color));
		GlStateManager.popMatrix();
		GlStateManager.disableBlend();
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
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
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TileEntityProtossWormhole();
	}
}