package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZerglingPrimal3;
import ga.scmc.entity.living.EntityZerglingPrimal3;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerZerglingPrimal3GlowDynamic<T extends EntityZerglingPrimal3> implements LayerRenderer<T>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLINGPRIMAL_GLOW_DYNAMIC);
    private final RenderZerglingPrimal3<T> RENDERER;

    public LayerZerglingPrimal3GlowDynamic(RenderZerglingPrimal3<T> zerglingSC3RendererIn)
    {
        this.RENDERER = zerglingSC3RendererIn;
    }

    public void doRenderLayer(EntityZerglingPrimal3 entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ColoredLayerRender.renderDynamicGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
	}

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}