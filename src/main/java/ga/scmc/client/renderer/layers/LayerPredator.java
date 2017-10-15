package ga.scmc.client.renderer.layers;

import ga.scmc.client.renderer.entity.RenderPredator;
import ga.scmc.entity.living.EntityPredator;
import ga.scmc.lib.Library;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerPredator<T extends EntityPredator> implements LayerRenderer<T> {
    private static final ResourceLocation PREDATOR_LAYER = new ResourceLocation(Library.RL_BASE + "textures/entity/predator_layer.png");
    private final RenderPredator<T> predatorRenderer;

    public LayerPredator(RenderPredator<T> darkprobeRendererIn) {
        predatorRenderer = darkprobeRendererIn;
    }

    @Override
    public void doRenderLayer(EntityPredator entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
    	if(!entitylivingbaseIn.isInvisible()) {
    		predatorRenderer.bindTexture(PREDATOR_LAYER);
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
    		predatorRenderer.getMainModel().render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    		i = entitylivingbaseIn.getBrightnessForRender(partialTicks);
    		j = i % 65536;
    		k = i / 65536;
    		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
    		predatorRenderer.setLightmap(entitylivingbaseIn, partialTicks);
    		GlStateManager.disableBlend();
    		GlStateManager.enableAlpha();
    	}
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}
