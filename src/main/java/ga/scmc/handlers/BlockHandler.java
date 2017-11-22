package ga.scmc.handlers;

import ga.scmc.blocks.BlockAcidFluid;
import ga.scmc.blocks.BlockAsh;
import ga.scmc.blocks.BlockBloodFluid;
import ga.scmc.blocks.BlockCharMagma;
import ga.scmc.blocks.BlockCharOre;
import ga.scmc.blocks.BlockDimPortalChar;
import ga.scmc.blocks.BlockDimPortalKaldir;
import ga.scmc.blocks.BlockDimPortalKorhal;
import ga.scmc.blocks.BlockDimPortalOverworld;
import ga.scmc.blocks.BlockDimPortalShakuras;
import ga.scmc.blocks.BlockDimPortalSlayn;
import ga.scmc.blocks.BlockEnergy;
import ga.scmc.blocks.BlockFurnaceChar;
import ga.scmc.blocks.BlockFurnaceShakuras;
import ga.scmc.blocks.BlockFurnaceSlayn;
import ga.scmc.blocks.BlockKorhalCityStone;
import ga.scmc.blocks.BlockMovingLightSource;
import ga.scmc.blocks.BlockOverworldOre;
import ga.scmc.blocks.BlockProtossEnergyChannel;
import ga.scmc.blocks.BlockProtossEnergyChannelDark;
import ga.scmc.blocks.BlockProtossEnergyChannelVoid;
import ga.scmc.blocks.BlockProtossEnergyStabilizer;
import ga.scmc.blocks.BlockProtossEnergyStabilizerDark;
import ga.scmc.blocks.BlockProtossEnergyStabilizerVoid;
import ga.scmc.blocks.BlockProtossShield;
import ga.scmc.blocks.BlockProtossWormhole;
import ga.scmc.blocks.BlockShakurasOre;
import ga.scmc.blocks.BlockTerrazineFluid;
import ga.scmc.blocks.BlockTerrazineGas;
import ga.scmc.blocks.BlockTest;
import ga.scmc.blocks.BlockVespeneFluid;
import ga.scmc.blocks.BlockVespeneGas;
import ga.scmc.blocks.BlockVoidEnergy;
import ga.scmc.blocks.BlockZergCreep;
import ga.scmc.blocks.BlockZergKeratin;
import ga.scmc.blocks.OreCharRedstone;
import ga.scmc.blocks.OreShakurasRedstone;
import ga.scmc.blocks.RegistryType;
import ga.scmc.blocks.StarcraftBlock;
import ga.scmc.blocks.StarcraftBlockFalling;
import ga.scmc.blocks.StarcraftProtossCoreBlock;
import ga.scmc.blocks.itemblocks.ItemBlockAsh;
import ga.scmc.blocks.itemblocks.ItemBlockStarcraftSkull;
import ga.scmc.blocks.skulls.BlockStarcraftSkull;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Hold all the mod's normal blocks.
 */
public class BlockHandler {

	public static final Block LIGHT_SOURCE;
	public static final Block TEST;

	public static final Block ASH_CHAR;

	public static final Block COBBLESTONE_CHAR;
	public static final Block COBBLESTONE_SHAKURAS;
	public static final Block CORE_CYBERNETICSCORE_DARK;
	public static final Block CORE_CYBERNETICSCORE_KHALAI;
	public static final Block CORE_CYBERNETICSCORE_VOID;
	public static final Block CORE_PYLON_DARK;
	public static final Block CORE_PYLON_KHALAI;
	public static final Block CORE_PYLON_VOID;
	public static final Block CORE_WARPGATE_DARK;
	public static final Block CORE_WARPGATE_KHALAI;
	public static final Block CORE_WARPGATE_VOID;
	public static final Block CORE_BARRACKS;
	public static final Block DIM_PORTAL_CHAR;
	public static final Block DIM_PORTAL_OVERWORLD;
	public static final Block DIM_PORTAL_SHAKURAS;
	public static final Block DIM_PORTAL_KALDIR;
	public static final Block DIM_PORTAL_KORHAL;
	public static final Block DIM_PORTAL_SLAYN;
	public static final Block DIRT_CHAR;
	public static final Block DIRT_SHAKURAS;
	public static final Block ENERGY_BLOCK;
	public static final Block PROTOSS_WARPGATE_WORMHOLE;

	public static Block FLUID_ACID;
	public static Block FLUID_BLOOD;
	public static Block FLUID_VESPENE;
	public static Block FLUID_TERRAZINE;

	public static final Block GAS_VESPENE;
	public static final Block GAS_TERRAZINE;

	// TODO add the commented out blocks into the game.
	public static final Block GRAVEL_CHAR;
	public static final Block KERATIN_CHUNK;
	public static final Block MAGMA_CHAR;
	// public static final Block ORE_ALIEN_CHAR;
	// public static final Block ORE_ALIEN_SHAKURAS;
	public static final Block ORE_COAL_CHAR;
	public static final Block ORE_COAL_SHAKURAS;
	public static final Block ORE_COPPER_CHAR;
	public static final Block ORE_COPPER_OW;
	public static final Block ORE_COPPER_SHAKURAS;
	public static final Block ORE_DIAMOND_CHAR;
	public static final Block ORE_DIAMOND_SHAKURAS;
	public static final Block ORE_GOLD_CHAR;
	public static final Block ORE_GOLD_SHAKURAS;
	public static final Block ORE_IRON_CHAR;
	public static final Block ORE_IRON_SHAKURAS;
	public static final Block ORE_LAPIS_CHAR;
	public static final Block ORE_LAPIS_SHAKURAS;
	public static final Block ORE_MINERAL_CHAR;
	public static final Block ORE_MINERAL_SHAKURAS;
	public static final Block ORE_PHOSPHORUS_CHAR;
	public static final Block ORE_PHOSPHORUS_SHAKURAS;
	public static final Block ORE_REDSTONE_CHAR;
	public static final Block ORE_REDSTONE_LIT_CHAR;
	public static final Block ORE_REDSTONE_SHAKURAS;
	public static final Block ORE_REDSTONE_LIT_SHAKURAS;
	public static final Block ORE_RICHMINERAL_CHAR;
	public static final Block ORE_RICHMINERAL_SHAKURAS;
	public static final Block ORE_URANIUM_CHAR;
	public static final Block ORE_URANIUM_SHAKURAS;
	public static final Block ORE_TITANIUM_CHAR;
	public static final Block ORE_TITANIUM_OW;
	public static final Block ORE_TITANIUM_SHAKURAS;
	public static final Block PROTOSS_DARK_ENERGY_CHANNEL;
	public static final Block PROTOSS_DARK_ENERGY_STABILIZER;
	public static final Block PROTOSS_ENERGY_CHANNEL;
	public static final Block PROTOSS_ENERGY_STABILIZER;
	public static final Block PROTOSS_SHIELD;
	public static final Block PROTOSS_VOID_ENERGY_CHANNEL;
	public static final Block PROTOSS_VOID_ENERGY_STABILIZER;
	public static final Block SAND_SHAKURAS;
	public static final Block GRAVEL_SHAKURAS;
	public static final Block STONE_CHAR;
	public static final Block STONE_SHAKURAS;
	public static final Block FROZEN_STONE_KALDIR;
	public static final Block FURNACE_SHAKURAS;
	public static final Block LIT_FURNACE_SHAKURAS;
	public static final Block FURNACE_CHAR;
	public static final Block LIT_FURNACE_CHAR;
	public static final Block FURNACE_SLAYN;
	public static final Block LIT_FURNACE_SLAYN;
	public static final Block VOID_ENERGY;
	public static final Block ZERG_CREEP;
	public static final Block STARCRAFT_SKULL;

	public static final Block CITY_STONE_KORHAL;

	public static final Block SAND_SLAYN;
	public static final Block STONE_SLAYN;
	public static final Block DIRT_SLAYN;
	public static final Block COBBLESTONE_SLAYN;
	public static final Block GRAVEL_SLAYN;

	/**
	 * Instantiates, registers, and initializes the MetaBlocks.
	 */
	public static void preInit() {
		instantiateFluids();
		register();
		MetaBlockHandler.init();
	}

	public static void instantiateFluids() {
		FLUID_ACID = new BlockAcidFluid();
		FLUID_BLOOD = new BlockBloodFluid();
		FLUID_VESPENE = new BlockVespeneFluid();
		FLUID_TERRAZINE = new BlockTerrazineFluid();
	}

	static {
		/** portals **/
		DIM_PORTAL_OVERWORLD = new BlockDimPortalOverworld();
		DIM_PORTAL_KORHAL = new BlockDimPortalKorhal();
		DIM_PORTAL_SLAYN = new BlockDimPortalSlayn();
		DIM_PORTAL_KALDIR = new BlockDimPortalKaldir();

		/** overworld blocks **/
		ORE_COPPER_OW = new BlockOverworldOre("overworld.copper", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_TITANIUM_OW = new BlockOverworldOre("overworld.titanium", RegistryType.FULL, Material.ROCK, MapColor.GRAY, 2).setCreativeTab(StarcraftCreativeTabs.MISC);

		/** char blocks **/
		ORE_COAL_CHAR = new BlockCharOre("char.coal", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 0).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_COPPER_CHAR = new BlockCharOre("char.copper", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_DIAMOND_CHAR = new BlockCharOre("char.diamond", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_GOLD_CHAR = new BlockCharOre("char.gold", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_IRON_CHAR = new BlockCharOre("char.iron", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_LAPIS_CHAR = new BlockCharOre("char.lapis", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_MINERAL_CHAR = new BlockCharOre("char.mineral", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_REDSTONE_CHAR = new OreCharRedstone(false);
		ORE_REDSTONE_LIT_CHAR = new OreCharRedstone(true);
		ORE_RICHMINERAL_CHAR = new BlockCharOre("char.richmineral", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_TITANIUM_CHAR = new BlockCharOre("char.titanium", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_URANIUM_CHAR = new BlockCharOre("char.uranium", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_PHOSPHORUS_CHAR = new BlockCharOre("char.phosphorus", RegistryType.FULL, Material.ROCK, MapColor.BLACK, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		DIRT_CHAR = new StarcraftBlock("char.dirt", RegistryType.FULL, Material.ROCK, MapColor.BLACK).setBlockSoundType(SoundType.GROUND).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0).setResistance(0);
		STONE_CHAR = new StarcraftBlock("char.stone", RegistryType.FULL, Material.GROUND, MapColor.BLACK).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0).setResistance(0);
		GRAVEL_CHAR = new StarcraftBlockFalling("char.gravel", RegistryType.FULL, Material.SAND, MapColor.BLACK, 0x000000).setBlockSoundType(SoundType.GROUND).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0).setResistance(0);
		COBBLESTONE_CHAR = new StarcraftBlock("char.cobblestone", RegistryType.FULL, Material.ROCK, MapColor.BLACK).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0).setResistance(0);
		MAGMA_CHAR = new BlockCharMagma();
		ASH_CHAR = new BlockAsh();
		DIM_PORTAL_CHAR = new BlockDimPortalChar();

		/** shakuras blocks **/
		ORE_COAL_SHAKURAS = new BlockShakurasOre("shakuras.coal", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 0).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_COPPER_SHAKURAS = new BlockShakurasOre("shakuras.copper", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_DIAMOND_SHAKURAS = new BlockShakurasOre("shakuras.diamond", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_GOLD_SHAKURAS = new BlockShakurasOre("shakuras.gold", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_IRON_SHAKURAS = new BlockShakurasOre("shakuras.iron", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_LAPIS_SHAKURAS = new BlockShakurasOre("shakuras.lapis", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_MINERAL_SHAKURAS = new BlockShakurasOre("shakuras.mineral", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_REDSTONE_SHAKURAS = new OreShakurasRedstone(false);
		ORE_REDSTONE_LIT_SHAKURAS = new OreShakurasRedstone(true);
		ORE_RICHMINERAL_SHAKURAS = new BlockShakurasOre("shakuras.richmineral", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_TITANIUM_SHAKURAS = new BlockShakurasOre("shakuras.titanium", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 2).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_URANIUM_SHAKURAS = new BlockShakurasOre("shakuras.uranium", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		ORE_PHOSPHORUS_SHAKURAS = new BlockShakurasOre("shakuras.phosphorus", RegistryType.FULL, Material.ROCK, MapColor.LIGHT_BLUE, 1).setCreativeTab(StarcraftCreativeTabs.MISC);
		DIRT_SHAKURAS = new StarcraftBlock("shakuras.dirt", RegistryType.FULL, Material.ROCK, MapColor.BLUE).setBlockSoundType(SoundType.GROUND).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0).setResistance(0);
		STONE_SHAKURAS = new StarcraftBlock("shakuras.stone", RegistryType.FULL, Material.GROUND, MapColor.LIGHT_BLUE).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0).setResistance(0);
		GRAVEL_SHAKURAS = new StarcraftBlockFalling("shakuras.gravel", RegistryType.FULL, Material.SAND, MapColor.LIGHT_BLUE, 6724056).setBlockSoundType(SoundType.GROUND).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0).setResistance(0);
		COBBLESTONE_SHAKURAS = new StarcraftBlock("shakuras.cobblestone", RegistryType.FULL, Material.ROCK, MapColor.BLUE).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0).setResistance(0);
		SAND_SHAKURAS = new StarcraftBlockFalling("shakuras.sand", RegistryType.FULL, Material.SAND, MapColor.LIGHT_BLUE, 6724056).setBlockSoundType(SoundType.SAND).setCreativeTab(StarcraftCreativeTabs.MISC).setHardness(0).setResistance(0);
		DIM_PORTAL_SHAKURAS = new BlockDimPortalShakuras();

		/** slayn blocks */
		SAND_SLAYN = new StarcraftBlock("slayn.sand", RegistryType.FULL, Material.SAND, MapColor.BLACK).setBlockSoundType(SoundType.SAND).setCreativeTab(StarcraftCreativeTabs.MISC);
		STONE_SLAYN = new StarcraftBlock("slayn.stone", RegistryType.FULL, Material.ROCK, MapColor.BLACK).setCreativeTab(StarcraftCreativeTabs.MISC);
		DIRT_SLAYN = new StarcraftBlock("slayn.dirt", RegistryType.FULL, Material.GROUND, MapColor.BLACK).setBlockSoundType(SoundType.GROUND).setCreativeTab(StarcraftCreativeTabs.MISC);
		COBBLESTONE_SLAYN = new StarcraftBlock("slayn.cobblestone", RegistryType.FULL, Material.ROCK, MapColor.BLACK).setCreativeTab(StarcraftCreativeTabs.MISC);
		GRAVEL_SLAYN = new StarcraftBlockFalling("slayn.gravel", RegistryType.FULL, Material.GROUND, MapColor.BLACK, 0x000000).setBlockSoundType(SoundType.GROUND).setCreativeTab(StarcraftCreativeTabs.MISC);

		/** kaldir blocks */
		FROZEN_STONE_KALDIR = new StarcraftBlock("kaldir.stone.frozen", RegistryType.FULL, Material.ROCK, MapColor.GRAY).setCreativeTab(StarcraftCreativeTabs.MISC);;
		
		/** furnaces blocks **/
		FURNACE_SHAKURAS = new BlockFurnaceShakuras(false);
		LIT_FURNACE_SHAKURAS = new BlockFurnaceShakuras(true);
		FURNACE_CHAR = new BlockFurnaceChar(false);
		LIT_FURNACE_CHAR = new BlockFurnaceChar(true);
		FURNACE_SLAYN = new BlockFurnaceSlayn(false);
		LIT_FURNACE_SLAYN = new BlockFurnaceSlayn(true);

		/** protoss blocks **/
		PROTOSS_ENERGY_CHANNEL = new BlockProtossEnergyChannel();
		PROTOSS_ENERGY_STABILIZER = new BlockProtossEnergyStabilizer();
		PROTOSS_DARK_ENERGY_CHANNEL = new BlockProtossEnergyChannelDark();
		PROTOSS_DARK_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerDark();
		PROTOSS_SHIELD = new BlockProtossShield();
		PROTOSS_VOID_ENERGY_CHANNEL = new BlockProtossEnergyChannelVoid();
		PROTOSS_VOID_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerVoid();

		/** zerg blocks **/
		ZERG_CREEP = new BlockZergCreep();
		KERATIN_CHUNK = new BlockZergKeratin();

		/** core blocks **/
		CORE_CYBERNETICSCORE_VOID = new StarcraftProtossCoreBlock("protoss.cyberneticscorecore.void", RegistryType.FULL, Material.IRON, MapColor.GREEN).setDomeSize(24, 24, 3);
		CORE_CYBERNETICSCORE_DARK = new StarcraftProtossCoreBlock("protoss.cyberneticscorecore.dark", RegistryType.FULL, Material.IRON, MapColor.BLACK).setDomeSize(24, 24, 3);
		CORE_CYBERNETICSCORE_KHALAI = new StarcraftProtossCoreBlock("protoss.cyberneticscorecore.khalai", RegistryType.FULL, Material.IRON, MapColor.YELLOW).setDomeSize(24, 24, 3);
		CORE_PYLON_VOID = new StarcraftProtossCoreBlock("protoss.pyloncore.void", RegistryType.FULL, Material.IRON, MapColor.GREEN).setDomeSize(16, 10, 6);
		CORE_PYLON_DARK = new StarcraftProtossCoreBlock("protoss.pyloncore.dark", RegistryType.FULL, Material.IRON, MapColor.BLACK).setDomeSize(16, 10, 6);
		CORE_PYLON_KHALAI = new StarcraftProtossCoreBlock("protoss.pyloncore.khalai", RegistryType.FULL, Material.IRON, MapColor.YELLOW).setDomeSize(16, 10, 6);
		CORE_WARPGATE_VOID = new StarcraftProtossCoreBlock("protoss.warpgatecore.void", RegistryType.FULL, Material.IRON, MapColor.GREEN).setDomeSize(16, 13, 3);
		CORE_WARPGATE_DARK = new StarcraftProtossCoreBlock("protoss.warpgatecore.dark", RegistryType.FULL, Material.IRON, MapColor.BLACK).setDomeSize(16, 13, 3);
		CORE_WARPGATE_KHALAI = new StarcraftProtossCoreBlock("protoss.warpgatecore.khalai", RegistryType.FULL, Material.IRON, MapColor.YELLOW).setDomeSize(16, 13, 3);
		CORE_BARRACKS = new StarcraftProtossCoreBlock("protoss.barrackscore", RegistryType.FULL, Material.IRON, MapColor.BLUE).setDomeSize(16, 13, 3);

		/** gases **/
		GAS_VESPENE = new BlockVespeneGas();
		GAS_TERRAZINE = new BlockTerrazineGas();

		/** miscellaneous blocks **/
		STARCRAFT_SKULL = new BlockStarcraftSkull();
		CITY_STONE_KORHAL = new BlockKorhalCityStone();
		TEST = new BlockTest();
		ENERGY_BLOCK = new BlockEnergy();
		VOID_ENERGY = new BlockVoidEnergy();
		LIGHT_SOURCE = new BlockMovingLightSource();
		PROTOSS_WARPGATE_WORMHOLE = new BlockProtossWormhole();
	}

	public static void register() {

		registerCompleteBlock(ORE_REDSTONE_CHAR);
		registerCompleteBlock(ORE_REDSTONE_LIT_CHAR);

		registerCompleteBlock(ORE_REDSTONE_SHAKURAS);
		registerCompleteBlock(ORE_REDSTONE_LIT_SHAKURAS);

		registerCompleteBlock(DIM_PORTAL_OVERWORLD);
		registerCompleteBlock(DIM_PORTAL_KORHAL);
		registerCompleteBlock(DIM_PORTAL_KALDIR);
		registerCompleteBlock(DIM_PORTAL_SLAYN);
		
		registerCompleteBlock(MAGMA_CHAR);
		registerBlock(ASH_CHAR, new ItemBlockAsh(ASH_CHAR));
		registerCompleteBlock(DIM_PORTAL_CHAR);

		registerCompleteBlock(DIM_PORTAL_SHAKURAS);

		registerCompleteBlock(CITY_STONE_KORHAL);

		registerBlock(PROTOSS_ENERGY_CHANNEL);
		registerBlock(PROTOSS_ENERGY_STABILIZER);
		registerBlock(PROTOSS_DARK_ENERGY_CHANNEL);
		registerBlock(PROTOSS_DARK_ENERGY_STABILIZER);
		registerCompleteBlock(PROTOSS_SHIELD);
		registerBlock(PROTOSS_VOID_ENERGY_CHANNEL);
		registerBlock(PROTOSS_VOID_ENERGY_STABILIZER);
		registerCompleteBlock(ZERG_CREEP);

		// Furnaces
		registerBlock(FURNACE_SHAKURAS);
		registerBlock(LIT_FURNACE_SHAKURAS);
		registerBlock(FURNACE_CHAR);
		registerBlock(LIT_FURNACE_CHAR);
		registerBlock(FURNACE_SLAYN);
		registerBlock(LIT_FURNACE_SLAYN);

		registerBlock(LIGHT_SOURCE);

		registerCompleteBlock(KERATIN_CHUNK);

		registerBlock(PROTOSS_WARPGATE_WORMHOLE);

		registerCompleteBlock(ENERGY_BLOCK);
		registerCompleteBlock(VOID_ENERGY);

		registerCompleteBlock(FLUID_ACID);
		registerCompleteBlock(FLUID_BLOOD);
		registerCompleteBlock(FLUID_VESPENE);
		registerCompleteBlock(FLUID_TERRAZINE);

		registerCompleteBlock(GAS_VESPENE);
		registerCompleteBlock(GAS_TERRAZINE);

		registerBlock(STARCRAFT_SKULL, new ItemBlockStarcraftSkull());

		registerCompleteBlock(TEST);
	}

	/**
	 * Regsters an itemblock and the base block.
	 * 
	 * @param block
	 *            The block to register and the item block to register
	 * @author Ocelot5836
	 */
	private static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}

	/**
	 * Regsters the base block and a custom itemblock.
	 * 
	 * @param block
	 *            The block to register and the item block to register
	 * @param item
	 *            The itemblock to be registered
	 * @author Ocelot5836
	 */
	private static void registerBlock(Block block, ItemBlock item) {
		ForgeRegistries.BLOCKS.register(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}

	private static void registerCompleteBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}

	private static void registerCompleteBlock(Block block, ItemBlock item) {
		ForgeRegistries.BLOCKS.register(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}
}