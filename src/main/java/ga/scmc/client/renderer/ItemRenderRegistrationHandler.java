package ga.scmc.client.renderer;

import ga.scmc.Starcraft;
import ga.scmc.client.renderer.items.ItemRenderC14GaussRifle;
import ga.scmc.client.renderer.items.ItemRenderFlamethrower;
import ga.scmc.client.renderer.items.ItemRenderModelArmorItem;
import ga.scmc.client.renderer.items.ItemRenderStarcraftSkull;
import ga.scmc.client.renderer.items.ItemRenderTable;
import ga.scmc.client.renderer.items.ItemRenderZerusGlowPod;
import ga.scmc.client.renderer.model.IArmorItem;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class ItemRenderRegistrationHandler {

	private static ModelBakeEvent eventObj;

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelBake(ModelBakeEvent event) {
		eventObj = event;

		registerItemModel(ItemHandler.C14_GAUSS_RIFLE, new ItemRenderC14GaussRifle());
		registerItemModel(ItemHandler.FLAMETHROWER, new ItemRenderFlamethrower());
		registerItemModel(BlockHandler.TEST, new ItemRenderTable());
		registerItemModel(Item.getItemFromBlock(BlockHandler.STARCRAFT_SKULL), new ItemRenderStarcraftSkull());
		registerItemModel(Item.getItemFromBlock(BlockHandler.FLORA_ZERUS_GLOW_POD), new ItemRenderZerusGlowPod());

		registerItemModel(ArmorHandler.TERRAN_MARINE_T1_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T1_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T1_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T1_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T2_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T2_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T2_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T2_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T3_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T3_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T3_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
		registerItemModel(ArmorHandler.TERRAN_MARINE_T3_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));

		registerItemModel(ArmorHandler.ZERG_T1_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(0), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
		registerItemModel(ArmorHandler.ZERG_T1_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(0), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
		registerItemModel(ArmorHandler.ZERG_T1_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(1), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
		registerItemModel(ArmorHandler.ZERG_T1_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(1), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
		registerItemModel(ArmorHandler.ZERG_T2_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(2), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
		registerItemModel(ArmorHandler.ZERG_T2_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(2), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
		registerItemModel(ArmorHandler.ZERG_T2_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(3), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
		registerItemModel(ArmorHandler.ZERG_T2_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(3), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
		registerItemModel(ArmorHandler.ZERG_T3_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(4), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
		registerItemModel(ArmorHandler.ZERG_T3_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(4), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
		registerItemModel(ArmorHandler.ZERG_T3_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(5), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
		registerItemModel(ArmorHandler.ZERG_T3_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(5), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
	}

	private static void registerItemModel(Item item, IBakedModel model) {
		eventObj.getModelRegistry().putObject(new ModelResourceLocation(item.getRegistryName(), "inventory"), model);
	}

	private static void registerItemModel(Block block, IBakedModel model) {
		eventObj.getModelRegistry().putObject(new ModelResourceLocation(block.getRegistryName(), "inventory"), model);
	}
}