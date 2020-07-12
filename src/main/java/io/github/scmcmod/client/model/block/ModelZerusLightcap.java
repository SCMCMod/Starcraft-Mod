package io.github.scmcmod.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;

/**
 * zeruslightcap - cybercat5555 Created using Tabula 6.0.0
 */
public class ModelZerusLightcap extends ModelBase
{

	public ModelRenderer stem01a;
	public ModelRenderer stem02a;
	public ModelRenderer stem01b;
	public ModelRenderer cap01a;
	public ModelRenderer cap01b;
	public ModelRenderer stem01b_1;
	public ModelRenderer cap01a_1;
	public ModelRenderer cap01b_1;

	public ModelZerusLightcap()
	{
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.cap01b_1 = new ModelRenderer(this, 20, 14);
		this.cap01b_1.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.cap01b_1.addBox(-3.0F, -2.0F, -4.0F, 6, 2, 8, 0.0F);
		this.stem01b = new ModelRenderer(this, 0, 12);
		this.stem01b.setRotationPoint(0.0F, -6.8F, 0.0F);
		this.stem01b.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(stem01b, 0.045553093477052F, 0.0F, 0.091106186954104F);
		this.stem02a = new ModelRenderer(this, 0, 0);
		this.stem02a.setRotationPoint(-1.6F, 24.4F, 2.7F);
		this.stem02a.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
		this.setRotateAngle(stem02a, 0.0F, 3.141592653589793F, 0.0F);
		this.stem01a = new ModelRenderer(this, 0, 0);
		this.stem01a.setRotationPoint(2.0F, 24.4F, -2.9F);
		this.stem01a.addBox(-1.5F, -7.0F, -1.5F, 3, 7, 3, 0.0F);
		this.cap01a = new ModelRenderer(this, 0, 22);
		this.cap01a.setRotationPoint(0.0F, -5.4F, 0.0F);
		this.cap01a.addBox(-1.5F, -2.0F, -2.0F, 3, 2, 4, 0.0F);
		this.setRotateAngle(cap01a, 0.36425021489121656F, 0.0F, 0.18203784098300857F);
		this.cap01b = new ModelRenderer(this, 18, 3);
		this.cap01b.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.cap01b.addBox(-3.0F, -2.0F, -4.0F, 6, 2, 8, 0.0F);
		this.cap01a_1 = new ModelRenderer(this, 0, 22);
		this.cap01a_1.setRotationPoint(0.0F, -4.4F, 0.0F);
		this.cap01a_1.addBox(-1.5F, -2.0F, -2.0F, 3, 2, 4, 0.0F);
		this.setRotateAngle(cap01a_1, 0.36425021489121656F, -0.40980330836826856F, 0.18203784098300857F);
		this.stem01b_1 = new ModelRenderer(this, 0, 12);
		this.stem01b_1.setRotationPoint(0.0F, -5.8F, 0.0F);
		this.stem01b_1.addBox(-1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(stem01b_1, 0.091106186954104F, 0.0F, 0.045553093477052F);
		this.cap01a_1.addChild(this.cap01b_1);
		this.stem01a.addChild(this.stem01b);
		this.stem01b.addChild(this.cap01a);
		this.cap01a.addChild(this.cap01b);
		this.stem01b_1.addChild(this.cap01a_1);
		this.stem02a.addChild(this.stem01b_1);
	}

	public void render(float scale)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.stem02a.offsetX, this.stem02a.offsetY, this.stem02a.offsetZ);
		GlStateManager.translate(this.stem02a.rotationPointX * scale, this.stem02a.rotationPointY * scale, this.stem02a.rotationPointZ * scale);
		GlStateManager.scale(0.9D, 0.9D, 0.9D);
		GlStateManager.translate(-this.stem02a.offsetX, -this.stem02a.offsetY, -this.stem02a.offsetZ);
		GlStateManager.translate(-this.stem02a.rotationPointX * scale, -this.stem02a.rotationPointY * scale, -this.stem02a.rotationPointZ * scale);
		this.stem02a.render(scale);
		GlStateManager.popMatrix();
		this.stem01a.render(scale);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
