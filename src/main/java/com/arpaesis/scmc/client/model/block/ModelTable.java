package com.arpaesis.scmc.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

/**
 * Created using Tabula 6.0.0
 * 
 * @author Ocelot5836 - Table
 */
public class ModelTable extends ModelBase
{

	public ModelRenderer top;
	public ModelRenderer leg1;
	public ModelRenderer leg2;
	public ModelRenderer leg3;
	public ModelRenderer leg4;

	public ModelTable()
	{
		this.textureWidth = 82;
		this.textureHeight = 80;
		this.leg2 = new ModelRenderer(this, 72, 0);
		this.leg2.setRotationPoint(0.0F, -0.20000000000000004F, 0.0F);
		this.leg2.addBox(5.0F, 9.0F, -7.0F, 2, 15, 2, 0.0F);
		this.leg3 = new ModelRenderer(this, 0, 17);
		this.leg3.setRotationPoint(0.0F, 8.8F, 0.0F);
		this.leg3.addBox(-7.0F, 0.0F, -7.0F, 2, 15, 2, 0.0F);
		this.leg4 = new ModelRenderer(this, 8, 17);
		this.leg4.setRotationPoint(-7.0F, 8.8F, 5.0F);
		this.leg4.addBox(0.0F, 0.0F, 0.0F, 2, 15, 2, 0.0F);
		this.leg1 = new ModelRenderer(this, 64, 0);
		this.leg1.setRotationPoint(7.0F, 8.8F, 8.0F);
		this.leg1.addBox(-2.0F, 0.0F, -3.0F, 2, 15, 2, 0.0F);
		this.top = new ModelRenderer(this, 0, 0);
		this.top.setRotationPoint(0.0F, -0.2F, 0.0F);
		this.top.addBox(-8.0F, 8.0F, -8.0F, 16, 1, 16, 0.0F);
	}

	public void render(float scale)
	{
		this.leg2.render(scale);
		this.leg3.render(scale);
		this.leg4.render(scale);
		this.leg1.render(scale);
		this.top.render(scale);
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
