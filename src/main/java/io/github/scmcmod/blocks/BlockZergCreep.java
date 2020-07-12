package io.github.scmcmod.blocks;

import java.util.Random;

import io.github.scmcmod.config.SCConfig;
import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.entity.living.EntityNafash;
import io.github.scmcmod.entity.living.EntityQueen;
import io.github.scmcmod.entity.living.EntityZergMob;
import io.github.scmcmod.entity.living.EntityZergPassive;
import io.github.scmcmod.enums.EnumFactionTypes;
import io.github.scmcmod.handlers.ArmorHandler;
import io.github.scmcmod.handlers.ItemHandler;
import io.github.scmcmod.handlers.SoundHandler.SoundTypes;
import io.github.scmcmod.init.StarCraftBlocks;
import io.github.scmcmod.lib.Library;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.rom.block.BlockGeneric;

public class BlockZergCreep extends BlockGeneric
{

	public BlockZergCreep()
	{
		super(Material.GROUND, MapColor.BLACK);
		setSoundType(SoundTypes.FLESH);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("shovel", 2);
		setTickRandomly(true);
		setCreativeTab(SCCreativeTabs.ZERG);
	}

	@Override
	protected boolean canSilkHarvest()
	{
		return true;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ItemHandler.CREEP_RESIN;
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
	{
		if (entityIn instanceof EntityZergMob)
		{
			if (entityIn instanceof EntityQueen || entityIn instanceof EntityNafash)
			{
				entityIn.motionX *= 1.6D;
				entityIn.motionZ *= 1.6D;
			} else if (!((EntityZergMob) entityIn).isFaction(EnumFactionTypes.PRIMALZERG))
			{
				entityIn.motionX *= 1.2D;
				entityIn.motionZ *= 1.2D;
			}
		} else if (entityIn instanceof EntityZergPassive)
		{
			if (!((EntityZergPassive) entityIn).isFaction(EnumFactionTypes.PRIMALZERG))
			{
				entityIn.motionX *= 1.2D;
				entityIn.motionZ *= 1.2D;
			}
		}
		if (entityIn instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entityIn;
			try
			{
				if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ArmorHandler.ZERG_T1_HELMET && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ArmorHandler.ZERG_T1_CHESTPLATE
						&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ArmorHandler.ZERG_T1_LEGGINGS && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorHandler.ZERG_T1_BOOTS)
				{
					player.motionX *= 1.1D;
					player.motionZ *= 1.1D;
				} else if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ArmorHandler.ZERG_T2_HELMET && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ArmorHandler.ZERG_T2_CHESTPLATE
						&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ArmorHandler.ZERG_T2_LEGGINGS && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorHandler.ZERG_T2_BOOTS)
				{
					player.motionX *= 1.2D;
					player.motionZ *= 1.2D;
				} else if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ArmorHandler.ZERG_T3_HELMET && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ArmorHandler.ZERG_T3_CHESTPLATE
						&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ArmorHandler.ZERG_T3_LEGGINGS && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorHandler.ZERG_T3_BOOTS)
				{
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				} else
				{

				}
			} catch (NullPointerException e)
			{
			}
		}
	}

	@Override
	public int tickRate(World world)
	{
		return SCConfig.INT_CREEP_SPREAD_BASE_VALUE * 20;
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
	{
		if (!world.isRemote)
		{
			if (world.getLightFromNeighbors(pos.up()) >= 9 && SCConfig.BOOL_CREEP_CAN_SPREAD)
			{
				for (int i = 0; i < 1000 * SCConfig.INT_CREEP_SPREAD_BASE_VALUE; ++i)
				{
					BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

					if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !world.isBlockLoaded(blockpos))
					{
						return;
					}

					IBlockState iblockstate = world.getBlockState(blockpos);

					if (iblockstate.isOpaqueCube() && !Library.checkCube(world, Blocks.AIR.getDefaultState(), blockpos, 3).isEmpty()
							&& (iblockstate.getBlock() == Blocks.GRASS || iblockstate.getBlock() == Blocks.SAND || iblockstate.getBlock() == Blocks.SNOW || iblockstate.getBlock() == StarCraftBlocks.DIRT_SLAYN || iblockstate.getBlock() == StarCraftBlocks.SAND_SLAYN
									|| iblockstate.getBlock() == StarCraftBlocks.SAND_SHAKURAS || iblockstate.getBlock() == StarCraftBlocks.DIRT_SHAKURAS || iblockstate.getBlock() == StarCraftBlocks.SAND_ZERUS || iblockstate.getBlock() == StarCraftBlocks.DIRT_ZERUS
									|| iblockstate.getBlock() == StarCraftBlocks.DIRT_CHAR))
					{
						world.setBlockState(blockpos, StarCraftBlocks.ZERG_CREEP.getDefaultState());
					}
				}
			}
		}
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	{
		/*
		 * Find parent here. If no parent, the creep will instead have a null parent.
		 * This will force the creep to decay over time without a parent
		 */
		super.onBlockAdded(worldIn, pos, state);
	}
}