package ga.scmc.client.renderer;

import ga.scmc.Starcraft;
import ga.scmc.api.Utils;
import ga.scmc.client.renderer.items.ItemRenderC14GaussRifle;
import ga.scmc.client.renderer.items.ItemRenderFlamethrower;
import ga.scmc.client.renderer.items.ItemRenderKaldirBrambles;
import ga.scmc.client.renderer.items.ItemRenderModelArmorItem;
import ga.scmc.client.renderer.items.ItemRenderSolariteReaper;
import ga.scmc.client.renderer.items.ItemRenderStarcraftSkull;
import ga.scmc.client.renderer.items.ItemRenderTable;
import ga.scmc.client.renderer.items.ItemRenderZerusGlowPod;
import ga.scmc.client.renderer.items.ItemRenderZerusLightcap;
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

		register(BlockHandler.TEST, new ItemRenderTable());
		register(ItemHandler.C14_GAUSS_RIFLE, new ItemRenderC14GaussRifle());
		register(ItemHandler.FLAMETHROWER, new ItemRenderFlamethrower());
		register(ItemHandler.SOLARITE_REAPER, new ItemRenderSolariteReaper());
		register(BlockHandler.STARCRAFT_SKULL, new ItemRenderStarcraftSkull());
		register(BlockHandler.FLORA_ZERUS_GLOW_POD, new ItemRenderZerusGlowPod());
		register(BlockHandler.FLORA_KALDIR_BRAMBLES, new ItemRenderKaldirBrambles());
		register(BlockHandler.FLORA_ZERUS_LIGHTCAP, new ItemRenderZerusLightcap());

		register(ArmorHandler.TERRAN_MARINE_T1_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
		register(ArmorHandler.TERRAN_MARINE_T1_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
		register(ArmorHandler.TERRAN_MARINE_T1_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
		register(ArmorHandler.TERRAN_MARINE_T1_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T1));
		register(ArmorHandler.TERRAN_MARINE_T2_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
		register(ArmorHandler.TERRAN_MARINE_T2_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
		register(ArmorHandler.TERRAN_MARINE_T2_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
		register(ArmorHandler.TERRAN_MARINE_T2_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T2));
		register(ArmorHandler.TERRAN_MARINE_T3_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
		register(ArmorHandler.TERRAN_MARINE_T3_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
		register(ArmorHandler.TERRAN_MARINE_T3_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));
		register(ArmorHandler.TERRAN_MARINE_T3_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_MARINE_ARMOR_MATERIAL_T3));

		register(ArmorHandler.TERRAN_RAYNOR_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_RAYNOR_ARMOR_MATERIAL));
		register(ArmorHandler.TERRAN_RAYNOR_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(6), ArmorHandler.TERRAN_RAYNOR_ARMOR_MATERIAL));
		register(ArmorHandler.TERRAN_RAYNOR_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_RAYNOR_ARMOR_MATERIAL));
		register(ArmorHandler.TERRAN_RAYNOR_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(7), ArmorHandler.TERRAN_RAYNOR_ARMOR_MATERIAL));

		register(ArmorHandler.ZERG_T1_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(0), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
		register(ArmorHandler.ZERG_T1_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(0), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
		register(ArmorHandler.ZERG_T1_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(1), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
		register(ArmorHandler.ZERG_T1_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(1), ArmorHandler.ZERG_ARMOR_MATERIAL_T1));
		register(ArmorHandler.ZERG_T2_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(2), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
		register(ArmorHandler.ZERG_T2_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(2), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
		register(ArmorHandler.ZERG_T2_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(3), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
		register(ArmorHandler.ZERG_T2_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(3), ArmorHandler.ZERG_ARMOR_MATERIAL_T2));
		register(ArmorHandler.ZERG_T3_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(4), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
		register(ArmorHandler.ZERG_T3_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(4), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
		register(ArmorHandler.ZERG_T3_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(5), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));
		register(ArmorHandler.ZERG_T3_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(5), ArmorHandler.ZERG_ARMOR_MATERIAL_T3));

		register(ArmorHandler.PROTOSS_T1_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_T1_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_T1_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_T1_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_T2_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_T2_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_T2_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_T2_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_T3_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T3));
		register(ArmorHandler.PROTOSS_T3_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(8), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T3));
		register(ArmorHandler.PROTOSS_T3_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T3));
		register(ArmorHandler.PROTOSS_T3_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(9), ArmorHandler.PROTOSS_ARMOR_MATERIAL_T3));

		register(ArmorHandler.PROTOSS_NERAZIM_T1_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_NERAZIM_T1_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_NERAZIM_T1_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_NERAZIM_T1_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_NERAZIM_T2_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_NERAZIM_T2_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_NERAZIM_T2_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_NERAZIM_T2_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_NERAZIM_T3_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T3));
		register(ArmorHandler.PROTOSS_NERAZIM_T3_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(12), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T3));
		register(ArmorHandler.PROTOSS_NERAZIM_T3_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T3));
		register(ArmorHandler.PROTOSS_NERAZIM_T3_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(13), ArmorHandler.PROTOSS_NERAZIM_ARMOR_MATERIAL_T3));

		register(ArmorHandler.PROTOSS_TALDARIM_T1_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_TALDARIM_T1_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_TALDARIM_T1_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_TALDARIM_T1_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T1));
		register(ArmorHandler.PROTOSS_TALDARIM_T2_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_TALDARIM_T2_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_TALDARIM_T2_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_TALDARIM_T2_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T2));
		register(ArmorHandler.PROTOSS_TALDARIM_T3_HELMET, new ItemRenderModelArmorItem(EntityEquipmentSlot.HEAD, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T3));
		register(ArmorHandler.PROTOSS_TALDARIM_T3_CHESTPLATE, new ItemRenderModelArmorItem(EntityEquipmentSlot.CHEST, (IArmorItem) Starcraft.proxy.getArmorModel(10), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T3));
		register(ArmorHandler.PROTOSS_TALDARIM_T3_LEGGINGS, new ItemRenderModelArmorItem(EntityEquipmentSlot.LEGS, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T3));
		register(ArmorHandler.PROTOSS_TALDARIM_T3_BOOTS, new ItemRenderModelArmorItem(EntityEquipmentSlot.FEET, (IArmorItem) Starcraft.proxy.getArmorModel(11), ArmorHandler.PROTOSS_TALDARIM_ARMOR_MATERIAL_T3));

	}

	/**
	 * Registers a custom item renderer for an item or block.
	 * 
	 * <br>
	 * </br>
	 * 
	 * <b><i>Note: this does take in an object parameter, but it will throw an
	 * {@link IllegalArgumentException} if the object is not an item or
	 * block.</b></i>
	 * 
	 * @param obj
	 *            The item or block to register.
	 * @param model
	 *            The baked model to register to the specified item or block
	 */
	private static void register(Object obj, IBakedModel model) {
		Item item = null;
		Block block = null;
		if (obj instanceof Item) {
			block = null;
			item = (Item) obj;
		} else if (obj instanceof Block) {
			block = (Block) obj;
			item = Item.getItemFromBlock(block);
		} else {
			throw new IllegalArgumentException("You can only register custom item renders for items or blocks. Any other object is not allowed");
		}

		if (item != null) {
			eventObj.getModelRegistry().putObject(new ModelResourceLocation(item.getRegistryName(), "inventory"), model);
		} else {
			Utils.getLogger().warn(String.format("Item for block %s was null. Cannot register an item render for a block that does nto have an item block attached.", block));
		}
	}
}