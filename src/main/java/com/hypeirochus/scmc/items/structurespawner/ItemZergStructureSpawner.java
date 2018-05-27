package com.hypeirochus.scmc.items.structurespawner;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.ZergStructureSpawnerType;
import com.hypeirochus.scmc.worldgen.structure.IGenericStructure;

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
	public IGenericStructure getStructure(ItemStack stack) {
		return ZergStructureSpawnerType.values()[stack.getMetadata()].getStructure();
	}

	@Override
	public void generate(IGenericStructure structure, World world, BlockPos pos, ItemStack stack) {
		structure.setFlags(new Object[] { false });
		structure.generate(world, pos);
	}

	@Override
	public SoundEvent getSpawnSound(int meta) {
		return ZergStructureSpawnerType.values()[meta].getSpawnSound();
	}
}