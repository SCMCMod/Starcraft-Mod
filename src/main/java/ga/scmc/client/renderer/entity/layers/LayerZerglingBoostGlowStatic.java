package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderZerglingBoost;
import ga.scmc.entity.living.EntityZerglingBoost;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerZerglingBoostGlowStatic<T extends EntityZerglingBoost> implements LayerRenderer<T>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.ZERGLING_GLOW_STATIC);
    private final RenderZerglingBoost<T> RENDERER;

    public LayerZerglingBoostGlowStatic(RenderZerglingBoost<T> zerglingBoostRendererIn)
    {
        this.RENDERER = zerglingBoostRendererIn;
    }

    public void doRenderLayer(EntityZerglingBoost entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}