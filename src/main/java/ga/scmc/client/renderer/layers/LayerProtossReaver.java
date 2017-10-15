package ga.scmc.client.renderer.layers;

import ga.scmc.client.renderer.entity.RenderProtossReaver;
import ga.scmc.entity.living.EntityProtossReaver;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerProtossReaver<T extends EntityProtossReaver> implements LayerRenderer<T> {
    private static final ResourceLocation PREAVER_LAYER = new ResourceLocation(Library.RL_BASE + "textures/entity/preaver_layer.png");
    private final RenderProtossReaver<T> preaverRenderer;

    public LayerProtossReaver(RenderProtossReaver<T> preaverRendererIn) {
        preaverRenderer = preaverRendererIn;
    }

	@Override
    public void doRenderLayer(EntityProtossReaver entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	if(!entitylivingbaseIn.isInvisible()) {
    		preaverRenderer.bindTexture(PREAVER_LAYER);
    		GlStateManager.enableBlend();
    		GlStateManager.enableAlpha();
    		GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

    		if(entitylivingbaseIn.isInvisible()) {
    			GlStateManager.depthMask(false);
    		} else {
    			GlStateManager.depthMask(true);
    		}

    		int i = 61680;
    		int j = i % 65536;
    		int k = i / 65536;
    		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
    		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    		preaverRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    		i = entitylivingbaseIn.getBrightnessForRender(partialTicks);
    		j = i % 65536;
    		k = i / 65536;
    		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
    		preaverRenderer.setLightmap(entitylivingbaseIn, partialTicks);
    		GlStateManager.disableBlend();
    		GlStateManager.enableAlpha();
    	}
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
