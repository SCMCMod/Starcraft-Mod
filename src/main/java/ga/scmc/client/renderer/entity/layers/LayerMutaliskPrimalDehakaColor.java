package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderMutaliskPrimalDehaka;
import ga.scmc.entity.living.EntityMutaliskPrimalDehaka;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Hypeirochus
 */
@SideOnly(Side.CLIENT)
public class LayerMutaliskPrimalDehakaColor<T extends EntityMutaliskPrimalDehaka> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISKPRIMALDEHAKA_OVERLAY);
	private final RenderMutaliskPrimalDehaka<T> RENDERER;

	public LayerMutaliskPrimalDehakaColor(RenderMutaliskPrimalDehaka<T> rendererIn) {
		this.RENDERER = rendererIn;
	}

	public void doRenderLayer(EntityMutaliskPrimalDehaka entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}