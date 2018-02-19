package com.hypeirochus.scmc.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;

/**
 * zerusglowpod - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelZerusGlowPod extends ModelBase {

	public ModelRenderer	roots01;
	public ModelRenderer	podBase01;
	public ModelRenderer	roots02;
	public ModelRenderer	roots03;
	public ModelRenderer	roots04;
	public ModelRenderer	tendril01;
	public ModelRenderer	tendril05;
	public ModelRenderer	tendril03;
	public ModelRenderer	tendril07;
	public ModelRenderer	tendril02;
	public ModelRenderer	tendril06;
	public ModelRenderer	tendril04;
	public ModelRenderer	tendril08;
	public ModelRenderer	podBase02;
	public ModelRenderer	podBase04;
	public ModelRenderer	petal01;
	public ModelRenderer	petal02;
	public ModelRenderer	petal03;
	public ModelRenderer	petal04;
	public ModelRenderer	petal05;
	public ModelRenderer	petal06;
	public ModelRenderer	petal07;
	public ModelRenderer	petal08;

	public ModelZerusGlowPod() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.tendril04 = new ModelRenderer(this, 26, 6);
		this.tendril04.setRotationPoint(-0.3F, 0.0F, 6.9F);
		this.tendril04.addBox(-2.0F, -0.3F, 0.0F, 4, 0, 5, 0.0F);
		this.setRotateAngle(tendril04, -0.091106186954104F, 0.0F, 0.0F);
		this.petal01 = new ModelRenderer(this, 0, 0);
		this.petal01.setRotationPoint(0.0F, -1.9F, -2.5F);
		this.petal01.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(petal01, -0.27314402793711257F, 0.7740535232594852F, -0.22759093446006054F);
		this.petal02 = new ModelRenderer(this, 0, 0);
		this.petal02.mirror = true;
		this.petal02.setRotationPoint(-2.5F, -1.9F, 0.0F);
		this.petal02.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(petal02, 0.0F, 0.7740535232594852F, 0.27314402793711257F);
		this.petal07 = new ModelRenderer(this, 0, 6);
		this.petal07.mirror = true;
		this.petal07.setRotationPoint(-2.5F, -1.9F, 2.5F);
		this.petal07.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(petal07, 0.27314402793711257F, 0.0F, 0.22759093446006054F);
		this.tendril06 = new ModelRenderer(this, 26, 6);
		this.tendril06.setRotationPoint(-0.3F, 0.0F, 6.9F);
		this.tendril06.addBox(-2.0F, -0.3F, 0.0F, 4, 0, 5, 0.0F);
		this.setRotateAngle(tendril06, -0.091106186954104F, 0.0F, 0.0F);
		this.roots01 = new ModelRenderer(this, 2, 0);
		this.roots01.setRotationPoint(0.0F, 23.9F, 0.0F);
		this.roots01.addBox(-3.0F, -0.5F, -7.0F, 6, 1, 14, 0.0F);
		this.podBase02 = new ModelRenderer(this, 26, 17);
		this.podBase02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.podBase02.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
		this.petal08 = new ModelRenderer(this, 0, 6);
		this.petal08.setRotationPoint(2.5F, -1.9F, 2.5F);
		this.petal08.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(petal08, 0.27314402793711257F, 0.0F, -0.22759093446006054F);
		this.tendril01 = new ModelRenderer(this, 0, 0);
		this.tendril01.setRotationPoint(-0.3F, 0.0F, -6.9F);
		this.tendril01.addBox(-2.0F, -0.3F, -5.0F, 4, 0, 5, 0.0F);
		this.setRotateAngle(tendril01, 0.091106186954104F, 0.0F, 0.0F);
		this.roots03 = new ModelRenderer(this, 2, 0);
		this.roots03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.roots03.addBox(-3.0F, -0.4F, -7.0F, 6, 1, 14, 0.0F);
		this.setRotateAngle(roots03, 0.0F, 0.7853981633974483F, 0.0F);
		this.petal03 = new ModelRenderer(this, 0, 0);
		this.petal03.setRotationPoint(2.5F, -1.9F, 0.0F);
		this.petal03.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(petal03, 0.0F, -0.7740535232594852F, -0.27314402793711257F);
		this.roots04 = new ModelRenderer(this, 2, 0);
		this.roots04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.roots04.addBox(-3.0F, -0.4F, -7.0F, 6, 1, 14, 0.0F);
		this.setRotateAngle(roots04, 0.0F, -0.7853981633974483F, 0.0F);
		this.podBase01 = new ModelRenderer(this, 0, 17);
		this.podBase01.setRotationPoint(0.0F, 21.3F, 0.0F);
		this.podBase01.addBox(-3.0F, -2.0F, -3.0F, 6, 4, 6, 0.0F);
		this.setRotateAngle(podBase01, 0.0F, 0.7740535232594852F, 0.0F);
		this.tendril02 = new ModelRenderer(this, 0, 0);
		this.tendril02.setRotationPoint(-0.3F, 0.0F, -6.9F);
		this.tendril02.addBox(-2.0F, -0.3F, -5.0F, 4, 0, 5, 0.0F);
		this.setRotateAngle(tendril02, 0.091106186954104F, 0.0F, 0.0F);
		this.tendril03 = new ModelRenderer(this, 0, 6);
		this.tendril03.setRotationPoint(-0.3F, 0.0F, -6.9F);
		this.tendril03.addBox(-2.0F, -0.3F, -5.0F, 4, 0, 5, 0.0F);
		this.setRotateAngle(tendril03, 0.091106186954104F, 0.0F, 0.0F);
		this.tendril07 = new ModelRenderer(this, 26, 6);
		this.tendril07.setRotationPoint(-0.3F, 0.0F, 6.9F);
		this.tendril07.addBox(-2.0F, -0.3F, 0.0F, 4, 0, 5, 0.0F);
		this.setRotateAngle(tendril07, -0.091106186954104F, 0.0F, 0.0F);
		this.tendril08 = new ModelRenderer(this, 0, 6);
		this.tendril08.setRotationPoint(-0.3F, 0.0F, -6.9F);
		this.tendril08.addBox(-2.0F, -0.3F, -5.0F, 4, 0, 5, 0.0F);
		this.setRotateAngle(tendril08, 0.091106186954104F, 0.0F, 0.0F);
		this.tendril05 = new ModelRenderer(this, 26, 0);
		this.tendril05.setRotationPoint(-0.3F, 0.0F, 6.9F);
		this.tendril05.addBox(-2.0F, -0.3F, 0.0F, 4, 0, 5, 0.0F);
		this.setRotateAngle(tendril05, -0.091106186954104F, 0.0F, 0.0F);
		this.podBase04 = new ModelRenderer(this, 47, 17);
		this.podBase04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.podBase04.addBox(-2.0F, -3.0F, -2.0F, 4, 6, 4, 0.0F);
		this.petal06 = new ModelRenderer(this, 0, 0);
		this.petal06.mirror = true;
		this.petal06.setRotationPoint(-2.5F, -1.9F, -2.5F);
		this.petal06.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(petal06, -0.27314402793711257F, 0.0F, 0.22759093446006054F);
		this.roots02 = new ModelRenderer(this, 2, 0);
		this.roots02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.roots02.addBox(-3.0F, -0.45F, -7.0F, 6, 1, 14, 0.0F);
		this.setRotateAngle(roots02, 0.0F, 1.5707963267948966F, 0.0F);
		this.petal04 = new ModelRenderer(this, 0, 0);
		this.petal04.mirror = true;
		this.petal04.setRotationPoint(0.0F, -1.9F, 2.5F);
		this.petal04.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(petal04, -0.27314402793711257F, 2.276432943376204F, -0.22759093446006054F);
		this.petal05 = new ModelRenderer(this, 0, 0);
		this.petal05.setRotationPoint(2.5F, -1.9F, -2.5F);
		this.petal05.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(petal05, -0.27314402793711257F, 0.0F, -0.22759093446006054F);
		this.roots04.addChild(this.tendril04);
		this.podBase01.addChild(this.petal01);
		this.podBase01.addChild(this.petal02);
		this.podBase01.addChild(this.petal07);
		this.roots03.addChild(this.tendril06);
		this.podBase01.addChild(this.podBase02);
		this.podBase01.addChild(this.petal08);
		this.roots01.addChild(this.tendril01);
		this.roots01.addChild(this.roots03);
		this.podBase01.addChild(this.petal03);
		this.roots01.addChild(this.roots04);
		this.roots03.addChild(this.tendril02);
		this.roots02.addChild(this.tendril03);
		this.roots02.addChild(this.tendril07);
		this.roots04.addChild(this.tendril08);
		this.roots01.addChild(this.tendril05);
		this.podBase01.addChild(this.podBase04);
		this.podBase01.addChild(this.petal06);
		this.roots01.addChild(this.roots02);
		this.podBase01.addChild(this.petal04);
		this.podBase01.addChild(this.petal05);
	}

	public void render(float scale, float podScale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.roots01.offsetX, this.roots01.offsetY, this.roots01.offsetZ);
		GlStateManager.translate(this.roots01.rotationPointX * scale, this.roots01.rotationPointY * scale, this.roots01.rotationPointZ * scale);
		GlStateManager.scale(0.8D, 0.8D, 0.8D);
		GlStateManager.translate(-this.roots01.offsetX, -this.roots01.offsetY, -this.roots01.offsetZ);
		GlStateManager.translate(-this.roots01.rotationPointX * scale, -this.roots01.rotationPointY * scale, -this.roots01.rotationPointZ * scale);
		this.roots01.render(scale);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.podBase01.offsetX, this.podBase01.offsetY, this.podBase01.offsetZ);
		GlStateManager.translate(this.podBase01.rotationPointX * scale, this.podBase01.rotationPointY * scale, this.podBase01.rotationPointZ * scale);
		GlStateManager.scale(0.95D, 0.95D, 0.95D);
		GlStateManager.scale(podScale, podScale, podScale);
		GlStateManager.translate(-this.podBase01.offsetX, -this.podBase01.offsetY, -this.podBase01.offsetZ);
		GlStateManager.translate(-this.podBase01.rotationPointX * scale, -this.podBase01.rotationPointY * scale, -this.podBase01.rotationPointZ * scale);
		this.podBase01.render(scale);
		GlStateManager.popMatrix();
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
