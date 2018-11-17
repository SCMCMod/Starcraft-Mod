package com.arpaesis.scmc.client.renderer.tileentity;

import com.arpaesis.scmc.Starcraft;
import com.arpaesis.scmc.client.model.block.ModelZerusLightcap;
import com.arpaesis.scmc.client.model.block.ModelZerusLightcapVariant;
import com.arpaesis.scmc.tileentity.TileEntityZerusLightcap;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class RendererZerusLightcap extends TileEntitySpecialRenderer<TileEntityZerusLightcap>
{

	public static final ModelZerusLightcap MODEL = new ModelZerusLightcap();
	public static final ModelZerusLightcapVariant MODEL_VARIANT = new ModelZerusLightcapVariant();

	public static final ResourceLocation TEXTURE = new ResourceLocation(Starcraft.RL_BASE + "textures/models/block/zerus_lightcap.png");

	@Override
	public void render(TileEntityZerusLightcap te, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
	{
		super.render(te, x, y, z, partialTicks, destroyStage, alpha);
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
		GlStateManager.rotate(180, 0, 0, 1);
		GlStateManager.rotate(te.getRotation(), 0, 1, 0);
		bindTexture(TEXTURE);

		if (te.isVariant())
		{
			MODEL_VARIANT.render(0.0625f);
		} else
		{
			MODEL.render(0.0625f);
		}

		GlStateManager.popMatrix();
	}
}