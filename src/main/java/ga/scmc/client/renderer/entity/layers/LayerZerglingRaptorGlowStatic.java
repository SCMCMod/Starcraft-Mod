package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZerglingRaptor;
import ga.scmc.entity.living.EntityZerglingRaptor;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerZerglingRaptorGlowStatic<T extends EntityZerglingRaptor> implements LayerRenderer<T> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLING_GLOW_STATIC);
	private final RenderZerglingRaptor<T> RENDERER;

	public LayerZerglingRaptorGlowStatic(RenderZerglingRaptor<T> zerglingRaptorRendererIn) {
		this.RENDERER = zerglingRaptorRendererIn;
	}

	public void doRenderLayer(EntityZerglingRaptor entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}