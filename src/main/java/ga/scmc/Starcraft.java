package ga.scmc;

import org.apache.logging.log4j.Logger;

import ga.scmc.achievement.Achievements;
import ga.scmc.capabilities.CapabilityHandler;
import ga.scmc.capabilities.Color;
import ga.scmc.capabilities.ColorStorage;
import ga.scmc.capabilities.IColor;
import ga.scmc.capabilities.IShield;
import ga.scmc.capabilities.Shield;
import ga.scmc.capabilities.ShieldStorage;
import ga.scmc.events.GuiRenderEventHandler;
import ga.scmc.events.OnPlayerLoggedInEvent;
import ga.scmc.handlers.BiomeHandler;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.DimensionHandler;
import ga.scmc.handlers.EntityHandler;
import ga.scmc.handlers.FluidHandler;
import ga.scmc.handlers.FuelHandler;
import ga.scmc.handlers.GuiHandler;
import ga.scmc.handlers.KeybindingHandler;
import ga.scmc.handlers.MaterialHandler;
import ga.scmc.handlers.RenderingHandler;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.handlers.WavefrontModelHandler;
import ga.scmc.handlers.WorldGenerationHandler;
import ga.scmc.lib.Library;
import ga.scmc.log.LogRegistry;
import ga.scmc.network.NetworkHandler;
import ga.scmc.proxy.CommonProxy;
import ga.scmc.recipes.OreDictionaryHandler;
import ga.scmc.recipes.ShapelessRecipes;
import ga.scmc.recipes.SimpleRecipes;
import ga.scmc.recipes.SmeltingRecipes;
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
import net.minecraftforge.fml.relauncher.Side;

/**
 * The main Starcraft mod class<br>
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * @author Hypeirochus
 * @author wundrweapon
 */
@Mod(modid = Library.MODID, acceptedMinecraftVersions = "[1.10.2]", useMetadata = true, version = "${version}", dependencies = "required-after:mdxlib")
public class Starcraft {

	/** The mod's instance. Used for GUI stuff. */
	@Instance(Library.MODID)
	public static Starcraft instance;

	/** The common proxy instance */
	@SidedProxy(clientSide = Library.CLIENT_SIDE_PROXY, serverSide = Library.SERVER_SIDE_PROXY)
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

		ConfigurationHandler.preInit();

		NetworkHandler.preInit();
		MaterialHandler.preInit();
		FluidHandler.preInit();
		SoundHandler.preInit();
		BlockHandler.preInit();
		OreDictionaryHandler.preInit();
		WorldGenerationHandler.preInit();
		BiomeHandler.preInit();
		DimensionHandler.preInit();
		EntityHandler.preInit();

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			WavefrontModelHandler.preInit();
			FuelHandler.preInit();
			RenderingHandler.preInit();
			KeybindingHandler.preInit();
		}
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		EntityHandler.init();
		Achievements.init();
		SimpleRecipes.init();
		ShapelessRecipes.init();
		SmeltingRecipes.init();
		GuiHandler.init();
		CapabilityManager.INSTANCE.register(IColor.class, new ColorStorage(), Color.class);
		CapabilityManager.INSTANCE.register(IShield.class, new ShieldStorage(), Shield.class);

		MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
		MinecraftForge.EVENT_BUS.register(new OnPlayerLoggedInEvent());
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new GuiRenderEventHandler());
			RenderingHandler.init();
			getLogRegistry().init();
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
		}
	}

	public static Logger getLogger() {
		return logger;
	}

	public static LogRegistry getLogRegistry() {
		return logRegistry;
	}
}