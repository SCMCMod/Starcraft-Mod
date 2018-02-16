package ga.scmc.recipes;

import ga.scmc.blocks.metablocks.BlockGasCollector;
import ga.scmc.blocks.metablocks.BlockKhaydarinCrystal.PylonCrystalType;
import ga.scmc.blocks.metablocks.BlockMineral;
import ga.scmc.blocks.metablocks.BlockProtossMetalT1;
import ga.scmc.blocks.metablocks.BlockProtossMetalT2;
import ga.scmc.blocks.metablocks.BlockProtossMetalT3;
import ga.scmc.blocks.metablocks.BlockTerranMetal;
import ga.scmc.blocks.metablocks.BlockZergCarapace;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.ToolHandler;
import ga.scmc.handlers.WeaponHandler;
import ga.scmc.items.IItemCompressable;
import ga.scmc.items.metaitems.ItemMagazine;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Holds some basic recipes in the mod that are not shapeless.
 */
public class SimpleRecipes {

	public static void init() {
		for (Item item : Item.REGISTRY) {
			if (item != null && item instanceof IItemCompressable) {
				IItemCompressable compressable = (IItemCompressable) item;
				for (int j = 0; j < 16; j++) {
					if (compressable.getCompressedForm(j) != null) {
						GameRegistry.addRecipe(compressable.getCompressedForm(j), "###", "###", "###", '#', new ItemStack(item, 1, j));
					} else {
						continue;
					}
				}
			}
		}

		// Protoss Metal
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, BlockProtossMetalT1.ProtossMetalType.AIUR.getID()), "AAA", "AAA", "AAA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()));
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T2, 1, BlockProtossMetalT2.ProtossMetalType.AIUR.getID()), "AAA", "AZA", "AAA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'Z', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, BlockProtossMetalT2.ProtossMetalType.AIUR.getID()));
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T3, 1, BlockProtossMetalT3.ProtossMetalType.AIUR.getID()), "AAA", "AZA", "AAA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'Z', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T2, 1, BlockProtossMetalT3.ProtossMetalType.AIUR.getID()));

		// Dark Protoss Metal
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, BlockProtossMetalT1.ProtossMetalType.DARK.getID()), "DDD", "DDD", "DDD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()));
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T2, 1, BlockProtossMetalT2.ProtossMetalType.DARK.getID()), "DDD", "DZD", "DDD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'Z', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, BlockProtossMetalT2.ProtossMetalType.DARK.getID()));
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T3, 1, BlockProtossMetalT3.ProtossMetalType.DARK.getID()), "DDD", "DZD", "DDD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'Z', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T2, 1, BlockProtossMetalT3.ProtossMetalType.DARK.getID()));

		// Zerg Carapace T1
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, BlockZergCarapace.ZergStructureCarapaceType.T1.getID()), "CCC", "CCC", "CCC", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T1.getID()));

		// Zerg Carapace T2
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, BlockZergCarapace.ZergStructureCarapaceType.T2.getID()), "CCC", "CCC", "CCC", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T2.getID()));

		// Zerg Carapace T3
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, BlockZergCarapace.ZergStructureCarapaceType.T3.getID()), "CCC", "CCC", "CCC", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T3.getID()));

		// 9 Mineral Shards
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MINERAL_SHARD, 9, EnumMetaItem.MineralType.BLUE.getID()), "M", 'M', new ItemStack(MetaBlockHandler.COMP_MINERAL, 1, BlockMineral.CompressedMineralType.BLUE.getID()));

		// 9 Rich Mineral Shards
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MINERAL_SHARD, 9, EnumMetaItem.MineralType.RICH.getID()), "M", 'M', new ItemStack(MetaBlockHandler.COMP_MINERAL, 1, BlockMineral.CompressedMineralType.RICH.getID()));

		// 9 Dark Protoss Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PROTOSS_INGOT, 9, EnumMetaItem.ProtossIngotType.DARK.getID()), "D", 'D', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, 1));

		// 9 Protoss Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PROTOSS_INGOT, 9, EnumMetaItem.ProtossIngotType.KHALAI.getID()), "A", 'A', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, 0));

		// 9 Zerg Carapace T1
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ZERG_CARAPACE, 9, EnumMetaItem.CarapaceType.T1.getID()), "C", 'C', new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, BlockZergCarapace.ZergStructureCarapaceType.T1.getID()));

		// 9 Zerg Carapace T2
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ZERG_CARAPACE, 9, EnumMetaItem.CarapaceType.T2.getID()), "C", 'C', new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, BlockZergCarapace.ZergStructureCarapaceType.T2.getID()));

		// 9 Zerg Carapace T3
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ZERG_CARAPACE, 9, EnumMetaItem.CarapaceType.T3.getID()), "C", 'C', new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, BlockZergCarapace.ZergStructureCarapaceType.T3.getID()));

		// Psi Blade Focuser Uncharged
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, EnumMetaItem.FocuserType.AIUR.getID()), " A ", "A A", " AA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()));

		// Dark Psi Blade Focuser Uncharged
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, EnumMetaItem.FocuserType.DARK.getID()), " D ", "D D", " DD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()));

		// 9 Copper Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.INGOT, 9, 0), "C", 'C', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, BlockTerranMetal.CompressedMetalType.COPPER.getID()));

		// 9 Titanium Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.INGOT, 9, 1), "T", 'T', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, BlockTerranMetal.CompressedMetalType.TITANIUM.getID()));

		// 9 Steel Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.INGOT, 9, 2), "S", 'S', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, BlockTerranMetal.CompressedMetalType.STEEL.getID()));

		// Zerg Creep
		GameRegistry.addRecipe(new ItemStack(BlockHandler.ZERG_CREEP), "CC", "CC", 'C', ItemHandler.CREEP_RESIN);

		// Shakuras Furnace
		GameRegistry.addRecipe(new ItemStack(BlockHandler.FURNACE_SHAKURAS), "CCC", "C C", "CCC", 'C', BlockHandler.COBBLESTONE_SHAKURAS);

		// Char Furnace
		GameRegistry.addRecipe(new ItemStack(BlockHandler.FURNACE_CHAR), "CCC", "C C", "CCC", 'C', BlockHandler.COBBLESTONE_CHAR);

		// Psi Blade
		GameRegistry.addRecipe(new ItemStack(WeaponHandler.PSI_BLADE), " A ", "AEA", " AA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.PURE.getID()));

		// Warp Blade
		GameRegistry.addRecipe(new ItemStack(WeaponHandler.WARP_BLADE), " A ", "ACA", " AA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'C', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.CORRUPTED.getID()));

		// Dark Psi Blade
		GameRegistry.addRecipe(new ItemStack(WeaponHandler.BANE_BLADE), " D ", "DVD", " DD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'V', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.VOID.getID()));

		// Dark Warp Blade
		GameRegistry.addRecipe(new ItemStack(WeaponHandler.DARK_WARP_BLADE), " D ", "DCD", " DD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'C', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.CORRUPTED.getID()));

		// Copper toolset
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.COPPER_SHOVEL), " C ", " S ", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.COPPER_AXE), " CC", " SC", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.COPPER_PICKAXE), "CCC", " S ", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.COPPER_HOE), " CC", " S ", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(WeaponHandler.COPPER_SWORD), " C ", " C ", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', "stickWood"));

		// Copper armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.COPPER_HELMET), "CCC", "C C", "   ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.COPPER_CHESTPLATE), "C C", "CCC", "CCC", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.COPPER_LEGGINGS), "CCC", "C C", "C C", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.COPPER_BOOTS), "C C", "C C", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));

		// Titanium toolset
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.TITANIUM_SHOVEL), " T ", " S ", " S ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.TITANIUM_AXE), " TT", " ST", " S ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.TITANIUM_PICKAXE), "TTT", " S ", " S ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.TITANIUM_HOE), " TT", " S ", " S ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(WeaponHandler.TITANIUM_SWORD), " T ", " T ", " S ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', "stickWood"));

		// Titanium armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TITANIUM_HELMET), "TTT", "T T", "   ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TITANIUM_CHESTPLATE), "T T", "TTT", "TTT", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TITANIUM_LEGGINGS), "TTT", "T T", "T T", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TITANIUM_BOOTS), "T T", "T T", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));

		// Steel toolset
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.STEEL_SHOVEL), " S ", " I ", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.STEEL_AXE), " SS", " IS", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.STEEL_PICKAXE), "SSS", " I ", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ToolHandler.STEEL_HOE), " SS", " I ", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(WeaponHandler.STEEL_SWORD), " S ", " S ", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', "stickWood"));

		// Steel armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.STEEL_HELMET), "SSS", "S S", "   ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.STEEL_CHESTPLATE), "S S", "SSS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.STEEL_LEGGINGS), "SSS", "S S", "S S", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.STEEL_BOOTS), "S S", "S S", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));

		// T1 zerg armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T1_HELMET), "CCC", "C C", "   ", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T1.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T1_CHESTPLATE), "C C", "CCC", "CCC", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T1.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T1_LEGGINGS), "CCC", "C C", "C C", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T1.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T1_BOOTS), "C C", "C C", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T1.getID()));

		// T2 zerg armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T2_HELMET), "CCC", "C C", "   ", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T2.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T2_CHESTPLATE), "C C", "CCC", "CCC", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T2.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T2_LEGGINGS), "CCC", "C C", "C C", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T2.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T2_BOOTS), "C C", "C C", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T2.getID()));

		// T3 zerg armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T3_HELMET), "CCC", "C C", "   ", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T3.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T3_CHESTPLATE), "C C", "CCC", "CCC", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T3.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T3_LEGGINGS), "CCC", "C C", "C C", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T3.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.ZERG_T3_BOOTS), "C C", "C C", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T3.getID()));

		// T1 protoss armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T1_HELMET), "PPP", "P P", "   ", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T1_CHESTPLATE), "P P", "PPP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T1_LEGGINGS), "PPP", "P P", "P P", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T1_BOOTS), "P P", "P P", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()));

		// T2 protoss armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T2_HELMET), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_T1_HELMET, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T2_CHESTPLATE), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_T1_CHESTPLATE, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T2_LEGGINGS), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_T1_LEGGINGS, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T2_BOOTS), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_T1_BOOTS, 1, 0));

		// T3 protoss armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T3_HELMET), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_T3_HELMET, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T3_CHESTPLATE), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_T3_CHESTPLATE, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T3_LEGGINGS), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_T3_LEGGINGS, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_T3_BOOTS), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_T3_BOOTS, 1, 0));

		// T1 protoss armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T1_HELMET), "PPP", "P P", "   ", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T1_CHESTPLATE), "P P", "PPP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T1_LEGGINGS), "PPP", "P P", "P P", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T1_BOOTS), "P P", "P P", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()));

		// T2 protoss armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T2_HELMET), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T1_HELMET, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T2_CHESTPLATE), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T1_CHESTPLATE, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T2_LEGGINGS), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T1_LEGGINGS, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T2_BOOTS), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T1_BOOTS, 1, 0));

		// T3 protoss armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T3_HELMET), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T3_HELMET, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T3_CHESTPLATE), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T3_CHESTPLATE, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T3_LEGGINGS), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T3_LEGGINGS, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T3_BOOTS), "PPP", "PAP", "PPP", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'A', new ItemStack(ArmorHandler.PROTOSS_TALDARIM_T3_BOOTS, 1, 0));

		// Marine armor
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MARINE_HELMET_VISOR), "GGG", "GGG", "GGG", 'G', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_HELMET), "SSS", "SGS", "   ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 'G', new ItemStack(ItemHandler.MARINE_HELMET_VISOR));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_CHESTPLATE), "S S", "SSS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_LEGGINGS), "SSS", "S S", "S S", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_BOOTS), "S S", "S S", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()));

		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_HELMET), "SSS", "SAS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 'A', new ItemStack(ArmorHandler.TERRAN_MARINE_T1_HELMET));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_CHESTPLATE), "SSS", "SAS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 'A', new ItemStack(ArmorHandler.TERRAN_MARINE_T1_CHESTPLATE));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_LEGGINGS), "SSS", "SAS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 'A', new ItemStack(ArmorHandler.TERRAN_MARINE_T1_LEGGINGS));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T2_BOOTS), "SSS", "SAS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 'A', new ItemStack(ArmorHandler.TERRAN_MARINE_T1_BOOTS));

		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T3_HELMET), "SSS", "SAS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 'A', new ItemStack(ArmorHandler.TERRAN_MARINE_T2_HELMET));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T3_CHESTPLATE), "SSS", "SAS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 'A', new ItemStack(ArmorHandler.TERRAN_MARINE_T2_CHESTPLATE));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T3_LEGGINGS), "SSS", "SAS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 'A', new ItemStack(ArmorHandler.TERRAN_MARINE_T2_LEGGINGS));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T3_BOOTS), "SSS", "SAS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.NEOSTEEL.getID()), 'A', new ItemStack(ArmorHandler.TERRAN_MARINE_T2_BOOTS));

		// Ammo for weapons
		GameRegistry.addRecipe(((ItemMagazine) ItemHandler.BULLET_MAGAZINE).getDefaultStack(EnumMetaItem.BulletMagazineType.C14.getID()), " S ", "SIS", " S ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', Items.GUNPOWDER);
		GameRegistry.addRecipe(((ItemMagazine) ItemHandler.BULLET_MAGAZINE).getDefaultStack(EnumMetaItem.BulletMagazineType.FLAMETHROWER.getID()), " S ", "SIS", " S ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', Items.FLINT);

		// Gauss Rifle
		GameRegistry.addRecipe(new ItemStack(ItemHandler.C14_PARTS, 1, EnumMetaItem.C14PartType.BARREL.getID()), "SSS", "STT", "S  ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.C14_PARTS, 1, EnumMetaItem.C14PartType.BODY.getID()), "SSS", "TTT", "  T", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.C14_PARTS, 1, EnumMetaItem.C14PartType.GRIP.getID()), "SS ", "S S", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.C14_GAUSS_RIFLE), "X  ", " Y ", "  Z", 'X', new ItemStack(ItemHandler.C14_PARTS, 1, 0), 'Y', new ItemStack(ItemHandler.C14_PARTS, 1, 1), 'Z', new ItemStack(ItemHandler.C14_PARTS, 1, 2));

		// Flamethrower
		GameRegistry.addRecipe(new ItemStack(ItemHandler.FLAMETHROWER_PARTS, 1, 0), "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.FLAMETHROWER_PARTS, 1, 1), "TTT", "SS ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.FLAMETHROWER_PARTS, 1, 2), "S ", "S ", "SS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.FLAMETHROWER_PARTS, 1, 3), "TST", "S S", "TST", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.FLAMETHROWER), new ItemStack(ItemHandler.FLAMETHROWER_PARTS, 1, 0), new ItemStack(ItemHandler.FLAMETHROWER_PARTS, 1, 1), new ItemStack(ItemHandler.FLAMETHROWER_PARTS, 1, 2), new ItemStack(ItemHandler.FLAMETHROWER_PARTS, 1, 3));

		// Empty Gas Containers
		GameRegistry.addRecipe(new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.PROTOSS.getID()), " I ", "I I", " I ", 'I', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.TERRAN.getID()), " P ", "P P", " P ", 'P', Blocks.PLANKS);
		GameRegistry.addRecipe(new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.ZERG.getID()), " F ", "F F", " F ", 'F', ItemHandler.ORGANIC_TISSUE);

		// Vespene
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VESPENE, 1, EnumMetaItem.VespeneType.PROTOSS.getID()), " I ", "IVI", " I ", 'I', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, OreDictionary.WILDCARD_VALUE), 'V', new ItemStack(ItemHandler.VESPENE, 1, EnumMetaItem.VespeneType.RAW.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VESPENE, 1, EnumMetaItem.VespeneType.TERRAN.getID()), " P ", "PVP", " P ", 'P', Blocks.PLANKS, 'V', new ItemStack(ItemHandler.VESPENE, 1, EnumMetaItem.VespeneType.RAW.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.VESPENE, 1, EnumMetaItem.VespeneType.ZERG.getID()), " F ", "FVF", " F ", 'F', ItemHandler.ORGANIC_TISSUE, 'V', new ItemStack(ItemHandler.VESPENE, 1, EnumMetaItem.VespeneType.RAW.getID()));

		// Terrazine
		GameRegistry.addRecipe(new ItemStack(ItemHandler.TERRAZINE, 1, EnumMetaItem.TerrazineType.PROTOSS.getID()), " I ", "IVI", " I ", 'I', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, OreDictionary.WILDCARD_VALUE), 'V', new ItemStack(ItemHandler.TERRAZINE, 1, EnumMetaItem.TerrazineType.RAW.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.TERRAZINE, 1, EnumMetaItem.TerrazineType.TERRAN.getID()), " P ", "PVP", " P ", 'P', Blocks.PLANKS, 'V', new ItemStack(ItemHandler.TERRAZINE, 1, EnumMetaItem.TerrazineType.RAW.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.TERRAZINE, 1, EnumMetaItem.TerrazineType.ZERG.getID()), " F ", "FVF", " F ", 'F', ItemHandler.ORGANIC_TISSUE, 'V', new ItemStack(ItemHandler.TERRAZINE, 1, EnumMetaItem.TerrazineType.RAW.getID()));

		// Protoss Gas Collector
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, BlockGasCollector.GasCollectorType.PROTOSS.getID()), "PPP", "PMP", "P P", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, OreDictionary.WILDCARD_VALUE), 'M', new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.PROTOSS.getID()));

		// Terran Gas Collector
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, BlockGasCollector.GasCollectorType.TERRAN.getID()), "III", "IMI", "I I", 'I', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'M', new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.TERRAN.getID()));

		// Zerg Gas Collector
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, BlockGasCollector.GasCollectorType.ZERG.getID()), "FFF", "FMF", "F F", 'F', new ItemStack(MetaBlockHandler.ZERG_FLESH, 1, OreDictionary.WILDCARD_VALUE), 'M', new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.ZERG.getID()));

		// Balisong
		GameRegistry.addRecipe(new ItemStack(WeaponHandler.BALISONG, 1), " I ", " I ", " L ", 'I', new ItemStack(Items.IRON_INGOT, 1), 'L', new ItemStack(Items.LEATHER, 1));

		// Military Knife
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(WeaponHandler.MILITARY_KNIFE, 1), "   ", " I ", " S ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', "ingotIron"));

		// Military Knife
		GameRegistry.addRecipe(new ItemStack(WeaponHandler.MONOMOLECULAR_BLADE, 1), " E ", " E ", " S ", 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.PURE.getID()), 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));

		// Khalai Energy Channel
		GameRegistry.addRecipe(new ItemStack(BlockHandler.PROTOSS_ENERGY_CHANNEL), "IEI", "IEI", "IEI", 'I', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.PURE.getID()));

		// Khalai Energy Stabilizer
		GameRegistry.addRecipe(new ItemStack(BlockHandler.PROTOSS_ENERGY_STABILIZER), "IEI", "III", "III", 'I', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.PURE.getID()));

		// Void Energy Channel
		GameRegistry.addRecipe(new ItemStack(BlockHandler.PROTOSS_VOID_ENERGY_CHANNEL), "IEI", "IEI", "IEI", 'I', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.CORRUPTED.getID()));

		// Void Energy Stabilizer
		GameRegistry.addRecipe(new ItemStack(BlockHandler.PROTOSS_VOID_ENERGY_STABILIZER), "IEI", "III", "III", 'I', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.CORRUPTED.getID()));

		// Dark Energy Channel
		GameRegistry.addRecipe(new ItemStack(BlockHandler.PROTOSS_DARK_ENERGY_CHANNEL), "IEI", "IEI", "IEI", 'I', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.VOID.getID()));

		// Dark Energy Stabilizer
		GameRegistry.addRecipe(new ItemStack(BlockHandler.PROTOSS_DARK_ENERGY_STABILIZER), "IEI", "III", "III", 'I', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.VOID.getID()));

		// Pledge Items
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PLEDGE, 1, EnumMetaItem.PledgeType.BLACK.getID()), " D ", "DXD", " D ", 'D', new ItemStack(Items.DIAMOND), 'X', new ItemStack(Items.DYE, 1, 0));
		
		// Protoss furnace and upgrades
		GameRegistry.addRecipe(new ItemStack(BlockHandler.FURNACE_PROTOSS), "BCB", "BCB", "BCB", 'B', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, 0), 'C', new ItemStack(MetaBlockHandler.PYLON_CRYSTAL, 1, PylonCrystalType.PURE.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PROTOSS_UPGRADE, 1, EnumMetaItem.ProtossUpgradeType.SPEED.getID()), "DED", "EDE", "EEE", 'D', new ItemStack(ItemHandler.KHAYDARIN_CRYSTAL, 1, PylonCrystalType.PURE.getID()), 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.PURE.getID()));
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PROTOSS_UPGRADE, 1, EnumMetaItem.ProtossUpgradeType.EFFICIENCY.getID()), "P P", "PDP", " P ", 'P', ItemHandler.PROTOSS_INGOT, 'D', new ItemStack(MetaBlockHandler.PYLON_CRYSTAL, 1, PylonCrystalType.PURE.getID()));
	}
}