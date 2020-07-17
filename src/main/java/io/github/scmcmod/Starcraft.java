package io.github.scmcmod;

import javax.annotation.ParametersAreNonnullByDefault;

import io.github.scmcmod.capabilities.Color;
import io.github.scmcmod.capabilities.ColorStorage;
import io.github.scmcmod.capabilities.IColor;
import io.github.scmcmod.capabilities.ILockedItems;
import io.github.scmcmod.capabilities.IShield;
import io.github.scmcmod.capabilities.LockedItems;
import io.github.scmcmod.capabilities.LockedItemsStorage;
import io.github.scmcmod.capabilities.Shield;
import io.github.scmcmod.capabilities.ShieldStorage;
import io.github.scmcmod.command.CommandDimension;
import io.github.scmcmod.config.SCConfig;
import io.github.scmcmod.events.GuiRenderEventHandler;
import io.github.scmcmod.events.SCEventHandler;
import io.github.scmcmod.handlers.*;
import io.github.scmcmod.init.StarCraftBlocks;
import io.github.scmcmod.init.StarCraftItems;
import io.github.scmcmod.lib.Library;
import io.github.scmcmod.network.NetworkHandler;
import io.github.scmcmod.proxy.CommonProxy;
import io.github.scmcmod.recipes.OreDictionaryHandler;
import io.github.scmcmod.recipes.SmeltingRecipes;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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
	public static ModLogger logger = new ModLogger(SCConstants.MODID, Integer.parseInt(SCConstants.BUILD == "@BUILD@" ? "1" : SCConstants.BUILD));

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

		// Register Block
		registry.addRegistrationHandler(StarCraftBlocks::registerAll, Block.class);
		// Register Item
		registry.addRegistrationHandler(StarCraftItems::registerAll, Item.class);

		SCConfig.pre(event);

		MaterialHandler.init();
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

		MinecraftForge.EVENT_BUS.register(new io.github.scmcmod.capabilities.CapabilityHandler());
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
