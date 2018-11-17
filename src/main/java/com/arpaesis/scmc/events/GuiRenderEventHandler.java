package com.arpaesis.scmc.events;

import com.arpaesis.scmc.handlers.BlockHandler;
import com.arpaesis.scmc.handlers.ItemHandler;
import com.arpaesis.scmc.items.ItemGun;
import com.ocelot.api.utils.TextureUtils;
import com.ocelot.api.utils.WorldUtils;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager.CullFace;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * <em><b>Copyright (c) 2018 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * <br>
 * </br>
 * This class handles all of the events that have to do with client sided
 * rendering.
 * 
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class GuiRenderEventHandler
{

	@SubscribeEvent
	public void onCrosshairRenderEvent(RenderGameOverlayEvent event)
	{
		if (event.getType() == ElementType.CROSSHAIRS)
		{
			if (Minecraft.getMinecraft().player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemHandler.C14_GAUSS_RIFLE)
			{
				event.setCanceled(true);
			}
		}
	}

	@SuppressWarnings("unused")
	@SubscribeEvent
	public void drawSelectionBox(DrawBlockHighlightEvent event)
	{
		EntityPlayer player = event.getPlayer();
		if (event.getTarget() != null && event.getTarget().sideHit != null)
		{
			BlockPos position = event.getTarget().getBlockPos().offset(event.getTarget().sideHit);
			ItemStack stack = player.getHeldItemMainhand();
			IBlockState stateToRender = BlockHandler.PROTOSS_SHIELD.getDefaultState();

			if (stack.getItem() instanceof ItemGun && !player.world.isAirBlock(event.getTarget().getBlockPos()) && false)
			{
				TextureUtils.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);

				GlStateManager.pushMatrix();
				GlStateManager.enableCull();
				GlStateManager.cullFace(CullFace.BACK);
				GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
				GlStateManager.color(1, 1, 1, 0.1f);
				int sX = position.getX();
				int sY = position.getY();
				int sZ = position.getZ();
				Entity entity = Minecraft.getMinecraft().getRenderViewEntity();
				double d0 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double) event.getPartialTicks();
				double d1 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double) event.getPartialTicks();
				double d2 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double) event.getPartialTicks();
				Tessellator.getInstance().getBuffer().setTranslation(-d0, -d1, -d2);
				WorldUtils.renderBlock(player.world, stateToRender, position, Tessellator.getInstance(), Tessellator.getInstance().getBuffer());
				Tessellator.getInstance().getBuffer().setTranslation(0, 0, 0);
				GlStateManager.disableBlend();
				GlStateManager.popMatrix();

				event.setCanceled(true);
			}
		}
	}
}