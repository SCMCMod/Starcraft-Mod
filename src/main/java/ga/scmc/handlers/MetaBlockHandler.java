package ga.scmc.handlers;

import ga.scmc.blocks.itemblocks.ItemBlockMeta;
import ga.scmc.blocks.metablocks.BlockEnergy;
import ga.scmc.blocks.metablocks.BlockGasCollector;
import ga.scmc.blocks.metablocks.BlockKhaydarinCrystal;
import ga.scmc.blocks.metablocks.BlockMineral;
import ga.scmc.blocks.metablocks.BlockNeosteel;
import ga.scmc.blocks.metablocks.BlockParisteel;
import ga.scmc.blocks.metablocks.BlockPlanetSurface;
import ga.scmc.blocks.metablocks.BlockProtossMetalT1;
import ga.scmc.blocks.metablocks.BlockProtossMetalT2;
import ga.scmc.blocks.metablocks.BlockProtossMetalT3;
import ga.scmc.blocks.metablocks.BlockStarSurface;
import ga.scmc.blocks.metablocks.BlockTerranMetal;
import ga.scmc.blocks.metablocks.BlockZergCarapace;
import ga.scmc.blocks.metablocks.BlockZergFlesh;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Holds all the blocks that have metadata.
 */
public class MetaBlockHandler {

	public static Block PROTOSS_METAL_T1 = new BlockProtossMetalT1();
	public static Block PROTOSS_METAL_T2 = new BlockProtossMetalT2();
	public static Block PROTOSS_METAL_T3 = new BlockProtossMetalT3();
	public static Block ENERGY = new BlockEnergy();
	public static Block PYLON_CRYSTAL = new BlockKhaydarinCrystal();
	public static Block ZERG_CARAPACE_BLOCK = new BlockZergCarapace();
	public static Block ZERG_FLESH = new BlockZergFlesh();
	public static Block COMP_METAL_T1 = new BlockTerranMetal();
	public static Block NEOSTEEL_METAL = new BlockNeosteel();
	public static Block PARISTEEL_METAL = new BlockParisteel();
	public static Block COMP_MINERAL = new BlockMineral();
	public static Block GAS_COLLECTOR = new BlockGasCollector();
	public static Block STAR_SURFACE = new BlockStarSurface();
	public static Block PLANET_SURFACE = new BlockPlanetSurface();

	/**
	 * Registers the blocks and items.
	 */
	public static void init() {
		register();
	}
	
	/**
	 * Register the blocks.
	 */
	private static void register() {
		registerBlock(PROTOSS_METAL_T1);
		registerBlock(PROTOSS_METAL_T2);
		registerBlock(PROTOSS_METAL_T3);
		registerBlock(ENERGY);
		registerBlock(PYLON_CRYSTAL);
		registerBlock(ZERG_CARAPACE_BLOCK);
		registerBlock(ZERG_FLESH);
		registerBlock(COMP_METAL_T1);
		registerBlock(NEOSTEEL_METAL);
		registerBlock(PARISTEEL_METAL);
		registerBlock(COMP_MINERAL);
		registerBlock(GAS_COLLECTOR);
		registerBlock(STAR_SURFACE);
		registerBlock(PLANET_SURFACE);
	}

	/**
	 * Registers the block with a custom {@link ItemBlock} based on the block given.
	 * 
	 * @param block
	 *            The block
	 */
	public static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		ForgeRegistries.ITEMS.register(new ItemBlockMeta(block).setRegistryName(block.getRegistryName()));
	}
}