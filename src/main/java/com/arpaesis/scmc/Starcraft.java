package com.arpaesis.scmc;

import javax.annotation.ParametersAreNonnullByDefault;

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
import com.arpaesis.scmc.handlers.CapabilityHandler;
import com.arpaesis.scmc.handlers.EntityHandler;
import com.arpaesis.scmc.handlers.GuiHandler;
import com.arpaesis.scmc.handlers.KeybindingHandler;
import com.arpaesis.scmc.handlers.RenderHandler;
import com.arpaesis.scmc.handlers.SoundHandler;
import com.arpaesis.scmc.handlers.WavefrontModelHandler;
import com.arpaesis.scmc.lib.Library;
import com.arpaesis.scmc.network.NetworkHandler;
import com.arpaesis.scmc.proxy.CommonProxy;
import com.arpaesis.scmc.recipes.OreDictionaryHandler;
import com.arpaesis.scmc.recipes.SmeltingRecipes;

import mcp.MethodsReturnNonnullByDefault;
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
import net.rom.base.IMod;
import net.rom.registry.ReadOnlyRegistry;
import net.rom.utils.ModLogger;
import net.rom.utils.TranslateUtil;

@Mod(modid = SCConstants.MODID, acceptedMinecraftVersions = SCConstants.ACCEPTED_MC_VERSIONS, guiFactory = SCConstants.GUI_FACTORY)
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class Starcraft implements IMod {


	@Instance(SCConstants.MODID)
	public static Starcraft instance;
	public static ReadOnlyRegistry registry = new ReadOnlyRegistry();
	public static TranslateUtil translate = new TranslateUtil(SCConstants.MODID);
	public static ModLogger logger = new ModLogger(SCConstants.MODID, Integer.parseInt(SCConstants.BUILD));
	
	@SidedProxy(clientSide = SCConstants.CLIENT, serverSide = SCConstants.COMMON)
	public static CommonProxy proxy;


	static {
		FluidRegistry.enableUniversalBucket();
	}

	/** Pre Initialization **/
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		registry.setMod(this);
		registry.getRecipeMaker();
		SCConfig.pre(event);

		NetworkHandler.pre(event);
		SoundHandler.pre(event);
		EntityHandler.pre(event);

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			SCConfig.clientPre(event);
			WavefrontModelHandler.pre(event);
			KeybindingHandler.pre(event);
		}

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			RenderHandler.init(event);
		}
		//// Above ////
		proxy.preInit(registry, event);
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

		MinecraftForge.EVENT_BUS.register(new com.arpaesis.scmc.capabilities.CapabilityHandler());
		MinecraftForge.EVENT_BUS.register(new SCEventHandler());

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new GuiRenderEventHandler());
		}
		
		//// Above ////
		proxy.init(registry, event);
	}

	/** Post Initialization **/
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Library.checkMods();
		
		//// Above ////
		proxy.postInit(registry, event);
	}

	@EventHandler
	public static void onServerStartingEvent(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandDimension());
	}

	@Override
	public String getModId() {
		return SCConstants.MODID;
	}

	@Override
	public String getModName() {
		return SCConstants.NAME;
	}

	@Override
	public String getVersion() {
		return SCConstants.FULL_VERSION;
	}

	@Override
	public int getBuildNum() {
		return Integer.parseInt(SCConstants.BUILD);
	}
}
