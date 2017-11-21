package ga.scmc.client.renderer.model.armor;

import ga.scmc.client.renderer.model.IArmorItem;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHandSide;
import ocelot.api.utils.ModelUtils;

/**
 * zergArmorT3 v3 - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelZergArmorT3 extends ModelArmorBase implements IArmorItem {

	public ModelRenderer chestplate_spike01a;
	public ModelRenderer chestplate_spike02a;
	public ModelRenderer chestplate_spike03a;
	public ModelRenderer chestplate_spike04a;
	public ModelRenderer chestplate_rArmCarapace;
	public ModelRenderer chestplate_rKnuckle01;
	public ModelRenderer chestplate_rKnuckle02;
	public ModelRenderer chestplate_rShoulderCarapace;
	public ModelRenderer chestplate_rClaws;
	public ModelRenderer chestplate_rArmCarapace_1;
	public ModelRenderer boots_rFlesh01;
	public ModelRenderer leggings_rLegCarapace;
	public ModelRenderer boots_rClaw01a;
	public ModelRenderer boots_rClaw02a;
	public ModelRenderer boots_rClaw01a_1;
	public ModelRenderer boots_rClaw02a_1;
	public ModelRenderer helmet_crest01;
	public ModelRenderer helmet_crest02;
	public ModelRenderer helmet_crest03;
	public ModelRenderer helmet_crestVisor01;
	public ModelRenderer helmet_lCrest01;
	public ModelRenderer helmet_rCrest01;
	public ModelRenderer helmet_crestSupport;
	public ModelRenderer helmet_lCrest02;
	public ModelRenderer helmet_lCrest03;
	public ModelRenderer helmet_rCrest02;
	public ModelRenderer helmet_rCrest03;
	public ModelRenderer helmet_crestVisor02;
	public ModelRenderer helmet_crestVisor03;
	public ModelRenderer chestplate_lHookArm01;
	public ModelRenderer chestplate_spine;
	public ModelRenderer chestplate_rHookArm01;
	public ModelRenderer chestplate_spike01b;
	public ModelRenderer chestplate_chestCarapace01;
	public ModelRenderer chestplate_rBodyCarapace;
	public ModelRenderer chestplate_lBodyCarapace;
	public ModelRenderer chestplate_lHookArm02;
	public ModelRenderer chestplate_lHookArm03;
	public ModelRenderer chestplate_lHookClaw01a;
	public ModelRenderer chestplate_lHookClaw02a;
	public ModelRenderer chestplate_lHookClaw03;
	public ModelRenderer chestplate_lHookClaw01b;
	public ModelRenderer chestplate_lHookClaw01c;
	public ModelRenderer chestplate_lHookClaw02b;
	public ModelRenderer chestplate_spine02;
	public ModelRenderer chestplate_rHookArm02;
	public ModelRenderer chestplate_rHookArm03;
	public ModelRenderer chestplate_rHookClaw01a;
	public ModelRenderer chestplate_rHookClaw02a;
	public ModelRenderer chestplate_rHookClaw03;
	public ModelRenderer chestplate_rHookClaw01b;
	public ModelRenderer chestplate_rHookClaw01c;
	public ModelRenderer chestplate_rHookClaw02b;
	public ModelRenderer chestplate_chestCarapace02;
	public ModelRenderer chestplate_lKnuckle01;
	public ModelRenderer chestplate_lKnuckle02;
	public ModelRenderer chestplate_lArmCarapace;
	public ModelRenderer chestplate_lShoulderCarapace;
	public ModelRenderer chestplate_lClaws;
	public ModelRenderer chestplate_lArmCarapace_1;
	public ModelRenderer boots_lFlesh01;
	public ModelRenderer leggings_lLegCarapace;
	public ModelRenderer boots_lClaw01a;
	public ModelRenderer boots_lClaw02a;
	public ModelRenderer boots_lClaw01a_1;
	public ModelRenderer boots_lClaw02a_1;
	public ModelRenderer chestplate_spike02b;
	public ModelRenderer chestplate_spike03b;
	public ModelRenderer chestplate_spike04b;

	public ModelZergArmorT3(float modelSize) {
		super(modelSize, 128, 64);
		this.helmet_crest01 = new ModelRenderer(this, 23, 48);
		this.helmet_crest01.setRotationPoint(0.0F, -5.7F, 1.9F);
		this.helmet_crest01.addBox(-4.0F, -3.8F, -5.2F, 8, 2, 7, 0.0F);
		this.setRotateAngle(helmet_crest01, 0.22759093446006054F, 0.0F, 0.0F);
		this.helmet_lCrest01 = new ModelRenderer(this, 83, 50);
		this.helmet_lCrest01.setRotationPoint(-3.2F, -0.77F, 6.4F);
		this.helmet_lCrest01.addBox(-2.0F, -0.1F, -2.8F, 3, 2, 5, 0.0F);
		this.setRotateAngle(helmet_lCrest01, -0.045553093477052F, -0.27314402793711257F, 0.0F);
		this.helmet_crestVisor02 = new ModelRenderer(this, 71, 3);
		this.helmet_crestVisor02.setRotationPoint(0.0F, 0.8F, -0.0F);
		this.helmet_crestVisor02.addBox(-2.5F, 0.0F, -0.5F, 5, 1, 1, 0.0F);
		this.setRotateAngle(helmet_crestVisor02, 0.36425021489121656F, 0.0F, 0.0F);
		this.chestplate_lHookArm01 = new ModelRenderer(this, 0, 35);
		this.chestplate_lHookArm01.setRotationPoint(2.8F, 1.9F, 0.2F);
		this.chestplate_lHookArm01.addBox(-1.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(chestplate_lHookArm01, -0.6373942428283291F, 0.40980330836826856F, 0.36425021489121656F);
		this.chestplate_lKnuckle01 = new ModelRenderer(this, 83, 17);
		this.chestplate_lKnuckle01.setRotationPoint(2.3F, 9.3F, -0.1F);
		this.chestplate_lKnuckle01.addBox(0.0F, -1.0F, -2.0F, 1, 2, 4, 0.0F);
		this.setRotateAngle(chestplate_lKnuckle01, 0.0F, 0.0F, 0.7285004297824331F);
		this.chestplate_spike04a = new ModelRenderer(this, 51, 39);
		this.chestplate_spike04a.setRotationPoint(-0.1F, 8.0F, 2.7F);
		this.chestplate_spike04a.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(chestplate_spike04a, -0.18203784098300857F, 0.18203784098300857F, 0.7853981633974483F);
		this.chestplate_lArmCarapace_1 = new ModelRenderer(this, 109, 4);
		this.chestplate_lArmCarapace_1.mirror = true;
		this.chestplate_lArmCarapace_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_lArmCarapace_1.addBox(2.2F, 0.4F, -2.5F, 1, 3, 5, 0.0F);
		this.chestplate_lHookClaw01a = new ModelRenderer(this, 47, 36);
		this.chestplate_lHookClaw01a.setRotationPoint(0.0F, -5.1F, 0.0F);
		this.chestplate_lHookClaw01a.addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
		this.setRotateAngle(chestplate_lHookClaw01a, -0.36425021489121656F, 0.36425021489121656F, 0.7853981633974483F);
		this.chestplate_rHookClaw01a = new ModelRenderer(this, 47, 36);
		this.chestplate_rHookClaw01a.setRotationPoint(0.0F, -5.1F, 0.0F);
		this.chestplate_rHookClaw01a.addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
		this.setRotateAngle(chestplate_rHookClaw01a, -0.36425021489121656F, 0.36425021489121656F, 0.7853981633974483F);
		this.boots_rClaw02a_1 = new ModelRenderer(this, 51, 39);
		this.boots_rClaw02a_1.setRotationPoint(0.2F, 0.0F, -1.1F);
		this.boots_rClaw02a_1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(boots_rClaw02a_1, 0.091106186954104F, 0.0F, 0.0F);
		this.chestplate_rHookArm02 = new ModelRenderer(this, 10, 39);
		this.chestplate_rHookArm02.mirror = true;
		this.chestplate_rHookArm02.setRotationPoint(0.0F, -6.9F, 1.2F);
		this.chestplate_rHookArm02.addBox(-1.5F, -3.5F, -1.5F, 3, 4, 3, 0.0F);
		this.setRotateAngle(chestplate_rHookArm02, 0.5009094953223726F, 0.27314402793711257F, 0.0F);
		this.boots_rClaw02a = new ModelRenderer(this, 50, 38);
		this.boots_rClaw02a.setRotationPoint(0.4F, 1.9F, -1.2F);
		this.boots_rClaw02a.addBox(-0.9F, -1.0F, -2.1F, 2, 2, 2, 0.0F);
		this.setRotateAngle(boots_rClaw02a, 0.136659280431156F, -0.045553093477052F, 0.0F);
		this.chestplate_lHookArm03 = new ModelRenderer(this, 26, 35);
		this.chestplate_lHookArm03.setRotationPoint(0.0F, -2.8F, -0.1F);
		this.chestplate_lHookArm03.addBox(-2.0F, -7.0F, -2.0F, 4, 7, 4, 0.0F);
		this.setRotateAngle(chestplate_lHookArm03, 0.40980330836826856F, 0.0F, 0.0F);
		this.boots_lClaw02a_1 = new ModelRenderer(this, 51, 39);
		this.boots_lClaw02a_1.setRotationPoint(0.2F, 0.0F, -1.1F);
		this.boots_lClaw02a_1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(boots_lClaw02a_1, 0.091106186954104F, 0.0F, 0.0F);
		this.chestplate_lHookClaw01c = new ModelRenderer(this, 51, 38);
		this.chestplate_lHookClaw01c.setRotationPoint(-0.1F, -0.1F, -2.5F);
		this.chestplate_lHookClaw01c.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(chestplate_lHookClaw01c, 0.136659280431156F, -0.136659280431156F, 0.0F);
		this.chestplate_rHookArm03 = new ModelRenderer(this, 26, 35);
		this.chestplate_rHookArm03.mirror = true;
		this.chestplate_rHookArm03.setRotationPoint(0.0F, -2.8F, -0.1F);
		this.chestplate_rHookArm03.addBox(-2.0F, -7.0F, -2.0F, 4, 7, 4, 0.0F);
		this.setRotateAngle(chestplate_rHookArm03, 0.40980330836826856F, 0.0F, 0.0F);
		this.chestplate_spike01b = new ModelRenderer(this, 51, 39);
		this.chestplate_spike01b.setRotationPoint(0.0F, 1.7F, 3.9F);
		this.chestplate_spike01b.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(chestplate_spike01b, -0.31869712141416456F, 0.31869712141416456F, 0.7853981633974483F);
		this.chestplate_lHookArm02 = new ModelRenderer(this, 10, 39);
		this.chestplate_lHookArm02.setRotationPoint(0.0F, -6.9F, 1.2F);
		this.chestplate_lHookArm02.addBox(-1.5F, -3.5F, -1.5F, 3, 4, 3, 0.0F);
		this.setRotateAngle(chestplate_lHookArm02, 0.5009094953223726F, -0.27314402793711257F, 0.0F);
		this.chestplate_rArmCarapace_1 = new ModelRenderer(this, 109, 4);
		this.chestplate_rArmCarapace_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.chestplate_rArmCarapace_1.addBox(-3.2F, 0.4F, -2.5F, 1, 3, 5, 0.0F);
		this.leggings_lLegCarapace = new ModelRenderer(this, 103, 14);
		this.leggings_lLegCarapace.setRotationPoint(0.5F, 7.8F, 0.5F);
		this.leggings_lLegCarapace.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
		this.setRotateAngle(leggings_lLegCarapace, -0.22759093446006054F, 0.0F, 0.136659280431156F);
		this.boots_lClaw02a = new ModelRenderer(this, 50, 38);
		this.boots_lClaw02a.setRotationPoint(-0.6F, 1.9F, -1.2F);
		this.boots_lClaw02a.addBox(-0.9F, -1.0F, -2.1F, 2, 2, 2, 0.0F);
		this.setRotateAngle(boots_lClaw02a, 0.136659280431156F, -0.045553093477052F, 0.0F);
		this.boots_lClaw01a_1 = new ModelRenderer(this, 51, 39);
		this.boots_lClaw01a_1.setRotationPoint(0.2F, 0.0F, -1.1F);
		this.boots_lClaw01a_1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(boots_lClaw01a_1, 0.091106186954104F, 0.0F, 0.0F);
		this.chestplate_lKnuckle02 = new ModelRenderer(this, 95, 19);
		this.chestplate_lKnuckle02.setRotationPoint(0.0F, 9.2F, -0.1F);
		this.chestplate_lKnuckle02.addBox(-1.4F, -1.1F, -2.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(chestplate_lKnuckle02, 0.0F, 0.0F, -0.7740535232594852F);
		this.chestplate_rShoulderCarapace = new ModelRenderer(this, 95, 38);
		this.chestplate_rShoulderCarapace.setRotationPoint(0.0F, -0.1F, 0.0F);
		this.chestplate_rShoulderCarapace.addBox(-3.3F, -2.0F, -2.5F, 5, 3, 5, 0.0F);
		this.chestplate_lHookClaw02a = new ModelRenderer(this, 50, 38);
		this.chestplate_lHookClaw02a.setRotationPoint(0.0F, -2.8F, -1.0F);
		this.chestplate_lHookClaw02a.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
		this.setRotateAngle(chestplate_lHookClaw02a, 0.0F, 0.0F, 0.7853981633974483F);
		this.chestplate_rHookClaw02b = new ModelRenderer(this, 51, 39);
		this.chestplate_rHookClaw02b.setRotationPoint(-0.1F, -0.1F, -2.5F);
		this.chestplate_rHookClaw02b.addBox(-0.5F, -0.5F, -2.2F, 1, 1, 2, 0.0F);
		this.setRotateAngle(chestplate_rHookClaw02b, 0.136659280431156F, -0.136659280431156F, 0.0F);
		this.boots_rClaw01a = new ModelRenderer(this, 50, 38);
		this.boots_rClaw01a.setRotationPoint(-1.6F, 1.9F, -1.2F);
		this.boots_rClaw01a.addBox(-0.9F, -1.0F, -2.1F, 2, 2, 2, 0.0F);
		this.setRotateAngle(boots_rClaw01a, 0.136659280431156F, 0.18203784098300857F, 0.0F);
		this.chestplate_lShoulderCarapace = new ModelRenderer(this, 95, 38);
		this.chestplate_lShoulderCarapace.mirror = true;
		this.chestplate_lShoulderCarapace.setRotationPoint(0.0F, -0.1F, 0.0F);
		this.chestplate_lShoulderCarapace.addBox(-1.7F, -2.0F, -2.5F, 5, 3, 5, 0.0F);
		this.boots_lClaw01a = new ModelRenderer(this, 50, 38);
		this.boots_lClaw01a.setRotationPoint(1.6F, 1.9F, -1.2F);
		this.boots_lClaw01a.addBox(-0.9F, -1.0F, -2.1F, 2, 2, 2, 0.0F);
		this.setRotateAngle(boots_lClaw01a, 0.136659280431156F, -0.18203784098300857F, 0.0F);
		this.helmet_crestSupport = new ModelRenderer(this, 61, 12);
		this.helmet_crestSupport.setRotationPoint(0.0F, 0.0F, 6.0F);
		this.helmet_crestSupport.addBox(-3.5F, 0.0F, -1.0F, 7, 7, 2, 0.0F);
		this.setRotateAngle(helmet_crestSupport, -0.7285004297824331F, 0.0F, 0.0F);
		this.helmet_crest03 = new ModelRenderer(this, 54, 50);
		this.helmet_crest03.setRotationPoint(0.0F, -2.4F, -1.4F);
		this.helmet_crest03.addBox(-4.5F, -1.0F, 2.4F, 9, 2, 5, 0.0F);
		this.setRotateAngle(helmet_crest03, 0.18203784098300857F, 0.0F, 0.0F);
		this.chestplate_lHookClaw03 = new ModelRenderer(this, 51, 39);
		this.chestplate_lHookClaw03.setRotationPoint(-0.1F, -0.6F, -1.3F);
		this.chestplate_lHookClaw03.addBox(-0.5F, -0.5F, -2.2F, 1, 1, 2, 0.0F);
		this.setRotateAngle(chestplate_lHookClaw03, 0.136659280431156F, -0.136659280431156F, 0.7853981633974483F);
		this.chestplate_rHookArm01 = new ModelRenderer(this, 0, 35);
		this.chestplate_rHookArm01.mirror = true;
		this.chestplate_rHookArm01.setRotationPoint(-2.8F, 1.9F, 0.2F);
		this.chestplate_rHookArm01.addBox(-1.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(chestplate_rHookArm01, -0.6373942428283291F, -0.40980330836826856F, -0.36425021489121656F);
		this.chestplate_lHookClaw01b = new ModelRenderer(this, 49, 38);
		this.chestplate_lHookClaw01b.setRotationPoint(0.0F, 0.0F, -3.5F);
		this.chestplate_lHookClaw01b.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
		this.setRotateAngle(chestplate_lHookClaw01b, 0.22759093446006054F, -0.22759093446006054F, 0.0F);
		this.helmet_lCrest03 = new ModelRenderer(this, 50, 38);
		this.helmet_lCrest03.setRotationPoint(-0.5F, -0.3F, 2.5F);
		this.helmet_lCrest03.addBox(-0.7F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(helmet_lCrest03, -0.045553093477052F, 0.27314402793711257F, 0.0F);
		this.chestplate_rHookClaw03 = new ModelRenderer(this, 51, 39);
		this.chestplate_rHookClaw03.setRotationPoint(-0.1F, -0.6F, -1.3F);
		this.chestplate_rHookClaw03.addBox(-0.5F, -0.5F, -2.2F, 1, 1, 2, 0.0F);
		this.setRotateAngle(chestplate_rHookClaw03, 0.136659280431156F, -0.136659280431156F, 0.7853981633974483F);
		this.chestplate_lClaws = new ModelRenderer(this, 91, 7);
		this.chestplate_lClaws.setRotationPoint(0.5F, 0.5F, 0.0F);
		this.chestplate_lClaws.addBox(0.0F, 0.0F, -2.0F, 0, 2, 4, 0.0F);
		this.setRotateAngle(chestplate_lClaws, 0.0F, 0.0F, 0.27314402793711257F);
		this.chestplate_spike04b = new ModelRenderer(this, 51, 39);
		this.chestplate_spike04b.setRotationPoint(-0.1F, -0.1F, 1.8F);
		this.chestplate_spike04b.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(chestplate_spike04b, -0.136659280431156F, 0.136659280431156F, 0.0F);
		this.chestplate_spike01a = new ModelRenderer(this, 51, 39);
		this.chestplate_spike01a.setRotationPoint(0.0F, 1.6F, 2.6F);
		this.chestplate_spike01a.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(chestplate_spike01a, -0.18203784098300857F, 0.18203784098300857F, 0.7853981633974483F);
		this.boots_rFlesh01 = new ModelRenderer(this, 93, 0);
		this.boots_rFlesh01.mirror = true;
		this.boots_rFlesh01.setRotationPoint(0.2F, 8.5F, 0.0F);
		this.boots_rFlesh01.addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
		this.chestplate_spike02a = new ModelRenderer(this, 51, 39);
		this.chestplate_spike02a.setRotationPoint(-0.1F, 4.2F, 2.8F);
		this.chestplate_spike02a.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(chestplate_spike02a, -0.18203784098300857F, 0.18203784098300857F, 0.7853981633974483F);
		this.chestplate_chestCarapace01 = new ModelRenderer(this, 0, 48);
		this.chestplate_chestCarapace01.setRotationPoint(0.0F, 3.8F, -1.5F);
		this.chestplate_chestCarapace01.addBox(-1.5F, -3.0F, -1.5F, 3, 4, 3, 0.0F);
		this.setRotateAngle(chestplate_chestCarapace01, -0.31869712141416456F, 0.7853981633974483F, -0.22759093446006054F);
		this.leggings_rLegCarapace = new ModelRenderer(this, 103, 14);
		this.leggings_rLegCarapace.mirror = true;
		this.leggings_rLegCarapace.setRotationPoint(-0.5F, 7.8F, 0.5F);
		this.leggings_rLegCarapace.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
		this.setRotateAngle(leggings_rLegCarapace, -0.22759093446006054F, 0.0F, -0.136659280431156F);
		this.helmet_rCrest01 = new ModelRenderer(this, 83, 50);
		this.helmet_rCrest01.mirror = true;
		this.helmet_rCrest01.setRotationPoint(4.2F, -0.77F, 6.2F);
		this.helmet_rCrest01.addBox(-2.0F, -0.1F, -2.8F, 3, 2, 5, 0.0F);
		this.setRotateAngle(helmet_rCrest01, -0.045553093477052F, 0.27314402793711257F, 0.0F);
		this.chestplate_spike03a = new ModelRenderer(this, 51, 39);
		this.chestplate_spike03a.setRotationPoint(-0.1F, 6.2F, 2.9F);
		this.chestplate_spike03a.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(chestplate_spike03a, -0.18203784098300857F, 0.18203784098300857F, 0.7853981633974483F);
		this.chestplate_chestCarapace02 = new ModelRenderer(this, 13, 48);
		this.chestplate_chestCarapace02.setRotationPoint(0.3F, 0.4F, -0.2F);
		this.chestplate_chestCarapace02.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(chestplate_chestCarapace02, 0.22759093446006054F, 0.0F, 0.27314402793711257F);
		this.helmet_crestVisor03 = new ModelRenderer(this, 73, 6);
		this.helmet_crestVisor03.setRotationPoint(0.0F, 0.8F, -0.0F);
		this.helmet_crestVisor03.addBox(-1.5F, 0.0F, -0.5F, 3, 2, 1, 0.0F);
		this.setRotateAngle(helmet_crestVisor03, 0.136659280431156F, 0.0F, 0.0F);
		this.chestplate_rBodyCarapace = new ModelRenderer(this, 85, 24);
		this.chestplate_rBodyCarapace.setRotationPoint(0.0F, 2.4F, 0.0F);
		this.chestplate_rBodyCarapace.addBox(-4.1F, -2.1F, -2.5F, 5, 8, 5, 0.0F);
		this.setRotateAngle(chestplate_rBodyCarapace, 0.0F, 0.091106186954104F, 0.091106186954104F);
		this.helmet_crestVisor01 = new ModelRenderer(this, 69, 0);
		this.helmet_crestVisor01.setRotationPoint(0.0F, -3.6F, -4.9F);
		this.helmet_crestVisor01.addBox(-3.5F, 0.0F, -0.5F, 7, 1, 1, 0.0F);
		this.setRotateAngle(helmet_crestVisor01, -0.5462880558742251F, 0.0F, 0.0F);
		this.chestplate_rKnuckle01 = new ModelRenderer(this, 83, 17);
		this.chestplate_rKnuckle01.mirror = true;
		this.chestplate_rKnuckle01.setRotationPoint(-2.7F, 9.6F, -0.1F);
		this.chestplate_rKnuckle01.addBox(-0.5F, -1.0F, -2.0F, 1, 2, 4, 0.0F);
		this.setRotateAngle(chestplate_rKnuckle01, 0.0F, 0.0F, -0.7285004297824331F);
		this.helmet_rCrest02 = new ModelRenderer(this, 100, 56);
		this.helmet_rCrest02.mirror = true;
		this.helmet_rCrest02.setRotationPoint(0.5F, 1.2F, 1.7F);
		this.helmet_rCrest02.addBox(-1.5F, -0.9F, 0.0F, 2, 1, 3, 0.0F);
		this.setRotateAngle(helmet_rCrest02, -0.045553093477052F, -0.27314402793711257F, 0.0F);
		this.chestplate_spike03b = new ModelRenderer(this, 51, 39);
		this.chestplate_spike03b.setRotationPoint(-0.1F, -0.1F, 1.8F);
		this.chestplate_spike03b.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(chestplate_spike03b, -0.136659280431156F, 0.136659280431156F, 0.0F);
		this.helmet_lCrest02 = new ModelRenderer(this, 100, 56);
		this.helmet_lCrest02.setRotationPoint(-0.5F, 1.2F, 1.7F);
		this.helmet_lCrest02.addBox(-1.5F, -0.9F, 0.0F, 2, 1, 3, 0.0F);
		this.setRotateAngle(helmet_lCrest02, -0.045553093477052F, 0.27314402793711257F, 0.0F);
		this.chestplate_lHookClaw02b = new ModelRenderer(this, 51, 39);
		this.chestplate_lHookClaw02b.setRotationPoint(-0.1F, -0.1F, -2.5F);
		this.chestplate_lHookClaw02b.addBox(-0.5F, -0.5F, -2.2F, 1, 1, 2, 0.0F);
		this.setRotateAngle(chestplate_lHookClaw02b, 0.136659280431156F, -0.136659280431156F, 0.0F);
		this.boots_lFlesh01 = new ModelRenderer(this, 93, 0);
		this.boots_lFlesh01.setRotationPoint(-0.2F, 8.5F, 0.0F);
		this.boots_lFlesh01.addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
		this.chestplate_lBodyCarapace = new ModelRenderer(this, 107, 24);
		this.chestplate_lBodyCarapace.setRotationPoint(0.0F, 2.4F, 0.0F);
		this.chestplate_lBodyCarapace.addBox(-0.9F, -2.1F, -2.5F, 5, 8, 5, 0.0F);
		this.setRotateAngle(chestplate_lBodyCarapace, 0.0F, -0.091106186954104F, -0.091106186954104F);
		this.chestplate_spine02 = new ModelRenderer(this, 13, 48);
		this.chestplate_spine02.setRotationPoint(-0.3F, 4.7F, 0.3F);
		this.chestplate_spine02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(chestplate_spine02, -0.136659280431156F, 0.0F, -0.18203784098300857F);
		this.chestplate_lArmCarapace = new ModelRenderer(this, 103, 14);
		this.chestplate_lArmCarapace.setRotationPoint(1.6F, 8.5F, 0.6F);
		this.chestplate_lArmCarapace.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
		this.setRotateAngle(chestplate_lArmCarapace, -0.22759093446006054F, 0.0F, 0.136659280431156F);
		this.helmet_rCrest03 = new ModelRenderer(this, 50, 38);
		this.helmet_rCrest03.setRotationPoint(-0.5F, -0.3F, 2.5F);
		this.helmet_rCrest03.addBox(-0.3F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(helmet_rCrest03, -0.045553093477052F, -0.27314402793711257F, 0.0F);
		this.boots_rClaw01a_1 = new ModelRenderer(this, 51, 39);
		this.boots_rClaw01a_1.setRotationPoint(0.0F, 0.0F, -1.1F);
		this.boots_rClaw01a_1.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(boots_rClaw01a_1, 0.091106186954104F, 0.0F, 0.0F);
		this.chestplate_rClaws = new ModelRenderer(this, 91, 7);
		this.chestplate_rClaws.mirror = true;
		this.chestplate_rClaws.setRotationPoint(0.0F, 0.5F, 0.0F);
		this.chestplate_rClaws.addBox(0.0F, 0.0F, -2.0F, 0, 2, 4, 0.0F);
		this.setRotateAngle(chestplate_rClaws, 0.0F, 0.0F, -0.27314402793711257F);
		this.chestplate_rArmCarapace = new ModelRenderer(this, 103, 14);
		this.chestplate_rArmCarapace.mirror = true;
		this.chestplate_rArmCarapace.setRotationPoint(-1.6F, 8.5F, 0.6F);
		this.chestplate_rArmCarapace.addBox(-1.5F, -6.0F, -1.5F, 3, 6, 3, 0.0F);
		this.setRotateAngle(chestplate_rArmCarapace, -0.22759093446006054F, 0.0F, -0.136659280431156F);
		this.chestplate_rHookClaw01b = new ModelRenderer(this, 49, 38);
		this.chestplate_rHookClaw01b.setRotationPoint(0.0F, 0.0F, -3.5F);
		this.chestplate_rHookClaw01b.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
		this.setRotateAngle(chestplate_rHookClaw01b, 0.22759093446006054F, -0.22759093446006054F, 0.0F);
		this.helmet_crest02 = new ModelRenderer(this, 67, 32);
		this.helmet_crest02.setRotationPoint(0.0F, -2.5F, -0.2F);
		this.helmet_crest02.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 9, 0.0F);
		this.setRotateAngle(helmet_crest02, 0.136659280431156F, -0.136659280431156F, 0.7853981633974483F);
		this.chestplate_spine = new ModelRenderer(this, 0, 48);
		this.chestplate_spine.setRotationPoint(0.0F, 0.3F, 1.4F);
		this.chestplate_spine.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
		this.setRotateAngle(chestplate_spine, 0.091106186954104F, 0.7853981633974483F, 0.091106186954104F);
		this.chestplate_rHookClaw01c = new ModelRenderer(this, 51, 38);
		this.chestplate_rHookClaw01c.setRotationPoint(-0.1F, -0.1F, -2.5F);
		this.chestplate_rHookClaw01c.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F);
		this.setRotateAngle(chestplate_rHookClaw01c, 0.136659280431156F, -0.136659280431156F, 0.0F);
		this.chestplate_rKnuckle02 = new ModelRenderer(this, 95, 19);
		this.chestplate_rKnuckle02.mirror = true;
		this.chestplate_rKnuckle02.setRotationPoint(0.0F, 9.2F, -0.1F);
		this.chestplate_rKnuckle02.addBox(0.4F, -1.1F, -2.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(chestplate_rKnuckle02, 0.0F, 0.0F, 0.7740535232594852F);
		this.chestplate_spike02b = new ModelRenderer(this, 51, 39);
		this.chestplate_spike02b.setRotationPoint(-0.1F, -0.1F, 1.8F);
		this.chestplate_spike02b.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(chestplate_spike02b, -0.136659280431156F, 0.136659280431156F, 0.0F);
		this.chestplate_rHookClaw02a = new ModelRenderer(this, 50, 38);
		this.chestplate_rHookClaw02a.setRotationPoint(0.0F, -2.8F, -1.0F);
		this.chestplate_rHookClaw02a.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F);
		this.setRotateAngle(chestplate_rHookClaw02a, 0.0F, 0.0F, 0.7853981633974483F);
		this.head.addChild(this.helmet_crest01);
		this.helmet_crest03.addChild(this.helmet_lCrest01);
		this.helmet_crestVisor01.addChild(this.helmet_crestVisor02);
		this.body.addChild(this.chestplate_lHookArm01);
		this.lArm.addChild(this.chestplate_lKnuckle01);
		this.chestplate_lShoulderCarapace.addChild(this.chestplate_lArmCarapace_1);
		this.chestplate_lHookArm03.addChild(this.chestplate_lHookClaw01a);
		this.chestplate_rHookArm03.addChild(this.chestplate_rHookClaw01a);
		this.boots_rClaw02a.addChild(this.boots_rClaw02a_1);
		this.chestplate_rHookArm01.addChild(this.chestplate_rHookArm02);
		this.boots_rFlesh01.addChild(this.boots_rClaw02a);
		this.chestplate_lHookArm02.addChild(this.chestplate_lHookArm03);
		this.boots_lClaw02a.addChild(this.boots_lClaw02a_1);
		this.chestplate_lHookClaw01b.addChild(this.chestplate_lHookClaw01c);
		this.chestplate_rHookArm02.addChild(this.chestplate_rHookArm03);
		this.body.addChild(this.chestplate_spike01b);
		this.chestplate_lHookArm01.addChild(this.chestplate_lHookArm02);
		this.chestplate_rShoulderCarapace.addChild(this.chestplate_rArmCarapace_1);
		this.lLeg.addChild(this.leggings_lLegCarapace);
		this.boots_lFlesh01.addChild(this.boots_lClaw02a);
		this.boots_lClaw01a.addChild(this.boots_lClaw01a_1);
		this.lArm.addChild(this.chestplate_lKnuckle02);
		this.rArm.addChild(this.chestplate_rShoulderCarapace);
		this.chestplate_lHookArm03.addChild(this.chestplate_lHookClaw02a);
		this.chestplate_rHookClaw02a.addChild(this.chestplate_rHookClaw02b);
		this.boots_rFlesh01.addChild(this.boots_rClaw01a);
		this.lArm.addChild(this.chestplate_lShoulderCarapace);
		this.boots_lFlesh01.addChild(this.boots_lClaw01a);
		this.helmet_crest03.addChild(this.helmet_crestSupport);
		this.helmet_crest01.addChild(this.helmet_crest03);
		this.chestplate_lHookArm03.addChild(this.chestplate_lHookClaw03);
		this.body.addChild(this.chestplate_rHookArm01);
		this.chestplate_lHookClaw01a.addChild(this.chestplate_lHookClaw01b);
		this.helmet_lCrest02.addChild(this.helmet_lCrest03);
		this.chestplate_rHookArm03.addChild(this.chestplate_rHookClaw03);
		this.chestplate_lKnuckle01.addChild(this.chestplate_lClaws);
		this.chestplate_spike04a.addChild(this.chestplate_spike04b);
		this.rLeg.addChild(this.boots_rFlesh01);
		this.body.addChild(this.chestplate_chestCarapace01);
		this.rLeg.addChild(this.leggings_rLegCarapace);
		this.helmet_crest03.addChild(this.helmet_rCrest01);
		this.chestplate_chestCarapace01.addChild(this.chestplate_chestCarapace02);
		this.helmet_crestVisor02.addChild(this.helmet_crestVisor03);
		this.body.addChild(this.chestplate_rBodyCarapace);
		this.helmet_crest01.addChild(this.helmet_crestVisor01);
		this.rArm.addChild(this.chestplate_rKnuckle01);
		this.helmet_rCrest01.addChild(this.helmet_rCrest02);
		this.chestplate_spike03a.addChild(this.chestplate_spike03b);
		this.helmet_lCrest01.addChild(this.helmet_lCrest02);
		this.chestplate_lHookClaw02a.addChild(this.chestplate_lHookClaw02b);
		this.lLeg.addChild(this.boots_lFlesh01);
		this.body.addChild(this.chestplate_lBodyCarapace);
		this.chestplate_spine.addChild(this.chestplate_spine02);
		this.lArm.addChild(this.chestplate_lArmCarapace);
		this.helmet_rCrest02.addChild(this.helmet_rCrest03);
		this.boots_rClaw01a.addChild(this.boots_rClaw01a_1);
		this.chestplate_rKnuckle01.addChild(this.chestplate_rClaws);
		this.rArm.addChild(this.chestplate_rArmCarapace);
		this.chestplate_rHookClaw01a.addChild(this.chestplate_rHookClaw01b);
		this.helmet_crest01.addChild(this.helmet_crest02);
		this.body.addChild(this.chestplate_spine);
		this.chestplate_rHookClaw01b.addChild(this.chestplate_rHookClaw01c);
		this.rArm.addChild(this.chestplate_rKnuckle02);
		this.chestplate_spike02a.addChild(this.chestplate_spike02b);
		this.chestplate_rHookArm03.addChild(this.chestplate_rHookClaw02a);
	}

	@Override
	protected void renderArmorModelExtras(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		// GlStateManager.pushMatrix();
		// GlStateManager.translate(this.lArm.offsetX, this.lArm.offsetY, this.lArm.offsetZ);
		// GlStateManager.translate(this.lArm.rotationPointX * scale, this.lArm.rotationPointY * scale, this.lArm.rotationPointZ * scale);
		// GlStateManager.scale(1.05D, 1.05D, 1.05D);
		// GlStateManager.translate(-this.lArm.offsetX, -this.lArm.offsetY, -this.lArm.offsetZ);
		// GlStateManager.translate(-this.lArm.rotationPointX * scale, -this.lArm.rotationPointY * scale, -this.lArm.rotationPointZ * scale);
		// this.lArm.render(scale);
		// GlStateManager.popMatrix();
		// GlStateManager.pushMatrix();
		// GlStateManager.translate(this.chestplate_spike04a.offsetX, this.chestplate_spike04a.offsetY, this.chestplate_spike04a.offsetZ);
		// GlStateManager.translate(this.chestplate_spike04a.rotationPointX * scale, this.chestplate_spike04a.rotationPointY * scale, this.chestplate_spike04a.rotationPointZ * scale);
		// GlStateManager.scale(0.4D, 0.4D, 0.4D);
		// GlStateManager.translate(-this.chestplate_spike04a.offsetX, -this.chestplate_spike04a.offsetY, -this.chestplate_spike04a.offsetZ);
		// GlStateManager.translate(-this.chestplate_spike04a.rotationPointX * scale, -this.chestplate_spike04a.rotationPointY * scale, -this.chestplate_spike04a.rotationPointZ * scale);
		// this.chestplate_spike04a.render(scale);
		// GlStateManager.popMatrix();
		// this.head.render(scale);
		// GlStateManager.pushMatrix();
		// GlStateManager.translate(this.rLeg.offsetX, this.rLeg.offsetY, this.rLeg.offsetZ);
		// GlStateManager.translate(this.rLeg.rotationPointX * scale, this.rLeg.rotationPointY * scale, this.rLeg.rotationPointZ * scale);
		// GlStateManager.scale(1.05D, 1.05D, 1.05D);
		// GlStateManager.translate(-this.rLeg.offsetX, -this.rLeg.offsetY, -this.rLeg.offsetZ);
		// GlStateManager.translate(-this.rLeg.rotationPointX * scale, -this.rLeg.rotationPointY * scale, -this.rLeg.rotationPointZ * scale);
		// this.rLeg.render(scale);
		// GlStateManager.popMatrix();
		// GlStateManager.pushMatrix();
		// GlStateManager.translate(this.lLeg.offsetX, this.lLeg.offsetY, this.lLeg.offsetZ);
		// GlStateManager.translate(this.lLeg.rotationPointX * scale, this.lLeg.rotationPointY * scale, this.lLeg.rotationPointZ * scale);
		// GlStateManager.scale(1.05D, 1.05D, 1.05D);
		// GlStateManager.translate(-this.lLeg.offsetX, -this.lLeg.offsetY, -this.lLeg.offsetZ);
		// GlStateManager.translate(-this.lLeg.rotationPointX * scale, -this.lLeg.rotationPointY * scale, -this.lLeg.rotationPointZ * scale);
		// this.lLeg.render(scale);
		// GlStateManager.popMatrix();
		// GlStateManager.pushMatrix();
		// GlStateManager.translate(this.chestplate_spike01a.offsetX, this.chestplate_spike01a.offsetY, this.chestplate_spike01a.offsetZ);
		// GlStateManager.translate(this.chestplate_spike01a.rotationPointX * scale, this.chestplate_spike01a.rotationPointY * scale, this.chestplate_spike01a.rotationPointZ * scale);
		// GlStateManager.scale(0.8D, 0.8D, 0.9D);
		// GlStateManager.translate(-this.chestplate_spike01a.offsetX, -this.chestplate_spike01a.offsetY, -this.chestplate_spike01a.offsetZ);
		// GlStateManager.translate(-this.chestplate_spike01a.rotationPointX * scale, -this.chestplate_spike01a.rotationPointY * scale, -this.chestplate_spike01a.rotationPointZ * scale);
		// this.chestplate_spike01a.render(scale);
		// GlStateManager.popMatrix();
		// GlStateManager.pushMatrix();
		// GlStateManager.translate(this.chestplate_spike02a.offsetX, this.chestplate_spike02a.offsetY, this.chestplate_spike02a.offsetZ);
		// GlStateManager.translate(this.chestplate_spike02a.rotationPointX * scale, this.chestplate_spike02a.rotationPointY * scale, this.chestplate_spike02a.rotationPointZ * scale);
		// GlStateManager.scale(0.6D, 0.6D, 0.6D);
		// GlStateManager.translate(-this.chestplate_spike02a.offsetX, -this.chestplate_spike02a.offsetY, -this.chestplate_spike02a.offsetZ);
		// GlStateManager.translate(-this.chestplate_spike02a.rotationPointX * scale, -this.chestplate_spike02a.rotationPointY * scale, -this.chestplate_spike02a.rotationPointZ * scale);
		// this.chestplate_spike02a.render(scale);
		// GlStateManager.popMatrix();
		// GlStateManager.pushMatrix();
		// GlStateManager.translate(this.chestplate_spike03a.offsetX, this.chestplate_spike03a.offsetY, this.chestplate_spike03a.offsetZ);
		// GlStateManager.translate(this.chestplate_spike03a.rotationPointX * scale, this.chestplate_spike03a.rotationPointY * scale, this.chestplate_spike03a.rotationPointZ * scale);
		// GlStateManager.scale(0.5D, 0.5D, 0.5D);
		// GlStateManager.translate(-this.chestplate_spike03a.offsetX, -this.chestplate_spike03a.offsetY, -this.chestplate_spike03a.offsetZ);
		// GlStateManager.translate(-this.chestplate_spike03a.rotationPointX * scale, -this.chestplate_spike03a.rotationPointY * scale, -this.chestplate_spike03a.rotationPointZ * scale);
		// this.chestplate_spike03a.render(scale);
		// GlStateManager.popMatrix();
		// this.body.render(scale);
		// GlStateManager.pushMatrix();
		// GlStateManager.translate(this.rArm.offsetX, this.rArm.offsetY, this.rArm.offsetZ);
		// GlStateManager.translate(this.rArm.rotationPointX * scale, this.rArm.rotationPointY * scale, this.rArm.rotationPointZ * scale);
		// GlStateManager.scale(1.05D, 1.05D, 1.05D);
		// GlStateManager.translate(-this.rArm.offsetX, -this.rArm.offsetY, -this.rArm.offsetZ);
		// GlStateManager.translate(-this.rArm.rotationPointX * scale, -this.rArm.rotationPointY * scale, -this.rArm.rotationPointZ * scale);
		// this.rArm.render(scale);
		// GlStateManager.popMatrix();
	}

	@Override
	public void renderHelmet(TransformType type, Entity entity, float scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);
		switch (type) {
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
			GlStateManager.translate(scale * -3, scale * 34, 0);
			GlStateManager.rotate(90, 0, 1, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
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

		this.head.render(scale);

		GlStateManager.popMatrix();
	}

	@Override
	public void renderChestplate(TransformType type, Entity entity, float scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);

		switch (type) {
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
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case GROUND:
			GlStateManager.scale(0.55, 0.55, 0.55);
			GlStateManager.translate(0, scale * 30, 0);
			break;
		case GUI:
			ModelUtils.rotateDefaultBlockGui();
			GlStateManager.translate(0, scale * 27, 0);
			GlStateManager.rotate(90, 0, 1, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case HEAD:
			break;
		case NONE:
			break;
		case THIRD_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.LEFT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			GlStateManager.translate(0, scale * 18, 0);
			GlStateManager.scale(0.55, 0.55, 0.55);
			break;
		}

		this.body.render(scale);
		this.lArm.render(scale);
		this.rArm.render(scale);

		GlStateManager.popMatrix();
	}

	@Override
	public void renderLeggings(TransformType type, Entity entity, float scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 1.5, 0);
		GlStateManager.rotate(180, 1, 0, 0);

		switch (type) {
		case FIRST_PERSON_LEFT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.LEFT);
			break;
		case FIRST_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockFirstperson(EnumHandSide.RIGHT);
			break;
		case FIXED:
			break;
		case GROUND:
			GlStateManager.translate(0, scale * 6, 0);
			GlStateManager.scale(0.8, 0.8, 0.8);
			break;
		case GUI:
			GlStateManager.translate(0, scale * 12, 0);
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
			break;
		case THIRD_PERSON_RIGHT_HAND:
			ModelUtils.rotateDefaultBlockThirdperson(EnumHandSide.RIGHT);
			break;
		}

		this.lLeg.render(scale);
		this.rLeg.render(scale);
		GlStateManager.popMatrix();
	}

	@Override
	public void renderBoots(TransformType type, Entity entity, float scale) {
		renderLeggings(type, entity, scale);
	}
}
