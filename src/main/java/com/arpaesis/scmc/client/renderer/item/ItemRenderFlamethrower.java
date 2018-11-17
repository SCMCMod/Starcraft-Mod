package com.arpaesis.scmc.client.renderer.item;

import com.arpaesis.scmc.client.model.item.ModelFlamethrower;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemRenderFlamethrower extends ItemRenderer
{

	public ItemRenderFlamethrower()
	{
		super(new ModelFlamethrower(), ModelFlamethrower.TEXTURE);
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
	{
		renderFirstPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
	{
		float scale = .03500067f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(180, -.313f, .04f, .2700002f);
		GlStateManager.translate(1.9199999794363976, -11.480000011622906, 0);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
	{
		renderThirdPersonRight(itemstack, entity, cameraTransformType);
	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
	{
		float scale = .0250059f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(-180, -0.5f, 0f, 0.5f);
		GlStateManager.translate(1.0, -16, 0.0f);
		GlStateManager.color(1, 1, 1);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
	{
		float scale = .025f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(-50, 0, 1, 0);
		GlStateManager.rotate(-190, 3.2799998f, .29999963f, 3.1599975f);
		GlStateManager.translate(1, -10.090000042691827, 0.57999962940812);
		GlStateManager.disableLighting();
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.enableLighting();
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
	{
		float scale = .02500059f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(-90, 1, 0, 0);
		GlStateManager.rotate(-90, 0, 0, 1);
		GlStateManager.rotate(-90, 1, 0, 0);
		GlStateManager.translate(0, -12.259999882429838, 0);
		GlStateManager.color(1, 1, 1);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderFixed(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
	{
		float scale = .02500059f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(-90, 1, 0, 0);
		GlStateManager.rotate(-90, 0, 0, 1);
		GlStateManager.rotate(-90, 1, 0, 0);
		GlStateManager.rotate(90, 0, 1, 0);
		GlStateManager.translate(0, -12.259999882429838, 0);
		GlStateManager.color(1, 1, 1);
		Minecraft.getMinecraft().renderEngine.bindTexture(getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderHead(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType)
	{

	}
}

// Keep this code here. It's nice for on-the-fly GL fiddling (if you know how to
// abuse it), and it's how I got my values
// if(Keyboard.isKeyDown(Keyboard.KEY_V)) {
// scale = 1;
// }
//
// if(Keyboard.isKeyDown(Keyboard.KEY_B)) {
// x = 2.8;
// }
//
// if(Keyboard.isKeyDown(Keyboard.KEY_N)) {
// y = -8;
// }
//
// if(Keyboard.isKeyDown(Keyboard.KEY_M)) {
// z = -3.5;
// }
//
// if(Mouse.isButtonDown(0)) {
// scale -= .01;
// System.out.println("s " + scale);
// } else if(Mouse.isButtonDown(1)) {
// scale += .01;
// System.out.println("s " + scale);
// }
//
// if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
// x -= .01;
// System.out.println("x " + x);
// } else if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
// x += .01;
// System.out.println("x " + x);
// }
//
// if(Keyboard.isKeyDown(Keyboard.KEY_UP)) {
// y -= .01;
// System.out.println("y " + y);
// } else if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
// y += .01;
// System.out.println("y " + y);
// }
//
// if(Keyboard.isKeyDown(Keyboard.KEY_LBRACKET)) {
// z -= .01;
// System.out.println("z " + z);
// } else if(Keyboard.isKeyDown(Keyboard.KEY_RBRACKET)) {
// z += .01;
// System.out.println("z " + z);
// }