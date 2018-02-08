package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZerglingSwarmling;
import ga.scmc.entity.living.EntityZerglingSwarmling;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerZerglingSwarmlingGlowStatic<T extends EntityZerglingSwarmling> implements LayerRenderer<T> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGSWARMLING_GLOW_STATIC);
	private final RenderZerglingSwarmling<T> RENDERER;

	public LayerZerglingSwarmlingGlowStatic(RenderZerglingSwarmling<T> zerglingswarmlingRendererIn) {
		this.RENDERER = zerglingswarmlingRendererIn;
	}

	public void doRenderLayer(EntityZerglingSwarmling entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}