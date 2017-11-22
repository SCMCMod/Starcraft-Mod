package ga.scmc.blocks;

import java.util.Random;

import ga.scmc.lib.Library;
import net.minecraft.block.Block;
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

public class StarcraftBlock extends Block {

	private Item droppedItem;
	
	public StarcraftBlock(Material material) {
		super(material);
	}

	public StarcraftBlock(String name, RegistryType type, Material material, MapColor color) {
		super(material, color);
		this.setNames(name);
		if (type == RegistryType.FULL) {
			this.registerFullBlock();
		} else if (type == RegistryType.NORMAL) {
			this.registerBlock();
			this.registerBlockModel();
		}
	}

	public StarcraftBlock(RegistryType type, Material material, MapColor color) {
		super(material, color);
		if (type == RegistryType.FULL) {
			this.registerFullBlock();
		} else if (type == RegistryType.NORMAL) {
			this.registerBlock();
			this.registerBlockModel();
		}
	}

	private void registerBlock() {
		ForgeRegistries.BLOCKS.register(this);
		ItemBlock item = new ItemBlock(this);
		item.setRegistryName(this.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
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

	/**
	 * Registers the blocks renders even if it has meta data.
	 */
	public void registerBlockModel(int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), meta, new ModelResourceLocation(new ResourceLocation(Library.MODID, fileName), "inventory"));
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return droppedItem;
	}

	public void setNames(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	public StarcraftBlock setBlockSoundType(SoundType sound) {
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

	public StarcraftBlock setItemDropped(Item droppedItem) {
		this.droppedItem = droppedItem;
		return this;
	}
}
