package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.worldgen.dimaiur.WorldProviderAiur;
import com.hypeirochus.scmc.worldgen.dimchar.WorldProviderChar;
import com.hypeirochus.scmc.worldgen.dimkaldir.WorldProviderKaldir;
import com.hypeirochus.scmc.worldgen.dimkorhal.WorldProviderKorhal;
import com.hypeirochus.scmc.worldgen.dimshakuras.WorldProviderShakuras;
import com.hypeirochus.scmc.worldgen.dimslayn.WorldProviderSlayn;
import com.hypeirochus.scmc.worldgen.dimspace.WorldProviderSpace;
import com.hypeirochus.scmc.worldgen.dimzerus.WorldProviderZerus;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;

public class DimensionHandler {

	public static DimensionType char_dt;
	public static DimensionType shakuras_dt;
	public static DimensionType slayn_dt;
	public static DimensionType korhal_dt;
	public static DimensionType kaldir_dt;
	public static DimensionType aiur_dt;
	public static DimensionType zerus_dt;
	public static DimensionType space_dt;

	public static void init() {
		char_dt     = registerDim("Char"    , WorldProviderChar.class    , false);
		shakuras_dt = registerDim("Shakuras", WorldProviderShakuras.class, false);
		slayn_dt    = registerDim("Slayn"   , WorldProviderSlayn.class   , false);
		korhal_dt   = registerDim("Korhal"  , WorldProviderKorhal.class  , false);
		kaldir_dt   = registerDim("Kaldir"  , WorldProviderKaldir.class  , false);
		aiur_dt     = registerDim("Aiur"    , WorldProviderAiur.class    , false);
		zerus_dt    = registerDim("Zerus"   , WorldProviderZerus.class   , false);
		space_dt    = registerDim("Space"   , WorldProviderSpace.class   , false);
	}

	private static DimensionType registerDim(String name, Class<? extends WorldProvider> clazz, boolean keepLoaded) {
		int id = DimensionManager.getNextFreeDimId();
		DimensionType type = registerDimType(name, clazz, keepLoaded, id);
		DimensionManager.registerDimension(id, type);
		return type;
	}

	public static DimensionType registerDimType(String name, Class<? extends WorldProvider> clazz, boolean keepLoaded, int id) {
		return DimensionType.register(name, "_starcraft", id, clazz, keepLoaded);
	}
}