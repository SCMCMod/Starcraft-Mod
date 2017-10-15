package ga.scmc;

import ga.scmc.achievement.Achievements;
import ga.scmc.client.gui.GuiHandler;
import ga.scmc.fluids.FluidHandler;
import ga.scmc.handlers.BiomeHandler;
import ga.scmc.handlers.BlockHandler;
import ga.scmc.handlers.ConfigurationHandler;
import ga.scmc.handlers.DimensionHandler;
import ga.scmc.handlers.EntityHandler;
import ga.scmc.handlers.FuelHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.handlers.MaterialHandler;
import ga.scmc.handlers.RenderingHandler;
import ga.scmc.handlers.SoundHandler;
import ga.scmc.handlers.WavefrontModelHandler;
import ga.scmc.handlers.WorldGenerationHandler;
import ga.scmc.lib.Library;
import ga.scmc.network.NetworkHandler;
import ga.scmc.proxy.CommonProxy;
import ga.scmc.recipes.ShapelessRecipes;
import ga.scmc.recipes.SimpleRecipes;
import ga.scmc.recipes.SmeltingRecipes;
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
@Mod(modid = Library.MODID, acceptedMinecraftVersions = "[1.10.2]", useMetadata = true, version = "1.6", dependencies = "required-after:mdxlib")
public class Starcraft {

	/** The mod's instance. Used for GUI stuff. */
	@Instance(Library.MODID)
	public static Starcraft instance;

	/** The common proxy instance */
	@SidedProxy(clientSide = Library.CLIENT_SIDE_PROXY, serverSide = Library.SERVER_SIDE_PROXY)
	public static CommonProxy proxy;

	static {
		FluidRegistry.enableUniversalBucket();
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.preInit();

		NetworkHandler.init();
		MaterialHandler.preInit();
		FluidHandler.preInit();
		SoundHandler.preInit();
		BlockHandler.preInit();
		ItemHandler.preInit();
		WorldGenerationHandler.preInit();
		BiomeHandler.preInit();
		DimensionHandler.preInit();
		EntityHandler.preInit();

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			WavefrontModelHandler.preInit();
			FuelHandler.preInit();
			RenderingHandler.preInit();
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

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			RenderingHandler.init();
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
		}
	}
}