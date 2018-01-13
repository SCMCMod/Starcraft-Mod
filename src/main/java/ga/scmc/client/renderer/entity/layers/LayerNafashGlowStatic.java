package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderNafash;
import ga.scmc.entity.living.EntityNafash;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerNafashGlowStatic<T extends EntityNafash> implements LayerRenderer<T>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.BROODMOTHER_GLOW_STATIC);
    private final RenderNafash<T> RENDERER;

    public LayerNafashGlowStatic(RenderNafash<T> zerglingSC2RendererIn)
    {
        this.RENDERER = zerglingSC2RendererIn;
    }

    @Override
    public void doRenderLayer(EntityNafash entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}