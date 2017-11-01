package ga.scmc.recipes;

import ga.scmc.enums.EnumMetaItem;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	public static void init() {
		OreDictionary.registerOre("cobblestone", BlockHandler.COBBLESTONE_CHAR);
		OreDictionary.registerOre("cobblestone", BlockHandler.COBBLESTONE_SHAKURAS);
		OreDictionary.registerOre("cobblestone", BlockHandler.COBBLESTONE_SLAYN);
		OreDictionary.registerOre("stone", BlockHandler.STONE_CHAR);
		OreDictionary.registerOre("stone", BlockHandler.STONE_SHAKURAS);
		OreDictionary.registerOre("stone", BlockHandler.STONE_SLAYN);
		OreDictionary.registerOre("oreGold", BlockHandler.ORE_GOLD_CHAR);
		OreDictionary.registerOre("oreGold", BlockHandler.ORE_GOLD_SHAKURAS);
		OreDictionary.registerOre("oreIron", BlockHandler.ORE_IRON_CHAR);
		OreDictionary.registerOre("oreIron", BlockHandler.ORE_IRON_SHAKURAS);
		OreDictionary.registerOre("oreLapis", BlockHandler.ORE_LAPIS_CHAR);
		OreDictionary.registerOre("oreLapis", BlockHandler.ORE_LAPIS_SHAKURAS);
		OreDictionary.registerOre("oreDiamond", BlockHandler.ORE_DIAMOND_CHAR);
		OreDictionary.registerOre("oreDiamond", BlockHandler.ORE_DIAMOND_SHAKURAS);
		OreDictionary.registerOre("oreRedstone", BlockHandler.ORE_REDSTONE_CHAR);
		OreDictionary.registerOre("oreRedstone", BlockHandler.ORE_REDSTONE_SHAKURAS);
		OreDictionary.registerOre("oreCoal", BlockHandler.ORE_COAL_CHAR);
		OreDictionary.registerOre("oreCoal", BlockHandler.ORE_COAL_SHAKURAS);
		OreDictionary.registerOre("oreCopper", BlockHandler.ORE_COPPER_CHAR);
		OreDictionary.registerOre("oreCopper", BlockHandler.ORE_COPPER_SHAKURAS);
		
		OreDictionary.registerOre("dustSteel", new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.STEEL.getID()));
		OreDictionary.registerOre("ingotCopper", new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));
		OreDictionary.registerOre("ingotSteel", new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));
	}
}