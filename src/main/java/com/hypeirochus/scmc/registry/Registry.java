package com.hypeirochus.scmc.registry;

import static com.hypeirochus.scmc.handlers.RenderHandler.registerItemRender;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.handlers.BiomeHandler;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.RenderHandler;
import com.hypeirochus.scmc.recipes.CustomRecipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Starcraft.MOD_ID)
public class Registry {

	public Registry() {
		Starcraft.logger().info("Registry initialized");
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemHandler.getItems());
		event.getRegistry().registerAll(BlockHandler.getItems());
	}

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlockHandler.getBlocks());
	}

	@SubscribeEvent
	public void registerModels(ModelRegistryEvent event) {
		RenderHandler.registerItemMetaRenders();
		for (Item item : ItemHandler.getItems()) {
			if (item != null && !item.getHasSubtypes()) {
				registerItemRender(item);
			}
		}

		RenderHandler.registerBlockMetaRenders();
		for (ItemBlock item : BlockHandler.getItems()) {
			if (item != null && !item.getHasSubtypes()) {
				registerItemRender(item);
			}
		}

		// ModTools.TOOLS.forEach(ModelHandler::registerModel);
	}

	@SubscribeEvent
	public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		event.getRegistry().registerAll(CustomRecipes.getRecipes());
	}

	@SubscribeEvent
	public void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(BiomeHandler.getBiomes());
	}
}