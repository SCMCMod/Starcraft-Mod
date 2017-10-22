package ga.scmc.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * infestedterran - XJustaguyX
 * Created using Tabula 5.1.0
 */
public class ModelInfestedCivilian extends ModelBase {
    public ModelRenderer chest;
    public ModelRenderer ribs;
    public ModelRenderer rSpike1;
    public ModelRenderer rSpike2;
    public ModelRenderer lSpike;
    public ModelRenderer lShoulder;
    public ModelRenderer shoulder_right;
    public ModelRenderer neck;
    public ModelRenderer lTentacle01;
    public ModelRenderer rTentacle01;
    public ModelRenderer stomach;
    public ModelRenderer lHip;
    public ModelRenderer rHip;
    public ModelRenderer lThigh;
    public ModelRenderer rThigh;
    public ModelRenderer lKnee;
    public ModelRenderer lShin;
    public ModelRenderer lFoot;
    public ModelRenderer lToe2;
    public ModelRenderer lToe1;
    public ModelRenderer lToeClaw2;
    public ModelRenderer lToeClaw1;
    public ModelRenderer rKnee;
    public ModelRenderer rShin;
    public ModelRenderer rFoot;
    public ModelRenderer rToe1;
    public ModelRenderer rToe2;
    public ModelRenderer finger21_right;
    public ModelRenderer rToeClaw2;
    public ModelRenderer lArmUpper;
    public ModelRenderer lArmLower;
    public ModelRenderer hand_left;
    public ModelRenderer lFinger3;
    public ModelRenderer lFinger1A;
    public ModelRenderer lFinger2A;
    public ModelRenderer lClaw3;
    public ModelRenderer lClaw1A;
    public ModelRenderer lFinger1B;
    public ModelRenderer lClaw1B;
    public ModelRenderer lFinger2B;
    public ModelRenderer lClaw2A;
    public ModelRenderer lClaw2B;
    public ModelRenderer arm_upper_right;
    public ModelRenderer arm_lower_right;
    public ModelRenderer hand_right;
    public ModelRenderer rFinger2A;
    public ModelRenderer rFinger3;
    public ModelRenderer rFinger1A;
    public ModelRenderer rClaw2A;
    public ModelRenderer rFinger2B;
    public ModelRenderer rClaw2B;
    public ModelRenderer finger31;
    public ModelRenderer rClaw1A;
    public ModelRenderer rFinger1B;
    public ModelRenderer rClaw1B;
    public ModelRenderer head;
    public ModelRenderer lFaceTentacle1;
    public ModelRenderer rFaceTentacle1;
    public ModelRenderer faceTumor01;
    public ModelRenderer lFaceTentacle2;
    public ModelRenderer lFaceTentacle3;
    public ModelRenderer lFaceTentacle4;
    public ModelRenderer lFaceTentacle5;
    public ModelRenderer rFaceTentacle2;
    public ModelRenderer rFaceTentacle3;
    public ModelRenderer rFaceTentacle4;
    public ModelRenderer rFaceTentacle5;
    public ModelRenderer rFaceTentacle6;
    public ModelRenderer faceTumor02;
    public ModelRenderer faceTumor04;
    public ModelRenderer faceTumor05;
    public ModelRenderer faceTumor06;
    public ModelRenderer faceTumor03;
    public ModelRenderer faceTumor07;
    public ModelRenderer faceTumor08;
    public ModelRenderer faceTumor09;
    public ModelRenderer faceTumor10;
    public ModelRenderer lTentacle02;
    public ModelRenderer lUpperTentacle01;
    public ModelRenderer lTentacle03;
    public ModelRenderer lTentacle04;
    public ModelRenderer lTentacle05;
    public ModelRenderer lTentacle06;
    public ModelRenderer lSpike01;
    public ModelRenderer lSpike02;
    public ModelRenderer lSpike03;
    public ModelRenderer lUpperTentacle02;
    public ModelRenderer lUpperTentacle03;
    public ModelRenderer lUpperTentacle04;
    public ModelRenderer lUpperTentacle05;
    public ModelRenderer lUpperSpike01;
    public ModelRenderer lUpperSpike02;
    public ModelRenderer lUpperSpike03;
    public ModelRenderer rUpperTentacle01;
    public ModelRenderer rTentacle02;
    public ModelRenderer rUpperTentacle02;
    public ModelRenderer rUpperTentacle03;
    public ModelRenderer rUpperTentacle04;
    public ModelRenderer rTentacle05;
    public ModelRenderer rUpperSpike01;
    public ModelRenderer rUpperSpike02;
    public ModelRenderer rUpperSpike03;
    public ModelRenderer rTentacle03;
    public ModelRenderer rTentacle04;
    public ModelRenderer rTentacle05_1;
    public ModelRenderer rTentacle06;
    public ModelRenderer rSpike01;
    public ModelRenderer rSpike02;
    public ModelRenderer rSpike03;

    public ModelInfestedCivilian() {
        textureWidth = 150;
        textureHeight = 75;
        rUpperTentacle03 = new ModelRenderer(this, 60, 39);
        rUpperTentacle03.mirror = true;
        rUpperTentacle03.setRotationPoint(0.0F, -3.5F, 0.0F);
        rUpperTentacle03.addBox(-1.5F, -4.0F, -1.5F, 3, 4, 3, 0.0F);
        setRotateAngle(rUpperTentacle03, 0.2617993877991494F, 0.0F, 0.0F);
        rTentacle03 = new ModelRenderer(this, 60, 39);
        rTentacle03.mirror = true;
        rTentacle03.setRotationPoint(0.0F, -3.4F, 0.0F);
        rTentacle03.addBox(-1.5F, -4.0F, -1.5F, 3, 4, 3, 0.0F);
        setRotateAngle(rTentacle03, 0.3490658503988659F, 0.0F, 0.0F);
        lUpperTentacle03 = new ModelRenderer(this, 60, 39);
        lUpperTentacle03.setRotationPoint(0.0F, -3.2F, -1.0F);
        lUpperTentacle03.addBox(-1.5F, -4.0F, -0.5F, 3, 4, 3, 0.0F);
        setRotateAngle(lUpperTentacle03, 0.2617993877991494F, 0.0F, 0.0F);
        shoulder_right = new ModelRenderer(this, 25, 18);
        shoulder_right.setRotationPoint(-7.0F, -7.8F, 0.0F);
        shoulder_right.addBox(-3.0F, -1.6F, -2.5F, 5, 6, 5, 0.0F);
        setRotateAngle(shoulder_right, 0.0F, 0.0F, 0.17453292519943295F);
        rFaceTentacle1 = new ModelRenderer(this, 110, 19);
        rFaceTentacle1.setRotationPoint(-1.9F, -1.1F, -3.2F);
        rFaceTentacle1.addBox(-1.5F, -1.5F, -2.9F, 3, 3, 3, 0.0F);
        setRotateAngle(rFaceTentacle1, 0.8651597102135892F, 0.17453292519943295F, 0.0F);
        rUpperTentacle04 = new ModelRenderer(this, 61, 40);
        rUpperTentacle04.mirror = true;
        rUpperTentacle04.setRotationPoint(0.0F, -3.3F, 0.0F);
        rUpperTentacle04.addBox(-1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F);
        setRotateAngle(rUpperTentacle04, 0.6108652381980153F, 0.0F, 0.0F);
        lFaceTentacle2 = new ModelRenderer(this, 113, 27);
        lFaceTentacle2.setRotationPoint(0.0F, -0.5F, -1.3F);
        lFaceTentacle2.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        setRotateAngle(lFaceTentacle2, 0.6457718232379019F, 0.014660765716752367F, -0.00942477796076938F);
        lFoot = new ModelRenderer(this, 0, 53);
        lFoot.setRotationPoint(0.0F, 9.6F, 0.0F);
        lFoot.addBox(-3.0F, 0.0F, -5.7F, 6, 3, 9, 0.0F);
        setRotateAngle(lFoot, 0.18203784098300857F, 0.0041887902047863905F, 0.136659280431156F);
        rUpperSpike02 = new ModelRenderer(this, 75, 40);
        rUpperSpike02.setRotationPoint(0.0F, -1.5F, 0.0F);
        rUpperSpike02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        setRotateAngle(rUpperSpike02, 0.22759093446006054F, 0.0F, 0.0F);
        hand_left = new ModelRenderer(this, 65, 18);
        hand_left.setRotationPoint(1.1F, 5.7F, 0.0F);
        hand_left.addBox(-2.0F, 0.0F, -2.0F, 3, 4, 4, 0.0F);
        setRotateAngle(hand_left, 0.18203784098300857F, 0.016406094968746697F, 0.2452187599052033F);
        lUpperSpike02 = new ModelRenderer(this, 75, 40);
        lUpperSpike02.setRotationPoint(0.0F, -1.5F, 0.3F);
        lUpperSpike02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        setRotateAngle(lUpperSpike02, 0.22759093446006054F, 0.0F, 0.0F);
        faceTumor02 = new ModelRenderer(this, 119, 50);
        faceTumor02.setRotationPoint(1.6F, -1.2F, -0.5F);
        faceTumor02.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        setRotateAngle(faceTumor02, 0.0F, 0.2617993877991494F, 0.19198621771937624F);
        rUpperSpike01 = new ModelRenderer(this, 75, 40);
        rUpperSpike01.setRotationPoint(0.0F, -1.4F, 0.0F);
        rUpperSpike01.addBox(-1.0F, -2.0F, -1.5F, 2, 2, 3, 0.0F);
        setRotateAngle(rUpperSpike01, 0.31869712141416456F, 0.0F, 0.0F);
        lTentacle03 = new ModelRenderer(this, 60, 39);
        lTentacle03.setRotationPoint(0.0F, -3.3F, 0.0F);
        lTentacle03.addBox(-1.5F, -4.0F, -1.5F, 3, 4, 3, 0.0F);
        setRotateAngle(lTentacle03, 0.3490658503988659F, 0.0F, -0.017453292519943295F);
        arm_upper_right = new ModelRenderer(this, 47, 18);
        arm_upper_right.mirror = true;
        arm_upper_right.setRotationPoint(0.0F, 4.0F, 0.0F);
        arm_upper_right.addBox(-2.5F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        setRotateAngle(arm_upper_right, 0.0F, 0.0F, 0.06981317007977318F);
        arm_lower_right = new ModelRenderer(this, 47, 50);
        arm_lower_right.mirror = true;
        arm_lower_right.setRotationPoint(-0.6F, 5.0F, 0.0F);
        arm_lower_right.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        setRotateAngle(arm_lower_right, -0.47123889803846897F, 0.0F, 0.017453292519943295F);
        rClaw2B = new ModelRenderer(this, 0, 21);
        rClaw2B.setRotationPoint(0.0F, 0.0F, 0.0F);
        rClaw2B.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        lArmLower = new ModelRenderer(this, 47, 50);
        lArmLower.setRotationPoint(-0.4F, 5.0F, 0.0F);
        lArmLower.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        setRotateAngle(lArmLower, -0.47123889803846897F, 0.0F, 0.017453292519943295F);
        lThigh = new ModelRenderer(this, 65, 48);
        lThigh.setRotationPoint(2.0F, 5.0F, 0.0F);
        lThigh.addBox(-2.0F, -0.2F, -2.5F, 5, 11, 5, 0.0F);
        setRotateAngle(lThigh, -0.40980330836826856F, 0.0F, -0.22759093446006054F);
        lSpike02 = new ModelRenderer(this, 75, 40);
        lSpike02.setRotationPoint(0.0F, -1.6F, 0.0F);
        lSpike02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        setRotateAngle(lSpike02, 0.091106186954104F, 0.0F, 0.0F);
        rTentacle01 = new ModelRenderer(this, 41, 38);
        rTentacle01.mirror = true;
        rTentacle01.setRotationPoint(-5.7F, -8.0F, 0.0F);
        rTentacle01.addBox(-1.8F, -6.0F, -2.0F, 4, 6, 4, 0.0F);
        setRotateAngle(rTentacle01, -0.22759093446006054F, 0.36425021489121656F, -0.4363323129985824F);
        rFaceTentacle5 = new ModelRenderer(this, 126, 21);
        rFaceTentacle5.setRotationPoint(0.0F, 0.0F, -1.8F);
        rFaceTentacle5.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
        setRotateAngle(rFaceTentacle5, 0.08726646259971647F, 0.0F, 0.0F);
        rFinger1A = new ModelRenderer(this, 0, 27);
        rFinger1A.setRotationPoint(0.0F, 3.7F, -1.3F);
        rFinger1A.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        setRotateAngle(rFinger1A, -0.22549653935766736F, -0.007853981633974483F, 0.015533430342749534F);
        lClaw2B = new ModelRenderer(this, 0, 21);
        lClaw2B.setRotationPoint(0.0F, 0.0F, 0.0F);
        lClaw2B.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        lSpike01 = new ModelRenderer(this, 75, 40);
        lSpike01.setRotationPoint(0.0F, -1.6F, 0.0F);
        lSpike01.addBox(-1.0F, -2.0F, -1.5F, 2, 2, 3, 0.0F);
        setRotateAngle(lSpike01, 0.18203784098300857F, 0.0F, 0.0F);
        lUpperSpike03 = new ModelRenderer(this, 78, 41);
        lUpperSpike03.setRotationPoint(0.0F, -1.5F, 0.0F);
        lUpperSpike03.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(lUpperSpike03, 0.22759093446006054F, 0.0F, 0.0F);
        lToeClaw1 = new ModelRenderer(this, 12, 22);
        lToeClaw1.setRotationPoint(0.0F, 0.0F, 0.0F);
        lToeClaw1.addBox(-0.5F, -0.3F, -1.0F, 1, 2, 1, 0.0F);
        setRotateAngle(lToeClaw1, -0.40980330836826856F, 0.0F, 0.0F);
        lUpperTentacle05 = new ModelRenderer(this, 60, 42);
        lUpperTentacle05.setRotationPoint(0.0F, -4.3F, 0.0F);
        lUpperTentacle05.addBox(-1.5F, -2.0F, -1.5F, 3, 2, 3, 0.0F);
        setRotateAngle(lUpperTentacle05, 0.5235987755982988F, 0.0F, 0.0F);
        lSpike03 = new ModelRenderer(this, 78, 41);
        lSpike03.setRotationPoint(0.0F, -1.6F, 0.0F);
        lSpike03.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(lSpike03, 0.136659280431156F, 0.0F, 0.0F);
        faceTumor07 = new ModelRenderer(this, 111, 55);
        faceTumor07.setRotationPoint(0.0F, 0.7F, -0.7F);
        faceTumor07.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        setRotateAngle(faceTumor07, -0.10471975511965977F, -0.091106186954104F, 0.31869712141416456F);
        rSpike02 = new ModelRenderer(this, 75, 40);
        rSpike02.setRotationPoint(-0.5F, -1.6F, 0.0F);
        rSpike02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        setRotateAngle(rSpike02, 0.091106186954104F, 0.0F, 0.0F);
        rUpperTentacle01 = new ModelRenderer(this, 42, 38);
        rUpperTentacle01.mirror = true;
        rUpperTentacle01.setRotationPoint(0.0F, -5.6F, -0.9F);
        rUpperTentacle01.addBox(-2.0F, -4.0F, -1.0F, 4, 4, 4, 0.0F);
        setRotateAngle(rUpperTentacle01, 0.18203784098300857F, -0.36425021489121656F, 0.4553564018453205F);
        rSpike03 = new ModelRenderer(this, 78, 41);
        rSpike03.setRotationPoint(0.0F, -1.6F, 0.0F);
        rSpike03.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(rSpike03, 0.136659280431156F, 0.0F, 0.0F);
        lUpperSpike01 = new ModelRenderer(this, 75, 40);
        lUpperSpike01.setRotationPoint(0.0F, -1.4F, 0.0F);
        lUpperSpike01.addBox(-1.0F, -2.0F, -1.5F, 2, 2, 3, 0.0F);
        setRotateAngle(lUpperSpike01, 0.31869712141416456F, 0.0F, 0.0F);
        faceTumor05 = new ModelRenderer(this, 112, 52);
        faceTumor05.setRotationPoint(0.0F, -2.0F, 0.0F);
        faceTumor05.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        setRotateAngle(faceTumor05, -0.15707963267948966F, 0.06981317007977318F, 0.8552113334772213F);
        rSpike01 = new ModelRenderer(this, 75, 40);
        rSpike01.setRotationPoint(0.0F, -1.6F, 0.0F);
        rSpike01.addBox(-1.5F, -2.0F, -1.5F, 2, 2, 3, 0.0F);
        setRotateAngle(rSpike01, 0.18203784098300857F, 0.0F, 0.0F);
        faceTumor04 = new ModelRenderer(this, 112, 52);
        faceTumor04.setRotationPoint(-0.7F, 0.4F, -0.6F);
        faceTumor04.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        setRotateAngle(faceTumor04, 0.0F, 0.2617993877991494F, 0.7330382858376184F);
        lArmUpper = new ModelRenderer(this, 47, 18);
        lArmUpper.setRotationPoint(0.0F, 4.0F, 0.0F);
        lArmUpper.addBox(-2.5F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        setRotateAngle(lArmUpper, 0.0F, 0.0F, 0.06981317007977318F);
        faceTumor01 = new ModelRenderer(this, 128, 50);
        faceTumor01.setRotationPoint(1.6F, -7.3F, -3.4F);
        faceTumor01.addBox(-1.1F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        setRotateAngle(faceTumor01, 0.05235987755982988F, -0.22689280275926282F, 1.0821041362364843F);
        lClaw3 = new ModelRenderer(this, 0, 21);
        lClaw3.setRotationPoint(-0.2F, 3.4F, 0.1F);
        lClaw3.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        setRotateAngle(lClaw3, 0.04276056667386108F, -0.034033920413889425F, -0.41119957176986405F);
        rFaceTentacle4 = new ModelRenderer(this, 113, 27);
        rFaceTentacle4.setRotationPoint(0.0F, 0.0F, -1.7F);
        rFaceTentacle4.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        setRotateAngle(rFaceTentacle4, 0.2617993877991494F, 0.0F, 0.0F);
        lFinger2B = new ModelRenderer(this, 0, 27);
        lFinger2B.setRotationPoint(0.0F, 0.0F, 0.0F);
        lFinger2B.addBox(-0.99F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        lKnee = new ModelRenderer(this, 0, 35);
        lKnee.setRotationPoint(0.5F, 7.5F, -0.8F);
        lKnee.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        setRotateAngle(lKnee, 1.2747884856566583F, -0.091106186954104F, 0.0F);
        lShoulder = new ModelRenderer(this, 80, 18);
        lShoulder.setRotationPoint(8.0F, -8.2F, 0.0F);
        lShoulder.addBox(-3.0F, -1.6F, -2.5F, 5, 6, 5, 0.0F);
        setRotateAngle(lShoulder, 0.0F, 0.0F, -0.296705972839036F);
        rFinger2A = new ModelRenderer(this, 0, 27);
        rFinger2A.setRotationPoint(0.0F, 3.7F, 0.6F);
        rFinger2A.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        setRotateAngle(rFinger2A, 0.08272860654453122F, -0.06806784082777885F, 0.15795229730548682F);
        lTentacle05 = new ModelRenderer(this, 61, 40);
        lTentacle05.setRotationPoint(0.0F, -3.3F, 0.0F);
        lTentacle05.addBox(-1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F);
        setRotateAngle(lTentacle05, 0.6108652381980153F, 0.0F, 0.0F);
        lFaceTentacle3 = new ModelRenderer(this, 113, 27);
        lFaceTentacle3.setRotationPoint(0.0F, 0.0F, -1.6F);
        lFaceTentacle3.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        setRotateAngle(lFaceTentacle3, 0.2617993877991494F, 0.0F, 0.0F);
        rClaw1B = new ModelRenderer(this, 0, 21);
        rClaw1B.setRotationPoint(0.0F, 0.0F, 0.0F);
        rClaw1B.addBox(-0.5F, 0.0F, -0.1F, 1, 3, 1, 0.0F);
        lUpperTentacle02 = new ModelRenderer(this, 60, 39);
        lUpperTentacle02.setRotationPoint(0.0F, -3.3F, 1.0F);
        lUpperTentacle02.addBox(-1.5F, -4.0F, -1.5F, 3, 4, 3, 0.0F);
        setRotateAngle(lUpperTentacle02, 0.3490658503988659F, 0.0F, 0.0F);
        rTentacle02 = new ModelRenderer(this, 42, 38);
        rTentacle02.mirror = true;
        rTentacle02.setRotationPoint(-0.5F, -3.5F, 0.0F);
        rTentacle02.addBox(-2.0F, -4.0F, -1.99F, 4, 4, 4, 0.0F);
        setRotateAngle(rTentacle02, 0.0F, 0.0F, -0.8726646259971648F);
        faceTumor09 = new ModelRenderer(this, 116, 55);
        faceTumor09.setRotationPoint(0.8F, -0.6F, -0.6F);
        faceTumor09.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        setRotateAngle(faceTumor09, 0.091106186954104F, -0.27314402793711257F, 0.03490658503988659F);
        rClaw1A = new ModelRenderer(this, 0, 21);
        rClaw1A.setRotationPoint(0.0F, 3.7F, 0.0F);
        rClaw1A.addBox(-0.5F, 0.0F, -0.3F, 1, 3, 1, 0.0F);
        setRotateAngle(rClaw1A, -0.09686577348568529F, 0.01832595714594046F, -0.478918346747244F);
        rTentacle05 = new ModelRenderer(this, 60, 42);
        rTentacle05.mirror = true;
        rTentacle05.setRotationPoint(0.0F, -4.3F, 0.0F);
        rTentacle05.addBox(-1.5F, -2.0F, -1.5F, 3, 2, 3, 0.0F);
        setRotateAngle(rTentacle05, 0.5235987755982988F, 0.0F, 0.0F);
        rTentacle05_1 = new ModelRenderer(this, 61, 40);
        rTentacle05_1.mirror = true;
        rTentacle05_1.setRotationPoint(0.0F, -3.3F, 0.0F);
        rTentacle05_1.addBox(-1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F);
        setRotateAngle(rTentacle05_1, 0.6108652381980153F, 0.0F, 0.0F);
        lUpperTentacle04 = new ModelRenderer(this, 61, 40);
        lUpperTentacle04.setRotationPoint(0.0F, -3.3F, 1.4F);
        lUpperTentacle04.addBox(-1.0F, -5.0F, -1.0F, 2, 5, 2, 0.0F);
        setRotateAngle(lUpperTentacle04, 0.6108652381980153F, 0.0F, 0.0F);
        rFinger3 = new ModelRenderer(this, 0, 27);
        rFinger3.setRotationPoint(1.4F, 1.0F, -1.1F);
        rFinger3.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        setRotateAngle(rFinger3, -0.091106186954104F, 0.2707005669843205F, -0.36425021489121656F);
        lFaceTentacle5 = new ModelRenderer(this, 126, 28);
        lFaceTentacle5.setRotationPoint(0.0F, 0.0F, -0.6F);
        lFaceTentacle5.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        lTentacle04 = new ModelRenderer(this, 60, 39);
        lTentacle04.setRotationPoint(0.0F, -3.6F, 0.0F);
        lTentacle04.addBox(-1.5F, -4.0F, -1.5F, 3, 4, 3, 0.0F);
        setRotateAngle(lTentacle04, 0.2617993877991494F, 0.0F, 0.0F);
        lFinger2A = new ModelRenderer(this, 0, 27);
        lFinger2A.setRotationPoint(0.0F, 3.7F, 0.6F);
        lFinger2A.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        setRotateAngle(lFinger2A, 0.08272860654453122F, -0.06806784082777885F, -0.15795229730548682F);
        rFinger2B = new ModelRenderer(this, 0, 27);
        rFinger2B.setRotationPoint(0.0F, 0.0F, 0.0F);
        rFinger2B.addBox(-0.99F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        rToe2 = new ModelRenderer(this, 5, 22);
        rToe2.mirror = true;
        rToe2.setRotationPoint(2.0F, 1.9F, -5.9F);
        rToe2.addBox(-1.0F, -1.0F, -0.8F, 2, 2, 1, 0.0F);
        setRotateAngle(rToe2, -0.03490658503988659F, 0.0F, 0.0F);
        rToeClaw2 = new ModelRenderer(this, 12, 22);
        rToeClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        rToeClaw2.addBox(-0.5F, -0.3F, -1.0F, 1, 2, 1, 0.0F);
        setRotateAngle(rToeClaw2, -0.40980330836826856F, 0.0F, 0.0F);
        lUpperTentacle01 = new ModelRenderer(this, 42, 38);
        lUpperTentacle01.setRotationPoint(-0.5F, -1.4F, -1.2F);
        lUpperTentacle01.addBox(-2.0F, -4.0F, -1.0F, 4, 4, 4, 0.0F);
        setRotateAngle(lUpperTentacle01, 0.091106186954104F, 0.0F, -0.5918411493512771F);
        rFoot = new ModelRenderer(this, 0, 53);
        rFoot.mirror = true;
        rFoot.setRotationPoint(0.0F, 9.6F, 0.0F);
        rFoot.addBox(-3.0F, 0.0F, -5.7F, 6, 3, 9, 0.0F);
        setRotateAngle(rFoot, 0.18203784098300857F, 0.0041887902047863905F, -0.136659280431156F);
        ribs = new ModelRenderer(this, 39, 5);
        ribs.setRotationPoint(0.0F, -4.0F, 0.0F);
        ribs.addBox(-5.0F, -0.0F, -3.0F, 10, 4, 6, 0.0F);
        lHip = new ModelRenderer(this, 23, 36);
        lHip.setRotationPoint(3.0F, 4.0F, 0.0F);
        lHip.addBox(-1.0F, -2.8F, -2.8F, 2, 7, 6, 0.0F);
        setRotateAngle(lHip, -0.15707963267948966F, 0.0F, 1.0821041362364843F);
        rFinger1B = new ModelRenderer(this, 0, 27);
        rFinger1B.setRotationPoint(0.0F, 0.0F, 0.0F);
        rFinger1B.addBox(-0.99F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        rFaceTentacle6 = new ModelRenderer(this, 126, 28);
        rFaceTentacle6.setRotationPoint(0.0F, 0.0F, -0.9F);
        rFaceTentacle6.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        faceTumor06 = new ModelRenderer(this, 112, 52);
        faceTumor06.setRotationPoint(0.1F, -0.9F, -0.7F);
        faceTumor06.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        setRotateAngle(faceTumor06, -0.03490658503988659F, 0.06981317007977318F, 0.40980330836826856F);
        lToe2 = new ModelRenderer(this, 5, 22);
        lToe2.setRotationPoint(-2.0F, 1.9F, -5.9F);
        lToe2.addBox(-1.0F, -1.0F, -0.8F, 2, 2, 1, 0.0F);
        stomach = new ModelRenderer(this, 72, 5);
        stomach.setRotationPoint(0.0F, 3.9F, 0.0F);
        stomach.addBox(-4.5F, 0.0F, -2.5F, 9, 5, 5, 0.0F);
        neck = new ModelRenderer(this, 111, 33);
        neck.setRotationPoint(0.0F, -8.0F, 0.0F);
        neck.addBox(-3.0F, -4.0F, -2.5F, 6, 4, 5, 0.0F);
        setRotateAngle(neck, 0.13962634015954636F, 0.0F, 0.0F);
        rSpike1 = new ModelRenderer(this, 32, 55);
        rSpike1.setRotationPoint(-4.4F, -8.1F, -1.8F);
        rSpike1.addBox(-2.0F, -10.0F, 0.0F, 4, 10, 0, 0.0F);
        setRotateAngle(rSpike1, 0.5918411493512771F, -0.10471975511965977F, -0.4553564018453205F);
        rShin = new ModelRenderer(this, 0, 35);
        rShin.mirror = true;
        rShin.setRotationPoint(-0.4F, 6.5F, 1.5F);
        rShin.addBox(-2.0F, 0.4F, -2.5F, 4, 10, 5, 0.0F);
        setRotateAngle(rShin, -1.0471975511965976F, -0.091106186954104F, 0.0F);
        rToe1 = new ModelRenderer(this, 5, 22);
        rToe1.mirror = true;
        rToe1.setRotationPoint(-2.0F, 1.9F, -5.9F);
        rToe1.addBox(-1.0F, -1.0F, -0.8F, 2, 2, 1, 0.0F);
        lFinger1A = new ModelRenderer(this, 0, 27);
        lFinger1A.setRotationPoint(0.0F, 3.7F, -1.3F);
        lFinger1A.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        setRotateAngle(lFinger1A, -0.22549653935766736F, -0.007853981633974483F, 0.015533430342749534F);
        lClaw1A = new ModelRenderer(this, 0, 21);
        lClaw1A.setRotationPoint(0.0F, 3.7F, -0.1F);
        lClaw1A.addBox(-0.5F, 0.0F, -0.3F, 1, 3, 1, 0.0F);
        setRotateAngle(lClaw1A, -0.09686577348568529F, 0.01832595714594046F, 0.18430676901060122F);
        lSpike = new ModelRenderer(this, 32, 57);
        lSpike.setRotationPoint(3.4F, -11.0F, -1.5F);
        lSpike.addBox(0.0F, -2.5F, 0.0F, 0, 5, 10, 0.0F);
        setRotateAngle(lSpike, 2.0943951023931953F, -0.31869712141416456F, 0.22759093446006054F);
        rFaceTentacle3 = new ModelRenderer(this, 113, 27);
        rFaceTentacle3.setRotationPoint(0.0F, -0.5F, -1.4F);
        rFaceTentacle3.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        setRotateAngle(rFaceTentacle3, 0.31869712141416456F, 0.0F, 0.0F);
        rKnee = new ModelRenderer(this, 0, 35);
        rKnee.mirror = true;
        rKnee.setRotationPoint(0.5F, 7.5F, -0.8F);
        rKnee.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        setRotateAngle(rKnee, 1.2747884856566583F, 0.091106186954104F, 0.0F);
        rUpperSpike03 = new ModelRenderer(this, 78, 41);
        rUpperSpike03.setRotationPoint(0.0F, -1.5F, 0.0F);
        rUpperSpike03.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(rUpperSpike03, 0.22759093446006054F, 0.0F, 0.0F);
        lToeClaw2 = new ModelRenderer(this, 12, 22);
        lToeClaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
        lToeClaw2.addBox(-0.5F, -0.3F, -1.0F, 1, 2, 1, 0.0F);
        setRotateAngle(lToeClaw2, -0.40980330836826856F, 0.0F, 0.0F);
        lTentacle06 = new ModelRenderer(this, 60, 42);
        lTentacle06.setRotationPoint(0.0F, -4.4F, 0.0F);
        lTentacle06.addBox(-1.5F, -2.0F, -1.5F, 3, 2, 3, 0.0F);
        setRotateAngle(lTentacle06, 0.5235987755982988F, 0.0F, 0.0F);
        finger21_right = new ModelRenderer(this, 12, 22);
        finger21_right.setRotationPoint(0.0F, 0.0F, 0.0F);
        finger21_right.addBox(-0.5F, -0.3F, -1.0F, 1, 2, 1, 0.0F);
        setRotateAngle(finger21_right, -0.40980330836826856F, 0.0F, 0.0F);
        lClaw2A = new ModelRenderer(this, 0, 21);
        lClaw2A.setRotationPoint(0.0F, 3.7F, -0.1F);
        lClaw2A.addBox(-0.5F, 0.0F, -0.3F, 1, 3, 1, 0.0F);
        setRotateAngle(lClaw2A, -0.09686577348568529F, 0.01832595714594046F, 0.18430676901060122F);
        lShin = new ModelRenderer(this, 0, 35);
        lShin.setRotationPoint(0.4F, 6.5F, 1.5F);
        lShin.addBox(-2.0F, 0.4F, -2.5F, 4, 10, 5, 0.0F);
        setRotateAngle(lShin, -1.0471975511965976F, 0.091106186954104F, 0.0F);
        faceTumor08 = new ModelRenderer(this, 112, 52);
        faceTumor08.setRotationPoint(-0.5F, 2.0F, -0.4F);
        faceTumor08.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        setRotateAngle(faceTumor08, 0.0F, 0.27314402793711257F, 0.15707963267948966F);
        finger31 = new ModelRenderer(this, 0, 21);
        finger31.setRotationPoint(0.2F, 3.4F, 0.1F);
        finger31.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        setRotateAngle(finger31, 0.04276056667386108F, -0.034033920413889425F, 0.41119957176986405F);
        lFaceTentacle1 = new ModelRenderer(this, 110, 20);
        lFaceTentacle1.setRotationPoint(1.5F, -1.1F, -2.7F);
        lFaceTentacle1.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
        setRotateAngle(lFaceTentacle1, 0.5009094953223726F, -0.5410520681182421F, 0.0F);
        faceTumor03 = new ModelRenderer(this, 119, 50);
        faceTumor03.setRotationPoint(1.1F, 0.3F, 0.3F);
        faceTumor03.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        setRotateAngle(faceTumor03, -0.06981317007977318F, -0.15707963267948966F, 0.6981317007977318F);
        head = new ModelRenderer(this, 108, 1);
        head.setRotationPoint(0.0F, -3.0F, 0.0F);
        head.addBox(-3.5F, -8.0F, -4.1F, 7, 8, 8, 0.0F);
        chest = new ModelRenderer(this, 0, 4);
        chest.setRotationPoint(0.0F, -2.5F, 0.0F);
        chest.addBox(-6.5F, -9.0F, -3.0F, 13, 5, 6, 0.0F);
        lFaceTentacle4 = new ModelRenderer(this, 126, 21);
        lFaceTentacle4.setRotationPoint(0.0F, 0.0F, -1.7F);
        lFaceTentacle4.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
        setRotateAngle(lFaceTentacle4, 0.08726646259971647F, 0.0F, 0.0F);
        hand_right = new ModelRenderer(this, 65, 18);
        hand_right.mirror = true;
        hand_right.setRotationPoint(-1.1F, 5.7F, 0.0F);
        hand_right.addBox(-1.0F, 0.0F, -2.0F, 3, 4, 4, 0.0F);
        setRotateAngle(hand_right, 0.18203784098300857F, 0.016406094968746697F, -0.2452187599052033F);
        rTentacle06 = new ModelRenderer(this, 60, 42);
        rTentacle06.mirror = true;
        rTentacle06.setRotationPoint(0.0F, -4.3F, 0.0F);
        rTentacle06.addBox(-1.5F, -2.0F, -1.5F, 3, 2, 3, 0.0F);
        setRotateAngle(rTentacle06, 0.5235987755982988F, 0.0F, 0.0F);
        lFinger3 = new ModelRenderer(this, 0, 27);
        lFinger3.setRotationPoint(-1.4F, 1.0F, -1.1F);
        lFinger3.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        setRotateAngle(lFinger3, -0.091106186954104F, 0.2707005669843205F, 0.38275070496235647F);
        lTentacle02 = new ModelRenderer(this, 42, 38);
        lTentacle02.setRotationPoint(0.0F, -5.2F, 0.0F);
        lTentacle02.addBox(-2.0F, -4.0F, -1.99F, 4, 4, 4, 0.0F);
        setRotateAngle(lTentacle02, 0.0F, 0.0F, 0.3665191429188092F);
        lToe1 = new ModelRenderer(this, 5, 22);
        lToe1.setRotationPoint(2.0F, 1.9F, -5.9F);
        lToe1.addBox(-1.0F, -1.0F, -0.8F, 2, 2, 1, 0.0F);
        setRotateAngle(lToe1, -0.03490658503988659F, 0.0F, 0.0F);
        rSpike2 = new ModelRenderer(this, 32, 57);
        rSpike2.setRotationPoint(-3.4F, -8.3F, 1.0F);
        rSpike2.addBox(0.0F, -2.5F, 0.0F, 0, 5, 10, 0.0F);
        setRotateAngle(rSpike2, 1.0016444577195458F, -0.3839724354387525F, -0.13962634015954636F);
        rTentacle04 = new ModelRenderer(this, 60, 39);
        rTentacle04.mirror = true;
        rTentacle04.setRotationPoint(0.0F, -3.5F, 0.0F);
        rTentacle04.addBox(-1.5F, -4.0F, -1.5F, 3, 4, 3, 0.0F);
        setRotateAngle(rTentacle04, 0.2617993877991494F, 0.0F, 0.0F);
        rThigh = new ModelRenderer(this, 65, 48);
        rThigh.mirror = true;
        rThigh.setRotationPoint(-3.0F, 5.0F, 0.0F);
        rThigh.addBox(-2.0F, -0.2F, -2.5F, 5, 11, 5, 0.0F);
        setRotateAngle(rThigh, -0.40980330836826856F, 0.0F, 0.22759093446006054F);
        rUpperTentacle02 = new ModelRenderer(this, 60, 39);
        rUpperTentacle02.mirror = true;
        rUpperTentacle02.setRotationPoint(0.0F, -3.3F, 1.1F);
        rUpperTentacle02.addBox(-1.5F, -4.0F, -1.5F, 3, 4, 3, 0.0F);
        setRotateAngle(rUpperTentacle02, 0.3490658503988659F, 0.0F, -0.017453292519943295F);
        rClaw2A = new ModelRenderer(this, 0, 21);
        rClaw2A.setRotationPoint(0.0F, 3.7F, -0.1F);
        rClaw2A.addBox(-0.5F, 0.0F, -0.3F, 1, 3, 1, 0.0F);
        setRotateAngle(rClaw2A, -0.09686577348568529F, 0.01832595714594046F, -0.478918346747244F);
        lFinger1B = new ModelRenderer(this, 0, 27);
        lFinger1B.setRotationPoint(0.0F, 0.0F, 0.0F);
        lFinger1B.addBox(-0.99F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        lClaw1B = new ModelRenderer(this, 0, 21);
        lClaw1B.setRotationPoint(0.0F, 0.0F, 0.0F);
        lClaw1B.addBox(-0.5F, 0.0F, -0.1F, 1, 3, 1, 0.0F);
        rFaceTentacle2 = new ModelRenderer(this, 110, 20);
        rFaceTentacle2.setRotationPoint(0.0F, 0.0F, -2.7F);
        rFaceTentacle2.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
        setRotateAngle(rFaceTentacle2, 0.091106186954104F, 0.0F, 0.0F);
        faceTumor10 = new ModelRenderer(this, 116, 55);
        faceTumor10.setRotationPoint(0.4F, -0.8F, 0.8F);
        faceTumor10.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        setRotateAngle(faceTumor10, -0.10471975511965977F, -0.091106186954104F, 0.05235987755982988F);
        rHip = new ModelRenderer(this, 23, 36);
        rHip.mirror = true;
        rHip.setRotationPoint(-4.0F, 4.0F, 0.0F);
        rHip.addBox(-0.6F, -2.1F, -2.7F, 2, 7, 6, 0.0F);
        setRotateAngle(rHip, -0.15707963267948966F, 0.0F, -1.0821041362364843F);
        lTentacle01 = new ModelRenderer(this, 41, 38);
        lTentacle01.setRotationPoint(4.8F, -7.6F, 0.0F);
        lTentacle01.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 4, 0.0F);
        setRotateAngle(lTentacle01, 0.0F, 0.0F, 0.9773843811168246F);
        rUpperTentacle02.addChild(rUpperTentacle03);
        rTentacle02.addChild(rTentacle03);
        lUpperTentacle02.addChild(lUpperTentacle03);
        chest.addChild(shoulder_right);
        head.addChild(rFaceTentacle1);
        rUpperTentacle03.addChild(rUpperTentacle04);
        lFaceTentacle1.addChild(lFaceTentacle2);
        lShin.addChild(lFoot);
        rUpperSpike01.addChild(rUpperSpike02);
        lArmLower.addChild(hand_left);
        lUpperSpike01.addChild(lUpperSpike02);
        faceTumor01.addChild(faceTumor02);
        rTentacle05.addChild(rUpperSpike01);
        lTentacle02.addChild(lTentacle03);
        shoulder_right.addChild(arm_upper_right);
        arm_upper_right.addChild(arm_lower_right);
        rClaw2A.addChild(rClaw2B);
        lArmUpper.addChild(lArmLower);
        stomach.addChild(lThigh);
        lSpike01.addChild(lSpike02);
        chest.addChild(rTentacle01);
        rFaceTentacle4.addChild(rFaceTentacle5);
        hand_right.addChild(rFinger1A);
        lClaw2A.addChild(lClaw2B);
        lTentacle06.addChild(lSpike01);
        lUpperSpike02.addChild(lUpperSpike03);
        lToe1.addChild(lToeClaw1);
        lUpperTentacle04.addChild(lUpperTentacle05);
        lSpike02.addChild(lSpike03);
        faceTumor02.addChild(faceTumor07);
        rSpike01.addChild(rSpike02);
        rTentacle01.addChild(rUpperTentacle01);
        rSpike02.addChild(rSpike03);
        lUpperTentacle05.addChild(lUpperSpike01);
        faceTumor01.addChild(faceTumor05);
        rTentacle06.addChild(rSpike01);
        faceTumor01.addChild(faceTumor04);
        lShoulder.addChild(lArmUpper);
        head.addChild(faceTumor01);
        lFinger3.addChild(lClaw3);
        rFaceTentacle3.addChild(rFaceTentacle4);
        lFinger2A.addChild(lFinger2B);
        lThigh.addChild(lKnee);
        chest.addChild(lShoulder);
        hand_right.addChild(rFinger2A);
        lTentacle04.addChild(lTentacle05);
        lFaceTentacle2.addChild(lFaceTentacle3);
        rClaw1A.addChild(rClaw1B);
        lUpperTentacle01.addChild(lUpperTentacle02);
        rTentacle01.addChild(rTentacle02);
        faceTumor02.addChild(faceTumor09);
        rFinger1A.addChild(rClaw1A);
        rUpperTentacle04.addChild(rTentacle05);
        rTentacle04.addChild(rTentacle05_1);
        lUpperTentacle03.addChild(lUpperTentacle04);
        hand_right.addChild(rFinger3);
        lFaceTentacle4.addChild(lFaceTentacle5);
        lTentacle03.addChild(lTentacle04);
        hand_left.addChild(lFinger2A);
        rFinger2A.addChild(rFinger2B);
        rFoot.addChild(rToe2);
        rToe2.addChild(rToeClaw2);
        lTentacle01.addChild(lUpperTentacle01);
        rShin.addChild(rFoot);
        chest.addChild(ribs);
        stomach.addChild(lHip);
        rFinger1A.addChild(rFinger1B);
        rFaceTentacle5.addChild(rFaceTentacle6);
        faceTumor01.addChild(faceTumor06);
        lFoot.addChild(lToe2);
        ribs.addChild(stomach);
        chest.addChild(neck);
        chest.addChild(rSpike1);
        rKnee.addChild(rShin);
        rFoot.addChild(rToe1);
        hand_left.addChild(lFinger1A);
        lFinger1A.addChild(lClaw1A);
        chest.addChild(lSpike);
        rFaceTentacle2.addChild(rFaceTentacle3);
        rThigh.addChild(rKnee);
        rUpperSpike02.addChild(rUpperSpike03);
        lToe2.addChild(lToeClaw2);
        lTentacle05.addChild(lTentacle06);
        rToe1.addChild(finger21_right);
        lFinger2B.addChild(lClaw2A);
        lKnee.addChild(lShin);
        faceTumor02.addChild(faceTumor08);
        rFinger3.addChild(finger31);
        head.addChild(lFaceTentacle1);
        faceTumor02.addChild(faceTumor03);
        neck.addChild(head);
        lFaceTentacle3.addChild(lFaceTentacle4);
        arm_lower_right.addChild(hand_right);
        rTentacle05_1.addChild(rTentacle06);
        hand_left.addChild(lFinger3);
        lTentacle01.addChild(lTentacle02);
        lFoot.addChild(lToe1);
        chest.addChild(rSpike2);
        rTentacle03.addChild(rTentacle04);
        stomach.addChild(rThigh);
        rUpperTentacle01.addChild(rUpperTentacle02);
        rFinger2A.addChild(rClaw2A);
        lFinger1A.addChild(lFinger1B);
        lClaw1A.addChild(lClaw1B);
        rFaceTentacle1.addChild(rFaceTentacle2);
        faceTumor02.addChild(faceTumor10);
        stomach.addChild(rHip);
        chest.addChild(lTentacle01);
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
		head.rotateAngleX = par5 * 0.017453292F + 6.5F;
	    head.rotateAngleY = par4 * 0.017453292F;
		this.lThigh.rotateAngleX = MathHelper.sin(par1 * 1) * 0.6F * par2 + 5.9F;
		this.lArmUpper.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.5F * par2;
		this.rThigh.rotateAngleX = MathHelper.cos(par1 * 1) * 0.6F * par2 + 5.9F;
		this.arm_upper_right.rotateAngleX = MathHelper.sin(par1 * 0.8F) * 0.5F * par2;
	}
}