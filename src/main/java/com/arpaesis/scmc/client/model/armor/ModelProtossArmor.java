package com.arpaesis.scmc.client.model.armor;

import com.arpaesis.scmc.client.model.IArmorItem;
import com.ocelot.api.utils.ModelUtils;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHandSide;

/**
 * ModelProtossArmor - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelProtossArmor extends ModelArmorBase implements IArmorItem
{

	public ModelRenderer chestplate_rShoulder01;
	public ModelRenderer chestplate_rShoulder02;
	public ModelRenderer chestplate_rShoulder03;
	public ModelRenderer chestplate_rShoulder04;
	public ModelRenderer chestplate_rShoulder05;
	public ModelRenderer chestplate_rArm01;
	public ModelRenderer chestplate_rArm02;
	public ModelRenderer chestplate_rArm03;
	public ModelRenderer chestplate_rArm04;
	public ModelRenderer leggings_rLegGuard01;
	public ModelRenderer boots_rLegGuard01;
	public ModelRenderer leggings_rLegGuard02;
	public ModelRenderer legging_rLegJoint;
	public ModelRenderer leggings_rKneeGuard01;
	public ModelRenderer leggings_rKneeGuard02;
	public ModelRenderer boots_rLegGuard02;
	public ModelRenderer boots_rFootJoint;
	public ModelRenderer boots_rHeel01;
	public ModelRenderer boots_rHeel03;
	public ModelRenderer boots_rHeel04;
	public ModelRenderer boots_rFootGuard;
	public ModelRenderer boots_rToe01;
	public ModelRenderer boots_rToe03;
	public ModelRenderer boots_rToe02;
	public ModelRenderer boots_rToe04;
	public ModelRenderer boots_rHeel02;
	public ModelRenderer helmet_gemSocket;
	public ModelRenderer helmet_upperRidge;
	public ModelRenderer helmet_lSpike01;
	public ModelRenderer helmet_lSpike02;
	public ModelRenderer helmet_rSpike01;
	public ModelRenderer helmet_rSpike02;
	public ModelRenderer helmet_gem;
	public ModelRenderer helmet_crest01;
	public ModelRenderer helmet_crest02;
	public ModelRenderer chestplate_mGuard01;
	public ModelRenderer chestplate_lGuard;
	public ModelRenderer chestplate_rGuard01;
	public ModelRenderer chestplate_collar01;
	public ModelRenderer chestplate_collar02;
	public ModelRenderer chestplate_spine02;
	public ModelRenderer chestplate_spine03;
	public ModelRenderer chestplate_spine04;
	public ModelRenderer chestplate_spine05;
	public ModelRenderer chestplate_mGuard02;
	public ModelRenderer chestplate_gem01;
	public ModelRenderer chestplate_spine01;
	public ModelRenderer chestplate_lGuard04;
	public ModelRenderer chestplate_rGuard04;
	public ModelRenderer chestplate_crotchGem;
	public ModelRenderer chestplate_lArch00;
	public ModelRenderer chestplate_rArch01;
	public ModelRenderer chestplate_hips;
	public ModelRenderer chestplate_rArch09;
	public ModelRenderer chestplate_rArch00;
	public ModelRenderer chestplate_lGuard02;
	public ModelRenderer chestplate_lGuard03;
	public ModelRenderer chestplate_rGuard02;
	public ModelRenderer chestplate_rGuard03;
	public ModelRenderer chestplate_gem02;
	public ModelRenderer chestplate_lArch02;
	public ModelRenderer chestplate_lArch03;
	public ModelRenderer chestplate_lArch01;
	public ModelRenderer shoulder_line_left_1_3;
	public ModelRenderer chestplate_lArch04;
	public ModelRenderer chestplate_lArch05;
	public ModelRenderer chestplate_lArch06;
	public ModelRenderer chestplate_lArch07;
	public ModelRenderer chestplate_lArch08;
	public ModelRenderer chestplate_lArch09;
	public ModelRenderer chestplate_lArch10;
	public ModelRenderer shoulder_line_right_1;
	public ModelRenderer chestplate_rArch10;
	public ModelRenderer chestplate_rArch02;
	public ModelRenderer shoulder_line_right_1_3;
	public ModelRenderer chestplate_rArch08;
	public ModelRenderer chestplate_rArch07;
	public ModelRenderer chestplate_rArch06;
	public ModelRenderer chestplate_rArch05;
	public ModelRenderer chestplate_rArch04;
	public ModelRenderer chestplate_rArch03;
	public ModelRenderer chestplate_lShoulder01;
	public ModelRenderer chestplate_lShoulder02;
	public ModelRenderer chestplate_lShoulder03;
	public ModelRenderer chestplate_lShoulder05;
	public ModelRenderer chestplate_lShoulder04;
	public ModelRenderer chestplate_lArm01;
	public ModelRenderer chestplate_lArm02;
	public ModelRenderer chestplate_lArm03;
	public ModelRenderer chestplate_lArm04;
	public ModelRenderer leggings_lLegGuard01;
	public ModelRenderer boots_lLegGuard01;
	public ModelRenderer leggings_lLegGuard02;
	public ModelRenderer leggings_lKneeGuard01;
	public ModelRenderer leggings_lLegJoint;
	public ModelRenderer leggings_lKneeGuard02;
	public ModelRenderer boots_lLegGuard02;
	public ModelRenderer boots_lFootJoint;
	public ModelRenderer boots_lHeel01;
	public ModelRenderer boots_lHeel02;
	public ModelRenderer boots_lHeel03;
	public ModelRenderer boots_lFootGuard;
	public ModelRenderer boots_lToe01;
	public ModelRenderer boots_lToe03;
	public ModelRenderer boots_lToe02;
	public ModelRenderer boots_lToe04;
	public ModelRenderer boots_lHeel04;

	public ModelProtossArmor(float modelSize)
	{
		super(modelSize, 128, 64);
		this.chestplate_lShoulder02 = new ModelRenderer(this, 63, 54);
		this.chestplate_lShoulder02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lShoulder02.addBox(3.9F, -0.7F, -2.0F, 1, 2, 4, 0.0F);
		this.chestplate_lShoulder05 = new ModelRenderer(this, 97, 57);
		this.chestplate_lShoulder05.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lShoulder05.addBox(-0.6F, 0.3F, -1.65F, 5, 2, 4, 0.0F);
		this.setRotateAngle(chestplate_lShoulder05, 0.0F, 0.0F, 0.15707963267948966F);
		this.helmet_rSpike02 = new ModelRenderer(this, 108, 6);
		this.helmet_rSpike02.mirror = true;
		this.helmet_rSpike02.setRotationPoint(-4.0F, -6.6F, 0.7F);
		this.helmet_rSpike02.addBox(-0.51F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(helmet_rSpike02, -0.5462880558742251F, 0.0F, 0.0F);
		this.leggings_lKneeGuard01 = new ModelRenderer(this, 53, 10);
		this.leggings_lKneeGuard01.setRotationPoint(0.3F, 0.0F, 0.0F);
		this.leggings_lKneeGuard01.addBox(-1.5F, 3.9F, -2.99F, 3, 3, 1, 0.0F);
		this.chestplate_lGuard = new ModelRenderer(this, 82, 17);
		this.chestplate_lGuard.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lGuard.addBox(1.8F, 4.5F, -3.48F, 4, 2, 7, 0.0F);
		this.setRotateAngle(chestplate_lGuard, 0.0F, 0.0F, 0.3141592653589793F);
		this.shoulder_line_right_1_3 = new ModelRenderer(this, 0, 0);
		this.shoulder_line_right_1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shoulder_line_right_1_3.addBox(-4.4F, -3.21F, -3.0F, 2, 3, 1, 0.0F);
		this.chestplate_rArch06 = new ModelRenderer(this, 0, 0);
		this.chestplate_rArch06.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch06.addBox(-4.21F, -1.6F, -7.45F, 2, 4, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch06, 0.7853981633974483F, 0.0F, 0.0F);
		this.shoulder_line_left_1_3 = new ModelRenderer(this, 0, 0);
		this.shoulder_line_left_1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shoulder_line_left_1_3.addBox(3.4F, -3.21F, -3.0F, 1, 3, 1, 0.0F);
		this.chestplate_spine01 = new ModelRenderer(this, 70, 31);
		this.chestplate_spine01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_spine01.addBox(-1.5F, 0.21F, 2.54F, 3, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_spine01, 0.3490658503988659F, 0.0F, 0.0F);
		this.helmet_upperRidge = new ModelRenderer(this, 106, 0);
		this.helmet_upperRidge.setRotationPoint(0.0F, -0.6F, -1.9F);
		this.helmet_upperRidge.addBox(-4.5F, -8.5F, -0.5F, 9, 3, 2, 0.0F);
		this.setRotateAngle(helmet_upperRidge, -0.36425021489121656F, 0.0F, 0.0F);
		this.chestplate_lShoulder03 = new ModelRenderer(this, 95, 28);
		this.chestplate_lShoulder03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lShoulder03.addBox(-0.5F, -0.68F, -2.5F, 5, 2, 5, 0.0F);
		this.chestplate_spine04 = new ModelRenderer(this, 70, 31);
		this.chestplate_spine04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_spine04.addBox(-1.5F, 2.7F, 2.75F, 3, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_spine04, 0.017453292519943295F, 0.0F, 0.0F);
		this.chestplate_rArch03 = new ModelRenderer(this, 121, 10);
		this.chestplate_rArch03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch03.addBox(-4.21F, -4.9F, -4.1F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch03, 0.6108652381980153F, 0.0F, 0.0F);
		this.chestplate_rArm01 = new ModelRenderer(this, 78, 32);
		this.chestplate_rArm01.mirror = true;
		this.chestplate_rArm01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArm01.addBox(-4.5F, 3.3F, -2.49F, 5, 4, 5, 0.0F);
		this.chestplate_rArch07 = new ModelRenderer(this, 0, 0);
		this.chestplate_rArch07.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch07.addBox(-4.2F, 2.2F, -6.37F, 2, 2, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch07, 0.19198621771937624F, 0.0F, 0.0F);
		this.chestplate_lShoulder01 = new ModelRenderer(this, 95, 50);
		this.chestplate_lShoulder01.setRotationPoint(-1.0F, -1.2F, 0.0F);
		this.chestplate_lShoulder01.addBox(-1.0F, -1.2F, -2.0F, 5, 1, 4, 0.0F);
		this.setRotateAngle(chestplate_lShoulder01, 0.0F, 0.0F, -0.17453292519943295F);
		this.leggings_rKneeGuard02 = new ModelRenderer(this, 53, 10);
		this.leggings_rKneeGuard02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_rKneeGuard02.addBox(-1.5F, 4.0F, -2.99F, 3, 3, 1, 0.0F);
		this.chestplate_gem02 = new ModelRenderer(this, 62, 6);
		this.chestplate_gem02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_gem02.addBox(-3.0F, 2.0F, -4.3F, 1, 1, 1, 0.0F);
		this.chestplate_lArch05 = new ModelRenderer(this, 0, 0);
		this.chestplate_lArch05.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch05.addBox(2.22F, -1.6F, -7.66F, 2, 2, 1, 0.0F);
		this.setRotateAngle(chestplate_lArch05, -0.6981317007977318F, 0.0F, 0.0F);
		this.chestplate_rArch01 = new ModelRenderer(this, 121, 5);
		this.chestplate_rArch01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch01.addBox(-4.0F, -3.21F, -3.4F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch01, 0.6108652381980153F, -0.06981317007977318F, -0.6981317007977318F);
		this.leggings_rLegGuard02 = new ModelRenderer(this, 69, 18);
		this.leggings_rLegGuard02.mirror = true;
		this.leggings_rLegGuard02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_rLegGuard02.addBox(1.02F, 0.0F, -2.49F, 1, 7, 5, 0.0F);
		this.chestplate_lArch04 = new ModelRenderer(this, 0, 0);
		this.chestplate_lArch04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch04.addBox(2.21F, -4.6F, -6.16F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_lArch04, -0.6108652381980153F, 0.0F, 0.0F);
		this.leggings_rLegGuard01 = new ModelRenderer(this, 69, 0);
		this.leggings_rLegGuard01.mirror = true;
		this.leggings_rLegGuard01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_rLegGuard01.addBox(-2.21F, 0.0F, -2.5F, 4, 7, 5, 0.0F);
		this.chestplate_gem01 = new ModelRenderer(this, 54, 5);
		this.chestplate_gem01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_gem01.addBox(-3.5F, 1.5F, -4.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(chestplate_gem01, 0.0F, 0.0F, -0.7853981633974483F);
		this.helmet_gemSocket = new ModelRenderer(this, 114, 7);
		this.helmet_gemSocket.setRotationPoint(0.0F, -7.4F, -3.7F);
		this.helmet_gemSocket.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(helmet_gemSocket, 0.0F, 0.0F, 0.7853981633974483F);
		this.helmet_gem = new ModelRenderer(this, 62, 6);
		this.helmet_gem.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.helmet_gem.addBox(-0.5F, -0.5F, -1.2F, 1, 1, 1, 0.0F);
		this.chestplate_spine03 = new ModelRenderer(this, 70, 31);
		this.chestplate_spine03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_spine03.addBox(-1.5F, 2.0F, 1.85F, 3, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_spine03, 0.2617993877991494F, 0.0F, 0.0F);
		this.chestplate_rGuard03 = new ModelRenderer(this, 83, 19);
		this.chestplate_rGuard03.mirror = true;
		this.chestplate_rGuard03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rGuard03.addBox(0.47F, 7.2F, -3.0F, 2, 1, 6, 0.0F);
		this.setRotateAngle(chestplate_rGuard03, 0.0F, 0.0F, 0.5497787143782138F);
		this.chestplate_lArch08 = new ModelRenderer(this, 0, 0);
		this.chestplate_lArch08.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch08.addBox(2.2F, 0.4F, -5.85F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_lArch08, -0.19198621771937624F, 0.0F, 0.0F);
		this.chestplate_lArm02 = new ModelRenderer(this, 64, 37);
		this.chestplate_lArm02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArm02.addBox(-0.2F, 7.0F, -2.5F, 4, 4, 5, 0.0F);
		this.setRotateAngle(chestplate_lArm02, 0.0F, 0.0F, 0.017453292519943295F);
		this.boots_lToe02 = new ModelRenderer(this, 60, 28);
		this.boots_lToe02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lToe02.addBox(-0.11F, 1.9F, -7.2F, 1, 1, 2, 0.0F);
		this.setRotateAngle(boots_lToe02, 0.3665191429188092F, -0.17453292519943295F, 0.0F);
		this.boots_rFootGuard = new ModelRenderer(this, 115, 27);
		this.boots_rFootGuard.setRotationPoint(-0.3F, 0.0F, 0.0F);
		this.boots_rFootGuard.addBox(-1.71F, 3.1F, -4.0F, 4, 2, 2, 0.0F);
		this.chestplate_mGuard02 = new ModelRenderer(this, 45, 43);
		this.chestplate_mGuard02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_mGuard02.addBox(-2.0F, 7.0F, -3.01F, 4, 1, 6, 0.0F);
		this.chestplate_lGuard03 = new ModelRenderer(this, 83, 19);
		this.chestplate_lGuard03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lGuard03.addBox(-2.38F, 7.22F, -2.99F, 2, 1, 6, 0.0F);
		this.setRotateAngle(chestplate_lGuard03, 0.0F, 0.0F, -0.5497787143782138F);
		this.chestplate_lArch07 = new ModelRenderer(this, 0, 0);
		this.chestplate_lArch07.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch07.addBox(2.19F, 2.2F, -6.37F, 2, 2, 1, 0.0F);
		this.setRotateAngle(chestplate_lArch07, -0.7853981633974483F, 0.0F, 0.0F);
		this.chestplate_rShoulder01 = new ModelRenderer(this, 95, 50);
		this.chestplate_rShoulder01.mirror = true;
		this.chestplate_rShoulder01.setRotationPoint(1.0F, -1.2F, 0.0F);
		this.chestplate_rShoulder01.addBox(-4.0F, -1.2F, -2.0F, 5, 1, 4, 0.0F);
		this.setRotateAngle(chestplate_rShoulder01, 0.0F, 0.0F, 0.17453292519943295F);
		this.chestplate_lArch01 = new ModelRenderer(this, 121, 5);
		this.chestplate_lArch01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch01.addBox(2.01F, -3.19F, -3.4F, 2, 3, 1, 0.0F);
		this.chestplate_lArch09 = new ModelRenderer(this, 0, 0);
		this.chestplate_lArch09.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch09.addBox(2.21F, 0.2F, -4.95F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_lArch09, -0.5061454830783556F, 0.0F, 0.0F);
		this.helmet_crest01 = new ModelRenderer(this, 114, 11);
		this.helmet_crest01.setRotationPoint(0.0F, -8.4F, 0.0F);
		this.helmet_crest01.addBox(-1.0F, -1.0F, -1.2F, 2, 2, 1, 0.0F);
		this.setRotateAngle(helmet_crest01, -0.31869712141416456F, 0.22759093446006054F, 0.7853981633974483F);
		this.boots_lHeel02 = new ModelRenderer(this, 48, 51);
		this.boots_lHeel02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lHeel02.addBox(-1.71F, 3.8F, -1.18F, 4, 1, 3, 0.0F);
		this.setRotateAngle(boots_lHeel02, 0.2617993877991494F, 0.0F, 0.0F);
		this.chestplate_rArm03 = new ModelRenderer(this, 49, 55);
		this.chestplate_rArm03.mirror = true;
		this.chestplate_rArm03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArm03.addBox(-5.7F, 6.3F, -2.51F, 1, 4, 5, 0.0F);
		this.setRotateAngle(chestplate_rArm03, 0.0F, 0.0F, -0.17453292519943295F);
		this.leggings_rKneeGuard01 = new ModelRenderer(this, 62, 10);
		this.leggings_rKneeGuard01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_rKneeGuard01.addBox(-1.0F, 3.5F, -3.0F, 2, 4, 1, 0.0F);
		this.boots_rToe03 = new ModelRenderer(this, 58, 23);
		this.boots_rToe03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_rToe03.addBox(-0.61F, 2.9F, -5.1F, 2, 2, 2, 0.0F);
		this.setRotateAngle(boots_rToe03, 0.08726646259971647F, -0.17453292519943295F, 0.0F);
		this.chestplate_spine02 = new ModelRenderer(this, 70, 31);
		this.chestplate_spine02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_spine02.addBox(-1.5F, 1.2F, 1.95F, 3, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_spine02, 0.3490658503988659F, 0.0F, 0.0F);
		this.chestplate_lArch03 = new ModelRenderer(this, 121, 10);
		this.chestplate_lArch03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch03.addBox(2.19F, -4.9F, -4.1F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_lArch03, -0.3490658503988659F, 0.0F, 0.0F);
		this.boots_lLegGuard02 = new ModelRenderer(this, 98, 13);
		this.boots_lLegGuard02.mirror = true;
		this.boots_lLegGuard02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lLegGuard02.addBox(-2.05F, 0.0F, -2.49F, 1, 5, 5, 0.0F);
		this.chestplate_lArm01 = new ModelRenderer(this, 78, 32);
		this.chestplate_lArm01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArm01.addBox(-0.5F, 3.3F, -2.49F, 5, 4, 5, 0.0F);
		this.boots_rHeel03 = new ModelRenderer(this, 54, 53);
		this.boots_rHeel03.mirror = true;
		this.boots_rHeel03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_rHeel03.addBox(1.5F, 3.8F, 0.78F, 1, 1, 1, 0.0F);
		this.setRotateAngle(boots_rHeel03, 0.2617993877991494F, 0.0F, 0.0F);
		this.boots_rHeel01 = new ModelRenderer(this, 106, 19);
		this.boots_rHeel01.mirror = true;
		this.boots_rHeel01.setRotationPoint(-0.2F, 0.0F, 0.0F);
		this.boots_rHeel01.addBox(-2.1F, 4.1F, -3.0F, 4, 1, 6, 0.0F);
		this.shoulder_line_right_1 = new ModelRenderer(this, 0, 0);
		this.shoulder_line_right_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shoulder_line_right_1.addBox(-4.2F, -3.2F, -3.2F, 2, 3, 1, 0.0F);
		this.boots_rToe04 = new ModelRenderer(this, 60, 28);
		this.boots_rToe04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_rToe04.addBox(-0.11F, 1.9F, -7.2F, 1, 1, 2, 0.0F);
		this.setRotateAngle(boots_rToe04, 0.3665191429188092F, -0.17453292519943295F, 0.0F);
		this.chestplate_rArch10 = new ModelRenderer(this, 121, 15);
		this.chestplate_rArch10.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch10.addBox(-4.21F, -0.02F, -3.97F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch10, 2.007128639793479F, 0.0F, 0.0F);
		this.boots_lFootJoint = new ModelRenderer(this, 61, 0);
		this.boots_lFootJoint.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lFootJoint.addBox(1.61F, 1.0F, -1.9F, 1, 2, 2, 0.0F);
		this.setRotateAngle(boots_lFootJoint, 0.3839724354387525F, 0.0F, 0.0F);
		this.leggings_lLegGuard01 = new ModelRenderer(this, 69, 0);
		this.leggings_lLegGuard01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_lLegGuard01.addBox(-1.79F, 0.0F, -2.5F, 4, 7, 5, 0.0F);
		this.chestplate_rArm04 = new ModelRenderer(this, 112, 52);
		this.chestplate_rArm04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArm04.addBox(-4.7F, 7.9F, -2.01F, 1, 3, 4, 0.0F);
		this.setRotateAngle(chestplate_rArm04, 0.0F, 0.0F, 0.12217304763960307F);
		this.chestplate_rArch09 = new ModelRenderer(this, 0, 0);
		this.chestplate_rArch09.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch09.addBox(-4.2F, 0.2F, -4.95F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch09, -3.0543261909900767F, -0.06981317007977318F, -0.6981317007977318F);
		this.chestplate_rArch00 = new ModelRenderer(this, 0, 0);
		this.chestplate_rArch00.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch00.addBox(-4.0F, -3.2F, -3.0F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch00, 0.6108652381980153F, -0.06981317007977318F, -0.6981317007977318F);
		this.boots_rLegGuard02 = new ModelRenderer(this, 98, 13);
		this.boots_rLegGuard02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_rLegGuard02.addBox(1.05F, 0.0F, -2.49F, 1, 5, 5, 0.0F);
		this.chestplate_collar01 = new ModelRenderer(this, 57, 20);
		this.chestplate_collar01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_collar01.addBox(-2.5F, 0.2F, -3.45F, 5, 1, 1, 0.0F);
		this.setRotateAngle(chestplate_collar01, -0.3490658503988659F, 0.0F, 0.0F);
		this.chestplate_hips = new ModelRenderer(this, 65, 47);
		this.chestplate_hips.setRotationPoint(0.0F, 11.0F, 0.0F);
		this.chestplate_hips.addBox(-4.5F, 0.0F, -2.5F, 9, 1, 5, 0.0F);
		this.chestplate_rShoulder02 = new ModelRenderer(this, 63, 54);
		this.chestplate_rShoulder02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rShoulder02.addBox(-4.9F, -0.7F, -2.0F, 1, 2, 4, 0.0F);
		this.boots_rHeel04 = new ModelRenderer(this, 117, 24);
		this.boots_rHeel04.mirror = true;
		this.boots_rHeel04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_rHeel04.addBox(1.5F, 4.1F, 2.01F, 1, 1, 1, 0.0F);
		this.helmet_rSpike01 = new ModelRenderer(this, 108, 6);
		this.helmet_rSpike01.setRotationPoint(-4.0F, -5.9F, 1.2F);
		this.helmet_rSpike01.addBox(-0.49F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(helmet_rSpike01, -0.8196066167365371F, 0.0F, 0.0F);
		this.boots_lToe04 = new ModelRenderer(this, 60, 28);
		this.boots_lToe04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lToe04.addBox(-0.81F, 1.9F, -7.2F, 1, 1, 2, 0.0F);
		this.setRotateAngle(boots_lToe04, 0.3665191429188092F, 0.17453292519943295F, 0.0F);
		this.boots_rToe02 = new ModelRenderer(this, 60, 28);
		this.boots_rToe02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_rToe02.addBox(-0.81F, 1.9F, -7.2F, 1, 1, 2, 0.0F);
		this.setRotateAngle(boots_rToe02, 0.3665191429188092F, 0.17453292519943295F, 0.0F);
		this.chestplate_rArch02 = new ModelRenderer(this, 121, 5);
		this.chestplate_rArch02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch02.addBox(-4.39F, -3.2F, -3.39F, 2, 3, 1, 0.0F);
		this.boots_lHeel03 = new ModelRenderer(this, 54, 53);
		this.boots_lHeel03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lHeel03.addBox(-2.2F, 3.8F, 0.81F, 1, 1, 1, 0.0F);
		this.setRotateAngle(boots_lHeel03, 0.2617993877991494F, 0.0F, 0.0F);
		this.helmet_lSpike02 = new ModelRenderer(this, 108, 6);
		this.helmet_lSpike02.setRotationPoint(4.0F, -6.6F, 0.7F);
		this.helmet_lSpike02.addBox(-0.51F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(helmet_lSpike02, -0.5462880558742251F, 0.0F, 0.0F);
		this.chestplate_lArm04 = new ModelRenderer(this, 112, 52);
		this.chestplate_lArm04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArm04.addBox(3.9F, 7.9F, -2.01F, 1, 3, 4, 0.0F);
		this.setRotateAngle(chestplate_lArm04, 0.0F, 0.0F, -0.12217304763960307F);
		this.boots_lToe01 = new ModelRenderer(this, 58, 23);
		this.boots_lToe01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lToe01.addBox(-0.61F, 2.9F, -5.1F, 2, 2, 2, 0.0F);
		this.setRotateAngle(boots_lToe01, 0.08726646259971647F, -0.17453292519943295F, 0.0F);
		this.helmet_lSpike01 = new ModelRenderer(this, 108, 6);
		this.helmet_lSpike01.setRotationPoint(4.0F, -5.9F, 1.2F);
		this.helmet_lSpike01.addBox(-0.49F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(helmet_lSpike01, -0.8196066167365371F, 0.0F, 0.0F);
		this.chestplate_mGuard01 = new ModelRenderer(this, 94, 36);
		this.chestplate_mGuard01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_mGuard01.addBox(-4.0F, 0.0F, -3.5F, 8, 6, 7, 0.0F);
		this.chestplate_lArm03 = new ModelRenderer(this, 49, 55);
		this.chestplate_lArm03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArm03.addBox(4.86F, 6.3F, -2.51F, 1, 4, 5, 0.0F);
		this.setRotateAngle(chestplate_lArm03, 0.0F, 0.0F, 0.17453292519943295F);
		this.boots_lHeel04 = new ModelRenderer(this, 117, 24);
		this.boots_lHeel04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lHeel04.addBox(-2.0F, 4.1F, 2.01F, 1, 1, 1, 0.0F);
		this.chestplate_lArch06 = new ModelRenderer(this, 0, 0);
		this.chestplate_lArch06.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch06.addBox(2.2F, -1.6F, -7.45F, 2, 4, 1, 0.0F);
		this.setRotateAngle(chestplate_lArch06, -0.5235987755982988F, 0.0F, 0.0F);
		this.boots_lToe03 = new ModelRenderer(this, 58, 23);
		this.boots_lToe03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lToe03.addBox(-1.31F, 2.9F, -5.1F, 2, 2, 2, 0.0F);
		this.setRotateAngle(boots_lToe03, 0.08726646259971647F, 0.17453292519943295F, 0.0F);
		this.chestplate_rArm02 = new ModelRenderer(this, 64, 37);
		this.chestplate_rArm02.mirror = true;
		this.chestplate_rArm02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArm02.addBox(-3.8F, 7.0F, -2.5F, 4, 4, 5, 0.0F);
		this.chestplate_lGuard02 = new ModelRenderer(this, 84, 19);
		this.chestplate_lGuard02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lGuard02.addBox(2.4F, 5.6F, -2.5F, 3, 2, 5, 0.0F);
		this.setRotateAngle(chestplate_lGuard02, 0.0F, 0.0F, -0.05235987755982988F);
		this.boots_lLegGuard01 = new ModelRenderer(this, 88, 0);
		this.boots_lLegGuard01.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.boots_lLegGuard01.addBox(-1.8F, 0.0F, -2.5F, 4, 5, 5, 0.0F);
		this.chestplate_rGuard02 = new ModelRenderer(this, 84, 19);
		this.chestplate_rGuard02.mirror = true;
		this.chestplate_rGuard02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rGuard02.addBox(-5.4F, 5.6F, -2.5F, 3, 2, 5, 0.0F);
		this.setRotateAngle(chestplate_rGuard02, 0.0F, 0.0F, 0.05235987755982988F);
		this.chestplate_lArch10 = new ModelRenderer(this, 121, 15);
		this.chestplate_lArch10.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch10.addBox(2.2F, -0.02F, -3.97F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_lArch10, -0.6108652381980153F, 0.0F, 0.0F);
		this.boots_rHeel02 = new ModelRenderer(this, 48, 51);
		this.boots_rHeel02.mirror = true;
		this.boots_rHeel02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_rHeel02.addBox(-2.09F, 3.8F, -1.2F, 4, 1, 3, 0.0F);
		this.setRotateAngle(boots_rHeel02, 0.2617993877991494F, 0.0F, 0.0F);
		this.helmet_crest02 = new ModelRenderer(this, 107, 11);
		this.helmet_crest02.setRotationPoint(0.5F, 0.4F, -0.7F);
		this.helmet_crest02.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(helmet_crest02, -0.5918411493512771F, 0.7853981633974483F, -1.2747884856566583F);
		this.chestplate_rArch04 = new ModelRenderer(this, 0, 0);
		this.chestplate_rArch04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch04.addBox(-4.21F, -4.6F, -6.16F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch04, 0.6981317007977318F, 0.0F, 0.0F);
		this.boots_lHeel01 = new ModelRenderer(this, 106, 19);
		this.boots_lHeel01.setRotationPoint(-0.2F, 0.0F, 0.0F);
		this.boots_lHeel01.addBox(-1.5F, 4.1F, -3.0F, 4, 1, 6, 0.0F);
		this.leggings_lLegJoint = new ModelRenderer(this, 61, 0);
		this.leggings_lLegJoint.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_lLegJoint.addBox(1.51F, 3.7F, -1.4F, 1, 2, 2, 0.0F);
		this.setRotateAngle(leggings_lLegJoint, 0.05235987755982988F, 0.0F, 0.0F);
		this.chestplate_rGuard04 = new ModelRenderer(this, 78, 55);
		this.chestplate_rGuard04.setRotationPoint(0.0F, 11.0F, 0.0F);
		this.chestplate_rGuard04.addBox(-3.7F, -0.3F, -2.51F, 4, 1, 5, 0.0F);
		this.setRotateAngle(chestplate_rGuard04, 0.0F, 0.0F, 0.17453292519943295F);
		this.chestplate_spine05 = new ModelRenderer(this, 45, 33);
		this.chestplate_spine05.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_spine05.addBox(3.2F, 3.3F, -3.47F, 2, 2, 7, 0.0F);
		this.setRotateAngle(chestplate_spine05, 0.0F, 0.0F, 0.7853981633974483F);
		this.chestplate_rShoulder03 = new ModelRenderer(this, 95, 28);
		this.chestplate_rShoulder03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rShoulder03.addBox(-4.5F, -0.68F, -2.5F, 5, 2, 5, 0.0F);
		this.chestplate_lGuard04 = new ModelRenderer(this, 78, 55);
		this.chestplate_lGuard04.setRotationPoint(0.0F, 11.0F, 0.0F);
		this.chestplate_lGuard04.addBox(-0.3F, -0.3F, -2.51F, 4, 1, 5, 0.0F);
		this.setRotateAngle(chestplate_lGuard04, 0.0F, 0.0F, -0.17453292519943295F);
		this.legging_rLegJoint = new ModelRenderer(this, 61, 0);
		this.legging_rLegJoint.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.legging_rLegJoint.addBox(-2.61F, 3.7F, -1.4F, 1, 2, 2, 0.0F);
		this.setRotateAngle(legging_rLegJoint, 0.05235987755982988F, 0.0F, 0.0F);
		this.chestplate_rGuard01 = new ModelRenderer(this, 82, 17);
		this.chestplate_rGuard01.mirror = true;
		this.chestplate_rGuard01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rGuard01.addBox(-5.8F, 4.5F, -3.49F, 4, 2, 7, 0.0F);
		this.setRotateAngle(chestplate_rGuard01, 0.0F, 0.0F, -0.3141592653589793F);
		this.boots_rFootJoint = new ModelRenderer(this, 61, 0);
		this.boots_rFootJoint.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_rFootJoint.addBox(-2.61F, 1.0F, -1.9F, 1, 2, 2, 0.0F);
		this.setRotateAngle(boots_rFootJoint, 0.3839724354387525F, 0.0F, 0.0F);
		this.leggings_lLegGuard02 = new ModelRenderer(this, 69, 18);
		this.leggings_lLegGuard02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_lLegGuard02.addBox(-2.05F, 0.0F, -2.49F, 1, 7, 5, 0.0F);
		this.chestplate_lArch00 = new ModelRenderer(this, 0, 0);
		this.chestplate_lArch00.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch00.addBox(2.0F, -3.2F, -3.0F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_lArch00, 0.6108652381980153F, 0.06981317007977318F, 0.6981317007977318F);
		this.leggings_lKneeGuard02 = new ModelRenderer(this, 62, 10);
		this.leggings_lKneeGuard02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leggings_lKneeGuard02.addBox(-1.0F, 3.5F, -3.0F, 2, 4, 1, 0.0F);
		this.chestplate_crotchGem = new ModelRenderer(this, 54, 1);
		this.chestplate_crotchGem.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_crotchGem.addBox(-8.09F, 6.2F, -3.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(chestplate_crotchGem, 0.0F, 0.0F, -0.7853981633974483F);
		this.chestplate_lArch02 = new ModelRenderer(this, 121, 5);
		this.chestplate_lArch02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArch02.addBox(2.4F, -3.2F, -3.39F, 2, 3, 1, 0.0F);
		this.chestplate_rArch05 = new ModelRenderer(this, 0, 0);
		this.chestplate_rArch05.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch05.addBox(-4.2F, -1.6F, -7.66F, 2, 2, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch05, 0.5235987755982988F, 0.0F, 0.0F);
		this.chestplate_collar02 = new ModelRenderer(this, 57, 20);
		this.chestplate_collar02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_collar02.addBox(-2.5F, 0.2F, 2.55F, 5, 1, 1, 0.0F);
		this.setRotateAngle(chestplate_collar02, 0.3490658503988659F, 0.0F, 0.0F);
		this.chestplate_rShoulder05 = new ModelRenderer(this, 97, 57);
		this.chestplate_rShoulder05.mirror = true;
		this.chestplate_rShoulder05.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rShoulder05.addBox(-4.4F, 0.3F, -1.65F, 5, 2, 4, 0.0F);
		this.setRotateAngle(chestplate_rShoulder05, 0.0F, 0.0F, -0.15707963267948966F);
		this.chestplate_rShoulder04 = new ModelRenderer(this, 97, 57);
		this.chestplate_rShoulder04.mirror = true;
		this.chestplate_rShoulder04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rShoulder04.addBox(-4.39F, 0.3F, -2.25F, 5, 2, 4, 0.0F);
		this.setRotateAngle(chestplate_rShoulder04, 0.0F, 0.0F, -0.15707963267948966F);
		this.boots_rLegGuard01 = new ModelRenderer(this, 88, 0);
		this.boots_rLegGuard01.mirror = true;
		this.boots_rLegGuard01.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.boots_rLegGuard01.addBox(-2.2F, 0.0F, -2.5F, 4, 5, 5, 0.0F);
		this.boots_lFootGuard = new ModelRenderer(this, 115, 27);
		this.boots_lFootGuard.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_lFootGuard.addBox(-1.91F, 3.1F, -4.0F, 4, 2, 2, 0.0F);
		this.chestplate_rArch08 = new ModelRenderer(this, 0, 0);
		this.chestplate_rArch08.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArch08.addBox(-4.21F, 0.4F, -5.85F, 2, 3, 1, 0.0F);
		this.setRotateAngle(chestplate_rArch08, 1.117010721276371F, 0.0F, 0.0F);
		this.boots_rToe01 = new ModelRenderer(this, 58, 23);
		this.boots_rToe01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.boots_rToe01.addBox(-1.31F, 2.9F, -5.1F, 2, 2, 2, 0.0F);
		this.setRotateAngle(boots_rToe01, 0.08726646259971647F, 0.17453292519943295F, 0.0F);
		this.chestplate_lShoulder04 = new ModelRenderer(this, 97, 57);
		this.chestplate_lShoulder04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lShoulder04.addBox(-0.59F, 0.3F, -2.25F, 5, 2, 4, 0.0F);
		this.setRotateAngle(chestplate_lShoulder04, 0.0F, 0.0F, 0.15707963267948966F);
		this.chestplate_lShoulder01.addChild(this.chestplate_lShoulder02);
		this.chestplate_lShoulder01.addChild(this.chestplate_lShoulder05);
		this.head.addChild(this.helmet_rSpike02);
		this.leggings_lLegGuard01.addChild(this.leggings_lKneeGuard01);
		this.chestplate_mGuard01.addChild(this.chestplate_lGuard);
		this.chestplate_rArch02.addChild(this.shoulder_line_right_1_3);
		this.chestplate_rArch07.addChild(this.chestplate_rArch06);
		this.chestplate_lArch01.addChild(this.shoulder_line_left_1_3);
		this.chestplate_mGuard01.addChild(this.chestplate_spine01);
		this.head.addChild(this.helmet_upperRidge);
		this.chestplate_lShoulder01.addChild(this.chestplate_lShoulder03);
		this.chestplate_mGuard01.addChild(this.chestplate_spine04);
		this.chestplate_rArch04.addChild(this.chestplate_rArch03);
		this.chestplate_rShoulder04.addChild(this.chestplate_rArm01);
		this.chestplate_rArch08.addChild(this.chestplate_rArch07);
		this.lArm.addChild(this.chestplate_lShoulder01);
		this.leggings_rKneeGuard01.addChild(this.leggings_rKneeGuard02);
		this.chestplate_gem01.addChild(this.chestplate_gem02);
		this.chestplate_lArch04.addChild(this.chestplate_lArch05);
		this.chestplate_mGuard01.addChild(this.chestplate_rArch01);
		this.leggings_rLegGuard01.addChild(this.leggings_rLegGuard02);
		this.chestplate_lArch03.addChild(this.chestplate_lArch04);
		this.rLeg.addChild(this.leggings_rLegGuard01);
		this.chestplate_mGuard01.addChild(this.chestplate_gem01);
		this.head.addChild(this.helmet_gemSocket);
		this.helmet_gemSocket.addChild(this.helmet_gem);
		this.chestplate_mGuard01.addChild(this.chestplate_spine03);
		this.chestplate_rGuard02.addChild(this.chestplate_rGuard03);
		this.chestplate_lArch07.addChild(this.chestplate_lArch08);
		this.chestplate_lArm01.addChild(this.chestplate_lArm02);
		this.boots_lLegGuard01.addChild(this.boots_lToe02);
		this.boots_rLegGuard01.addChild(this.boots_rFootGuard);
		this.chestplate_mGuard01.addChild(this.chestplate_mGuard02);
		this.chestplate_lGuard02.addChild(this.chestplate_lGuard03);
		this.chestplate_lArch06.addChild(this.chestplate_lArch07);
		this.rArm.addChild(this.chestplate_rShoulder01);
		this.chestplate_lArch02.addChild(this.chestplate_lArch01);
		this.chestplate_lArch08.addChild(this.chestplate_lArch09);
		this.helmet_upperRidge.addChild(this.helmet_crest01);
		this.boots_lLegGuard01.addChild(this.boots_lHeel02);
		this.chestplate_rArm02.addChild(this.chestplate_rArm03);
		this.leggings_rLegGuard01.addChild(this.leggings_rKneeGuard01);
		this.boots_rLegGuard01.addChild(this.boots_rToe03);
		this.chestplate_mGuard01.addChild(this.chestplate_spine02);
		this.chestplate_lArch00.addChild(this.chestplate_lArch03);
		this.boots_lLegGuard01.addChild(this.boots_lLegGuard02);
		this.chestplate_lShoulder04.addChild(this.chestplate_lArm01);
		this.boots_rLegGuard01.addChild(this.boots_rHeel03);
		this.boots_rLegGuard01.addChild(this.boots_rHeel01);
		this.chestplate_rArch01.addChild(this.shoulder_line_right_1);
		this.boots_rLegGuard01.addChild(this.boots_rToe04);
		this.chestplate_rArch01.addChild(this.chestplate_rArch10);
		this.boots_lLegGuard01.addChild(this.boots_lFootJoint);
		this.lLeg.addChild(this.leggings_lLegGuard01);
		this.chestplate_rArm03.addChild(this.chestplate_rArm04);
		this.chestplate_mGuard01.addChild(this.chestplate_rArch09);
		this.chestplate_mGuard01.addChild(this.chestplate_rArch00);
		this.boots_rLegGuard01.addChild(this.boots_rLegGuard02);
		this.chestplate_mGuard01.addChild(this.chestplate_collar01);
		this.chestplate_mGuard01.addChild(this.chestplate_hips);
		this.chestplate_rShoulder01.addChild(this.chestplate_rShoulder02);
		this.boots_rLegGuard01.addChild(this.boots_rHeel04);
		this.head.addChild(this.helmet_rSpike01);
		this.boots_lLegGuard01.addChild(this.boots_lToe04);
		this.boots_rLegGuard01.addChild(this.boots_rToe02);
		this.shoulder_line_right_1.addChild(this.chestplate_rArch02);
		this.boots_lLegGuard01.addChild(this.boots_lHeel03);
		this.head.addChild(this.helmet_lSpike02);
		this.chestplate_lArm03.addChild(this.chestplate_lArm04);
		this.boots_lLegGuard01.addChild(this.boots_lToe01);
		this.head.addChild(this.helmet_lSpike01);
		this.body.addChild(this.chestplate_mGuard01);
		this.chestplate_lArm02.addChild(this.chestplate_lArm03);
		this.boots_lHeel01.addChild(this.boots_lHeel04);
		this.chestplate_lArch05.addChild(this.chestplate_lArch06);
		this.boots_lLegGuard01.addChild(this.boots_lToe03);
		this.chestplate_rArm01.addChild(this.chestplate_rArm02);
		this.chestplate_lGuard.addChild(this.chestplate_lGuard02);
		this.lLeg.addChild(this.boots_lLegGuard01);
		this.chestplate_rGuard01.addChild(this.chestplate_rGuard02);
		this.chestplate_lArch09.addChild(this.chestplate_lArch10);
		this.boots_rHeel01.addChild(this.boots_rHeel02);
		this.helmet_crest01.addChild(this.helmet_crest02);
		this.chestplate_rArch05.addChild(this.chestplate_rArch04);
		this.boots_lLegGuard01.addChild(this.boots_lHeel01);
		this.leggings_lLegGuard01.addChild(this.leggings_lLegJoint);
		this.chestplate_mGuard01.addChild(this.chestplate_rGuard04);
		this.chestplate_mGuard01.addChild(this.chestplate_spine05);
		this.chestplate_rShoulder01.addChild(this.chestplate_rShoulder03);
		this.chestplate_mGuard01.addChild(this.chestplate_lGuard04);
		this.leggings_rLegGuard01.addChild(this.legging_rLegJoint);
		this.chestplate_mGuard01.addChild(this.chestplate_rGuard01);
		this.boots_rLegGuard01.addChild(this.boots_rFootJoint);
		this.leggings_lLegGuard01.addChild(this.leggings_lLegGuard02);
		this.chestplate_mGuard01.addChild(this.chestplate_lArch00);
		this.leggings_lKneeGuard01.addChild(this.leggings_lKneeGuard02);
		this.chestplate_mGuard01.addChild(this.chestplate_crotchGem);
		this.chestplate_lArch00.addChild(this.chestplate_lArch02);
		this.chestplate_rArch06.addChild(this.chestplate_rArch05);
		this.chestplate_mGuard01.addChild(this.chestplate_collar02);
		this.chestplate_rShoulder01.addChild(this.chestplate_rShoulder05);
		this.chestplate_rShoulder01.addChild(this.chestplate_rShoulder04);
		this.rLeg.addChild(this.boots_rLegGuard01);
		this.boots_lLegGuard01.addChild(this.boots_lFootGuard);
		this.chestplate_rArch10.addChild(this.chestplate_rArch08);
		this.boots_rLegGuard01.addChild(this.boots_rToe01);
		this.chestplate_lShoulder03.addChild(this.chestplate_lShoulder04);
	}

	@Override
	public void renderHelmet(TransformType type, Entity entity, float scale)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);
		switch (type)
		{
		case FIRST_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 24, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case FIRST_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 24, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case FIXED:
			GlStateManager.rotate(180, 0, 1, 0);
			GlStateManager.translate(0, scale * 28, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case GROUND:
			GlStateManager.scale(0.55, 0.55, 0.55);
			GlStateManager.translate(0, scale * 45, 0);
			break;
		case GUI:
			ModelUtils.rotateDefaultBlockGui();
			GlStateManager.translate(0, scale * 31, 0);
			GlStateManager.rotate(90, 0, 1, 0);
			break;
		case HEAD:
			break;
		case NONE:
			break;
		case THIRD_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 25, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 25, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		}

		this.helmet_crest01.render(scale);
		this.helmet_crest02.render(scale);
		this.helmet_gem.render(scale);
		this.helmet_gemSocket.render(scale);
		this.helmet_lSpike01.render(scale);
		this.helmet_lSpike02.render(scale);
		this.helmet_rSpike01.render(scale);
		this.helmet_rSpike02.render(scale);
		this.helmet_upperRidge.render(scale);

		GlStateManager.popMatrix();
	}

	@Override
	public void renderChestplate(TransformType type, Entity entity, float scale)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);

		switch (type)
		{
		case FIRST_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case FIRST_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case FIXED:
			GlStateManager.rotate(180, 0, 1, 0);
			GlStateManager.translate(0, scale * 24, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case GROUND:
			GlStateManager.scale(0.55, 0.55, 0.55);
			GlStateManager.translate(0, scale * 30, 0);
			break;
		case GUI:
			ModelUtils.rotateDefaultBlockGui();
			GlStateManager.translate(0, scale * 25, 0);
			GlStateManager.rotate(90, 0, 1, 0);
			GlStateManager.scale(0.6, 0.6, 0.6);
			break;
		case HEAD:
			break;
		case NONE:
			break;
		case THIRD_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		}

		this.body.render(scale);
		this.lArm.render(scale);
		this.rArm.render(scale);

		GlStateManager.popMatrix();
	}

	@Override
	public void renderLeggings(TransformType type, Entity entity, float scale)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);

		switch (type)
		{
		case FIRST_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 6, 0);
			break;
		case FIRST_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 6, 0);
			break;
		case FIXED:
			break;
		case GROUND:
			GlStateManager.translate(0, scale * 8, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case GUI:
			GlStateManager.translate(0, scale * 10, 0);
			ModelUtils.rotateDefaultBlockGui();
			GlStateManager.rotate(90, 0, 1, 0);
			break;
		case HEAD:
			break;
		case NONE:
			break;
		case THIRD_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 6, 0);
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 6, 0);
			break;
		}

		GlStateManager.pushMatrix();
		GlStateManager.translate(scale * 2, scale * 12, 0);
		this.leggings_lKneeGuard01.render(scale);
		this.leggings_lKneeGuard02.render(scale);
		this.leggings_lLegGuard01.render(scale);
		this.leggings_lLegGuard02.render(scale);
		this.leggings_lLegJoint.render(scale);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(scale * -2, scale * 12, 0);
		this.leggings_rLegGuard01.render(scale);
		this.leggings_rLegGuard02.render(scale);
		GlStateManager.popMatrix();

		GlStateManager.popMatrix();
	}

	@Override
	public void renderBoots(TransformType type, Entity entity, float scale)
	{
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);

		switch (type)
		{
		case FIRST_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.LEFT);
			GlStateManager.translate(scale * -4, scale * 12, 0);
			break;
		case FIRST_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.RIGHT);
			GlStateManager.translate(scale * -4, scale * 12, 0);
			break;
		case FIXED:
			GlStateManager.translate(scale * -4, scale * 13, 0);
			break;
		case GROUND:
			GlStateManager.translate(scale * -2, scale * 15, 0);
			GlStateManager.scale(0.6, 0.6, 0.6);
			break;
		case GUI:
			GlStateManager.translate(scale * -2, scale * 18, 0);
			ModelUtils.rotateDefaultBlockGui();
			GlStateManager.rotate(90, 0, 1, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case HEAD:
			break;
		case NONE:
			break;
		case THIRD_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.LEFT);
			GlStateManager.translate(scale * -4, scale * 14, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			GlStateManager.translate(scale * -4, scale * 14, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		}
		GlStateManager.translate(0, 0.5, 0);
		this.boots_lFootGuard.render(scale);
		this.boots_lFootJoint.render(scale);
		this.boots_lHeel01.render(scale);
		this.boots_lHeel02.render(scale);
		this.boots_lHeel03.render(scale);
		this.boots_lHeel04.render(scale);
		GlStateManager.translate(0, -0.5, 0);
		this.boots_lLegGuard01.render(scale);
		GlStateManager.translate(0, 0.5, 0);
		this.boots_lToe01.render(scale);
		this.boots_lToe02.render(scale);
		this.boots_lToe03.render(scale);
		this.boots_lToe04.render(scale);
		GlStateManager.translate(0, -0.5, 0);

		GlStateManager.translate(0.3, 0.5, 0);
		this.boots_rFootGuard.render(scale);
		this.boots_rFootJoint.render(scale);
		this.boots_rHeel01.render(scale);
		this.boots_rHeel02.render(scale);
		this.boots_rHeel03.render(scale);
		this.boots_rHeel04.render(scale);
		GlStateManager.translate(0, -0.5, 0);
		this.boots_rLegGuard01.render(scale);
		GlStateManager.translate(0, 0.5, 0);
		this.boots_rToe01.render(scale);
		this.boots_rToe02.render(scale);
		this.boots_rToe03.render(scale);
		this.boots_rToe04.render(scale);
		GlStateManager.translate(0, -0.5, 0);
		GlStateManager.popMatrix();
	}
}
