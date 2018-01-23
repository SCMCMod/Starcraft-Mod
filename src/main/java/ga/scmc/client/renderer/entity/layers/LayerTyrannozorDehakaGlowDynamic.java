package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderTyrannozorDehaka;
import ga.scmc.entity.living.EntityTyrannozorDehaka;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerTyrannozorDehakaGlowDynamic<T extends EntityTyrannozorDehaka> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.TYRANNOZORDEHAKA_GLOW_DYNAMIC);
	private final RenderTyrannozorDehaka<T> RENDERER;

	public LayerTyrannozorDehakaGlowDynamic(RenderTyrannozorDehaka<T> zealotRendererIn) {
		this.RENDERER = zealotRendererIn;
	}

	public void doRenderLayer(EntityTyrannozorDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}