package com.hypeirochus.scmc.client.model.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

/**
 * This class is the base for custom armor model rendering.
 * 
 * @author Ocelot5836
 */
//TODO: MOVE TO CORE MOD
public abstract class ModelArmorBase extends ModelBiped
{

	/** The right arm of the biped. */
	public final ModelRenderer rArm;
	/** The right leg of the biped. */
	public final ModelRenderer rLeg;
	/** The head of the biped. */
	public final ModelRenderer head;
	/** The body of the biped. */
	public final ModelRenderer body;
	/** The left arm of the biped. */
	public final ModelRenderer lArm;
	/** The left leg of the biped. */
	public final ModelRenderer lLeg;

	/**
	 * This sets the model scale and texture dimensions.
	 * 
	 * @param modelSize The scale of the model
	 * @param textureWidth The width of the texture image
	 * @param textureHeight The height of the texture image
	 */
	public ModelArmorBase(float modelSize, int textureWidth, int textureHeight)
	{
		super(modelSize, 0, textureWidth, textureHeight);
		this.lArm = new ModelRenderer(this, 40, 16);
		this.lArm.mirror = true;
		this.lArm.setRotationPoint(5.0F, 2.0F, -0.0F);
		this.lArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(lArm, 0.0F, 0.0F, -0.10000736613927509F);
		this.head = new ModelRenderer(this, 0, 0);
		this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.rLeg = new ModelRenderer(this, 0, 16);
		this.rLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		this.rLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.lLeg = new ModelRenderer(this, 0, 16);
		this.lLeg.mirror = true;
		this.lLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		this.lLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.body = new ModelRenderer(this, 16, 16);
		this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
		this.rArm = new ModelRenderer(this, 40, 16);
		this.rArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.rArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(rArm, 0.0F, 0.0F, 0.10000736613927509F);
		this.setVisible(false);
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		GlStateManager.pushMatrix();

		if (this.isChild)
		{
			float f = 2.0F;
			GlStateManager.scale(0.75F, 0.75F, 0.75F);
			GlStateManager.translate(0.0F, 16.0F * scale, 0.0F);
			this.head.render(scale);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.5F, 0.5F, 0.5F);
			GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);

			this.head.showModel = false;
			renderArmorModel(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
			this.head.showModel = true;
		} else
		{
			if (entity.isSneaking())
			{
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}

			renderArmorModel(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		}

		GlStateManager.popMatrix();
	}

	@SuppressWarnings("incomplete-switch")
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
	{
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
		boolean flag = entity instanceof EntityLivingBase && ((EntityLivingBase) entity).getTicksElytraFlying() > 4;
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;

		if (flag)
		{
			this.head.rotateAngleX = -((float) Math.PI / 4F);
		} else
		{
			this.head.rotateAngleX = headPitch * 0.017453292F;
		}

		this.body.rotateAngleY = 0.0F;
		this.rArm.rotationPointZ = 0.0F;
		this.rArm.rotationPointX = -5.0F;
		this.lArm.rotationPointZ = 0.0F;
		this.lArm.rotationPointX = 5.0F;
		float f = 1.0F;

		if (flag)
		{
			f = (float) (entity.motionX * entity.motionX + entity.motionY * entity.motionY + entity.motionZ * entity.motionZ);
			f = f / 0.2F;
			f = f * f * f;
		}

		if (f < 1.0F)
		{
			f = 1.0F;
		}

		this.rArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
		this.lArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
		this.rArm.rotateAngleZ = 0.0F;
		this.lArm.rotateAngleZ = 0.0F;
		this.rLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
		this.lLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount / f;
		this.rLeg.rotateAngleY = 0.0F;
		this.lLeg.rotateAngleY = 0.0F;
		this.rLeg.rotateAngleZ = 0.0F;
		this.lLeg.rotateAngleZ = 0.0F;

		if (this.isRiding)
		{
			this.rArm.rotateAngleX += -((float) Math.PI / 5F);
			this.lArm.rotateAngleX += -((float) Math.PI / 5F);
			this.rLeg.rotateAngleX = -1.4137167F;
			this.rLeg.rotateAngleY = ((float) Math.PI / 10F);
			this.rLeg.rotateAngleZ = 0.07853982F;
			this.lLeg.rotateAngleX = -1.4137167F;
			this.lLeg.rotateAngleY = -((float) Math.PI / 10F);
			this.lLeg.rotateAngleZ = -0.07853982F;
		}

		this.rArm.rotateAngleY = 0.0F;
		this.rArm.rotateAngleZ = 0.0F;

		switch (this.leftArmPose)
		{
		case EMPTY:
			this.lArm.rotateAngleY = 0.0F;
			break;
		case BLOCK:
			this.lArm.rotateAngleX = this.lArm.rotateAngleX * 0.5F - 0.9424779F;
			this.lArm.rotateAngleY = 0.5235988F;
			break;
		case ITEM:
			this.lArm.rotateAngleX = this.lArm.rotateAngleX * 0.5F - ((float) Math.PI / 10F);
			this.lArm.rotateAngleY = 0.0F;
		}

		switch (this.rightArmPose)
		{
		case EMPTY:
			this.rArm.rotateAngleY = 0.0F;
			break;
		case BLOCK:
			this.rArm.rotateAngleX = this.rArm.rotateAngleX * 0.5F - 0.9424779F;
			this.rArm.rotateAngleY = -0.5235988F;
			break;
		case ITEM:
			this.rArm.rotateAngleX = this.rArm.rotateAngleX * 0.5F - ((float) Math.PI / 10F);
			this.rArm.rotateAngleY = 0.0F;
		}

		if (this.swingProgress > 0.0F)
		{
			EnumHandSide enumhandside = this.getMainHand(entity);
			ModelRenderer modelrenderer = this.getArmorArmForSide(enumhandside);
			float f1 = this.swingProgress;
			this.body.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float) Math.PI * 2F)) * 0.2F;

			if (enumhandside == EnumHandSide.LEFT)
			{
				this.body.rotateAngleY *= -1.0F;
			}

			this.rArm.rotationPointZ = MathHelper.sin(this.body.rotateAngleY) * 5.0F;
			this.rArm.rotationPointX = -MathHelper.cos(this.body.rotateAngleY) * 5.0F;
			this.lArm.rotationPointZ = -MathHelper.sin(this.body.rotateAngleY) * 5.0F;
			this.lArm.rotationPointX = MathHelper.cos(this.body.rotateAngleY) * 5.0F;
			this.rArm.rotateAngleY += this.body.rotateAngleY;
			this.lArm.rotateAngleY += this.body.rotateAngleY;
			this.lArm.rotateAngleX += this.body.rotateAngleY;
			f1 = 1.0F - this.swingProgress;
			f1 = f1 * f1;
			f1 = f1 * f1;
			f1 = 1.0F - f1;
			float f2 = MathHelper.sin(f1 * (float) Math.PI);
			float f3 = MathHelper.sin(this.swingProgress * (float) Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
			modelrenderer.rotateAngleX = (float) ((double) modelrenderer.rotateAngleX - ((double) f2 * 1.2D + (double) f3));
			modelrenderer.rotateAngleY += this.body.rotateAngleY * 2.0F;
			modelrenderer.rotateAngleZ += MathHelper.sin(this.swingProgress * (float) Math.PI) * -0.4F;
		}

		if (this.isSneak)
		{
			this.body.rotateAngleX = 0.5F;
			this.rArm.rotateAngleX += 0.4F;
			this.lArm.rotateAngleX += 0.4F;
			this.rLeg.rotationPointZ = 4.0F;
			this.lLeg.rotationPointZ = 4.0F;
			this.rLeg.rotationPointY = 9.0F;
			this.lLeg.rotationPointY = 9.0F;
			this.head.rotationPointY = 1.0F;
		} else
		{
			this.body.rotateAngleX = 0.0F;
			this.rLeg.rotationPointZ = 0.1F;
			this.lLeg.rotationPointZ = 0.1F;
			this.rLeg.rotationPointY = 12.0F;
			this.lLeg.rotationPointY = 12.0F;
			this.head.rotationPointY = 0.0F;
		}

		this.rArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.lArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.rArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
		this.lArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

		if (this.rightArmPose == ModelBiped.ArmPose.BOW_AND_ARROW)
		{
			this.rArm.rotateAngleY = -0.1F + this.head.rotateAngleY;
			this.lArm.rotateAngleY = 0.1F + this.head.rotateAngleY + 0.4F;
			this.rArm.rotateAngleX = -((float) Math.PI / 2F) + this.head.rotateAngleX;
			this.lArm.rotateAngleX = -((float) Math.PI / 2F) + this.head.rotateAngleX;
		} else if (this.leftArmPose == ModelBiped.ArmPose.BOW_AND_ARROW)
		{
			this.rArm.rotateAngleY = -0.1F + this.head.rotateAngleY - 0.4F;
			this.lArm.rotateAngleY = 0.1F + this.head.rotateAngleY;
			this.rArm.rotateAngleX = -((float) Math.PI / 2F) + this.head.rotateAngleX;
			this.lArm.rotateAngleX = -((float) Math.PI / 2F) + this.head.rotateAngleX;
		}
	}

	protected ModelRenderer getArmorArmForSide(EnumHandSide side)
	{
		return side == EnumHandSide.LEFT ? this.lArm : this.rArm;
	}

	/**
	 * This method renders the armor model to the biped.
	 *
	 * @param entity The entity instance
	 * @param limbSwing The limb swing of the entity
	 * @param limbSwingAmount The limb swing amount of the entity
	 * @param ageInTicks The entity's age in ticks
	 * @param netHeadYaw The entity's head yaw
	 * @param headPitch The entity's head pitch
	 * @param scale The scale of the model
	 */
	protected void renderArmorModel(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
		this.head.render(scale);
		this.body.render(scale);
		this.rArm.render(scale);
		this.lArm.render(scale);
		this.rLeg.render(scale);
		this.lLeg.render(scale);
	}

	/**
	 * This is a helper method used by tabula to set model rotation correctly.
	 * 
	 * @param modelRenderer The part for rotation
	 * @param x The x rotation
	 * @param y The y rotation
	 * @param z The z rotation
	 */
	protected void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}