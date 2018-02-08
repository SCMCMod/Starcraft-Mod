package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderTyrannozorDehaka;
import ga.scmc.entity.living.EntityTyrannozorDehaka;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerTyrannozorDehakaGlowStatic<T extends EntityTyrannozorDehaka> implements LayerRenderer<T> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.TYRANNOZORDEHAKA_GLOW_STATIC);
	private final RenderTyrannozorDehaka<T> RENDERER;

	public LayerTyrannozorDehakaGlowStatic(RenderTyrannozorDehaka<T> zerglingSC2RendererIn) {
		this.RENDERER = zerglingSC2RendererIn;
	}

	@Override
	public void doRenderLayer(EntityTyrannozorDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}