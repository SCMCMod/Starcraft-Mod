package ga.scmc.events;

import java.awt.Color;

import ga.scmc.handlers.ArmorHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.lib.GuiUtils;
import ga.scmc.lib.InventoryUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
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
@EventBusSubscriber
public class GuiOverlayEvent extends Gui {

	/** The determines whether or not the helmet overlay should be rendered. */
	public static boolean renderHelmetOverlay = true;
	/** This is the amount of shield the player has. */
	public static double shieldLevel = 10;
	/** This is the maximum amount of shield the player has. */
	private static int maxShieldLevel = 10;

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onRenderGameOverlayEvent(RenderGameOverlayEvent event) {
		Minecraft mc = Minecraft.getMinecraft();
		EntityPlayer player = mc.player;
		ScaledResolution scaledresolution = new ScaledResolution(mc);
		int width = scaledresolution.getScaledWidth();
		int height = scaledresolution.getScaledHeight();
		FontRenderer fontRenderer = mc.fontRendererObj;
		GlStateManager.enableBlend();
		GlStateManager.enableAlpha();

		if (!player.isSpectator()) {

			ItemStack itemstack = player.inventory.armorItemInSlot(3);
			if (mc.gameSettings.thirdPersonView == 0 && itemstack != null && itemstack.getItem() == ArmorHandler.COPPER_HELMET && renderHelmetOverlay && event.getType() == ElementType.TEXT) {
				this.renderHelmetOverlay(scaledresolution);
				String ammo = "Ammo: " + InventoryUtil.getItemAmount(mc.player, ItemHandler.C14_GAUSS_RIFLE.getAmmo());
				if (mc.player.isCreative())
					ammo = "Ammo: Infinite";
				fontRenderer.drawString(ammo, 15, event.getResolution().getScaledHeight() - 18, Color.WHITE.getRGB());

				for (int i = 0; i < 4; i++) {
					ItemStack stack = mc.player.inventory.armorItemInSlot(i);
					if (stack != null) {
						String damage = stack.getMaxDamage() - stack.getItemDamage() + "/" + stack.getMaxDamage();
						mc.getRenderItem().renderItemAndEffectIntoGUI(stack, (event.getResolution().getScaledWidth() - 18 - mc.fontRendererObj.getStringWidth(damage)) - 18, (event.getResolution().getScaledHeight() - 20 - i * 18) - i);
						fontRenderer.drawString(damage, event.getResolution().getScaledWidth() - 18 - mc.fontRendererObj.getStringWidth(damage), event.getResolution().getScaledHeight() - 18 - i * 18, Color.WHITE.getRGB());
					}
				}
			}

            if (event.getType() == ElementType.HOTBAR && mc.playerController.shouldDrawHUD()) {
                GlStateManager.color(1, 1, 1, 1);
                GuiUtils.bindTexture("textures/gui/icons.png");
                ScaledResolution resolution = event.getResolution();
                float x = resolution.getScaledWidth() / 2 - 91;
                float y = resolution.getScaledHeight() - 39;

                for (int i = 0; i < maxShieldLevel; i++) {
                    if (i < shieldLevel) {
                        if (shieldLevel - (int) shieldLevel >= 0.5 && shieldLevel != 0 && i == (int) shieldLevel) {
                            drawTexturedModalRect(x + i * 8, y, 9, 0, 9, 9);
                        } else {
                            if (i < (int) shieldLevel) {
                                drawTexturedModalRect(x + i * 8, y, 0, 0, 9, 9);
                            }
                        }
                    }
                }

                GuiUtils.bindTexture("minecraft", "textures/gui/icons.png");
			}
		}
	}

	public void renderHelmetOverlay(ScaledResolution scaledRes) {
		GlStateManager.disableDepth();
		GlStateManager.color(1, 1, 1, 1);
		GuiUtils.bindTexture("textures/gui/helmet_overlay.png");
		drawModalRectWithCustomSizedTexture(0, 0, 0, 0, scaledRes.getScaledWidth(), scaledRes.getScaledHeight(), scaledRes.getScaledWidth(), scaledRes.getScaledHeight());
		GlStateManager.enableDepth();
	}

	@SubscribeEvent
	public void onHitEvent(LivingHurtEvent event) {
		shieldLevel = 10;
		if (event.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getEntityLiving();
			if (shieldLevel * 2 >= event.getAmount()) {
				shieldLevel -= event.getAmount() / 2;
				event.setCanceled(true);
				return;
			} else {
				float damage = event.getAmount();
				damage -= shieldLevel * 2;
				shieldLevel = 0;
				event.setAmount(damage);
				event.setCanceled(false);
				return;
			}
		}
	}

	public static int getMaxShieldLevel() {
		return maxShieldLevel;
	}
}