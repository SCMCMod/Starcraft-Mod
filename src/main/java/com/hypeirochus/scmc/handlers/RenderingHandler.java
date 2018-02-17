package com.hypeirochus.scmc.handlers;

import static com.hypeirochus.scmc.handlers.ItemHandler.*;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.enums.MetaHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class RenderingHandler {

	public static void registerItemMetaRenders() {
		for (int i = 0; i < MetaHandler.MineralType.values().length; i++) {
			registerItemRender(MINERAL_SHARD, i, "mineral." + MetaHandler.MineralType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.ContainerType.values().length; i++) {
			registerItemRender(GAS_CONTAINER, i, "container." + MetaHandler.ContainerType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.VespeneType.values().length; i++) {
			registerItemRender(VESPENE, i, "vespene." + MetaHandler.VespeneType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.TerrazineType.values().length; i++) {
			registerItemRender(TERRAZINE, i, "terrazine." + MetaHandler.TerrazineType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.EnergyType.values().length; i++) {
			registerItemRender(ENERGY, i, "energy." + MetaHandler.EnergyType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.DustType.values().length; i++) {
			registerItemRender(DUST, i, "dust." + MetaHandler.DustType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.IngotType.values().length; i++) {
			registerItemRender(INGOT, i, "ingot." + MetaHandler.IngotType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.ProtossIngotType.values().length; i++) {
			registerItemRender(PROTOSS_INGOT, i, "protoss.ingot." + MetaHandler.ProtossIngotType.values()[i].getName());
		}
	}

	private static void registerItemRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Starcraft.MOD_ID, fileName), "inventory"));
	}
}