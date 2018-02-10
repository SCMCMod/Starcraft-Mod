package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderHydraliskPrimal;
import ga.scmc.entity.living.EntityHydraliskPrimal;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerHydraliskPrimalGlowStatic<T extends EntityHydraliskPrimal> implements LayerRenderer<T> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.HYDRALISK_GLOW_STATIC);
	private final RenderHydraliskPrimal RENDERER;

	public LayerHydraliskPrimalGlowStatic(RenderHydraliskPrimal hydraliskRendererIn) {
		RENDERER = hydraliskRendererIn;
	}

	@Override
	public void doRenderLayer(EntityHydraliskPrimal entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}
