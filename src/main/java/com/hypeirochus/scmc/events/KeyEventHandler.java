package com.hypeirochus.scmc.events;

import com.hypeirochus.scmc.handlers.KeybindingHandler;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyEventHandler {

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (KeybindingHandler.toggleMarineVisor.isPressed()) {
			// GuiRenderEventHandler.renderHelmetOverlay = !GuiRenderEventHandler.renderHelmetOverlay;
		}
	}
}