package ga.scmc.handlers;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.lib.Library;
import ga.scmc.lib.LogHelper;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Contains all the armors in the mod.
 */
public class ArmorHandler {

	/*
	 * CLOTH(5, new int[]{1, 3, 2, 1}, 15), CHAIN(15, new int[]{2, 5, 4, 1}, 12), IRON(15, new int[]{2, 6, 5, 2}, 9), GOLD(7, new int[]{2, 5, 3, 1}, 25), DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
	 */

	public static final ItemArmor.ArmorMaterial ADEPT_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("adeptArmorMaterialT1", Library.RL_BASE + "adept_t1", 33, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ItemArmor.ArmorMaterial ADEPT_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("adeptArmorMaterialT2", Library.RL_BASE + "adept_t2", 35, new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ItemArmor.ArmorMaterial ADEPT_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("adeptArmorMaterialT3", Library.RL_BASE + "adept_t3", 37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ItemArmor.ArmorMaterial COPPER_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("copperArmorMaterial", Library.RL_BASE + "copper", 11, new int[] { 2, 5, 4, 1 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ItemArmor.ArmorMaterial GHOST_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("ghostArmourMaterial", Library.RL_BASE + "ghost_invis", 20, new int[] { 2, 6, 4, 2 }, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ItemArmor.ArmorMaterial KHAYDARIN_AMULET_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("khaydarinAmuletArmorMaterial", Library.RL_BASE + "khaydarin_amulet", 37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ItemArmor.ArmorMaterial STEEL_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("steelArmorMaterial", Library.RL_BASE + "steel", 29, new int[] { 3, 7, 5, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ItemArmor.ArmorMaterial TITANIUM_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("titaniumArmorMaterial", Library.RL_BASE + "titanium", 21, new int[] { 3, 6, 5, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ItemArmor.ArmorMaterial ZEALOT_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("zealotArmorMaterialT1", Library.RL_BASE + "zealot_t1", 33, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ItemArmor.ArmorMaterial ZEALOT_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("zealotArmorMaterialT2", Library.RL_BASE + "zealot_t2", 35, new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ItemArmor.ArmorMaterial ZEALOT_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("zealotArmorMaterialT3", Library.RL_BASE + "zealot_t3", 37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static final ItemArmor.ArmorMaterial ZERG_ARMOR_MATERIAL_T1 = EnumHelper.addArmorMaterial("zergArmorMaterialT1", Library.RL_BASE + "zerg_t1", 33, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ItemArmor.ArmorMaterial ZERG_ARMOR_MATERIAL_T2 = EnumHelper.addArmorMaterial("zergArmorMaterialT2", Library.RL_BASE + "zerg_t2", 35, new int[] { 4, 9, 7, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);
	public static final ItemArmor.ArmorMaterial ZERG_ARMOR_MATERIAL_T3 = EnumHelper.addArmorMaterial("zergArmorMaterialT3", Library.RL_BASE + "zerg_t3", 37, new int[] { 5, 10, 8, 5 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0f);

	public static Item COPPER_BOOTS;
	public static Item COPPER_CHESTPLATE;
	public static Item COPPER_HELMET;
	public static Item COPPER_LEGGINGS;

	public static Item STEEL_BOOTS;
	public static Item STEEL_CHESTPLATE;
	public static Item STEEL_HELMET;
	public static Item STEEL_LEGGINGS;

	public static Item TITANIUM_BOOTS;
	public static Item TITANIUM_CHESTPLATE;
	public static Item TITANIUM_HELMET;
	public static Item TITANIUM_LEGGINGS;

	public static void init() {
		TITANIUM_HELMET = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("titaniumHelmet").setRegistryName("titanium_helmet").setCreativeTab(StarcraftCreativeTabs.TERRAN);;
		TITANIUM_CHESTPLATE = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("titaniumChestplate").setRegistryName("titanium_chestplate").setCreativeTab(StarcraftCreativeTabs.TERRAN);;
		TITANIUM_LEGGINGS = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("titaniumLeggings").setRegistryName("titanium_leggings").setCreativeTab(StarcraftCreativeTabs.TERRAN);;
		TITANIUM_BOOTS = new ItemArmor(TITANIUM_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("titaniumBoots").setRegistryName("titanium_boots").setCreativeTab(StarcraftCreativeTabs.TERRAN);;

		COPPER_HELMET = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("copperHelmet").setRegistryName("copper_helmet").setCreativeTab(StarcraftCreativeTabs.TERRAN);;
		COPPER_CHESTPLATE = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("copperChestplate").setRegistryName("copper_chestplate").setCreativeTab(StarcraftCreativeTabs.TERRAN);;
		COPPER_LEGGINGS = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("copperLeggings").setRegistryName("copper_leggings").setCreativeTab(StarcraftCreativeTabs.TERRAN);;
		COPPER_BOOTS = new ItemArmor(COPPER_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("copperBoots").setRegistryName("copper_boots").setCreativeTab(StarcraftCreativeTabs.TERRAN);;

		STEEL_HELMET = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("steelHelmet").setRegistryName("steel_helmet").setCreativeTab(StarcraftCreativeTabs.TERRAN);;
		STEEL_CHESTPLATE = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("steelChestplate").setRegistryName("steel_chestplate").setCreativeTab(StarcraftCreativeTabs.TERRAN);;
		STEEL_LEGGINGS = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("steelLeggings").setRegistryName("steel_leggings").setCreativeTab(StarcraftCreativeTabs.TERRAN);;
		STEEL_BOOTS = new ItemArmor(STEEL_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("steelBoots").setRegistryName("steel_boots").setCreativeTab(StarcraftCreativeTabs.TERRAN);;

	}

	public static void register() {
		
		  registerItem(TITANIUM_HELMET); registerItem(TITANIUM_CHESTPLATE); registerItem(TITANIUM_LEGGINGS); registerItem(TITANIUM_BOOTS);
		  
		  registerItem(COPPER_HELMET); registerItem(COPPER_CHESTPLATE); registerItem(COPPER_LEGGINGS); registerItem(COPPER_BOOTS);
		 
		  registerItem(STEEL_HELMET); registerItem(STEEL_CHESTPLATE); registerItem(STEEL_LEGGINGS); registerItem(STEEL_BOOTS);
	}

	private static void registerItem(Item item) {
		GameRegistry.register(item);
		if(ConfigurationHandler.BOOL_DEBUG_MODE_ENABLED == true) {
			LogHelper.logger.info("Registered Armor: " + item.getUnlocalizedName().substring(5));
		}
	}
}
