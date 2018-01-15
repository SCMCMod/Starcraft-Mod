package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZerglingPrimal1;
import ga.scmc.entity.living.EntityZerglingPrimal1;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerZerglingPrimal1Color<T extends EntityZerglingPrimal1> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGPRIMAL1_OVERLAY);
	private final RenderZerglingPrimal1<T> RENDERER;

	public LayerZerglingPrimal1Color(RenderZerglingPrimal1<T> rendererIn) {
		this.RENDERER = rendererIn;
	}

	public void doRenderLayer(EntityZerglingPrimal1 entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}