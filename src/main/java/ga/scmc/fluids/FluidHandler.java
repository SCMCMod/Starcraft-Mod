package ga.scmc.fluids;

import ga.scmc.handlers.BlockHandler;
import ga.scmc.lib.Library;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Holds all the mod's fluids.
 */
public class FluidHandler {

	public static Fluid acid = new Fluid("fluid_acid", new ResourceLocation(Library.RL_BASE + "blocks/acid_fluid_still"), new ResourceLocation(Library.RL_BASE + "blocks/acid_fluid_flowing")).setBlock(BlockHandler.FLUID_ACID);
	public static Fluid blood = new Fluid("fluid_blood", new ResourceLocation(Library.RL_BASE + "blocks/blood_fluid_still"), new ResourceLocation(Library.RL_BASE + "blocks/blood_fluid_flowing")).setBlock(BlockHandler.FLUID_BLOOD);
	/** @author Ocelot5836 */
	public static Fluid vespene = new Fluid("fluid_vespene", new ResourceLocation(Library.RL_BASE + "blocks/vespene_fluid_still"), new ResourceLocation(Library.RL_BASE + "blocks/vespene_fluid_flowing")).setBlock(BlockHandler.FLUID_VESPENE);
	/** @author Ocelot5836 */
	public static Fluid terrazine = new Fluid("fluid_terrazine", new ResourceLocation(Library.RL_BASE + "blocks/terrazine_fluid_still"), new ResourceLocation(Library.RL_BASE + "blocks/terrazine_fluid_flowing")).setBlock(BlockHandler.FLUID_TERRAZINE);

	/**
	 * Registers the fluids.
	 */
	public static void preInit() {
	    register();
	}
	
	private static void register() {
        registerFluid("fluidAcid", acid);
        registerFluid("fluidBlood", blood);
        registerFluid("fluidVespene", vespene);
        registerFluid("fluidTerrazine", terrazine);
	}
	
	private static void registerFluid(String id, Fluid fluid) {
        fluid.setUnlocalizedName(id);
        FluidRegistry.registerFluid(fluid);
	}
}