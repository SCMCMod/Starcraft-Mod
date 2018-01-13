package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderMarine;
import ga.scmc.entity.living.EntityMarine;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Ocelot5836
 */
@SideOnly(Side.CLIENT)
public class LayerMarineColor implements LayerRenderer<EntityMarine> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MARINE_OVERLAY);
	private final RenderMarine RENDERER;

	public LayerMarineColor(RenderMarine rendererIn) {
		this.RENDERER = rendererIn;
	}

	public void doRenderLayer(EntityMarine entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.render(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}