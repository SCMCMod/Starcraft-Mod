package io.github.scmcmod.client.renderer.tileentity;

import io.github.scmcmod.SCConstants;
import io.github.scmcmod.Starcraft;
import io.github.scmcmod.client.model.block.ModelZerusGlowPod;
import io.github.scmcmod.tileentity.TileEntityZerusGlowPod;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class RendererZerusGlowPod extends TileEntitySpecialRenderer<TileEntityZerusGlowPod>
{

	private static final ModelZerusGlowPod MODEL = new ModelZerusGlowPod();
	private static final ResourceLocation TEXTURE = new ResourceLocation(SCConstants.MODID + "textures/models/block/zerus_glow_pod.png");

	@Override
	public void render(TileEntityZerusGlowPod te, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
	{
		super.render(te, x, y, z, partialTicks, destroyStage, alpha);
		GlStateManager.pushMatrix();
		GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
		GlStateManager.rotate(180, 0, 0, 1);
		bindTexture(TEXTURE);
		MODEL.render(0.0625f, te.getPulsingProgress());
		GlStateManager.popMatrix();
	}
}