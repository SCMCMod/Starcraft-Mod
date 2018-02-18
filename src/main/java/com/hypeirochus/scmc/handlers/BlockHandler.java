package com.hypeirochus.scmc.handlers;

import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.blocks.BlockAsh;
import com.hypeirochus.scmc.blocks.BlockCharFarmland;
import com.hypeirochus.scmc.blocks.BlockCharOre;
import com.hypeirochus.scmc.blocks.BlockMagma;
import com.hypeirochus.scmc.blocks.BlockOverworldOre;
import com.hypeirochus.scmc.blocks.BlockStarcraftDirt;
import com.hypeirochus.scmc.blocks.BlockStarcraftGravel;
import com.hypeirochus.scmc.blocks.OreStarcraftRedstone;
import com.hypeirochus.scmc.blocks.RegistryType;
import com.hypeirochus.scmc.blocks.StarcraftBlock;
import com.hypeirochus.scmc.blocks.StarcraftBlockCustomDrop;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockHandler {

	public static List<Block> blocks;
	public static List<ItemBlock> items;

	// Portals
	public static Block DIM_PORTAL_CHAR;
	public static Block DIM_PORTAL_OVERWORLD;
	public static Block DIM_PORTAL_SPACE;
	public static Block DIM_PORTAL_SHAKURAS;
	public static Block DIM_PORTAL_KALDIR;
	public static Block DIM_PORTAL_KORHAL;
	public static Block DIM_PORTAL_SLAYN;
	public static Block DIM_PORTAL_AIUR;
	public static Block DIM_PORTAL_ZERUS;

	// Overworld Ores
	public static Block ORE_COPPER_OW;
	public static Block ORE_TITANIUM_OW;
	public static Block ORE_URANIUM_OW;
	public static Block ORE_MINERAL_OW;
	public static Block ORE_RICHMINERAL_OW;
	public static Block ORE_PHOSPHORUS_OW;

	// Char
	public static Block STONE_CHAR;
	public static Block COBBLESTONE_CHAR;
	public static Block FARMLAND_CHAR;
	public static Block DIRT_CHAR;
	public static Block GRAVEL_CHAR;
	public static Block MAGMA_CHAR;
	public static Block ASH_CHAR;

	// Char Ores
	public static Block ORE_COAL_CHAR;
	public static Block ORE_IRON_CHAR;
	public static Block ORE_GOLD_CHAR;
	public static Block ORE_DIAMOND_CHAR;
	public static Block ORE_LAPIS_CHAR;
	public static Block ORE_REDSTONE_CHAR;
	public static Block ORE_COPPER_CHAR;
	public static Block ORE_TITANIUM_CHAR;
	public static Block ORE_PHOSPHORUS_CHAR;
	public static Block ORE_URANIUM_CHAR;
	public static Block ORE_MINERAL_CHAR;
	public static Block ORE_RICHMINERAL_CHAR;

	// Shakuras
	public static Block COBBLESTONE_SHAKURAS;

	// Zerus
	public static Block COBBLESTONE_ZERUS;

	private static void init() {
		blocks = new ArrayList<Block>();
		items = new ArrayList<ItemBlock>();

		if (AccessHandler.isDevEnvironment()) {
			Starcraft.logger().info("Registering blocks");
		}

		instantiate();
	}

	private static void instantiate() {
		// Portals
		DIM_PORTAL_OVERWORLD = new BlockDimPortal("overworld.portal", 0);
		DIM_PORTAL_KORHAL = new BlockDimPortal("korhal.portal", ConfigHandler.INT_DIMENSION_KORHAL);
		DIM_PORTAL_KALDIR = new BlockDimPortal("kaldir.portal", ConfigHandler.INT_DIMENSION_KALDIR);
		DIM_PORTAL_CHAR = new BlockDimPortal("char.portal", ConfigHandler.INT_DIMENSION_CHAR);
		DIM_PORTAL_SHAKURAS = new BlockDimPortal("shakuras.portal", ConfigHandler.INT_DIMENSION_SHAKURAS);
		DIM_PORTAL_SLAYN = new BlockDimPortal("slayn.portal", ConfigHandler.INT_DIMENSION_SLAYN);
		DIM_PORTAL_AIUR = new BlockDimPortal("aiur.portal", ConfigHandler.INT_DIMENSION_AIUR);
		DIM_PORTAL_ZERUS = new BlockDimPortal("zerus.portal", ConfigHandler.INT_DIMENSION_ZERUS);
		DIM_PORTAL_SPACE = new BlockDimPortal("space.portal", ConfigHandler.INT_DIMENSION_SPACE);

		// Overworld Ores
		ORE_COPPER_OW = new BlockOverworldOre("overworld.copper", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_TITANIUM_OW = new BlockOverworldOre("overworld.titanium", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 2).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_URANIUM_OW = new BlockOverworldOre("overworld.uranium", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_MINERAL_OW = new BlockOverworldOre("overworld.mineral", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_RICHMINERAL_OW = new BlockOverworldOre("overworld.richmineral", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_PHOSPHORUS_OW = new BlockOverworldOre("overworld.phosphorus", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);

		// Char
		STONE_CHAR = new StarcraftBlockCustomDrop("char.stone", RegistryType.FULL, Material.ROCK, MapColor.BLACK, new ItemStack(COBBLESTONE_CHAR)).setBlockHarvestLevel("pickaxe", 0).setHardness(1.5f).setResistance(10).setCreativeTab(StarcraftCreativeTabs.MISC);
		COBBLESTONE_CHAR = new StarcraftBlock("char.cobblestone", RegistryType.FULL, Material.ROCK, MapColor.BLACK).setBlockHarvestLevel("pickaxe", 0).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(2).setResistance(10);
		FARMLAND_CHAR = new BlockCharFarmland();
		DIRT_CHAR = new BlockStarcraftDirt("char.dirt", MapColor.BLACK, FARMLAND_CHAR.getDefaultState());
		GRAVEL_CHAR = new BlockStarcraftGravel("char.gravel", RegistryType.FULL, Material.GROUND, MapColor.BLACK, 0x000000).setSoundType(SoundType.GROUND).setHardness(0.6f).setResistance(1).setCreativeTab(StarcraftCreativeTabs.MISC);
		MAGMA_CHAR = new BlockMagma("char.magma");

		// Char Ores
		ORE_COAL_CHAR = new BlockCharOre("char.coal", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 0).setBlockHarvestLevel("pickaxe", 0).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_COPPER_CHAR = new BlockCharOre("char.copper", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_DIAMOND_CHAR = new BlockCharOre("char.diamond", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 2).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_GOLD_CHAR = new BlockCharOre("char.gold", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 2).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_IRON_CHAR = new BlockCharOre("char.iron", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_LAPIS_CHAR = new BlockCharOre("char.lapis", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_MINERAL_CHAR = new BlockCharOre("char.mineral", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_RICHMINERAL_CHAR = new BlockCharOre("char.richmineral", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_REDSTONE_CHAR = new OreStarcraftRedstone("char.redstone", MapColor.BLACK).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_TITANIUM_CHAR = new BlockCharOre("char.titanium", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 2).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_URANIUM_CHAR = new BlockCharOre("char.uranium", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_PHOSPHORUS_CHAR = new BlockCharOre("char.phosphorus", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ASH_CHAR = new BlockAsh();
	}

	public static void register(Block block) {
		blocks.add(block);
	}

	public static void register(ItemBlock item) {
		items.add(item);
	}

	/**
	 * Registers the block specified as well as an item block that represents the block.
	 * 
	 * @param block
	 *            The block to register
	 */
	public static void registerFullBlock(Block block) {
		register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		register(item);
	}

	/**
	 * Registers the block specified as well as a custom specified item block that represents the block.
	 * 
	 * @param block
	 *            The block to register
	 * @param item
	 *            The item block to link to this block
	 */
	public static void registerBlockWithItemBlock(Block block, ItemBlock item) {
		register(block);
		item.setRegistryName(block.getRegistryName());
		register(item);
	}

	/**
	 * Used for registry.
	 * 
	 * @return The list of blocks to be registered
	 */
	public static Block[] getBlocks() {
		if (blocks == null)
			init();
		return blocks.toArray(new Block[blocks.size()]);
	}

	/**
	 * Used for registry.
	 * 
	 * @return The list of item blocks to be registered
	 */
	public static ItemBlock[] getItems() {
		if (items == null)
			init();
		return items.toArray(new ItemBlock[items.size()]);
	}
}