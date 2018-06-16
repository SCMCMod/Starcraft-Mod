package com.hypeirochus.scmc.client.renderer.item;

import com.hypeirochus.scmc.client.model.item.ModelC14GaussRifle;
import com.ocelot.api.utils.TextureUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumHandSide;

public class ItemRenderC14GaussRifle extends ItemRenderer {

	private static boolean aiming;

	public ItemRenderC14GaussRifle() {
		super(new ModelC14GaussRifle(), ModelC14GaussRifle.TEXTURE);
	}

	@Override
	public void renderPre(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		if (this.mc.gameSettings.keyBindAttack.isKeyDown() && cameraTransformType == TransformType.FIRST_PERSON_RIGHT_HAND) {
			aiming = true;
			Minecraft.getMinecraft().player.isSwingInProgress = false;
		} else {
			aiming = false;
		}
	}

	@Override
	public void renderFirstPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderFirstPerson(itemstack, entity, cameraTransformType, EnumHandSide.LEFT);
	}

	@Override
	public void renderFirstPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		renderFirstPerson(itemstack, entity, cameraTransformType, EnumHandSide.RIGHT);
	}

	private void renderFirstPerson(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType, EnumHandSide hand) {
		float scale = .03500067f;

		double x = 1.9199999794363976;
		double y = -9.480000011622906;
		double z = 0;

		if (aiming) {
			y -= 4.6;
			GlStateManager.rotate(8, 1, 0, 0);
			GlStateManager.rotate(1.4f, 0, 1, 0);
			x += 14.25;
		}

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(-20, 0, 1, 0);
		GlStateManager.rotate(180, .13f, .04f, .8200002f);
		GlStateManager.translate(x, y, z);
		TextureUtils.bindTexture(this.getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderThirdPersonLeft(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = .01900059f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(-190, -40, 40, -230);
		GlStateManager.rotate(-93, 0, 0, 1);
		GlStateManager.rotate(-90, .1999999999999993f, -.19000000000000006f * 6, -2.209999999999997f);
		GlStateManager.translate(-1.0, -15, -30.379999999999875);
		GlStateManager.color(1, 1, 1);
		TextureUtils.bindTexture(this.getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderThirdPersonRight(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = .01900059f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(-190, -40, 40, -230);
		GlStateManager.rotate(-93, 0, 0, 1);
		GlStateManager.rotate(-90, .1999999999999993f, -.19000000000000006f, -2.209999999999997f);
		GlStateManager.translate(1.0, -15, -30.379999999999875);
		GlStateManager.color(1, 1, 1);
		TextureUtils.bindTexture(this.getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInInventory(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = .019f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(100, 0, 1, 0);
		GlStateManager.rotate(190, 1.1799998f, -0.69999963f, 3.1599975f);
		GlStateManager.translate(1, -6.090000042691827, -16.57999962940812);
		GlStateManager.disableLighting();
		TextureUtils.bindTexture(this.getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.enableLighting();
		GlStateManager.popMatrix();
	}

	@Override
	public void renderInWorld(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = .01700059f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(-90, 1, 0, 0);
		GlStateManager.rotate(-90, 0, 0, 1);
		GlStateManager.rotate(-90, 1, 0, 0);
		GlStateManager.translate(.7300000462681062, -11.259999882429838, -19.649999560788274);
		GlStateManager.color(1, 1, 1);
		TextureUtils.bindTexture(this.getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderFixed(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {
		float scale = .01750059f;

		GlStateManager.pushMatrix();
		GlStateManager.scale(scale, scale, scale);
		GlStateManager.rotate(-90, 1, 0, 0);
		GlStateManager.rotate(-90, 0, 0, 1);
		GlStateManager.rotate(-90, 1, 0, 0);
		GlStateManager.rotate(0, 0, 1, 0);
		GlStateManager.translate(0, -8.259999882429838, -20);
		GlStateManager.color(1, 1, 1);
		TextureUtils.bindTexture(this.getResourceLocation());
		getModel().render(null, 0, 0, 0, 0, 0, 1);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderHead(ItemStack itemstack, EntityLivingBase entity, TransformType cameraTransformType) {

	}

	public static boolean isAiming() {
		return aiming;
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