package ga.scmc.client.renderer.model;

import hypeirochus.api.client.render.model.Model;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * broodling - Undefined Created using Tabula 5.1.0
 */
public class ModelBroodling extends Model {

	public ModelRenderer body01;
	public ModelRenderer body02;
	public ModelRenderer chest;
	public ModelRenderer head;
	public ModelRenderer lArm1;
	public ModelRenderer lArm2;
	public ModelRenderer lArm3;
	public ModelRenderer lArm4;
	public ModelRenderer lArm5;
	public ModelRenderer lArmClaw1a;
	public ModelRenderer lArmClaw1b;
	public ModelRenderer lArmClaw1c;
	public ModelRenderer lArmClaw1d;
	public ModelRenderer lArmClaw2;
	public ModelRenderer lTailSpike1a;
	public ModelRenderer lTailSpike1a_1;
	public ModelRenderer lTailSpike1b;
	public ModelRenderer lTailSpike1c;
	public ModelRenderer lTailSpike1d;
	public ModelRenderer lTailSpike2;
	public ModelRenderer lTailSpike2_1;
	public ModelRenderer lTailSpike3a;
	public ModelRenderer lTailSpike3b;
	public ModelRenderer lTailSpike3c;
	public ModelRenderer lTailSpike3d;
	public ModelRenderer lTailSpike4;
	public ModelRenderer lTailSpike5a;
	public ModelRenderer lTailSpike5b;
	public ModelRenderer lTailSpike5c;
	public ModelRenderer lTailSpike5d;
	public ModelRenderer lTailSpike6;
	public ModelRenderer lTailSpike7a;
	public ModelRenderer lTailSpike7b;
	public ModelRenderer lTailSpike7c;
	public ModelRenderer lTailSpike7d;
	public ModelRenderer lTailSpike8;
	public ModelRenderer lTusk;
	public ModelRenderer lTusk2a;
	public ModelRenderer lTusk2b;
	public ModelRenderer lTusk2c;
	public ModelRenderer lTusk2d;
	public ModelRenderer lTusk3;
	public ModelRenderer lWing;
	public ModelRenderer lWing2;
	public ModelRenderer rArm1;
	public ModelRenderer rArm2;
	public ModelRenderer rArm3;
	public ModelRenderer rArm4;
	public ModelRenderer rArm5;
	public ModelRenderer rArmClaw1a;
	public ModelRenderer rArmClaw1b;
	public ModelRenderer rArmClaw1c;
	public ModelRenderer rArmClaw1d;
	public ModelRenderer rArmClaw2;
	public ModelRenderer rTailSpike1b;
	public ModelRenderer rTailSpike1c;
	public ModelRenderer rTailSpike1d;
	public ModelRenderer rTailSpike3a;
	public ModelRenderer rTailSpike3b;
	public ModelRenderer rTailSpike3c;
	public ModelRenderer rTailSpike3d;
	public ModelRenderer rTailSpike4;
	public ModelRenderer rTailSpike5a;
	public ModelRenderer rTailSpike5b;
	public ModelRenderer rTailSpike5c;
	public ModelRenderer rTailSpike5d;
	public ModelRenderer rTailSpike6;
	public ModelRenderer rTailSpike7a;
	public ModelRenderer rTailSpike7b;
	public ModelRenderer rTailSpike7c;
	public ModelRenderer rTailSpike7d;
	public ModelRenderer rTailSpike8;
	public ModelRenderer rTusk;
	public ModelRenderer rTusk2a;
	public ModelRenderer rTusk2b;
	public ModelRenderer rTusk2c;
	public ModelRenderer rTusk2d;
	public ModelRenderer rTusk3;
	public ModelRenderer rWing;
	public ModelRenderer rWing2;
	public ModelRenderer spinePlating01;
	public ModelRenderer spinePlating02;
	public ModelRenderer spinePlating03;
	public ModelRenderer spinePlating04;
	public ModelRenderer tail1;
	public ModelRenderer tail2;
	public ModelRenderer tail3;

	public ModelBroodling() {
		textureWidth = 128;
		textureHeight = 64;
		lArm1 = new ModelRenderer(this, 35, 21);
		lArm1.setRotationPoint(4.0F, 2.0F, 0.4F);
		lArm1.addBox(-0.6F, -1.0F, -1.5F, 2, 4, 3, 0.0F);
		setRotation(lArm1, -0.5462880558742251F, 0.0F, -0.6829473363053812F);
		lTailSpike5b = new ModelRenderer(this, 68, 8);
		lTailSpike5b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike5b.addBox(1.0F, -0.8F, -0.3F, 1, 1, 1, 0.0F);
		lArmClaw1d = new ModelRenderer(this, 68, 7);
		lArmClaw1d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw1d.addBox(-0.3F, -0.8F, -0.1F, 1, 1, 2, 0.0F);
		lWing2 = new ModelRenderer(this, 49, 33);
		lWing2.setRotationPoint(0.0F, 0.0F, 0.0F);
		lWing2.addBox(1.0F, 0.0F, -4.6F, 13, 0, 10, 0.0F);
		rTusk2b = new ModelRenderer(this, 68, 7);
		rTusk2b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTusk2b.addBox(-0.2F, -0.8F, -2.4F, 1, 1, 2, 0.0F);
		rArm4 = new ModelRenderer(this, 36, 36);
		rArm4.mirror = true;
		rArm4.setRotationPoint(0.0F, 1.5F, 0.3F);
		rArm4.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
		setRotation(rArm4, 0.7285004297824331F, -0.091106186954104F, -0.091106186954104F);
		rTailSpike3b = new ModelRenderer(this, 68, 8);
		rTailSpike3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike3b.addBox(-2.0F, -0.8F, -0.3F, 2, 1, 1, 0.0F);
		rTailSpike6 = new ModelRenderer(this, 68, 8);
		rTailSpike6.setRotationPoint(-1.6F, 0.0F, 0.0F);
		rTailSpike6.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotation(rTailSpike6, 0.0F, 0.0F, -0.22759093446006054F);
		rWing = new ModelRenderer(this, 58, 23);
		rWing.mirror = true;
		rWing.setRotationPoint(-3.0F, 0.0F, 0.1F);
		rWing.addBox(-9.0F, -0.5F, -2.2F, 9, 1, 5, 0.0F);
		setRotation(rWing, 0.0F, 0.31869712141416456F, 0.0F);
		rTusk3 = new ModelRenderer(this, 68, 7);
		rTusk3.setRotationPoint(0.0F, 0.0F, -1.9F);
		rTusk3.addBox(-0.5F, -0.5F, -2.3F, 1, 1, 2, 0.0F);
		setRotation(rTusk3, 0.0F, -0.18203784098300857F, 0.0F);
		rTailSpike1c = new ModelRenderer(this, 68, 8);
		rTailSpike1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike1c.addBox(-2.0F, -0.3F, -0.8F, 2, 1, 1, 0.0F);
		lTailSpike3b = new ModelRenderer(this, 68, 8);
		lTailSpike3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike3b.addBox(0.0F, -0.8F, -0.3F, 2, 1, 1, 0.0F);
		lTailSpike3d = new ModelRenderer(this, 68, 8);
		lTailSpike3d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike3d.addBox(0.0F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		body01 = new ModelRenderer(this, 0, 22);
		body01.setRotationPoint(0.0F, 0.6F, 3.3F);
		body01.addBox(-3.5F, -0.9F, 0.0F, 7, 4, 3, 0.0F);
		setRotation(body01, -0.091106186954104F, 0.0F, 0.0F);
		rArmClaw2 = new ModelRenderer(this, 68, 7);
		rArmClaw2.setRotationPoint(0.0F, 0.0F, 1.8F);
		rArmClaw2.addBox(-0.5F, -0.5F, -0.3F, 1, 1, 2, 0.0F);
		setRotation(rArmClaw2, 0.6373942428283291F, 0.0F, 0.0F);
		lTailSpike1d = new ModelRenderer(this, 68, 8);
		lTailSpike1d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike1d.addBox(0.0F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		lTusk2c = new ModelRenderer(this, 68, 7);
		lTusk2c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTusk2c.addBox(-0.8F, -0.2F, -2.4F, 1, 1, 2, 0.0F);
		lTusk2d = new ModelRenderer(this, 68, 7);
		lTusk2d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTusk2d.addBox(-0.2F, -0.2F, -2.4F, 1, 1, 2, 0.0F);
		lWing = new ModelRenderer(this, 58, 23);
		lWing.setRotationPoint(3.0F, 0.0F, 0.1F);
		lWing.addBox(0.0F, -0.5F, -2.2F, 9, 1, 5, 0.0F);
		setRotation(lWing, 0.0F, -0.31869712141416456F, 0.0F);
		lTailSpike1a_1 = new ModelRenderer(this, 68, 8);
		lTailSpike1a_1.setRotationPoint(-2.3F, 1.0F, -0.3F);
		lTailSpike1a_1.addBox(-2.0F, -0.8F, -0.8F, 2, 1, 1, 0.0F);
		setRotation(lTailSpike1a_1, 0.18203784098300857F, 0.22759093446006054F, -0.8196066167365371F);
		lTailSpike5a = new ModelRenderer(this, 68, 8);
		lTailSpike5a.setRotationPoint(0.1F, 0.6F, 2.2F);
		lTailSpike5a.addBox(1.0F, -0.8F, -0.8F, 1, 1, 1, 0.0F);
		setRotation(lTailSpike5a, 0.4553564018453205F, -0.40980330836826856F, 0.22759093446006054F);
		spinePlating03 = new ModelRenderer(this, 39, 7);
		spinePlating03.setRotationPoint(0.0F, -0.6F, -1.3F);
		spinePlating03.addBox(-0.5F, -0.7F, -0.5F, 4, 1, 4, 0.0F);
		setRotation(spinePlating03, 0.27314402793711257F, -0.7853981633974483F, -0.18203784098300857F);
		lTailSpike7c = new ModelRenderer(this, 68, 8);
		lTailSpike7c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike7c.addBox(1.0F, -0.3F, -0.8F, 1, 1, 1, 0.0F);
		lArm2 = new ModelRenderer(this, 36, 29);
		lArm2.setRotationPoint(0.0F, 2.3F, 0.0F);
		lArm2.addBox(-0.7F, -0.3F, -0.8F, 2, 3, 2, 0.0F);
		setRotation(lArm2, -0.4553564018453205F, -0.40980330836826856F, 0.36425021489121656F);
		rTailSpike1b = new ModelRenderer(this, 68, 8);
		rTailSpike1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike1b.addBox(-2.0F, -0.8F, -0.3F, 2, 1, 1, 0.0F);
		lArm5 = new ModelRenderer(this, 36, 42);
		lArm5.setRotationPoint(0.0F, 0.0F, -2.6F);
		lArm5.addBox(-1.0F, -0.7F, -1.0F, 2, 3, 2, 0.0F);
		setRotation(lArm5, -1.5481070465189704F, 0.091106186954104F, 0.091106186954104F);
		rArmClaw1d = new ModelRenderer(this, 68, 7);
		rArmClaw1d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw1d.addBox(-0.3F, -0.8F, -0.1F, 1, 1, 2, 0.0F);
		rArm1 = new ModelRenderer(this, 35, 21);
		rArm1.mirror = true;
		rArm1.setRotationPoint(-4.0F, 2.0F, 0.4F);
		rArm1.addBox(-1.6F, -1.0F, -1.5F, 2, 4, 3, 0.0F);
		setRotation(rArm1, -0.5462880558742251F, 0.0F, 0.6829473363053812F);
		lTailSpike8 = new ModelRenderer(this, 68, 8);
		lTailSpike8.setRotationPoint(1.5F, 0.0F, -0.1F);
		lTailSpike8.addBox(0.4F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		setRotation(lTailSpike8, 0.0F, 0.0F, 0.22759093446006054F);
		rTailSpike7b = new ModelRenderer(this, 68, 8);
		rTailSpike7b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike7b.addBox(-2.0F, -0.8F, -0.3F, 1, 1, 1, 0.0F);
		lTailSpike1a = new ModelRenderer(this, 68, 8);
		lTailSpike1a.setRotationPoint(2.3F, 1.0F, -0.3F);
		lTailSpike1a.addBox(0.0F, -0.8F, -0.8F, 2, 1, 1, 0.0F);
		setRotation(lTailSpike1a, 0.18203784098300857F, -0.22759093446006054F, 0.8196066167365371F);
		lTailSpike7b = new ModelRenderer(this, 68, 8);
		lTailSpike7b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike7b.addBox(1.0F, -0.8F, -0.3F, 1, 1, 1, 0.0F);
		lTailSpike5c = new ModelRenderer(this, 68, 8);
		lTailSpike5c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike5c.addBox(1.0F, -0.3F, -0.8F, 1, 1, 1, 0.0F);
		lTailSpike7a = new ModelRenderer(this, 68, 8);
		lTailSpike7a.setRotationPoint(-0.1F, -0.1F, 3.7F);
		lTailSpike7a.addBox(1.0F, -0.8F, -0.8F, 1, 1, 1, 0.0F);
		setRotation(lTailSpike7a, 0.4553564018453205F, -0.40980330836826856F, 0.22759093446006054F);
		lTailSpike6 = new ModelRenderer(this, 68, 8);
		lTailSpike6.setRotationPoint(1.5F, 0.0F, -0.1F);
		lTailSpike6.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotation(lTailSpike6, 0.0F, 0.0F, 0.22759093446006054F);
		lTailSpike1c = new ModelRenderer(this, 68, 8);
		lTailSpike1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike1c.addBox(0.0F, -0.3F, -0.8F, 2, 1, 1, 0.0F);
		lTailSpike2 = new ModelRenderer(this, 68, 8);
		lTailSpike2.setRotationPoint(1.5F, 0.0F, -0.1F);
		lTailSpike2.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotation(lTailSpike2, 0.0F, 0.0F, 0.22759093446006054F);
		rArmClaw1c = new ModelRenderer(this, 68, 7);
		rArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw1c.addBox(-0.8F, -0.8F, -0.1F, 1, 1, 2, 0.0F);
		lTailSpike2_1 = new ModelRenderer(this, 68, 8);
		lTailSpike2_1.setRotationPoint(-1.5F, -0.1F, -0.1F);
		lTailSpike2_1.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotation(lTailSpike2_1, 0.0F, 0.0F, -0.22759093446006054F);
		rTailSpike3d = new ModelRenderer(this, 68, 8);
		rTailSpike3d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike3d.addBox(-2.0F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		rTusk2c = new ModelRenderer(this, 68, 7);
		rTusk2c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTusk2c.addBox(-0.8F, -0.2F, -2.4F, 1, 1, 2, 0.0F);
		rTailSpike7a = new ModelRenderer(this, 68, 8);
		rTailSpike7a.setRotationPoint(0.0F, -0.1F, 3.7F);
		rTailSpike7a.addBox(-2.0F, -0.8F, -0.8F, 1, 1, 1, 0.0F);
		setRotation(rTailSpike7a, 0.4553564018453205F, 0.40980330836826856F, -0.22759093446006054F);
		rArmClaw1a = new ModelRenderer(this, 68, 7);
		rArmClaw1a.setRotationPoint(0.0F, 1.7F, 0.6F);
		rArmClaw1a.addBox(-0.3F, -0.2F, -0.1F, 1, 1, 2, 0.0F);
		setRotation(rArmClaw1a, -0.6373942428283291F, 0.0F, 0.091106186954104F);
		lTailSpike1b = new ModelRenderer(this, 68, 8);
		lTailSpike1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike1b.addBox(0.0F, -0.8F, -0.3F, 2, 1, 1, 0.0F);
		lTusk2b = new ModelRenderer(this, 68, 7);
		lTusk2b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTusk2b.addBox(-0.2F, -0.8F, -2.4F, 1, 1, 2, 0.0F);
		rTailSpike8 = new ModelRenderer(this, 68, 8);
		rTailSpike8.setRotationPoint(-1.6F, 0.0F, 0.0F);
		rTailSpike8.addBox(-1.3F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		setRotation(rTailSpike8, 0.0F, 0.0F, -0.22759093446006054F);
		rTailSpike7d = new ModelRenderer(this, 68, 8);
		rTailSpike7d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike7d.addBox(-2.0F, -0.3F, -0.3F, 1, 1, 1, 0.0F);
		lTailSpike3c = new ModelRenderer(this, 68, 8);
		lTailSpike3c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike3c.addBox(0.0F, -0.3F, -0.8F, 2, 1, 1, 0.0F);
		lTusk2a = new ModelRenderer(this, 68, 7);
		lTusk2a.setRotationPoint(0.0F, 0.0F, -1.9F);
		lTusk2a.addBox(-0.8F, -0.8F, -2.4F, 1, 1, 2, 0.0F);
		setRotation(lTusk2a, 0.0F, 0.27314402793711257F, 0.0F);
		rTailSpike5d = new ModelRenderer(this, 68, 8);
		rTailSpike5d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike5d.addBox(-2.0F, -0.3F, -0.3F, 1, 1, 1, 0.0F);
		lArm3 = new ModelRenderer(this, 37, 29);
		lArm3.setRotationPoint(0.3F, 2.4F, 0.0F);
		lArm3.addBox(-0.5F, -0.3F, -0.8F, 1, 2, 2, 0.0F);
		setRotation(lArm3, -0.4553564018453205F, -0.22759093446006054F, 0.0F);
		lArmClaw1c = new ModelRenderer(this, 68, 7);
		lArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw1c.addBox(-0.8F, -0.8F, -0.1F, 1, 1, 2, 0.0F);
		spinePlating01 = new ModelRenderer(this, 39, 0);
		spinePlating01.setRotationPoint(0.0F, -0.7F, -2.2F);
		spinePlating01.addBox(-0.5F, -0.7F, -0.5F, 5, 1, 5, 0.0F);
		setRotation(spinePlating01, 0.40980330836826856F, -0.7853981633974483F, -0.27314402793711257F);
		lArmClaw1b = new ModelRenderer(this, 68, 7);
		lArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw1b.addBox(-0.8F, -0.2F, -0.1F, 1, 1, 2, 0.0F);
		chest = new ModelRenderer(this, 0, 8);
		chest.setRotationPoint(0.0F, 18.0F, -5.1F);
		chest.addBox(-4.0F, -1.3F, -2.5F, 8, 5, 6, 0.0F);
		spinePlating04 = new ModelRenderer(this, 41, 14);
		spinePlating04.setRotationPoint(0.0F, 0.0F, 1.5F);
		spinePlating04.addBox(-0.5F, -0.7F, -0.5F, 3, 1, 3, 0.0F);
		setRotation(spinePlating04, 0.27314402793711257F, -0.7853981633974483F, -0.18203784098300857F);
		spinePlating02 = new ModelRenderer(this, 39, 7);
		spinePlating02.setRotationPoint(0.0F, -0.7F, 0.4F);
		spinePlating02.addBox(-0.5F, -0.7F, -0.5F, 4, 1, 4, 0.0F);
		setRotation(spinePlating02, 0.27314402793711257F, -0.7853981633974483F, -0.18203784098300857F);
		tail2 = new ModelRenderer(this, 0, 49);
		tail2.setRotationPoint(0.0F, 0.3F, 3.5F);
		tail2.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F);
		setRotation(tail2, 0.4553564018453205F, 0.0F, 0.0F);
		rArm3 = new ModelRenderer(this, 37, 29);
		rArm3.mirror = true;
		rArm3.setRotationPoint(0.3F, 2.4F, 0.0F);
		rArm3.addBox(-0.5F, -0.3F, -0.8F, 1, 2, 2, 0.0F);
		setRotation(rArm3, -0.4553564018453205F, 0.22759093446006054F, 0.0F);
		body02 = new ModelRenderer(this, 0, 32);
		body02.setRotationPoint(0.0F, 1.5F, 3.9F);
		body02.addBox(-3.0F, -1.5F, -1.5F, 6, 3, 3, 0.0F);
		setRotation(body02, -0.27314402793711257F, 0.0F, 0.0F);
		rWing2 = new ModelRenderer(this, 49, 33);
		rWing2.mirror = true;
		rWing2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rWing2.addBox(-14.0F, 0.0F, -4.6F, 13, 0, 10, 0.0F);
		head = new ModelRenderer(this, 0, 0);
		head.setRotationPoint(0.0F, 0.9F, -2.0F);
		head.addBox(-2.0F, -2.0F, -2.4F, 4, 4, 2, 0.0F);
		lTailSpike4 = new ModelRenderer(this, 68, 8);
		lTailSpike4.setRotationPoint(1.5F, 0.0F, -0.1F);
		lTailSpike4.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotation(lTailSpike4, 0.0F, 0.0F, 0.22759093446006054F);
		lTusk3 = new ModelRenderer(this, 68, 7);
		lTusk3.setRotationPoint(0.0F, 0.0F, -1.9F);
		lTusk3.addBox(-0.5F, -0.5F, -2.3F, 1, 1, 2, 0.0F);
		setRotation(lTusk3, 0.0F, 0.18203784098300857F, 0.0F);
		lArmClaw2 = new ModelRenderer(this, 68, 7);
		lArmClaw2.setRotationPoint(0.0F, 0.0F, 1.8F);
		lArmClaw2.addBox(-0.5F, -0.5F, -0.3F, 1, 1, 2, 0.0F);
		setRotation(lArmClaw2, 0.6373942428283291F, 0.0F, 0.0F);
		rTailSpike3c = new ModelRenderer(this, 68, 8);
		rTailSpike3c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike3c.addBox(-2.0F, -0.3F, -0.8F, 2, 1, 1, 0.0F);
		rArmClaw1b = new ModelRenderer(this, 68, 7);
		rArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw1b.addBox(-0.8F, -0.2F, -0.1F, 1, 1, 2, 0.0F);
		rTailSpike1d = new ModelRenderer(this, 68, 8);
		rTailSpike1d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike1d.addBox(-2.0F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		rTusk = new ModelRenderer(this, 67, 0);
		rTusk.setRotationPoint(-2.3F, 0.0F, 0.1F);
		rTusk.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
		setRotation(rTusk, 0.40980330836826856F, 0.40980330836826856F, 0.0F);
		rTailSpike7c = new ModelRenderer(this, 68, 8);
		rTailSpike7c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike7c.addBox(-2.0F, -0.3F, -0.8F, 1, 1, 1, 0.0F);
		rTailSpike5a = new ModelRenderer(this, 68, 8);
		rTailSpike5a.setRotationPoint(-0.1F, 0.6F, 2.2F);
		rTailSpike5a.addBox(-2.0F, -0.8F, -0.8F, 1, 1, 1, 0.0F);
		setRotation(rTailSpike5a, 0.4553564018453205F, 0.40980330836826856F, -0.22759093446006054F);
		rTailSpike5b = new ModelRenderer(this, 68, 8);
		rTailSpike5b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike5b.addBox(-2.0F, -0.8F, -0.3F, 1, 1, 1, 0.0F);
		rTailSpike5c = new ModelRenderer(this, 68, 8);
		rTailSpike5c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTailSpike5c.addBox(-2.0F, -0.3F, -0.8F, 1, 1, 1, 0.0F);
		tail1 = new ModelRenderer(this, 0, 40);
		tail1.setRotationPoint(0.0F, 0.0F, 0.9F);
		tail1.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
		setRotation(tail1, -0.27314402793711257F, 0.0F, 0.0F);
		tail3 = new ModelRenderer(this, 0, 55);
		tail3.setRotationPoint(0.0F, 0.0F, 3.8F);
		tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		setRotation(tail3, 0.18203784098300857F, 0.0F, 0.0F);
		rTusk2d = new ModelRenderer(this, 68, 7);
		rTusk2d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rTusk2d.addBox(-0.2F, -0.2F, -2.4F, 1, 1, 2, 0.0F);
		rTusk2a = new ModelRenderer(this, 68, 7);
		rTusk2a.setRotationPoint(0.0F, 0.0F, -1.9F);
		rTusk2a.addBox(-0.8F, -0.8F, -2.4F, 1, 1, 2, 0.0F);
		setRotation(rTusk2a, 0.0F, -0.27314402793711257F, 0.0F);
		lTailSpike3a = new ModelRenderer(this, 68, 8);
		lTailSpike3a.setRotationPoint(1.1F, 1.0F, 1.1F);
		lTailSpike3a.addBox(0.0F, -0.8F, -0.8F, 2, 1, 1, 0.0F);
		setRotation(lTailSpike3a, 0.045553093477052F, -0.4553564018453205F, 0.5918411493512771F);
		rTailSpike4 = new ModelRenderer(this, 68, 8);
		rTailSpike4.setRotationPoint(-1.6F, 0.0F, 0.0F);
		rTailSpike4.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotation(rTailSpike4, 0.0F, 0.0F, -0.22759093446006054F);
		lTusk = new ModelRenderer(this, 67, 0);
		lTusk.setRotationPoint(2.4F, 0.0F, 0.1F);
		lTusk.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
		setRotation(lTusk, 0.40980330836826856F, -0.40980330836826856F, 0.0F);
		rArm2 = new ModelRenderer(this, 36, 29);
		rArm2.mirror = true;
		rArm2.setRotationPoint(-0.8F, 2.3F, 0.0F);
		rArm2.addBox(-0.7F, -0.3F, -0.8F, 2, 3, 2, 0.0F);
		setRotation(rArm2, -0.4553564018453205F, 0.40980330836826856F, -0.36425021489121656F);
		rTailSpike3a = new ModelRenderer(this, 68, 8);
		rTailSpike3a.setRotationPoint(-1.1F, 0.87F, 1.1F);
		rTailSpike3a.addBox(-2.0F, -0.8F, -0.8F, 2, 1, 1, 0.0F);
		setRotation(rTailSpike3a, 0.045553093477052F, 0.4553564018453205F, -0.5918411493512771F);
		lArmClaw1a = new ModelRenderer(this, 68, 7);
		lArmClaw1a.setRotationPoint(0.0F, 1.7F, 0.6F);
		lArmClaw1a.addBox(-0.3F, -0.2F, -0.1F, 1, 1, 2, 0.0F);
		setRotation(lArmClaw1a, -0.6373942428283291F, 0.0F, -0.091106186954104F);
		rArm5 = new ModelRenderer(this, 36, 42);
		rArm5.mirror = true;
		rArm5.setRotationPoint(0.0F, 0.0F, -2.6F);
		rArm5.addBox(-1.0F, -0.7F, -1.0F, 2, 3, 2, 0.0F);
		setRotation(rArm5, -1.5481070465189704F, -0.091106186954104F, -0.091106186954104F);
		lTailSpike7d = new ModelRenderer(this, 68, 8);
		lTailSpike7d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike7d.addBox(1.0F, -0.3F, -0.3F, 1, 1, 1, 0.0F);
		lTailSpike5d = new ModelRenderer(this, 68, 8);
		lTailSpike5d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lTailSpike5d.addBox(1.0F, -0.3F, -0.3F, 1, 1, 1, 0.0F);
		lArm4 = new ModelRenderer(this, 36, 36);
		lArm4.setRotationPoint(0.0F, 1.5F, 0.3F);
		lArm4.addBox(-0.5F, -0.5F, -2.8F, 1, 1, 3, 0.0F);
		setRotation(lArm4, 0.7285004297824331F, 0.091106186954104F, 0.091106186954104F);
		chest.addChild(lArm1);
		lTailSpike5a.addChild(lTailSpike5b);
		lArmClaw1a.addChild(lArmClaw1d);
		lWing.addChild(lWing2);
		rTusk2a.addChild(rTusk2b);
		rArm3.addChild(rArm4);
		rTailSpike3a.addChild(rTailSpike3b);
		rTailSpike5a.addChild(rTailSpike6);
		chest.addChild(rWing);
		rTusk2a.addChild(rTusk3);
		lTailSpike1a_1.addChild(rTailSpike1c);
		lTailSpike3a.addChild(lTailSpike3b);
		lTailSpike3a.addChild(lTailSpike3d);
		chest.addChild(body01);
		rArmClaw1a.addChild(rArmClaw2);
		lTailSpike1a.addChild(lTailSpike1d);
		lTusk2a.addChild(lTusk2c);
		lTusk2a.addChild(lTusk2d);
		chest.addChild(lWing);
		body02.addChild(lTailSpike1a_1);
		tail1.addChild(lTailSpike5a);
		body01.addChild(spinePlating03);
		lTailSpike7a.addChild(lTailSpike7c);
		lArm1.addChild(lArm2);
		lTailSpike1a_1.addChild(rTailSpike1b);
		lArm4.addChild(lArm5);
		rArmClaw1a.addChild(rArmClaw1d);
		chest.addChild(rArm1);
		lTailSpike7a.addChild(lTailSpike8);
		rTailSpike7a.addChild(rTailSpike7b);
		body02.addChild(lTailSpike1a);
		lTailSpike7a.addChild(lTailSpike7b);
		lTailSpike5a.addChild(lTailSpike5c);
		tail1.addChild(lTailSpike7a);
		lTailSpike5a.addChild(lTailSpike6);
		lTailSpike1a.addChild(lTailSpike1c);
		lTailSpike1a.addChild(lTailSpike2);
		rArmClaw1a.addChild(rArmClaw1c);
		lTailSpike1a_1.addChild(lTailSpike2_1);
		rTailSpike3a.addChild(rTailSpike3d);
		rTusk2a.addChild(rTusk2c);
		tail1.addChild(rTailSpike7a);
		rArm5.addChild(rArmClaw1a);
		lTailSpike1a.addChild(lTailSpike1b);
		lTusk2a.addChild(lTusk2b);
		rTailSpike7a.addChild(rTailSpike8);
		rTailSpike7a.addChild(rTailSpike7d);
		lTailSpike3a.addChild(lTailSpike3c);
		lTusk.addChild(lTusk2a);
		rTailSpike5a.addChild(rTailSpike5d);
		lArm2.addChild(lArm3);
		lArmClaw1a.addChild(lArmClaw1c);
		chest.addChild(spinePlating01);
		lArmClaw1a.addChild(lArmClaw1b);
		body01.addChild(spinePlating04);
		chest.addChild(spinePlating02);
		tail1.addChild(tail2);
		rArm2.addChild(rArm3);
		body01.addChild(body02);
		rWing.addChild(rWing2);
		chest.addChild(head);
		lTailSpike3a.addChild(lTailSpike4);
		lTusk2a.addChild(lTusk3);
		lArmClaw1a.addChild(lArmClaw2);
		rTailSpike3a.addChild(rTailSpike3c);
		rArmClaw1a.addChild(rArmClaw1b);
		lTailSpike1a_1.addChild(rTailSpike1d);
		head.addChild(rTusk);
		rTailSpike7a.addChild(rTailSpike7c);
		tail1.addChild(rTailSpike5a);
		rTailSpike5a.addChild(rTailSpike5b);
		rTailSpike5a.addChild(rTailSpike5c);
		body02.addChild(tail1);
		tail2.addChild(tail3);
		rTusk2a.addChild(rTusk2d);
		rTusk.addChild(rTusk2a);
		body02.addChild(lTailSpike3a);
		rTailSpike3a.addChild(rTailSpike4);
		head.addChild(lTusk);
		rArm1.addChild(rArm2);
		body02.addChild(rTailSpike3a);
		lArm5.addChild(lArmClaw1a);
		rArm4.addChild(rArm5);
		lTailSpike7a.addChild(lTailSpike7d);
		lTailSpike5a.addChild(lTailSpike5d);
		lArm3.addChild(lArm4);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
		chest.render(f5);
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
		// super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks,
		// netHeadYaw, headPitch, scaleFactor, entityIn);
		lArm1.rotateAngleX = MathHelper.sin(par1 * 1F) * 1 * par2 - 0.5F;
		rArm1.rotateAngleX = MathHelper.cos(par1 * 1F) * 1 * par2 - 0.5F;
	}

	@Override
	public void render(Object obj) {
		EntityLivingBase base = (EntityLivingBase) obj;
		lArm1.rotateAngleX = MathHelper.sin(swingProgress(obj) * 1F) * 1 * swingProgressPrev(obj) - 0.5F;
		rArm1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 1F) * 1 * swingProgressPrev(obj) - 0.5F;
	}
}
