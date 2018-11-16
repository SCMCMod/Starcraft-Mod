package com.ocelot.api.client.gui.component;

import com.ocelot.api.utils.SoundUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

/**
 * <em><b>Copyright (c) 2018 Ocelot5836.</b></em> <br>
 * </br>
 * A very simple arrow button.
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
public class ComponentArrow extends Component
{

	protected static final ResourceLocation BUTTON_TEXTURES = new ResourceLocation("textures/gui/widgets.png");

	public String displayString;
	public boolean enabled;
	protected boolean hovered;

	public ComponentArrow(int x, int y, int width, int height)
	{
		super(x, y, width, height);
	}

	protected int getHoverState(boolean mouseOver)
	{
		int i = 1;

		if (!this.enabled)
		{
			i = 0;
		} else if (mouseOver)
		{
			i = 2;
		}

		return i;
	}

	@Override
	public void renderBackground(Minecraft mc, float partialTicks, int mouseX, int mouseY)
	{
		if (this.visible)
		{
			GlStateManager.pushMatrix();
			FontRenderer fontrenderer = mc.fontRenderer;
			mc.getTextureManager().bindTexture(BUTTON_TEXTURES);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			this.hovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
			int i = this.getHoverState(this.hovered);
			GlStateManager.enableBlend();
			GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
			this.drawTexturedModalRect(this.x, this.y, 0, 46 + i * 20, (int) (this.width / 2), (int) (this.height));
			this.drawTexturedModalRect(this.x + this.width / 2, this.y, 200 - this.width / 2, 46 + i * 20, this.width / 2, this.height);
			int j = 14737632;

			if (!this.enabled)
			{
				j = 10526880;
			} else if (this.hovered)
			{
				j = 16777120;
			}

			this.drawCenteredString(fontrenderer, this.displayString, this.x + this.width / 2, this.y + (this.height - 8) / 2, j);
			GlStateManager.popMatrix();
		}
	}

	@Override
	public boolean isHovered(int mouseX, int mouseY)
	{
		return this.enabled && super.isHovered(mouseX, mouseY);
	}

	@Override
	public void mousePressed(int mouseButton, int mouseX, int mouseY)
	{
		super.mousePressed(mouseButton, mouseX, mouseY);
		if (mouseButton == 0)
		{
			SoundUtils.playButtonClick();
		}
	}

	public boolean isMouseOver()
	{
		return this.hovered;
	}
}