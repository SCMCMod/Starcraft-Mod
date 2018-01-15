package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZerglingPrimal2;
import ga.scmc.entity.living.EntityZerglingPrimal2;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 2.6
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerZerglingPrimal2Color<T extends EntityZerglingPrimal2> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGPRIMAL2_OVERLAY);
	private final RenderZerglingPrimal2<T> RENDERER;

	public LayerZerglingPrimal2Color(RenderZerglingPrimal2<T> rendererIn) {
		this.RENDERER = rendererIn;
	}

	public void doRenderLayer(EntityZerglingPrimal2 entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}