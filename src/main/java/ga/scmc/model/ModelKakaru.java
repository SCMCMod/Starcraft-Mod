package ga.scmc.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * kakaru - cybercat5555
 * Created using Tabula 6.0.0
 */
public class ModelKakaru extends ModelBase {
    public ModelRenderer chest;
    public ModelRenderer spineBone01;
    public ModelRenderer stomach;
    public ModelRenderer neck01a;
    public ModelRenderer lArm01;
    public ModelRenderer rArm01;
    public ModelRenderer tail01;
    public ModelRenderer tail02a;
    public ModelRenderer tail02b;
    public ModelRenderer tail02c;
    public ModelRenderer tail02d;
    public ModelRenderer tail03;
    public ModelRenderer tail04;
    public ModelRenderer tail05;
    public ModelRenderer neck01b;
    public ModelRenderer neck01c;
    public ModelRenderer neck01d;
    public ModelRenderer neck02;
    public ModelRenderer neck03;
    public ModelRenderer head01;
    public ModelRenderer UpperBeak01;
    public ModelRenderer crest01;
    public ModelRenderer crest05;
    public ModelRenderer lowerBeak01;
    public ModelRenderer UpperBeak02;
    public ModelRenderer UpperBeak03;
    public ModelRenderer lTeethUpper;
    public ModelRenderer rTeethUpper;
    public ModelRenderer crest02a;
    public ModelRenderer crest02b;
    public ModelRenderer crest03;
    public ModelRenderer crest04;
    public ModelRenderer lowerBeak02;
    public ModelRenderer lowerBeak03;
    public ModelRenderer lTeethLower;
    public ModelRenderer rTeethLower;
    public ModelRenderer lArm02a;
    public ModelRenderer lLeg01;
    public ModelRenderer lArm02b;
    public ModelRenderer lArm02c;
    public ModelRenderer lArm02d;
    public ModelRenderer lArm03;
    public ModelRenderer lFinger01;
    public ModelRenderer lFinger02;
    public ModelRenderer lWing01;
    public ModelRenderer lWing02;
    public ModelRenderer lArm04;
    public ModelRenderer lLeg02a;
    public ModelRenderer lLeg02b;
    public ModelRenderer lLeg02c;
    public ModelRenderer lLeg02d;
    public ModelRenderer lLeg03;
    public ModelRenderer lWing03;
    public ModelRenderer lLeg04;
    public ModelRenderer rArm02a;
    public ModelRenderer rLeg01;
    public ModelRenderer rArm02b;
    public ModelRenderer rArm02c;
    public ModelRenderer rArm02d;
    public ModelRenderer rArm03;
    public ModelRenderer rFinger01;
    public ModelRenderer rFinger02;
    public ModelRenderer rWing01;
    public ModelRenderer rWing02;
    public ModelRenderer rArm04;
    public ModelRenderer rLeg02a;
    public ModelRenderer rLeg02b;
    public ModelRenderer rLeg02c;
    public ModelRenderer rLeg02d;
    public ModelRenderer rLeg03;
    public ModelRenderer rWing03;
    public ModelRenderer rLeg04;
    public ModelRenderer spineBone02;
    public ModelRenderer spineMembrane;
    public ModelRenderer spineBone03;
    public ModelRenderer spineBone04;

    public ModelKakaru() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.lArm04 = new ModelRenderer(this, 45, 26);
        this.lArm04.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.lArm04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lArm04, 0.0F, -0.18203784098300857F, 0.0F);
        this.rArm02b = new ModelRenderer(this, 38, 33);
        this.rArm02b.mirror = true;
        this.rArm02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArm02b.addBox(-10.3F, -0.75F, -0.05F, 10, 1, 1, 0.0F);
        this.rArm01 = new ModelRenderer(this, 18, 28);
        this.rArm01.mirror = true;
        this.rArm01.setRotationPoint(-1.2F, -0.3F, 1.5F);
        this.rArm01.addBox(-4.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(rArm01, 0.18203784098300857F, -0.27314402793711257F, 0.0F);
        this.lLeg02d = new ModelRenderer(this, 12, 56);
        this.lLeg02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lLeg02d.addBox(0.1F, -0.25F, -0.2F, 5, 1, 1, 0.0F);
        this.crest01 = new ModelRenderer(this, 44, 17);
        this.crest01.setRotationPoint(0.0F, 0.1F, -2.7F);
        this.crest01.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(crest01, 1.0471975511965976F, 0.0F, 0.0F);
        this.neck01d = new ModelRenderer(this, 9, 37);
        this.neck01d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck01d.addBox(0.2F, 0.3F, -1.5F, 1, 1, 2, 0.0F);
        this.neck01b = new ModelRenderer(this, 9, 30);
        this.neck01b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck01b.addBox(0.2F, -1.2F, -1.5F, 1, 2, 2, 0.0F);
        this.neck03 = new ModelRenderer(this, 0, 49);
        this.neck03.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.neck03.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(neck03, -0.136659280431156F, 0.0F, 0.0F);
        this.spineBone01 = new ModelRenderer(this, 71, 17);
        this.spineBone01.setRotationPoint(0.0F, -1.5F, 1.1F);
        this.spineBone01.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.tail03 = new ModelRenderer(this, 47, 1);
        this.tail03.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.tail03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.rLeg01 = new ModelRenderer(this, 13, 41);
        this.rLeg01.mirror = true;
        this.rLeg01.setRotationPoint(1.2F, 0.8F, 3.7F);
        this.rLeg01.addBox(-4.0F, -1.0F, -0.8F, 4, 2, 2, 0.0F);
        this.setRotateAngle(rLeg01, -0.18203784098300857F, 0.6829473363053812F, 0.0F);
        this.tail02b = new ModelRenderer(this, 34, 1);
        this.tail02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail02b.addBox(-0.75F, -0.75F, 0.0F, 1, 1, 5, 0.0F);
        this.lWing02 = new ModelRenderer(this, 14, 50);
        this.lWing02.setRotationPoint(5.6F, 0.0F, -0.2F);
        this.lWing02.addBox(-6.8F, 0.0F, 0.0F, 13, 0, 12, 0.0F);
        this.setRotateAngle(lWing02, -0.091106186954104F, -0.8651597102135892F, 0.0F);
        this.lLeg02a = new ModelRenderer(this, 12, 47);
        this.lLeg02a.setRotationPoint(3.8F, 0.0F, 0.2F);
        this.lLeg02a.addBox(0.1F, -0.75F, -0.7F, 5, 1, 1, 0.0F);
        this.setRotateAngle(lLeg02a, 0.045553093477052F, -0.136659280431156F, 0.0F);
        this.rLeg02b = new ModelRenderer(this, 12, 50);
        this.rLeg02b.mirror = true;
        this.rLeg02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rLeg02b.addBox(-5.1F, -0.75F, -0.2F, 5, 1, 1, 0.0F);
        this.lTeethUpper = new ModelRenderer(this, 73, 27);
        this.lTeethUpper.setRotationPoint(0.9F, -0.5F, -4.0F);
        this.lTeethUpper.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
        this.lWing03 = new ModelRenderer(this, 56, 3);
        this.lWing03.setRotationPoint(5.0F, 0.0F, 1.0F);
        this.lWing03.addBox(-7.1F, 0.0F, 0.0F, 9, 0, 12, 0.0F);
        this.setRotateAngle(lWing03, 0.22759093446006054F, -0.36425021489121656F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(chest, -0.22759093446006054F, 0.0F, 0.0F);
        this.crest02b = new ModelRenderer(this, 53, 23);
        this.crest02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.crest02b.addBox(-0.25F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.rArm02d = new ModelRenderer(this, 38, 36);
        this.rArm02d.mirror = true;
        this.rArm02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArm02d.addBox(-10.3F, -0.25F, -0.05F, 10, 1, 1, 0.0F);
        this.rLeg02a = new ModelRenderer(this, 12, 47);
        this.rLeg02a.mirror = true;
        this.rLeg02a.setRotationPoint(-3.8F, 0.0F, 0.2F);
        this.rLeg02a.addBox(-5.1F, -0.75F, -0.7F, 5, 1, 1, 0.0F);
        this.setRotateAngle(rLeg02a, 0.045553093477052F, 0.136659280431156F, 0.0F);
        this.lFinger01 = new ModelRenderer(this, 50, 45);
        this.lFinger01.setRotationPoint(9.8F, 0.0F, 0.1F);
        this.lFinger01.addBox(-1.0F, 0.0F, -4.2F, 2, 0, 4, 0.0F);
        this.setRotateAngle(lFinger01, 0.0F, -1.1838568316277536F, 0.0F);
        this.crest03 = new ModelRenderer(this, 55, 28);
        this.crest03.setRotationPoint(0.0F, -0.2F, 2.8F);
        this.crest03.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(crest03, -0.5009094953223726F, 0.0F, 0.0F);
        this.rLeg03 = new ModelRenderer(this, 12, 59);
        this.rLeg03.mirror = true;
        this.rLeg03.setRotationPoint(-4.8F, 0.0F, 0.1F);
        this.rLeg03.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(rLeg03, 0.0F, -0.31869712141416456F, 0.0F);
        this.lLeg04 = new ModelRenderer(this, 35, 26);
        this.lLeg04.setRotationPoint(0.0F, 0.0F, 0.2F);
        this.lLeg04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lLeg04, 0.0F, 0.5462880558742251F, 0.0F);
        this.rTeethUpper = new ModelRenderer(this, 73, 27);
        this.rTeethUpper.mirror = true;
        this.rTeethUpper.setRotationPoint(-0.7F, -0.5F, -4.0F);
        this.rTeethUpper.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
        this.tail02d = new ModelRenderer(this, 34, 8);
        this.tail02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail02d.addBox(-0.75F, -0.25F, 0.0F, 1, 1, 5, 0.0F);
        this.rTeethLower = new ModelRenderer(this, 73, 31);
        this.rTeethLower.setRotationPoint(-0.7F, -0.6F, -4.0F);
        this.rTeethLower.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
        this.spineBone03 = new ModelRenderer(this, 71, 17);
        this.spineBone03.setRotationPoint(0.0F, -0.1F, 1.7F);
        this.spineBone03.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spineBone03, -0.136659280431156F, 0.0F, 0.0F);
        this.crest04 = new ModelRenderer(this, 53, 40);
        this.crest04.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.crest04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(crest04, -0.5462880558742251F, 0.0F, 0.0F);
        this.rWing02 = new ModelRenderer(this, 14, 50);
        this.rWing02.mirror = true;
        this.rWing02.setRotationPoint(-5.8F, 0.0F, 0.1F);
        this.rWing02.addBox(-5.8F, 0.0F, 0.0F, 13, 0, 12, 0.0F);
        this.setRotateAngle(rWing02, -0.091106186954104F, 0.8651597102135892F, 0.0F);
        this.neck02 = new ModelRenderer(this, 0, 42);
        this.neck02.setRotationPoint(0.0F, -0.1F, -1.1F);
        this.neck02.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(neck02, 0.18203784098300857F, 0.0F, 0.0F);
        this.tail04 = new ModelRenderer(this, 47, 8);
        this.tail04.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.tail04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.UpperBeak02 = new ModelRenderer(this, 32, 16);
        this.UpperBeak02.mirror = true;
        this.UpperBeak02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpperBeak02.addBox(-1.1F, -1.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(UpperBeak02, 0.0F, -0.22759093446006054F, 0.0F);
        this.lArm02d = new ModelRenderer(this, 38, 36);
        this.lArm02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArm02d.addBox(0.3F, -0.25F, -0.05F, 10, 1, 1, 0.0F);
        this.stomach = new ModelRenderer(this, 0, 12);
        this.stomach.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.stomach.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(stomach, 0.27314402793711257F, 0.0F, 0.0F);
        this.rWing01 = new ModelRenderer(this, 22, 40);
        this.rWing01.mirror = true;
        this.rWing01.setRotationPoint(-9.3F, 0.0F, 0.0F);
        this.rWing01.addBox(-1.0F, 0.0F, -0.0F, 2, 0, 5, 0.0F);
        this.setRotateAngle(rWing01, 0.0F, 0.36425021489121656F, 0.0F);
        this.spineBone04 = new ModelRenderer(this, 71, 17);
        this.spineBone04.setRotationPoint(0.0F, -0.4F, 1.9F);
        this.spineBone04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spineBone04, -0.18203784098300857F, 0.0F, 0.0F);
        this.lowerBeak01 = new ModelRenderer(this, 17, 21);
        this.lowerBeak01.setRotationPoint(0.0F, 0.2F, -1.2F);
        this.lowerBeak01.addBox(0.2F, -0.1F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lowerBeak01, 0.136659280431156F, 0.136659280431156F, 0.0F);
        this.lowerBeak02 = new ModelRenderer(this, 17, 21);
        this.lowerBeak02.mirror = true;
        this.lowerBeak02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerBeak02.addBox(-1.1F, -0.1F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lowerBeak02, 0.0F, -0.22759093446006054F, 0.0F);
        this.crest02a = new ModelRenderer(this, 53, 17);
        this.crest02a.setRotationPoint(0.0F, 0.0F, 1.7F);
        this.crest02a.addBox(-0.75F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(crest02a, -0.31869712141416456F, 0.0F, 0.0F);
        this.rArm02c = new ModelRenderer(this, 15, 36);
        this.rArm02c.mirror = true;
        this.rArm02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArm02c.addBox(-10.3F, -0.25F, -0.55F, 10, 1, 1, 0.0F);
        this.spineBone02 = new ModelRenderer(this, 71, 17);
        this.spineBone02.setRotationPoint(0.0F, 0.3F, 1.6F);
        this.spineBone02.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(spineBone02, -0.31869712141416456F, 0.0F, 0.0F);
        this.lLeg02c = new ModelRenderer(this, 12, 53);
        this.lLeg02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lLeg02c.addBox(0.1F, -0.25F, -0.7F, 5, 1, 1, 0.0F);
        this.lArm03 = new ModelRenderer(this, 34, 25);
        this.lArm03.setRotationPoint(7.0F, 0.0F, 0.1F);
        this.lArm03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(lArm03, 0.0F, 0.31869712141416456F, 0.0F);
        this.lArm02b = new ModelRenderer(this, 38, 33);
        this.lArm02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArm02b.addBox(0.3F, -0.75F, -0.05F, 10, 1, 1, 0.0F);
        this.spineMembrane = new ModelRenderer(this, 71, 17);
        this.spineMembrane.setRotationPoint(0.0F, 0.3F, -0.2F);
        this.spineMembrane.addBox(0.0F, -3.0F, -0.5F, 0, 3, 6, 0.0F);
        this.setRotateAngle(spineMembrane, -0.31869712141416456F, 0.0F, 0.0F);
        this.tail02c = new ModelRenderer(this, 21, 8);
        this.tail02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail02c.addBox(-0.25F, -0.25F, 0.0F, 1, 1, 5, 0.0F);
        this.rLeg02c = new ModelRenderer(this, 12, 53);
        this.rLeg02c.mirror = true;
        this.rLeg02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rLeg02c.addBox(-5.1F, -0.25F, -0.7F, 5, 1, 1, 0.0F);
        this.lArm02c = new ModelRenderer(this, 15, 36);
        this.lArm02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArm02c.addBox(0.3F, -0.25F, -0.55F, 10, 1, 1, 0.0F);
        this.UpperBeak03 = new ModelRenderer(this, 34, 21);
        this.UpperBeak03.setRotationPoint(0.3F, -0.45F, -2.3F);
        this.UpperBeak03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(UpperBeak03, 0.0F, -0.136659280431156F, 0.0F);
        this.tail02a = new ModelRenderer(this, 21, 1);
        this.tail02a.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.tail02a.addBox(-0.25F, -0.75F, 0.0F, 1, 1, 5, 0.0F);
        this.lowerBeak03 = new ModelRenderer(this, 26, 22);
        this.lowerBeak03.setRotationPoint(0.3F, 0.35F, -2.3F);
        this.lowerBeak03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lowerBeak03, 0.0F, -0.136659280431156F, 0.0F);
        this.tail05 = new ModelRenderer(this, 50, 7);
        this.tail05.setRotationPoint(0.0F, 0.0F, 3.2F);
        this.tail05.addBox(-2.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F);
        this.lTeethLower = new ModelRenderer(this, 73, 31);
        this.lTeethLower.setRotationPoint(0.9F, -0.6F, -4.0F);
        this.lTeethLower.addBox(0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F);
        this.neck01a = new ModelRenderer(this, 0, 30);
        this.neck01a.setRotationPoint(0.0F, -0.2F, 0.1F);
        this.neck01a.addBox(-1.3F, -1.2F, -1.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(neck01a, -0.091106186954104F, 0.0F, 0.0F);
        this.neck01c = new ModelRenderer(this, 0, 36);
        this.neck01c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck01c.addBox(-1.3F, 0.3F, -1.5F, 2, 1, 2, 0.0F);
        this.head01 = new ModelRenderer(this, 20, 16);
        this.head01.setRotationPoint(0.0F, -0.1F, -1.5F);
        this.head01.addBox(-1.4F, -1.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(head01, 0.27314402793711257F, 0.0F, 0.0F);
        this.UpperBeak01 = new ModelRenderer(this, 32, 16);
        this.UpperBeak01.setRotationPoint(0.0F, 0.6F, -1.5F);
        this.UpperBeak01.addBox(0.2F, -1.0F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(UpperBeak01, 0.136659280431156F, 0.136659280431156F, 0.0F);
        this.lArm02a = new ModelRenderer(this, 15, 33);
        this.lArm02a.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.lArm02a.addBox(0.3F, -0.75F, -0.55F, 10, 1, 1, 0.0F);
        this.setRotateAngle(lArm02a, 0.0F, 0.27314402793711257F, 0.0F);
        this.lLeg02b = new ModelRenderer(this, 12, 50);
        this.lLeg02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lLeg02b.addBox(0.1F, -0.75F, -0.2F, 5, 1, 1, 0.0F);
        this.rLeg04 = new ModelRenderer(this, 35, 26);
        this.rLeg04.mirror = true;
        this.rLeg04.setRotationPoint(0.0F, 0.0F, 0.2F);
        this.rLeg04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rLeg04, 0.0F, -0.5462880558742251F, 0.0F);
        this.lLeg03 = new ModelRenderer(this, 12, 59);
        this.lLeg03.setRotationPoint(4.8F, 0.0F, 0.1F);
        this.lLeg03.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(lLeg03, 0.0F, 0.31869712141416456F, 0.0F);
        this.rArm02a = new ModelRenderer(this, 15, 33);
        this.rArm02a.mirror = true;
        this.rArm02a.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.rArm02a.addBox(-10.3F, -0.75F, -0.55F, 10, 1, 1, 0.0F);
        this.setRotateAngle(rArm02a, 0.0F, -0.27314402793711257F, 0.0F);
        this.rFinger02 = new ModelRenderer(this, 56, 45);
        this.rFinger02.mirror = true;
        this.rFinger02.setRotationPoint(-9.9F, -0.1F, -0.3F);
        this.rFinger02.addBox(-1.0F, 0.0F, -2.9F, 2, 0, 3, 0.0F);
        this.setRotateAngle(rFinger02, 0.0F, 0.22759093446006054F, 0.0F);
        this.lArm01 = new ModelRenderer(this, 18, 28);
        this.lArm01.setRotationPoint(1.2F, -0.3F, 1.5F);
        this.lArm01.addBox(0.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(lArm01, 0.18203784098300857F, 0.27314402793711257F, 0.0F);
        this.crest05 = new ModelRenderer(this, 60, 40);
        this.crest05.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.crest05.addBox(-0.5F, -2.4F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(crest05, 0.091106186954104F, 0.0F, 0.0F);
        this.lFinger02 = new ModelRenderer(this, 56, 45);
        this.lFinger02.setRotationPoint(9.9F, -0.1F, -0.3F);
        this.lFinger02.addBox(-1.0F, 0.0F, -2.9F, 2, 0, 3, 0.0F);
        this.setRotateAngle(lFinger02, 0.0F, 0.22759093446006054F, 0.0F);
        this.tail01 = new ModelRenderer(this, 0, 22);
        this.tail01.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.tail01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tail01, -0.045553093477052F, 0.0F, 0.0F);
        this.rArm03 = new ModelRenderer(this, 34, 25);
        this.rArm03.mirror = true;
        this.rArm03.setRotationPoint(-7.0F, 0.0F, 0.1F);
        this.rArm03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(rArm03, 0.0F, -0.31869712141416456F, 0.0F);
        this.rLeg02d = new ModelRenderer(this, 12, 56);
        this.rLeg02d.mirror = true;
        this.rLeg02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rLeg02d.addBox(-5.0F, -0.25F, -0.2F, 5, 1, 1, 0.0F);
        this.rWing03 = new ModelRenderer(this, 56, 3);
        this.rWing03.mirror = true;
        this.rWing03.setRotationPoint(-5.0F, 0.0F, 1.0F);
        this.rWing03.addBox(-1.9F, 0.0F, 0.0F, 9, 0, 12, 0.0F);
        this.setRotateAngle(rWing03, 0.22759093446006054F, 0.36425021489121656F, 0.0F);
        this.rArm04 = new ModelRenderer(this, 45, 26);
        this.rArm04.mirror = true;
        this.rArm04.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.rArm04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rArm04, 0.0F, 0.18203784098300857F, 0.0F);
        this.lWing01 = new ModelRenderer(this, 22, 40);
        this.lWing01.setRotationPoint(9.3F, 0.0F, 0.0F);
        this.lWing01.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F);
        this.setRotateAngle(lWing01, 0.0F, -0.36425021489121656F, 0.0F);
        this.lLeg01 = new ModelRenderer(this, 13, 41);
        this.lLeg01.setRotationPoint(-1.2F, 0.8F, 3.7F);
        this.lLeg01.addBox(0.0F, -1.0F, -0.8F, 4, 2, 2, 0.0F);
        this.setRotateAngle(lLeg01, -0.18203784098300857F, -0.6829473363053812F, 0.0F);
        this.rFinger01 = new ModelRenderer(this, 50, 45);
        this.rFinger01.mirror = true;
        this.rFinger01.setRotationPoint(-9.8F, 0.0F, 0.1F);
        this.rFinger01.addBox(-1.0F, 0.0F, -4.2F, 2, 0, 4, 0.0F);
        this.setRotateAngle(rFinger01, 0.0F, 1.1838568316277536F, 0.0F);
        this.lArm03.addChild(this.lArm04);
        this.rArm02a.addChild(this.rArm02b);
        this.chest.addChild(this.rArm01);
        this.lLeg02a.addChild(this.lLeg02d);
        this.head01.addChild(this.crest01);
        this.neck01a.addChild(this.neck01d);
        this.neck01a.addChild(this.neck01b);
        this.neck02.addChild(this.neck03);
        this.tail02a.addChild(this.tail03);
        this.rArm01.addChild(this.rLeg01);
        this.tail02a.addChild(this.tail02b);
        this.lArm02a.addChild(this.lWing02);
        this.lLeg01.addChild(this.lLeg02a);
        this.rLeg02a.addChild(this.rLeg02b);
        this.UpperBeak01.addChild(this.lTeethUpper);
        this.lLeg02a.addChild(this.lWing03);
        this.crest02a.addChild(this.crest02b);
        this.rArm02a.addChild(this.rArm02d);
        this.rLeg01.addChild(this.rLeg02a);
        this.lArm02a.addChild(this.lFinger01);
        this.crest02a.addChild(this.crest03);
        this.rLeg02a.addChild(this.rLeg03);
        this.lLeg03.addChild(this.lLeg04);
        this.UpperBeak02.addChild(this.rTeethUpper);
        this.tail02a.addChild(this.tail02d);
        this.lowerBeak02.addChild(this.rTeethLower);
        this.spineBone02.addChild(this.spineBone03);
        this.crest03.addChild(this.crest04);
        this.rArm02a.addChild(this.rWing02);
        this.neck01a.addChild(this.neck02);
        this.tail03.addChild(this.tail04);
        this.UpperBeak01.addChild(this.UpperBeak02);
        this.lArm02a.addChild(this.lArm02d);
        this.chest.addChild(this.stomach);
        this.rArm02a.addChild(this.rWing01);
        this.spineBone03.addChild(this.spineBone04);
        this.head01.addChild(this.lowerBeak01);
        this.lowerBeak01.addChild(this.lowerBeak02);
        this.crest01.addChild(this.crest02a);
        this.rArm02a.addChild(this.rArm02c);
        this.spineBone01.addChild(this.spineBone02);
        this.lLeg02a.addChild(this.lLeg02c);
        this.lArm02a.addChild(this.lArm03);
        this.lArm02a.addChild(this.lArm02b);
        this.spineBone01.addChild(this.spineMembrane);
        this.tail02a.addChild(this.tail02c);
        this.rLeg02a.addChild(this.rLeg02c);
        this.lArm02a.addChild(this.lArm02c);
        this.UpperBeak01.addChild(this.UpperBeak03);
        this.tail01.addChild(this.tail02a);
        this.lowerBeak01.addChild(this.lowerBeak03);
        this.tail04.addChild(this.tail05);
        this.lowerBeak01.addChild(this.lTeethLower);
        this.chest.addChild(this.neck01a);
        this.neck01a.addChild(this.neck01c);
        this.neck03.addChild(this.head01);
        this.head01.addChild(this.UpperBeak01);
        this.lArm01.addChild(this.lArm02a);
        this.lLeg02a.addChild(this.lLeg02b);
        this.rLeg03.addChild(this.rLeg04);
        this.lLeg02a.addChild(this.lLeg03);
        this.rArm01.addChild(this.rArm02a);
        this.rArm02a.addChild(this.rFinger02);
        this.chest.addChild(this.lArm01);
        this.head01.addChild(this.crest05);
        this.lArm02a.addChild(this.lFinger02);
        this.stomach.addChild(this.tail01);
        this.rArm02a.addChild(this.rArm03);
        this.rLeg02a.addChild(this.rLeg02d);
        this.rLeg02a.addChild(this.rWing03);
        this.rArm03.addChild(this.rArm04);
        this.lArm02a.addChild(this.lWing01);
        this.lArm01.addChild(this.lLeg01);
        this.rArm02a.addChild(this.rFinger01);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.spineBone01.offsetX, this.spineBone01.offsetY, this.spineBone01.offsetZ);
        GlStateManager.translate(this.spineBone01.rotationPointX * f5, this.spineBone01.rotationPointY * f5, this.spineBone01.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.5D, 0.4D);
        GlStateManager.translate(-this.spineBone01.offsetX, -this.spineBone01.offsetY, -this.spineBone01.offsetZ);
        GlStateManager.translate(-this.spineBone01.rotationPointX * f5, -this.spineBone01.rotationPointY * f5, -this.spineBone01.rotationPointZ * f5);
        this.spineBone01.render(f5);
        GlStateManager.popMatrix();
        this.chest.render(f5);
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
		this.rLeg01.rotateAngleZ = MathHelper.sin(par1 * 1.1F) * 0.667F * par2;
		this.rArm01.rotateAngleZ = MathHelper.sin(par1 * 1.1F) * 0.667F * par2;
		this.lLeg01.rotateAngleZ = -MathHelper.sin(par1 * 1.1F) * 0.667F * par2;
		this.lArm01.rotateAngleZ = -MathHelper.sin(par1 * 1.1F) * 0.667F * par2;
		this.lowerBeak01.rotateAngleX = MathHelper.sin(par1 * 0.01F) * 0.667F * par2 + 0.4F;
	}
}
