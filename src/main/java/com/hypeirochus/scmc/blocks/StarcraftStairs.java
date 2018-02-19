package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.blocks.items.ItemBlockLayered;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.RenderHandler;
import com.hypeirochus.scmc.lib.Library;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
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

	private RegistryType type;
	private ItemBlock item;

	public StarcraftStairs(IBlockState material) {
		super(material);
	}

	public StarcraftStairs(String name, RegistryType type, IBlockState material) {
		super(material);
		this.type = type;
		this.setNames(name);
		this.registerPre();
	}

	public StarcraftStairs(RegistryType type, IBlockState material) {
		super(material);
		this.type = type;
		this.registerPre();
	}

	public void registerPre() {
		if (type == RegistryType.FULL) {
			if (item == null) {
				BlockHandler.registerFullBlock(this);
			} else {
				BlockHandler.registerBlockWithItemBlock(this, item);
			}
		} else if (type == RegistryType.BLOCK) {
			BlockHandler.register(this);
		}
	}

	public void setNames(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	@Override
	public StarcraftStairs setSoundType(SoundType sound) {
		return (StarcraftStairs) super.setSoundType(sound);
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