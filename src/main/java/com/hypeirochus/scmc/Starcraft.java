package com.hypeirochus.scmc;

import org.apache.logging.log4j.Logger;

import com.hypeirochus.scmc.capabilities.Color;
import com.hypeirochus.scmc.capabilities.ColorStorage;
import com.hypeirochus.scmc.capabilities.IColor;
import com.hypeirochus.scmc.capabilities.IShield;
import com.hypeirochus.scmc.capabilities.Shield;
import com.hypeirochus.scmc.capabilities.ShieldStorage;
import com.hypeirochus.scmc.command.CommandDimension;
import com.hypeirochus.scmc.events.GuiRenderOverlay;
import com.hypeirochus.scmc.handlers.ConfigHandler;
import com.hypeirochus.scmc.handlers.EntityHandler;
import com.hypeirochus.scmc.handlers.GuiHandler;
import com.hypeirochus.scmc.handlers.KeybindingHandler;
import com.hypeirochus.scmc.handlers.RenderHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.handlers.WavefrontModelHandler;
import com.hypeirochus.scmc.log.LogRegistry;
import com.hypeirochus.scmc.network.NetworkHandler;
import com.hypeirochus.scmc.proxy.CommonProxy;
import com.hypeirochus.scmc.recipes.OreDictionaryHandler;
import com.hypeirochus.scmc.recipes.SmeltingRecipes;
import com.hypeirochus.scmc.registry.Registry;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * The main Starcraft mod class<br>
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * @author Hypeirochus
 * @author Ocelot
 */
@Mod(modid = Starcraft.MOD_ID, acceptedMinecraftVersions = "[1.12][1.12.2]", useMetadata = true, version = "${version}")
public class Starcraft {

	public static final String MOD_ID = "starcraft";
	public static final String RL_BASE = MOD_ID + ":";
	public static final String UN_BASE = MOD_ID + "_";

	/** The mod's instance. Used for GUI stuff. */
	@Instance(MOD_ID)
	public static Starcraft instance;

	/** The common proxy instance */
	@SidedProxy(clientSide = "com.hypeirochus.scmc.proxy.ClientProxy", serverSide = "com.hypeirochus.scmc.proxy.ServerProxy")
	public static CommonProxy proxy;

	private static Logger logger;
	private static LogRegistry logRegistry = new LogRegistry();

	static {
		FluidRegistry.enableUniversalBucket();
	}

	/** Pre Initialization **/
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();

		MinecraftForge.EVENT_BUS.register(new Registry());

		ConfigHandler.pre(event);
		NetworkHandler.pre(event);
		// MaterialHandler.pre(event);
		// FluidHandler.pre(event);
		SoundHandler.pre(event);
		// BlockHandler.pre(event);
		// WorldGenerationHandler.pre(event);
		// BiomeHandler.pre(event);
		// DimensionHandler.pre(event);
		// EntityHandler.pre(event);

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new GuiRenderOverlay());
			WavefrontModelHandler.pre(event);
			RenderHandler.pre(event);
			KeybindingHandler.pre(event);
		}
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		EntityHandler.init(event);
		OreDictionaryHandler.init(event);
		SmeltingRecipes.init(event);
		GuiHandler.init(event);

		CapabilityManager.INSTANCE.register(IColor.class, new ColorStorage(), Color::new);
		CapabilityManager.INSTANCE.register(IShield.class, new ShieldStorage(), Shield::new);

		// MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
		// MinecraftForge.EVENT_BUS.register(new OnPlayerLoggedInEvent());

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			// logRegistry = new LogRegistry();
			// MinecraftForge.EVENT_BUS.register(new GuiRenderEventHandler());
			// RenderHandler.init(event);
			// getLogRegistry().init(event);
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
		}
	}

	@EventHandler
	public static void onServerStartingEvent(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandDimension());
	}

	public static Logger logger() {
		return logger;
	}

	public static LogRegistry getLogRegistry() {
		return logRegistry;
	}
}