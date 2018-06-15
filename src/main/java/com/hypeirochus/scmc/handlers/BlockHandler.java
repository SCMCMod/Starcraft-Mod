package com.hypeirochus.scmc.handlers;

import java.util.ArrayList;
import java.util.List;

import com.hypeirochus.scmc.blocks.BlockAsh;
import com.hypeirochus.scmc.blocks.BlockCharFarmland;
import com.hypeirochus.scmc.blocks.BlockCharOre;
import com.hypeirochus.scmc.blocks.BlockDimPortal;
import com.hypeirochus.scmc.blocks.BlockEntitySpawner;
import com.hypeirochus.scmc.blocks.BlockMagma;
import com.hypeirochus.scmc.blocks.BlockOverworldOre;
import com.hypeirochus.scmc.blocks.BlockPlanetTeleporter;
import com.hypeirochus.scmc.blocks.BlockProtossEnergyChannel;
import com.hypeirochus.scmc.blocks.BlockProtossEnergyChannelDark;
import com.hypeirochus.scmc.blocks.BlockProtossEnergyChannelVoid;
import com.hypeirochus.scmc.blocks.BlockProtossEnergyStabilizer;
import com.hypeirochus.scmc.blocks.BlockProtossEnergyStabilizerDark;
import com.hypeirochus.scmc.blocks.BlockProtossEnergyStabilizerVoid;
import com.hypeirochus.scmc.blocks.BlockProtossFurnace;
import com.hypeirochus.scmc.blocks.BlockProtossShield;
import com.hypeirochus.scmc.blocks.BlockProtossWormhole;
import com.hypeirochus.scmc.blocks.BlockShakurasFarmland;
import com.hypeirochus.scmc.blocks.BlockShakurasOre;
import com.hypeirochus.scmc.blocks.BlockSlaynFarmland;
import com.hypeirochus.scmc.blocks.BlockSlaynOre;
import com.hypeirochus.scmc.blocks.BlockSolarCore;
import com.hypeirochus.scmc.blocks.BlockTerrazineGas;
import com.hypeirochus.scmc.blocks.BlockVespeneGas;
import com.hypeirochus.scmc.blocks.BlockZergCreep;
import com.hypeirochus.scmc.blocks.BlockZergKeratin;
import com.hypeirochus.scmc.blocks.BlockZerusFarmland;
import com.hypeirochus.scmc.blocks.BlockZerusOre;
import com.hypeirochus.scmc.blocks.OreStarcraftRedstone;
import com.hypeirochus.scmc.blocks.ProtossPowerCoreBlock;
import com.hypeirochus.scmc.blocks.RegistryType;
import com.hypeirochus.scmc.blocks.StarcraftBlock;
import com.hypeirochus.scmc.blocks.StarcraftBlockCustomDrop;
import com.hypeirochus.scmc.blocks.StarcraftBlockFalling;
import com.hypeirochus.scmc.blocks.StarcraftDirt;
import com.hypeirochus.scmc.blocks.StarcraftFurnace;
import com.hypeirochus.scmc.blocks.StarcraftGrass;
import com.hypeirochus.scmc.blocks.StarcraftGravel;
import com.hypeirochus.scmc.blocks.StarcraftProtossCoreBlock;
import com.hypeirochus.scmc.blocks.StarcraftSkull;
import com.hypeirochus.scmc.blocks.flora.BlockBrambles;
import com.hypeirochus.scmc.blocks.flora.BlockZerusGlowPod;
import com.hypeirochus.scmc.blocks.flora.BlockZerusLightcap;
import com.hypeirochus.scmc.blocks.fluid.BlockAcid;
import com.hypeirochus.scmc.blocks.fluid.BlockBlood;
import com.hypeirochus.scmc.blocks.fluid.BlockTar;
import com.hypeirochus.scmc.blocks.fluid.BlockTerrazine;
import com.hypeirochus.scmc.blocks.fluid.BlockVespene;
import com.hypeirochus.scmc.blocks.items.ItemBlockBrambles;
import com.hypeirochus.scmc.blocks.items.ItemBlockStarcraftSkull;
import com.hypeirochus.scmc.blocks.metablocks.BlockEnergy;
import com.hypeirochus.scmc.blocks.metablocks.BlockGasCollector;
import com.hypeirochus.scmc.blocks.metablocks.BlockKhaydarinCrystal;
import com.hypeirochus.scmc.blocks.metablocks.BlockMineral;
import com.hypeirochus.scmc.blocks.metablocks.BlockNeosteel;
import com.hypeirochus.scmc.blocks.metablocks.BlockParisteel;
import com.hypeirochus.scmc.blocks.metablocks.BlockPlanetSurface;
import com.hypeirochus.scmc.blocks.metablocks.BlockProtossMetalT1;
import com.hypeirochus.scmc.blocks.metablocks.BlockProtossMetalT2;
import com.hypeirochus.scmc.blocks.metablocks.BlockProtossMetalT3;
import com.hypeirochus.scmc.blocks.metablocks.BlockStarSurface;
import com.hypeirochus.scmc.blocks.metablocks.BlockTerranMetal;
import com.hypeirochus.scmc.blocks.metablocks.BlockZergCarapace;
import com.hypeirochus.scmc.blocks.metablocks.BlockZergFlesh;
import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.enums.EnumWorldType;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BlockHandler {

	public static List<Block> blocks;
	public static List<ItemBlock> items;

	// Fluids
	public static Block ACID;
	public static Block BLOOD;
	public static Block VESPENE;
	public static Block TERRAZINE;
	public static Block TAR;

	// Misc
	public static Block ENTITY_SPAWNER;
	public static Block PLANET_TELEPORTER;
	public static Block SOLAR_CORE;
	public static Block STARCRAFT_SKULL;
	public static Block ENERGY_BLOCK;
	public static Block COMP_MINERAL;
	public static Block GAS_COLLECTOR;
	public static Block STAR_SURFACE;
	public static Block PLANET_SURFACE;
	public static Block LIGHT_SOURCE;

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
	public static Block COBBLESTONE_CHAR;
	public static Block STONE_CHAR;
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
	public static Block STONE_SHAKURAS;
	public static Block FARMLAND_SHAKURAS;
	public static Block DIRT_SHAKURAS;
	public static Block SAND_SHAKURAS;
	public static Block GRAVEL_SHAKURAS;

	// Shakuras Ores
	public static Block ORE_COAL_SHAKURAS;
	public static Block ORE_COPPER_SHAKURAS;
	public static Block ORE_DIAMOND_SHAKURAS;
	public static Block ORE_GOLD_SHAKURAS;
	public static Block ORE_IRON_SHAKURAS;
	public static Block ORE_LAPIS_SHAKURAS;
	public static Block ORE_MINERAL_SHAKURAS;
	public static Block ORE_PHOSPHORUS_SHAKURAS;
	public static Block ORE_REDSTONE_SHAKURAS;
	public static Block ORE_RICHMINERAL_SHAKURAS;
	public static Block ORE_URANIUM_SHAKURAS;
	public static Block ORE_TITANIUM_SHAKURAS;

	// Zerus
	public static Block COBBLESTONE_ZERUS;
	public static Block STONE_ZERUS;
	public static Block FARMLAND_ZERUS;
	public static Block DIRT_ZERUS;
	public static Block GRASS_ZERUS;
	public static Block SAND_ZERUS;
	public static Block GRAVEL_ZERUS;

	// Zerus Ores
	public static Block ORE_COAL_ZERUS;
	public static Block ORE_COPPER_ZERUS;
	public static Block ORE_DIAMOND_ZERUS;
	public static Block ORE_GOLD_ZERUS;
	public static Block ORE_IRON_ZERUS;
	public static Block ORE_LAPIS_ZERUS;
	public static Block ORE_MINERAL_ZERUS;
	public static Block ORE_PHOSPHORUS_ZERUS;
	public static Block ORE_REDSTONE_ZERUS;
	public static Block ORE_RICHMINERAL_ZERUS;
	public static Block ORE_URANIUM_ZERUS;
	public static Block ORE_TITANIUM_ZERUS;

	// Slayn
	public static Block COBBLESTONE_SLAYN;
	public static Block STONE_SLAYN;
	public static Block FARMLAND_SLAYN;
	public static Block DIRT_SLAYN;
	public static Block SAND_SLAYN;
	public static Block GRAVEL_SLAYN;
	// public static Block MAGMA_SLAYN;

	// Slayn Ores
	public static Block ORE_COAL_SLAYN;
	public static Block ORE_IRON_SLAYN;
	public static Block ORE_GOLD_SLAYN;
	public static Block ORE_DIAMOND_SLAYN;
	public static Block ORE_LAPIS_SLAYN;
	public static Block ORE_REDSTONE_SLAYN;
	public static Block ORE_COPPER_SLAYN;
	public static Block ORE_TITANIUM_SLAYN;
	public static Block ORE_PHOSPHORUS_SLAYN;
	public static Block ORE_URANIUM_SLAYN;
	public static Block ORE_MINERAL_SLAYN;
	public static Block ORE_RICHMINERAL_SLAYN;

	// Korhal
	public static Block CITY_STONE_KORHAL;

	// Furnaces
	public static StarcraftFurnace FURNACE_SHAKURAS;
	public static StarcraftFurnace FURNACE_CHAR;
	public static StarcraftFurnace FURNACE_SLAYN;
	public static StarcraftFurnace FURNACE_ZERUS;
	public static Block FURNACE_PROTOSS;

	// Protoss
	public static Block PROTOSS_SHIELD;
	public static Block PROTOSS_ENERGY_CHANNEL;
	public static Block PROTOSS_ENERGY_STABILIZER;
	public static Block PROTOSS_VOID_ENERGY_CHANNEL;
	public static Block PROTOSS_VOID_ENERGY_STABILIZER;
	public static Block PROTOSS_DARK_ENERGY_CHANNEL;
	public static Block PROTOSS_DARK_ENERGY_STABILIZER;
	public static Block PROTOSS_WORMHOLE;
	public static Block PROTOSS_METAL_T1;
	public static Block PROTOSS_METAL_T2;
	public static Block PROTOSS_METAL_T3;
	public static Block PYLON_CRYSTAL;

	// Protoss Cores
	public static Block CORE_CYBERNETICSCORE_DARK;
	public static Block CORE_CYBERNETICSCORE_KHALAI;
	public static Block CORE_CYBERNETICSCORE_VOID;
	public static Block CORE_PYLON_DARK;
	public static Block CORE_PYLON_KHALAI;
	public static Block CORE_PYLON_VOID;
	public static Block CORE_WARPGATE_DARK;
	public static Block CORE_WARPGATE_KHALAI;
	public static Block CORE_WARPGATE_VOID;

	// Terran
	public static Block TERRAN_WARNING_TAPE;
	public static Block TERRAN_METAL;
	public static Block NEOSTEEL_METAL;
	public static Block PARISTEEL_METAL;

	// Terran Cores
	public static Block CORE_BARRACKS;
	public static Block CORE_COMMANDCENTER;

	// Zerg
	public static Block ZERG_CREEP;
	public static Block KERATIN_CHUNK;
	public static Block ZERG_CARAPACE_BLOCK;
	public static Block ZERG_FLESH;

	// Gasses
	public static Block GAS_VESPENE;
	public static Block GAS_TERRAZINE;

	// Flora
	public static Block FLORA_ZERUS_GLOW_POD;
	public static Block FLORA_BRAMBLES;
	public static Block FLORA_ZERUS_LIGHTCAP;

	// Stairs

	// Slabs

	private static void init() {
		blocks = new ArrayList<Block>();
		items = new ArrayList<ItemBlock>();
		MaterialHandler.init();

		instantiate();

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			RenderHandler.createStateMappers();
		}
	}

	private static void instantiate() {

		// Fluids
		ACID = new BlockAcid().setCreativeTab(null);
		BLOOD = new BlockBlood().setCreativeTab(null);
		TAR = new BlockTar().setCreativeTab(null);
		TERRAZINE = new BlockTerrazine().setCreativeTab(null);
		VESPENE = new BlockVespene().setCreativeTab(null);

		// Misc
		ENTITY_SPAWNER = new BlockEntitySpawner("block.entityspawner", 5);
		PLANET_TELEPORTER = new BlockPlanetTeleporter("block.planetteleporter", 100);
		SOLAR_CORE = new BlockSolarCore("block.solarcore", 100);
		STARCRAFT_SKULL = new StarcraftSkull();
		BlockHandler.registerBlockWithItemBlock(STARCRAFT_SKULL, new ItemBlockStarcraftSkull());
		ENERGY_BLOCK = new BlockEnergy();
		COMP_MINERAL = new BlockMineral();
		GAS_COLLECTOR = new BlockGasCollector();
		STAR_SURFACE = new BlockStarSurface();
		PLANET_SURFACE = new BlockPlanetSurface();

		// Portals
		DIM_PORTAL_OVERWORLD = new BlockDimPortal("overworld.portal", 0);
		DIM_PORTAL_KORHAL = new BlockDimPortal("korhal.portal", StarcraftConfig.INT_DIMENSION_KORHAL);
		DIM_PORTAL_KALDIR = new BlockDimPortal("kaldir.portal", StarcraftConfig.INT_DIMENSION_KALDIR);
		DIM_PORTAL_CHAR = new BlockDimPortal("char.portal", StarcraftConfig.INT_DIMENSION_CHAR);
		DIM_PORTAL_SHAKURAS = new BlockDimPortal("shakuras.portal", StarcraftConfig.INT_DIMENSION_SHAKURAS);
		DIM_PORTAL_SLAYN = new BlockDimPortal("slayn.portal", StarcraftConfig.INT_DIMENSION_SLAYN);
		DIM_PORTAL_AIUR = new BlockDimPortal("aiur.portal", StarcraftConfig.INT_DIMENSION_AIUR);
		DIM_PORTAL_ZERUS = new BlockDimPortal("zerus.portal", StarcraftConfig.INT_DIMENSION_ZERUS);
		DIM_PORTAL_SPACE = new BlockDimPortal("space.portal", StarcraftConfig.INT_DIMENSION_SPACE);

		// Overworld Ores
		ORE_COPPER_OW = new BlockOverworldOre("overworld.copper", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_TITANIUM_OW = new BlockOverworldOre("overworld.titanium", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 2).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_URANIUM_OW = new BlockOverworldOre("overworld.uranium", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_MINERAL_OW = new BlockOverworldOre("overworld.mineral", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_RICHMINERAL_OW = new BlockOverworldOre("overworld.richmineral", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_PHOSPHORUS_OW = new BlockOverworldOre("overworld.phosphorus", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);

		// Char
		COBBLESTONE_CHAR = new StarcraftBlock("char.cobblestone", RegistryType.FULL, Material.ROCK, MapColor.BLACK).setBlockHarvestLevel("pickaxe", 0).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(2).setResistance(10);
		STONE_CHAR = new StarcraftBlockCustomDrop("char.stone", RegistryType.FULL, Material.ROCK, MapColor.BLACK, new ItemStack(COBBLESTONE_CHAR)).setBlockHarvestLevel("pickaxe", 0).setHardness(1.5f).setResistance(10).setCreativeTab(StarcraftCreativeTabs.MISC);
		FARMLAND_CHAR = new BlockCharFarmland();
		DIRT_CHAR = new StarcraftDirt("char.dirt", MapColor.BLACK, FARMLAND_CHAR.getDefaultState());
		GRAVEL_CHAR = new StarcraftGravel("char.gravel", RegistryType.FULL, Material.GROUND, MapColor.BLACK, 0x000000).setSoundType(SoundType.GROUND).setHardness(0.6f).setResistance(1).setCreativeTab(StarcraftCreativeTabs.MISC);
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

		// Shakuras
		COBBLESTONE_SHAKURAS = new StarcraftBlock("shakuras.cobblestone", RegistryType.FULL, Material.ROCK, MapColor.BLUE).setBlockHarvestLevel("pickaxe", 0).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(2).setResistance(10);
		STONE_SHAKURAS = new StarcraftBlockCustomDrop("shakuras.stone", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, new ItemStack(COBBLESTONE_SHAKURAS)).setHardness(1.5f).setResistance(10).setCreativeTab(StarcraftCreativeTabs.MISC);
		FARMLAND_SHAKURAS = new BlockShakurasFarmland();
		DIRT_SHAKURAS = new StarcraftDirt("shakuras.dirt", MapColor.LIGHT_BLUE, FARMLAND_SHAKURAS.getDefaultState());
		GRAVEL_SHAKURAS = new StarcraftGravel("shakuras.gravel", RegistryType.FULL, Material.GROUND, MapColor.LIGHT_BLUE, 0x55539B).setSoundType(SoundType.GROUND).setHardness(0.6f).setResistance(1).setCreativeTab(StarcraftCreativeTabs.MISC);
		SAND_SHAKURAS = new StarcraftBlockFalling("shakuras.sand", RegistryType.FULL, Material.SAND, MapColor.LIGHT_BLUE, 6724056).setSoundType(SoundType.SAND).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0.5f).setResistance(0.83f);

		// Shakuras Ores
		ORE_COAL_SHAKURAS = new BlockShakurasOre("shakuras.coal", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 0).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_COPPER_SHAKURAS = new BlockShakurasOre("shakuras.copper", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_DIAMOND_SHAKURAS = new BlockShakurasOre("shakuras.diamond", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_GOLD_SHAKURAS = new BlockShakurasOre("shakuras.gold", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_IRON_SHAKURAS = new BlockShakurasOre("shakuras.iron", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_LAPIS_SHAKURAS = new BlockShakurasOre("shakuras.lapis", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_MINERAL_SHAKURAS = new BlockShakurasOre("shakuras.mineral", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_RICHMINERAL_SHAKURAS = new BlockShakurasOre("shakuras.richmineral", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_REDSTONE_SHAKURAS = new OreStarcraftRedstone("shakuras.redstone", MapColor.LIGHT_BLUE).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_TITANIUM_SHAKURAS = new BlockShakurasOre("shakuras.titanium", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_URANIUM_SHAKURAS = new BlockShakurasOre("shakuras.uranium", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_PHOSPHORUS_SHAKURAS = new BlockShakurasOre("shakuras.phosphorus", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);

		// Zerus
		COBBLESTONE_ZERUS = new StarcraftBlock("zerus.cobblestone", RegistryType.FULL, Material.ROCK, MapColor.BROWN).setBlockHarvestLevel("pickaxe", 0).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(2).setResistance(10);
		STONE_ZERUS = new StarcraftBlockCustomDrop("zerus.stone", RegistryType.FULL, Material.ROCK, MapColor.BROWN, new ItemStack(COBBLESTONE_ZERUS)).setHardness(1.5f).setResistance(10).setCreativeTab(StarcraftCreativeTabs.MISC);
		FARMLAND_ZERUS = new BlockZerusFarmland();
		DIRT_ZERUS = new StarcraftDirt("zerus.dirt", MapColor.BROWN, FARMLAND_ZERUS.getDefaultState());
		GRASS_ZERUS = new StarcraftGrass("zerus.grass", MapColor.GRASS, DIRT_ZERUS.getDefaultState());
		GRAVEL_ZERUS = new StarcraftGravel("zerus.gravel", RegistryType.FULL, Material.GROUND, MapColor.BROWN, 0x55539B).setSoundType(SoundType.GROUND).setHardness(0.6f).setResistance(1).setCreativeTab(StarcraftCreativeTabs.MISC);
		SAND_ZERUS = new StarcraftBlockFalling("zerus.sand", RegistryType.FULL, Material.SAND, MapColor.BROWN, 6724056).setSoundType(SoundType.SAND).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0.5f).setResistance(0.83f);

		// Zerus ores
		ORE_COAL_ZERUS = new BlockZerusOre("zerus.coal", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 0).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_COPPER_ZERUS = new BlockZerusOre("zerus.copper", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_DIAMOND_ZERUS = new BlockZerusOre("zerus.diamond", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_GOLD_ZERUS = new BlockZerusOre("zerus.gold", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_IRON_ZERUS = new BlockZerusOre("zerus.iron", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_LAPIS_ZERUS = new BlockZerusOre("zerus.lapis", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_MINERAL_ZERUS = new BlockZerusOre("zerus.mineral", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_RICHMINERAL_ZERUS = new BlockZerusOre("zerus.richmineral", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_REDSTONE_ZERUS = new OreStarcraftRedstone("zerus.redstone", MapColor.BROWN).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_TITANIUM_ZERUS = new BlockZerusOre("zerus.titanium", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_URANIUM_ZERUS = new BlockZerusOre("zerus.uranium", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_PHOSPHORUS_ZERUS = new BlockZerusOre("zerus.phosphorus", RegistryType.FULL, Material.ROCK, MapColor.BROWN, 1).setCreativeTab(StarcraftCreativeTabs.MISC);

		// Slayn
		COBBLESTONE_SLAYN = new StarcraftBlock("slayn.cobblestone", RegistryType.FULL, Material.ROCK, MapColor.BLACK).setBlockHarvestLevel("pickaxe", 0).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(2).setResistance(10);
		STONE_SLAYN = new StarcraftBlockCustomDrop("slayn.stone", RegistryType.FULL, Material.ROCK, MapColor.BLACK, new ItemStack(COBBLESTONE_SLAYN)).setBlockHarvestLevel("pickaxe", 0).setHardness(1.5f).setResistance(10).setCreativeTab(StarcraftCreativeTabs.MISC);
		FARMLAND_SLAYN = new BlockSlaynFarmland();
		DIRT_SLAYN = new StarcraftDirt("slayn.dirt", MapColor.BLACK, FARMLAND_SLAYN.getDefaultState());
		SAND_SLAYN = new StarcraftBlockFalling("slayn.sand", RegistryType.FULL, Material.SAND, MapColor.BLACK, 6724056).setSoundType(SoundType.SAND).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0.5f).setResistance(0.83f);
		GRAVEL_SLAYN = new StarcraftGravel("slayn.gravel", RegistryType.FULL, Material.GROUND, MapColor.BLACK, 0x000000).setSoundType(SoundType.GROUND).setHardness(0.6f).setResistance(1).setCreativeTab(StarcraftCreativeTabs.MISC);

		// Slayn Ores
		ORE_COAL_SLAYN = new BlockSlaynOre("slayn.coal", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 0).setBlockHarvestLevel("pickaxe", 0).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_COPPER_SLAYN = new BlockSlaynOre("slayn.copper", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_DIAMOND_SLAYN = new BlockSlaynOre("slayn.diamond", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 2).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_GOLD_SLAYN = new BlockSlaynOre("slayn.gold", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 2).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_IRON_SLAYN = new BlockSlaynOre("slayn.iron", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_LAPIS_SLAYN = new BlockSlaynOre("slayn.lapis", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_MINERAL_SLAYN = new BlockSlaynOre("slayn.mineral", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_RICHMINERAL_SLAYN = new BlockSlaynOre("slayn.richmineral", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_REDSTONE_SLAYN = new OreStarcraftRedstone("slayn.redstone", MapColor.BLACK).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_TITANIUM_SLAYN = new BlockSlaynOre("slayn.titanium", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 2).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_URANIUM_SLAYN = new BlockSlaynOre("slayn.uranium", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_PHOSPHORUS_SLAYN = new BlockSlaynOre("slayn.phosphorus", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setBlockHarvestLevel("pickaxe", 1).setCreativeTab(StarcraftCreativeTabs.MISC);

		// Korhal
		CITY_STONE_KORHAL = new StarcraftBlock("korhal.stone.city", RegistryType.FULL, Material.ROCK, MapColor.BLACK).setBlockHarvestLevel("pickaxe", 0).setHardness(1.5f).setResistance(10.0f).setCreativeTab(StarcraftCreativeTabs.MISC);

		// Furnaces
		FURNACE_SHAKURAS = new StarcraftFurnace(MapColor.LIGHT_BLUE, EnumWorldType.SHAKURAS);
		FURNACE_CHAR = new StarcraftFurnace(MapColor.BLACK, EnumWorldType.CHAR);
		FURNACE_SLAYN = new StarcraftFurnace(MapColor.BLACK, EnumWorldType.SLAYN);
		FURNACE_ZERUS = new StarcraftFurnace(MapColor.BROWN, EnumWorldType.ZERUS);
		FURNACE_PROTOSS = new BlockProtossFurnace();

		// Protoss
		PROTOSS_SHIELD = new BlockProtossShield();
		PROTOSS_VOID_ENERGY_CHANNEL = new BlockProtossEnergyChannelVoid();
		PROTOSS_VOID_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerVoid();
		PROTOSS_ENERGY_CHANNEL = new BlockProtossEnergyChannel();
		PROTOSS_ENERGY_STABILIZER = new BlockProtossEnergyStabilizer();
		PROTOSS_DARK_ENERGY_CHANNEL = new BlockProtossEnergyChannelDark();
		PROTOSS_DARK_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerDark();
		PROTOSS_WORMHOLE = new BlockProtossWormhole();
		PROTOSS_METAL_T1 = new BlockProtossMetalT1();
		PROTOSS_METAL_T2 = new BlockProtossMetalT2();
		PROTOSS_METAL_T3 = new BlockProtossMetalT3();
		PYLON_CRYSTAL = new BlockKhaydarinCrystal();

		// Protoss Cores
		CORE_CYBERNETICSCORE_VOID = new StarcraftProtossCoreBlock("protoss.cyberneticscorecore.void", RegistryType.FULL, Material.IRON, MapColor.GREEN).setDomeSize(-5, 24, 24, 3);
		CORE_CYBERNETICSCORE_DARK = new StarcraftProtossCoreBlock("protoss.cyberneticscorecore.dark", RegistryType.FULL, Material.IRON, MapColor.BLACK).setDomeSize(-5, 24, 24, 3);
		CORE_CYBERNETICSCORE_KHALAI = new StarcraftProtossCoreBlock("protoss.cyberneticscorecore.khalai", RegistryType.FULL, Material.IRON, MapColor.YELLOW).setDomeSize(-5, 24, 24, 3);
		CORE_PYLON_VOID = new ProtossPowerCoreBlock("protoss.pyloncore.void", Material.IRON, MapColor.GREEN).setDomeSize(-10, 16, 10, 6);
		CORE_PYLON_DARK = new ProtossPowerCoreBlock("protoss.pyloncore.dark", Material.IRON, MapColor.BLACK).setDomeSize(-10, 16, 10, 6);
		CORE_PYLON_KHALAI = new ProtossPowerCoreBlock("protoss.pyloncore.khalai", Material.IRON, MapColor.YELLOW).setDomeSize(-10, 16, 10, 6);
		CORE_WARPGATE_VOID = new StarcraftProtossCoreBlock("protoss.warpgatecore.void", RegistryType.FULL, Material.IRON, MapColor.GREEN).setDomeSize(-5, 16, 13, 3);
		CORE_WARPGATE_DARK = new StarcraftProtossCoreBlock("protoss.warpgatecore.dark", RegistryType.FULL, Material.IRON, MapColor.BLACK).setDomeSize(-5, 16, 13, 3);
		CORE_WARPGATE_KHALAI = new StarcraftProtossCoreBlock("protoss.warpgatecore.khalai", RegistryType.FULL, Material.IRON, MapColor.YELLOW).setDomeSize(-5, 16, 13, 3);

		// Terran
		TERRAN_WARNING_TAPE = new StarcraftBlock("terran.warningtape", RegistryType.FULL, Material.IRON, MapColor.YELLOW).setSoundType(SoundType.METAL).setHardness(3.5f).setResistance(10.0f).setCreativeTab(StarcraftCreativeTabs.TERRAN);
		TERRAN_METAL = new BlockTerranMetal();
		NEOSTEEL_METAL = new BlockNeosteel();
		PARISTEEL_METAL = new BlockParisteel();

		// Terran Cores
		CORE_BARRACKS = new StarcraftBlock("terran.barrackscore", RegistryType.FULL, Material.IRON, MapColor.BLUE).setBlockHarvestLevel("pickaxe", 2).setHardness(15.0F).setResistance(15.0F).setCreativeTab(StarcraftCreativeTabs.TERRAN);
		CORE_COMMANDCENTER = new StarcraftBlock("terran.commandcentercore", RegistryType.FULL, Material.IRON, MapColor.BLUE).setBlockHarvestLevel("pickaxe", 2).setHardness(15.0F).setResistance(15.0F).setCreativeTab(StarcraftCreativeTabs.TERRAN);

		// Zerg
		ZERG_CREEP = new BlockZergCreep();
		KERATIN_CHUNK = new BlockZergKeratin();
		ZERG_CARAPACE_BLOCK = new BlockZergCarapace();
		ZERG_FLESH = new BlockZergFlesh();

		// Gasses
		GAS_VESPENE = new BlockVespeneGas();
		GAS_TERRAZINE = new BlockTerrazineGas();

		// Flora
		FLORA_ZERUS_GLOW_POD = new BlockZerusGlowPod();
		FLORA_BRAMBLES = new BlockBrambles();
		registerBlockWithItemBlock(FLORA_BRAMBLES, new ItemBlockBrambles());
		FLORA_ZERUS_LIGHTCAP = new BlockZerusLightcap();
	}

	/**
	 * Registers a block.
	 * 
	 * @param block
	 *            The block to register
	 */
	public static void register(Block block) {
		blocks.add(block);
	}

	/**
	 * Registers an item block.
	 * 
	 * @param item
	 *            The item block to register
	 */
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