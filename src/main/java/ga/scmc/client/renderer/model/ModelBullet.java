package ga.scmc.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * bullet - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelBullet extends ModelBase {
	public ModelRenderer body;
	public ModelRenderer point01;
	public ModelRenderer point02;
	public ModelRenderer point03;
	public ModelRenderer point04;
	public ModelRenderer back01;
	public ModelRenderer back02;

	public ModelBullet() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.back02 = new ModelRenderer(this, 20, 5);
		this.back02.setRotationPoint(0.0F, 0.0F, 1.0F);
		this.back02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F);
		this.body = new ModelRenderer(this, 0, 0);
		this.body.setRotationPoint(0.0F, 0.0F, -4.3F);
		this.body.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
		this.back01 = new ModelRenderer(this, 20, 0);
		this.back01.setRotationPoint(0.0F, 0.0F, 0.6F);
		this.back01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F);
		this.point01 = new ModelRenderer(this, 0, 10);
		this.point01.setRotationPoint(0.0F, 0.0F, -4.0F);
		this.point01.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
		this.point02 = new ModelRenderer(this, 0, 17);
		this.point02.setRotationPoint(0.0F, 0.0F, -4.6F);
		this.point02.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
		this.point04 = new ModelRenderer(this, 0, 27);
		this.point04.setRotationPoint(0.0F, 0.0F, -5.5F);
		this.point04.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
		this.point03 = new ModelRenderer(this, 0, 22);
		this.point03.setRotationPoint(0.0F, 0.0F, -5.1F);
		this.point03.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.back02.render(f5);
		this.body.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.back01.offsetX, this.back01.offsetY, this.back01.offsetZ);
		GlStateManager.translate(this.back01.rotationPointX * f5, this.back01.rotationPointY * f5, this.back01.rotationPointZ * f5);
		GlStateManager.scale(0.8D, 0.8D, 0.8D);
		GlStateManager.translate(-this.back01.offsetX, -this.back01.offsetY, -this.back01.offsetZ);
		GlStateManager.translate(-this.back01.rotationPointX * f5, -this.back01.rotationPointY * f5, -this.back01.rotationPointZ * f5);
		this.back01.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.point01.offsetX, this.point01.offsetY, this.point01.offsetZ);
		GlStateManager.translate(this.point01.rotationPointX * f5, this.point01.rotationPointY * f5, this.point01.rotationPointZ * f5);
		GlStateManager.scale(0.9D, 0.9D, 0.9D);
		GlStateManager.translate(-this.point01.offsetX, -this.point01.offsetY, -this.point01.offsetZ);
		GlStateManager.translate(-this.point01.rotationPointX * f5, -this.point01.rotationPointY * f5, -this.point01.rotationPointZ * f5);
		this.point01.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.point02.offsetX, this.point02.offsetY, this.point02.offsetZ);
		GlStateManager.translate(this.point02.rotationPointX * f5, this.point02.rotationPointY * f5, this.point02.rotationPointZ * f5);
		GlStateManager.scale(0.8D, 0.8D, 0.8D);
		GlStateManager.translate(-this.point02.offsetX, -this.point02.offsetY, -this.point02.offsetZ);
		GlStateManager.translate(-this.point02.rotationPointX * f5, -this.point02.rotationPointY * f5, -this.point02.rotationPointZ * f5);
		this.point02.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.point04.offsetX, this.point04.offsetY, this.point04.offsetZ);
		GlStateManager.translate(this.point04.rotationPointX * f5, this.point04.rotationPointY * f5, this.point04.rotationPointZ * f5);
		GlStateManager.scale(1.0D, 1.0D, 0.6D);
		GlStateManager.translate(-this.point04.offsetX, -this.point04.offsetY, -this.point04.offsetZ);
		GlStateManager.translate(-this.point04.rotationPointX * f5, -this.point04.rotationPointY * f5, -this.point04.rotationPointZ * f5);
		this.point04.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.point03.offsetX, this.point03.offsetY, this.point03.offsetZ);
		GlStateManager.translate(this.point03.rotationPointX * f5, this.point03.rotationPointY * f5, this.point03.rotationPointZ * f5);
		GlStateManager.scale(0.7D, 0.7D, 0.7D);
		GlStateManager.translate(-this.point03.offsetX, -this.point03.offsetY, -this.point03.offsetZ);
		GlStateManager.translate(-this.point03.rotationPointX * f5, -this.point03.rotationPointY * f5, -this.point03.rotationPointZ * f5);
		this.point03.render(f5);
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
