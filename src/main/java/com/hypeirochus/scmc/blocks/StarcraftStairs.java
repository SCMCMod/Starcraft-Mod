package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.lib.Library;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StarcraftStairs extends BlockStairs {

	private ItemBlock item;

	public StarcraftStairs(IBlockState block) {
		super(block);
	}

	public StarcraftStairs(String name, RegistryType type, IBlockState block) {
		super(block);
		this.setNames(name);
		this.registerPre(type);
	}

	public StarcraftStairs(RegistryType type, IBlockState block) {
		super(block);
		registerPre(type);
	}

	public void registerPre(RegistryType type) {
		if (type == RegistryType.FULL) {
			if (item == null) {
				this.registerFullBlock();
			} else {
				this.registerBlockWithItemBlock(item);
			}
		} else if (type == RegistryType.NORMAL) {
			if (item == null) {
				this.registerFullBlock();
			} else {
				this.registerBlockWithItemBlock(item);
			}
			this.registerBlockModel();
		} else if (type == RegistryType.BLOCK) {
			this.registerBlock();
		}
	}

	private void registerBlock() {
		ForgeRegistries.BLOCKS.register(this);
	}

	private void registerFullBlock() {
		ForgeRegistries.BLOCKS.register(this);
		ItemBlock item = new ItemBlock(this);
		item.setRegistryName(this.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}

	private void registerBlockWithItemBlock(ItemBlock item) {
		ForgeRegistries.BLOCKS.register(this);
		item.setRegistryName(this.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}

	@SideOnly(Side.CLIENT)
	private void registerBlockModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
	}

	@SideOnly(Side.CLIENT)
	private void registerBlockModel(int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), meta, new ModelResourceLocation(new ResourceLocation(Library.MODID, fileName), "inventory"));
	}

	public void setNames(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	public StarcraftStairs setBlockSoundType(SoundType sound) {
		this.setSoundType(sound);
		return this;
	}

	/**
	 * Sets or removes the tool and level required to harvest this block.
	 *
	 * @param toolClass
	 *            Class
	 * @param level
	 *            Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0
	 */
	public StarcraftStairs setBlockHarvestLevel(String toolClass, int level) {
		setHarvestLevel(toolClass, level);
		return this;
	}

	/**
	 * Sets or removes the tool and level required to harvest this block.
	 *
	 * @param toolClass
	 *            Class
	 * @param level
	 *            Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0
	 * @param state
	 *            The specific state.
	 */
	public StarcraftStairs setBlockHarvestLevel(String toolClass, int level, IBlockState state) {
		setHarvestLevel(toolClass, level, state);
		return this;
	}

	public StarcraftStairs setItemBlock(ItemBlock item) {
		this.item = item;
		return this;
	}
}