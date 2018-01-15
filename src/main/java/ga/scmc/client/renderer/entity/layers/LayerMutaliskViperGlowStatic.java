package ga.scmc.client.renderer.entity.layers;

import ga.scmc.client.renderer.Resources;
import ga.scmc.client.renderer.entity.RenderMutaliskViper;
import ga.scmc.entity.living.EntityMutaliskViper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerMutaliskViperGlowStatic<T extends EntityMutaliskViper> implements LayerRenderer<T>
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(Resources.MUTALISK_GLOW_STATIC);
    private final RenderMutaliskViper<T> RENDERER;

    public LayerMutaliskViperGlowStatic(RenderMutaliskViper<T> zerglingSC2RendererIn)
    {
        this.RENDERER = zerglingSC2RendererIn;
    }

    public void doRenderLayer(EntityMutaliskViper entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        ColoredLayerRender.renderStaticGlow(this.RENDERER, entitylivingbaseIn, TEXTURE, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, partialTicks);
    }

    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}