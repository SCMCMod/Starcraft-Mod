package com.hypeirochus.scmc.handlers;

import static com.hypeirochus.scmc.handlers.ItemHandler.*;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.enums.MetaHandler;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

public class RenderHandler {

	public static void registerItemMetaRenders() {
		for (int i = 0; i < MetaHandler.MineralType.values().length; i++) {
			registerItemRender(MINERAL_SHARD, i, "mineral." + MetaHandler.MineralType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.ContainerType.values().length; i++) {
			registerItemRender(GAS_CONTAINER, i, "container." + MetaHandler.ContainerType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.VespeneType.values().length; i++) {
			registerItemRender(VESPENE, i, "vespene." + MetaHandler.VespeneType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.TerrazineType.values().length; i++) {
			registerItemRender(TERRAZINE, i, "terrazine." + MetaHandler.TerrazineType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.EnergyType.values().length; i++) {
			registerItemRender(ENERGY, i, "energy." + MetaHandler.EnergyType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.DustType.values().length; i++) {
			registerItemRender(DUST, i, "dust." + MetaHandler.DustType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.IngotType.values().length; i++) {
			registerItemRender(INGOT, i, "ingot." + MetaHandler.IngotType.values()[i].getName());
		}
		for (int i = 0; i < C14_GAUSS_RIFLE_PARTS.getNumParts(); i++) {
			registerItemRender(C14_GAUSS_RIFLE_PARTS, i, "terran.riflec14.part." + i);
		}
		for (int i = 0; i < FLAMETHROWER_PARTS.getNumParts(); i++) {
			registerItemRender(FLAMETHROWER_PARTS, i, "terran.flamethrower.part." + i);
		}
		for (int i = 0; i < MetaHandler.BulletMagazineType.values().length; i++) {
			registerItemRender(BULLET_MAGAZINE, i, "terran.magazine." + MetaHandler.BulletMagazineType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.ProtossIngotType.values().length; i++) {
			registerItemRender(PROTOSS_INGOT, i, "protoss.ingot." + MetaHandler.ProtossIngotType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.FocuserType.values().length; i++) {
			registerItemRender(PSI_BLADE_FOCUSER_UNCHARGED, i, "protoss.focuser." + MetaHandler.FocuserType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.CarapaceType.values().length; i++) {
			registerItemRender(ZERG_CARAPACE, i, "zerg.carapace" + MetaHandler.CarapaceType.values()[i].getName());
		}
		for (int i = 0; i < MetaHandler.IconType.values().length; i++) {
			registerItemRender(ICON, i, "icon." + MetaHandler.IconType.values()[i].getName());
		}
	}

	public static void registerBlockMetaRenders() {

	}

	public static void pre(FMLPreInitializationEvent event) {

	}

	public static void registerItemRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	public static void registerItemRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Starcraft.MOD_ID, fileName), "inventory"));
	}

	public static void registerBlockRender(Block block) {
		registerItemRender(Item.getItemFromBlock(block));
	}

	public static void registerBlockRender(Block block, int meta, String fileName) {
		registerItemRender(Item.getItemFromBlock(block), meta, fileName);
	}

	public static void registerFluid(final Block block) {
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition() {

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation(block.getRegistryName(), "fluid");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation(block.getRegistryName(), "fluid");
			}
		});
	}

	public static void registerLayered(final Block block) {
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(block), new ItemMeshDefinition() {

			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation(block.getRegistryName(), "normal");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {

			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				char num = state.toString().charAt(state.toString().length() - 2);
				return new ModelResourceLocation(block.getRegistryName(), "layers=" + num);
			}
		});
	}
}