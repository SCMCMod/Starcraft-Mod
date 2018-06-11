package com.hypeirochus.scmc.registry;

import static com.hypeirochus.scmc.handlers.RenderHandler.registerItemRender;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.BiomeHandler;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.EnchantmentHandler;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.handlers.RenderHandler;
import com.hypeirochus.scmc.recipes.CustomRecipes;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.enchantment.Enchantment;
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
//TODO: MOVE TO CORE MOD, WARNING, there is some starcraft code used here. ALSO, note this class uses AccessHandler.class
public class Registry {

	public Registry() {
		if (AccessHandler.isDeobfuscatedEnvironment()) {
			Starcraft.logger().info("Registry created");
		}
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ItemHandler.getItems());
		event.getRegistry().registerAll(BlockHandler.getItems());
		if (AccessHandler.isDeobfuscatedEnvironment()) {
			Starcraft.logger().info("Registered Items");
		}
	}

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(BlockHandler.getBlocks());
		if (AccessHandler.isDeobfuscatedEnvironment()) {
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
		if (AccessHandler.isDeobfuscatedEnvironment()) {
			Starcraft.logger().info("Registered Item Models");
		}

		RenderHandler.registerBlockMetaRenders();
		RenderHandler.registerFluidRenders();
		for (ItemBlock item : BlockHandler.getItems()) {
			if (item != null && !item.getHasSubtypes() && !(item.getBlock() instanceof BlockFluidBase)) {
				registerItemRender(item);
			}
		}

		if (AccessHandler.isDeobfuscatedEnvironment()) {
			Starcraft.logger().info("Registered Block Models");
		}

		// ModTools.TOOLS.forEach(ModelHandler::registerModel);
	}

	@SubscribeEvent
	public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		event.getRegistry().registerAll(CustomRecipes.getRecipes());
		if (AccessHandler.isDeobfuscatedEnvironment()) {
			Starcraft.logger().info("Registered Recipes");
		}
	}

	@SubscribeEvent
	public void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
		event.getRegistry().registerAll(EnchantmentHandler.getEnchantments());
		if (AccessHandler.isDeobfuscatedEnvironment()) {
			Starcraft.logger().info("Registered Enchantments");
		}
	}

	@SubscribeEvent
	public void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(BiomeHandler.getBiomes());

		for (Biome biome : BiomeHandler.getBiomes()) {
			BiomeDictionary.addTypes(biome, BiomeDictionary.Type.VOID);
		}

		if (AccessHandler.isDeobfuscatedEnvironment()) {
			Starcraft.logger().info("Registered Biomes");
		}
	}

	public static void registerColors(ItemColors itemColors, BlockColors blockColors) {
		Item[] items = ItemHandler.getItems();
		ItemBlock[] itemBlocks = BlockHandler.getItems();
		Block[] blocks = BlockHandler.getBlocks();

		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			if (item instanceof IItemColor) {
				itemColors.registerItemColorHandler((IItemColor) item, item);
			}
		}

		for (int i = 0; i < itemBlocks.length; i++) {
			Item item = itemBlocks[i];
			if (item instanceof IItemColor) {
				itemColors.registerItemColorHandler((IItemColor) item, item);
			}
		}

		for (int i = 0; i < blocks.length; i++) {
			Block block = blocks[i];
			Item item = Item.getItemFromBlock(block);
			if (block instanceof IBlockColor) {
				blockColors.registerBlockColorHandler((IBlockColor) block, block);
			}
			if (block instanceof IItemColor) {
				itemColors.registerItemColorHandler((IItemColor) block, item);
			}
		}
	}
}