package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderArtosilope;
import ga.scmc.entity.living.EntityArtosilope;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerArtosilopeGlowStatic<T extends EntityArtosilope> implements LayerRenderer<T> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.TASTELOPE_GLOW_STATIC);
    private final RenderArtosilope<T> RENDERER;

    public LayerArtosilopeGlowStatic(RenderArtosilope<T> larvaRendererIn) {
        RENDERER = larvaRendererIn;
    }

	@Override
    public void doRenderLayer(EntityArtosilope entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
