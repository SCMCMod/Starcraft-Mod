package com.arpaesis.scmc.client.model.entity.vehicle;

import com.arpaesis.api.client.render.model.Model;
import com.arpaesis.scmc.entity.vehicles.EntityScout;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Scout_SCMC - Alien Created using Tabula 6.0.0
 */
public class ModelScout extends Model
{
	public ModelRenderer Main;
	public ModelRenderer shape22;
	public ModelRenderer shape22_1;
	public ModelRenderer shape22_2;
	public ModelRenderer shape22_3;
	public ModelRenderer shape104;
	public ModelRenderer shape104_1;
	public ModelRenderer shape137;
	public ModelRenderer shape22_4;
	public ModelRenderer shape22_5;
	public ModelRenderer shape22_6;
	public ModelRenderer shape22_7;
	public ModelRenderer shape22_8;
	public ModelRenderer shape22_9;
	public ModelRenderer shape22_10;
	public ModelRenderer shape22_11;
	public ModelRenderer shape22_12;
	public ModelRenderer shape119;
	public ModelRenderer shape119_1;
	public ModelRenderer shape22_13;
	public ModelRenderer shape22_14;
	public ModelRenderer shape22_15;
	public ModelRenderer shape22_16;
	public ModelRenderer shape111;
	public ModelRenderer shape111_1;
	public ModelRenderer shape22_17;
	public ModelRenderer shape22_18;
	public ModelRenderer shape119_2;
	public ModelRenderer shape122;
	public ModelRenderer shape124;
	public ModelRenderer shape127;
	public ModelRenderer shape119_3;
	public ModelRenderer shape122_1;
	public ModelRenderer shape122_2;
	public ModelRenderer shape119_4;
	public ModelRenderer shape122_3;
	public ModelRenderer shape124_1;
	public ModelRenderer shape127_1;
	public ModelRenderer shape119_5;
	public ModelRenderer shape122_4;
	public ModelRenderer shape122_5;
	public ModelRenderer shape115;

	public ModelScout()
	{
		this.textureWidth = 216;
		this.textureHeight = 216;
		this.shape22_6 = new ModelRenderer(this, 30, 56);
		this.shape22_6.setRotationPoint(0.0F, 0.0F, 12.0F);
		this.shape22_6.addBox(-6.5F, 0.0F, 0.0F, 13, 5, 33, 0.0F);
		this.setRotateAngle(shape22_6, -0.19477874452256716F, 0.0F, 0.0F);
		this.shape22_18 = new ModelRenderer(this, 136, 156);
		this.shape22_18.setRotationPoint(0.0F, 0.0F, 23.0F);
		this.shape22_18.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 18, 0.0F);
		this.setRotateAngle(shape22_18, -0.06283185307179587F, 0.0F, 0.0F);
		this.shape22_15 = new ModelRenderer(this, 140, 107);
		this.shape22_15.setRotationPoint(9.0F, 2.0F, 6.0F);
		this.shape22_15.addBox(-8.0F, -10.5F, 0.0F, 12, 18, 20, 0.0F);
		this.setRotateAngle(shape22_15, 0.06283185307179587F, 0.0942477796076938F, 0.06283185307179587F);
		this.shape22_13 = new ModelRenderer(this, 117, 0);
		this.shape22_13.setRotationPoint(-0.5F, 0.0F, 0.5F);
		this.shape22_13.addBox(-5.0F, -9.5F, -4.0F, 10, 12, 32, 0.0F);
		this.shape111 = new ModelRenderer(this, 129, 45);
		this.shape111.setRotationPoint(0.0F, -6.0F, 1.0F);
		this.shape111.addBox(-11.0F, 0.0F, -2.0F, 22, 10, 9, 0.0F);
		this.shape104_1 = new ModelRenderer(this, 33, 95);
		this.shape104_1.mirror = true;
		this.shape104_1.setRotationPoint(-8.0F, 0.0F, 2.0F);
		this.shape104_1.addBox(-9.0F, 0.0F, 0.0F, 9, 2, 7, 0.0F);
		this.setRotateAngle(shape104_1, 0.1884955592153876F, 0.439822971502571F, -0.25132741228718347F);
		this.shape22_12 = new ModelRenderer(this, 0, 145);
		this.shape22_12.setRotationPoint(0.0F, -12.0F, -3.0F);
		this.shape22_12.addBox(-3.0F, 0.0F, 0.0F, 6, 11, 22, 0.0F);
		this.setRotateAngle(shape22_12, 0.25132741228718347F, 0.0F, 0.0F);
		this.shape22_1 = new ModelRenderer(this, 0, 70);
		this.shape22_1.setRotationPoint(0.0F, 9.8F, -12.9F);
		this.shape22_1.addBox(-5.5F, -11.0F, -7.0F, 11, 6, 9, 0.0F);
		this.shape22_10 = new ModelRenderer(this, 0, 179);
		this.shape22_10.mirror = true;
		this.shape22_10.setRotationPoint(-10.0F, 0.5F, -11.0F);
		this.shape22_10.addBox(-7.0F, -10.5F, 0.0F, 14, 14, 22, 0.0F);
		this.setRotateAngle(shape22_10, 0.0F, 0.1884955592153876F, -0.12566370614359174F);
		this.shape22_9 = new ModelRenderer(this, 0, 179);
		this.shape22_9.setRotationPoint(10.0F, 0.5F, -11.0F);
		this.shape22_9.addBox(-7.0F, -10.5F, 0.0F, 14, 14, 22, 0.0F);
		this.setRotateAngle(shape22_9, 0.0F, -0.1884955592153876F, 0.12566370614359174F);
		this.shape127 = new ModelRenderer(this, 0, 31);
		this.shape127.setRotationPoint(13.0F, -0.5F, 7.0F);
		this.shape127.addBox(-4.0F, 0.0F, 0.0F, 7, 4, 7, 0.0F);
		this.shape22 = new ModelRenderer(this, 0, 0);
		this.shape22.setRotationPoint(0.0F, 7.0F, -11.0F);
		this.shape22.addBox(-5.0F, -5.0F, -9.0F, 10, 5, 9, 0.0F);
		this.setRotateAngle(shape22, -0.25132741228718347F, 0.0F, 0.0F);
		this.shape22_3 = new ModelRenderer(this, 0, 57);
		this.shape22_3.setRotationPoint(0.0F, 9.0F, -13.0F);
		this.shape22_3.addBox(-6.5F, -11.0F, -3.0F, 13, 7, 5, 0.0F);
		this.shape22_8 = new ModelRenderer(this, 51, 162);
		this.shape22_8.setRotationPoint(0.0F, 11.46F, 14.8F);
		this.shape22_8.addBox(-5.0F, -11.5F, 0.0F, 10, 10, 28, 0.0F);
		this.setRotateAngle(shape22_8, 0.1884955592153876F, 0.0F, 0.0F);
		this.shape119_5 = new ModelRenderer(this, 73, 201);
		this.shape119_5.mirror = true;
		this.shape119_5.setRotationPoint(-13.0F, 0.0F, -11.0F);
		this.shape119_5.addBox(-23.0F, 0.0F, 0.0F, 23, 3, 5, 0.0F);
		this.setRotateAngle(shape119_5, 0.0F, 0.7539822368615504F, 0.0F);
		this.shape119_1 = new ModelRenderer(this, 130, 188);
		this.shape119_1.mirror = true;
		this.shape119_1.setRotationPoint(-3.2F, -7.5F, 6.3F);
		this.shape119_1.addBox(-18.0F, 0.0F, 0.0F, 18, 3, 16, 0.0F);
		this.setRotateAngle(shape119_1, 0.12566370614359174F, 0.1884955592153876F, -0.1884955592153876F);
		this.shape122_4 = new ModelRenderer(this, 126, 209);
		this.shape122_4.mirror = true;
		this.shape122_4.setRotationPoint(-4.0F, 0.0F, -5.9F);
		this.shape122_4.addBox(-26.0F, -0.5F, 0.0F, 23, 2, 5, 0.0F);
		this.setRotateAngle(shape122_4, 0.0F, 0.4146902302738527F, 0.0F);
		this.shape119_3 = new ModelRenderer(this, 73, 201);
		this.shape119_3.setRotationPoint(13.0F, 0.0F, -11.0F);
		this.shape119_3.addBox(0.0F, 0.0F, 0.0F, 23, 3, 5, 0.0F);
		this.setRotateAngle(shape119_3, 0.0F, -0.7539822368615504F, 0.0F);
		this.shape104 = new ModelRenderer(this, 33, 95);
		this.shape104.setRotationPoint(8.0F, 0.0F, 2.0F);
		this.shape104.addBox(0.0F, 0.0F, 0.0F, 9, 2, 7, 0.0F);
		this.setRotateAngle(shape104, 0.1884955592153876F, -0.439822971502571F, 0.25132741228718347F);
		this.shape119_4 = new ModelRenderer(this, 0, 122);
		this.shape119_4.mirror = true;
		this.shape119_4.setRotationPoint(-18.0F, 0.0F, 12.0F);
		this.shape119_4.addBox(-13.0F, 0.0F, -11.0F, 13, 3, 9, 0.0F);
		this.setRotateAngle(shape119_4, 0.0F, -0.5026548245743669F, 0.0F);
		this.shape22_4 = new ModelRenderer(this, 0, 86);
		this.shape22_4.setRotationPoint(0.0F, -11.0F, -7.0F);
		this.shape22_4.addBox(-5.0F, 0.0F, 0.0F, 10, 6, 9, 0.0F);
		this.setRotateAngle(shape22_4, 0.7539822368615504F, 0.0F, 0.0F);
		this.shape22_14 = new ModelRenderer(this, 117, 0);
		this.shape22_14.mirror = true;
		this.shape22_14.setRotationPoint(0.5F, 0.0F, 0.5F);
		this.shape22_14.addBox(-5.0F, -9.5F, -4.0F, 10, 12, 32, 0.0F);
		this.shape111_1 = new ModelRenderer(this, 90, 56);
		this.shape111_1.setRotationPoint(0.0F, -6.0F, -3.0F);
		this.shape111_1.addBox(-6.0F, -3.0F, 0.0F, 12, 15, 7, 0.0F);
		this.Main = new ModelRenderer(this, 0, 0);
		this.Main.setRotationPoint(0.0F, 8.0F, -31.0F);
		this.Main.addBox(-7.5F, -5.0F, -11.0F, 15, 12, 43, 0.0F);
		this.shape122_3 = new ModelRenderer(this, 74, 0);
		this.shape122_3.mirror = true;
		this.shape122_3.setRotationPoint(-18.0F, 1.0F, 16.0F);
		this.shape122_3.addBox(-7.0F, -0.5F, -6.0F, 7, 2, 6, 0.0F);
		this.setRotateAngle(shape122_3, 0.0F, -0.7099999397112933F, 0.0F);
		this.shape22_17 = new ModelRenderer(this, 100, 156);
		this.shape22_17.setRotationPoint(0.0F, -10.5F, 0.5F);
		this.shape22_17.addBox(-3.0F, 0.0F, 0.0F, 6, 4, 23, 0.0F);
		this.setRotateAngle(shape22_17, 0.25132741228718347F, 0.0F, 0.0F);
		this.shape115 = new ModelRenderer(this, 103, 130);
		this.shape115.setRotationPoint(0.0F, -0.5F, 22.0F);
		this.shape115.addBox(-4.0F, -5.0F, 0.0F, 8, 5, 20, 0.0F);
		this.setRotateAngle(shape115, -0.01884955592153876F, 0.0F, 0.0F);
		this.shape122_1 = new ModelRenderer(this, 126, 209);
		this.shape122_1.setRotationPoint(4.0F, 0.0F, -5.9F);
		this.shape122_1.addBox(3.0F, -0.5F, 0.0F, 23, 2, 5, 0.0F);
		this.setRotateAngle(shape122_1, 0.0F, -0.4146902302738527F, 0.0F);
		this.shape22_11 = new ModelRenderer(this, 123, 65);
		this.shape22_11.setRotationPoint(0.0F, -4.5F, 29.0F);
		this.shape22_11.addBox(-8.0F, -10.5F, 0.0F, 16, 18, 23, 0.0F);
		this.shape122_5 = new ModelRenderer(this, 0, 24);
		this.shape122_5.mirror = true;
		this.shape122_5.setRotationPoint(-7.3F, 0.0F, -4.0F);
		this.shape122_5.addBox(-11.0F, -0.5F, 0.0F, 13, 2, 4, 0.0F);
		this.shape124_1 = new ModelRenderer(this, 74, 27);
		this.shape124_1.mirror = true;
		this.shape124_1.setRotationPoint(-11.0F, 0.5F, -6.0F);
		this.shape124_1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 8, 0.0F);
		this.setRotateAngle(shape124_1, -0.0F, -0.5969026041820606F, -0.0F);
		this.shape22_16 = new ModelRenderer(this, 140, 107);
		this.shape22_16.mirror = true;
		this.shape22_16.setRotationPoint(-9.0F, 2.0F, 6.0F);
		this.shape22_16.addBox(-4.0F, -10.5F, 0.0F, 12, 18, 20, 0.0F);
		this.setRotateAngle(shape22_16, 0.06283185307179587F, -0.0942477796076938F, -0.06283185307179587F);
		this.shape22_5 = new ModelRenderer(this, 0, 102);
		this.shape22_5.setRotationPoint(0.0F, 0.0F, 9.0F);
		this.shape22_5.addBox(-5.0F, 0.0F, 0.0F, 10, 7, 12, 0.0F);
		this.setRotateAngle(shape22_5, -0.5654866776461628F, 0.0F, 0.0F);
		this.shape119_2 = new ModelRenderer(this, 0, 122);
		this.shape119_2.setRotationPoint(18.0F, 0.0F, 12.0F);
		this.shape119_2.addBox(0.0F, 0.0F, -11.0F, 13, 3, 9, 0.0F);
		this.setRotateAngle(shape119_2, 0.0F, 0.5026548245743669F, 0.0F);
		this.shape22_7 = new ModelRenderer(this, 87, 0);
		this.shape22_7.setRotationPoint(0.0F, 0.0F, 33.0F);
		this.shape22_7.addBox(-6.0F, 0.0F, 0.0F, 12, 11, 15, 0.0F);
		this.setRotateAngle(shape22_7, -0.1884955592153876F, 0.0F, 0.0F);
		this.shape119 = new ModelRenderer(this, 130, 188);
		this.shape119.setRotationPoint(3.2F, -7.5F, 6.3F);
		this.shape119.addBox(0.0F, 0.0F, 0.0F, 18, 3, 16, 0.0F);
		this.setRotateAngle(shape119, 0.12566370614359174F, -0.1884955592153876F, 0.1884955592153876F);
		this.shape124 = new ModelRenderer(this, 74, 27);
		this.shape124.setRotationPoint(11.0F, 0.5F, -6.0F);
		this.shape124.addBox(-4.0F, 0.0F, 0.0F, 4, 2, 8, 0.0F);
		this.setRotateAngle(shape124, -0.0F, 0.5969026041820606F, -0.0F);
		this.shape137 = new ModelRenderer(this, 45, 95);
		this.shape137.setRotationPoint(0.0F, -4.0F, -1.0F);
		this.shape137.addBox(-9.0F, 0.0F, 0.0F, 18, 9, 25, 0.0F);
		this.shape122 = new ModelRenderer(this, 74, 0);
		this.shape122.setRotationPoint(18.0F, 1.0F, 16.0F);
		this.shape122.addBox(0.0F, -0.5F, -6.0F, 7, 2, 6, 0.0F);
		this.setRotateAngle(shape122, 0.0F, 0.7099999397112933F, 0.0F);
		this.shape127_1 = new ModelRenderer(this, 0, 31);
		this.shape127_1.mirror = true;
		this.shape127_1.setRotationPoint(-13.0F, -0.5F, 7.0F);
		this.shape127_1.addBox(-3.0F, 0.0F, 0.0F, 7, 4, 7, 0.0F);
		this.shape22_2 = new ModelRenderer(this, 36, 130);
		this.shape22_2.setRotationPoint(0.0F, 7.0F, 32.0F);
		this.shape22_2.addBox(-5.5F, -9.0F, 0.0F, 11, 9, 22, 0.0F);
		this.setRotateAngle(shape22_2, 0.05026548245743669F, 0.0F, 0.0F);
		this.shape122_2 = new ModelRenderer(this, 0, 24);
		this.shape122_2.setRotationPoint(7.3F, 0.0F, -4.0F);
		this.shape122_2.addBox(-2.0F, -0.5F, 0.0F, 13, 2, 4, 0.0F);
		this.shape22_5.addChild(this.shape22_6);
		this.shape22_17.addChild(this.shape22_18);
		this.shape22_11.addChild(this.shape22_15);
		this.shape22_9.addChild(this.shape22_13);
		this.shape22_11.addChild(this.shape111);
		this.Main.addChild(this.shape104_1);
		this.shape22_8.addChild(this.shape22_12);
		this.Main.addChild(this.shape22_1);
		this.shape22_8.addChild(this.shape22_10);
		this.shape22_8.addChild(this.shape22_9);
		this.shape119.addChild(this.shape127);
		this.Main.addChild(this.shape22);
		this.Main.addChild(this.shape22_3);
		this.shape22_7.addChild(this.shape22_8);
		this.shape119_4.addChild(this.shape119_5);
		this.shape22_8.addChild(this.shape119_1);
		this.shape122_3.addChild(this.shape122_4);
		this.shape119_2.addChild(this.shape119_3);
		this.Main.addChild(this.shape104);
		this.shape119_1.addChild(this.shape119_4);
		this.shape22_1.addChild(this.shape22_4);
		this.shape22_10.addChild(this.shape22_14);
		this.shape22_11.addChild(this.shape111_1);
		this.shape119_1.addChild(this.shape122_3);
		this.shape22_11.addChild(this.shape22_17);
		this.shape22_2.addChild(this.shape115);
		this.shape122.addChild(this.shape122_1);
		this.shape22_8.addChild(this.shape22_11);
		this.shape122_4.addChild(this.shape122_5);
		this.shape119_1.addChild(this.shape124_1);
		this.shape22_11.addChild(this.shape22_16);
		this.shape22_4.addChild(this.shape22_5);
		this.shape119.addChild(this.shape119_2);
		this.shape22_6.addChild(this.shape22_7);
		this.shape22_8.addChild(this.shape119);
		this.shape119.addChild(this.shape124);
		this.Main.addChild(this.shape137);
		this.shape119.addChild(this.shape122);
		this.shape119_1.addChild(this.shape127_1);
		this.Main.addChild(this.shape22_2);
		this.shape122_1.addChild(this.shape122_2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.Main.render(f5);
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

	@Override
	public void render(Object obj)
	{
		if (obj instanceof EntityScout)
		{
			this.Main.rotateAngleX = ((EntityScout) obj).rotationPitch * 0.01F;

			if (this.isTurning(obj))
			{
				this.Main.rotateAngleZ += 0.005F * this.getTurnDirection(obj);
			} else
			{
				this.Main.rotateAngleZ *= 0.98F;
			}
			this.Main.rotateAngleZ = MathHelper.clamp(this.Main.rotateAngleZ, -0.45F, 0.45F);
		}
	}

	public boolean isTurning(Object obj)
	{
		return (int) MathHelper.clamp(((EntityScout) obj).rotationYaw - ((EntityScout) obj).prevRotationYaw, -1, 1) != 0;
	}

	public int getTurnDirection(Object obj)
	{
		return (int) -Math.signum(MathHelper.clamp(((EntityScout) obj).rotationYaw - ((EntityScout) obj).prevRotationYaw, -10, 10));
	}
}
