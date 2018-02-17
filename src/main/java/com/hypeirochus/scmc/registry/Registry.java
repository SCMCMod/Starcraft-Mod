package com.hypeirochus.scmc.registry;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.RenderingHandler;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistry;

@EventBusSubscriber(modid = Starcraft.MOD_ID)
public class Registry {

	public Registry() {
		Starcraft.logger().info("Registry initialized");
	}
	
	@SubscribeEvent
	public void onItemRegisterEvnt(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemHandler.getItems());
	}

	@SubscribeEvent
	public void onBlockRegisterEvnt(RegistryEvent.Register<Block> event) {

	}

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		RenderingHandler.registerItemMetaRenders();
		for (Item item : ItemHandler.getItems()) {
			if (!item.getHasSubtypes()) {
				registerModel(item);
			}
		}

		// ModBlocks.registerMetaRenders();
		// for (Block block : ModBlocks.getBlocks()) {
		// if (Item.getItemFromBlock(block) == null || !Item.getItemFromBlock(block).getHasSubtypes()) {
		// registerModel(block);
		// }
		// }
		//
		// ModTools.TOOLS.forEach(ModelHandler::registerModel);
	}

	private static void registerModel(Block block) {
		registerModel(Item.getItemFromBlock(block));
	}

	private static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}