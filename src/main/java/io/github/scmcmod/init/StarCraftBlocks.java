/**
 * Starcraft-Mod
 * Copyright (C) 2020
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.scmcmod.init;

import io.github.scmcmod.api.OreType;
import io.github.scmcmod.blocks.*;
import io.github.scmcmod.blocks.flora.BlockBrambles;
import io.github.scmcmod.blocks.flora.BlockZerusGlowPod;
import io.github.scmcmod.blocks.flora.BlockZerusLightcap;
import io.github.scmcmod.blocks.itemblock.ItemBlockBrambles;
import io.github.scmcmod.blocks.metablocks.BlockEnergy;
import io.github.scmcmod.blocks.metablocks.BlockGasCollector;
import io.github.scmcmod.blocks.metablocks.BlockKhaydarinCrystal;
import io.github.scmcmod.blocks.metablocks.BlockMineral;
import io.github.scmcmod.blocks.metablocks.BlockNeosteel;
import io.github.scmcmod.blocks.metablocks.BlockParisteel;
import io.github.scmcmod.blocks.metablocks.BlockPlanetSurface;
import io.github.scmcmod.blocks.metablocks.BlockProtossMetalT1;
import io.github.scmcmod.blocks.metablocks.BlockProtossMetalT2;
import io.github.scmcmod.blocks.metablocks.BlockProtossMetalT3;
import io.github.scmcmod.blocks.metablocks.BlockStarSurface;
import io.github.scmcmod.blocks.metablocks.BlockTerranMetal;
import io.github.scmcmod.blocks.metablocks.BlockZergCarapace;
import io.github.scmcmod.blocks.metablocks.BlockZergFlesh;
import io.github.scmcmod.config.SCConfig;
import io.github.scmcmod.creativetabs.SCCreativeTabs;
import io.github.scmcmod.enums.EnumWorldType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.rom.block.BlockCustomDrop;
import net.rom.block.BlockFallingGeneric;
import net.rom.block.BlockGeneric;
import net.rom.registry.ReadOnlyRegistry;

public class StarCraftBlocks {

	public static final Block PLANET_TELEPORTER = new BlockPlanetTeleporter(100);
	public static final Block SOLAR_CORE = new BlockSolarCore(100);
	public static final Block STARCRAFT_SKULL = new SCSkull();
	public static final Block ENERGY_BLOCK = new BlockEnergy();
	public static final Block COMP_MINERAL = new BlockMineral();
	public static final Block GAS_COLLECTOR = new BlockGasCollector();
	public static final Block STAR_SURFACE = new BlockStarSurface();
	public static final Block PLANET_SURFACE = new BlockPlanetSurface();

	public static final Block DIM_PORTAL_OVERWORLD = new BlockDimPortal("overworld.portal", 0);
	public static final Block DIM_PORTAL_KORHAL = new BlockDimPortal("korhal.portal", SCConfig.INT_DIMENSION_KORHAL);
	public static final Block DIM_PORTAL_KALDIR = new BlockDimPortal("kaldir.portal", SCConfig.INT_DIMENSION_KALDIR);
	public static final Block DIM_PORTAL_CHAR = new BlockDimPortal("char.portal", SCConfig.INT_DIMENSION_CHAR);
	public static final Block DIM_PORTAL_SHAKURAS = new BlockDimPortal("shakuras.portal", SCConfig.INT_DIMENSION_SHAKURAS);
	public static final Block DIM_PORTAL_SLAYN = new BlockDimPortal("slayn.portal", SCConfig.INT_DIMENSION_SLAYN);
	public static final Block DIM_PORTAL_AIUR = new BlockDimPortal("aiur.portal", SCConfig.INT_DIMENSION_AIUR);
	public static final Block DIM_PORTAL_ZERUS = new BlockDimPortal("zerus.portal", SCConfig.INT_DIMENSION_ZERUS);
	public static final Block DIM_PORTAL_SPACE = new BlockDimPortal("space.portal", SCConfig.INT_DIMENSION_SPACE);

	public static final Block ORE_COPPER_OW = new BlockOverworldOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_TITANIUM_OW = new BlockOverworldOre(Material.ROCK, 2).setBlockHarvestLevel("pickaxe", 2)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_URANIUM_OW = new BlockOverworldOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 2)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_MINERAL_OW = new BlockOverworldOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_RICHMINERAL_OW = new BlockOverworldOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_PHOSPHORUS_OW = new BlockOverworldOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);

	// Char
	public static final Block COBBLESTONE_CHAR = new BlockGeneric(Material.ROCK).setBlockHarvestLevel("pickaxe", 0)
			.setCreativeTab(SCCreativeTabs.MISC).setHardness(2).setResistance(10);
	public static final Block STONE_CHAR = new BlockCustomDrop(Material.ROCK, MapColor.BLACK, new ItemStack(COBBLESTONE_CHAR))
			.setBlockHarvestLevel("pickaxe", 0).setHardness(1.5f).setResistance(10).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block FARMLAND_CHAR = new BlockCharFarmland();
	public static final Block DIRT_CHAR = new SCDirt(MapColor.BLACK, FARMLAND_CHAR.getDefaultState());
	public static final Block GRAVEL_CHAR = new SCGravel(Material.GROUND, MapColor.BLACK, 0x000000)
			.setSoundType(SoundType.GROUND).setHardness(0.6f).setResistance(1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block MAGMA_CHAR = new BlockMagma();

	public static final Block ORE_COAL_CHAR = new BlockCharOre(Material.ROCK, 0).setBlockHarvestLevel("pickaxe", 0)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_COPPER_CHAR = new BlockCharOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_DIAMOND_CHAR = new BlockCharOre(Material.ROCK, 2).setBlockHarvestLevel("pickaxe", 2)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_GOLD_CHAR = new BlockCharOre(Material.ROCK, 2).setBlockHarvestLevel("pickaxe", 2)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_IRON_CHAR = new BlockCharOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_LAPIS_CHAR = new BlockCharOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_MINERAL_CHAR = new BlockCharOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_RICHMINERAL_CHAR = new BlockCharOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_REDSTONE_CHAR = new OreStarcraftRedstone(MapColor.BLACK)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_TITANIUM_CHAR = new BlockCharOre(Material.ROCK, 2).setBlockHarvestLevel("pickaxe", 2)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_URANIUM_CHAR = new BlockCharOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 2)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_PHOSPHORUS_CHAR = new BlockCharOre(Material.ROCK, 1).setBlockHarvestLevel("pickaxe", 1)
			.setCreativeTab(SCCreativeTabs.MISC);

	public static final Block COBBLESTONE_SHAKURAS = new BlockGeneric(Material.ROCK).setBlockHarvestLevel("pickaxe", 0)
			.setCreativeTab(SCCreativeTabs.MISC).setHardness(2).setResistance(10);
	public static final Block STONE_SHAKURAS = new BlockCustomDrop(Material.ROCK, MapColor.LIGHT_BLUE,
			new ItemStack(COBBLESTONE_SHAKURAS)).setHardness(1.5f).setResistance(10)
					.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block FARMLAND_SHAKURAS = new BlockShakurasFarmland();
	public static final Block DIRT_SHAKURAS = new SCDirt(MapColor.LIGHT_BLUE, FARMLAND_SHAKURAS.getDefaultState());
	public static final Block GRAVEL_SHAKURAS = new SCGravel(Material.GROUND, MapColor.LIGHT_BLUE, 0x55539B)
			.setSoundType(SoundType.GROUND).setHardness(0.6f).setResistance(1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block SAND_SHAKURAS = new BlockFallingGeneric(Material.SAND, MapColor.LIGHT_BLUE, 6724056)
			.setSoundType(SoundType.SAND).setCreativeTab(SCCreativeTabs.MISC).setHardness(0.5f).setResistance(0.83f);

	public static final Block ORE_COAL_SHAKURAS = new BlockShakurasOre(Material.ROCK, 0).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_COPPER_SHAKURAS = new BlockShakurasOre(Material.ROCK, 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_DIAMOND_SHAKURAS = new BlockShakurasOre(Material.ROCK, 2)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_GOLD_SHAKURAS = new BlockShakurasOre(Material.ROCK, 2).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_IRON_SHAKURAS = new BlockShakurasOre(Material.ROCK, 1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_LAPIS_SHAKURAS = new BlockShakurasOre(Material.ROCK, 1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_MINERAL_SHAKURAS = new BlockShakurasOre(Material.ROCK, 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_RICHMINERAL_SHAKURAS = new BlockShakurasOre(Material.ROCK, 1)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_REDSTONE_SHAKURAS = new OreStarcraftRedstone(MapColor.LIGHT_BLUE)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_TITANIUM_SHAKURAS = new BlockShakurasOre(Material.ROCK, 2)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_URANIUM_SHAKURAS = new BlockShakurasOre(Material.ROCK, 2)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_PHOSPHORUS_SHAKURAS = new BlockShakurasOre(Material.ROCK, 1)
			.setCreativeTab(SCCreativeTabs.MISC);

	public static final Block COBBLESTONE_ZERUS = new BlockGeneric(Material.ROCK).setBlockHarvestLevel("pickaxe", 0)
			.setCreativeTab(SCCreativeTabs.MISC).setHardness(2).setResistance(10);
	public static final Block STONE_ZERUS = new BlockCustomDrop(Material.ROCK, MapColor.BROWN,
			new ItemStack(COBBLESTONE_ZERUS)).setHardness(1.5f).setResistance(10).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block FARMLAND_ZERUS = new BlockZerusFarmland();
	public static final Block DIRT_ZERUS = new SCDirt(MapColor.BROWN, FARMLAND_ZERUS.getDefaultState());
	public static final Block GRASS_ZERUS = new SCGrass("zerus.grass", MapColor.GRASS, DIRT_ZERUS.getDefaultState());
	public static final Block GRAVEL_ZERUS = new SCGravel(Material.GROUND, MapColor.BROWN, 0x55539B)
			.setSoundType(SoundType.GROUND).setHardness(0.6f).setResistance(1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block SAND_ZERUS = new BlockFallingGeneric(Material.SAND, MapColor.BROWN, 6724056)
			.setSoundType(SoundType.SAND).setCreativeTab(SCCreativeTabs.MISC).setHardness(0.5f).setResistance(0.83f);

	public static final Block ORE_COAL_ZERUS = new BlockZerusOre(Material.ROCK, 0).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_COPPER_ZERUS = new BlockZerusOre(Material.ROCK, 1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_DIAMOND_ZERUS = new BlockZerusOre(Material.ROCK, 2).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_GOLD_ZERUS = new BlockZerusOre(Material.ROCK, 2).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_IRON_ZERUS = new BlockZerusOre(Material.ROCK, 1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_LAPIS_ZERUS = new BlockZerusOre(Material.ROCK, 1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_MINERAL_ZERUS = new BlockZerusOre(Material.ROCK, 1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_RICHMINERAL_ZERUS = new BlockZerusOre(Material.ROCK, 1).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_REDSTONE_ZERUS = new OreStarcraftRedstone(MapColor.BROWN)
			.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_TITANIUM_ZERUS = new BlockZerusOre(Material.ROCK, 2).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_URANIUM_ZERUS = new BlockZerusOre(Material.ROCK, 2).setCreativeTab(SCCreativeTabs.MISC);
	public static final Block ORE_PHOSPHORUS_ZERUS = new BlockZerusOre(Material.ROCK, 1).setCreativeTab(SCCreativeTabs.MISC);

	public static final Block COBBLESTONE_SLAYN = new BlockGeneric(Material.ROCK).setBlockHarvestLevel("pickaxe", 0)
			.setCreativeTab(SCCreativeTabs.MISC).setHardness(2).setResistance(10);
	public static final Block STONE_SLAYN = new BlockCustomDrop(Material.ROCK, MapColor.BLACK,
			new ItemStack(COBBLESTONE_SLAYN)).setBlockHarvestLevel("pickaxe", 0).setHardness(1.5f).setResistance(10)
					.setCreativeTab(SCCreativeTabs.MISC);
	public static final Block FARMLAND_SLAYN = new BlockSlaynFarmland();
	public static final Block DIRT_SLAYN = new SCDirt(MapColor.BLACK, FARMLAND_SLAYN.getDefaultState());
	public static final Block SAND_SLAYN = new BlockFallingGeneric(Material.SAND, MapColor.BLACK, 6724056)
			.setSoundType(SoundType.SAND).setCreativeTab(SCCreativeTabs.MISC).setHardness(0.5f).setResistance(0.83f);
	public static final Block GRAVEL_SLAYN = new SCGravel(Material.GROUND, MapColor.BLACK, 0x000000)
			.setSoundType(SoundType.GROUND).setHardness(0.6f).setResistance(1).setCreativeTab(SCCreativeTabs.MISC);

	public static final Block ORE_COAL_SLAYN = new BlockSlaynOre(0);
	public static final Block ORE_COPPER_SLAYN = new BlockSlaynOre(1);
	public static final Block ORE_DIAMOND_SLAYN = new BlockSlaynOre(2);
	public static final Block ORE_GOLD_SLAYN = new BlockSlaynOre(2);
	public static final Block ORE_IRON_SLAYN = new BlockSlaynOre(1);
	public static final Block ORE_LAPIS_SLAYN = new BlockSlaynOre(1);
	public static final Block ORE_MINERAL_SLAYN = new BlockSlaynOre(1);
	public static final Block ORE_RICHMINERAL_SLAYN = new BlockSlaynOre(1);
	public static final Block ORE_REDSTONE_SLAYN = new OreStarcraftRedstone(MapColor.BLACK);
	public static final Block ORE_TITANIUM_SLAYN = new BlockSlaynOre(2);
	public static final Block ORE_URANIUM_SLAYN = new BlockSlaynOre(1);
	public static final Block ORE_PHOSPHORUS_SLAYN = new BlockSlaynOre(1);

	public static final Block CITY_STONE_KORHAL = new BlockGeneric(Material.ROCK).setBlockHarvestLevel("pickaxe", 0)
			.setHardness(1.5f).setResistance(10.0f).setCreativeTab(SCCreativeTabs.MISC);

	public static final Block FURNACE_SHAKURAS = new SCFurnace(MapColor.LIGHT_BLUE, EnumWorldType.SHAKURAS);
	public static final Block FURNACE_CHAR = new SCFurnace(MapColor.BLACK, EnumWorldType.CHAR);
	public static final Block FURNACE_SLAYN = new SCFurnace(MapColor.BLACK, EnumWorldType.SLAYN);
	public static final Block FURNACE_ZERUS = new SCFurnace(MapColor.BROWN, EnumWorldType.ZERUS);
	public static final Block FURNACE_PROTOSS = new BlockProtossFurnace();

	public static final Block PROTOSS_SHIELD = new BlockProtossShield();
	public static final Block PROTOSS_VOID_ENERGY_CHANNEL = new BlockProtossEnergyChannelVoid();
	public static final Block PROTOSS_VOID_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerVoid();
	public static final Block PROTOSS_ENERGY_CHANNEL = new BlockProtossEnergyChannel();
	public static final Block PROTOSS_ENERGY_STABILIZER = new BlockProtossEnergyStabilizer();
	public static final Block PROTOSS_DARK_ENERGY_CHANNEL = new BlockProtossEnergyChannelDark();
	public static final Block PROTOSS_DARK_ENERGY_STABILIZER = new BlockProtossEnergyStabilizerDark();
	public static final Block PROTOSS_WORMHOLE = new BlockProtossWormhole();
	public static final Block PROTOSS_METAL_T1 = new BlockProtossMetalT1();
	public static final Block PROTOSS_METAL_T2 = new BlockProtossMetalT2();
	public static final Block PROTOSS_METAL_T3 = new BlockProtossMetalT3();
	public static final Block PYLON_CRYSTAL = new BlockKhaydarinCrystal();

	public static final Block CORE_CYBERNETICSCORE_VOID = new SCProtossCoreBlock(MapColor.GREEN).setDomeSize(-5, 24, 24, 3);
	public static final Block CORE_CYBERNETICSCORE_DARK = new SCProtossCoreBlock(MapColor.BLACK).setDomeSize(-5, 24, 24, 3);
	public static final Block CORE_CYBERNETICSCORE_KHALAI = new SCProtossCoreBlock(MapColor.YELLOW).setDomeSize(-5, 24, 24,
			3);
	public static final Block CORE_PYLON_VOID = new ProtossPowerCoreBlock(MapColor.GREEN).setDomeSize(-10, 16, 10, 6);
	public static final Block CORE_PYLON_DARK = new ProtossPowerCoreBlock(MapColor.BLACK).setDomeSize(-10, 16, 10, 6);
	public static final Block CORE_PYLON_KHALAI = new ProtossPowerCoreBlock(MapColor.YELLOW).setDomeSize(-10, 16, 10, 6);
	public static final Block CORE_WARPGATE_VOID = new SCProtossCoreBlock(MapColor.GREEN).setDomeSize(-5, 16, 13, 3);
	public static final Block CORE_WARPGATE_DARK = new SCProtossCoreBlock(MapColor.BLACK).setDomeSize(-5, 16, 13, 3);
	public static final Block CORE_WARPGATE_KHALAI = new SCProtossCoreBlock(MapColor.YELLOW).setDomeSize(-5, 16, 13, 3);

	public static final Block TERRAN_WARNING_TAPE = new BlockGeneric(Material.IRON).setSoundType(SoundType.METAL)
			.setHardness(3.5f).setResistance(10.0f).setCreativeTab(SCCreativeTabs.TERRAN);
	public static final Block TERRAN_METAL = new BlockTerranMetal();
	public static final Block NEOSTEEL_METAL = new BlockNeosteel();
	public static final Block PARISTEEL_METAL = new BlockParisteel();

	public static final Block CORE_BARRACKS = new BlockGeneric(Material.IRON).setBlockHarvestLevel("pickaxe", 2)
			.setHardness(15.0F).setResistance(15.0F).setCreativeTab(SCCreativeTabs.TERRAN);
	public static final Block CORE_COMMANDCENTER = new BlockGeneric(Material.IRON).setBlockHarvestLevel("pickaxe", 2)
			.setHardness(15.0F).setResistance(15.0F).setCreativeTab(SCCreativeTabs.TERRAN);

	public static final Block ZERG_CREEP = new BlockZergCreep();
	public static final Block KERATIN_CHUNK = new BlockZergKeratin();
	public static final Block ZERG_CARAPACE_BLOCK = new BlockZergCarapace();
	public static final Block ZERG_FLESH = new BlockZergFlesh();

	// Gasses
	public static final Block GAS_VESPENE = new BlockVespeneGas();
	public static final Block GAS_TERRAZINE = new BlockTerrazineGas();

	public static final Block FLORA_ZERUS_GLOW_POD = new BlockZerusGlowPod();
	public static final Block FLORA_BRAMBLES = new BlockBrambles();
	public static final Block FLORA_ZERUS_LIGHTCAP = new BlockZerusLightcap();

	public static final Block DYNAMIC_COAL_ORE = new DynamicOreBlock(OreType.COAL);
	public static final Block DYNAMIC_IRON_ORE = new DynamicOreBlock(OreType.IRON);
	public static final Block DYNAMIC_GOLD_ORE = new DynamicOreBlock(OreType.GOLD);
	public static final Block DYNAMIC_REDSTONE_ORE_UNLIT = new DynamicRedstoneOreBlock(false);
	public static final Block DYNAMIC_REDSTONE_ORE_LIT = new DynamicRedstoneOreBlock(true);
	public static final Block DYNAMIC_DIAMOND_ORE = new DynamicOreBlock(OreType.DIAMOND);
	public static final Block DYNAMIC_LAPIS_ORE = new DynamicOreBlock(OreType.LAPIS);
	public static final Block DYNAMIC_EMERALD_ORE = new DynamicOreBlock(OreType.EMERALD);

	public static void registerAll(ReadOnlyRegistry registry) {
		registry.registerBlock(PLANET_TELEPORTER, "planet_teleporter");
		registry.registerBlock(SOLAR_CORE, "solar_core");
		registry.registerBlock(STARCRAFT_SKULL, "starcraft_skull");
		registry.registerBlock(ENERGY_BLOCK, "energy_block");
		registry.registerBlock(COMP_MINERAL, "comp_mineral");
		registry.registerBlock(GAS_COLLECTOR, "gas_collector");
		registry.registerBlock(STAR_SURFACE, "star_surface");
		registry.registerBlock(PLANET_SURFACE, "planet_surface");
		registry.registerBlock(DIM_PORTAL_OVERWORLD, "dim_portal_overworld");
		registry.registerBlock(DIM_PORTAL_KORHAL, "dim_portal_korhal");
		registry.registerBlock(DIM_PORTAL_KALDIR, "dim_portal_kaldir");
		registry.registerBlock(DIM_PORTAL_CHAR, "dim_portal_char");
		registry.registerBlock(DIM_PORTAL_SHAKURAS, "dim_portal_shakuras");
		registry.registerBlock(DIM_PORTAL_SLAYN, "dim_portal_slayn");
		registry.registerBlock(DIM_PORTAL_AIUR, "dim_portal_aiur");
		registry.registerBlock(DIM_PORTAL_ZERUS, "dim_portal_zerus");
		registry.registerBlock(DIM_PORTAL_SPACE, "dim_portal_space");
		registry.registerBlock(ORE_COPPER_OW, "ore_copper_ow");
		registry.registerBlock(ORE_TITANIUM_OW, "ore_titanium_ow");
		registry.registerBlock(ORE_URANIUM_OW, "ore_uranium_ow");
		registry.registerBlock(ORE_MINERAL_OW, "ore_mineral_ow");
		registry.registerBlock(ORE_RICHMINERAL_OW, "ore_richmineral_ow");
		registry.registerBlock(ORE_PHOSPHORUS_OW, "ore_phosphorus_ow");
		registry.registerBlock(COBBLESTONE_CHAR, "cobblestone_char");
		registry.registerBlock(STONE_CHAR, "stone_char");
		registry.registerBlock(FARMLAND_CHAR, "farmland_char");
		registry.registerBlock(DIRT_CHAR, "dirt_char");
		registry.registerBlock(GRAVEL_CHAR, "gravel_char");
		registry.registerBlock(MAGMA_CHAR, "magma_char");
		registry.registerBlock(ORE_COAL_CHAR, "ore_coal_char");
		registry.registerBlock(ORE_COPPER_CHAR, "ore_copper_char");
		registry.registerBlock(ORE_DIAMOND_CHAR, "ore_diamond_char");
		registry.registerBlock(ORE_GOLD_CHAR, "ore_gold_char");
		registry.registerBlock(ORE_IRON_CHAR, "ore_iron_char");
		registry.registerBlock(ORE_LAPIS_CHAR, "ore_lapis_char");
		registry.registerBlock(ORE_MINERAL_CHAR, "ore_mineral_char");
		registry.registerBlock(ORE_RICHMINERAL_CHAR, "ore_richmineral_char");
		registry.registerBlock(ORE_REDSTONE_CHAR, "ore_redstone_char");
		registry.registerBlock(ORE_TITANIUM_CHAR, "ore_titanium_char");
		registry.registerBlock(ORE_URANIUM_CHAR, "ore_uranium_char");
		registry.registerBlock(ORE_PHOSPHORUS_CHAR, "ore_phosphorus_char");
		registry.registerBlock(COBBLESTONE_SHAKURAS, "cobblestone_shakuras");
		registry.registerBlock(STONE_SHAKURAS, "stone_shakuras");
		registry.registerBlock(FARMLAND_SHAKURAS, "farmland_shakuras");
		registry.registerBlock(DIRT_SHAKURAS, "dirt_shakuras");
		registry.registerBlock(GRAVEL_SHAKURAS, "gravel_shakuras");
		registry.registerBlock(SAND_SHAKURAS, "sand_shakuras");
		registry.registerBlock(ORE_COAL_SHAKURAS, "ore_coal_shakuras");
		registry.registerBlock(ORE_COPPER_SHAKURAS, "ore_copper_shakuras");
		registry.registerBlock(ORE_DIAMOND_SHAKURAS, "ore_diamond_shakuras");
		registry.registerBlock(ORE_GOLD_SHAKURAS, "ore_gold_shakuras");
		registry.registerBlock(ORE_IRON_SHAKURAS, "ore_iron_shakuras");
		registry.registerBlock(ORE_LAPIS_SHAKURAS, "ore_lapis_shakuras");
		registry.registerBlock(ORE_MINERAL_SHAKURAS, "ore_mineral_shakuras");
		registry.registerBlock(ORE_RICHMINERAL_SHAKURAS, "ore_richmineral_shakuras");
		registry.registerBlock(ORE_REDSTONE_SHAKURAS, "ore_redstone_shakuras");
		registry.registerBlock(ORE_TITANIUM_SHAKURAS, "ore_titanium_shakuras");
		registry.registerBlock(ORE_URANIUM_SHAKURAS, "ore_uranium_shakuras");
		registry.registerBlock(ORE_PHOSPHORUS_SHAKURAS, "ore_phosphorus_shakuras");
		registry.registerBlock(COBBLESTONE_ZERUS, "cobblestone_zerus");
		registry.registerBlock(STONE_ZERUS, "stone_zerus");
		registry.registerBlock(FARMLAND_ZERUS, "farmland_zerus");
		registry.registerBlock(DIRT_ZERUS, "dirt_zerus");
		registry.registerBlock(GRASS_ZERUS, "grass_zerus");
		registry.registerBlock(GRAVEL_ZERUS, "gravel_zerus");
		registry.registerBlock(SAND_ZERUS, "sand_zerus");
		registry.registerBlock(ORE_COAL_ZERUS, "ore_coal_zerus");
		registry.registerBlock(ORE_COPPER_ZERUS, "ore_copper_zerus");
		registry.registerBlock(ORE_DIAMOND_ZERUS, "ore_diamond_zerus");
		registry.registerBlock(ORE_GOLD_ZERUS, "ore_gold_zerus");
		registry.registerBlock(ORE_IRON_ZERUS, "ore_iron_zerus");
		registry.registerBlock(ORE_LAPIS_ZERUS, "ore_lapis_zerus");
		registry.registerBlock(ORE_MINERAL_ZERUS, "ore_mineral_zerus");
		registry.registerBlock(ORE_RICHMINERAL_ZERUS, "ore_richmineral_zerus");
		registry.registerBlock(ORE_REDSTONE_ZERUS, "ore_redstone_zerus");
		registry.registerBlock(ORE_TITANIUM_ZERUS, "ore_titanium_zeru");
		registry.registerBlock(ORE_URANIUM_ZERUS, "ore_uranium_zerus");
		registry.registerBlock(ORE_PHOSPHORUS_ZERUS, "ore_phosphorus_zerus");
		registry.registerBlock(COBBLESTONE_SLAYN, "cobblestone_slayn");
		registry.registerBlock(STONE_SLAYN, "stone_slayn");
		registry.registerBlock(FARMLAND_SLAYN, "farmland_slayn");
		registry.registerBlock(DIRT_SLAYN, "dirt_slayn");
		registry.registerBlock(SAND_SLAYN, "sand_slayn");
		registry.registerBlock(GRAVEL_SLAYN, "gravel_slayn");
		registry.registerBlock(ORE_COAL_SLAYN, "ore_coal_slayn");
		registry.registerBlock(ORE_COPPER_SLAYN, "ore_copper_slayn");
		registry.registerBlock(ORE_DIAMOND_SLAYN, "ore_diamond_slayn");
		registry.registerBlock(ORE_GOLD_SLAYN, "ore_gold_slayn");
		registry.registerBlock(ORE_IRON_SLAYN, "ore_iron_slayn");
		registry.registerBlock(ORE_LAPIS_SLAYN, "ore_lapis_slayn");
		registry.registerBlock(ORE_MINERAL_SLAYN, "ore_mineral_slayn");
		registry.registerBlock(ORE_RICHMINERAL_SLAYN, "ore_richmineral_slayn");
		registry.registerBlock(ORE_REDSTONE_SLAYN, "ore_redstone_slayn");
		registry.registerBlock(ORE_TITANIUM_SLAYN, "ore_titanium_slayn");
		registry.registerBlock(ORE_URANIUM_SLAYN, "ore_uranium_slayn");
		registry.registerBlock(ORE_PHOSPHORUS_SLAYN, "ore_phosphorus_slayn");
		registry.registerBlock(CITY_STONE_KORHAL, "city_stone_korhal");
		registry.registerBlock(FURNACE_SHAKURAS, "furnace_shakuras");
		registry.registerBlock(FURNACE_CHAR, "furnace_char");
		registry.registerBlock(FURNACE_SLAYN, "furnace_slayn");
		registry.registerBlock(FURNACE_ZERUS, "furnace_zerus");
		registry.registerBlock(FURNACE_PROTOSS, "furnace_protoss");
		registry.registerBlock(PROTOSS_SHIELD, "protoss_shield");
		registry.registerBlock(PROTOSS_VOID_ENERGY_CHANNEL, "protoss_void_energy_channel");
		registry.registerBlock(PROTOSS_VOID_ENERGY_STABILIZER, "protoss_void_energy_stabilizer");
		registry.registerBlock(PROTOSS_ENERGY_CHANNEL, "protoss_energy_channel");
		registry.registerBlock(PROTOSS_ENERGY_STABILIZER, "protoss_energy_stabilizer");
		registry.registerBlock(PROTOSS_DARK_ENERGY_CHANNEL, "protoss_dark_energy_channel");
		registry.registerBlock(PROTOSS_DARK_ENERGY_STABILIZER, "protoss_dark_energy_stabilizer");
		registry.registerBlock(PROTOSS_WORMHOLE, "protoss_wormhole");
		registry.registerBlock(PROTOSS_METAL_T1, "protoss_metal_t1");
		registry.registerBlock(PROTOSS_METAL_T2, "protoss_metal_t2");
		registry.registerBlock(PROTOSS_METAL_T3, "protoss_metal_t3");
		registry.registerBlock(PYLON_CRYSTAL, "pylon_crystal");
		registry.registerBlock(CORE_CYBERNETICSCORE_VOID, "core_cyberneticscore_void");
		registry.registerBlock(CORE_CYBERNETICSCORE_DARK, "core_cyberneticscore_dark");
		registry.registerBlock(CORE_CYBERNETICSCORE_KHALAI, "core_cyberneticscore_khalai");
		registry.registerBlock(CORE_PYLON_VOID, "core_pylon_void");
		registry.registerBlock(CORE_PYLON_DARK, "core_pylon_dark");
		registry.registerBlock(CORE_PYLON_KHALAI, "core_pylon_khalai");
		registry.registerBlock(CORE_WARPGATE_VOID, "core_warpgate_void");
		registry.registerBlock(CORE_WARPGATE_DARK, "core_warpgate_dark");
		registry.registerBlock(CORE_WARPGATE_KHALAI, "core_warpgate_khalai");
		registry.registerBlock(TERRAN_WARNING_TAPE, "terran_warning_tape");
		registry.registerBlock(TERRAN_METAL, "terran_metal");
		registry.registerBlock(NEOSTEEL_METAL, "neosteel_metal");
		registry.registerBlock(PARISTEEL_METAL, "paristeel_metal");
		registry.registerBlock(CORE_BARRACKS, "core_barracks");
		registry.registerBlock(CORE_COMMANDCENTER, "core_commandcenter");
		registry.registerBlock(ZERG_CREEP, "zerg_creep");
		registry.registerBlock(KERATIN_CHUNK, "keratin_chunk");
		registry.registerBlock(ZERG_CARAPACE_BLOCK, "zerg_carapace_block");
		registry.registerBlock(ZERG_FLESH, "zerg_flesh");
		registry.registerBlock(GAS_VESPENE, "gas_vespene");
		registry.registerBlock(GAS_TERRAZINE, "gas_terrazine");
		registry.registerBlock(FLORA_ZERUS_GLOW_POD, "flora_zerus_glow_pod");
		registry.registerBlock(FLORA_BRAMBLES, "flora_brambles", new ItemBlockBrambles());
		registry.registerBlock(FLORA_ZERUS_LIGHTCAP, "flora_zerus_lightcap");
		registry.registerBlock(DYNAMIC_COAL_ORE, "coal_ore");
		registry.registerBlock(DYNAMIC_IRON_ORE, "iron_ore");
		registry.registerBlock(DYNAMIC_GOLD_ORE, "gold_ore");
		registry.registerBlock(DYNAMIC_REDSTONE_ORE_UNLIT, "redstone_ore_unlit");
		registry.registerBlock(DYNAMIC_REDSTONE_ORE_LIT, "redstone_ore_lit");
		registry.registerBlock(DYNAMIC_DIAMOND_ORE, "diamond_ore");
		registry.registerBlock(DYNAMIC_LAPIS_ORE, "lapis_ore");
		registry.registerBlock(DYNAMIC_EMERALD_ORE, "emerald_ore");
	}
}
