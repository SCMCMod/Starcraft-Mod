package com.hypeirochus.scmc.recipes;

import com.hypeirochus.scmc.blocks.metablocks.BlockTerranMetal;
import com.hypeirochus.scmc.enums.EnumMetaItem;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.MetaBlockHandler;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	public static void pre(FMLPreInitializationEvent event) {
		OreDictionary.registerOre("blockSteel", new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, BlockTerranMetal.CompressedMetalType.STEEL.getID()));
		OreDictionary.registerOre("blockCopper", new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, BlockTerranMetal.CompressedMetalType.COPPER.getID()));
		OreDictionary.registerOre("blockTitanium", new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, BlockTerranMetal.CompressedMetalType.TITANIUM.getID()));

		OreDictionary.registerOre("cobblestone", BlockHandler.COBBLESTONE_CHAR);
		OreDictionary.registerOre("cobblestone", BlockHandler.COBBLESTONE_SHAKURAS);
		OreDictionary.registerOre("cobblestone", BlockHandler.COBBLESTONE_SLAYN);
		OreDictionary.registerOre("cobblestone", BlockHandler.COBBLESTONE_ZERUS);
		OreDictionary.registerOre("stone", BlockHandler.STONE_CHAR);
		OreDictionary.registerOre("stone", BlockHandler.STONE_SHAKURAS);
		OreDictionary.registerOre("stone", BlockHandler.STONE_SLAYN);
		OreDictionary.registerOre("stone", BlockHandler.STONE_ZERUS);

		OreDictionary.registerOre("oreGold", BlockHandler.ORE_GOLD_CHAR);
		OreDictionary.registerOre("oreGold", BlockHandler.ORE_GOLD_SHAKURAS);
		OreDictionary.registerOre("oreGold", BlockHandler.ORE_GOLD_SLAYN);
		OreDictionary.registerOre("oreGold", BlockHandler.ORE_GOLD_ZERUS);
		OreDictionary.registerOre("oreIron", BlockHandler.ORE_IRON_CHAR);
		OreDictionary.registerOre("oreIron", BlockHandler.ORE_IRON_SHAKURAS);
		OreDictionary.registerOre("oreIron", BlockHandler.ORE_IRON_SLAYN);
		OreDictionary.registerOre("oreIron", BlockHandler.ORE_IRON_ZERUS);
		OreDictionary.registerOre("oreLapis", BlockHandler.ORE_LAPIS_CHAR);
		OreDictionary.registerOre("oreLapis", BlockHandler.ORE_LAPIS_SHAKURAS);
		OreDictionary.registerOre("oreLapis", BlockHandler.ORE_LAPIS_SLAYN);
		OreDictionary.registerOre("oreLapis", BlockHandler.ORE_LAPIS_ZERUS);
		OreDictionary.registerOre("oreDiamond", BlockHandler.ORE_DIAMOND_CHAR);
		OreDictionary.registerOre("oreDiamond", BlockHandler.ORE_DIAMOND_SHAKURAS);
		OreDictionary.registerOre("oreDiamond", BlockHandler.ORE_DIAMOND_SLAYN);
		OreDictionary.registerOre("oreDiamond", BlockHandler.ORE_DIAMOND_ZERUS);
		OreDictionary.registerOre("oreRedstone", BlockHandler.ORE_REDSTONE_CHAR);
		OreDictionary.registerOre("oreRedstone", BlockHandler.ORE_REDSTONE_SHAKURAS);
		OreDictionary.registerOre("oreRedstone", BlockHandler.ORE_REDSTONE_SLAYN);
		OreDictionary.registerOre("oreRedstone", BlockHandler.ORE_REDSTONE_ZERUS);
		OreDictionary.registerOre("oreCoal", BlockHandler.ORE_COAL_CHAR);
		OreDictionary.registerOre("oreCoal", BlockHandler.ORE_COAL_SHAKURAS);
		OreDictionary.registerOre("oreCoal", BlockHandler.ORE_COAL_SLAYN);
		OreDictionary.registerOre("oreCoal", BlockHandler.ORE_COAL_ZERUS);
		OreDictionary.registerOre("oreCopper", BlockHandler.ORE_COPPER_OW);
		OreDictionary.registerOre("oreCopper", BlockHandler.ORE_COPPER_CHAR);
		OreDictionary.registerOre("oreCopper", BlockHandler.ORE_COPPER_SHAKURAS);
		OreDictionary.registerOre("oreCopper", BlockHandler.ORE_COPPER_SLAYN);
		OreDictionary.registerOre("oreCopper", BlockHandler.ORE_COPPER_ZERUS);
		OreDictionary.registerOre("oreTitanium", BlockHandler.ORE_TITANIUM_OW);
		OreDictionary.registerOre("oreTitanium", BlockHandler.ORE_TITANIUM_CHAR);
		OreDictionary.registerOre("oreTitanium", BlockHandler.ORE_TITANIUM_SHAKURAS);
		OreDictionary.registerOre("oreTitanium", BlockHandler.ORE_TITANIUM_SLAYN);
		OreDictionary.registerOre("oreTitanium", BlockHandler.ORE_TITANIUM_ZERUS);
		OreDictionary.registerOre("oreUranium", BlockHandler.ORE_URANIUM_OW);
		OreDictionary.registerOre("oreUranium", BlockHandler.ORE_URANIUM_CHAR);
		OreDictionary.registerOre("oreUranium", BlockHandler.ORE_URANIUM_SHAKURAS);
		OreDictionary.registerOre("oreUranium", BlockHandler.ORE_URANIUM_SLAYN);
		OreDictionary.registerOre("oreUranium", BlockHandler.ORE_URANIUM_ZERUS);
		OreDictionary.registerOre("orePhosphorus", BlockHandler.ORE_PHOSPHORUS_OW);
		OreDictionary.registerOre("orePhosphorus", BlockHandler.ORE_PHOSPHORUS_CHAR);
		OreDictionary.registerOre("orePhosphorus", BlockHandler.ORE_PHOSPHORUS_SHAKURAS);
		OreDictionary.registerOre("orePhosphorus", BlockHandler.ORE_PHOSPHORUS_SLAYN);
		OreDictionary.registerOre("orePhosphorus", BlockHandler.ORE_PHOSPHORUS_ZERUS);

		OreDictionary.registerOre("dustSteel", new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.STEEL.getID()));
		OreDictionary.registerOre("dustIron", new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.IRON.getID()));
		OreDictionary.registerOre("dustCarbon", new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.CARBON.getID()));

		OreDictionary.registerOre("ingotCopper", new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));
		OreDictionary.registerOre("ingotTitanium", new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
	}
}