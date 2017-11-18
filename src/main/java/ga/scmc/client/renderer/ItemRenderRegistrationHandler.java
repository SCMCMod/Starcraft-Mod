package ga.scmc.client.renderer;

import ga.scmc.Starcraft;
import ga.scmc.client.renderer.items.ItemRenderC14GaussRifle;
import ga.scmc.client.renderer.items.ItemRenderFlamethrower;
import ga.scmc.client.renderer.items.ItemRenderModelArmorItem;
import ga.scmc.client.renderer.items.ItemRenderStarcraftSkull;
import ga.scmc.client.renderer.items.ItemRenderTable;
import ga.scmc.client.renderer.model.IArmorModelItem;
import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.lib.Library;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
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
		registerItemModel(ItemHandler.STARCRAFT_SKULL, new ItemRenderStarcraftSkull());
	}

	private static void registerItemModel(Item item, IBakedModel model) {
		eventObj.getModelRegistry().putObject(new ModelResourceLocation(item.getRegistryName(), "inventory"), model);
	}

	private static void registerItemModel(Block block, IBakedModel model) {
		eventObj.getModelRegistry().putObject(new ModelResourceLocation(block.getRegistryName(), "inventory"), model);
	}
}