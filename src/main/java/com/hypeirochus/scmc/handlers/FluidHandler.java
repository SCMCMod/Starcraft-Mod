package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Holds all the mod's fluids.
 */
public class FluidHandler {

	public static final Fluid	ACID		= new Fluid("fluid.acid", new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.acid.still"), new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.acid.flowing")).setBlock(BlockHandler.ACID);
	public static final Fluid	BLOOD		= new Fluid("fluid.blood", new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.blood.still"), new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.blood.flowing")).setBlock(BlockHandler.BLOOD);
	public static final Fluid	VESPENE		= new Fluid("fluid.vespene", new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.vespene.still"), new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.vespene.flowing")).setBlock(BlockHandler.VESPENE);
	public static final Fluid	TERRAZINE	= new Fluid("fluid.terrazine", new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.terrazine.still"), new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.terrazine.flowing")).setBlock(BlockHandler.TERRAZINE);
	public static final Fluid	TAR			= new Fluid("fluid.tar", new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.tar.still"), new ResourceLocation(Starcraft.RL_BASE + "blocks/fluid.tar.flowing")).setBlock(BlockHandler.TAR).setViscosity(6000).setDensity(3000);

	/**
	 * Registers the fluids.
	 */
	public static void pre(FMLPreInitializationEvent event) {
		register();
	}

	private static void register() {
		registerFluid("fluid.acid", ACID);
		registerFluid("fluid.blood", BLOOD);
		registerFluid("fluid.vespene", VESPENE);
		registerFluid("fluid.terrazine", TERRAZINE);
		registerFluid("fluid.tar", TAR);
	}

	private static void registerFluid(String id, Fluid fluid) {
		fluid.setUnlocalizedName(id);
		FluidRegistry.registerFluid(fluid);
	}
}