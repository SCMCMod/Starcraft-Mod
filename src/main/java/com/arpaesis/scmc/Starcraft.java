package com.arpaesis.scmc;

import org.apache.logging.log4j.Logger;

import com.arpaesis.scmc.capabilities.Color;
import com.arpaesis.scmc.capabilities.ColorStorage;
import com.arpaesis.scmc.capabilities.IColor;
import com.arpaesis.scmc.capabilities.ILockedItems;
import com.arpaesis.scmc.capabilities.IShield;
import com.arpaesis.scmc.capabilities.LockedItems;
import com.arpaesis.scmc.capabilities.LockedItemsStorage;
import com.arpaesis.scmc.capabilities.Shield;
import com.arpaesis.scmc.capabilities.ShieldStorage;
import com.arpaesis.scmc.command.CommandDimension;
import com.arpaesis.scmc.config.SCConfig;
import com.arpaesis.scmc.events.GuiRenderEventHandler;
import com.arpaesis.scmc.events.SCEventHandler;
import com.arpaesis.scmc.handlers.AccessHandler;
import com.arpaesis.scmc.handlers.CapabilityHandler;
import com.arpaesis.scmc.handlers.EntityHandler;
import com.arpaesis.scmc.handlers.FluidHandler;
import com.arpaesis.scmc.handlers.GuiHandler;
import com.arpaesis.scmc.handlers.KeybindingHandler;
import com.arpaesis.scmc.handlers.RenderHandler;
import com.arpaesis.scmc.handlers.SoundHandler;
import com.arpaesis.scmc.handlers.WavefrontModelHandler;
import com.arpaesis.scmc.lib.Library;
import com.arpaesis.scmc.log.LogRegistry;
import com.arpaesis.scmc.network.NetworkHandler;
import com.arpaesis.scmc.proxy.CommonProxy;
import com.arpaesis.scmc.recipes.OreDictionaryHandler;
import com.arpaesis.scmc.recipes.SmeltingRecipes;
import com.arpaesis.scmc.registry.Registry;

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
 * <br>
 * </br>
 * The main Starcraft Mod class. Registers and sets everything into motion when
 * the game starts up.
 * 
 * @author Hypeirochus
 * @author Ocelot
 */
@Mod(modid = Starcraft.MOD_ID, acceptedMinecraftVersions = "[1.12,1.12.2]", useMetadata = true, guiFactory = "com.arpaesis.scmc.config.StarcraftConfigGuiFactory")
public class Starcraft
{

	public static final String MOD_ID = "starcraft";
	public static final String RL_BASE = MOD_ID + ":";
	public static final String UN_BASE = MOD_ID + "_";
	public static final String VERSION = "2.1.810";

	/** The mod's instance. Used for GUI stuff. */
	@Instance(MOD_ID)
	public static Starcraft instance;

	/** The common proxy instance */
	@SidedProxy(clientSide = "com.arpaesis.scmc.proxy.ClientProxy", serverSide = "com.arpaesis.scmc.proxy.ServerProxy")
	public static CommonProxy proxy;

	private static Logger logger;
	private static LogRegistry logRegistry = new LogRegistry();

	static
	{
		FluidRegistry.enableUniversalBucket();
	}

	/** Pre Initialization **/
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();

		MinecraftForge.EVENT_BUS.register(new Registry());

		SCConfig.pre(event);
		NetworkHandler.pre(event);
		FluidHandler.pre(event);
		SoundHandler.pre(event);
		EntityHandler.pre(event);

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			SCConfig.clientPre(event);
			WavefrontModelHandler.pre(event);
			KeybindingHandler.pre(event);
		}

		if (AccessHandler.isDeobfuscatedEnvironment())
		{
			logger.info("Pre Initialized");
		}
		
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			RenderHandler.init(event);
		}
	}

	/** Initialization **/
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		EntityHandler.init(event);
		OreDictionaryHandler.init(event);
		SmeltingRecipes.init(event);
		GuiHandler.init(event);
		CapabilityHandler.init(event);

		// TODO move this to a capability handler
		CapabilityManager.INSTANCE.register(IColor.class, new ColorStorage(), Color::new);
		CapabilityManager.INSTANCE.register(IShield.class, new ShieldStorage(), Shield::new);
		CapabilityManager.INSTANCE.register(ILockedItems.class, new LockedItemsStorage(), LockedItems::new);

		MinecraftForge.EVENT_BUS.register(new com.arpaesis.scmc.capabilities.CapabilityHandler());
		MinecraftForge.EVENT_BUS.register(new SCEventHandler());

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			MinecraftForge.EVENT_BUS.register(new GuiRenderEventHandler());
			logs().init();
		}

		if (AccessHandler.isDeobfuscatedEnvironment())
		{
			logger.info("Initialized");
		}
	}

	/** Post Initialization **/
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		Library.checkMods();

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			Registry.registerColors(Minecraft.getMinecraft().getItemColors(), Minecraft.getMinecraft().getBlockColors());
		}

		if (AccessHandler.isDeobfuscatedEnvironment())
		{
			logger.info("Post Initialized");
		}
	}

	@EventHandler
	public static void onServerStartingEvent(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandDimension());
	}

	public static Logger logger()
	{
		return logger;
	}

	public static LogRegistry logs()
	{
		if (logRegistry == null)
			logRegistry = new LogRegistry();
		return logRegistry;
	}
}