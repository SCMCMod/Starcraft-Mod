package ga.scmc.handlers;

import ga.scmc.blocks.BlockAcidFluid;
import ga.scmc.blocks.BlockAsh;
import ga.scmc.blocks.BlockBloodFluid;
import ga.scmc.blocks.BlockCharCobblestone;
import ga.scmc.blocks.BlockCharDirt;
import ga.scmc.blocks.BlockCharGravel;
import ga.scmc.blocks.BlockCharMagma;
import ga.scmc.blocks.BlockCharStone;
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
import ga.scmc.blocks.BlockKeratinChunk;
import ga.scmc.blocks.BlockKorhalCityStone;
import ga.scmc.blocks.BlockMovingLightSource;
import ga.scmc.blocks.BlockProtossEnergyChannel;
import ga.scmc.blocks.BlockProtossEnergyChannelDark;
import ga.scmc.blocks.BlockProtossEnergyChannelVoid;
import ga.scmc.blocks.BlockProtossEnergyStabilizer;
import ga.scmc.blocks.BlockProtossEnergyStabilizerDark;
import ga.scmc.blocks.BlockProtossEnergyStabilizerVoid;
import ga.scmc.blocks.BlockProtossShield;
import ga.scmc.blocks.BlockShakurasCobblestone;
import ga.scmc.blocks.BlockShakurasDirt;
import ga.scmc.blocks.BlockShakurasGravel;
import ga.scmc.blocks.BlockShakurasSand;
import ga.scmc.blocks.BlockShakurasStone;
import ga.scmc.blocks.BlockStarcraftSkull;
import ga.scmc.blocks.BlockTerrazineFluid;
import ga.scmc.blocks.BlockTerrazineGas;
import ga.scmc.blocks.BlockTest;
import ga.scmc.blocks.BlockVespeneFluid;
import ga.scmc.blocks.BlockVespeneGas;
import ga.scmc.blocks.BlockVoidEnergy;
import ga.scmc.blocks.BlockWarpGateWormhole;
import ga.scmc.blocks.BlockZergCreep;
import ga.scmc.blocks.coreblocks.BlockCoreCyberneticsCoreDark;
import ga.scmc.blocks.coreblocks.BlockCoreCyberneticsCoreKhalai;
import ga.scmc.blocks.coreblocks.BlockCoreCyberneticsCoreVoid;
import ga.scmc.blocks.coreblocks.BlockCorePylonDark;
import ga.scmc.blocks.coreblocks.BlockCorePylonKhalai;
import ga.scmc.blocks.coreblocks.BlockCorePylonVoid;
import ga.scmc.blocks.coreblocks.BlockCoreWarpGateDark;
import ga.scmc.blocks.coreblocks.BlockCoreWarpGateKhalai;
import ga.scmc.blocks.coreblocks.BlockCoreWarpGateVoid;
import ga.scmc.blocks.itemblocks.ItemBlockAsh;
import ga.scmc.blocks.ore.BlockCharOre;
import ga.scmc.blocks.ore.BlockOverworldOre;
import ga.scmc.blocks.ore.BlockShakurasOre;
import ga.scmc.blocks.ore.OreCharRedstone;
import ga.scmc.blocks.ore.OreShakurasRedstone;
import ga.scmc.lib.LogHelper;
import net.minecraft.block.Block;
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

	public static Block LIGHT_SOURCE;
	public static Block TEST;

	public static Block ASH_CHAR;

	public static Block COBBLESTONE_CHAR;
	public static Block COBBLESTONE_SHAKURAS;
	public static Block CORE_CYBERNETICSCORE_DARK;
	public static Block CORE_CYBERNETICSCORE_KHALAI;
	public static Block CORE_CYBERNETICSCORE_VOID;
	public static Block CORE_PYLON_DARK;
	public static Block CORE_PYLON_KHALAI;
	public static Block CORE_PYLON_VOID;
	public static Block CORE_WARPGATE_DARK;
	public static Block CORE_WARPGATE_KHALAI;
	public static Block CORE_WARPGATE_VOID;
	public static Block DIM_PORTAL_CHAR;
	public static Block DIM_PORTAL_OVERWORLD;
	public static Block DIM_PORTAL_SHAKURAS;
	public static Block DIM_PORTAL_KALDIR;
	public static Block DIM_PORTAL_KORHAL;
	public static Block DIM_PORTAL_SLAYN;
	public static Block DIRT_CHAR;
	public static Block DIRT_SHAKURAS;
	public static Block ENERGY_BLOCK;
	public static Block WARP_GATE_WORMHOLE;

	public static Block FLUID_ACID;
	public static Block FLUID_BLOOD;
	public static Block FLUID_VESPENE;
	public static Block FLUID_TERRAZINE;

	public static Block GAS_VESPENE;
	public static Block GAS_TERRAZINE;

	public static Block GRAVEL_CHAR;
	public static Block KERATIN_CHUNK;
	public static Block MAGMA_CHAR;
	public static Block ORE_ALIEN_CHAR;
	public static Block ORE_ALIEN_SHAKURAS;
	public static Block ORE_COAL_CHAR;
	public static Block ORE_COAL_SHAKURAS;
	public static Block ORE_COPPER_CHAR;
	public static Block ORE_COPPER_OW;
	public static Block ORE_COPPER_SHAKURAS;
	public static Block ORE_DIAMOND_CHAR;
	public static Block ORE_DIAMOND_SHAKURAS;
	public static Block ORE_GOLD_CHAR;
	public static Block ORE_GOLD_SHAKURAS;
	public static Block ORE_IRON_CHAR;
	public static Block ORE_IRON_SHAKURAS;
	public static Block ORE_LAPIS_CHAR;
	public static Block ORE_LAPIS_SHAKURAS;
	public static Block ORE_MINERAL_CHAR;
	public static Block ORE_MINERAL_SHAKURAS;
	public static Block ORE_PHOSPHORUS_CHAR;
	public static Block ORE_PHOSPHORUS_SHAKURAS;
	public static Block ORE_REDSTONE_CHAR;
	public static Block ORE_REDSTONE_LIT_CHAR;
	public static Block ORE_REDSTONE_SHAKURAS;
	public static Block ORE_REDSTONE_LIT_SHAKURAS;
	public static Block ORE_RICHMINERAL_CHAR;
	public static Block ORE_RICHMINERAL_SHAKURAS;
	public static Block ORE_URANIUM_CHAR;
	public static Block ORE_URANIUM_SHAKURAS;
	public static Block ORE_TITANIUM_CHAR;
	public static Block ORE_TITANIUM_OW;
	public static Block ORE_TITANIUM_SHAKURAS;
	public static Block PROTOSS_DARK_ENERGY_CHANNEL;
	public static Block PROTOSS_DARK_ENERGY_STABILIZER;
	public static Block PROTOSS_ENERGY_CHANNEL;
	public static Block PROTOSS_ENERGY_STABILIZER;
	public static Block PROTOSS_SHIELD;
	public static Block PROTOSS_VOID_ENERGY_CHANNEL;
	public static Block PROTOSS_VOID_ENERGY_STABILIZER;
	public static Block SAND_SHAKURAS;
	public static Block GRAVEL_SHAKURAS;
	public static Block STONE_CHAR;
	public static Block STONE_SHAKURAS;
	public static Block FURNACE_SHAKURAS;
	public static Block LIT_FURNACE_SHAKURAS;
	public static Block FURNACE_CHAR;
	public static Block LIT_FURNACE_CHAR;
	public static Block FURNACE_SLAYN;
	public static Block LIT_FURNACE_SLAYN;
	public static Block VOID_ENERGY;
	public static Block WARPGATE_WORMHOLE_CHAR;
	public static Block WARPGATE_WORMHOLE_OVERWORLD;
	public static Block WARPGATE_WORMHOLE_SHAKURAS;
	public static Block ZERG_CREEP;
	
	public static Block CITY_STONE_KORHAL;

	public static Block SAND_SLAYN;
	public static Block STONE_SLAYN;
	public static Block DIRT_SLAYN;
	public static Block COBBLESTONE_SLAYN;
	public static Block GRAVEL_SLAYN;
	
	public static Block STARCRAFT_SKULL;

	/**
	 * Instantiates, registers, and initializes the MetaBlocks.
	 */
	public static void preInit() {
		instantiate();
		register();

		MetaBlockHandler.init();
	}

	/**
	 * Sets the
	 */
	public static void instantiate() {

		LIGHT_SOURCE = new BlockMovingLightSource();
		ORE_COPPER_OW = new BlockOverworldOre("overworldOreCopper", "overworld_ore_copper", 1);
		ORE_TITANIUM_OW = new BlockOverworldOre("overworldOreTitanium", "overworld_ore_titanium", 2);

		WARP_GATE_WORMHOLE = new BlockWarpGateWormhole();

		DIM_PORTAL_OVERWORLD = new BlockDimPortalOverworld();
		DIM_PORTAL_KORHAL = new BlockDimPortalKorhal();
		DIM_PORTAL_SLAYN = new BlockDimPortalSlayn();
		DIM_PORTAL_KALDIR = new BlockDimPortalKaldir();
		// DIM_PORTAL_ZERUS = new BlockDimPortalZerus();

		ORE_COAL_CHAR = new BlockCharOre("charOreCoal", "char_ore_coal", 0);
		ORE_COPPER_CHAR = new BlockCharOre("charOreCopper", "char_ore_copper", 1);
		ORE_DIAMOND_CHAR = new BlockCharOre("charOreDiamond", "char_ore_diamond", 2);
		ORE_GOLD_CHAR = new BlockCharOre("charOreGold", "char_ore_gold", 2);
		ORE_IRON_CHAR = new BlockCharOre("charOreIron", "char_ore_iron", 1);
		ORE_LAPIS_CHAR = new BlockCharOre("charOreLapis", "char_ore_lapis", 1);
		ORE_MINERAL_CHAR = new BlockCharOre("charOreMineral", "char_ore_mineral", 1);
		ORE_REDSTONE_CHAR = new OreCharRedstone(false);
		ORE_REDSTONE_LIT_CHAR = new OreCharRedstone(true);
		ORE_RICHMINERAL_CHAR = new BlockCharOre("charOreMineralRich", "char_ore_mineral_rich", 1);
		ORE_TITANIUM_CHAR = new BlockCharOre("charOreTitanium", "char_ore_titanium", 2);
		ORE_URANIUM_CHAR = new BlockCharOre("charOreUranium", "char_ore_uranium", 1);

		STONE_CHAR = new BlockCharStone();
		COBBLESTONE_CHAR = new BlockCharCobblestone();
		MAGMA_CHAR = new BlockCharMagma();
		ASH_CHAR = new BlockAsh();
		DIRT_CHAR = new BlockCharDirt();
		GRAVEL_CHAR = new BlockCharGravel();
		DIM_PORTAL_CHAR = new BlockDimPortalChar();

		ORE_COAL_SHAKURAS = new BlockShakurasOre("shakurasOreCoal", "shakuras_ore_coal", 0);
		ORE_COPPER_SHAKURAS = new BlockShakurasOre("shakurasOreCopper", "shakuras_ore_copper", 1);
		ORE_DIAMOND_SHAKURAS = new BlockShakurasOre("shakurasOreDiamond", "shakuras_ore_diamond", 2);
		ORE_GOLD_SHAKURAS = new BlockShakurasOre("shakurasOreGold", "shakuras_ore_gold", 2);
		ORE_IRON_SHAKURAS = new BlockShakurasOre("shakurasOreIron", "shakuras_ore_iron", 1);
		ORE_LAPIS_SHAKURAS = new BlockShakurasOre("shakurasOreLapis", "shakuras_ore_lapis", 1);
		ORE_MINERAL_SHAKURAS = new BlockShakurasOre("shakurasOreMineral", "shakuras_ore_mineral", 1);
		ORE_REDSTONE_SHAKURAS = new OreShakurasRedstone(false);
		ORE_REDSTONE_LIT_SHAKURAS = new OreShakurasRedstone(true);
		ORE_RICHMINERAL_SHAKURAS = new BlockShakurasOre("shakurasOreMineralRich", "shakuras_ore_mineral_rich", 1);
		ORE_TITANIUM_SHAKURAS = new BlockShakurasOre("shakurasOreTitanium", "shakuras_ore_titanium", 2);
		ORE_URANIUM_SHAKURAS = new BlockShakurasOre("shakurasOreUranium", "shakuras_ore_uranium", 1);

		DIRT_SHAKURAS = new BlockShakurasDirt();
		STONE_SHAKURAS = new BlockShakurasStone();
		GRAVEL_SHAKURAS = new BlockShakurasGravel();
		COBBLESTONE_SHAKURAS = new BlockShakurasCobblestone();
		SAND_SHAKURAS = new BlockShakurasSand();
		DIM_PORTAL_SHAKURAS = new BlockDimPortalShakuras();

		// Protoss Blocks
		PROTOSS_ENERGY_CHANNEL = new BlockProtossEnergyChannel();
		PROTOSS_ENERGY_STABILIZER = new BlockProtossEnergyStabilizer();
		PROTOSS_DARK_ENERGY_CHANNEL = new BlockProtossEnergyChannelDark();
		PROTOSS_DARK_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerDark();
		PROTOSS_SHIELD = new BlockProtossShield();
		PROTOSS_VOID_ENERGY_CHANNEL = new BlockProtossEnergyChannelVoid();
		PROTOSS_VOID_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerVoid();

		ENERGY_BLOCK = new BlockEnergy();
		VOID_ENERGY = new BlockVoidEnergy();

		// Furnaces
		FURNACE_SHAKURAS = new BlockFurnaceShakuras(false);
		LIT_FURNACE_SHAKURAS = new BlockFurnaceShakuras(true);
		FURNACE_CHAR = new BlockFurnaceChar(false);
		LIT_FURNACE_CHAR = new BlockFurnaceChar(true);
		FURNACE_SLAYN = new BlockFurnaceSlayn(false);
		LIT_FURNACE_SLAYN = new BlockFurnaceSlayn(true);

		// Zerg Blocks
		ZERG_CREEP = new BlockZergCreep();
		KERATIN_CHUNK = new BlockKeratinChunk();

		// Core Blocks
		CORE_CYBERNETICSCORE_VOID = new BlockCoreCyberneticsCoreVoid();
		CORE_CYBERNETICSCORE_DARK = new BlockCoreCyberneticsCoreDark();
		CORE_CYBERNETICSCORE_KHALAI = new BlockCoreCyberneticsCoreKhalai();

		CORE_PYLON_VOID = new BlockCorePylonVoid();
		CORE_PYLON_DARK = new BlockCorePylonDark();
		CORE_PYLON_KHALAI = new BlockCorePylonKhalai();

		CORE_WARPGATE_VOID = new BlockCoreWarpGateVoid();
		CORE_WARPGATE_DARK = new BlockCoreWarpGateDark();
		CORE_WARPGATE_KHALAI = new BlockCoreWarpGateKhalai();

		FLUID_ACID = new BlockAcidFluid();
		FLUID_BLOOD = new BlockBloodFluid();
		FLUID_VESPENE = new BlockVespeneFluid();
		FLUID_TERRAZINE = new BlockTerrazineFluid();

		GAS_VESPENE = new BlockVespeneGas();
		GAS_TERRAZINE = new BlockTerrazineGas();

		STARCRAFT_SKULL = new BlockStarcraftSkull();
		

		CITY_STONE_KORHAL = new BlockKorhalCityStone();

		TEST = new BlockTest();
	}

	public static void register() {

		registerCompleteBlock(ORE_COPPER_OW);
		registerCompleteBlock(ORE_TITANIUM_OW);
		registerCompleteBlock(DIM_PORTAL_OVERWORLD);
		registerCompleteBlock(DIM_PORTAL_KORHAL);
		registerCompleteBlock(DIM_PORTAL_KALDIR);
		registerCompleteBlock(DIM_PORTAL_SLAYN);

		registerCompleteBlock(ORE_COAL_CHAR);
		registerCompleteBlock(ORE_COPPER_CHAR);
		registerCompleteBlock(ORE_DIAMOND_CHAR);
		registerCompleteBlock(ORE_GOLD_CHAR);
		registerCompleteBlock(ORE_IRON_CHAR);
		registerCompleteBlock(ORE_LAPIS_CHAR);
		registerCompleteBlock(ORE_MINERAL_CHAR);
		registerCompleteBlock(ORE_PHOSPHORUS_CHAR);
		registerCompleteBlock(ORE_REDSTONE_CHAR);
		registerCompleteBlock(ORE_REDSTONE_LIT_CHAR);
		registerCompleteBlock(ORE_RICHMINERAL_CHAR);
		registerCompleteBlock(ORE_TITANIUM_CHAR);
		registerCompleteBlock(ORE_URANIUM_CHAR);
		registerCompleteBlock(STONE_CHAR);
		registerCompleteBlock(COBBLESTONE_CHAR);
		registerCompleteBlock(MAGMA_CHAR);
		registerBlock(ASH_CHAR, new ItemBlockAsh(ASH_CHAR));
		registerCompleteBlock(DIRT_CHAR);
		registerCompleteBlock(GRAVEL_CHAR);
		registerCompleteBlock(DIM_PORTAL_CHAR);

		registerCompleteBlock(ORE_COAL_SHAKURAS);
		registerCompleteBlock(ORE_COPPER_SHAKURAS);
		registerCompleteBlock(ORE_DIAMOND_SHAKURAS);
		registerCompleteBlock(ORE_GOLD_SHAKURAS);
		registerCompleteBlock(ORE_IRON_SHAKURAS);
		registerCompleteBlock(ORE_LAPIS_SHAKURAS);
		registerCompleteBlock(ORE_MINERAL_SHAKURAS);
		registerCompleteBlock(ORE_PHOSPHORUS_SHAKURAS);
		registerCompleteBlock(ORE_REDSTONE_SHAKURAS);
		registerCompleteBlock(ORE_REDSTONE_LIT_SHAKURAS);
		registerCompleteBlock(ORE_RICHMINERAL_SHAKURAS);
		registerCompleteBlock(ORE_TITANIUM_SHAKURAS);
		registerCompleteBlock(ORE_URANIUM_SHAKURAS);
		registerCompleteBlock(DIRT_SHAKURAS);
		registerCompleteBlock(STONE_SHAKURAS);
		registerCompleteBlock(GRAVEL_SHAKURAS);
		registerCompleteBlock(COBBLESTONE_SHAKURAS);
		registerCompleteBlock(SAND_SHAKURAS);
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

		registerCompleteBlock(CORE_CYBERNETICSCORE_VOID);
		registerCompleteBlock(CORE_CYBERNETICSCORE_DARK);
		registerCompleteBlock(CORE_CYBERNETICSCORE_KHALAI);
		registerCompleteBlock(CORE_PYLON_VOID);
		registerCompleteBlock(CORE_PYLON_DARK);
		registerCompleteBlock(CORE_PYLON_KHALAI);
		registerCompleteBlock(CORE_WARPGATE_VOID);
		registerCompleteBlock(CORE_WARPGATE_DARK);
		registerCompleteBlock(CORE_WARPGATE_KHALAI);

		registerBlock(WARP_GATE_WORMHOLE);

		registerCompleteBlock(ENERGY_BLOCK);
		registerCompleteBlock(VOID_ENERGY);

		registerCompleteBlock(FLUID_ACID);
		registerCompleteBlock(FLUID_BLOOD);
		registerCompleteBlock(FLUID_VESPENE);
		registerCompleteBlock(FLUID_TERRAZINE);

		registerCompleteBlock(GAS_VESPENE);
		registerCompleteBlock(GAS_TERRAZINE);

		registerBlock(STARCRAFT_SKULL);

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
		if (ConfigurationHandler.BOOL_DEBUG_MODE_ENABLED == true) {
			LogHelper.logger.info("Registered Block: " + block.getUnlocalizedName().substring(5));
		}
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
		if (ConfigurationHandler.BOOL_DEBUG_MODE_ENABLED == true) {
			LogHelper.logger.info("Registered Block: " + block.getUnlocalizedName().substring(5));
		}
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