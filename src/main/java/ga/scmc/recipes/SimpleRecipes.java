package ga.scmc.recipes;

import ga.scmc.enums.EnumMetaBlock;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MetaBlockHandler;
import ga.scmc.handlers.ToolHandler;
import ga.scmc.handlers.WeaponHandler;
import ga.scmc.items.metaitems.ItemBulletMagazine;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
		// Charcoal from Carbon Grain x9
		GameRegistry.addRecipe(new ItemStack(Items.COAL, 1, 1), "CCC", "CCC", "CCC", 'C', new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.CARBON.getID()));

		// Protoss Metal
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, EnumMetaBlock.ProtossMetalType.AIUR.getID()), "AAA", "AAA", "AAA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()));
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T2, 1, EnumMetaBlock.ProtossMetalType.AIUR.getID()), "AAA", "AZA", "AAA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'Z', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, EnumMetaBlock.ProtossMetalType.AIUR.getID()));
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T3, 1, EnumMetaBlock.ProtossMetalType.AIUR.getID()), "AAA", "AZA", "AAA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()), 'Z', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T2, 1, EnumMetaBlock.ProtossMetalType.AIUR.getID()));

		// Dark Protoss Metal
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, EnumMetaBlock.ProtossMetalType.DARK.getID()), "DDD", "DDD", "DDD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()));
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T2, 1, EnumMetaBlock.ProtossMetalType.DARK.getID()), "DDD", "DZD", "DDD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'Z', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, EnumMetaBlock.ProtossMetalType.DARK.getID()));
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.PROTOSS_METAL_T3, 1, EnumMetaBlock.ProtossMetalType.DARK.getID()), "DDD", "DZD", "DDD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), 'Z', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T2, 1, EnumMetaBlock.ProtossMetalType.DARK.getID()));

		// Block of Pure Energy
		GameRegistry.addRecipe(new ItemStack(BlockHandler.ENERGY_BLOCK), "EEE", "EEE", "EEE", 'E', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.PURE.getID()));

		// Block of Void Energy
		GameRegistry.addRecipe(new ItemStack(BlockHandler.VOID_ENERGY), "VVV", "VVV", "VVV", 'V', new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.VOID.getID()));

		// Block of Titanium
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.TITANIUM.getID()), "TTT", "TTT", "TTT", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));

		// Block of Copper
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.COPPER.getID()), "CCC", "CCC", "CCC", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));

		// Block of Steel
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.STEEL.getID()), "SSS", "SSS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));

		// Block of Minerals
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.COMP_MINERAL, 1, EnumMetaBlock.CompressedMineralType.BLUE.getID()), "MMM", "MMM", "MMM", 'M', new ItemStack(ItemHandler.MINERAL_SHARD, 1, EnumMetaItem.MineralType.BLUE.getID()));

		// Block of Rich Minerals
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.COMP_MINERAL, 1, EnumMetaBlock.CompressedMineralType.RICH.getID()), "RRR", "RRR", "RRR", 'R', new ItemStack(ItemHandler.MINERAL_SHARD, 1, EnumMetaItem.MineralType.RICH.getID()));

		// Zerg Carapace T1
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, EnumMetaBlock.ZergStructureCarapaceType.T1.getID()), "CCC", "CCC", "CCC", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T1.getID()));

		// Zerg Carapace T2
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, EnumMetaBlock.ZergStructureCarapaceType.T2.getID()), "CCC", "CCC", "CCC", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T2.getID()));

		// Zerg Carapace T3
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, EnumMetaBlock.ZergStructureCarapaceType.T3.getID()), "CCC", "CCC", "CCC", 'C', new ItemStack(ItemHandler.ZERG_CARAPACE, 1, EnumMetaItem.CarapaceType.T3.getID()));

		// 9 Mineral Shards
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MINERAL_SHARD, 9, EnumMetaItem.MineralType.BLUE.getID()), "M", 'M', new ItemStack(MetaBlockHandler.COMP_MINERAL, 1, EnumMetaBlock.CompressedMineralType.BLUE.getID()));

		// 9 Rich Mineral Shards
		GameRegistry.addRecipe(new ItemStack(ItemHandler.MINERAL_SHARD, 9, EnumMetaItem.MineralType.RICH.getID()), "M", 'M', new ItemStack(MetaBlockHandler.COMP_MINERAL, 1, EnumMetaBlock.CompressedMineralType.RICH.getID()));

		// 9 Dark Protoss Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PROTOSS_INGOT, 9, EnumMetaItem.ProtossIngotType.DARK.getID()), "D", 'D', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, 1));

		// 9 Protoss Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PROTOSS_INGOT, 9, EnumMetaItem.ProtossIngotType.KHALAI.getID()), "A", 'A', new ItemStack(MetaBlockHandler.PROTOSS_METAL_T1, 1, 0));

		// 9 Zerg Carapace T1
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ZERG_CARAPACE, 9, EnumMetaItem.CarapaceType.T1.getID()), "C", 'C', new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, EnumMetaBlock.ZergStructureCarapaceType.T1.getID()));

		// 9 Zerg Carapace T2
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ZERG_CARAPACE, 9, EnumMetaItem.CarapaceType.T2.getID()), "C", 'C', new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, EnumMetaBlock.ZergStructureCarapaceType.T2.getID()));

		// 9 Zerg Carapace T3
		GameRegistry.addRecipe(new ItemStack(ItemHandler.ZERG_CARAPACE, 9, EnumMetaItem.CarapaceType.T3.getID()), "C", 'C', new ItemStack(MetaBlockHandler.ZERG_CARAPACE_BLOCK, 1, EnumMetaBlock.ZergStructureCarapaceType.T3.getID()));

		// Psi Blade Focuser Uncharged
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, EnumMetaItem.FocuserType.AIUR.getID()), " A ", "A A", " AA", 'A', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID()));

		// Dark Psi Blade Focuser Uncharged
		GameRegistry.addRecipe(new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, EnumMetaItem.FocuserType.DARK.getID()), " D ", "D D", " DD", 'D', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()));

		// 9 Copper Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.INGOT, 9, 0), "C", 'C', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.COPPER.getID()));

		// 9 Titanium Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.INGOT, 9, 1), "T", 'T', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.TITANIUM.getID()));

		// 9 Steel Ingots
		GameRegistry.addRecipe(new ItemStack(ItemHandler.INGOT, 9, 2), "S", 'S', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.STEEL.getID()));

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
		GameRegistry.addRecipe(new ItemStack(ToolHandler.COPPER_SHOVEL), " C ", " S ", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ToolHandler.COPPER_AXE), " CC", " SC", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ToolHandler.COPPER_PICKAXE), "CCC", " S ", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ToolHandler.COPPER_HOE), " CC", " S ", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(WeaponHandler.COPPER_SWORD), " C ", " C ", " S ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()), 'S', Items.STICK);

		// Copper armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.COPPER_HELMET), "CCC", "C C", "   ", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.COPPER_CHESTPLATE), "C C", "CCC", "CCC", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.COPPER_LEGGINGS), "CCC", "C C", "C C", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.COPPER_BOOTS), "C C", "C C", 'C', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.COPPER.getID()));

		// Titanium toolset
		GameRegistry.addRecipe(new ItemStack(ToolHandler.TITANIUM_SHOVEL), " T ", " S ", " S ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ToolHandler.TITANIUM_AXE), " TT", " ST", " S ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ToolHandler.TITANIUM_PICKAXE), "TTT", " S ", " S ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ToolHandler.TITANIUM_HOE), " TT", " S ", " S ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(WeaponHandler.TITANIUM_SWORD), " T ", " T ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()), 'S', Items.STICK);

		// Titanium armorset
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TITANIUM_HELMET), "TTT", "T T", "   ", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TITANIUM_CHESTPLATE), "T T", "TTT", "TTT", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TITANIUM_LEGGINGS), "TTT", "T T", "T T", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TITANIUM_BOOTS), "T T", "T T", 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));

		// Steel toolset
		GameRegistry.addRecipe(new ItemStack(ToolHandler.STEEL_SHOVEL), " S ", " I ", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ToolHandler.STEEL_AXE), " SS", " IS", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ToolHandler.STEEL_PICKAXE), "SSS", " I ", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(ToolHandler.STEEL_HOE), " SS", " I ", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(WeaponHandler.STEEL_SWORD), " S ", " S ", " I ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'I', Items.STICK);

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

		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_HELMET), "SSS", "SGS", 'S', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.STEEL.getID()), 'G', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_CHESTPLATE), "S S", "SSS", "SSS", 'S', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.STEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_LEGGINGS), "SSS", "S S", "S S", 'S', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.STEEL.getID()));
		GameRegistry.addRecipe(new ItemStack(ArmorHandler.TERRAN_MARINE_T1_BOOTS), "S S", "S S", 'S', new ItemStack(MetaBlockHandler.COMP_METAL_T1, 1, EnumMetaBlock.CompressedMetalType.STEEL.getID()));

		// Bullets for the Gauss Rifle
		GameRegistry.addRecipe(((ItemBulletMagazine) ItemHandler.BULLET_MAGAZINE).getDefaultStack(EnumMetaItem.BulletMagazineType.C14.getID()), "SSS", "SGS", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'G', Items.GUNPOWDER);

		// Gauss Rifle parts
		GameRegistry.addRecipe(new ItemStack(ItemHandler.C14_PARTS, 1, EnumMetaItem.C14PartType.BARREL.getID()), "SSS", "STT", "S  ", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));

		GameRegistry.addRecipe(new ItemStack(ItemHandler.C14_PARTS, 1, EnumMetaItem.C14PartType.BODY.getID()), "SSS", "TTT", "  T", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'T', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.TITANIUM.getID()));

		GameRegistry.addRecipe(new ItemStack(ItemHandler.C14_PARTS, 1, EnumMetaItem.C14PartType.GRIP.getID()), "SS ", "S S", "SSS", 'S', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()));

		// Recipe for the actual Gauss Rifle
		GameRegistry.addRecipe(new ItemStack(ItemHandler.C14_GAUSS_RIFLE), "X  ", " Y ", "  Z", 'X', new ItemStack(ItemHandler.C14_PARTS, 1, 0), 'Y', new ItemStack(ItemHandler.C14_PARTS, 1, 1), 'Z', new ItemStack(ItemHandler.C14_PARTS, 1, 2));

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
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, EnumMetaBlock.GasCollectorType.PROTOSS.getID()), "PPP", "PMP", "P P", 'P', new ItemStack(ItemHandler.PROTOSS_INGOT, 1, OreDictionary.WILDCARD_VALUE), 'M', new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.PROTOSS.getID()));

		// Terran Gas Collector
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, EnumMetaBlock.GasCollectorType.TERRAN.getID()), "III", "IMI", "I I", 'I', new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.IngotType.STEEL.getID()), 'M', new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.TERRAN.getID()));

		// Zerg Gas Collector
		GameRegistry.addRecipe(new ItemStack(MetaBlockHandler.GAS_COLLECTOR, 1, EnumMetaBlock.GasCollectorType.ZERG.getID()), "FFF", "FMF", "F F", 'F', new ItemStack(MetaBlockHandler.ZERG_FLESH, 1, OreDictionary.WILDCARD_VALUE), 'M', new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.ZERG.getID()));

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

	}
}