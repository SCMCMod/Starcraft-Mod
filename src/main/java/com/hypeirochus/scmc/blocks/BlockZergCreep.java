package com.hypeirochus.scmc.blocks;

import java.util.Random;

import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.entity.living.EntityNafash;
import com.hypeirochus.scmc.entity.living.EntityQueen;
import com.hypeirochus.scmc.entity.living.EntityZergMob;
import com.hypeirochus.scmc.entity.living.EntityZergPassive;
import com.hypeirochus.scmc.enums.EnumFactionTypes;
import com.hypeirochus.scmc.handlers.ArmorHandler;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.SoundHandler.SoundTypes;
import com.hypeirochus.scmc.lib.Library;

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

public class BlockZergCreep extends StarcraftBlock {

	public BlockZergCreep() {
		super("zerg.creep", RegistryType.FULL, Material.GROUND, MapColor.BLACK);
		setSoundType(SoundTypes.FLESH);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("shovel", 2);
		setTickRandomly(true);
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemHandler.CREEP_RESIN;
	}

	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if (entityIn instanceof EntityZergMob) {
			if (entityIn instanceof EntityQueen || entityIn instanceof EntityNafash) {
				entityIn.motionX *= 1.6D;
				entityIn.motionZ *= 1.6D;
			} else if (!((EntityZergMob) entityIn).isFaction(EnumFactionTypes.PRIMALZERG)) {
				entityIn.motionX *= 1.2D;
				entityIn.motionZ *= 1.2D;
			}
		} else if (entityIn instanceof EntityZergPassive) {
			if (!((EntityZergPassive) entityIn).isFaction(EnumFactionTypes.PRIMALZERG)) {
				entityIn.motionX *= 1.2D;
				entityIn.motionZ *= 1.2D;
			}
		}
		if (entityIn instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entityIn;
			try {
				if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ArmorHandler.ZERG_T1_HELMET && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ArmorHandler.ZERG_T1_CHESTPLATE && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ArmorHandler.ZERG_T1_LEGGINGS && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorHandler.ZERG_T1_BOOTS) {
					player.motionX *= 1.1D;
					player.motionZ *= 1.1D;
				} else if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ArmorHandler.ZERG_T2_HELMET && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ArmorHandler.ZERG_T2_CHESTPLATE && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ArmorHandler.ZERG_T2_LEGGINGS && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorHandler.ZERG_T2_BOOTS) {
					player.motionX *= 1.2D;
					player.motionZ *= 1.2D;
				} else if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ArmorHandler.ZERG_T3_HELMET && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ArmorHandler.ZERG_T3_CHESTPLATE && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ArmorHandler.ZERG_T3_LEGGINGS && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorHandler.ZERG_T3_BOOTS) {
					player.motionX *= 1.3D;
					player.motionZ *= 1.3D;
				} else {

				}
			} catch (NullPointerException e) {
			}
		}
	}

	@Override
	public int tickRate(World world) {
		return StarcraftConfig.INT_CREEP_SPREAD_BASE_VALUE * 20;
	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
		if (!world.isRemote) {
			if (world.getLightFromNeighbors(pos.up()) >= 9 && StarcraftConfig.BOOL_CREEP_CAN_SPREAD) {
				for (int i = 0; i < 1000 * StarcraftConfig.INT_CREEP_SPREAD_BASE_VALUE; ++i) {
					BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

					if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !world.isBlockLoaded(blockpos)) {
						return;
					}

					IBlockState iblockstate = world.getBlockState(blockpos);

					if (iblockstate.isOpaqueCube() && !Library.checkCube(world, Blocks.AIR.getDefaultState(), blockpos, 3).isEmpty() && (iblockstate.getBlock() == Blocks.GRASS || iblockstate.getBlock() == Blocks.SAND || iblockstate.getBlock() == Blocks.SNOW || iblockstate.getBlock() == BlockHandler.DIRT_SLAYN || iblockstate.getBlock() == BlockHandler.SAND_SLAYN || iblockstate.getBlock() == BlockHandler.SAND_SHAKURAS || iblockstate.getBlock() == BlockHandler.DIRT_SHAKURAS || iblockstate.getBlock() == BlockHandler.SAND_ZERUS || iblockstate.getBlock() == BlockHandler.DIRT_ZERUS || iblockstate.getBlock() == BlockHandler.DIRT_CHAR)) {
						world.setBlockState(blockpos, BlockHandler.ZERG_CREEP.getDefaultState());
					}
				}
			}
		}
	}
}