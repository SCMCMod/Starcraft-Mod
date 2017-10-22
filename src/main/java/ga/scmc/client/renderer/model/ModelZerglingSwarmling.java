package ga.scmc.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * zerglingSC2Swarmling - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelZerglingSwarmling extends ModelBase {

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
	public ModelRenderer membrane1;
	public ModelRenderer membrane2;
	public ModelRenderer membrane3;
	public ModelRenderer membrane4;
	public ModelRenderer membrane5;
	public ModelRenderer neck;
	public ModelRenderer quill1;
	public ModelRenderer quill1Spike;
	public ModelRenderer quill2;
	public ModelRenderer quill2Spike;
	public ModelRenderer quill3;
	public ModelRenderer quill3Spike;
	public ModelRenderer quill4;
	public ModelRenderer quill4Spike;
	public ModelRenderer quill5;
	public ModelRenderer quill5Spike;
	public ModelRenderer quill6;
	public ModelRenderer quill6Spike;
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
	public ModelRenderer tail1;
	public ModelRenderer tail2;
	public ModelRenderer tail3;
	public ModelRenderer tail4;
	public ModelRenderer teethLower;

	public ModelZerglingSwarmling() {
		textureWidth = 128;
		textureHeight = 64;
		rLeg1 = new ModelRenderer(this, 42, 15);
		rLeg1.mirror = true;
		rLeg1.setRotationPoint(0.0F, 6.0F, 1.0F);
		rLeg1.addBox(-1.2F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
		setRotateAngle(rLeg1, 0.8196066167365371F, -0.31869712141416456F, 0.0F);
		tail4 = new ModelRenderer(this, 16, 52);
		tail4.setRotationPoint(0.0F, 0.1F, 3.8F);
		tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		setRotateAngle(tail4, 0.22759093446006054F, 0.0F, 0.0F);
		rHookArmClaw1a = new ModelRenderer(this, 88, 0);
		rHookArmClaw1a.mirror = true;
		rHookArmClaw1a.setRotationPoint(0.0F, 1.0F, -1.5F);
		rHookArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(rHookArmClaw1a, 0.136659280431156F, 0.7853981633974483F, 0.136659280431156F);
		lHookArm1 = new ModelRenderer(this, 83, 10);
		lHookArm1.setRotationPoint(3.2F, -1.3F, -3.4F);
		lHookArm1.addBox(-0.5F, -7.5F, -0.6F, 1, 8, 1, 0.0F);
		setRotateAngle(lHookArm1, -0.40980330836826856F, 0.0F, 0.22759093446006054F);
		quill4Spike = new ModelRenderer(this, 89, 41);
		quill4Spike.setRotationPoint(0.0F, -9.9F, 2.1F);
		quill4Spike.addBox(0.0F, -2.9F, -1.0F, 0, 3, 2, 0.0F);
		setRotateAngle(quill4Spike, -0.136659280431156F, 0.0F, 0.0F);
		rHookArmClaw1b = new ModelRenderer(this, 88, 0);
		rHookArmClaw1b.mirror = true;
		rHookArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw1b.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		rShoulder = new ModelRenderer(this, 67, 0);
		rShoulder.mirror = true;
		rShoulder.setRotationPoint(-2.6F, -0.2F, -2.0F);
		rShoulder.addBox(-2.0F, -0.7F, -1.5F, 2, 3, 3, 0.0F);
		setRotateAngle(rShoulder, 0.091106186954104F, 0.0F, 0.5918411493512771F);
		tail2 = new ModelRenderer(this, 0, 42);
		tail2.setRotationPoint(0.0F, -0.3F, 5.0F);
		tail2.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 5, 0.0F);
		setRotateAngle(tail2, -0.091106186954104F, 0.0F, 0.0F);
		rArmClaw3b = new ModelRenderer(this, 88, 0);
		rArmClaw3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw3b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 1, 0.0F);
		lArmClaw4 = new ModelRenderer(this, 88, 0);
		lArmClaw4.setRotationPoint(0.0F, 0.1F, -1.6F);
		lArmClaw4.addBox(-0.5F, -0.5F, -1.8F, 1, 1, 2, 0.0F);
		setRotateAngle(lArmClaw4, 0.045553093477052F, 0.22759093446006054F, 0.091106186954104F);
		rHoof1a = new ModelRenderer(this, 88, 0);
		rHoof1a.mirror = true;
		rHoof1a.setRotationPoint(0.0F, 0.5F, -1.7F);
		rHoof1a.addBox(-0.6F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		setRotateAngle(rHoof1a, 0.22759093446006054F, 0.0F, 0.0F);
		rShoulderPlate = new ModelRenderer(this, 63, 25);
		rShoulderPlate.mirror = true;
		rShoulderPlate.setRotationPoint(-1.8F, -0.2F, -0.8F);
		rShoulderPlate.addBox(-0.5F, -0.9F, 0.0F, 1, 2, 5, 0.0F);
		setRotateAngle(rShoulderPlate, 0.6373942428283291F, -0.045553093477052F, -0.8196066167365371F);
		jawUpper = new ModelRenderer(this, 110, 15);
		jawUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
		jawUpper.addBox(-2.0F, -1.0F, -2.1F, 4, 2, 3, 0.0F);
		setRotateAngle(jawUpper, -0.27314402793711257F, 0.0F, 0.0F);
		rArm1 = new ModelRenderer(this, 70, 8);
		rArm1.mirror = true;
		rArm1.setRotationPoint(-0.8F, 1.9F, 0.0F);
		rArm1.addBox(-0.5F, -0.5F, -1.0F, 1, 4, 2, 0.0F);
		setRotateAngle(rArm1, 0.27314402793711257F, 0.0F, -0.136659280431156F);
		lArmClaw3b_1 = new ModelRenderer(this, 88, 0);
		lArmClaw3b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw3b_1.addBox(-0.8F, 0.0F, -1.7F, 1, 1, 1, 0.0F);
		membrane2 = new ModelRenderer(this, 80, 52);
		membrane2.setRotationPoint(0.0F, 0.0F, 0.0F);
		membrane2.addBox(0.0F, -5.7F, -1.7F, 0, 5, 4, 0.0F);
		setRotateAngle(membrane2, -0.18203784098300857F, 0.0F, 0.0F);
		rHookArmClaw4a = new ModelRenderer(this, 88, 1);
		rHookArmClaw4a.setRotationPoint(0.0F, 2.5F, 0.0F);
		rHookArmClaw4a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(rHookArmClaw4a, 0.136659280431156F, 0.0F, 0.136659280431156F);
		rHoof1d = new ModelRenderer(this, 88, 0);
		rHoof1d.mirror = true;
		rHoof1d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHoof1d.addBox(-0.2F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
		lHookArmClaw5 = new ModelRenderer(this, 88, 1);
		lHookArmClaw5.setRotationPoint(0.0F, 1.6F, 0.0F);
		lHookArmClaw5.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(lHookArmClaw5, 0.091106186954104F, 0.0F, 0.091106186954104F);
		quill1 = new ModelRenderer(this, 81, 42);
		quill1.setRotationPoint(0.0F, -2.3F, 0.0F);
		quill1.addBox(-0.5F, -7.0F, -3.5F, 1, 5, 1, 0.0F);
		setRotateAngle(quill1, 0.7740535232594852F, 0.0F, 0.0F);
		rArmClaw3a = new ModelRenderer(this, 88, 0);
		rArmClaw3a.setRotationPoint(0.0F, -0.1F, -1.1F);
		rArmClaw3a.addBox(-0.8F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		setRotateAngle(rArmClaw3a, 0.0F, -0.22759093446006054F, 0.0F);
		lHookArm3 = new ModelRenderer(this, 78, 31);
		lHookArm3.setRotationPoint(0.0F, 0.0F, -3.8F);
		lHookArm3.addBox(-1.5F, -1.5F, -4.7F, 3, 3, 5, 0.0F);
		setRotateAngle(lHookArm3, 0.27314402793711257F, 0.0F, 0.0F);
		rArmClaw1b = new ModelRenderer(this, 88, 0);
		rArmClaw1b.mirror = true;
		rArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw1b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		rHookArm2_1 = new ModelRenderer(this, 80, 22);
		rHookArm2_1.mirror = true;
		rHookArm2_1.setRotationPoint(0.0F, -6.7F, 0.0F);
		rHookArm2_1.addBox(-1.0F, -1.0F, -3.8F, 2, 2, 4, 0.0F);
		setRotateAngle(rHookArm2_1, -0.27314402793711257F, 0.0F, 0.0F);
		lHookArmClaw1b = new ModelRenderer(this, 88, 0);
		lHookArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw1b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		lTusk1 = new ModelRenderer(this, 31, 0);
		lTusk1.setRotationPoint(1.8F, 0.7F, 1.3F);
		lTusk1.addBox(-1.0F, -1.0F, -1.9F, 2, 2, 2, 0.0F);
		setRotateAngle(lTusk1, 0.31869712141416456F, -0.9105382707654417F, 0.0F);
		quill6 = new ModelRenderer(this, 81, 42);
		quill6.setRotationPoint(0.0F, 0.0F, 0.0F);
		quill6.addBox(-0.5F, 5.8F, -4.4F, 1, 7, 1, 0.0F);
		setRotateAngle(quill6, 1.1838568316277536F, 0.0F, 0.0F);
		rHookArmClaw3 = new ModelRenderer(this, 87, 0);
		rHookArmClaw3.mirror = true;
		rHookArmClaw3.setRotationPoint(0.0F, 0.0F, -3.5F);
		rHookArmClaw3.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(rHookArmClaw3, -0.31869712141416456F, 0.7853981633974483F, -0.31869712141416456F);
		lHoof1d = new ModelRenderer(this, 88, 0);
		lHoof1d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHoof1d.addBox(-0.2F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
		lHookArmClaw4a = new ModelRenderer(this, 88, 1);
		lHookArmClaw4a.setRotationPoint(0.0F, 2.5F, 0.0F);
		lHookArmClaw4a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(lHookArmClaw4a, 0.136659280431156F, 0.0F, 0.136659280431156F);
		membrane3 = new ModelRenderer(this, 91, 50);
		membrane3.setRotationPoint(0.0F, 0.0F, 0.0F);
		membrane3.addBox(0.0F, -6.1F, 0.5F, 0, 6, 6, 0.0F);
		setRotateAngle(membrane3, 0.22759093446006054F, 0.0F, 0.0F);
		neck = new ModelRenderer(this, 21, 40);
		neck.setRotationPoint(0.0F, 0.0F, -4.2F);
		neck.addBox(-2.5F, -2.0F, -2.6F, 5, 4, 3, 0.0F);
		setRotateAngle(neck, 0.22759093446006054F, 0.0F, 0.0F);
		rHookArm3 = new ModelRenderer(this, 78, 31);
		rHookArm3.mirror = true;
		rHookArm3.setRotationPoint(0.0F, 0.0F, -3.8F);
		rHookArm3.addBox(-1.5F, -1.5F, -4.7F, 3, 3, 5, 0.0F);
		setRotateAngle(rHookArm3, 0.27314402793711257F, 0.0F, 0.0F);
		rHookArm2 = new ModelRenderer(this, 80, 22);
		rHookArm2.setRotationPoint(0.0F, -6.7F, 0.0F);
		rHookArm2.addBox(-1.0F, -1.0F, -3.8F, 2, 2, 4, 0.0F);
		setRotateAngle(rHookArm2, -0.27314402793711257F, 0.0F, 0.0F);
		lLegPlate = new ModelRenderer(this, 57, 0);
		lLegPlate.setRotationPoint(0.9F, 0.0F, -0.5F);
		lLegPlate.addBox(-0.5F, -4.0F, -1.0F, 1, 4, 2, 0.0F);
		setRotateAngle(lLegPlate, -0.31869712141416456F, 0.0F, 0.31869712141416456F);
		lHoof1c = new ModelRenderer(this, 88, 0);
		lHoof1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHoof1c.addBox(-0.6F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
		rHookArmClaw4b_1 = new ModelRenderer(this, 88, 1);
		rHookArmClaw4b_1.mirror = true;
		rHookArmClaw4b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw4b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lHookArmClaw1b_2 = new ModelRenderer(this, 88, 0);
		lHookArmClaw1b_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw1b_2.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		quill5 = new ModelRenderer(this, 81, 42);
		quill5.setRotationPoint(0.0F, 0.0F, 0.0F);
		quill5.addBox(-0.5F, 2.8F, -3.0F, 1, 8, 1, 0.0F);
		setRotateAngle(quill5, 1.3658946726107624F, 0.0F, 0.0F);
		quill2 = new ModelRenderer(this, 81, 42);
		quill2.setRotationPoint(0.0F, 0.0F, 0.0F);
		quill2.addBox(-0.5F, -6.6F, -1.4F, 1, 6, 1, 0.0F);
		setRotateAngle(quill2, -0.4553564018453205F, 0.0F, 0.0F);
		lHookArmClaw4b_1 = new ModelRenderer(this, 88, 1);
		lHookArmClaw4b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw4b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lTusk2 = new ModelRenderer(this, 31, 0);
		lTusk2.setRotationPoint(0.0F, 0.0F, -1.8F);
		lTusk2.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
		setRotateAngle(lTusk2, 0.0F, 0.31869712141416456F, 0.0F);
		lHookArmClaw4b = new ModelRenderer(this, 89, 1);
		lHookArmClaw4b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw4b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		rArmClaw2 = new ModelRenderer(this, 88, 0);
		rArmClaw2.mirror = true;
		rArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
		rArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(rArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
		rHookArmClaw2 = new ModelRenderer(this, 88, 0);
		rHookArmClaw2.mirror = true;
		rHookArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
		rHookArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(rHookArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
		rArmClaw3c = new ModelRenderer(this, 88, 0);
		rArmClaw3c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw3c.addBox(-0.2F, 0.0F, -1.7F, 1, 1, 1, 0.0F);
		quill1Spike = new ModelRenderer(this, 89, 41);
		quill1Spike.setRotationPoint(0.0F, -6.4F, -2.9F);
		quill1Spike.addBox(0.0F, -2.9F, -1.0F, 0, 3, 2, 0.0F);
		setRotateAngle(quill1Spike, -0.40980330836826856F, 0.0F, 0.0F);
		quill3Spike = new ModelRenderer(this, 89, 41);
		quill3Spike.setRotationPoint(0.0F, -6.6F, -0.1F);
		quill3Spike.addBox(0.0F, -2.9F, -1.0F, 0, 3, 2, 0.0F);
		setRotateAngle(quill3Spike, -0.22759093446006054F, 0.0F, 0.0F);
		chest = new ModelRenderer(this, 0, 0);
		chest.setRotationPoint(0.0F, 16.2F, 0.0F);
		chest.addBox(-3.5F, -2.7F, -4.5F, 7, 6, 8, 0.0F);
		lHookArmClaw3 = new ModelRenderer(this, 87, 0);
		lHookArmClaw3.setRotationPoint(0.0F, 0.0F, -3.5F);
		lHookArmClaw3.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
		setRotateAngle(lHookArmClaw3, -0.31869712141416456F, 0.7853981633974483F, -0.136659280431156F);
		lHookArmClaw1c = new ModelRenderer(this, 88, 0);
		lHookArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lArmClaw1b_1 = new ModelRenderer(this, 88, 0);
		lArmClaw1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw1b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lHookArmClaw1a = new ModelRenderer(this, 88, 0);
		lHookArmClaw1a.setRotationPoint(0.0F, 1.0F, -1.5F);
		lHookArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(lHookArmClaw1a, 0.136659280431156F, 0.7853981633974483F, 0.136659280431156F);
		lHookArmClaw0 = new ModelRenderer(this, 88, 0);
		lHookArmClaw0.setRotationPoint(0.0F, 0.3F, -2.8F);
		lHookArmClaw0.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(lHookArmClaw0, 0.36425021489121656F, 0.7853981633974483F, 0.36425021489121656F);
		rHookArmClaw4b = new ModelRenderer(this, 89, 1);
		rHookArmClaw4b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw4b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		head1 = new ModelRenderer(this, 110, 0);
		head1.setRotationPoint(0.0F, -0.2F, -2.4F);
		head1.addBox(-2.5F, -2.1F, -0.7F, 5, 4, 2, 0.0F);
		quill3 = new ModelRenderer(this, 81, 42);
		quill3.setRotationPoint(0.0F, 0.0F, 0.0F);
		quill3.addBox(-0.5F, -7.3F, -0.6F, 1, 7, 1, 0.0F);
		setRotateAngle(quill3, -1.0471975511965976F, 0.0F, 0.0F);
		quill2Spike = new ModelRenderer(this, 89, 41);
		quill2Spike.setRotationPoint(0.0F, -6.4F, -1.0F);
		quill2Spike.addBox(0.0F, -2.9F, -1.0F, 0, 3, 2, 0.0F);
		setRotateAngle(quill2Spike, -0.31869712141416456F, 0.0F, 0.0F);
		lLegPlate_1 = new ModelRenderer(this, 57, 0);
		lLegPlate_1.mirror = true;
		lLegPlate_1.setRotationPoint(-0.9F, 0.0F, -0.5F);
		lLegPlate_1.addBox(-0.5F, -4.0F, -1.0F, 1, 4, 2, 0.0F);
		setRotateAngle(lLegPlate_1, -0.31869712141416456F, 0.0F, -0.31869712141416456F);
		rHoof1c = new ModelRenderer(this, 88, 0);
		rHoof1c.mirror = true;
		rHoof1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHoof1c.addBox(-0.6F, -0.2F, -1.7F, 1, 1, 2, 0.0F);
		lArmClaw3a = new ModelRenderer(this, 88, 0);
		lArmClaw3a.setRotationPoint(0.0F, -0.1F, -1.1F);
		lArmClaw3a.addBox(-0.8F, -0.7F, -1.7F, 1, 1, 1, 0.0F);
		setRotateAngle(lArmClaw3a, 0.0F, 0.22759093446006054F, 0.0F);
		rThigh = new ModelRenderer(this, 42, 0);
		rThigh.mirror = true;
		rThigh.setRotationPoint(-2.8F, -1.6F, 4.0F);
		rThigh.addBox(-1.5F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
		setRotateAngle(rThigh, -0.4553564018453205F, 0.136659280431156F, 0.40980330836826856F);
		lHookArmClaw4c = new ModelRenderer(this, 88, 1);
		lHookArmClaw4c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw4c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		teethLower = new ModelRenderer(this, 110, 23);
		teethLower.setRotationPoint(0.0F, 0.0F, 0.0F);
		teethLower.addBox(-2.0F, -1.3F, -2.9F, 4, 1, 3, 0.0F);
		lowerbody = new ModelRenderer(this, 0, 16);
		lowerbody.setRotationPoint(0.0F, -0.4F, 2.8F);
		lowerbody.addBox(-3.0F, -2.1F, 0.0F, 6, 4, 6, 0.0F);
		setRotateAngle(lowerbody, -0.18203784098300857F, 0.0F, 0.0F);
		tail3 = new ModelRenderer(this, 0, 52);
		tail3.setRotationPoint(0.0F, 0.2F, 4.3F);
		tail3.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
		setRotateAngle(tail3, 0.136659280431156F, 0.0F, 0.0F);
		lArmClaw2 = new ModelRenderer(this, 88, 0);
		lArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
		lArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(lArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
		lLeg2 = new ModelRenderer(this, 46, 23);
		lLeg2.setRotationPoint(0.0F, 0.0F, 4.4F);
		lLeg2.addBox(-0.5F, 0.0F, -1.2F, 1, 5, 2, 0.0F);
		setRotateAngle(lLeg2, -0.6829473363053812F, 0.0F, 0.40980330836826856F);
		lShoulderPlate = new ModelRenderer(this, 63, 25);
		lShoulderPlate.setRotationPoint(1.8F, -0.2F, -0.8F);
		lShoulderPlate.addBox(-0.5F, -0.9F, 0.0F, 1, 2, 5, 0.0F);
		setRotateAngle(lShoulderPlate, 0.6373942428283291F, 0.045553093477052F, 0.8196066167365371F);
		lArm2 = new ModelRenderer(this, 64, 16);
		lArm2.setRotationPoint(-0.5F, 3.4F, 0.0F);
		lArm2.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 5, 0.0F);
		setRotateAngle(lArm2, -0.136659280431156F, 0.0F, 0.4553564018453205F);
		rHookArm1 = new ModelRenderer(this, 83, 10);
		rHookArm1.mirror = true;
		rHookArm1.setRotationPoint(-3.2F, -1.3F, -3.4F);
		rHookArm1.addBox(-0.5F, -7.5F, -0.6F, 1, 8, 1, 0.0F);
		setRotateAngle(rHookArm1, -0.40980330836826856F, 0.0F, -0.22759093446006054F);
		lArmClaw1a = new ModelRenderer(this, 88, 0);
		lArmClaw1a.setRotationPoint(0.0F, 0.2F, -3.1F);
		lArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(lArmClaw1a, 0.4553564018453205F, 0.7853981633974483F, 0.31869712141416456F);
		rHookArmClaw0 = new ModelRenderer(this, 88, 0);
		rHookArmClaw0.mirror = true;
		rHookArmClaw0.setRotationPoint(0.0F, 0.3F, -2.8F);
		rHookArmClaw0.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(rHookArmClaw0, 0.36425021489121656F, 0.7853981633974483F, 0.36425021489121656F);
		lArmClaw1c = new ModelRenderer(this, 88, 0);
		lArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		rArmClaw3b_1 = new ModelRenderer(this, 88, 0);
		rArmClaw3b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw3b_1.addBox(-0.8F, 0.0F, -1.7F, 1, 1, 2, 0.0F);
		rHookArmClaw4c = new ModelRenderer(this, 88, 1);
		rHookArmClaw4c.mirror = true;
		rHookArmClaw4c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw4c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		rArmClaw4 = new ModelRenderer(this, 88, 0);
		rArmClaw4.setRotationPoint(0.0F, 0.1F, -1.6F);
		rArmClaw4.addBox(-0.5F, -0.5F, -1.8F, 1, 1, 2, 0.0F);
		setRotateAngle(rArmClaw4, 0.045553093477052F, -0.22759093446006054F, -0.091106186954104F);
		quill4 = new ModelRenderer(this, 81, 42);
		quill4.setRotationPoint(0.0F, 0.0F, 0.0F);
		quill4.addBox(-0.5F, -10.5F, 1.6F, 1, 9, 1, 0.0F);
		setRotateAngle(quill4, -1.3658946726107624F, 0.0F, 0.0F);
		lShoulder = new ModelRenderer(this, 67, 0);
		lShoulder.setRotationPoint(2.6F, -0.2F, -2.0F);
		lShoulder.addBox(0.0F, -0.7F, -1.5F, 2, 3, 3, 0.0F);
		setRotateAngle(lShoulder, 0.091106186954104F, 0.0F, -0.5918411493512771F);
		lArmClaw1b = new ModelRenderer(this, 88, 0);
		lArmClaw1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw1b.addBox(-0.2F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		lFoot = new ModelRenderer(this, 44, 33);
		lFoot.setRotationPoint(0.0F, 4.4F, -0.3F);
		lFoot.addBox(-1.0F, -0.3F, -2.3F, 2, 2, 3, 0.0F);
		setRotateAngle(lFoot, 0.40980330836826856F, 0.0F, 0.136659280431156F);
		tail1 = new ModelRenderer(this, 0, 30);
		tail1.setRotationPoint(0.0F, 0.0F, 5.1F);
		tail1.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 6, 0.0F);
		setRotateAngle(tail1, -0.22759093446006054F, 0.0F, 0.0F);
		rFoot = new ModelRenderer(this, 44, 33);
		rFoot.mirror = true;
		rFoot.setRotationPoint(0.0F, 4.4F, -0.3F);
		rFoot.addBox(-1.0F, -0.3F, -2.3F, 2, 2, 3, 0.0F);
		setRotateAngle(rFoot, 0.40980330836826856F, 0.0F, -0.136659280431156F);
		rTusk2 = new ModelRenderer(this, 31, 0);
		rTusk2.mirror = true;
		rTusk2.setRotationPoint(0.0F, 0.0F, -1.8F);
		rTusk2.addBox(-1.0F, -1.0F, -1.8F, 2, 2, 2, 0.0F);
		setRotateAngle(rTusk2, 0.0F, -0.31869712141416456F, 0.0F);
		rLeg2 = new ModelRenderer(this, 46, 23);
		rLeg2.mirror = true;
		rLeg2.setRotationPoint(0.0F, 0.0F, 4.4F);
		rLeg2.addBox(-0.5F, 0.0F, -1.2F, 1, 5, 2, 0.0F);
		setRotateAngle(rLeg2, -0.6829473363053812F, 0.0F, -0.40980330836826856F);
		lHoof1a = new ModelRenderer(this, 88, 0);
		lHoof1a.setRotationPoint(0.0F, 0.5F, -1.7F);
		lHoof1a.addBox(-0.6F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		setRotateAngle(lHoof1a, 0.22759093446006054F, 0.0F, 0.0F);
		lLeg1 = new ModelRenderer(this, 42, 15);
		lLeg1.setRotationPoint(0.0F, 6.0F, 1.0F);
		lLeg1.addBox(-1.2F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
		setRotateAngle(lLeg1, 0.8196066167365371F, 0.31869712141416456F, 0.0F);
		rArm2 = new ModelRenderer(this, 64, 16);
		rArm2.mirror = true;
		rArm2.setRotationPoint(0.5F, 3.4F, 0.0F);
		rArm2.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 5, 0.0F);
		setRotateAngle(rArm2, -0.136659280431156F, 0.0F, -0.4553564018453205F);
		rHoof2 = new ModelRenderer(this, 88, 0);
		rHoof2.mirror = true;
		rHoof2.setRotationPoint(0.1F, 0.0F, -1.5F);
		rHoof2.addBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
		setRotateAngle(rHoof2, 0.18203784098300857F, 0.0F, 0.0F);
		lHookArmClaw2 = new ModelRenderer(this, 88, 0);
		lHookArmClaw2.setRotationPoint(0.0F, 1.6F, 0.0F);
		lHookArmClaw2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotateAngle(lHookArmClaw2, 0.091106186954104F, 0.0F, 0.091106186954104F);
		rHoof1b = new ModelRenderer(this, 88, 0);
		rHoof1b.mirror = true;
		rHoof1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHoof1b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		lArmClaw3c = new ModelRenderer(this, 88, 0);
		lArmClaw3c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw3c.addBox(-0.2F, 0.0F, -1.7F, 1, 1, 2, 0.0F);
		quill6Spike = new ModelRenderer(this, 89, 41);
		quill6Spike.setRotationPoint(0.0F, 12.3F, -3.9F);
		quill6Spike.addBox(0.0F, -2.9F, -1.0F, 0, 3, 2, 0.0F);
		setRotateAngle(quill6Spike, -3.141592653589793F, 0.0F, 0.0F);
		lArm1 = new ModelRenderer(this, 70, 8);
		lArm1.setRotationPoint(0.8F, 1.9F, 0.0F);
		lArm1.addBox(-0.5F, -0.5F, -1.0F, 1, 4, 2, 0.0F);
		setRotateAngle(lArm1, 0.27314402793711257F, 0.0F, 0.136659280431156F);
		lArmClaw3b = new ModelRenderer(this, 88, 0);
		lArmClaw3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lArmClaw3b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		rHookArmClaw1c = new ModelRenderer(this, 88, 0);
		rHookArmClaw1c.mirror = true;
		rHookArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rHookArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		membrane4 = new ModelRenderer(this, 106, 52);
		membrane4.setRotationPoint(0.0F, 0.0F, 0.0F);
		membrane4.addBox(0.0F, -8.8F, 0.8F, 0, 7, 4, 0.0F);
		setRotateAngle(membrane4, -0.18203784098300857F, 0.0F, 0.0F);
		lThigh = new ModelRenderer(this, 42, 0);
		lThigh.setRotationPoint(2.8F, -1.6F, 4.0F);
		lThigh.addBox(-1.5F, -1.0F, -2.0F, 3, 8, 4, 0.0F);
		setRotateAngle(lThigh, -0.4553564018453205F, -0.136659280431156F, -0.40980330836826856F);
		lHookArmClaw1b_1 = new ModelRenderer(this, 88, 0);
		lHookArmClaw1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHookArmClaw1b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		rArmClaw1c = new ModelRenderer(this, 88, 0);
		rArmClaw1c.mirror = true;
		rArmClaw1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw1c.addBox(-0.2F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lowerJaw = new ModelRenderer(this, 110, 29);
		lowerJaw.setRotationPoint(0.0F, 1.8F, 0.7F);
		lowerJaw.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
		rTusk1 = new ModelRenderer(this, 31, 0);
		rTusk1.mirror = true;
		rTusk1.setRotationPoint(-1.8F, 0.7F, 1.3F);
		rTusk1.addBox(-1.0F, -1.0F, -1.9F, 2, 2, 2, 0.0F);
		setRotateAngle(rTusk1, 0.31869712141416456F, 0.9105382707654417F, 0.0F);
		quill5Spike = new ModelRenderer(this, 89, 41);
		quill5Spike.setRotationPoint(0.0F, 10.5F, -2.6F);
		quill5Spike.addBox(0.0F, -2.9F, -1.0F, 0, 3, 2, 0.0F);
		setRotateAngle(quill5Spike, -3.141592653589793F, 0.0F, 0.0F);
		rHookArmClaw5 = new ModelRenderer(this, 88, 1);
		rHookArmClaw5.mirror = true;
		rHookArmClaw5.setRotationPoint(0.0F, 1.6F, 0.0F);
		rHookArmClaw5.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
		setRotateAngle(rHookArmClaw5, 0.091106186954104F, 0.0F, 0.091106186954104F);
		head2 = new ModelRenderer(this, 112, 8);
		head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		head2.addBox(-2.0F, -2.0F, -1.1F, 4, 1, 1, 0.0F);
		setRotateAngle(head2, 0.31869712141416456F, 0.0F, 0.0F);
		lHoof2 = new ModelRenderer(this, 88, 0);
		lHoof2.setRotationPoint(0.1F, 0.0F, -1.5F);
		lHoof2.addBox(-0.5F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
		setRotateAngle(lHoof2, 0.18203784098300857F, 0.0F, 0.0F);
		membrane1 = new ModelRenderer(this, 70, 52);
		membrane1.setRotationPoint(0.0F, 0.0F, 0.0F);
		membrane1.addBox(0.0F, -5.9F, -2.6F, 0, 5, 4, 0.0F);
		rArmClaw1a = new ModelRenderer(this, 88, 0);
		rArmClaw1a.mirror = true;
		rArmClaw1a.setRotationPoint(0.0F, 0.2F, -3.1F);
		rArmClaw1a.addBox(-0.8F, 0.0F, -0.8F, 1, 2, 1, 0.0F);
		setRotateAngle(rArmClaw1a, 0.4553564018453205F, 0.7853981633974483F, 0.4553564018453205F);
		membrane5 = new ModelRenderer(this, 117, 53);
		membrane5.setRotationPoint(0.0F, 0.0F, 0.0F);
		membrane5.addBox(0.0F, 4.9F, -4.6F, 0, 5, 3, 0.0F);
		setRotateAngle(membrane5, -0.136659280431156F, 0.0F, 0.0F);
		rArmClaw1b_1 = new ModelRenderer(this, 88, 0);
		rArmClaw1b_1.mirror = true;
		rArmClaw1b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rArmClaw1b_1.addBox(-0.8F, 0.0F, -0.2F, 1, 2, 1, 0.0F);
		lHoof1b = new ModelRenderer(this, 88, 0);
		lHoof1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lHoof1b.addBox(-0.2F, -0.7F, -1.7F, 1, 1, 2, 0.0F);
		rThigh.addChild(rLeg1);
		tail3.addChild(tail4);
		rHookArm3.addChild(rHookArmClaw1a);
		chest.addChild(lHookArm1);
		quill4.addChild(quill4Spike);
		rHookArmClaw1a.addChild(rHookArmClaw1b);
		chest.addChild(rShoulder);
		tail1.addChild(tail2);
		rArmClaw3a.addChild(rArmClaw3b);
		lArmClaw3a.addChild(lArmClaw4);
		rFoot.addChild(rHoof1a);
		rShoulder.addChild(rShoulderPlate);
		head1.addChild(jawUpper);
		rShoulder.addChild(rArm1);
		lArmClaw3a.addChild(lArmClaw3b_1);
		quill2.addChild(membrane2);
		rHookArmClaw3.addChild(rHookArmClaw4a);
		rHoof1a.addChild(rHoof1d);
		lHookArmClaw4a.addChild(lHookArmClaw5);
		chest.addChild(quill1);
		rTusk2.addChild(rArmClaw3a);
		rHookArm2.addChild(lHookArm3);
		rArmClaw1a.addChild(rArmClaw1b);
		rHookArm1.addChild(rHookArm2_1);
		lHookArmClaw1a.addChild(lHookArmClaw1b);
		head1.addChild(lTusk1);
		quill1.addChild(quill6);
		rHookArm3.addChild(rHookArmClaw3);
		lHoof1a.addChild(lHoof1d);
		lHookArmClaw3.addChild(lHookArmClaw4a);
		quill3.addChild(membrane3);
		chest.addChild(neck);
		rHookArm2_1.addChild(rHookArm3);
		lHookArm1.addChild(rHookArm2);
		lThigh.addChild(lLegPlate);
		lHoof1a.addChild(lHoof1c);
		rHookArmClaw4a.addChild(rHookArmClaw4b_1);
		rHookArmClaw1a.addChild(lHookArmClaw1b_2);
		quill1.addChild(quill5);
		quill1.addChild(quill2);
		lHookArmClaw4a.addChild(lHookArmClaw4b_1);
		lTusk1.addChild(lTusk2);
		lHookArmClaw4a.addChild(lHookArmClaw4b);
		rArmClaw1a.addChild(rArmClaw2);
		rHookArmClaw1a.addChild(rHookArmClaw2);
		rArmClaw3a.addChild(rArmClaw3c);
		quill1.addChild(quill1Spike);
		quill3.addChild(quill3Spike);
		lHookArm3.addChild(lHookArmClaw3);
		lHookArmClaw1a.addChild(lHookArmClaw1c);
		lArmClaw1a.addChild(lArmClaw1b_1);
		lHookArm3.addChild(lHookArmClaw1a);
		rHookArm2.addChild(lHookArmClaw0);
		rHookArmClaw4a.addChild(rHookArmClaw4b);
		neck.addChild(head1);
		quill1.addChild(quill3);
		quill2.addChild(quill2Spike);
		rThigh.addChild(lLegPlate_1);
		rHoof1a.addChild(rHoof1c);
		lTusk2.addChild(lArmClaw3a);
		lowerbody.addChild(rThigh);
		lHookArmClaw4a.addChild(lHookArmClaw4c);
		lowerJaw.addChild(teethLower);
		chest.addChild(lowerbody);
		tail2.addChild(tail3);
		lArmClaw1a.addChild(lArmClaw2);
		lLeg1.addChild(lLeg2);
		lShoulder.addChild(lShoulderPlate);
		lArm1.addChild(lArm2);
		chest.addChild(rHookArm1);
		lArm2.addChild(lArmClaw1a);
		rHookArm2_1.addChild(rHookArmClaw0);
		lArmClaw1a.addChild(lArmClaw1c);
		rArmClaw3a.addChild(rArmClaw3b_1);
		rHookArmClaw4a.addChild(rHookArmClaw4c);
		rArmClaw3a.addChild(rArmClaw4);
		quill1.addChild(quill4);
		chest.addChild(lShoulder);
		lArmClaw1a.addChild(lArmClaw1b);
		lLeg2.addChild(lFoot);
		lowerbody.addChild(tail1);
		rLeg2.addChild(rFoot);
		rTusk1.addChild(rTusk2);
		rLeg1.addChild(rLeg2);
		lFoot.addChild(lHoof1a);
		lThigh.addChild(lLeg1);
		rArm1.addChild(rArm2);
		rHoof1a.addChild(rHoof2);
		lHookArmClaw1a.addChild(lHookArmClaw2);
		rHoof1a.addChild(rHoof1b);
		lArmClaw3a.addChild(lArmClaw3c);
		quill6.addChild(quill6Spike);
		lShoulder.addChild(lArm1);
		lArmClaw3a.addChild(lArmClaw3b);
		rHookArmClaw1a.addChild(rHookArmClaw1c);
		quill4.addChild(membrane4);
		lowerbody.addChild(lThigh);
		lHookArmClaw1a.addChild(lHookArmClaw1b_1);
		rArmClaw1a.addChild(rArmClaw1c);
		head1.addChild(lowerJaw);
		head1.addChild(rTusk1);
		quill5.addChild(quill5Spike);
		rHookArmClaw4a.addChild(rHookArmClaw5);
		head1.addChild(head2);
		lHoof1a.addChild(lHoof2);
		quill1.addChild(membrane1);
		rArm2.addChild(rArmClaw1a);
		quill5.addChild(membrane5);
		rArmClaw1a.addChild(rArmClaw1b_1);
		lHoof1a.addChild(lHoof1b);
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
		neck.rotateAngleX = par5 * 0.017453292F;
	    neck.rotateAngleY = par4 * 0.017453292F;
		lArm1.rotateAngleX = MathHelper.sin(par1 * 1.1F) * 0.667F * par2;
		lThigh.rotateAngleX = MathHelper.sin(par1 * 1.1F) * 0.667F * par2 - 0.5F;
		rArm1.rotateAngleX = MathHelper.cos(par1 * 1.1F) * 0.667F * par2;
		rThigh.rotateAngleX = MathHelper.cos(par1 * 1.1F) * 0.667F * par2 - 0.5F;
		lowerJaw.rotateAngleX = (MathHelper.sin(par1 * 0.01F) + 0.3F) * 0.667F * par2;
		lHookArm1.rotateAngleX = (MathHelper.cos(par1 * 0.5F) + 0.3F) * 0.337F * par2 + 5.7F;
		rHookArm1.rotateAngleX = (MathHelper.sin(par1 * 0.5F) + 0.3F) * 0.337F * par2 + 5.7F;
		tail2.rotateAngleY = (MathHelper.sin(par1 * -0.5F) / 10.1F) * 2.0F * par2;
		tail3.rotateAngleY = (MathHelper.sin(par1 * -0.5F) / 10.1F) * 2.0F * par2;
		tail4.rotateAngleY = (MathHelper.sin(par1 * -0.5F) / 10.1F) * 2.0F * par2;
	}
}
