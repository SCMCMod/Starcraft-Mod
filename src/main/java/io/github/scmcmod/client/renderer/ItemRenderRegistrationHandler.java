package io.github.scmcmod.client.renderer;

import io.github.scmcmod.SCConstants;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class ItemRenderRegistrationHandler
{

	private static ModelBakeEvent eventObj;
	
	private static String id = SCConstants.MODID;

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelBake(ModelBakeEvent event)
	{
		eventObj = event;

//		register(ItemHandler.C14_GAUSS_RIFLE, new ItemRenderC14GaussRifle());
//		register(ItemHandler.FLAMETHROWER, new ItemRenderFlamethrower());
//		register(ItemHandler.SOLARITE_REAPER, new ItemRenderSolariteReaper());
//		register(StarCraftBlocks.STARCRAFT_SKULL, new ItemRenderStarcraftSkull());
//		register(StarCraftBlocks.FLORA_ZERUS_GLOW_POD, new ItemRenderZerusGlowPod());
//		register(StarCraftBlocks.FLORA_BRAMBLES, new ItemRenderBrambles());
//		register(StarCraftBlocks.FLORA_ZERUS_LIGHTCAP, new ItemRenderZerusLightcap());
//
//		register(ArmorHandler.TERRAN_MARINE_T1_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.TERRAN_MARINE_T1_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.TERRAN_MARINE_T1_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.TERRAN_MARINE_T1_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.TERRAN_MARINE_T2_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.TERRAN_MARINE_T2_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.TERRAN_MARINE_T2_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.TERRAN_MARINE_T2_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.TERRAN_MARINE_T3_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.TERRAN_MARINE_T3_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.TERRAN_MARINE_T3_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.TERRAN_MARINE_T3_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
//
//		register(ArmorHandler.TERRAN_RAYNOR_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_RAYNOR_ARMOR_MATERIAL));
//		register(ArmorHandler.TERRAN_RAYNOR_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_RAYNOR_ARMOR_MATERIAL));
//		register(ArmorHandler.TERRAN_RAYNOR_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_RAYNOR_ARMOR_MATERIAL));
//		register(ArmorHandler.TERRAN_RAYNOR_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_RAYNOR_ARMOR_MATERIAL));
//
//		register(ArmorHandler.ZERG_T1_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(0), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.ZERG_T1_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(0), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.ZERG_T1_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(1), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.ZERG_T1_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(1), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.ZERG_T2_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(2), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.ZERG_T2_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(2), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.ZERG_T2_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(3), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.ZERG_T2_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(3), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.ZERG_T3_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(4), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.ZERG_T3_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(4), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.ZERG_T3_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(5), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.ZERG_T3_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(5), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
//
//		register(ArmorHandler.PROTOSS_T1_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_T1_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_T1_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_T1_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_T2_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_T2_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_T2_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_T2_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_T3_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.PROTOSS_T3_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.PROTOSS_T3_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.PROTOSS_T3_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T3));
//
//		register(ArmorHandler.PROTOSS_NERAZIM_T1_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_NERAZIM_T1_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_NERAZIM_T1_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_NERAZIM_T1_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_NERAZIM_T2_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_NERAZIM_T2_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_NERAZIM_T2_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_NERAZIM_T2_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_NERAZIM_T3_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.PROTOSS_NERAZIM_T3_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.PROTOSS_NERAZIM_T3_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.PROTOSS_NERAZIM_T3_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T3));
//
//		register(ArmorHandler.PROTOSS_TALDARIM_T1_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_TALDARIM_T1_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_TALDARIM_T1_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_TALDARIM_T1_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T1));
//		register(ArmorHandler.PROTOSS_TALDARIM_T2_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_TALDARIM_T2_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_TALDARIM_T2_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_TALDARIM_T2_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T2));
//		register(ArmorHandler.PROTOSS_TALDARIM_T3_HELMET, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.PROTOSS_TALDARIM_T3_CHESTPLATE, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.PROTOSS_TALDARIM_T3_LEGGINGS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T3));
//		register(ArmorHandler.PROTOSS_TALDARIM_T3_BOOTS, new ItemRenderModelArmorItem(id, EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T3));

	}
}