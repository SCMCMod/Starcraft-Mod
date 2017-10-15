package ga.scmc.events;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Shows a little overlay of how much mineral and vespene you have. <br>
 * Copyright (c) 2017 the Starcraft Minecraft (SCMC) mod team
 * 
 * @author Ocelot5836
 */
@EventBusSubscriber
public class GuiOverlayEvent {

	public static int vespene;

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onRenderGameOverlayEvent(RenderGameOverlayEvent event) {
//		Minecraft mc = Minecraft.getMinecraft();
//		if (event.getType() == ElementType.TEXT) {
//			GuiIngame gui = mc.ingameGUI;
//			gui.drawString(mc.fontRendererObj, ":", 0, 8, 0xffffff);
//		}
	}
}