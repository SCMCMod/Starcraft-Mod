package com.arpaesis.scmc;

import net.minecraftforge.common.ForgeVersion;

/**
 * The Class Constants.
 */
public class SCConstants {


    public static final double RENDERDISTANCE_SHORT = 16384D;
    public static final double RENDERDISTANCE_MEDIUM = 65536D;
    public static final double RENDERDISTANCE_LONG = 262144D;
    public static final float RADIANS_TO_DEGREES = 180F / 3.1415927F;
    public static final double RADIANS_TO_DEGREES_D = 180D / Math.PI;
    public static final float twoPI = (float) Math.PI * 2F;
    public static final float halfPI = (float) Math.PI / 2F;
    public static final double twoPI_D = Math.PI * 2.0D;
    public static final double halfPI_D = Math.PI / 2.0D;
    
	public static final String MODID = "starcraft";
	public static final String NAME = "Starcraft-Mod";
	public static final String BUILD = "@BUILD@";
	public static final String VERSION = "@VERSION@";
	//public static final String FINGERPRINT = "";
	public static final String FULL_VERSION = VERSION + "." + BUILD;
	public static final String ACCEPTED_MC_VERSIONS = "[1.12.2]";
	public static final String ACCEPTED_MC_VERSION = ForgeVersion.mcVersion;
	public static final String DEPENDENCIES_MODS = "required-after:readonlycore@[1.12.2-1.0.9.0,]";
	public static final String GUI_FACTORY = "com.arpaesis.scmc.config.StarcraftConfigGuiFactory";
	public static final String CLIENT = "com.arpaesis.scmc.proxy.ClientProxy";
	public static final String COMMON = "com.arpaesis.scmc.proxy.ServerProxy";

}
