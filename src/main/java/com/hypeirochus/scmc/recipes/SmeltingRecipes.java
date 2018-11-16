package com.hypeirochus.scmc.recipes;

import com.hypeirochus.scmc.enums.MetaHandler;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * Deals with smelting recipes in the mod.
 */
public class SmeltingRecipes
{

	public static void init(FMLInitializationEvent event)
	{

		/** Steel Ingot from Steel Dust */
		GameRegistry.addSmelting(new ItemStack(ItemHandler.DUST, 1, MetaHandler.DustType.STEEL.getID()), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.STEEL.getID()), 0);

		/** Steel to neosteel */
		GameRegistry.addSmelting(new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.STEEL.getID()), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.NEOSTEEL.getID()), 0);

		/** Glass from sand */
		GameRegistry.addSmelting(new ItemStack(BlockHandler.SAND_SHAKURAS), new ItemStack(Blocks.STAINED_GLASS, 1, 11), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.SAND_SLAYN), new ItemStack(Blocks.STAINED_GLASS, 1, 15), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.SAND_ZERUS), new ItemStack(Blocks.STAINED_GLASS, 1, 12), 0.1F);

		/** Shakuras Stone */
		GameRegistry.addSmelting(new ItemStack(BlockHandler.COBBLESTONE_SHAKURAS), new ItemStack(BlockHandler.STONE_SHAKURAS, 1, 0), 0);

		/** Zerus Stone */
		GameRegistry.addSmelting(new ItemStack(BlockHandler.COBBLESTONE_ZERUS), new ItemStack(BlockHandler.STONE_ZERUS, 1, 0), 0);

		/** Slayn Stone */
		GameRegistry.addSmelting(new ItemStack(BlockHandler.COBBLESTONE_SLAYN), new ItemStack(BlockHandler.STONE_SLAYN, 1, 0), 0);

		/** Char Stone */
		GameRegistry.addSmelting(new ItemStack(BlockHandler.COBBLESTONE_CHAR), new ItemStack(BlockHandler.STONE_CHAR, 1, 0), 0);

		/**
		 * These are all of the smelting recipes for the various ores. Self explanatory
		 */

		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_TITANIUM_OW), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.TITANIUM.getID()), 0.8F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COPPER_OW), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.COPPER.getID()), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_PHOSPHORUS_OW), new ItemStack(ItemHandler.PHOSPHORUS), 0.25F);

		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COAL_CHAR), new ItemStack(Items.COAL, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_IRON_CHAR), new ItemStack(Items.IRON_INGOT, 1, 0), 0.7F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_GOLD_CHAR), new ItemStack(Items.GOLD_INGOT, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_REDSTONE_CHAR), new ItemStack(Items.REDSTONE, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_LAPIS_CHAR), new ItemStack(Items.DYE, 1, 4), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_DIAMOND_CHAR), new ItemStack(Items.DIAMOND, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_TITANIUM_CHAR), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.TITANIUM.getID()), 0.8F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COPPER_CHAR), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.COPPER.getID()), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_PHOSPHORUS_CHAR), new ItemStack(ItemHandler.PHOSPHORUS), 0.25F);

		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COAL_SHAKURAS), new ItemStack(Items.COAL, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_IRON_SHAKURAS), new ItemStack(Items.IRON_INGOT, 1, 0), 0.7F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_GOLD_SHAKURAS), new ItemStack(Items.GOLD_INGOT, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_REDSTONE_SHAKURAS), new ItemStack(Items.REDSTONE, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_LAPIS_SHAKURAS), new ItemStack(Items.DYE, 1, 4), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_DIAMOND_SHAKURAS), new ItemStack(Items.DIAMOND, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_TITANIUM_SHAKURAS), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.TITANIUM.getID()), 0.8F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COPPER_SHAKURAS), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.COPPER.getID()), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_PHOSPHORUS_SHAKURAS), new ItemStack(ItemHandler.PHOSPHORUS), 0.25F);

		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COAL_ZERUS), new ItemStack(Items.COAL, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_IRON_ZERUS), new ItemStack(Items.IRON_INGOT, 1, 0), 0.7F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_GOLD_ZERUS), new ItemStack(Items.GOLD_INGOT, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_REDSTONE_ZERUS), new ItemStack(Items.REDSTONE, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_LAPIS_ZERUS), new ItemStack(Items.DYE, 1, 4), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_DIAMOND_ZERUS), new ItemStack(Items.DIAMOND, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_TITANIUM_ZERUS), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.TITANIUM.getID()), 0.8F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COPPER_ZERUS), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.COPPER.getID()), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_PHOSPHORUS_ZERUS), new ItemStack(ItemHandler.PHOSPHORUS), 0.25F);

		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COAL_SLAYN), new ItemStack(Items.COAL, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_IRON_SLAYN), new ItemStack(Items.IRON_INGOT, 1, 0), 0.7F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_GOLD_SLAYN), new ItemStack(Items.GOLD_INGOT, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_REDSTONE_SLAYN), new ItemStack(Items.REDSTONE, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_LAPIS_SLAYN), new ItemStack(Items.DYE, 1, 4), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_DIAMOND_SLAYN), new ItemStack(Items.DIAMOND, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_TITANIUM_SLAYN), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.TITANIUM.getID()), 0.8F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COPPER_SLAYN), new ItemStack(ItemHandler.INGOT, 1, MetaHandler.IngotType.COPPER.getID()), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_PHOSPHORUS_SLAYN), new ItemStack(ItemHandler.PHOSPHORUS), 0.25F);
	}
}