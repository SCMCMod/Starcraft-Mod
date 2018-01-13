package ga.scmc.client.renderer.entity.layers;

import ga.scmc.api.IEntityTeamColorable;
import ga.scmc.entity.living.EntityStarcraftMob;
import ga.scmc.entity.living.EntityStarcraftPassive;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class ColoredLayerRender {

    public static <T extends EntityLiving> void render(RenderLiving<T> renderer, EntityLiving entity, ResourceLocation overlayTexture, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if(entity instanceof IEntityTeamColorable) {
            IEntityTeamColorable<EntityLiving> team = (IEntityTeamColorable<EntityLiving>) entity;
            renderer.bindTexture(overlayTexture);
            GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);

            if(entity.isInvisible())
                GlStateManager.depthMask(false);
            else
                GlStateManager.depthMask(true);

            GlStateManager.color(team.getTeamColor().getR() / 255.0F, team.getTeamColor().getG() / 255.0F, team.getTeamColor().getB() / 255.0F);
            renderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        }
    }

}
