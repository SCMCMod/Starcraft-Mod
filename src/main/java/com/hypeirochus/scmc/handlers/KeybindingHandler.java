package com.hypeirochus.scmc.handlers;

import org.lwjgl.input.Keyboard;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.network.NetworkHandler;
import com.hypeirochus.scmc.network.message.MessageShipAbility;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

//TODO: Ocelot, why is the marine visor disabled??
public class KeybindingHandler {

	public static final String STARCRAFT_CATEGORY = "key.categories." + Starcraft.MOD_ID;

	public static KeyBinding toggleMarineVisor;
	public static KeyBinding shipAbilityOne;
	public static KeyBinding shipAbilityTwo;
	public static KeyBinding shipAbilityThree;

	public static void pre(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new KeyEventHandler());

		toggleMarineVisor = new KeyBinding("key.terran.marinevisor.toggle", Keyboard.KEY_V, STARCRAFT_CATEGORY);
		shipAbilityOne = new KeyBinding("key.ship.ability.1", Keyboard.KEY_Z, STARCRAFT_CATEGORY);
		shipAbilityTwo = new KeyBinding("key.ship.ability.2", Keyboard.KEY_X, STARCRAFT_CATEGORY);
		shipAbilityThree = new KeyBinding("key.ship.ability.3", Keyboard.KEY_C, STARCRAFT_CATEGORY);

		ClientRegistry.registerKeyBinding(toggleMarineVisor);
		ClientRegistry.registerKeyBinding(shipAbilityOne);
		ClientRegistry.registerKeyBinding(shipAbilityTwo);
		ClientRegistry.registerKeyBinding(shipAbilityThree);
	}

	private static class KeyEventHandler {

		@SubscribeEvent
		public void onKeyInput(InputEvent.KeyInputEvent event) {
			if (KeybindingHandler.toggleMarineVisor.isPressed()) {
				// GuiRenderEventHandler.renderHelmetOverlay = !GuiRenderEventHandler.renderHelmetOverlay;
			}

			if (KeybindingHandler.shipAbilityOne.isPressed()) {
				NetworkHandler.sendToServer(new MessageShipAbility(0));
			}

			if (KeybindingHandler.shipAbilityTwo.isPressed()) {
				NetworkHandler.sendToServer(new MessageShipAbility(1));
			}

			if (KeybindingHandler.shipAbilityThree.isPressed()) {
				NetworkHandler.sendToServer(new MessageShipAbility(2));
			}
		}
	}
}