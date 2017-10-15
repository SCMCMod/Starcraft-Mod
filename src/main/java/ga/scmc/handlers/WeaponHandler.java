package ga.scmc.handlers;



import ga.scmc.items.weapons.WeaponBalisong;
import ga.scmc.items.weapons.WeaponCopperSword;
import ga.scmc.items.weapons.WeaponDarkPsiBlade;
import ga.scmc.items.weapons.WeaponDarkWarpBlade;
import ga.scmc.items.weapons.WeaponMasterPsiBlade;
import ga.scmc.items.weapons.WeaponMilitaryKnife;
import ga.scmc.items.weapons.WeaponMonomolecularBlade;
import ga.scmc.items.weapons.WeaponPsiBlade;
import ga.scmc.items.weapons.WeaponSteelSword;
import ga.scmc.items.weapons.WeaponTitaniumSword;
import ga.scmc.items.weapons.WeaponWarpBlade;
import ga.scmc.lib.LogHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 */
public class WeaponHandler {

	public static Item BALISONG;
	public static Item COPPER_SWORD;
	public static Item BANE_BLADE;
	public static Item MASTER_PSI_BLADE;
	public static Item DARK_WARP_BLADE;
	public static Item MILITARY_KNIFE;
	public static Item MONOMOLECULAR_BLADE;
	public static Item PSI_BLADE;
	public static Item STEEL_SWORD;
	public static Item TITANIUM_SWORD;
	public static Item WARP_BLADE;

	public static final ToolMaterial GUN_MATERIAL = EnumHelper.addToolMaterial("GUN", 0, 0, 9.5F, -3.0F, 0);
	public static final ToolMaterial COPPER_MATERIAL = EnumHelper.addToolMaterial("COPPER", 2, 190, 4.5F, 1.0F, 10);
	public static final ToolMaterial MASTERPSIBLADE_MATERIAL = EnumHelper.addToolMaterial("MASTERPSIBLADE", 0, 750, 9.5F, 38.5F, 0);
	public static final ToolMaterial PSIBLADE_MATERIAL = EnumHelper.addToolMaterial("PSIBLADE", 0, 150, 9.5F, 4.0F, 0);
	public static final ToolMaterial STEEL_MATERIAL = EnumHelper.addToolMaterial("STEEL", 2, 753, 6.5F, 3.0F, 10);
	public static final ToolMaterial TITANIUM_MATERIAL = EnumHelper.addToolMaterial("TITANIUM", 2, 502, 5.5F, 2.0F, 10);
	public static final ToolMaterial WARPBLADE_MATERIAL = EnumHelper.addToolMaterial("WARPBLADE", 0, 250, 9.5F, 18.5F, 0);

	public static final ToolMaterial BALISONG_MATERIAL = EnumHelper.addToolMaterial("BALISONG", 0, 500, 3.0F, 2.0F, 10);
	public static final ToolMaterial MILITARYKNIFE_MATERIAL = EnumHelper.addToolMaterial("MILITARYKNIFE", 0, 500, 3.0F, 1.0F, 10);
	public static final ToolMaterial MONOMOLECULARBLADE_MATERIAL = EnumHelper.addToolMaterial("MONOMOLECULARBLADE", 0, 1000, 9.5F, 20.0F, 10);

	public static void init() {
		PSI_BLADE = new WeaponPsiBlade(PSIBLADE_MATERIAL);
		BANE_BLADE = new WeaponDarkPsiBlade(PSIBLADE_MATERIAL);

		WARP_BLADE = new WeaponWarpBlade(WARPBLADE_MATERIAL);
		DARK_WARP_BLADE = new WeaponDarkWarpBlade(WARPBLADE_MATERIAL);

		MASTER_PSI_BLADE = new WeaponMasterPsiBlade(MASTERPSIBLADE_MATERIAL);

		BALISONG = new WeaponBalisong(BALISONG_MATERIAL);
		MILITARY_KNIFE = new WeaponMilitaryKnife(MILITARYKNIFE_MATERIAL);
		MONOMOLECULAR_BLADE = new WeaponMonomolecularBlade(MONOMOLECULARBLADE_MATERIAL);

		COPPER_SWORD = new WeaponCopperSword(COPPER_MATERIAL);
		TITANIUM_SWORD = new WeaponTitaniumSword(TITANIUM_MATERIAL);
		STEEL_SWORD = new WeaponSteelSword(STEEL_MATERIAL);

	}

	public static void register() {
		registerItem(PSI_BLADE);
		registerItem(BANE_BLADE);

		registerItem(WARP_BLADE);
		registerItem(DARK_WARP_BLADE);

		registerItem(MASTER_PSI_BLADE);

		registerItem(BALISONG);
		registerItem(MILITARY_KNIFE);
		registerItem(MONOMOLECULAR_BLADE);

		registerItem(COPPER_SWORD);
		registerItem(TITANIUM_SWORD);
		registerItem(STEEL_SWORD);
	}

	public static void registerItem(Item item) {
		GameRegistry.register(item);
		if(ConfigurationHandler.BOOL_DEBUG_MODE_ENABLED == true) {
			LogHelper.logger.info("Registered Weapon: " + item.getUnlocalizedName().substring(5));
		}
	}
}