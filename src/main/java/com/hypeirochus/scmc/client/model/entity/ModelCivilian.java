package com.hypeirochus.scmc.client.model.entity;

import com.hypeirochus.api.client.render.model.Model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class ModelCivilian extends Model {

	ModelRenderer	body;
	ModelRenderer	head;
	ModelRenderer	leftarm;
	ModelRenderer	leftleg;
	ModelRenderer	rightarm;
	ModelRenderer	rightleg;

	public ModelCivilian() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -8F, -4F, 8, 8, 8);
		head.setRotationPoint(0F, 0F, 0F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 16, 16);
		body.addBox(-4F, 0F, -2F, 8, 12, 4);
		body.setRotationPoint(0F, 0F, 0F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelRenderer(this, 40, 16);
		rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
		rightarm.setRotationPoint(-5F, 2F, 0F);
		rightarm.setTextureSize(64, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0F);
		leftarm = new ModelRenderer(this, 40, 16);
		leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
		leftarm.setRotationPoint(5F, 2F, 0F);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, 0F);
		rightleg = new ModelRenderer(this, 0, 16);
		rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
		rightleg.setRotationPoint(-2F, 12F, 0F);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 0, 16);
		leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
		leftleg.setRotationPoint(2F, 12F, 0F);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
	}

	@Override
	public void render(Object obj) {
		EntityLivingBase base = (EntityLivingBase) obj;
		head.rotateAngleY = headYaw(obj) / (180F / (float) Math.PI);
		head.rotateAngleX = headPitch(obj) / (180F / (float) Math.PI);
		rightarm.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 2.0F * swingProgressPrev(obj) * 0.5F;
		leftarm.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 2.0F * swingProgressPrev(obj) * 0.5F;
		rightleg.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj);
		leftleg.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj);
	}
}