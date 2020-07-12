/**
 * Starcraft-Mod
 * Copyright (C) 2020
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.arpaesis.scmc.client.renderer;

import org.lwjgl.opengl.GL11;

import com.arpaesis.scmc.entity.living.EntityProtossMob;
import com.arpaesis.scmc.entity.living.EntityProtossPassive;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.MathHelper;

public class ProtossRenderUtil {

	public static <T extends EntityProtossMob> void renderShields(ModelBase shields, T entity, float limbSwing,
			float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		if (entity.getShields() > 0f) {
			GlStateManager.pushMatrix();

			GlStateManager.color(0.4f, 0.4f, 1f, MathHelper.clamp((float) entity.cooldown / 48, 0.0f, 0.4f));
			GlStateManager.disableTexture2D();
			GlStateManager.depthMask(false);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			shields.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
			GlStateManager.scale(1f, 1f, 1.1f);
			GlStateManager.translate(0f, 0f, -0.025f);
			shields.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

			GlStateManager.disableBlend();
			GlStateManager.depthMask(true);
			GlStateManager.enableTexture2D();

			GlStateManager.popMatrix();
		}
	}

	public static <T extends EntityProtossPassive> void renderShields(ModelBase shields, T entity, float limbSwing,
			float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		if (entity.getShields() > 0f) {
			GlStateManager.pushMatrix();

			GlStateManager.color(0.4f, 0.4f, 1f, MathHelper.clamp((float) entity.cooldown / 48, 0.0f, 0.4f));
			GlStateManager.disableTexture2D();
			GlStateManager.depthMask(false);
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			shields.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
			GlStateManager.scale(1f, 1f, 1.1f);
			GlStateManager.translate(0f, 0f, -0.025f);
			shields.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

			GlStateManager.disableBlend();
			GlStateManager.depthMask(true);
			GlStateManager.enableTexture2D();

			GlStateManager.popMatrix();
		}
	}
}
