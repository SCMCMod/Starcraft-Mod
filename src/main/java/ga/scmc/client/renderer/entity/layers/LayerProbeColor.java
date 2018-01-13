package ga.scmc.client.renderer.entity.layers;

import org.lwjgl.opengl.GL11;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderProbe;
import ga.scmc.entity.living.EntityProbe;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @since 1.6
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerProbeColor<T extends EntityProbe> implements LayerRenderer<T> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.PROBE_OVERLAY);
	private final RenderProbe<T> RENDERER;

	public LayerProbeColor(RenderProbe<T> rendererIn) {
		this.RENDERER = rendererIn;
	}

	public void doRenderLayer(EntityProbe entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}