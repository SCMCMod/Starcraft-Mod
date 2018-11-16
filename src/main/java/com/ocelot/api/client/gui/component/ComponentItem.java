package com.ocelot.api.client.gui.component;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.item.ItemStack;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em> <br>
 * </br>
 * An itemstack that can be rendered.
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
public class ComponentItem extends Component
{

	private ItemStack stack;

	public ComponentItem(ItemStack stack, int x, int y)
	{
		this(stack, x, y, 16, 16);
	}

	public ComponentItem(ItemStack stack, int x, int y, int width, int height)
	{
		super(x, y, width, height);
		this.stack = stack;
		this.width = width;
		this.height = height;
	}

	@Override
	public void renderBackground(Minecraft mc, float partialTicks, int mouseX, int mouseY)
	{
		if (stack != null)
		{
			GlStateManager.pushMatrix();
			GlStateManager.translate(parent.getX(), parent.getY(), 0);
			GlStateManager.scale(width / 16, height / 16, 1);
			mc.getRenderItem().renderItemIntoGUI(stack, x / (width / 16), y / (height / 16));
			GlStateManager.popMatrix();
		}
	}

	@Override
	public void renderForeground(Minecraft mc, float partialTicks, int mouseX, int mouseY)
	{
		if (stack != null)
		{
			mc.getRenderItem().renderItemOverlays(mc.fontRenderer, stack, x / (width / 16), y / (height / 16));
		}
	}
}