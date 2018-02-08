package ga.scmc.handlers;

import org.lwjgl.input.Keyboard;

import ga.scmc.events.KeyEventHandler;
import ga.scmc.lib.Library;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeybindingHandler {

	public static final String STARCRAFT_CATEGORY = "key.categories." + Library.MODID;

	public static KeyBinding toggleMarineVisor;

	public static void preInit() {
		MinecraftForge.EVENT_BUS.register(new KeyEventHandler());

		toggleMarineVisor = new KeyBinding("key.terran.marinevisor.toggle", Keyboard.KEY_V, STARCRAFT_CATEGORY);

		ClientRegistry.registerKeyBinding(toggleMarineVisor);
	}
}