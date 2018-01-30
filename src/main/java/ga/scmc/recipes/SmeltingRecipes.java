package ga.scmc.recipes;

import ga.scmc.enums.EnumMetaItem;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Deals with smelting recipes in the mod.
 */
public class SmeltingRecipes {

	public static void init() {
		// Steel Ingot from Steel Dust
		GameRegistry.addSmelting(new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.STEEL.getID()), new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 0);

		//Steel to neosteel
		GameRegistry.addSmelting(new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 0);

		// Blue Stained Glass
		GameRegistry.addSmelting(new ItemStack(BlockHandler.SAND_SHAKURAS), new ItemStack(Blocks.STAINED_GLASS, 1, 11), 0.1F);

		// Shakuras Stone
		GameRegistry.addSmelting(new ItemStack(BlockHandler.COBBLESTONE_SHAKURAS), new ItemStack(BlockHandler.STONE_SHAKURAS, 1, 0), 0);

		// Char Stone
		GameRegistry.addSmelting(new ItemStack(BlockHandler.COBBLESTONE_CHAR), new ItemStack(BlockHandler.STONE_CHAR, 1, 0), 0);

		// These are all of the various smelting recipes for the various ores. Self explanatory
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_TITANIUM_OW), new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 0.8F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COPPER_OW), new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 0.5F);

		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COAL_CHAR), new ItemStack(Items.COAL, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_IRON_CHAR), new ItemStack(Items.IRON_INGOT, 1, 0), 0.7F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_GOLD_CHAR), new ItemStack(Items.GOLD_INGOT, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_REDSTONE_CHAR), new ItemStack(Items.REDSTONE, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_LAPIS_CHAR), new ItemStack(Items.DYE, 1, 4), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_DIAMOND_CHAR), new ItemStack(Items.DIAMOND, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_TITANIUM_CHAR), new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 0.8F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COPPER_CHAR), new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 0.5F);

		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COAL_SHAKURAS), new ItemStack(Items.COAL, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_IRON_SHAKURAS), new ItemStack(Items.IRON_INGOT, 1, 0), 0.7F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_GOLD_SHAKURAS), new ItemStack(Items.GOLD_INGOT, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_REDSTONE_SHAKURAS), new ItemStack(Items.REDSTONE, 1, 0), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_LAPIS_SHAKURAS), new ItemStack(Items.DYE, 1, 4), 0);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_DIAMOND_SHAKURAS), new ItemStack(Items.DIAMOND, 1, 0), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_TITANIUM_SHAKURAS), new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 0.8F);
		GameRegistry.addSmelting(new ItemStack(BlockHandler.ORE_COPPER_SHAKURAS), new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 0.5F);
	}
}