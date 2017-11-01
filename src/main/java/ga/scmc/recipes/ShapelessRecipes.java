package ga.scmc.recipes;

import ga.scmc.enums.EnumMetaItem;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.WeaponHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Holds some shapeless recipes for the mod.
 */
public class ShapelessRecipes {

	public static void init() {
		// Iron Grain x2 from Iron Ores
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemHandler.DUST, 2, EnumMetaItem.DustType.IRON.getID()), "oreIron"));

		// Iron Ore from Iron Grain x2 + Stone
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.IRON_ORE), new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.IRON.getID()), new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.IRON.getID()), new ItemStack(Blocks.STONE));
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.ORE_IRON_SHAKURAS), new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.IRON.getID()), new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.IRON.getID()), new ItemStack(BlockHandler.STONE_SHAKURAS));
		GameRegistry.addShapelessRecipe(new ItemStack(BlockHandler.ORE_IRON_CHAR), new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.IRON.getID()), new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.IRON.getID()), new ItemStack(BlockHandler.STONE_CHAR));

		// Carbon Grain x9 from Coal (not Charcoal as Coal is natural, and iirc has more carbon)
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.DUST, 9, EnumMetaItem.DustType.CARBON.getID()), new ItemStack(Items.COAL, 1, 1));

		// Steel Dust from Carbon and Iron Grains
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.DUST, 1, EnumMetaItem.DustType.STEEL.getID()), new ItemStack(ItemHandler.DUST, 3, EnumMetaItem.DustType.CARBON.getID()), new ItemStack(ItemHandler.DUST, 3, EnumMetaItem.DustType.CARBON.getID()), new ItemStack(ItemHandler.DUST, 3, EnumMetaItem.DustType.IRON.getID()), new ItemStack(ItemHandler.DUST, 3, EnumMetaItem.DustType.IRON.getID()));

		// 1 Dark Protoss Ingot (using Dye on a normal Protoss Ingot)
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemHandler.PROTOSS_INGOT, 1, EnumMetaItem.ProtossIngotType.DARK.getID()), "dyeBlack", new ItemStack(ItemHandler.INGOT, 1, EnumMetaItem.ProtossIngotType.KHALAI.getID())));

		// 4 Creep Resin
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.CREEP_RESIN, 4), BlockHandler.ZERG_CREEP);

		// Psi Blade
		GameRegistry.addShapelessRecipe(new ItemStack(WeaponHandler.PSI_BLADE), new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, EnumMetaItem.FocuserType.AIUR.getID()), new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.PURE.getID()));

		// Warp Blade
		GameRegistry.addShapelessRecipe(new ItemStack(WeaponHandler.WARP_BLADE), new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, EnumMetaItem.FocuserType.AIUR.getID()), new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.CORRUPTED.getID()));

		// Dark Warp Blade
		GameRegistry.addShapelessRecipe(new ItemStack(WeaponHandler.DARK_WARP_BLADE), new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, EnumMetaItem.FocuserType.DARK.getID()), new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.CORRUPTED.getID()));

		// Dark Psi Blade
		GameRegistry.addShapelessRecipe(new ItemStack(WeaponHandler.BANE_BLADE), new ItemStack(ItemHandler.PSI_BLADE_FOCUSER_UNCHARGED, 1, EnumMetaItem.FocuserType.DARK.getID()), new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.VOID.getID()));

		// Corrupted Energy, made from combining Pure Energy and Void Energy
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.CORRUPTED.getID()), new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.PURE.getID()), new ItemStack(ItemHandler.ENERGY, 1, EnumMetaItem.EnergyType.VOID.getID()));

		// 9 Pure Energy
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.ENERGY, 9, EnumMetaItem.EnergyType.PURE.getID()), BlockHandler.ENERGY_BLOCK);

		// 9 Void Energy
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.ENERGY, 9, EnumMetaItem.EnergyType.VOID.getID()), BlockHandler.VOID_ENERGY);
	}
}