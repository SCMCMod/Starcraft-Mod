package com.hypeirochus.scmc.items;

import com.elytradev.mirage.event.GatherLightsEvent;
import com.elytradev.mirage.lighting.IEntityLightEventConsumer;
import com.elytradev.mirage.lighting.Light;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.enums.MetaHandler.EnergyType;
import com.hypeirochus.scmc.handlers.IMetaRenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemEnergy extends StarcraftItem implements IMetaRenderHandler, IEntityLightEventConsumer {

	public ItemEnergy() {
		super("energy");
		setCreativeTab(StarcraftCreativeTabs.MISC);
		setHasSubtypes(true);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab)) {
			for (int i = 0; i < EnergyType.values().length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < EnergyType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + EnergyType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + EnergyType.PURE.getName();
	}

	@Override
	public int getItemCount() {
		return EnergyType.values().length;
	}

	@Override
	public String getName(int meta) {
		return "energy." + MetaHandler.EnergyType.values()[meta].getName();
	}

	@Override
	public void gatherLights(GatherLightsEvent evt, Entity entity) {
		evt.add(Light.builder().pos(entity).color(0.0F, 0.94F, 1.0F).radius(3).build());
	}
}