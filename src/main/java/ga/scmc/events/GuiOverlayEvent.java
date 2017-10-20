package ga.scmc.events;

import java.awt.Color;

import ga.scmc.handlers.ItemHandler;
import ga.scmc.lib.GuiUtils;
import ga.scmc.lib.InventoryUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class renders anything like text on the screen as an overlay.<br>
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * @since 1.6
 * @author Ocelot5836
 */
public class GuiOverlayEvent {

	public static boolean renderHelmetOverlay = true;

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onRenderGameOverlayEvent(RenderGameOverlayEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		GuiIngame gui = mc.ingameGUI;

		if (event.getType() == ElementType.EXPERIENCE && renderHelmetOverlay) {
			GlStateManager.enableBlend();
			GuiUtils.bindTexture("textures/gui/helmet_overlay.png");
			gui.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, event.getResolution().getScaledWidth(), event.getResolution().getScaledHeight(), event.getResolution().getScaledWidth(), event.getResolution().getScaledHeight());

			String ammo = "Ammo: " + InventoryUtil.getItemAmount(mc.player, ItemHandler.C14_GAUSS_RIFLE.getAmmo());
			if (mc.player.isCreative())
				ammo = "Ammo: Infinite";
			mc.fontRendererObj.drawString(ammo, 15, event.getResolution().getScaledHeight() - 18, Color.WHITE.getRGB());

			for (int i = 0; i < 4; i++) {
				ItemStack stack = mc.player.inventory.armorItemInSlot(i);
				if (stack != null) {
					String damage = stack.getMaxDamage() - stack.getItemDamage() + "/" + stack.getMaxDamage();
					mc.getRenderItem().renderItemAndEffectIntoGUI(stack, (event.getResolution().getScaledWidth() - 18 - mc.fontRendererObj.getStringWidth(damage)) - 18, (event.getResolution().getScaledHeight() - 20 - i * 18) - i);
					mc.fontRendererObj.drawString(damage, event.getResolution().getScaledWidth() - 18 - mc.fontRendererObj.getStringWidth(damage), event.getResolution().getScaledHeight() - 18 - i * 18, Color.WHITE.getRGB());
				}
			}
		}
	}
}