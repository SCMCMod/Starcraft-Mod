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
import com.hypeirochus.scmc.enchantment.EnchantmentGlowing;
import com.hypeirochus.scmc.enums.EnumWorldType;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentMending;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class EnchantmentHandler {

	public static List<Enchantment> enchantments;
	
	public static Enchantment GLOWING;

	private static void init() {
		enchantments = new ArrayList<Enchantment>();
		
		instantiate();
	}

	private static void instantiate() {
		GLOWING = new EnchantmentGlowing();
	}

	/**
	 * Registers an enchantment.
	 * 
	 * @param enchantment
	 *            The enchantment to register
	 */
	public static void register(Enchantment enchantment) {
		enchantments.add(enchantment);
	}

	/**
	 * Used for registry.
	 * 
	 * @return The list of blocks to be registered
	 */
	public static Enchantment[] getEnchantments() {
		if (enchantments == null)
			init();
		return enchantments.toArray(new Enchantment[enchantments.size()]);
	}
}