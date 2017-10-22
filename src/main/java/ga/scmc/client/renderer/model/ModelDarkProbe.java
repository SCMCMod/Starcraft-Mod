package ga.scmc.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * probe - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelDarkProbe extends ModelBase {
    public ModelRenderer body01;
    public ModelRenderer Visor01;
    public ModelRenderer horn01A;
    public ModelRenderer Visor02;
    public ModelRenderer lEye;
    public ModelRenderer rEye;
    public ModelRenderer lWing11B;
    public ModelRenderer rWing11B;
    public ModelRenderer curvedHorn01;
    public ModelRenderer lWing00;
    public ModelRenderer tail01;
    public ModelRenderer eyeShield;
    public ModelRenderer body02;
    public ModelRenderer bHorn01;
    public ModelRenderer rWing00;
    public ModelRenderer lWing01;
    public ModelRenderer lWing05;
    public ModelRenderer lWing03;
    public ModelRenderer lWing07;
    public ModelRenderer lWing02;
    public ModelRenderer lWing08;
    public ModelRenderer lWing04;
    public ModelRenderer lWing06;
    public ModelRenderer lWing09;
    public ModelRenderer lWing11;
    public ModelRenderer lWing10;
    public ModelRenderer lWing12;
    public ModelRenderer tail02;
    public ModelRenderer tail05;
    public ModelRenderer tail03;
    public ModelRenderer tail04;
    public ModelRenderer tail06;
    public ModelRenderer eye;
    public ModelRenderer rWing01;
    public ModelRenderer rWing05;
    public ModelRenderer rWing03;
    public ModelRenderer rWing07;
    public ModelRenderer rWing02;
    public ModelRenderer rWing08;
    public ModelRenderer rWing04;
    public ModelRenderer rWing06;
    public ModelRenderer rWing09;
    public ModelRenderer rWing11;
    public ModelRenderer rWing10;
    public ModelRenderer rWing12;
    public ModelRenderer horn02A;
    public ModelRenderer horn03A;
    public ModelRenderer horn01B;
    public ModelRenderer horn04;
    public ModelRenderer horn02B;
    public ModelRenderer horn03B;
    public ModelRenderer lWing12B;
    public ModelRenderer rWing12B;
    public ModelRenderer curvedHorn02;

    public ModelDarkProbe() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.curvedHorn01 = new ModelRenderer(this, 13, 52);
        this.curvedHorn01.setRotationPoint(0.0F, 8.0F, -1.3F);
        this.curvedHorn01.addBox(-0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(curvedHorn01, -0.18203784098300857F, 0.0F, 0.0F);
        this.eye = new ModelRenderer(this, 0, 52);
        this.eye.setRotationPoint(0.0F, 0.1F, -1.4F);
        this.eye.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
        this.rWing02 = new ModelRenderer(this, 33, 42);
        this.rWing02.mirror = true;
        this.rWing02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWing02.addBox(0.01F, -2.3F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rWing02, 0.7853981633974483F, 0.0F, 0.0F);
        this.horn04 = new ModelRenderer(this, 37, 7);
        this.horn04.setRotationPoint(0.0F, 0.1F, -1.9F);
        this.horn04.addBox(-0.5F, -0.5F, -0.7F, 1, 1, 1, 0.0F);
        this.setRotateAngle(horn04, 0.6829473363053812F, 0.0F, 0.0F);
        this.horn03A = new ModelRenderer(this, 29, 13);
        this.horn03A.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.horn03A.addBox(-1.0F, -0.5F, 0.0F, 2, 2, 3, 0.0F);
        this.rWing12B = new ModelRenderer(this, 40, 48);
        this.rWing12B.mirror = true;
        this.rWing12B.setRotationPoint(0.0F, 4.1F, -0.4F);
        this.rWing12B.addBox(-0.51F, 0.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rWing12B, -0.40980330836826856F, 0.0F, 0.0F);
        this.lWing07 = new ModelRenderer(this, 33, 42);
        this.lWing07.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWing07.addBox(0.0F, -2.2F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lWing07, -1.5707963267948966F, 0.0F, 0.0F);
        this.rWing10 = new ModelRenderer(this, 42, 44);
        this.rWing10.mirror = true;
        this.rWing10.setRotationPoint(0.3F, -2.4F, -0.1F);
        this.rWing10.addBox(-0.7F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.lWing09 = new ModelRenderer(this, 42, 37);
        this.lWing09.setRotationPoint(0.1F, -0.9F, 1.1F);
        this.lWing09.addBox(-0.5F, -2.5F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotateAngle(lWing09, -0.9560913642424937F, 0.27314402793711257F, 0.31869712141416456F);
        this.rEye = new ModelRenderer(this, 0, 52);
        this.rEye.setRotationPoint(-1.4F, 11.0F, -5.9F);
        this.rEye.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(rEye, 0.0F, 0.40980330836826856F, 0.045553093477052F);
        this.bHorn01 = new ModelRenderer(this, 13, 37);
        this.bHorn01.setRotationPoint(0.0F, 2.0F, -4.8F);
        this.bHorn01.addBox(-1.5F, 0.0F, -1.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(bHorn01, 0.22759093446006054F, 0.0F, 0.0F);
        this.rWing07 = new ModelRenderer(this, 33, 42);
        this.rWing07.mirror = true;
        this.rWing07.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWing07.addBox(0.0F, -2.2F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rWing07, -1.5707963267948966F, 0.0F, 0.0F);
        this.tail06 = new ModelRenderer(this, 0, 38);
        this.tail06.setRotationPoint(0.0F, 0.3F, 1.8F);
        this.tail06.addBox(-1.0F, -0.5F, 0.2F, 2, 1, 2, 0.0F);
        this.setRotateAngle(tail06, 0.045553093477052F, 0.0F, 0.0F);
        this.rWing06 = new ModelRenderer(this, 33, 42);
        this.rWing06.mirror = true;
        this.rWing06.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWing06.addBox(0.01F, -2.3F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rWing06, -2.356194490192345F, 0.0F, 0.0F);
        this.rWing01 = new ModelRenderer(this, 33, 42);
        this.rWing01.mirror = true;
        this.rWing01.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWing01.addBox(0.0F, -2.2F, -1.0F, 1, 1, 2, 0.0F);
        this.rWing05 = new ModelRenderer(this, 33, 42);
        this.rWing05.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWing05.addBox(0.0F, 1.2F, -1.0F, 1, 1, 2, 0.0F);
        this.lWing04 = new ModelRenderer(this, 33, 42);
        this.lWing04.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWing04.addBox(-0.01F, -2.3F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lWing04, 2.356194490192345F, 0.0F, 0.0F);
        this.tail05 = new ModelRenderer(this, 15, 13);
        this.tail05.setRotationPoint(-0.07F, -1.0F, -1.0F);
        this.tail05.addBox(-0.5F, -0.6F, 0.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tail05, -0.18203784098300857F, 0.18203784098300857F, 0.7853981633974483F);
        this.lWing11 = new ModelRenderer(this, 33, 48);
        this.lWing11.setRotationPoint(0.0F, 1.3F, 0.6F);
        this.lWing11.addBox(-0.5F, -0.3F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(lWing11, 0.31869712141416456F, 0.091106186954104F, -0.5918411493512771F);
        this.rWing09 = new ModelRenderer(this, 42, 37);
        this.rWing09.mirror = true;
        this.rWing09.setRotationPoint(0.9F, -0.9F, 1.1F);
        this.rWing09.addBox(-0.5F, -2.5F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotateAngle(rWing09, -1.0016444577195458F, -0.27314402793711257F, -0.31869712141416456F);
        this.horn01A = new ModelRenderer(this, 29, 0);
        this.horn01A.setRotationPoint(0.0F, 8.6F, -5.5F);
        this.horn01A.addBox(-1.5F, -0.5F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(horn01A, 0.4553564018453205F, 0.0F, 0.0F);
        this.body02 = new ModelRenderer(this, 0, 12);
        this.body02.setRotationPoint(0.0F, -1.4F, -3.6F);
        this.body02.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(body02, 0.6373942428283291F, 0.0F, 0.0F);
        this.rWing12 = new ModelRenderer(this, 40, 48);
        this.rWing12.mirror = true;
        this.rWing12.setRotationPoint(0.0F, 4.1F, -0.4F);
        this.rWing12.addBox(-0.51F, 0.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rWing12, -0.40980330836826856F, 0.0F, 0.0F);
        this.lEye = new ModelRenderer(this, 0, 52);
        this.lEye.setRotationPoint(1.4F, 11.0F, -5.9F);
        this.lEye.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(lEye, 0.0F, -0.40980330836826856F, -0.045553093477052F);
        this.rWing08 = new ModelRenderer(this, 33, 42);
        this.rWing08.mirror = true;
        this.rWing08.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWing08.addBox(0.01F, -2.3F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rWing08, -0.7853981633974483F, 0.0F, 0.0F);
        this.horn02A = new ModelRenderer(this, 28, 7);
        this.horn02A.setRotationPoint(-0.0F, -0.0F, 0.2F);
        this.horn02A.addBox(-1.0F, -0.5F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(horn02A, 0.40980330836826856F, 0.0F, 0.0F);
        this.lWing02 = new ModelRenderer(this, 33, 42);
        this.lWing02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWing02.addBox(-0.01F, -2.3F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lWing02, 0.7853981633974483F, 0.0F, 0.0F);
        this.lWing12B = new ModelRenderer(this, 40, 48);
        this.lWing12B.setRotationPoint(0.0F, 4.1F, -0.4F);
        this.lWing12B.addBox(-0.51F, 0.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lWing12B, -0.40980330836826856F, 0.0F, 0.0F);
        this.eyeShield = new ModelRenderer(this, 0, 47);
        this.eyeShield.setRotationPoint(0.0F, 0.1F, -4.4F);
        this.eyeShield.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 1, 0.0F);
        this.tail01 = new ModelRenderer(this, 0, 19);
        this.tail01.setRotationPoint(0.0F, -1.5F, -0.4F);
        this.tail01.addBox(-1.0F, 0.0F, -0.6F, 2, 1, 5, 0.0F);
        this.tail04 = new ModelRenderer(this, 9, 33);
        this.tail04.setRotationPoint(0.0F, -0.1F, 1.9F);
        this.tail04.addBox(-1.0F, -0.6F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(tail04, -0.136659280431156F, 0.0F, 0.0F);
        this.lWing11B = new ModelRenderer(this, 33, 48);
        this.lWing11B.setRotationPoint(2.3F, 14.3F, -3.8F);
        this.lWing11B.addBox(-0.5F, -0.3F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(lWing11B, -0.18203784098300857F, -0.136659280431156F, -0.5918411493512771F);
        this.lWing01 = new ModelRenderer(this, 33, 42);
        this.lWing01.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWing01.addBox(0.0F, -2.2F, -1.0F, 1, 1, 2, 0.0F);
        this.tail02 = new ModelRenderer(this, 0, 26);
        this.tail02.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.tail02.addBox(-1.5F, 0.7F, 0.2F, 3, 2, 4, 0.0F);
        this.setRotateAngle(tail02, 0.091106186954104F, 0.0F, 0.0F);
        this.Visor02 = new ModelRenderer(this, 39, 25);
        this.Visor02.setRotationPoint(0.0F, 9.9F, -4.6F);
        this.Visor02.addBox(-3.0F, -0.41F, -0.5F, 6, 1, 6, 0.0F);
        this.lWing12 = new ModelRenderer(this, 40, 48);
        this.lWing12.setRotationPoint(0.0F, 4.1F, -0.4F);
        this.lWing12.addBox(-0.51F, 0.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lWing12, -0.40980330836826856F, 0.0F, 0.0F);
        this.Visor01 = new ModelRenderer(this, 28, 23);
        this.Visor01.setRotationPoint(0.0F, 9.9F, -5.1F);
        this.Visor01.addBox(-2.0F, -0.5F, -2.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(Visor01, 0.136659280431156F, -0.7853981633974483F, -0.091106186954104F);
        this.horn02B = new ModelRenderer(this, 47, 6);
        this.horn02B.setRotationPoint(0.0F, 1.0F, -0.7F);
        this.horn02B.addBox(-1.5F, -1.5F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(horn02B, 0.0F, 0.0F, 0.7853981633974483F);
        this.rWing04 = new ModelRenderer(this, 33, 42);
        this.rWing04.mirror = true;
        this.rWing04.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWing04.addBox(0.01F, -2.3F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rWing04, 2.356194490192345F, 0.0F, 0.0F);
        this.tail03 = new ModelRenderer(this, 0, 32);
        this.tail03.setRotationPoint(0.0F, 1.7F, 3.5F);
        this.tail03.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
        this.lWing03 = new ModelRenderer(this, 33, 42);
        this.lWing03.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWing03.addBox(0.0F, -2.2F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lWing03, 1.5707963267948966F, 0.0F, 0.0F);
        this.horn03B = new ModelRenderer(this, 45, 10);
        this.horn03B.setRotationPoint(0.0F, 0.4F, 1.9F);
        this.horn03B.addBox(-1.0F, -1.0F, -2.2F, 1, 1, 4, 0.0F);
        this.setRotateAngle(horn03B, 0.0F, 0.0F, 0.7853981633974483F);
        this.lWing00 = new ModelRenderer(this, 34, 35);
        this.lWing00.setRotationPoint(2.0F, 0.7F, -3.2F);
        this.lWing00.addBox(0.9F, -1.5F, -1.5F, 0, 3, 3, 0.0F);
        this.rWing11B = new ModelRenderer(this, 33, 48);
        this.rWing11B.mirror = true;
        this.rWing11B.setRotationPoint(-2.3F, 14.3F, -3.8F);
        this.rWing11B.addBox(-0.5F, -0.3F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(rWing11B, -0.18203784098300857F, 0.136659280431156F, 0.5918411493512771F);
        this.rWing00 = new ModelRenderer(this, 34, 35);
        this.rWing00.setRotationPoint(-3.0F, 0.6F, -3.2F);
        this.rWing00.addBox(0.1F, -1.5F, -1.5F, 0, 3, 3, 0.0F);
        this.lWing06 = new ModelRenderer(this, 33, 42);
        this.lWing06.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWing06.addBox(-0.01F, -2.3F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lWing06, -2.356194490192345F, 0.0F, 0.0F);
        this.lWing08 = new ModelRenderer(this, 33, 42);
        this.lWing08.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWing08.addBox(-0.01F, -2.3F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lWing08, -0.7853981633974483F, 0.0F, 0.0F);
        this.horn01B = new ModelRenderer(this, 45, 0);
        this.horn01B.setRotationPoint(0.0F, 0.3F, 1.9F);
        this.horn01B.addBox(-1.0F, -1.0F, -2.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(horn01B, 0.0F, 0.0F, 0.7853981633974483F);
        this.curvedHorn02 = new ModelRenderer(this, 13, 58);
        this.curvedHorn02.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.curvedHorn02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(curvedHorn02, 0.4553564018453205F, 0.0F, 0.0F);
        this.rWing03 = new ModelRenderer(this, 33, 42);
        this.rWing03.mirror = true;
        this.rWing03.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rWing03.addBox(0.0F, -2.2F, -1.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rWing03, 1.5707963267948966F, 0.0F, 0.0F);
        this.body01 = new ModelRenderer(this, 0, 0);
        this.body01.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.body01.addBox(-2.0F, -2.5F, -6.0F, 4, 5, 6, 0.0F);
        this.lWing05 = new ModelRenderer(this, 33, 42);
        this.lWing05.mirror = true;
        this.lWing05.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lWing05.addBox(0.0F, 1.2F, -1.0F, 1, 1, 2, 0.0F);
        this.lWing10 = new ModelRenderer(this, 42, 44);
        this.lWing10.setRotationPoint(0.1F, -2.4F, -0.1F);
        this.lWing10.addBox(-0.7F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.rWing11 = new ModelRenderer(this, 33, 48);
        this.rWing11.mirror = true;
        this.rWing11.setRotationPoint(1.0F, 1.3F, 0.6F);
        this.rWing11.addBox(-0.5F, -0.3F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(rWing11, 0.31869712141416456F, -0.091106186954104F, 0.5918411493512771F);
        this.eyeShield.addChild(this.eye);
        this.rWing00.addChild(this.rWing02);
        this.horn02A.addChild(this.horn04);
        this.horn01A.addChild(this.horn03A);
        this.rWing11B.addChild(this.rWing12B);
        this.lWing00.addChild(this.lWing07);
        this.rWing09.addChild(this.rWing10);
        this.lWing00.addChild(this.lWing09);
        this.body01.addChild(this.bHorn01);
        this.rWing00.addChild(this.rWing07);
        this.tail03.addChild(this.tail06);
        this.rWing00.addChild(this.rWing06);
        this.rWing00.addChild(this.rWing01);
        this.rWing00.addChild(this.rWing05);
        this.lWing00.addChild(this.lWing04);
        this.tail01.addChild(this.tail05);
        this.lWing00.addChild(this.lWing11);
        this.rWing00.addChild(this.rWing09);
        this.body01.addChild(this.body02);
        this.rWing11.addChild(this.rWing12);
        this.rWing00.addChild(this.rWing08);
        this.horn01A.addChild(this.horn02A);
        this.lWing00.addChild(this.lWing02);
        this.lWing11B.addChild(this.lWing12B);
        this.body01.addChild(this.eyeShield);
        this.body01.addChild(this.tail01);
        this.tail03.addChild(this.tail04);
        this.lWing00.addChild(this.lWing01);
        this.tail01.addChild(this.tail02);
        this.lWing11.addChild(this.lWing12);
        this.horn02A.addChild(this.horn02B);
        this.rWing00.addChild(this.rWing04);
        this.tail02.addChild(this.tail03);
        this.lWing00.addChild(this.lWing03);
        this.horn03A.addChild(this.horn03B);
        this.body01.addChild(this.lWing00);
        this.body01.addChild(this.rWing00);
        this.lWing00.addChild(this.lWing06);
        this.lWing00.addChild(this.lWing08);
        this.horn01A.addChild(this.horn01B);
        this.curvedHorn01.addChild(this.curvedHorn02);
        this.rWing00.addChild(this.rWing03);
        this.lWing00.addChild(this.lWing05);
        this.lWing09.addChild(this.lWing10);
        this.rWing00.addChild(this.rWing11);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.curvedHorn01.offsetX, this.curvedHorn01.offsetY, this.curvedHorn01.offsetZ);
        GlStateManager.translate(this.curvedHorn01.rotationPointX * f5, this.curvedHorn01.rotationPointY * f5, this.curvedHorn01.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.5D, 1.0D);
        GlStateManager.translate(-this.curvedHorn01.offsetX, -this.curvedHorn01.offsetY, -this.curvedHorn01.offsetZ);
        GlStateManager.translate(-this.curvedHorn01.rotationPointX * f5, -this.curvedHorn01.rotationPointY * f5, -this.curvedHorn01.rotationPointZ * f5);
        this.curvedHorn01.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rEye.offsetX, this.rEye.offsetY, this.rEye.offsetZ);
        GlStateManager.translate(this.rEye.rotationPointX * f5, this.rEye.rotationPointY * f5, this.rEye.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.6D);
        GlStateManager.translate(-this.rEye.offsetX, -this.rEye.offsetY, -this.rEye.offsetZ);
        GlStateManager.translate(-this.rEye.rotationPointX * f5, -this.rEye.rotationPointY * f5, -this.rEye.rotationPointZ * f5);
        this.rEye.render(f5);
        GlStateManager.popMatrix();
        this.horn01A.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.lEye.offsetX, this.lEye.offsetY, this.lEye.offsetZ);
        GlStateManager.translate(this.lEye.rotationPointX * f5, this.lEye.rotationPointY * f5, this.lEye.rotationPointZ * f5);
        GlStateManager.scale(0.4D, 0.4D, 0.6D);
        GlStateManager.translate(-this.lEye.offsetX, -this.lEye.offsetY, -this.lEye.offsetZ);
        GlStateManager.translate(-this.lEye.rotationPointX * f5, -this.lEye.rotationPointY * f5, -this.lEye.rotationPointZ * f5);
        this.lEye.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.lWing11B.offsetX, this.lWing11B.offsetY, this.lWing11B.offsetZ);
        GlStateManager.translate(this.lWing11B.rotationPointX * f5, this.lWing11B.rotationPointY * f5, this.lWing11B.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 0.6D, 0.6D);
        GlStateManager.translate(-this.lWing11B.offsetX, -this.lWing11B.offsetY, -this.lWing11B.offsetZ);
        GlStateManager.translate(-this.lWing11B.rotationPointX * f5, -this.lWing11B.rotationPointY * f5, -this.lWing11B.rotationPointZ * f5);
        this.lWing11B.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Visor02.offsetX, this.Visor02.offsetY, this.Visor02.offsetZ);
        GlStateManager.translate(this.Visor02.rotationPointX * f5, this.Visor02.rotationPointY * f5, this.Visor02.rotationPointZ * f5);
        GlStateManager.scale(0.95D, 1.0D, 1.0D);
        GlStateManager.translate(-this.Visor02.offsetX, -this.Visor02.offsetY, -this.Visor02.offsetZ);
        GlStateManager.translate(-this.Visor02.rotationPointX * f5, -this.Visor02.rotationPointY * f5, -this.Visor02.rotationPointZ * f5);
        this.Visor02.render(f5);
        GlStateManager.popMatrix();
        this.Visor01.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rWing11B.offsetX, this.rWing11B.offsetY, this.rWing11B.offsetZ);
        GlStateManager.translate(this.rWing11B.rotationPointX * f5, this.rWing11B.rotationPointY * f5, this.rWing11B.rotationPointZ * f5);
        GlStateManager.scale(0.6D, 0.6D, 0.6D);
        GlStateManager.translate(-this.rWing11B.offsetX, -this.rWing11B.offsetY, -this.rWing11B.offsetZ);
        GlStateManager.translate(-this.rWing11B.rotationPointX * f5, -this.rWing11B.rotationPointY * f5, -this.rWing11B.rotationPointZ * f5);
        this.rWing11B.render(f5);
        GlStateManager.popMatrix();
        this.body01.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}