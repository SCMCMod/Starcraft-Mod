package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderHydraliskPrimalDehaka;
import ga.scmc.entity.living.EntityHydraliskPrimalDehaka;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerHydraliskPrimalDehakaGlowStatic<T extends EntityHydraliskPrimalDehaka> implements LayerRenderer<T> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.HYDRALISKPRIMALDEHAKA_GLOW_STATIC);
	private final RenderHydraliskPrimalDehaka<T> RENDERER;

	public LayerHydraliskPrimalDehakaGlowStatic(RenderHydraliskPrimalDehaka<T> hydraliskRendererIn) {
		RENDERER = hydraliskRendererIn;
	}

	@Override
	public void doRenderLayer(EntityHydraliskPrimalDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}
