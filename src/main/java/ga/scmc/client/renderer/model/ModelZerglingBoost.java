package ga.scmc.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * zerglingMetabolicBoost - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelZerglingBoost extends ModelBase {

	public ModelRenderer chest;
	public ModelRenderer head1;
	public ModelRenderer head2;
	public ModelRenderer jawUpper;
	public ModelRenderer lArm1;
	public ModelRenderer lArm2;
	public ModelRenderer lArmClaw1a;
	public ModelRenderer lArmClaw1b;
	public ModelRenderer lArmClaw1b_1;
	public ModelRenderer lArmClaw1c;
	public ModelRenderer lArmClaw2;
	public ModelRenderer lArmClaw3a;
	public ModelRenderer lArmClaw3b;
	public ModelRenderer lArmClaw3b_1;
	public ModelRenderer lArmClaw3c;
	public ModelRenderer lArmClaw4;
	public ModelRenderer lFoot;
	public ModelRenderer lHoof1a;
	public ModelRenderer lHoof1b;
	public ModelRenderer lHoof1c;
	public ModelRenderer lHoof1d;
	public ModelRenderer lHoof2;
	public ModelRenderer lHookArm1;
	public ModelRenderer lHookArm3;
	public ModelRenderer lHookArmClaw0;
	public ModelRenderer lHookArmClaw1a;
	public ModelRenderer lHookArmClaw1b;
	public ModelRenderer lHookArmClaw1b_1;
	public ModelRenderer lHookArmClaw1b_2;
	public ModelRenderer lHookArmClaw1c;
	public ModelRenderer lHookArmClaw2;
	public ModelRenderer lHookArmClaw3;
	public ModelRenderer lHookArmClaw4a;
	public ModelRenderer lHookArmClaw4b;
	public ModelRenderer lHookArmClaw4b_1;
	public ModelRenderer lHookArmClaw4c;
	public ModelRenderer lHookArmClaw5;
	public ModelRenderer lLeg1;
	public ModelRenderer lLeg2;
	public ModelRenderer lLegPlate;
	public ModelRenderer lLegPlate_1;
	public ModelRenderer lowerbody;
	public ModelRenderer lowerJaw;
	public ModelRenderer lShoulder;
	public ModelRenderer lShoulderPlate;
	public ModelRenderer lThigh;
	public ModelRenderer lTusk1;
	public ModelRenderer lTusk2;
	public ModelRenderer lWingCarapace1;
	public ModelRenderer lWingCarapace2;
	public ModelRenderer lWingMembrane1;
	public ModelRenderer lWingMembrane2;
	public ModelRenderer neck;
	public ModelRenderer rArm1;
	public ModelRenderer rArm2;
	public ModelRenderer rArmClaw1a;
	public ModelRenderer rArmClaw1b;
	public ModelRenderer rArmClaw1b_1;
	public ModelRenderer rArmClaw1c;
	public ModelRenderer rArmClaw2;
	public ModelRenderer rArmClaw3a;
	public ModelRenderer rArmClaw3b;
	public ModelRenderer rArmClaw3b_1;
	public ModelRenderer rArmClaw3c;
	public ModelRenderer rArmClaw4;
	public ModelRenderer rFoot;
	public ModelRenderer rHoof1a;
	public ModelRenderer rHoof1b;
	public ModelRenderer rHoof1c;
	public ModelRenderer rHoof1d;
	public ModelRenderer rHoof2;
	public ModelRenderer rHookArm1;
	public ModelRenderer rHookArm2;
	public ModelRenderer rHookArm2_1;
	public ModelRenderer rHookArm3;
	public ModelRenderer rHookArmClaw0;
	public ModelRenderer rHookArmClaw1a;
	public ModelRenderer rHookArmClaw1b;
	public ModelRenderer rHookArmClaw1c;
	public ModelRenderer rHookArmClaw2;
	public ModelRenderer rHookArmClaw3;
	public ModelRenderer rHookArmClaw4a;
	public ModelRenderer rHookArmClaw4b;
	public ModelRenderer rHookArmClaw4b_1;
	public ModelRenderer rHookArmClaw4c;
	public ModelRenderer rHookArmClaw5;
	public ModelRenderer rLeg1;
	public ModelRenderer rLeg2;
	public ModelRenderer rShoulder;
	public ModelRenderer rShoulderPlate;
	public ModelRenderer rThigh;
	public ModelRenderer rTusk1;
	public ModelRenderer rTusk2;
	public ModelRenderer rWingCarapace1;
	public ModelRenderer rWingCarapace2;
	public ModelRenderer rWingMembrane1;
	public ModelRenderer rWingMembrane2;
	public ModelRenderer tail1;
	public ModelRenderer tail2;
	public ModelRenderer tail3;
	public ModelRenderer tail4;
	public ModelRenderer teethLower;

	protected float[] undulationCycle = { 45F, -45F, -45F, 0F, 45F, 45F, 0F, -45F };

	public ModelZerglingBoost() {
		textureWidth = 128;
		textureHeight = 64;
		lArmClaw1a = new ModelRenderer(this, 88, 0);
		lArmClaw1a.setRotationPoint(0.0F, 0.2F, -3.1F);
		lArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(lArmClaw1a, 0.4553564018453205F, 0.7853981633974483F, 0.31869712141416456F);
		lHookArm3 = new ModelRenderer(this, 78, 31);
		lHookArm3.setRotationPoint(0.0F, 0.0F, -3.8F);
		lHookArm3.addBox(-1.5F, -1.5F, -4.7F, 3, 3, 5, 0.0F);
		setRotateAngle(lHookArm3, 0.27314402793711257F, 0.0F, 0.0F);
		rArmClaw3a = new ModelRenderer(this, 88, 0);
		rArmClaw3a.setRotationPoint(0.0F, -0.1F, -1.1F);
		rArmClaw3a.addBox(-0.8F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		setRotateAngle(rArmClaw3a, 0.0F, -0.22759093446006054F, 0.0F);
		rFoot = new ModelRenderer(this, 44, 33);
		rFoot.mirror = true;
		rFoot.setRotationPoint(0.0F, 4.4F, -0.3F);
		rFoot.addBox(-1.0F, -0.3F, -2.3F, 2, 2, 3, 0.0F);
		setRotateAngle(rFoot, 0.40980330836826856F, 0.0F, -0.136659280431156F);
		lArmClaw1b = new ModelRenderer(this, 88, 0);
		lArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw1b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		rArmClaw1a = new ModelRenderer(this, 88, 0);
		rArmClaw1a.mirror = true;
		rArmClaw1a.setRotationPoint(0.0F, 0.2F, -3.1F);
		rArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(rArmClaw1a, 0.4553564018453205F, 0.7853981633974483F, 0.4553564018453205F);
		lArmClaw2 = new ModelRenderer(this, 88, 0);
		lArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
		lArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(lArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
		rWingMembrane2 = new ModelRenderer(this, 69, 39);
		rWingMembrane2.mirror = true;
		rWingMembrane2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rWingMembrane2.addBox(0.0F, -9.5F, -0.3F, 0, 7, 4, 0.0F);
		rHoof1d = new ModelRenderer(this, 88, 0);
		rHoof1d.mirror = true;
		rHoof1d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHoof1d.addBox(-0.2F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
		rHookArmClaw0 = new ModelRenderer(this, 88, 0);
		rHookArmClaw0.mirror = true;
		rHookArmClaw0.setRotationPoint(0.0F, 0.3F, -2.8F);
		rHookArmClaw0.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(rHookArmClaw0, 0.36425021489121656F, 0.7853981633974483F, 0.36425021489121656F);
		lArmClaw3b_1 = new ModelRenderer(this, 88, 0);
		lArmClaw3b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw3b_1.addBox(-0.8F, 0.0F, -1.7F, 1, 1, 1, 0.0F);
		neck = new ModelRenderer(this, 21, 40);
		neck.setRotationPoint(0.0F, 0.0F, -4.2F);
		neck.addBox(-2.5F, -2.0F, -2.6F, 5, 4, 3, 0.0F);
		setRotateAngle(neck, 0.22759093446006054F, 0.0F, 0.0F);
		lArmClaw1b_1 = new ModelRenderer(this, 88, 0);
		lArmClaw1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw1b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lHoof1a = new ModelRenderer(this, 88, 0);
		lHoof1a.setRotationPoint(0.0F, 0.5F, -1.7F);
		lHoof1a.addBox(-0.6F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		setRotateAngle(lHoof1a, 0.22759093446006054F, 0.0F, 0.0F);
		lWingMembrane1 = new ModelRenderer(this, 54, 39);
		lWingMembrane1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lWingMembrane1.addBox(0.0F, -10.2F, -0.3F, 0, 10, 5, 0.0F);
		rHookArmClaw2 = new ModelRenderer(this, 88, 0);
		rHookArmClaw2.mirror = true;
		rHookArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
		rHookArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(rHookArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
		jawUpper = new ModelRenderer(this, 110, 15);
		jawUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
		jawUpper.addBox(-2.0F, -1.0F, -2.1F, 4, 2, 3, 0.0F);
		setRotateAngle(jawUpper, -0.27314402793711257F, 0.0F, 0.0F);
		rLeg1 = new ModelRenderer(this, 42, 15);
		rLeg1.mirror = true;
		rLeg1.setRotationPoint(0.0F, 6.0F, 1.0F);
		rLeg1.addBox(-1.2F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
		setRotateAngle(rLeg1, 0.8196066167365371F, -0.31869712141416456F, 0.0F);
		lowerJaw = new ModelRenderer(this, 110, 29);
		lowerJaw.setRotationPoint(0.0F, 1.8F, 0.7F);
		lowerJaw.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
		rShoulder = new ModelRenderer(this, 67, 0);
		rShoulder.mirror = true;
		rShoulder.setRotationPoint(-2.6F, -0.2F, -2.0F);
		rShoulder.addBox(-2.0F, -0.7F, -1.5F, 2, 3, 3, 0.0F);
		setRotateAngle(rShoulder, 0.091106186954104F, 0.0F, 0.5918411493512771F);
		rHookArmClaw4b = new ModelRenderer(this, 89, 1);
		rHookArmClaw4b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw4b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		lHoof2 = new ModelRenderer(this, 88, 0);
		lHoof2.setRotationPoint(0.1F, 0.0F, -1.5F);
		lHoof2.addBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
		setRotateAngle(lHoof2, 0.18203784098300857F, 0.0F, 0.0F);
		rHoof2 = new ModelRenderer(this, 88, 0);
		rHoof2.mirror = true;
		rHoof2.setRotationPoint(0.1F, 0.0F, -1.5F);
		rHoof2.addBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
		setRotateAngle(rHoof2, 0.18203784098300857F, 0.0F, 0.0F);
		rShoulderPlate = new ModelRenderer(this, 63, 25);
		rShoulderPlate.mirror = true;
		rShoulderPlate.setRotationPoint(-1.8F, -0.2F, -0.8F);
		rShoulderPlate.addBox(-0.5F, -0.9F, 0.0F, 1, 2, 5, 0.0F);
		setRotateAngle(rShoulderPlate, 0.6373942428283291F, -0.045553093477052F, -0.8196066167365371F);
		rHoof1b = new ModelRenderer(this, 88, 0);
		rHoof1b.mirror = true;
		rHoof1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHoof1b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		rHookArmClaw4a = new ModelRenderer(this, 88, 1);
		rHookArmClaw4a.setRotationPoint(0.0F, 2.5F, 0.0F);
		rHookArmClaw4a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(rHookArmClaw4a, 0.136659280431156F, 0.0F, 0.136659280431156F);
		lLegPlate_1 = new ModelRenderer(this, 57, 0);
		lLegPlate_1.mirror = true;
		lLegPlate_1.setRotationPoint(-0.9F, 0.0F, -0.5F);
		lLegPlate_1.addBox(-0.5F, -4.0F, -1.0F, 1, 4, 2, 0.0F);
		setRotateAngle(lLegPlate_1, -0.31869712141416456F, 0.0F, -0.31869712141416456F);
		tail3 = new ModelRenderer(this, 0, 52);
		tail3.setRotationPoint(0.0F, 0.2F, 4.3F);
		tail3.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
		setRotateAngle(tail3, 0.136659280431156F, 0.0F, 0.0F);
		lHookArmClaw4b = new ModelRenderer(this, 89, 1);
		lHookArmClaw4b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw4b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		lArm1 = new ModelRenderer(this, 70, 8);
		lArm1.setRotationPoint(0.8F, 1.9F, 0.0F);
		lArm1.addBox(-0.5F, -0.5F, -1.0F, 1, 4, 2, 0.0F);
		setRotateAngle(lArm1, 0.27314402793711257F, 0.0F, 0.136659280431156F);
		lArmClaw3a = new ModelRenderer(this, 88, 0);
		lArmClaw3a.setRotationPoint(0.0F, -0.1F, -1.1F);
		lArmClaw3a.addBox(-0.8F, -0.7F, -1.7F, 1, 1, 1, 0.0F);
		setRotateAngle(lArmClaw3a, 0.0F, 0.22759093446006054F, 0.0F);
		lHookArmClaw2 = new ModelRenderer(this, 88, 0);
		lHookArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
		lHookArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(lHookArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
		rTusk1 = new ModelRenderer(this, 31, 0);
		rTusk1.mirror = true;
		rTusk1.setRotationPoint(-1.8F, 0.7F, 1.3F);
		rTusk1.addBox(-1.0F, -1.0F, -1.9F, 2, 2, 2, 0.0F);
		setRotateAngle(rTusk1, 0.31869712141416456F, 0.9105382707654417F, 0.0F);
		lHookArmClaw4c = new ModelRenderer(this, 88, 1);
		lHookArmClaw4c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw4c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		rHoof1c = new ModelRenderer(this, 88, 0);
		rHoof1c.mirror = true;
		rHoof1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHoof1c.addBox(-0.6F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
		lArmClaw3c = new ModelRenderer(this, 88, 0);
		lArmClaw3c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw3c.addBox(-0.2F, 0.0F, -1.7F, 1, 1, 2, 0.0F);
		lThigh = new ModelRenderer(this, 42, 0);
		lThigh.setRotationPoint(2.8F, -1.6F, 4.0F);
		lThigh.addBox(-1.5F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
		setRotateAngle(lThigh, -0.4553564018453205F, -0.136659280431156F, -0.40980330836826856F);
		rArmClaw1b_1 = new ModelRenderer(this, 88, 0);
		rArmClaw1b_1.mirror = true;
		rArmClaw1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw1b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lHookArmClaw4a = new ModelRenderer(this, 88, 1);
		lHookArmClaw4a.setRotationPoint(0.0F, 2.5F, 0.0F);
		lHookArmClaw4a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(lHookArmClaw4a, 0.136659280431156F, 0.0F, 0.136659280431156F);
		tail1 = new ModelRenderer(this, 0, 30);
		tail1.setRotationPoint(0.0F, 0.0F, 5.1F);
		tail1.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 6, 0.0F);
		setRotateAngle(tail1, -0.22759093446006054F, 0.0F, 0.0F);
		rArmClaw3c = new ModelRenderer(this, 88, 0);
		rArmClaw3c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw3c.addBox(-0.2F, 0.0F, -1.7F, 1, 1, 1, 0.0F);
		lArmClaw4 = new ModelRenderer(this, 88, 0);
		lArmClaw4.setRotationPoint(0.0F, 0.1F, -1.6F);
		lArmClaw4.addBox(-0.5F, -0.5F, -1.8F, 1, 1, 2, 0.0F);
		setRotateAngle(lArmClaw4, 0.045553093477052F, 0.22759093446006054F, 0.091106186954104F);
		lHookArm1 = new ModelRenderer(this, 83, 10);
		lHookArm1.setRotationPoint(3.2F, -1.3F, -3.4F);
		lHookArm1.addBox(-0.5F, -7.5F, -0.6F, 1, 8, 1, 0.0F);
		setRotateAngle(lHookArm1, -0.40980330836826856F, 0.0F, 0.22759093446006054F);
		rHookArm2_1 = new ModelRenderer(this, 80, 22);
		rHookArm2_1.mirror = true;
		rHookArm2_1.setRotationPoint(0.0F, -6.7F, 0.0F);
		rHookArm2_1.addBox(-1.0F, -1.0F, -3.8F, 2, 2, 4, 0.0F);
		setRotateAngle(rHookArm2_1, -0.27314402793711257F, 0.0F, 0.0F);
		rHookArmClaw4c = new ModelRenderer(this, 88, 1);
		rHookArmClaw4c.mirror = true;
		rHookArmClaw4c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw4c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lArmClaw3b = new ModelRenderer(this, 88, 0);
		lArmClaw3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw3b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		rArmClaw1b = new ModelRenderer(this, 88, 0);
		rArmClaw1b.mirror = true;
		rArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw1b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		lTusk2 = new ModelRenderer(this, 31, 0);
		lTusk2.setRotationPoint(0.0F, 0.0F, -1.8F);
		lTusk2.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
		setRotateAngle(lTusk2, 0.0F, 0.31869712141416456F, 0.0F);
		rArmClaw1c = new ModelRenderer(this, 88, 0);
		rArmClaw1c.mirror = true;
		rArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lHookArmClaw1b_2 = new ModelRenderer(this, 88, 0);
		lHookArmClaw1b_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw1b_2.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		lHoof1c = new ModelRenderer(this, 88, 0);
		lHoof1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHoof1c.addBox(-0.6F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
		rTusk2 = new ModelRenderer(this, 31, 0);
		rTusk2.mirror = true;
		rTusk2.setRotationPoint(0.0F, 0.0F, -1.8F);
		rTusk2.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
		setRotateAngle(rTusk2, 0.0F, -0.31869712141416456F, 0.0F);
		chest = new ModelRenderer(this, 0, 0);
		chest.setRotationPoint(0.0F, 16.2F, 0.0F);
		chest.addBox(-3.5F, -2.7F, -4.5F, 7, 6, 8, 0.0F);
		rLeg2 = new ModelRenderer(this, 46, 23);
		rLeg2.mirror = true;
		rLeg2.setRotationPoint(0.0F, 0.0F, 4.4F);
		rLeg2.addBox(-0.5F, 0.0F, -1.2F, 1, 5, 2, 0.0F);
		setRotateAngle(rLeg2, -0.6829473363053812F, 0.0F, -0.40980330836826856F);
		lShoulderPlate = new ModelRenderer(this, 63, 25);
		lShoulderPlate.setRotationPoint(1.8F, -0.2F, -0.8F);
		lShoulderPlate.addBox(-0.5F, -0.9F, 0.0F, 1, 2, 5, 0.0F);
		setRotateAngle(lShoulderPlate, 0.6373942428283291F, 0.045553093477052F, 0.8196066167365371F);
		lLeg1 = new ModelRenderer(this, 42, 15);
		lLeg1.setRotationPoint(0.0F, 6.0F, 1.0F);
		lLeg1.addBox(-1.2F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
		setRotateAngle(lLeg1, 0.8196066167365371F, 0.31869712141416456F, 0.0F);
		lArmClaw1c = new ModelRenderer(this, 88, 0);
		lArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lHookArmClaw3 = new ModelRenderer(this, 87, 0);
		lHookArmClaw3.setRotationPoint(0.0F, 0.0F, -3.5F);
		lHookArmClaw3.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(lHookArmClaw3, -0.31869712141416456F, 0.7853981633974483F, -0.136659280431156F);
		rHoof1a = new ModelRenderer(this, 88, 0);
		rHoof1a.mirror = true;
		rHoof1a.setRotationPoint(0.0F, 0.5F, -1.7F);
		rHoof1a.addBox(-0.6F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		setRotateAngle(rHoof1a, 0.22759093446006054F, 0.0F, 0.0F);
		lHookArmClaw5 = new ModelRenderer(this, 88, 1);
		lHookArmClaw5.setRotationPoint(0.0F, 1.6F, 0.0F);
		lHookArmClaw5.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lHookArmClaw5, 0.091106186954104F, 0.0F, 0.091106186954104F);
		rWingCarapace1 = new ModelRenderer(this, 46, 45);
		rWingCarapace1.mirror = true;
		rWingCarapace1.setRotationPoint(-2.2F, 13.6F, 2.9F);
		rWingCarapace1.addBox(-0.5F, -10.4F, -0.5F, 1, 11, 1, 0.0F);
		setRotateAngle(rWingCarapace1, -0.8651597102135892F, 0.0F, -0.18203784098300857F);
		lHoof1b = new ModelRenderer(this, 88, 0);
		lHoof1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHoof1b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		lFoot = new ModelRenderer(this, 44, 33);
		lFoot.setRotationPoint(0.0F, 4.4F, -0.3F);
		lFoot.addBox(-1.0F, -0.3F, -2.3F, 2, 2, 3, 0.0F);
		setRotateAngle(lFoot, 0.40980330836826856F, 0.0F, 0.136659280431156F);
		rHookArmClaw3 = new ModelRenderer(this, 87, 0);
		rHookArmClaw3.mirror = true;
		rHookArmClaw3.setRotationPoint(0.0F, 0.0F, -3.5F);
		rHookArmClaw3.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(rHookArmClaw3, -0.31869712141416456F, 0.7853981633974483F, -0.31869712141416456F);
		rHookArmClaw1a = new ModelRenderer(this, 88, 0);
		rHookArmClaw1a.mirror = true;
		rHookArmClaw1a.setRotationPoint(0.0F, 1.0F, -1.5F);
		rHookArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(rHookArmClaw1a, 0.136659280431156F, 0.7853981633974483F, 0.136659280431156F);
		rHookArm1 = new ModelRenderer(this, 83, 10);
		rHookArm1.mirror = true;
		rHookArm1.setRotationPoint(-3.2F, -1.3F, -3.4F);
		rHookArm1.addBox(-0.5F, -7.5F, -0.6F, 1, 8, 1, 0.0F);
		setRotateAngle(rHookArm1, -0.40980330836826856F, 0.0F, -0.22759093446006054F);
		rHookArmClaw4b_1 = new ModelRenderer(this, 88, 1);
		rHookArmClaw4b_1.mirror = true;
		rHookArmClaw4b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw4b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		rThigh = new ModelRenderer(this, 42, 0);
		rThigh.mirror = true;
		rThigh.setRotationPoint(-2.8F, -1.6F, 4.0F);
		rThigh.addBox(-1.5F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
		setRotateAngle(rThigh, -0.4553564018453205F, 0.136659280431156F, 0.40980330836826856F);
		rHookArm3 = new ModelRenderer(this, 78, 31);
		rHookArm3.mirror = true;
		rHookArm3.setRotationPoint(0.0F, 0.0F, -3.8F);
		rHookArm3.addBox(-1.5F, -1.5F, -4.7F, 3, 3, 5, 0.0F);
		setRotateAngle(rHookArm3, 0.27314402793711257F, 0.0F, 0.0F);
		lHookArmClaw4b_1 = new ModelRenderer(this, 88, 1);
		lHookArmClaw4b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw4b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		rArm2 = new ModelRenderer(this, 64, 16);
		rArm2.mirror = true;
		rArm2.setRotationPoint(0.5F, 3.4F, 0.0F);
		rArm2.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 5, 0.0F);
		setRotateAngle(rArm2, -0.136659280431156F, 0.0F, -0.4553564018453205F);
		lShoulder = new ModelRenderer(this, 67, 0);
		lShoulder.setRotationPoint(2.6F, -0.2F, -2.0F);
		lShoulder.addBox(0.0F, -0.7F, -1.5F, 2, 3, 3, 0.0F);
		setRotateAngle(lShoulder, 0.091106186954104F, 0.0F, -0.5918411493512771F);
		rHookArmClaw1c = new ModelRenderer(this, 88, 0);
		rHookArmClaw1c.mirror = true;
		rHookArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lHookArmClaw1b = new ModelRenderer(this, 88, 0);
		lHookArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw1b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		rHookArm2 = new ModelRenderer(this, 80, 22);
		rHookArm2.setRotationPoint(0.0F, -6.7F, 0.0F);
		rHookArm2.addBox(-1.0F, -1.0F, -3.8F, 2, 2, 4, 0.0F);
		setRotateAngle(rHookArm2, -0.27314402793711257F, 0.0F, 0.0F);
		lHoof1d = new ModelRenderer(this, 88, 0);
		lHoof1d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHoof1d.addBox(-0.2F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
		lHookArmClaw1c = new ModelRenderer(this, 88, 0);
		lHookArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		rArmClaw4 = new ModelRenderer(this, 88, 0);
		rArmClaw4.setRotationPoint(0.0F, 0.1F, -1.6F);
		rArmClaw4.addBox(-0.5F, -0.5F, -1.8F, 1, 1, 2, 0.0F);
		setRotateAngle(rArmClaw4, 0.045553093477052F, -0.22759093446006054F, -0.091106186954104F);
		tail4 = new ModelRenderer(this, 16, 52);
		tail4.setRotationPoint(0.0F, 0.1F, 3.8F);
		tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		setRotateAngle(tail4, 0.22759093446006054F, 0.0F, 0.0F);
		lHookArmClaw1b_1 = new ModelRenderer(this, 88, 0);
		lHookArmClaw1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw1b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		tail2 = new ModelRenderer(this, 0, 42);
		tail2.setRotationPoint(0.0F, -0.3F, 5.0F);
		tail2.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 5, 0.0F);
		setRotateAngle(tail2, -0.091106186954104F, 0.0F, 0.0F);
		head2 = new ModelRenderer(this, 112, 8);
		head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		head2.addBox(-2.0F, -2.0F, -1.1F, 4, 1, 1, 0.0F);
		setRotateAngle(head2, 0.31869712141416456F, 0.0F, 0.0F);
		lWingCarapace1 = new ModelRenderer(this, 46, 45);
		lWingCarapace1.setRotationPoint(2.2F, 13.6F, 2.9F);
		lWingCarapace1.addBox(-0.5F, -10.4F, -0.5F, 1, 11, 1, 0.0F);
		setRotateAngle(lWingCarapace1, -0.8651597102135892F, 0.0F, 0.18203784098300857F);
		rArmClaw3b_1 = new ModelRenderer(this, 88, 0);
		rArmClaw3b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw3b_1.addBox(-0.8F, 0.0F, -1.7F, 1, 1, 2, 0.0F);
		rArm1 = new ModelRenderer(this, 70, 8);
		rArm1.mirror = true;
		rArm1.setRotationPoint(-0.8F, 1.9F, 0.0F);
		rArm1.addBox(-0.5F, -0.5F, -1.0F, 1, 4, 2, 0.0F);
		setRotateAngle(rArm1, 0.27314402793711257F, 0.0F, -0.136659280431156F);
		rHookArmClaw1b = new ModelRenderer(this, 88, 0);
		rHookArmClaw1b.mirror = true;
		rHookArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw1b.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lHookArmClaw1a = new ModelRenderer(this, 88, 0);
		lHookArmClaw1a.setRotationPoint(0.0F, 1.0F, -1.5F);
		lHookArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(lHookArmClaw1a, 0.136659280431156F, 0.7853981633974483F, 0.136659280431156F);
		lLeg2 = new ModelRenderer(this, 46, 23);
		lLeg2.setRotationPoint(0.0F, 0.0F, 4.4F);
		lLeg2.addBox(-0.5F, 0.0F, -1.2F, 1, 5, 2, 0.0F);
		setRotateAngle(lLeg2, -0.6829473363053812F, 0.0F, 0.40980330836826856F);
		lWingMembrane2 = new ModelRenderer(this, 69, 39);
		lWingMembrane2.setRotationPoint(0.0F, 0.0F, 0.0F);
		lWingMembrane2.addBox(0.0F, -9.5F, -0.3F, 0, 7, 4, 0.0F);
		lHookArmClaw0 = new ModelRenderer(this, 88, 0);
		lHookArmClaw0.setRotationPoint(0.0F, 0.3F, -2.8F);
		lHookArmClaw0.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(lHookArmClaw0, 0.36425021489121656F, 0.7853981633974483F, 0.36425021489121656F);
		lArm2 = new ModelRenderer(this, 64, 16);
		lArm2.setRotationPoint(-0.5F, 3.4F, 0.0F);
		lArm2.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 5, 0.0F);
		setRotateAngle(lArm2, -0.136659280431156F, 0.0F, 0.4553564018453205F);
		rArmClaw2 = new ModelRenderer(this, 88, 0);
		rArmClaw2.mirror = true;
		rArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
		rArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(rArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
		head1 = new ModelRenderer(this, 110, 0);
		head1.setRotationPoint(0.0F, -0.2F, -2.4F);
		head1.addBox(-2.5F, -2.1F, -0.7F, 5, 4, 2, 0.0F);
		rWingCarapace2 = new ModelRenderer(this, 46, 45);
		rWingCarapace2.mirror = true;
		rWingCarapace2.setRotationPoint(-0.5F, 0.9F, 2.4F);
		rWingCarapace2.addBox(-0.5F, -9.6F, -0.5F, 1, 10, 1, 0.0F);
		setRotateAngle(rWingCarapace2, -0.27314402793711257F, -0.091106186954104F, 0.0F);
		lTusk1 = new ModelRenderer(this, 31, 0);
		lTusk1.setRotationPoint(1.8F, 0.7F, 1.3F);
		lTusk1.addBox(-1.0F, -1.0F, -1.9F, 2, 2, 2, 0.0F);
		setRotateAngle(lTusk1, 0.31869712141416456F, -0.9105382707654417F, 0.0F);
		rArmClaw3b = new ModelRenderer(this, 88, 0);
		rArmClaw3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw3b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 1, 0.0F);
		lWingCarapace2 = new ModelRenderer(this, 46, 45);
		lWingCarapace2.setRotationPoint(0.5F, 0.9F, 2.4F);
		lWingCarapace2.addBox(-0.5F, -9.6F, -0.5F, 1, 10, 1, 0.0F);
		setRotateAngle(lWingCarapace2, -0.27314402793711257F, 0.091106186954104F, 0.0F);
		teethLower = new ModelRenderer(this, 110, 23);
		teethLower.setRotationPoint(0.0F, 0.0F, 0.0F);
		teethLower.addBox(-2.0F, -1.3F, -2.9F, 4, 1, 3, 0.0F);
		lowerbody = new ModelRenderer(this, 0, 16);
		lowerbody.setRotationPoint(0.0F, -0.4F, 2.8F);
		lowerbody.addBox(-3.0F, -2.1F, 0.0F, 6, 4, 6, 0.0F);
		setRotateAngle(lowerbody, -0.18203784098300857F, 0.0F, 0.0F);
		lLegPlate = new ModelRenderer(this, 57, 0);
		lLegPlate.setRotationPoint(0.9F, 0.0F, -0.5F);
		lLegPlate.addBox(-0.5F, -4.0F, -1.0F, 1, 4, 2, 0.0F);
		setRotateAngle(lLegPlate, -0.31869712141416456F, 0.0F, 0.31869712141416456F);
		rHookArmClaw5 = new ModelRenderer(this, 88, 1);
		rHookArmClaw5.mirror = true;
		rHookArmClaw5.setRotationPoint(0.0F, 1.6F, 0.0F);
		rHookArmClaw5.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rHookArmClaw5, 0.091106186954104F, 0.0F, 0.091106186954104F);
		rWingMembrane1 = new ModelRenderer(this, 54, 39);
		rWingMembrane1.mirror = true;
		rWingMembrane1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rWingMembrane1.addBox(0.0F, -10.2F, -0.3F, 0, 10, 5, 0.0F);
		lArm2.addChild(lArmClaw1a);
		rHookArm2.addChild(lHookArm3);
		rTusk2.addChild(rArmClaw3a);
		rLeg2.addChild(rFoot);
		lArmClaw1a.addChild(lArmClaw1b);
		rArm2.addChild(rArmClaw1a);
		lArmClaw1a.addChild(lArmClaw2);
		rWingCarapace2.addChild(rWingMembrane2);
		rHoof1a.addChild(rHoof1d);
		rHookArm2_1.addChild(rHookArmClaw0);
		lArmClaw3a.addChild(lArmClaw3b_1);
		chest.addChild(neck);
		lArmClaw1a.addChild(lArmClaw1b_1);
		lFoot.addChild(lHoof1a);
		lWingCarapace1.addChild(lWingMembrane1);
		rHookArmClaw1a.addChild(rHookArmClaw2);
		head1.addChild(jawUpper);
		rThigh.addChild(rLeg1);
		head1.addChild(lowerJaw);
		chest.addChild(rShoulder);
		rHookArmClaw4a.addChild(rHookArmClaw4b);
		lHoof1a.addChild(lHoof2);
		rHoof1a.addChild(rHoof2);
		rShoulder.addChild(rShoulderPlate);
		rHoof1a.addChild(rHoof1b);
		rHookArmClaw3.addChild(rHookArmClaw4a);
		rThigh.addChild(lLegPlate_1);
		tail2.addChild(tail3);
		lHookArmClaw4a.addChild(lHookArmClaw4b);
		lShoulder.addChild(lArm1);
		lTusk2.addChild(lArmClaw3a);
		lHookArmClaw1a.addChild(lHookArmClaw2);
		head1.addChild(rTusk1);
		lHookArmClaw4a.addChild(lHookArmClaw4c);
		rHoof1a.addChild(rHoof1c);
		lArmClaw3a.addChild(lArmClaw3c);
		lowerbody.addChild(lThigh);
		rArmClaw1a.addChild(rArmClaw1b_1);
		lHookArmClaw3.addChild(lHookArmClaw4a);
		lowerbody.addChild(tail1);
		rArmClaw3a.addChild(rArmClaw3c);
		lArmClaw3a.addChild(lArmClaw4);
		chest.addChild(lHookArm1);
		rHookArm1.addChild(rHookArm2_1);
		rHookArmClaw4a.addChild(rHookArmClaw4c);
		lArmClaw3a.addChild(lArmClaw3b);
		rArmClaw1a.addChild(rArmClaw1b);
		lTusk1.addChild(lTusk2);
		rArmClaw1a.addChild(rArmClaw1c);
		rHookArmClaw1a.addChild(lHookArmClaw1b_2);
		lHoof1a.addChild(lHoof1c);
		rTusk1.addChild(rTusk2);
		rLeg1.addChild(rLeg2);
		lShoulder.addChild(lShoulderPlate);
		lThigh.addChild(lLeg1);
		lArmClaw1a.addChild(lArmClaw1c);
		lHookArm3.addChild(lHookArmClaw3);
		rFoot.addChild(rHoof1a);
		lHookArmClaw4a.addChild(lHookArmClaw5);
		lHoof1a.addChild(lHoof1b);
		lLeg2.addChild(lFoot);
		rHookArm3.addChild(rHookArmClaw3);
		rHookArm3.addChild(rHookArmClaw1a);
		chest.addChild(rHookArm1);
		rHookArmClaw4a.addChild(rHookArmClaw4b_1);
		lowerbody.addChild(rThigh);
		rHookArm2_1.addChild(rHookArm3);
		lHookArmClaw4a.addChild(lHookArmClaw4b_1);
		rArm1.addChild(rArm2);
		chest.addChild(lShoulder);
		rHookArmClaw1a.addChild(rHookArmClaw1c);
		lHookArmClaw1a.addChild(lHookArmClaw1b);
		lHookArm1.addChild(rHookArm2);
		lHoof1a.addChild(lHoof1d);
		lHookArmClaw1a.addChild(lHookArmClaw1c);
		rArmClaw3a.addChild(rArmClaw4);
		tail3.addChild(tail4);
		lHookArmClaw1a.addChild(lHookArmClaw1b_1);
		tail1.addChild(tail2);
		head1.addChild(head2);
		rArmClaw3a.addChild(rArmClaw3b_1);
		rShoulder.addChild(rArm1);
		rHookArmClaw1a.addChild(rHookArmClaw1b);
		lHookArm3.addChild(lHookArmClaw1a);
		lLeg1.addChild(lLeg2);
		lWingCarapace2.addChild(lWingMembrane2);
		rHookArm2.addChild(lHookArmClaw0);
		lArm1.addChild(lArm2);
		rArmClaw1a.addChild(rArmClaw2);
		neck.addChild(head1);
		rWingCarapace1.addChild(rWingCarapace2);
		head1.addChild(lTusk1);
		rArmClaw3a.addChild(rArmClaw3b);
		lWingCarapace1.addChild(lWingCarapace2);
		lowerJaw.addChild(teethLower);
		chest.addChild(lowerbody);
		lThigh.addChild(lLegPlate);
		rHookArmClaw4a.addChild(rHookArmClaw5);
		rWingCarapace1.addChild(rWingMembrane1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
		chest.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(rWingCarapace1.offsetX, rWingCarapace1.offsetY, rWingCarapace1.offsetZ);
		GlStateManager.translate(rWingCarapace1.rotationPointX * f5, rWingCarapace1.rotationPointY * f5, rWingCarapace1.rotationPointZ * f5);
		GlStateManager.scale(1.3D, 1.3D, 1.3D);
		GlStateManager.translate(-rWingCarapace1.offsetX, -rWingCarapace1.offsetY, -rWingCarapace1.offsetZ);
		GlStateManager.translate(-rWingCarapace1.rotationPointX * f5, -rWingCarapace1.rotationPointY * f5, -rWingCarapace1.rotationPointZ * f5);
		rWingCarapace1.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(lWingCarapace1.offsetX, lWingCarapace1.offsetY, lWingCarapace1.offsetZ);
		GlStateManager.translate(lWingCarapace1.rotationPointX * f5, lWingCarapace1.rotationPointY * f5, lWingCarapace1.rotationPointZ * f5);
		GlStateManager.scale(1.3D, 1.3D, 1.3D);
		GlStateManager.translate(-lWingCarapace1.offsetX, -lWingCarapace1.offsetY, -lWingCarapace1.offsetZ);
		GlStateManager.translate(-lWingCarapace1.rotationPointX * f5, -lWingCarapace1.rotationPointY * f5, -lWingCarapace1.rotationPointZ * f5);
		lWingCarapace1.render(f5);
		GlStateManager.popMatrix();
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
		neck.rotateAngleX = par5 * 0.017453292F;
	    neck.rotateAngleY = par4 * 0.017453292F;
		lArm1.rotateAngleX = MathHelper.sin(par1 * 1.1F) * 0.667F * par2;
		lThigh.rotateAngleX = MathHelper.sin(par1 * 1.1F) * 0.667F * par2 - 0.5F;
		rArm1.rotateAngleX = MathHelper.cos(par1 * 1.1F) * 0.667F * par2;
		rThigh.rotateAngleX = MathHelper.cos(par1 * 1.1F) * 0.667F * par2 - 0.5F;
		lowerJaw.rotateAngleX = (MathHelper.sin(par1 * 0.01F) + 0.3F) * 0.667F * par2;
		lHookArm1.rotateAngleX = (MathHelper.cos(par1 * 0.5F) + 0.3F) * 0.337F * par2 + 5.7F;
		rHookArm1.rotateAngleX = (MathHelper.sin(par1 * 0.5F) + 0.3F) * 0.337F * par2 + 5.7F;
		lWingCarapace1.rotateAngleY = (MathHelper.sin(par1 * 0.5F) / 4.1F) * 2.0F * par2;
		rWingCarapace1.rotateAngleY = (MathHelper.sin(par1 * -0.5F) / 4.1F) * 2.0F * par2;
		tail2.rotateAngleY = (MathHelper.sin(par1 * -0.5F) / 10.1F) * 2.0F * par2;
		tail3.rotateAngleY = (MathHelper.sin(par1 * -0.5F) / 10.1F) * 2.0F * par2;
		tail4.rotateAngleY = (MathHelper.sin(par1 * -0.5F) / 10.1F) * 2.0F * par2;
	}
}
