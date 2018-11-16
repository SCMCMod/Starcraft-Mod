package com.hypeirochus.scmc;

import org.apache.logging.log4j.Logger;

import com.hypeirochus.scmc.capabilities.Color;
import com.hypeirochus.scmc.capabilities.ColorStorage;
import com.hypeirochus.scmc.capabilities.IColor;
import com.hypeirochus.scmc.capabilities.ILockedItems;
import com.hypeirochus.scmc.capabilities.IShield;
import com.hypeirochus.scmc.capabilities.LockedItems;
import com.hypeirochus.scmc.capabilities.LockedItemsStorage;
import com.hypeirochus.scmc.capabilities.Shield;
import com.hypeirochus.scmc.capabilities.ShieldStorage;
import com.hypeirochus.scmc.command.CommandDimension;
import com.hypeirochus.scmc.config.StarcraftConfig;
import com.hypeirochus.scmc.events.GuiRenderEventHandler;
import com.hypeirochus.scmc.events.StarcraftEventHandler;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.handlers.CapabilityHandler;
import com.hypeirochus.scmc.handlers.EntityHandler;
import com.hypeirochus.scmc.handlers.FluidHandler;
import com.hypeirochus.scmc.handlers.GuiHandler;
import com.hypeirochus.scmc.handlers.KeybindingHandler;
import com.hypeirochus.scmc.handlers.RenderHandler;
import com.hypeirochus.scmc.handlers.SoundHandler;
import com.hypeirochus.scmc.handlers.WavefrontModelHandler;
import com.hypeirochus.scmc.lib.Library;
import com.hypeirochus.scmc.log.LogRegistry;
import com.hypeirochus.scmc.network.NetworkHandler;
import com.hypeirochus.scmc.proxy.CommonProxy;
import com.hypeirochus.scmc.recipes.OreDictionaryHandler;
import com.hypeirochus.scmc.recipes.SmeltingRecipes;
import com.hypeirochus.scmc.registry.Registry;

import net.minecraft.client.Minecraft;
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
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * The main Starcraft Mod class. Registers and sets everything into motion when the game starts up.
 * 
 * @author Hypeirochus
 * @author Ocelot
 */
@Mod(modid = Starcraft.MOD_ID, acceptedMinecraftVersions = "[1.12,1.12.2]", useMetadata = true, guiFactory = "com.hypeirochus.scmc.config.StarcraftConfigGuiFactory")
public class Starcraft {

	public static final String MOD_ID = "starcraft";
	public static final String RL_BASE = MOD_ID + ":";
	public static final String UN_BASE = MOD_ID + "_";
	public static final String VERSION = "2.1.810";

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

		StarcraftConfig.pre(event);
		NetworkHandler.pre(event);
		FluidHandler.pre(event);
		SoundHandler.pre(event);
		EntityHandler.pre(event);

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			StarcraftConfig.clientPre(event);
			WavefrontModelHandler.pre(event);
			KeybindingHandler.pre(event);
		}

		if (AccessHandler.isDeobfuscatedEnvironment()) {
			logger.info("Pre Initialized");
		}
	}

	/** Initialization **/
	@EventHandler
	public void init(FMLInitializationEvent event) {
		EntityHandler.init(event);
		OreDictionaryHandler.init(event);
		SmeltingRecipes.init(event);
		GuiHandler.init(event);
		CapabilityHandler.init(event);

		// TODO move this to a capability handler
		CapabilityManager.INSTANCE.register(IColor.class, new ColorStorage(), Color::new);
		CapabilityManager.INSTANCE.register(IShield.class, new ShieldStorage(), Shield::new);
		CapabilityManager.INSTANCE.register(ILockedItems.class, new LockedItemsStorage(), LockedItems::new);

		MinecraftForge.EVENT_BUS.register(new com.hypeirochus.scmc.capabilities.CapabilityHandler());
		MinecraftForge.EVENT_BUS.register(new StarcraftEventHandler());

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			RenderHandler.init(event);
			MinecraftForge.EVENT_BUS.register(new GuiRenderEventHandler());
			logs().init();
		}

		if (AccessHandler.isDeobfuscatedEnvironment()) {
			logger.info("Initialized");
		}
	}

	/** Post Initialization **/
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Library.checkMods();

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			Registry.registerColors(Minecraft.getMinecraft().getItemColors(), Minecraft.getMinecraft().getBlockColors());
		}

		if (AccessHandler.isDeobfuscatedEnvironment()) {
			logger.info("Post Initialized");
		}
	}

	@EventHandler
	public static void onServerStartingEvent(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandDimension());
	}

	public static Logger logger() {
		return logger;
	}

	public static LogRegistry logs() {
		if (logRegistry == null)
			logRegistry = new LogRegistry();
		return logRegistry;
	}
}