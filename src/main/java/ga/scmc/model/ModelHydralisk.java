package ga.scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * hydralisk - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelHydralisk extends ModelBase implements IModelSkull {

	public ModelRenderer backArmour01;
	public ModelRenderer chest;
	public ModelRenderer crest01;
	public ModelRenderer crest02;
	public ModelRenderer crest05a;
	public ModelRenderer crest05b;
	public ModelRenderer head;
	public ModelRenderer lArm1;
	public ModelRenderer lArm2;
	public ModelRenderer lArm3;
	public ModelRenderer lArmSpike01b;
	public ModelRenderer lArmSpike01c;
	public ModelRenderer lArmSpike02b;
	public ModelRenderer lArmSpike02c;
	public ModelRenderer lArmSpike03b;
	public ModelRenderer lArmSpike03c;
	public ModelRenderer lArmSpike04a;
	public ModelRenderer lArmSpike04b;
	public ModelRenderer lArmSpike05a;
	public ModelRenderer lArmSpike05b;
	public ModelRenderer lArmSpike06a;
	public ModelRenderer lArmSpike06b;
	public ModelRenderer lArmSpike07a;
	public ModelRenderer lArmSpike07b;
	public ModelRenderer lArmSpike08a;
	public ModelRenderer lArmSpike08b;
	public ModelRenderer lArmSpike1a;
	public ModelRenderer lArmSpike1b;
	public ModelRenderer lArmSpike1c;
	public ModelRenderer lArmSpike2a;
	public ModelRenderer lArmSpike2b;
	public ModelRenderer lArmSpike2c;
	public ModelRenderer lArmSpike3a;
	public ModelRenderer lArmSpike3b;
	public ModelRenderer lCrest03a;
	public ModelRenderer lCrest03a_1;
	public ModelRenderer lCrest03b;
	public ModelRenderer lCrest03b_1;
	public ModelRenderer lCrest03c;
	public ModelRenderer lCrest03c_1;
	public ModelRenderer lCrest04a;
	public ModelRenderer lCrest04b;
	public ModelRenderer lCrest04c;
	public ModelRenderer lFangs;
	public ModelRenderer lMandible1;
	public ModelRenderer lMandible2;
	public ModelRenderer lowerJaw1;
	public ModelRenderer lShoulder;
	public ModelRenderer lTailSpike00a;
	public ModelRenderer lTailSpike00b;
	public ModelRenderer lTailSpike00c;
	public ModelRenderer lTailSpike01a;
	public ModelRenderer lTailSpike01b;
	public ModelRenderer lTailSpike01c;
	public ModelRenderer lTailSpike02a;
	public ModelRenderer lTailSpike02b;
	public ModelRenderer lTailSpike02c;
	public ModelRenderer lTailSpike03a;
	public ModelRenderer lTailSpike03b;
	public ModelRenderer lTailSpike03c;
	public ModelRenderer lTailSpike04a;
	public ModelRenderer lTailSpike04b;
	public ModelRenderer lTailSpike04c;
	public ModelRenderer muzzle;
	public ModelRenderer neck;
	public ModelRenderer rArm1;
	public ModelRenderer rArm2;
	public ModelRenderer rArm3;
	public ModelRenderer rArmSpike1a;
	public ModelRenderer rArmSpike1b;
	public ModelRenderer rArmSpike1c;
	public ModelRenderer rArmSpike2a;
	public ModelRenderer rArmSpike2b;
	public ModelRenderer rArmSpike2c;
	public ModelRenderer rArmSpike3a;
	public ModelRenderer rArmSpike3b;
	public ModelRenderer rCrest04a;
	public ModelRenderer rCrest04b;
	public ModelRenderer rCrest04c;
	public ModelRenderer rFangs;
	public ModelRenderer rMandible1;
	public ModelRenderer rMandible2;
	public ModelRenderer rShoulder;
	public ModelRenderer rTailSpike00a;
	public ModelRenderer rTailSpike00b;
	public ModelRenderer rTailSpike00c;
	public ModelRenderer rTailSpike01a;
	public ModelRenderer rTailSpike01b;
	public ModelRenderer rTailSpike01c;
	public ModelRenderer rTailSpike02a;
	public ModelRenderer rTailSpike02b;
	public ModelRenderer rTailSpike02c;
	public ModelRenderer rTailSpike03a;
	public ModelRenderer rTailSpike03b;
	public ModelRenderer rTailSpike03c;
	public ModelRenderer rTailSpike04a;
	public ModelRenderer rTailSpike04b;
	public ModelRenderer rTailSpike04c;
	public ModelRenderer shape125;
	public ModelRenderer spine01a;
	public ModelRenderer spine01b;
	public ModelRenderer spine02a;
	public ModelRenderer spine02b;
	public ModelRenderer spine03a;
	public ModelRenderer spine03b;
	public ModelRenderer stomach;
	public ModelRenderer tail01;
	public ModelRenderer tail02;
	public ModelRenderer tail03;
	public ModelRenderer tail04;
	public ModelRenderer tail05;
	public ModelRenderer tail06;
	public ModelRenderer tail07;
	public ModelRenderer tail08;
	public ModelRenderer tail09;
	public ModelRenderer tailSpike01a;
	public ModelRenderer tailSpike02a;
	public ModelRenderer tailSpike03a;
	public ModelRenderer teethLower;
	public ModelRenderer teethUpper;
	public ModelRenderer upperJaw;

	public ModelHydralisk() {
		textureWidth = 256;
		textureHeight = 128;
		rArmSpike1b = new ModelRenderer(this, 185, 0);
		rArmSpike1b.mirror = true;
		rArmSpike1b.setRotationPoint(0.0F, 5.8F, -0.1F);
		rArmSpike1b.addBox(-1.0F, -0.1F, -1.0F, 2, 6, 2, 0.0F);
		setRotateAngle(rArmSpike1b, 0.18203784098300857F, 0.0F, 0.0F);
		lTailSpike02a = new ModelRenderer(this, 185, 2);
		lTailSpike02a.setRotationPoint(4.5F, 1.5F, 2.2F);
		lTailSpike02a.addBox(0.6F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(lTailSpike02a, 0.0F, 0.0F, 0.136659280431156F);
		crest02 = new ModelRenderer(this, 108, 61);
		crest02.setRotationPoint(0.0F, 0.0F, 0.0F);
		crest02.addBox(-4.5F, -4.5F, 2.4F, 9, 2, 6, 0.0F);
		lArmSpike03c = new ModelRenderer(this, 185, 0);
		lArmSpike03c.setRotationPoint(0.0F, -2.0F, 0.1F);
		lArmSpike03c.addBox(-0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lArmSpike03c, -0.22759093446006054F, 0.0F, 0.0F);
		lCrest03c = new ModelRenderer(this, 195, 92);
		lCrest03c.mirror = true;
		lCrest03c.setRotationPoint(-0.5F, 0.1F, 3.4F);
		lCrest03c.addBox(-1.0F, -0.9F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(lCrest03c, -0.045553093477052F, 0.27314402793711257F, 0.0F);
		lCrest04a = new ModelRenderer(this, 195, 71);
		lCrest04a.setRotationPoint(6.1F, -2.2F, 5.6F);
		lCrest04a.addBox(-2.0F, -0.5F, -2.8F, 4, 3, 7, 0.0F);
		setRotateAngle(lCrest04a, -0.045553093477052F, 0.40980330836826856F, 0.0F);
		lArmSpike08a = new ModelRenderer(this, 185, 0);
		lArmSpike08a.setRotationPoint(0.0F, -0.4F, 3.6F);
		lArmSpike08a.addBox(-1.0F, -2.4F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmSpike08a, -0.136659280431156F, 0.0F, 0.0F);
		lTailSpike04a = new ModelRenderer(this, 185, 2);
		lTailSpike04a.setRotationPoint(3.5F, 1.5F, 2.1F);
		lTailSpike04a.addBox(0.6F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(lTailSpike04a, 0.0F, 0.0F, 0.136659280431156F);
		lArmSpike07b = new ModelRenderer(this, 185, 0);
		lArmSpike07b.setRotationPoint(0.0F, -2.0F, 0.1F);
		lArmSpike07b.addBox(-0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lArmSpike07b, -0.22759093446006054F, 0.0F, 0.0F);
		lArm2 = new ModelRenderer(this, 40, 45);
		lArm2.setRotationPoint(1.0F, 8.1F, 0.0F);
		lArm2.addBox(-1.2F, -1.7F, -7.4F, 2, 3, 7, 0.0F);
		setRotateAngle(lArm2, -0.045553093477052F, 0.0F, 0.0F);
		lArmSpike05b = new ModelRenderer(this, 185, 0);
		lArmSpike05b.setRotationPoint(0.0F, -2.0F, 0.1F);
		lArmSpike05b.addBox(-0.5F, -1.6F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(lArmSpike05b, -0.22759093446006054F, 0.0F, 0.0F);
		lFangs = new ModelRenderer(this, 25, 100);
		lFangs.setRotationPoint(0.0F, 0.0F, 0.0F);
		lFangs.addBox(0.9F, -1.4F, -7.2F, 0, 5, 6, 0.0F);
		spine01a = new ModelRenderer(this, 53, 61);
		spine01a.setRotationPoint(1.0F, -3.3F, 3.2F);
		spine01a.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 7, 0.0F);
		setRotateAngle(spine01a, 0.5462880558742251F, 0.0F, 0.0F);
		rCrest04b = new ModelRenderer(this, 195, 84);
		rCrest04b.mirror = true;
		rCrest04b.setRotationPoint(0.5F, 1.0F, 3.4F);
		rCrest04b.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
		setRotateAngle(rCrest04b, -0.045553093477052F, 0.27314402793711257F, 0.0F);
		rTailSpike00a = new ModelRenderer(this, 185, 2);
		rTailSpike00a.mirror = true;
		rTailSpike00a.setRotationPoint(-3.7F, 4.0F, -2.1F);
		rTailSpike00a.addBox(-3.1F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(rTailSpike00a, 0.22759093446006054F, 0.0F, -0.18203784098300857F);
		teethLower = new ModelRenderer(this, 0, 100);
		teethLower.setRotationPoint(0.0F, 0.0F, 0.0F);
		teethLower.addBox(-2.5F, -1.5F, -5.0F, 5, 1, 4, 0.0F);
		crest01 = new ModelRenderer(this, 108, 49);
		crest01.setRotationPoint(0.0F, 0.0F, 0.0F);
		crest01.addBox(-4.0F, -3.8F, -4.8F, 8, 2, 8, 0.0F);
		setRotateAngle(crest01, 0.18203784098300857F, 0.0F, 0.0F);
		lCrest04c = new ModelRenderer(this, 195, 92);
		lCrest04c.setRotationPoint(-0.5F, 0.4F, 3.4F);
		lCrest04c.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(lCrest04c, -0.045553093477052F, -0.27314402793711257F, 0.0F);
		lMandible1 = new ModelRenderer(this, 23, 83);
		lMandible1.setRotationPoint(2.5F, 2.0F, -2.8F);
		lMandible1.addBox(-0.2F, -0.8F, -1.5F, 2, 5, 3, 0.0F);
		setRotateAngle(lMandible1, -0.27314402793711257F, -0.18203784098300857F, -0.18203784098300857F);
		lArmSpike08b = new ModelRenderer(this, 185, 0);
		lArmSpike08b.setRotationPoint(0.0F, -2.0F, 0.1F);
		lArmSpike08b.addBox(-0.5F, -1.6F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(lArmSpike08b, -0.22759093446006054F, 0.0F, 0.0F);
		rArmSpike2a = new ModelRenderer(this, 185, 0);
		rArmSpike2a.mirror = true;
		rArmSpike2a.setRotationPoint(0.0F, 1.8F, 1.1F);
		rArmSpike2a.addBox(-1.5F, -0.1F, -1.5F, 3, 4, 3, 0.0F);
		setRotateAngle(rArmSpike2a, 0.136659280431156F, 0.0F, 0.0F);
		lTailSpike01c = new ModelRenderer(this, 185, 2);
		lTailSpike01c.setRotationPoint(1.7F, 0.1F, 0.1F);
		lTailSpike01c.addBox(-0.1F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lTailSpike01c, 0.0F, -0.136659280431156F, 0.0F);
		rTailSpike01c = new ModelRenderer(this, 185, 2);
		rTailSpike01c.mirror = true;
		rTailSpike01c.setRotationPoint(-1.2F, 0.1F, 0.1F);
		rTailSpike01c.addBox(-2.2F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(rTailSpike01c, 0.0F, 0.136659280431156F, 0.0F);
		lTailSpike00c = new ModelRenderer(this, 185, 2);
		lTailSpike00c.setRotationPoint(1.7F, 0.1F, 0.1F);
		lTailSpike00c.addBox(-0.1F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lTailSpike00c, 0.0F, 0.0F, 0.18203784098300857F);
		rCrest04a = new ModelRenderer(this, 195, 71);
		rCrest04a.mirror = true;
		rCrest04a.setRotationPoint(-4.1F, -2.2F, 5.6F);
		rCrest04a.addBox(-2.0F, -0.5F, -2.8F, 4, 3, 7, 0.0F);
		setRotateAngle(rCrest04a, -0.045553093477052F, -0.40980330836826856F, 0.0F);
		tail07 = new ModelRenderer(this, 161, 31);
		tail07.setRotationPoint(0.0F, 0.5F, 4.8F);
		tail07.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 6, 0.0F);
		lArmSpike06a = new ModelRenderer(this, 185, 0);
		lArmSpike06a.setRotationPoint(0.0F, -1.7F, 2.9F);
		lArmSpike06a.addBox(-1.0F, -2.4F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmSpike06a, -0.136659280431156F, 0.0F, 0.0F);
		lCrest03b_1 = new ModelRenderer(this, 117, 84);
		lCrest03b_1.setRotationPoint(0.5F, 1.2F, 3.4F);
		lCrest03b_1.addBox(-1.5F, -0.9F, 0.0F, 3, 1, 4, 0.0F);
		setRotateAngle(lCrest03b_1, -0.045553093477052F, -0.27314402793711257F, 0.0F);
		tail02 = new ModelRenderer(this, 0, 27);
		tail02.setRotationPoint(1.0F, 6.9F, 6.4F);
		tail02.addBox(-6.0F, -5.0F, 0.0F, 12, 9, 6, 0.0F);
		crest05b = new ModelRenderer(this, 153, 108);
		crest05b.setRotationPoint(0.0F, -0.3F, 5.6F);
		crest05b.addBox(-2.0F, -0.5F, -0.2F, 4, 1, 6, 0.0F);
		setRotateAngle(crest05b, 0.27314402793711257F, 0.0F, 0.0F);
		lArmSpike06b = new ModelRenderer(this, 185, 0);
		lArmSpike06b.setRotationPoint(0.0F, -2.0F, 0.1F);
		lArmSpike06b.addBox(-0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lArmSpike06b, -0.22759093446006054F, 0.0F, 0.0F);
		rTailSpike03a = new ModelRenderer(this, 185, 2);
		rTailSpike03a.mirror = true;
		rTailSpike03a.setRotationPoint(-4.8F, 1.8F, 1.9F);
		rTailSpike03a.addBox(-3.1F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(rTailSpike03a, 0.0F, 0.0F, -0.136659280431156F);
		rTailSpike02a = new ModelRenderer(this, 185, 2);
		rTailSpike02a.mirror = true;
		rTailSpike02a.setRotationPoint(-5.0F, 1.5F, 2.2F);
		rTailSpike02a.addBox(-3.1F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(rTailSpike02a, 0.0F, 0.0F, -0.136659280431156F);
		rArmSpike3a = new ModelRenderer(this, 185, 0);
		rArmSpike3a.mirror = true;
		rArmSpike3a.setRotationPoint(-0.3F, 1.2F, -6.3F);
		rArmSpike3a.addBox(-1.0F, -0.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(rArmSpike3a, 0.36425021489121656F, 0.0F, 0.0F);
		lArmSpike03b = new ModelRenderer(this, 185, 0);
		lArmSpike03b.setRotationPoint(0.0F, -1.0F, -0.3F);
		lArmSpike03b.addBox(-1.0F, -2.4F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmSpike03b, -0.136659280431156F, 0.0F, 0.0F);
		rArmSpike1c = new ModelRenderer(this, 185, 0);
		rArmSpike1c.mirror = true;
		rArmSpike1c.setRotationPoint(0.0F, 6.1F, 0.1F);
		rArmSpike1c.addBox(-0.4F, -0.5F, -0.6F, 1, 6, 1, 0.0F);
		setRotateAngle(rArmSpike1c, 0.18203784098300857F, 0.0F, 0.0F);
		rTailSpike00b = new ModelRenderer(this, 185, 2);
		rTailSpike00b.mirror = true;
		rTailSpike00b.setRotationPoint(-3.2F, 0.0F, 0.0F);
		rTailSpike00b.addBox(-1.6F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(rTailSpike00b, 0.0F, 0.0F, -0.18203784098300857F);
		lArmSpike07a = new ModelRenderer(this, 185, 0);
		lArmSpike07a.setRotationPoint(0.0F, -1.3F, 1.0F);
		lArmSpike07a.addBox(-1.0F, -2.4F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmSpike07a, -0.136659280431156F, 0.0F, 0.0F);
		rArm2 = new ModelRenderer(this, 40, 45);
		rArm2.mirror = true;
		rArm2.setRotationPoint(1.0F, 8.1F, 0.0F);
		rArm2.addBox(-1.2F, -1.7F, -7.4F, 2, 3, 7, 0.0F);
		setRotateAngle(rArm2, -0.045553093477052F, 0.0F, 0.0F);
		lArmSpike2c = new ModelRenderer(this, 185, 0);
		lArmSpike2c.setRotationPoint(0.0F, 4.1F, 0.1F);
		lArmSpike2c.addBox(-0.4F, -0.5F, -0.6F, 1, 4, 1, 0.0F);
		setRotateAngle(lArmSpike2c, 0.18203784098300857F, 0.0F, 0.0F);
		neck = new ModelRenderer(this, 135, 0);
		neck.setRotationPoint(1.0F, -3.5F, 0.0F);
		neck.addBox(-4.5F, -3.8F, -10.9F, 9, 6, 12, 0.0F);
		setRotateAngle(neck, -0.136659280431156F, 0.0F, 0.0F);
		lTailSpike01b = new ModelRenderer(this, 185, 2);
		lTailSpike01b.setRotationPoint(3.5F, 0.0F, 0.0F);
		lTailSpike01b.addBox(-0.1F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lTailSpike01b, 0.0F, -0.136659280431156F, 0.0F);
		rTailSpike04a = new ModelRenderer(this, 185, 2);
		rTailSpike04a.mirror = true;
		rTailSpike04a.setRotationPoint(-4.6F, 1.5F, 2.1F);
		rTailSpike04a.addBox(-3.1F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(rTailSpike04a, 0.0F, 0.0F, -0.136659280431156F);
		rArm3 = new ModelRenderer(this, 66, 48);
		rArm3.mirror = true;
		rArm3.setRotationPoint(0.0F, 0.0F, -10.0F);
		rArm3.addBox(-2.2F, -2.2F, -4.2F, 4, 4, 7, 0.0F);
		lArmSpike02c = new ModelRenderer(this, 185, 0);
		lArmSpike02c.setRotationPoint(0.0F, -2.0F, 0.1F);
		lArmSpike02c.addBox(-0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lArmSpike02c, -0.22759093446006054F, 0.0F, 0.0F);
		lArmSpike3a = new ModelRenderer(this, 185, 0);
		lArmSpike3a.setRotationPoint(-0.3F, 1.2F, -6.3F);
		lArmSpike3a.addBox(-1.0F, -0.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(lArmSpike3a, 0.36425021489121656F, 0.0F, 0.0F);
		crest05a = new ModelRenderer(this, 150, 93);
		crest05a.setRotationPoint(1.0F, -2.6F, 5.6F);
		crest05a.addBox(-2.5F, -1.0F, -0.2F, 5, 2, 7, 0.0F);
		setRotateAngle(crest05a, 0.091106186954104F, 0.0F, 0.0F);
		lArmSpike05a = new ModelRenderer(this, 185, 0);
		lArmSpike05a.setRotationPoint(0.0F, -1.4F, 0.0F);
		lArmSpike05a.addBox(-1.0F, -2.4F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmSpike05a, -0.136659280431156F, 0.0F, 0.0F);
		lTailSpike04c = new ModelRenderer(this, 185, 2);
		lTailSpike04c.setRotationPoint(1.7F, 0.1F, 0.1F);
		lTailSpike04c.addBox(-0.1F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lTailSpike04c, 0.0F, -0.136659280431156F, 0.0F);
		lArmSpike04a = new ModelRenderer(this, 185, 0);
		lArmSpike04a.setRotationPoint(0.0F, -2.1F, 6.0F);
		lArmSpike04a.addBox(-1.0F, -2.4F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmSpike04a, -0.136659280431156F, 0.0F, 0.0F);
		muzzle = new ModelRenderer(this, 88, 48);
		muzzle.setRotationPoint(0.0F, 0.0F, 0.0F);
		muzzle.addBox(-2.0F, -3.0F, -3.2F, 4, 2, 4, 0.0F);
		setRotateAngle(muzzle, 0.4553564018453205F, 0.0F, 0.0F);
		rTailSpike01a = new ModelRenderer(this, 185, 2);
		rTailSpike01a.mirror = true;
		rTailSpike01a.setRotationPoint(-3.7F, 8.3F, 3.2F);
		rTailSpike01a.addBox(-3.1F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(rTailSpike01a, 0.0F, 0.0F, -0.136659280431156F);
		rCrest04c = new ModelRenderer(this, 195, 92);
		rCrest04c.mirror = true;
		rCrest04c.setRotationPoint(0.5F, 0.4F, 3.4F);
		rCrest04c.addBox(-1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(rCrest04c, -0.045553093477052F, 0.27314402793711257F, 0.0F);
		rTailSpike02b = new ModelRenderer(this, 185, 2);
		rTailSpike02b.mirror = true;
		rTailSpike02b.setRotationPoint(-3.2F, 0.0F, 0.0F);
		rTailSpike02b.addBox(-1.6F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(rTailSpike02b, 0.0F, 0.136659280431156F, 0.0F);
		lArmSpike2a = new ModelRenderer(this, 185, 0);
		lArmSpike2a.setRotationPoint(0.0F, 1.8F, 1.1F);
		lArmSpike2a.addBox(-1.5F, -0.1F, -1.5F, 3, 4, 3, 0.0F);
		setRotateAngle(lArmSpike2a, 0.136659280431156F, 0.0F, 0.0F);
		lCrest03a = new ModelRenderer(this, 113, 71);
		lCrest03a.setRotationPoint(3.5F, -4.2F, 7.3F);
		lCrest03a.addBox(-2.0F, -0.1F, -2.8F, 4, 2, 7, 0.0F);
		setRotateAngle(lCrest03a, -0.045553093477052F, 0.27314402793711257F, 0.0F);
		rFangs = new ModelRenderer(this, 25, 100);
		rFangs.mirror = true;
		rFangs.setRotationPoint(0.0F, 0.0F, 0.0F);
		rFangs.addBox(-0.7F, -1.4F, -7.2F, 0, 5, 6, 0.0F);
		tailSpike03a = new ModelRenderer(this, 185, 0);
		tailSpike03a.setRotationPoint(0.0F, -3.4F, 2.7F);
		tailSpike03a.addBox(-1.5F, -2.0F, -1.5F, 3, 2, 3, 0.0F);
		setRotateAngle(tailSpike03a, -0.27314402793711257F, 0.0F, 0.0F);
		rShoulder = new ModelRenderer(this, 0, 52);
		rShoulder.mirror = true;
		rShoulder.setRotationPoint(-5.3F, -2.9F, 0.0F);
		rShoulder.addBox(-2.0F, -1.8F, -2.5F, 4, 7, 5, 0.0F);
		setRotateAngle(rShoulder, 0.136659280431156F, 0.0F, 0.31869712141416456F);
		tail08 = new ModelRenderer(this, 185, 33);
		tail08.setRotationPoint(0.0F, 0.5F, 5.1F);
		tail08.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
		lowerJaw1 = new ModelRenderer(this, 0, 107);
		lowerJaw1.setRotationPoint(0.0F, 1.6F, -2.9F);
		lowerJaw1.addBox(-2.5F, -0.7F, -5.1F, 5, 2, 5, 0.0F);
		setRotateAngle(lowerJaw1, 0.31869712141416456F, 0.0F, 0.0F);
		lCrest03a_1 = new ModelRenderer(this, 113, 71);
		lCrest03a_1.mirror = true;
		lCrest03a_1.setRotationPoint(-3.5F, -4.2F, 7.3F);
		lCrest03a_1.addBox(-2.0F, -0.1F, -2.8F, 4, 2, 7, 0.0F);
		setRotateAngle(lCrest03a_1, -0.045553093477052F, -0.27314402793711257F, 0.0F);
		rTailSpike03b = new ModelRenderer(this, 185, 2);
		rTailSpike03b.mirror = true;
		rTailSpike03b.setRotationPoint(-3.2F, 0.0F, 0.0F);
		rTailSpike03b.addBox(-1.6F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(rTailSpike03b, 0.0F, 0.136659280431156F, 0.0F);
		rArmSpike3b = new ModelRenderer(this, 185, 0);
		rArmSpike3b.mirror = true;
		rArmSpike3b.setRotationPoint(0.0F, 4.1F, 0.1F);
		rArmSpike3b.addBox(-0.4F, -0.5F, -0.6F, 1, 4, 1, 0.0F);
		setRotateAngle(rArmSpike3b, 0.18203784098300857F, 0.0F, 0.0F);
		spine02a = new ModelRenderer(this, 53, 75);
		spine02a.setRotationPoint(1.0F, 0.7F, 3.2F);
		spine02a.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 6, 0.0F);
		setRotateAngle(spine02a, 0.36425021489121656F, 0.0F, 0.0F);
		spine01b = new ModelRenderer(this, 72, 61);
		spine01b.setRotationPoint(0.0F, 0.1F, 7.1F);
		spine01b.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 5, 0.0F);
		setRotateAngle(spine01b, 0.27314402793711257F, 0.0F, 0.0F);
		lArmSpike2b = new ModelRenderer(this, 185, 0);
		lArmSpike2b.setRotationPoint(0.0F, 3.6F, -0.1F);
		lArmSpike2b.addBox(-1.0F, -0.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(lArmSpike2b, 0.18203784098300857F, 0.0F, 0.0F);
		rMandible1 = new ModelRenderer(this, 23, 83);
		rMandible1.mirror = true;
		rMandible1.setRotationPoint(-2.5F, 2.0F, -2.8F);
		rMandible1.addBox(-1.7F, -0.8F, -1.5F, 2, 5, 3, 0.0F);
		setRotateAngle(rMandible1, -0.27314402793711257F, 0.18203784098300857F, 0.18203784098300857F);
		lTailSpike02b = new ModelRenderer(this, 185, 2);
		lTailSpike02b.setRotationPoint(3.5F, 0.0F, 0.0F);
		lTailSpike02b.addBox(-0.1F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lTailSpike02b, 0.0F, -0.136659280431156F, 0.0F);
		lArmSpike3b = new ModelRenderer(this, 185, 0);
		lArmSpike3b.setRotationPoint(0.0F, 4.1F, 0.1F);
		lArmSpike3b.addBox(-0.4F, -0.5F, -0.6F, 1, 4, 1, 0.0F);
		setRotateAngle(lArmSpike3b, 0.18203784098300857F, 0.0F, 0.0F);
		rArmSpike2b = new ModelRenderer(this, 185, 0);
		rArmSpike2b.mirror = true;
		rArmSpike2b.setRotationPoint(0.0F, 3.6F, -0.1F);
		rArmSpike2b.addBox(-1.0F, -0.1F, -1.0F, 2, 4, 2, 0.0F);
		setRotateAngle(rArmSpike2b, 0.18203784098300857F, 0.0F, 0.0F);
		lArmSpike02b = new ModelRenderer(this, 185, 0);
		lArmSpike02b.setRotationPoint(0.0F, -1.0F, -0.3F);
		lArmSpike02b.addBox(-1.0F, -2.4F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmSpike02b, -0.136659280431156F, 0.0F, 0.0F);
		upperJaw = new ModelRenderer(this, 0, 84);
		upperJaw.setRotationPoint(0.0F, 0.0F, -3.8F);
		upperJaw.addBox(-2.5F, -1.1F, -4.4F, 5, 2, 4, 0.0F);
		spine02b = new ModelRenderer(this, 72, 77);
		spine02b.setRotationPoint(0.0F, 0.1F, 5.8F);
		spine02b.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 4, 0.0F);
		setRotateAngle(spine02b, 0.27314402793711257F, 0.0F, 0.0F);
		lMandible2 = new ModelRenderer(this, 22, 93);
		lMandible2.setRotationPoint(0.1F, 0.0F, 0.0F);
		lMandible2.addBox(0.3F, 2.9F, -6.9F, 1, 2, 8, 0.0F);
		lTailSpike01a = new ModelRenderer(this, 185, 2);
		lTailSpike01a.setRotationPoint(5.7F, 8.3F, 3.2F);
		lTailSpike01a.addBox(0.6F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(lTailSpike01a, 0.0F, 0.0F, 0.136659280431156F);
		tail04 = new ModelRenderer(this, 74, 29);
		tail04.setRotationPoint(0.0F, 0.5F, 6.0F);
		tail04.addBox(-5.0F, -3.5F, -0.0F, 10, 7, 5, 0.0F);
		lTailSpike03a = new ModelRenderer(this, 185, 2);
		lTailSpike03a.setRotationPoint(4.0F, 1.8F, 1.9F);
		lTailSpike03a.addBox(0.6F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(lTailSpike03a, 0.0F, 0.0F, 0.136659280431156F);
		lArmSpike04b = new ModelRenderer(this, 185, 0);
		lArmSpike04b.setRotationPoint(0.0F, -2.0F, 0.1F);
		lArmSpike04b.addBox(-0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lArmSpike04b, -0.22759093446006054F, 0.0F, 0.0F);
		rTailSpike02c = new ModelRenderer(this, 185, 2);
		rTailSpike02c.mirror = true;
		rTailSpike02c.setRotationPoint(-1.2F, 0.1F, 0.1F);
		rTailSpike02c.addBox(-2.2F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(rTailSpike02c, 0.0F, 0.136659280431156F, 0.0F);
		spine03a = new ModelRenderer(this, 53, 88);
		spine03a.setRotationPoint(1.0F, 4.0F, 2.7F);
		spine03a.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
		setRotateAngle(spine03a, 0.18203784098300857F, 0.0F, 0.0F);
		lTailSpike04b = new ModelRenderer(this, 185, 2);
		lTailSpike04b.setRotationPoint(3.5F, 0.0F, 0.0F);
		lTailSpike04b.addBox(-0.1F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lTailSpike04b, 0.0F, -0.136659280431156F, 0.0F);
		tail01 = new ModelRenderer(this, 87, 0);
		tail01.setRotationPoint(0.0F, 9.1F, 0.0F);
		tail01.addBox(-4.5F, 0.0F, -5.5F, 11, 11, 12, 0.0F);
		setRotateAngle(tail01, 0.22759093446006054F, 0.0F, 0.0F);
		shape125 = new ModelRenderer(this, 146, 47);
		shape125.setRotationPoint(0.0F, -1.4F, -0.2F);
		shape125.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 14, 0.0F);
		setRotateAngle(shape125, 0.045553093477052F, -0.045553093477052F, 0.7853981633974483F);
		lCrest03b = new ModelRenderer(this, 117, 84);
		lCrest03b.mirror = true;
		lCrest03b.setRotationPoint(-0.5F, 1.2F, 3.4F);
		lCrest03b.addBox(-1.5F, -0.9F, 0.0F, 3, 1, 4, 0.0F);
		setRotateAngle(lCrest03b, -0.045553093477052F, 0.27314402793711257F, 0.0F);
		lCrest04b = new ModelRenderer(this, 195, 84);
		lCrest04b.setRotationPoint(-0.5F, 1.0F, 3.4F);
		lCrest04b.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
		setRotateAngle(lCrest04b, -0.045553093477052F, -0.27314402793711257F, 0.0F);
		chest = new ModelRenderer(this, 0, 3);
		chest.setRotationPoint(-1.0F, 0.5F, -16.0F);
		chest.addBox(-5.0F, -6.7F, -6.0F, 12, 11, 10, 0.0F);
		setRotateAngle(chest, -0.18203784098300857F, 0.0F, 0.0F);
		spine03b = new ModelRenderer(this, 69, 91);
		spine03b.setRotationPoint(0.0F, 0.0F, 4.9F);
		spine03b.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		setRotateAngle(spine03b, 0.18203784098300857F, 0.0F, 0.0F);
		lTailSpike00a = new ModelRenderer(this, 185, 2);
		lTailSpike00a.setRotationPoint(5.6F, 4.0F, -2.1F);
		lTailSpike00a.addBox(0.6F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		setRotateAngle(lTailSpike00a, 0.22759093446006054F, 0.0F, 0.18203784098300857F);
		lArm1 = new ModelRenderer(this, 22, 51);
		lArm1.mirror = true;
		lArm1.setRotationPoint(0.0F, 4.8F, 0.0F);
		lArm1.addBox(-1.0F, -0.5F, -1.9F, 3, 10, 4, 0.0F);
		setRotateAngle(lArm1, -0.31869712141416456F, 0.0F, 0.0F);
		teethUpper = new ModelRenderer(this, 0, 92);
		teethUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
		teethUpper.addBox(-2.5F, 0.8F, -4.3F, 5, 1, 3, 0.0F);
		rTailSpike04b = new ModelRenderer(this, 185, 2);
		rTailSpike04b.mirror = true;
		rTailSpike04b.setRotationPoint(-3.2F, 0.0F, 0.0F);
		rTailSpike04b.addBox(-1.6F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(rTailSpike04b, 0.0F, 0.136659280431156F, 0.0F);
		head = new ModelRenderer(this, 0, 70);
		head.setRotationPoint(0.0F, -0.9F, -10.4F);
		head.addBox(-4.5F, -3.0F, -4.2F, 9, 4, 5, 0.0F);
		setRotateAngle(head, 0.5009094953223726F, 0.0F, 0.0F);
		lCrest03c_1 = new ModelRenderer(this, 195, 92);
		lCrest03c_1.setRotationPoint(0.5F, 0.1F, 3.4F);
		lCrest03c_1.addBox(-1.0F, -0.9F, 0.0F, 2, 1, 4, 0.0F);
		setRotateAngle(lCrest03c_1, -0.045553093477052F, -0.27314402793711257F, 0.0F);
		lTailSpike03b = new ModelRenderer(this, 185, 2);
		lTailSpike03b.setRotationPoint(3.5F, 0.0F, 0.0F);
		lTailSpike03b.addBox(-0.1F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lTailSpike03b, 0.0F, -0.136659280431156F, 0.0F);
		rArm1 = new ModelRenderer(this, 22, 51);
		rArm1.setRotationPoint(-0.5F, 4.8F, 0.0F);
		rArm1.addBox(-1.0F, -0.5F, -1.9F, 3, 10, 4, 0.0F);
		setRotateAngle(rArm1, -0.31869712141416456F, 0.0F, 0.0F);
		lTailSpike03c = new ModelRenderer(this, 185, 2);
		lTailSpike03c.setRotationPoint(1.7F, 0.1F, 0.1F);
		lTailSpike03c.addBox(-0.1F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lTailSpike03c, 0.0F, -0.136659280431156F, 0.0F);
		rArmSpike2c = new ModelRenderer(this, 185, 0);
		rArmSpike2c.mirror = true;
		rArmSpike2c.setRotationPoint(0.0F, 4.1F, 0.1F);
		rArmSpike2c.addBox(-0.4F, -0.5F, -0.6F, 1, 4, 1, 0.0F);
		setRotateAngle(rArmSpike2c, 0.18203784098300857F, 0.0F, 0.0F);
		tail06 = new ModelRenderer(this, 136, 31);
		tail06.setRotationPoint(0.0F, 0.5F, 6.0F);
		tail06.addBox(-3.5F, -2.5F, 0.0F, 7, 5, 5, 0.0F);
		lArmSpike01b = new ModelRenderer(this, 185, 0);
		lArmSpike01b.setRotationPoint(0.0F, -1.0F, -0.3F);
		lArmSpike01b.addBox(-1.0F, -2.4F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lArmSpike01b, -0.136659280431156F, 0.0F, 0.0F);
		rArmSpike1a = new ModelRenderer(this, 185, 0);
		rArmSpike1a.mirror = true;
		rArmSpike1a.setRotationPoint(0.0F, 1.8F, -2.3F);
		rArmSpike1a.addBox(-1.5F, -0.1F, -1.5F, 3, 6, 3, 0.0F);
		backArmour01 = new ModelRenderer(this, 139, 72);
		backArmour01.setRotationPoint(0.0F, -6.8F, 0.0F);
		backArmour01.addBox(-5.0F, -3.7F, -6.2F, 12, 5, 12, 0.0F);
		setRotateAngle(backArmour01, 0.36425021489121656F, 0.0F, 0.0F);
		lArmSpike1c = new ModelRenderer(this, 185, 0);
		lArmSpike1c.setRotationPoint(0.0F, 6.1F, 0.1F);
		lArmSpike1c.addBox(-0.4F, -0.5F, -0.6F, 1, 6, 1, 0.0F);
		setRotateAngle(lArmSpike1c, 0.18203784098300857F, 0.0F, 0.0F);
		stomach = new ModelRenderer(this, 48, 4);
		stomach.setRotationPoint(0.0F, 3.8F, 0.0F);
		stomach.addBox(-4.0F, 0.0F, -5.0F, 10, 11, 8, 0.0F);
		setRotateAngle(stomach, -0.045553093477052F, 0.0F, 0.0F);
		tailSpike01a = new ModelRenderer(this, 185, 0);
		tailSpike01a.setRotationPoint(0.0F, -4.6F, 1.0F);
		tailSpike01a.addBox(-1.5F, -2.0F, -1.5F, 3, 2, 3, 0.0F);
		setRotateAngle(tailSpike01a, -0.27314402793711257F, 0.0F, 0.0F);
		tail09 = new ModelRenderer(this, 204, 33);
		tail09.setRotationPoint(0.0F, 0.9F, 4.9F);
		tail09.addBox(-1.0F, -1.5F, 0.0F, 2, 2, 6, 0.0F);
		rTailSpike01b = new ModelRenderer(this, 185, 2);
		rTailSpike01b.mirror = true;
		rTailSpike01b.setRotationPoint(-3.2F, 0.0F, 0.0F);
		rTailSpike01b.addBox(-1.6F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(rTailSpike01b, 0.0F, 0.136659280431156F, 0.0F);
		lArmSpike1b = new ModelRenderer(this, 185, 0);
		lArmSpike1b.setRotationPoint(0.0F, 5.8F, -0.1F);
		lArmSpike1b.addBox(-1.0F, -0.1F, -1.0F, 2, 6, 2, 0.0F);
		setRotateAngle(lArmSpike1b, 0.18203784098300857F, 0.0F, 0.0F);
		lTailSpike00b = new ModelRenderer(this, 185, 2);
		lTailSpike00b.setRotationPoint(3.5F, 0.0F, 0.0F);
		lTailSpike00b.addBox(-0.1F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		setRotateAngle(lTailSpike00b, 0.0F, 0.0F, 0.18203784098300857F);
		lArm3 = new ModelRenderer(this, 66, 48);
		lArm3.setRotationPoint(0.0F, 0.0F, -10.0F);
		lArm3.addBox(-2.2F, -2.2F, -4.2F, 4, 4, 7, 0.0F);
		tail05 = new ModelRenderer(this, 105, 29);
		tail05.setRotationPoint(0.0F, 0.5F, 5.0F);
		tail05.addBox(-4.5F, -3.0F, 0.0F, 9, 6, 6, 0.0F);
		lTailSpike02c = new ModelRenderer(this, 185, 2);
		lTailSpike02c.setRotationPoint(1.7F, 0.1F, 0.1F);
		lTailSpike02c.addBox(-0.1F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(lTailSpike02c, 0.0F, -0.136659280431156F, 0.0F);
		lArmSpike1a = new ModelRenderer(this, 185, 0);
		lArmSpike1a.setRotationPoint(0.0F, 1.8F, -2.3F);
		lArmSpike1a.addBox(-1.5F, -0.1F, -1.5F, 3, 6, 3, 0.0F);
		tail03 = new ModelRenderer(this, 38, 28);
		tail03.setRotationPoint(-0.0F, 0.0F, 5.9F);
		tail03.addBox(-5.5F, -4.0F, -0.0F, 11, 8, 6, 0.0F);
		rTailSpike04c = new ModelRenderer(this, 185, 2);
		rTailSpike04c.mirror = true;
		rTailSpike04c.setRotationPoint(-1.2F, 0.1F, 0.1F);
		rTailSpike04c.addBox(-2.2F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(rTailSpike04c, 0.0F, 0.136659280431156F, 0.0F);
		rTailSpike00c = new ModelRenderer(this, 185, 2);
		rTailSpike00c.mirror = true;
		rTailSpike00c.setRotationPoint(-1.2F, 0.1F, 0.1F);
		rTailSpike00c.addBox(-2.2F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(rTailSpike00c, 0.0F, 0.0F, -0.18203784098300857F);
		rMandible2 = new ModelRenderer(this, 22, 93);
		rMandible2.mirror = true;
		rMandible2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rMandible2.addBox(-1.2F, 2.9F, -6.9F, 1, 2, 8, 0.0F);
		rTailSpike03c = new ModelRenderer(this, 185, 2);
		rTailSpike03c.mirror = true;
		rTailSpike03c.setRotationPoint(-1.2F, 0.1F, 0.1F);
		rTailSpike03c.addBox(-2.2F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		setRotateAngle(rTailSpike03c, 0.0F, 0.136659280431156F, 0.0F);
		lShoulder = new ModelRenderer(this, 0, 52);
		lShoulder.setRotationPoint(6.8F, -2.9F, 0.0F);
		lShoulder.addBox(-1.5F, -1.8F, -2.5F, 4, 7, 5, 0.0F);
		setRotateAngle(lShoulder, 0.136659280431156F, 0.0F, -0.31869712141416456F);
		tailSpike02a = new ModelRenderer(this, 185, 0);
		tailSpike02a.mirror = true;
		tailSpike02a.setRotationPoint(0.0F, -4.6F, 5.0F);
		tailSpike02a.addBox(-1.5F, -2.0F, -1.5F, 3, 2, 3, 0.0F);
		setRotateAngle(tailSpike02a, -0.27314402793711257F, 0.0F, 0.0F);
		lArmSpike01c = new ModelRenderer(this, 185, 0);
		lArmSpike01c.setRotationPoint(0.0F, -2.0F, 0.1F);
		lArmSpike01c.addBox(-0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lArmSpike01c, -0.22759093446006054F, 0.0F, 0.0F);
		rArmSpike1a.addChild(rArmSpike1b);
		tail02.addChild(lTailSpike02a);
		head.addChild(crest02);
		lArmSpike03b.addChild(lArmSpike03c);
		lCrest03b.addChild(lCrest03c);
		backArmour01.addChild(lCrest04a);
		tail07.addChild(lArmSpike08a);
		tail04.addChild(lTailSpike04a);
		lArmSpike07a.addChild(lArmSpike07b);
		lArm1.addChild(lArm2);
		lArmSpike05a.addChild(lArmSpike05b);
		lMandible1.addChild(lFangs);
		chest.addChild(spine01a);
		rCrest04a.addChild(rCrest04b);
		tail01.addChild(rTailSpike00a);
		lowerJaw1.addChild(teethLower);
		head.addChild(crest01);
		lCrest04b.addChild(lCrest04c);
		head.addChild(lMandible1);
		lArmSpike08a.addChild(lArmSpike08b);
		rArm3.addChild(rArmSpike2a);
		lTailSpike01b.addChild(lTailSpike01c);
		rTailSpike01b.addChild(rTailSpike01c);
		lTailSpike00b.addChild(lTailSpike00c);
		backArmour01.addChild(rCrest04a);
		tail06.addChild(tail07);
		tail06.addChild(lArmSpike06a);
		lCrest03a.addChild(lCrest03b_1);
		tail01.addChild(tail02);
		crest05a.addChild(crest05b);
		lArmSpike06a.addChild(lArmSpike06b);
		tail03.addChild(rTailSpike03a);
		tail02.addChild(rTailSpike02a);
		rArm2.addChild(rArmSpike3a);
		tailSpike03a.addChild(lArmSpike03b);
		rArmSpike1b.addChild(rArmSpike1c);
		rTailSpike00a.addChild(rTailSpike00b);
		tail07.addChild(lArmSpike07a);
		rArm1.addChild(rArm2);
		lArmSpike2b.addChild(lArmSpike2c);
		chest.addChild(neck);
		lTailSpike01a.addChild(lTailSpike01b);
		tail04.addChild(rTailSpike04a);
		rArm2.addChild(rArm3);
		lArmSpike02b.addChild(lArmSpike02c);
		lArm2.addChild(lArmSpike3a);
		backArmour01.addChild(crest05a);
		tail06.addChild(lArmSpike05a);
		lTailSpike04b.addChild(lTailSpike04c);
		tail03.addChild(lArmSpike04a);
		upperJaw.addChild(muzzle);
		tail01.addChild(rTailSpike01a);
		rCrest04b.addChild(rCrest04c);
		rTailSpike02a.addChild(rTailSpike02b);
		lArm3.addChild(lArmSpike2a);
		head.addChild(lCrest03a);
		rMandible1.addChild(rFangs);
		tail03.addChild(tailSpike03a);
		chest.addChild(rShoulder);
		tail07.addChild(tail08);
		head.addChild(lowerJaw1);
		crest02.addChild(lCrest03a_1);
		rTailSpike03a.addChild(rTailSpike03b);
		rArmSpike3a.addChild(rArmSpike3b);
		chest.addChild(spine02a);
		spine01a.addChild(spine01b);
		lArmSpike2a.addChild(lArmSpike2b);
		head.addChild(rMandible1);
		lTailSpike02a.addChild(lTailSpike02b);
		lArmSpike3a.addChild(lArmSpike3b);
		rArmSpike2a.addChild(rArmSpike2b);
		tailSpike02a.addChild(lArmSpike02b);
		head.addChild(upperJaw);
		spine02a.addChild(spine02b);
		lMandible1.addChild(lMandible2);
		tail01.addChild(lTailSpike01a);
		tail03.addChild(tail04);
		tail03.addChild(lTailSpike03a);
		lArmSpike04a.addChild(lArmSpike04b);
		rTailSpike02b.addChild(rTailSpike02c);
		chest.addChild(spine03a);
		lTailSpike04a.addChild(lTailSpike04b);
		stomach.addChild(tail01);
		crest01.addChild(shape125);
		lCrest03a_1.addChild(lCrest03b);
		lCrest04a.addChild(lCrest04b);
		spine03a.addChild(spine03b);
		tail01.addChild(lTailSpike00a);
		lShoulder.addChild(lArm1);
		upperJaw.addChild(teethUpper);
		rTailSpike04a.addChild(rTailSpike04b);
		neck.addChild(head);
		lCrest03b_1.addChild(lCrest03c_1);
		lTailSpike03a.addChild(lTailSpike03b);
		rShoulder.addChild(rArm1);
		lTailSpike03b.addChild(lTailSpike03c);
		rArmSpike2b.addChild(rArmSpike2c);
		tail05.addChild(tail06);
		tailSpike01a.addChild(lArmSpike01b);
		rArm3.addChild(rArmSpike1a);
		chest.addChild(backArmour01);
		lArmSpike1b.addChild(lArmSpike1c);
		chest.addChild(stomach);
		tail02.addChild(tailSpike01a);
		tail08.addChild(tail09);
		rTailSpike01a.addChild(rTailSpike01b);
		lArmSpike1a.addChild(lArmSpike1b);
		lTailSpike00a.addChild(lTailSpike00b);
		lArm2.addChild(lArm3);
		tail04.addChild(tail05);
		lTailSpike02b.addChild(lTailSpike02c);
		lArm3.addChild(lArmSpike1a);
		tail02.addChild(tail03);
		rTailSpike04b.addChild(rTailSpike04c);
		rTailSpike00b.addChild(rTailSpike00c);
		rMandible1.addChild(rMandible2);
		rTailSpike03b.addChild(rTailSpike03c);
		chest.addChild(lShoulder);
		tail02.addChild(tailSpike02a);
		lArmSpike01b.addChild(lArmSpike01c);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
		chest.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
		// super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks,
		// netHeadYaw, headPitch, scaleFactor, entityIn);
		head.rotateAngleX = par5 * 0.017453292F + 7.0F;
		head.rotateAngleY = par4 * 0.017453292F;
		neck.rotateAngleX = MathHelper.sin(par1 * 0.5F) * 0.167F * par2;
		tail02.rotateAngleY = MathHelper.sin(par1 * 0.5F) * 0.337F * par2;
		tail03.rotateAngleY = MathHelper.cos(par1 * 0.5F) * 0.337F * par2;
		tail04.rotateAngleY = MathHelper.sin(par1 * 0.5F) * 0.337F * par2;
		tail05.rotateAngleY = MathHelper.cos(par1 * 0.5F) * 0.337F * par2;
		tail06.rotateAngleY = MathHelper.sin(par1 * 0.5F) * 0.227F * par2;
		tail07.rotateAngleY = MathHelper.cos(par1 * 0.5F) * 0.227F * par2;
		tail08.rotateAngleY = MathHelper.sin(par1 * 0.5F) * 0.227F * par2;
		tail09.rotateAngleY = MathHelper.cos(par1 * 0.5F) * 0.227F * par2;
		lShoulder.rotateAngleX = MathHelper.sin(par1 * 0.5F) * 0.667F * par2;
		lArm1.rotateAngleX = MathHelper.cos(par1 * 0.5F) * 0.667F * par2;
		rShoulder.rotateAngleX = MathHelper.cos(par1 * 0.5F) * 0.667F * par2;
		rArm1.rotateAngleX = MathHelper.cos(par1 * 0.5F) * 0.667F * par2;
		lMandible1.rotateAngleX = MathHelper.cos(par1 * 0.1F) * 0.667F * par2;
		rMandible1.rotateAngleX = MathHelper.cos(par1 * 0.1F) * 0.667F * par2;
		lowerJaw1.rotateAngleX = MathHelper.sin(par1 * 0.01F) * 0.667F * par2 + 0.4F;
		// lowerJaw1.offsetZ = MathHelper.sin(par1);
	}

	@Override
	public void renderSkull(float scale) {
		head.render(scale);
	}
}