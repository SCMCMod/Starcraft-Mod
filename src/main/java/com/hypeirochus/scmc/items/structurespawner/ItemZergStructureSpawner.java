package com.hypeirochus.scmc.items.structurespawner;

import java.util.Random;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.ZergStructureSpawnerType;
import com.hypeirochus.scmc.worldgen.structure.SCWorldGenerator;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemZergStructureSpawner extends ItemStructureSpawner {

	public ItemZergStructureSpawner() {
		super("zerg.spawner");
		setCreativeTab(StarcraftCreativeTabs.ZERG);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < ZergStructureSpawnerType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < ZergStructureSpawnerType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + ZergStructureSpawnerType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + ZergStructureSpawnerType.SPAWNINGPOOL.getName();
	}

	@Override
	public int getItemCount() {
		return ZergStructureSpawnerType.values().length;
	}

	@Override
	public String getName(int meta) {
		return "zerg.spawner." + ZergStructureSpawnerType.values()[meta].getName();
	}

	@Override
	public SCWorldGenerator getStructure(int meta) {
		return ZergStructureSpawnerType.values()[meta].getStructure();
	}

	@Override
	public void generate(SCWorldGenerator structure, World world, Random rand, BlockPos pos, ItemStack stack) {
		structure.generate(world, rand, 0, 0, 0, pos, false);
	}

	@Override
	public SoundEvent getSpawnSound(int meta) {
		return ZergStructureSpawnerType.values()[meta].getSpawnSound();
	}
}