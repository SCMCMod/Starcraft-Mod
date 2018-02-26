package com.hypeirochus.scmc.items.structurespawner;

import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler.ProtossStructureSpawnerType;
import com.hypeirochus.scmc.worldgen.structure.SCWorldGenerator;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvent;

public class ItemProtossStructureSpawner extends ItemStructureSpawner {

	public ItemProtossStructureSpawner() {
		super("protoss.spawner");
		setCreativeTab(StarcraftCreativeTabs.PROTOSS);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < ProtossStructureSpawnerType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < ProtossStructureSpawnerType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + ProtossStructureSpawnerType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + ProtossStructureSpawnerType.values()[0].getName();
	}

	@Override
	public int getItemCount() {
		return ProtossStructureSpawnerType.values().length;
	}

	@Override
	public String getName(int meta) {
		return "protoss.spawner." + ProtossStructureSpawnerType.values()[meta].getName();
	}

	@Override
	public SCWorldGenerator getStructure(int meta) {
		return ProtossStructureSpawnerType.values()[meta].getStructure();
	}
	
	@Override
	public SoundEvent getSpawnSound(int meta) {
		return ProtossStructureSpawnerType.values()[meta].getSpawnSound();
	}
}