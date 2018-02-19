package com.hypeirochus.scmc.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

/**
 * sc2Marine NEW - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelMarine extends ModelBiped {

	public ModelRenderer	lInsignia;
	public ModelRenderer	rInsignia;
	public ModelRenderer	lInsignia2;
	public ModelRenderer	rInsignia2;
	public ModelRenderer	chestplate_rShoulderPad;
	public ModelRenderer	chestplate_rArmGuard01;
	public ModelRenderer	chestplate_rGloves01;
	public ModelRenderer	chestplate_rGloves02;
	public ModelRenderer	rHandGuard;
	public ModelRenderer	chestplate_rArm;
	public ModelRenderer	chestplate_rShoulderFlange;
	public ModelRenderer	chestplate_rArmGuard02;
	public ModelRenderer	chestplate_rArmGuard03;
	public ModelRenderer	chestplate_rArmGuard04;
	public ModelRenderer	boots_rBoot01;
	public ModelRenderer	leggings_rLegGuard01;
	public ModelRenderer	leggings_rThighGuard;
	public ModelRenderer	leggings_rLeg;
	public ModelRenderer	boots_rBoot02;
	public ModelRenderer	boots_rBoot03;
	public ModelRenderer	boots_rBoot04;
	public ModelRenderer	boots_rBoot05;
	public ModelRenderer	boots_rBoot06;
	public ModelRenderer	leggings_rLegGuard02;
	public ModelRenderer	leggings_rLegGuard03;
	public ModelRenderer	helmet_casing;
	public ModelRenderer	helmet_visor01;
	public ModelRenderer	helmet_visor02;
	public ModelRenderer	leggings_codpiece;
	public ModelRenderer	chestplate_chest01;
	public ModelRenderer	chestplate_chest02;
	public ModelRenderer	leggings_buttGuard;
	public ModelRenderer	chestplate_stomach;
	public ModelRenderer	chestplate_chest03;
	public ModelRenderer	chestplate_chest04;
	public ModelRenderer	chestplate_neckGuard;
	public ModelRenderer	chestplate_lVent02;
	public ModelRenderer	chestplate_rVent02;
	public ModelRenderer	chestplate_headGuard;
	public ModelRenderer	chestplate_lShoulderPad;
	public ModelRenderer	chestplate_lArmGuard01;
	public ModelRenderer	chestplate_lGloves01;
	public ModelRenderer	chestplate_lGloves02;
	public ModelRenderer	lHandGuard;
	public ModelRenderer	chestplate_lArm;
	public ModelRenderer	chestplate_lShoulderFlange;
	public ModelRenderer	chestplate_lArmGuard02;
	public ModelRenderer	chestplate_lArmGuard03;
	public ModelRenderer	chestplate_lArmGuard04;
	public ModelRenderer	boots_lBoot01;
	public ModelRenderer	leggings_lLegGuard01;
	public ModelRenderer	leggings_lThighGuard;
	public ModelRenderer	leggings_lLeg;
	public ModelRenderer	boots_lBoot02;
	public ModelRenderer	boots_lBoot03;
	public ModelRenderer	boots_lBoot04;
	public ModelRenderer	boots_lBoot05;
	public ModelRenderer	boots_lBoot06;
	public ModelRenderer	leggings_lLegGuard02;
	public ModelRenderer	leggings_lLegGuard03;

	public ModelMarine() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.chestplate_rGloves01 = new ModelRenderer(this, 64, 12);
		this.chestplate_rGloves01.mirror = true;
		this.chestplate_rGloves01.setRotationPoint(-2.9F, 8.1F, -0.1F);
		this.chestplate_rGloves01.addBox(-1.0F, 0.0F, -2.0F, 1, 3, 4, 0.0F);
		this.setRotateAngle(chestplate_rGloves01, 0.0F, 0.0F, -0.5009094953223726F);
		this.chestplate_rArmGuard03 = new ModelRenderer(this, 116, 8);
		this.chestplate_rArmGuard03.mirror = true;
		this.chestplate_rArmGuard03.setRotationPoint(-0.4F, 1.7F, 0.5F);
		this.chestplate_rArmGuard03.addBox(-2.0F, 0.0F, -0.35F, 4, 3, 2, 0.0F);
		this.bipedBody = new ModelRenderer(this, 16, 16);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
		this.chestplate_rGloves02 = new ModelRenderer(this, 77, 12);
		this.chestplate_rGloves02.mirror = true;
		this.chestplate_rGloves02.setRotationPoint(0.8F, 8.9F, -1.1F);
		this.chestplate_rGloves02.addBox(0.1F, -1.1F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(chestplate_rGloves02, 0.0F, 0.0F, 0.5009094953223726F);
		this.rHandGuard = new ModelRenderer(this, 100, 115);
		this.rHandGuard.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHandGuard.addBox(-3.5F, 8.2F, -2.39F, 5, 2, 5, 0.0F);
		this.boots_rBoot01 = new ModelRenderer(this, 0, 36);
		this.boots_rBoot01.mirror = true;
		this.boots_rBoot01.setRotationPoint(0.0F, 11.5F, 0.0F);
		this.boots_rBoot01.addBox(-2.5F, -0.9F, -4.7F, 5, 1, 5, 0.0F);
		this.bipedLeftArm = new ModelRenderer(this, 40, 16);
		this.bipedLeftArm.mirror = true;
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, -0.0F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
		this.leggings_codpiece = new ModelRenderer(this, 63, 58);
		this.leggings_codpiece.setRotationPoint(0.0F, 11.7F, -0.8F);
		this.leggings_codpiece.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
		this.setRotateAngle(leggings_codpiece, 0.22759093446006054F, 0.0F, 0.0F);
		this.boots_rBoot04 = new ModelRenderer(this, 22, 43);
		this.boots_rBoot04.mirror = true;
		this.boots_rBoot04.setRotationPoint(0.0F, -1.3F, 0.8F);
		this.boots_rBoot04.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 3, 0.0F);
		this.setRotateAngle(boots_rBoot04, -0.7740535232594852F, 0.0F, 0.0F);
		this.chestplate_rShoulderFlange = new ModelRenderer(this, 87, 0);
		this.chestplate_rShoulderFlange.mirror = true;
		this.chestplate_rShoulderFlange.setRotationPoint(-4.4F, 1.8F, 0.0F);
		this.chestplate_rShoulderFlange.addBox(-0.5F, -0.1F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(chestplate_rShoulderFlange, 0.0F, 0.0F, -0.36425021489121656F);
		this.rInsignia = new ModelRenderer(this, 0, 83);
		this.rInsignia.setRotationPoint(-6.5F, 0.6F, -2.81F);
		this.rInsignia.addBox(-7.5F, -7.0F, -1.0F, 14, 14, 1, 0.0F);
		this.setRotateAngle(rInsignia, 0.0F, 0.0F, 0.40980330836826856F);
		this.chestplate_neckGuard = new ModelRenderer(this, 90, 39);
		this.chestplate_neckGuard.setRotationPoint(0.0F, -0.5F, -0.7F);
		this.chestplate_neckGuard.addBox(-5.5F, -6.0F, -3.0F, 11, 7, 8, 0.0F);
		this.setRotateAngle(chestplate_neckGuard, -0.136659280431156F, 0.0F, 0.0F);
		this.leggings_lLegGuard02 = new ModelRenderer(this, 44, 44);
		this.leggings_lLegGuard02.setRotationPoint(1.9F, 2.0F, 0.0F);
		this.leggings_lLegGuard02.addBox(0.0F, -2.5F, -2.0F, 1, 4, 4, 0.0F);
		this.chestplate_rArm = new ModelRenderer(this, 64, 94);
		this.chestplate_rArm.setRotationPoint(-1.0F, -1.7F, 0.0F);
		this.chestplate_rArm.addBox(-2.5F, 0.0F, -2.5F, 5, 5, 5, 0.0F);
		this.chestplate_lVent02 = new ModelRenderer(this, 85, 91);
		this.chestplate_lVent02.setRotationPoint(3.3F, -8.8F, 3.0F);
		this.chestplate_lVent02.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(chestplate_lVent02, -0.8196066167365371F, 0.4553564018453205F, 0.27314402793711257F);
		this.chestplate_rVent02 = new ModelRenderer(this, 85, 91);
		this.chestplate_rVent02.mirror = true;
		this.chestplate_rVent02.setRotationPoint(-3.3F, -8.8F, 3.0F);
		this.chestplate_rVent02.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(chestplate_rVent02, -0.8196066167365371F, -0.4553564018453205F, -0.27314402793711257F);
		this.chestplate_lGloves01 = new ModelRenderer(this, 64, 12);
		this.chestplate_lGloves01.setRotationPoint(2.9F, 8.1F, -0.1F);
		this.chestplate_lGloves01.addBox(0.0F, 0.0F, -2.0F, 1, 3, 4, 0.0F);
		this.setRotateAngle(chestplate_lGloves01, 0.0F, 0.0F, 0.5009094953223726F);
		this.chestplate_lArmGuard02 = new ModelRenderer(this, 101, 8);
		this.chestplate_lArmGuard02.setRotationPoint(0.4F, 1.7F, 0.3F);
		this.chestplate_lArmGuard02.addBox(-2.0F, 0.0F, -2.45F, 4, 3, 3, 0.0F);
		this.chestplate_chest04 = new ModelRenderer(this, 91, 24);
		this.chestplate_chest04.setRotationPoint(0.0F, 0.9F, -3.0F);
		this.chestplate_chest04.addBox(-1.5F, -0.3F, -2.0F, 3, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_chest04, 0.091106186954104F, 0.0F, 0.0F);
		this.boots_rBoot03 = new ModelRenderer(this, 22, 36);
		this.boots_rBoot03.setRotationPoint(0.0F, 0.0F, -3.8F);
		this.boots_rBoot03.addBox(-2.1F, -1.0F, 0.0F, 4, 1, 3, 0.0F);
		this.setRotateAngle(boots_rBoot03, 0.4553564018453205F, 0.0F, 0.0F);
		this.chestplate_lArmGuard04 = new ModelRenderer(this, 89, 8);
		this.chestplate_lArmGuard04.setRotationPoint(-0.3F, 1.7F, 0.0F);
		this.chestplate_lArmGuard04.addBox(-2.0F, 0.0F, -2.01F, 1, 3, 4, 0.0F);
		this.bipedRightArm = new ModelRenderer(this, 40, 16);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
		this.helmet_visor02 = new ModelRenderer(this, 60, 84);
		this.helmet_visor02.setRotationPoint(0.0F, 3.0F, -0.16F);
		this.helmet_visor02.addBox(-3.5F, 0.04F, -3.01F, 7, 4, 3, 0.0F);
		this.setRotateAngle(helmet_visor02, 0.31869712141416456F, 0.0F, 0.0F);
		this.leggings_lLegGuard01 = new ModelRenderer(this, 40, 33);
		this.leggings_lLegGuard01.setRotationPoint(0.1F, 4.7F, 0.0F);
		this.leggings_lLegGuard01.addBox(-2.5F, 0.0F, -2.9F, 5, 4, 6, 0.0F);
		this.chestplate_lShoulderPad = new ModelRenderer(this, 63, 0);
		this.chestplate_lShoulderPad.setRotationPoint(-0.6F, 0.0F, 0.0F);
		this.chestplate_lShoulderPad.addBox(0.0F, -3.0F, -3.0F, 5, 5, 6, 0.0F);
		this.setRotateAngle(chestplate_lShoulderPad, 0.0F, 0.0F, -0.31869712141416456F);
		this.chestplate_lArm = new ModelRenderer(this, 64, 94);
		this.chestplate_lArm.mirror = true;
		this.chestplate_lArm.setRotationPoint(1.0F, -1.7F, 0.0F);
		this.chestplate_lArm.addBox(-2.5F, 0.0F, -2.5F, 5, 5, 5, 0.0F);
		this.lInsignia2 = new ModelRenderer(this, 0, 99);
		this.lInsignia2.setRotationPoint(8.51F, -0.3F, 0.0F);
		this.lInsignia2.addBox(0.0F, -7.0F, -7.0F, 1, 14, 14, 0.0F);
		this.setRotateAngle(lInsignia2, 0.0F, 0.0F, -0.40980330836826856F);
		this.helmet_visor01 = new ModelRenderer(this, 60, 75);
		this.helmet_visor01.setRotationPoint(0.0F, -7.7F, -1.6F);
		this.helmet_visor01.addBox(-3.5F, 0.0F, -3.0F, 7, 4, 3, 0.0F);
		this.setRotateAngle(helmet_visor01, -0.18203784098300857F, 0.0F, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
		this.bipedLeftLeg.mirror = true;
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.boots_rBoot05 = new ModelRenderer(this, 0, 54);
		this.boots_rBoot05.mirror = true;
		this.boots_rBoot05.setRotationPoint(0.0F, 1.1F, 3.6F);
		this.boots_rBoot05.addBox(-2.49F, -1.4F, -2.7F, 5, 1, 3, 0.0F);
		this.chestplate_headGuard = new ModelRenderer(this, 90, 101);
		this.chestplate_headGuard.setRotationPoint(0.0F, -6.6F, 2.0F);
		this.chestplate_headGuard.addBox(-5.0F, -4.0F, -3.0F, 10, 5, 6, 0.0F);
		this.setRotateAngle(chestplate_headGuard, 0.136659280431156F, 0.0F, 0.0F);
		this.chestplate_rArmGuard02 = new ModelRenderer(this, 101, 8);
		this.chestplate_rArmGuard02.mirror = true;
		this.chestplate_rArmGuard02.setRotationPoint(-0.4F, 1.7F, 0.3F);
		this.chestplate_rArmGuard02.addBox(-2.0F, 0.0F, -2.45F, 4, 3, 3, 0.0F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.leggings_rLeg = new ModelRenderer(this, 68, 106);
		this.leggings_rLeg.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.leggings_rLeg.addBox(-2.5F, 0.0F, -2.5F, 5, 6, 5, 0.0F);
		this.rInsignia2 = new ModelRenderer(this, 31, 99);
		this.rInsignia2.setRotationPoint(-8.51F, -0.3F, 0.0F);
		this.rInsignia2.addBox(-1.0F, -7.0F, -7.0F, 1, 14, 14, 0.0F);
		this.setRotateAngle(rInsignia2, 0.0F, 0.0F, 0.40980330836826856F);
		this.boots_rBoot06 = new ModelRenderer(this, 17, 51);
		this.boots_rBoot06.mirror = true;
		this.boots_rBoot06.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.boots_rBoot06.addBox(-2.52F, 0.8F, -2.5F, 5, 2, 5, 0.0F);
		this.boots_lBoot04 = new ModelRenderer(this, 22, 43);
		this.boots_lBoot04.setRotationPoint(0.0F, -1.3F, 0.8F);
		this.boots_lBoot04.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 3, 0.0F);
		this.setRotateAngle(boots_lBoot04, -0.7740535232594852F, 0.0F, 0.0F);
		this.leggings_rLegGuard03 = new ModelRenderer(this, 56, 47);
		this.leggings_rLegGuard03.mirror = true;
		this.leggings_rLegGuard03.setRotationPoint(0.0F, 1.0F, -2.2F);
		this.leggings_rLegGuard03.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 1, 0.0F);
		this.setRotateAngle(leggings_rLegGuard03, 0.136659280431156F, -0.136659280431156F, 0.7853981633974483F);
		this.leggings_lLeg = new ModelRenderer(this, 68, 106);
		this.leggings_lLeg.mirror = true;
		this.leggings_lLeg.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.leggings_lLeg.addBox(-2.5F, 0.0F, -2.5F, 5, 6, 5, 0.0F);
		this.boots_rBoot02 = new ModelRenderer(this, 0, 45);
		this.boots_rBoot02.mirror = true;
		this.boots_rBoot02.setRotationPoint(0.0F, 0.6F, -0.3F);
		this.boots_rBoot02.addBox(-2.49F, -1.0F, -4.6F, 5, 1, 5, 0.0F);
		this.lInsignia = new ModelRenderer(this, 0, 65);
		this.lInsignia.setRotationPoint(6.8F, 0.5F, -2.81F);
		this.lInsignia.addBox(-7.5F, -7.0F, -1.0F, 14, 14, 1, 0.0F);
		this.setRotateAngle(lInsignia, 0.0F, 0.0F, -0.40980330836826856F);
		this.boots_lBoot06 = new ModelRenderer(this, 17, 51);
		this.boots_lBoot06.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.boots_lBoot06.addBox(-2.48F, 0.8F, -2.5F, 5, 2, 5, 0.0F);
		this.leggings_rLegGuard02 = new ModelRenderer(this, 44, 44);
		this.leggings_rLegGuard02.mirror = true;
		this.leggings_rLegGuard02.setRotationPoint(-1.9F, 2.0F, 0.0F);
		this.leggings_rLegGuard02.addBox(-1.0F, -2.5F, -2.0F, 1, 4, 4, 0.0F);
		this.boots_lBoot01 = new ModelRenderer(this, 0, 36);
		this.boots_lBoot01.setRotationPoint(0.0F, 11.4F, 0.0F);
		this.boots_lBoot01.addBox(-2.5F, -0.9F, -4.7F, 5, 1, 5, 0.0F);
		this.leggings_buttGuard = new ModelRenderer(this, 65, 36);
		this.leggings_buttGuard.setRotationPoint(0.0F, 10.2F, 0.0F);
		this.leggings_buttGuard.addBox(-5.0F, 0.0F, -2.7F, 10, 2, 6, 0.0F);
		this.leggings_rThighGuard = new ModelRenderer(this, 42, 53);
		this.leggings_rThighGuard.mirror = true;
		this.leggings_rThighGuard.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_rThighGuard.addBox(-2.5F, -1.0F, -2.5F, 5, 5, 5, 0.0F);
		this.helmet_casing = new ModelRenderer(this, 83, 70);
		this.helmet_casing.setRotationPoint(0.0F, 0.1F, 0.1F);
		this.helmet_casing.addBox(-4.5F, -9.0F, -4.6F, 9, 9, 9, 0.0F);
		this.leggings_lLegGuard03 = new ModelRenderer(this, 56, 47);
		this.leggings_lLegGuard03.mirror = true;
		this.leggings_lLegGuard03.setRotationPoint(0.0F, 1.0F, -2.2F);
		this.leggings_lLegGuard03.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 1, 0.0F);
		this.setRotateAngle(leggings_lLegGuard03, 0.136659280431156F, -0.136659280431156F, 0.7853981633974483F);
		this.chestplate_lShoulderFlange = new ModelRenderer(this, 87, 0);
		this.chestplate_lShoulderFlange.setRotationPoint(4.4F, 1.8F, 0.0F);
		this.chestplate_lShoulderFlange.addBox(-0.5F, -0.1F, -2.5F, 1, 2, 5, 0.0F);
		this.setRotateAngle(chestplate_lShoulderFlange, 0.0F, 0.0F, 0.36425021489121656F);
		this.leggings_rLegGuard01 = new ModelRenderer(this, 40, 33);
		this.leggings_rLegGuard01.mirror = true;
		this.leggings_rLegGuard01.setRotationPoint(-0.1F, 4.7F, 0.0F);
		this.leggings_rLegGuard01.addBox(-2.5F, 0.0F, -2.9F, 5, 4, 6, 0.0F);
		this.chestplate_chest03 = new ModelRenderer(this, 91, 19);
		this.chestplate_chest03.setRotationPoint(0.0F, -0.5F, -2.75F);
		this.chestplate_chest03.addBox(-1.5F, -0.3F, -2.0F, 3, 2, 1, 0.0F);
		this.setRotateAngle(chestplate_chest03, -0.18203784098300857F, 0.0F, 0.0F);
		this.chestplate_lArmGuard01 = new ModelRenderer(this, 102, 0);
		this.chestplate_lArmGuard01.setRotationPoint(1.0F, 3.6F, 0.0F);
		this.chestplate_lArmGuard01.addBox(-2.5F, -0.3F, -2.5F, 5, 2, 5, 0.0F);
		this.chestplate_rArmGuard04 = new ModelRenderer(this, 89, 8);
		this.chestplate_rArmGuard04.mirror = true;
		this.chestplate_rArmGuard04.setRotationPoint(-0.7F, 1.7F, 0.0F);
		this.chestplate_rArmGuard04.addBox(2.0F, 0.0F, -2.01F, 1, 3, 4, 0.0F);
		this.boots_lBoot05 = new ModelRenderer(this, 0, 54);
		this.boots_lBoot05.setRotationPoint(0.0F, 1.1F, 3.6F);
		this.boots_lBoot05.addBox(-2.49F, -1.4F, -2.7F, 5, 1, 3, 0.0F);
		this.chestplate_rArmGuard01 = new ModelRenderer(this, 102, 0);
		this.chestplate_rArmGuard01.mirror = true;
		this.chestplate_rArmGuard01.setRotationPoint(-1.0F, 3.6F, 0.0F);
		this.chestplate_rArmGuard01.addBox(-2.5F, -0.3F, -2.5F, 5, 2, 5, 0.0F);
		this.chestplate_chest01 = new ModelRenderer(this, 59, 21);
		this.chestplate_chest01.setRotationPoint(0.0F, 1.7F, 0.5F);
		this.chestplate_chest01.addBox(-5.0F, -0.9F, -4.5F, 10, 5, 8, 0.0F);
		this.boots_lBoot03 = new ModelRenderer(this, 22, 36);
		this.boots_lBoot03.setRotationPoint(0.0F, 0.0F, -3.8F);
		this.boots_lBoot03.addBox(-1.9F, -1.0F, 0.0F, 4, 1, 3, 0.0F);
		this.setRotateAngle(boots_lBoot03, 0.4553564018453205F, 0.0F, 0.0F);
		this.chestplate_stomach = new ModelRenderer(this, 31, 74);
		this.chestplate_stomach.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_stomach.addBox(-4.5F, 0.0F, -2.4F, 9, 12, 5, 0.0F);
		this.chestplate_lArmGuard03 = new ModelRenderer(this, 116, 8);
		this.chestplate_lArmGuard03.setRotationPoint(0.4F, 1.7F, 0.5F);
		this.chestplate_lArmGuard03.addBox(-2.0F, 0.0F, -0.35F, 4, 3, 2, 0.0F);
		this.chestplate_chest02 = new ModelRenderer(this, 82, 57);
		this.chestplate_chest02.setRotationPoint(0.0F, 0.0F, -0.5F);
		this.chestplate_chest02.addBox(-4.5F, 0.0F, -3.0F, 9, 2, 7, 0.0F);
		this.lHandGuard = new ModelRenderer(this, 100, 115);
		this.lHandGuard.mirror = true;
		this.lHandGuard.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHandGuard.addBox(-1.5F, 8.2F, -2.39F, 5, 2, 5, 0.0F);
		this.leggings_lThighGuard = new ModelRenderer(this, 42, 53);
		this.leggings_lThighGuard.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_lThighGuard.addBox(-2.5F, -1.0F, -2.5F, 5, 5, 5, 0.0F);
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.chestplate_rShoulderPad = new ModelRenderer(this, 63, 0);
		this.chestplate_rShoulderPad.mirror = true;
		this.chestplate_rShoulderPad.setRotationPoint(0.6F, 0.0F, 0.0F);
		this.chestplate_rShoulderPad.addBox(-5.0F, -3.0F, -3.0F, 5, 5, 6, 0.0F);
		this.setRotateAngle(chestplate_rShoulderPad, 0.0F, 0.0F, 0.31869712141416456F);
		this.boots_lBoot02 = new ModelRenderer(this, 0, 45);
		this.boots_lBoot02.setRotationPoint(0.0F, 0.6F, -0.3F);
		this.boots_lBoot02.addBox(-2.49F, -1.0F, -4.6F, 5, 1, 5, 0.0F);
		this.chestplate_lGloves02 = new ModelRenderer(this, 77, 12);
		this.chestplate_lGloves02.setRotationPoint(-0.8F, 8.9F, -1.1F);
		this.chestplate_lGloves02.addBox(-1.1F, -1.1F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(chestplate_lGloves02, 0.0F, 0.0F, -0.5009094953223726F);
		this.bipedRightArm.addChild(this.chestplate_rGloves01);
		this.chestplate_rArmGuard01.addChild(this.chestplate_rArmGuard03);
		this.bipedRightArm.addChild(this.chestplate_rGloves02);
		this.bipedRightArm.addChild(this.rHandGuard);
		this.bipedRightLeg.addChild(this.boots_rBoot01);
		this.bipedBody.addChild(this.leggings_codpiece);
		this.boots_rBoot01.addChild(this.boots_rBoot04);
		this.chestplate_rShoulderPad.addChild(this.chestplate_rShoulderFlange);
		this.chestplate_chest01.addChild(this.chestplate_neckGuard);
		this.leggings_lLegGuard01.addChild(this.leggings_lLegGuard02);
		this.bipedRightArm.addChild(this.chestplate_rArm);
		this.chestplate_chest01.addChild(this.chestplate_lVent02);
		this.chestplate_chest01.addChild(this.chestplate_rVent02);
		this.bipedLeftArm.addChild(this.chestplate_lGloves01);
		this.chestplate_lArmGuard01.addChild(this.chestplate_lArmGuard02);
		this.chestplate_chest01.addChild(this.chestplate_chest04);
		this.boots_rBoot01.addChild(this.boots_rBoot03);
		this.chestplate_lArmGuard01.addChild(this.chestplate_lArmGuard04);
		this.helmet_visor01.addChild(this.helmet_visor02);
		this.bipedLeftLeg.addChild(this.leggings_lLegGuard01);
		this.bipedLeftArm.addChild(this.chestplate_lShoulderPad);
		this.bipedLeftArm.addChild(this.chestplate_lArm);
		this.bipedHead.addChild(this.helmet_visor01);
		this.boots_rBoot01.addChild(this.boots_rBoot05);
		this.chestplate_neckGuard.addChild(this.chestplate_headGuard);
		this.chestplate_rArmGuard01.addChild(this.chestplate_rArmGuard02);
		this.bipedRightLeg.addChild(this.leggings_rLeg);
		this.boots_rBoot01.addChild(this.boots_rBoot06);
		this.boots_lBoot01.addChild(this.boots_lBoot04);
		this.leggings_rLegGuard01.addChild(this.leggings_rLegGuard03);
		this.bipedLeftLeg.addChild(this.leggings_lLeg);
		this.boots_rBoot01.addChild(this.boots_rBoot02);
		this.boots_lBoot01.addChild(this.boots_lBoot06);
		this.leggings_rLegGuard01.addChild(this.leggings_rLegGuard02);
		this.bipedLeftLeg.addChild(this.boots_lBoot01);
		this.bipedBody.addChild(this.leggings_buttGuard);
		this.bipedRightLeg.addChild(this.leggings_rThighGuard);
		this.bipedHead.addChild(this.helmet_casing);
		this.leggings_lLegGuard01.addChild(this.leggings_lLegGuard03);
		this.chestplate_lShoulderPad.addChild(this.chestplate_lShoulderFlange);
		this.bipedRightLeg.addChild(this.leggings_rLegGuard01);
		this.chestplate_chest01.addChild(this.chestplate_chest03);
		this.bipedLeftArm.addChild(this.chestplate_lArmGuard01);
		this.chestplate_rArmGuard01.addChild(this.chestplate_rArmGuard04);
		this.boots_lBoot01.addChild(this.boots_lBoot05);
		this.bipedRightArm.addChild(this.chestplate_rArmGuard01);
		this.bipedBody.addChild(this.chestplate_chest01);
		this.boots_lBoot01.addChild(this.boots_lBoot03);
		this.bipedBody.addChild(this.chestplate_stomach);
		this.chestplate_lArmGuard01.addChild(this.chestplate_lArmGuard03);
		this.bipedBody.addChild(this.chestplate_chest02);
		this.bipedLeftArm.addChild(this.lHandGuard);
		this.bipedLeftLeg.addChild(this.leggings_lThighGuard);
		this.bipedRightArm.addChild(this.chestplate_rShoulderPad);
		this.boots_lBoot01.addChild(this.boots_lBoot02);
		this.bipedLeftArm.addChild(this.chestplate_lGloves02);
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
//		if (((EntityMarine) entity).canAim()) {
//			this.rightArmPose = ArmPose.BOW_AND_ARROW;
//		} else {
//			this.rightArmPose = ArmPose.ITEM;
//		}
		this.bipedBody.render(scale);
		this.bipedLeftArm.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.rInsignia.offsetX, this.rInsignia.offsetY, this.rInsignia.offsetZ);
		GlStateManager.translate(this.rInsignia.rotationPointX * scale, this.rInsignia.rotationPointY * scale, this.rInsignia.rotationPointZ * scale);
		GlStateManager.scale(0.3D, 0.3D, 0.2D);
		GlStateManager.translate(-this.rInsignia.offsetX, -this.rInsignia.offsetY, -this.rInsignia.offsetZ);
		GlStateManager.translate(-this.rInsignia.rotationPointX * scale, -this.rInsignia.rotationPointY * scale, -this.rInsignia.rotationPointZ * scale);
		this.rInsignia.render(scale);
		GlStateManager.popMatrix();
		this.bipedRightArm.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.lInsignia2.offsetX, this.lInsignia2.offsetY, this.lInsignia2.offsetZ);
		GlStateManager.translate(this.lInsignia2.rotationPointX * scale, this.lInsignia2.rotationPointY * scale, this.lInsignia2.rotationPointZ * scale);
		GlStateManager.scale(0.3D, 0.3D, 0.3D);
		GlStateManager.translate(-this.lInsignia2.offsetX, -this.lInsignia2.offsetY, -this.lInsignia2.offsetZ);
		GlStateManager.translate(-this.lInsignia2.rotationPointX * scale, -this.lInsignia2.rotationPointY * scale, -this.lInsignia2.rotationPointZ * scale);
		this.lInsignia2.render(scale);
		GlStateManager.popMatrix();
		this.bipedLeftLeg.render(scale);
		this.bipedRightLeg.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.rInsignia2.offsetX, this.rInsignia2.offsetY, this.rInsignia2.offsetZ);
		GlStateManager.translate(this.rInsignia2.rotationPointX * scale, this.rInsignia2.rotationPointY * scale, this.rInsignia2.rotationPointZ * scale);
		GlStateManager.scale(0.3D, 0.3D, 0.3D);
		GlStateManager.translate(-this.rInsignia2.offsetX, -this.rInsignia2.offsetY, -this.rInsignia2.offsetZ);
		GlStateManager.translate(-this.rInsignia2.rotationPointX * scale, -this.rInsignia2.rotationPointY * scale, -this.rInsignia2.rotationPointZ * scale);
		this.rInsignia2.render(scale);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.lInsignia.offsetX, this.lInsignia.offsetY, this.lInsignia.offsetZ);
		GlStateManager.translate(this.lInsignia.rotationPointX * scale, this.lInsignia.rotationPointY * scale, this.lInsignia.rotationPointZ * scale);
		GlStateManager.scale(0.3D, 0.3D, 0.2D);
		GlStateManager.translate(-this.lInsignia.offsetX, -this.lInsignia.offsetY, -this.lInsignia.offsetZ);
		GlStateManager.translate(-this.lInsignia.rotationPointX * scale, -this.lInsignia.rotationPointY * scale, -this.lInsignia.rotationPointZ * scale);
		this.lInsignia.render(scale);
		GlStateManager.popMatrix();
		this.bipedHead.render(scale);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		boolean flag = entityIn instanceof EntityLivingBase && ((EntityLivingBase) entityIn).getTicksElytraFlying() > 4;
		this.bipedHead.rotateAngleY = netHeadYaw * 0.017453292F;

		if (flag) {
			this.bipedHead.rotateAngleX = -((float) Math.PI / 4F);
		} else {
			this.bipedHead.rotateAngleX = headPitch * 0.017453292F;
		}

		this.bipedBody.rotateAngleY = 0.0F;
		this.bipedRightArm.rotationPointZ = 0.0F;
		this.bipedRightArm.rotationPointX = -5.0F;
		this.bipedLeftArm.rotationPointZ = 0.0F;
		this.bipedLeftArm.rotationPointX = 5.0F;
		float f = 1.0F;

		if (flag) {
			f = (float) (entityIn.motionX * entityIn.motionX + entityIn.motionY * entityIn.motionY + entityIn.motionZ * entityIn.motionZ);
			f = f / 0.2F;
			f = f * f * f;
		}

		if (f < 1.0F) {
			f = 1.0F;
		}

		this.bipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
		this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
		this.bipedRightArm.rotateAngleZ = 0.0F;
		this.bipedLeftArm.rotateAngleZ = 0.0F;
		this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
		this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount / f;
		this.bipedRightLeg.rotateAngleY = 0.0F;
		this.bipedLeftLeg.rotateAngleY = 0.0F;
		this.bipedRightLeg.rotateAngleZ = 0.0F;
		this.bipedLeftLeg.rotateAngleZ = 0.0F;

		if (this.isRiding) {
			this.bipedRightArm.rotateAngleX += -((float) Math.PI / 5F);
			this.bipedLeftArm.rotateAngleX += -((float) Math.PI / 5F);
			this.bipedRightLeg.rotateAngleX = -1.4137167F;
			this.bipedRightLeg.rotateAngleY = ((float) Math.PI / 10F);
			this.bipedRightLeg.rotateAngleZ = 0.07853982F;
			this.bipedLeftLeg.rotateAngleX = -1.4137167F;
			this.bipedLeftLeg.rotateAngleY = -((float) Math.PI / 10F);
			this.bipedLeftLeg.rotateAngleZ = -0.07853982F;
		}

		this.bipedRightArm.rotateAngleY = 0.0F;
		this.bipedRightArm.rotateAngleZ = 0.0F;

		switch (this.leftArmPose) {
		case EMPTY:
			this.bipedLeftArm.rotateAngleY = 0.0F;
			break;
		case BLOCK:
			this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - 0.9424779F;
			this.bipedLeftArm.rotateAngleY = 0.5235988F;
			break;
		case ITEM:
			this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - ((float) Math.PI / 10F);
			this.bipedLeftArm.rotateAngleY = 0.0F;
		}

		switch (this.rightArmPose) {
		case EMPTY:
			this.bipedRightArm.rotateAngleY = 0.0F;
			break;
		case BLOCK:
			this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - 0.9424779F;
			this.bipedRightArm.rotateAngleY = -0.5235988F;
			break;
		case ITEM:
			this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - ((float) Math.PI / 10F);
			this.bipedRightArm.rotateAngleY = 0.0F;
		}

		if (this.swingProgress > 0.0F) {
			EnumHandSide enumhandside = this.getMainHand(entityIn);
			ModelRenderer modelrenderer = this.getArmForSide(enumhandside);
			float f1 = this.swingProgress;
			this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float) Math.PI * 2F)) * 0.2F;

			if (enumhandside == EnumHandSide.LEFT) {
				this.bipedBody.rotateAngleY *= -1.0F;
			}

			this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
			this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
			this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
			this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
			f1 = 1.0F - this.swingProgress;
			f1 = f1 * f1;
			f1 = f1 * f1;
			f1 = 1.0F - f1;
			float f2 = MathHelper.sin(f1 * (float) Math.PI);
			float f3 = MathHelper.sin(this.swingProgress * (float) Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
			modelrenderer.rotateAngleX = (float) ((double) modelrenderer.rotateAngleX - ((double) f2 * 1.2D + (double) f3));
			modelrenderer.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
			modelrenderer.rotateAngleZ += MathHelper.sin(this.swingProgress * (float) Math.PI) * -0.4F;
		}

		if (this.isSneak) {
			this.bipedBody.rotateAngleX = 0.5F;
			this.bipedRightArm.rotateAngleX += 0.4F;
			this.bipedLeftArm.rotateAngleX += 0.4F;
			this.bipedRightLeg.rotationPointZ = 4.0F;
			this.bipedLeftLeg.rotationPointZ = 4.0F;
			this.bipedRightLeg.rotationPointY = 9.0F;
			this.bipedLeftLeg.rotationPointY = 9.0F;
			this.bipedHead.rotationPointY = 1.0F;
		} else {
			this.bipedBody.rotateAngleX = 0.0F;
			this.bipedRightLeg.rotationPointZ = 0.1F;
			this.bipedLeftLeg.rotationPointZ = 0.1F;
			this.bipedRightLeg.rotationPointY = 12.0F;
			this.bipedLeftLeg.rotationPointY = 12.0F;
			this.bipedHead.rotationPointY = 0.0F;
		}

		this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
		this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
		this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

		if (this.rightArmPose == ModelBiped.ArmPose.BOW_AND_ARROW) {
			this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY;
			this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY + 0.4F;
			this.bipedRightArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
			this.bipedLeftArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
		} else if (this.leftArmPose == ModelBiped.ArmPose.BOW_AND_ARROW) {
			this.bipedRightArm.rotateAngleY = -0.1F + this.bipedHead.rotateAngleY - 0.4F;
			this.bipedLeftArm.rotateAngleY = 0.1F + this.bipedHead.rotateAngleY;
			this.bipedRightArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
			this.bipedLeftArm.rotateAngleX = -((float) Math.PI / 2F) + this.bipedHead.rotateAngleX;
		}

		copyModelAngles(this.bipedHead, this.bipedHeadwear);
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
	}

	public void setModelAttributes(ModelBase model) {
		super.setModelAttributes(model);

		if (model instanceof ModelBiped) {
			ModelBiped modelbiped = (ModelBiped) model;
			this.leftArmPose = modelbiped.leftArmPose;
			this.rightArmPose = modelbiped.rightArmPose;
			this.isSneak = modelbiped.isSneak;
		}
	}

	public void setInvisible(boolean invisible) {
		this.bipedHead.showModel = invisible;
		this.bipedHeadwear.showModel = invisible;
		this.bipedBody.showModel = invisible;
		this.bipedRightArm.showModel = invisible;
		this.bipedLeftArm.showModel = invisible;
		this.bipedRightLeg.showModel = invisible;
		this.bipedLeftLeg.showModel = invisible;
	}

	public void postRenderArm(float scale, EnumHandSide side) {
		this.getArmForSide(side).postRender(scale);
	}

	protected ModelRenderer getArmForSide(EnumHandSide side) {
		return side == EnumHandSide.LEFT ? this.bipedLeftArm : this.bipedRightArm;
	}

	protected EnumHandSide getMainHand(Entity entityIn) {
		return entityIn instanceof EntityLivingBase ? ((EntityLivingBase) entityIn).getPrimaryHand() : EnumHandSide.RIGHT;
	}
}