package com.hypeirochus.scmc.registry;

import static com.hypeirochus.scmc.handlers.RenderHandler.registerItemRender;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.BiomeHandler;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.RenderHandler;
import com.hypeirochus.scmc.recipes.CustomRecipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Starcraft.MOD_ID)
public class Registry {

	public Registry() {
		if (AccessHandler.isDevEnvironment()) {
			Starcraft.logger().info("Registry created");
		}
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemHandler.getItems());
		event.getRegistry().registerAll(BlockHandler.getItems());
		if (AccessHandler.isDevEnvironment()) {
			Starcraft.logger().info("Registered Items");
		}
	}

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlockHandler.getBlocks());
		if (AccessHandler.isDevEnvironment()) {
			Starcraft.logger().info("Registered Blocks");
		}
	}

	@SubscribeEvent
	public void registerModels(ModelRegistryEvent event) {
		RenderHandler.registerItemMetaRenders();
		for (Item item : ItemHandler.getItems()) {
			if (item != null && !item.getHasSubtypes()) {
				registerItemRender(item);
			}
		}
		if (AccessHandler.isDevEnvironment()) {
			Starcraft.logger().info("Registered Item Models");
		}

		RenderHandler.registerBlockMetaRenders();
		RenderHandler.registerFluidRenders();
		for (ItemBlock item : BlockHandler.getItems()) {
			if (item != null && !item.getHasSubtypes() && !(item.getBlock() instanceof BlockFluidBase)) {
				registerItemRender(item);
			}
		}
		if (AccessHandler.isDevEnvironment()) {
			Starcraft.logger().info("Registered Block Models");
		}

		// ModTools.TOOLS.forEach(ModelHandler::registerModel);
	}

	@SubscribeEvent
	public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		event.getRegistry().registerAll(CustomRecipes.getRecipes());
		if (AccessHandler.isDevEnvironment()) {
			Starcraft.logger().info("Registered Recipes");
		}
	}

	@SubscribeEvent
	public void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(BiomeHandler.getBiomes());

		for (Biome biome : BiomeHandler.getBiomes()) {
			BiomeDictionary.addTypes(biome, BiomeDictionary.Type.VOID);
		}

		if (AccessHandler.isDevEnvironment()) {
			Starcraft.logger().info("Registered Biomes");
		}
	}
}