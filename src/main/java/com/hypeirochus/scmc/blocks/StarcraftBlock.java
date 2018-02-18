package com.hypeirochus.scmc.blocks;

import com.hypeirochus.scmc.blocks.items.ItemBlockLayered;
import com.hypeirochus.scmc.handlers.BlockHandler;
import com.hypeirochus.scmc.handlers.RenderHandler;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class StarcraftBlock extends Block {

	private RegistryType type;
	private ItemBlock item;

	public StarcraftBlock(Material material) {
		super(material, material.getMaterialMapColor());
	}

	public StarcraftBlock(Material material, MapColor color) {
		super(material, color);
	}

	public StarcraftBlock(String name, RegistryType type, Material material) {
		this(name, type, material, material.getMaterialMapColor());
	}

	public StarcraftBlock(RegistryType type, Material material) {
		this(type, material, material.getMaterialMapColor());
	}

	public StarcraftBlock(String name, RegistryType type, Material material, MapColor color) {
		super(material, color);
		this.type = type;
		this.setNames(name);
		this.registerPre();
	}

	public StarcraftBlock(RegistryType type, Material material, MapColor color) {
		super(material, color);
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
		} else if (type == RegistryType.LAYERED) {
			if (this instanceof StarcraftBlockLayered) {
				setItemBlock(new ItemBlockLayered((StarcraftBlockLayered) this));
				BlockHandler.registerBlockWithItemBlock(this, item);
				if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
					RenderHandler.registerLayered(this);
				}
			} else {
				throw new IllegalArgumentException(String.format("The given Block %s tried to register as a layered block, but it is not an instance of StarcraftBlockLayered!", this.getUnlocalizedName()));
			}
		}
	}

	public void setNames(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	@Override
	public StarcraftBlock setSoundType(SoundType sound) {
		return (StarcraftBlock) super.setSoundType(sound);
	}

	/**
	 * Sets or removes the tool and level required to harvest this block.
	 *
	 * @param toolClass
	 *            Class
	 * @param level
	 *            Harvest level: Wood: 0 Stone: 1 Iron: 2 Diamond: 3 Gold: 0
	 */
	public StarcraftBlock setBlockHarvestLevel(String toolClass, int level) {
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
	public StarcraftBlock setBlockHarvestLevel(String toolClass, int level, IBlockState state) {
		setHarvestLevel(toolClass, level, state);
		return this;
	}

	public StarcraftBlock setItemBlock(ItemBlock item) {
		this.item = item;
		return this;
	}
}
