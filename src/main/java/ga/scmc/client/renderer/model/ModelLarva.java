package ga.scmc.client.renderer.model;

import hypeirochus.api.client.render.model.Model;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * zerglarva - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelLarva extends Model {

	public ModelRenderer bSpike1a;
	public ModelRenderer bSpike1b;
	public ModelRenderer bSpike1c;
	public ModelRenderer bSpike1d;
	public ModelRenderer bSpike1e;
	public ModelRenderer bSpike2a;
	public ModelRenderer bSpike2b;
	public ModelRenderer bSpike2c;
	public ModelRenderer bSpike2d;
	public ModelRenderer bSpike2e;
	public ModelRenderer bSpike3a;
	public ModelRenderer bSpike3b;
	public ModelRenderer bSpike3c;
	public ModelRenderer bSpike3d;
	public ModelRenderer bSpike3e;
	public ModelRenderer bSpike4a;
	public ModelRenderer bSpike4a_1;
	public ModelRenderer bSpike4a_2;
	public ModelRenderer bSpike4b;
	public ModelRenderer bSpike4b_1;
	public ModelRenderer bSpike4b_2;
	public ModelRenderer bSpike4c;
	public ModelRenderer bSpike4c_1;
	public ModelRenderer bSpike4d;
	public ModelRenderer bSpike4d_1;
	public ModelRenderer bSpike4e;
	public ModelRenderer bSpike4e_1;
	public ModelRenderer bSpike5c;
	public ModelRenderer bSpike5d;
	public ModelRenderer bSpike5e;
	public ModelRenderer bSpike6a;
	public ModelRenderer bSpike6b;
	public ModelRenderer bSpike6c;
	public ModelRenderer bSpike6d;
	public ModelRenderer bSpike6e;
	public ModelRenderer bSpike7a;
	public ModelRenderer bSpike7b;
	public ModelRenderer bSpike7c;
	public ModelRenderer bSpike7d;
	public ModelRenderer bSpike7e;
	public ModelRenderer head;
	public ModelRenderer lMandible;
	public ModelRenderer lMandible2;
	public ModelRenderer lMandibleSpikes;
	public ModelRenderer lSpike0a;
	public ModelRenderer lSpike0b;
	public ModelRenderer lSpike0c;
	public ModelRenderer lSpike0d;
	public ModelRenderer lSpike0e;
	public ModelRenderer lSpike1a;
	public ModelRenderer lSpike1aa;
	public ModelRenderer lSpike1b;
	public ModelRenderer lSpike1c;
	public ModelRenderer lSpike2a;
	public ModelRenderer lSpike2b;
	public ModelRenderer lSpike2c;
	public ModelRenderer lSpike2d;
	public ModelRenderer lSpike2e;
	public ModelRenderer lSpike3a;
	public ModelRenderer lSpike3b;
	public ModelRenderer lSpike3c;
	public ModelRenderer lSpike3d;
	public ModelRenderer lSpike3e;
	public ModelRenderer lSpike4a;
	public ModelRenderer lSpike4b;
	public ModelRenderer lSpike4c;
	public ModelRenderer lSpike4d;
	public ModelRenderer lSpike4e;
	public ModelRenderer rMandible;
	public ModelRenderer rMandible2;
	public ModelRenderer rMandibleSpikes;
	public ModelRenderer rSpike0a;
	public ModelRenderer rSpike0b;
	public ModelRenderer rSpike0c;
	public ModelRenderer rSpike0d;
	public ModelRenderer rSpike0e;
	public ModelRenderer rSpike1a;
	public ModelRenderer rSpike1aa;
	public ModelRenderer rSpike1b;
	public ModelRenderer rSpike1c;
	public ModelRenderer rSpike2a;
	public ModelRenderer rSpike2b;
	public ModelRenderer rSpike2c;
	public ModelRenderer rSpike2d;
	public ModelRenderer rSpike2e;
	public ModelRenderer rSpike3a;
	public ModelRenderer rSpike3b;
	public ModelRenderer rSpike3c;
	public ModelRenderer rSpike3d;
	public ModelRenderer rSpike3e;
	public ModelRenderer rSpike4a;
	public ModelRenderer rSpike4b;
	public ModelRenderer rSpike4c;
	public ModelRenderer rSpike4d;
	public ModelRenderer rSpike4e;
	public ModelRenderer segment1;
	public ModelRenderer segment2;
	public ModelRenderer segment3;
	public ModelRenderer segment4;
	public ModelRenderer shell1;
	public ModelRenderer shell2;
	public ModelRenderer shell3;
	public ModelRenderer shell4;
	public ModelRenderer tail;

	public ModelLarva() {
		textureWidth = 64;
		textureHeight = 32;
		rSpike0e = new ModelRenderer(this, 39, 0);
		rSpike0e.mirror = true;
		rSpike0e.setRotationPoint(-2.0F, 0.5F, 0.0F);
		rSpike0e.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		lSpike3d = new ModelRenderer(this, 37, 0);
		lSpike3d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike3d.addBox(-0.1F, 0.2F, -0.3F, 2, 1, 1, 0.0F);
		bSpike4d = new ModelRenderer(this, 39, 0);
		bSpike4d.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike4d.addBox(-0.7F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		bSpike3c = new ModelRenderer(this, 39, 0);
		bSpike3c.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike3c.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		rSpike4a = new ModelRenderer(this, 37, 0);
		rSpike4a.mirror = true;
		rSpike4a.setRotationPoint(-2.4F, 0.0F, 3.5F);
		rSpike4a.addBox(-2.1F, -0.3F, -0.8F, 2, 1, 1, 0.0F);
		setRotation(rSpike4a, 0.0F, 0.4553564018453205F, 0.0F);
		rSpike1c = new ModelRenderer(this, 39, 0);
		rSpike1c.mirror = true;
		rSpike1c.setRotationPoint(-0.6F, 0.2F, 0.0F);
		rSpike1c.addBox(-1.1F, -0.7F, -0.5F, 1, 1, 1, 0.0F);
		setRotation(rSpike1c, 0.0F, 0.18203784098300857F, 0.0F);
		lSpike4e = new ModelRenderer(this, 39, 0);
		lSpike4e.setRotationPoint(1.6F, 0.5F, 0.0F);
		lSpike4e.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		bSpike7d = new ModelRenderer(this, 39, 0);
		bSpike7d.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike7d.addBox(-0.7F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		lMandible2 = new ModelRenderer(this, 23, 6);
		lMandible2.setRotationPoint(0.0F, 0.1F, -3.6F);
		lMandible2.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
		setRotation(lMandible2, 0.0F, 0.31869712141416456F, 0.0F);
		rMandibleSpikes = new ModelRenderer(this, 19, 18);
		rMandibleSpikes.mirror = true;
		rMandibleSpikes.setRotationPoint(0.0F, 0.0F, 0.0F);
		rMandibleSpikes.addBox(-2.5F, 0.1F, -5.7F, 4, 0, 5, 0.0F);
		setRotation(rMandibleSpikes, 0.0F, -0.18203784098300857F, 0.0F);
		rSpike4c = new ModelRenderer(this, 37, 0);
		rSpike4c.mirror = true;
		rSpike4c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike4c.addBox(-2.1F, 0.2F, -0.8F, 2, 1, 1, 0.0F);
		segment1 = new ModelRenderer(this, 34, 22);
		segment1.setRotationPoint(0.0F, 22.5F, -7.9F);
		segment1.addBox(-3.0F, -1.5F, -2.5F, 6, 3, 5, 0.0F);
		bSpike2e = new ModelRenderer(this, 39, 0);
		bSpike2e.setRotationPoint(0.0F, -1.2F, -0.2F);
		bSpike2e.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotation(bSpike2e, -0.18203784098300857F, 0.0F, 0.0F);
		rSpike1aa = new ModelRenderer(this, 37, 0);
		rSpike1aa.mirror = true;
		rSpike1aa.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike1aa.addBox(-2.1F, -0.9F, -1.0F, 2, 1, 2, 0.0F);
		lSpike4c = new ModelRenderer(this, 37, 0);
		lSpike4c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike4c.addBox(-0.1F, 0.2F, -0.7F, 2, 1, 1, 0.0F);
		bSpike2d = new ModelRenderer(this, 39, 0);
		bSpike2d.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike2d.addBox(-0.7F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		rSpike2a = new ModelRenderer(this, 37, 0);
		rSpike2a.mirror = true;
		rSpike2a.setRotationPoint(-2.4F, 0.0F, 3.5F);
		rSpike2a.addBox(-2.1F, -0.3F, -0.8F, 2, 1, 1, 0.0F);
		setRotation(rSpike2a, 0.0F, 0.4553564018453205F, 0.0F);
		bSpike4b = new ModelRenderer(this, 39, 0);
		bSpike4b.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike4b.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		lSpike4a = new ModelRenderer(this, 37, 0);
		lSpike4a.setRotationPoint(2.5F, 0.0F, 3.9F);
		lSpike4a.addBox(-0.1F, -0.3F, -0.7F, 2, 1, 1, 0.0F);
		setRotation(lSpike4a, 0.0F, -0.4553564018453205F, 0.0F);
		bSpike6d = new ModelRenderer(this, 39, 0);
		bSpike6d.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike6d.addBox(-0.7F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		bSpike2b = new ModelRenderer(this, 39, 0);
		bSpike2b.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike2b.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		lSpike2d = new ModelRenderer(this, 37, 0);
		lSpike2d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike2d.addBox(-0.1F, 0.2F, -0.3F, 2, 1, 1, 0.0F);
		bSpike1a = new ModelRenderer(this, 39, 0);
		bSpike1a.setRotationPoint(0.0F, -0.8F, -1.2F);
		bSpike1a.addBox(-0.2F, -2.0F, -0.3F, 1, 1, 1, 0.0F);
		setRotation(bSpike1a, -0.40980330836826856F, 0.0F, 0.0F);
		bSpike4d_1 = new ModelRenderer(this, 39, 0);
		bSpike4d_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike4d_1.addBox(-0.7F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		lSpike3b = new ModelRenderer(this, 37, 0);
		lSpike3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike3b.addBox(-0.1F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		lSpike3c = new ModelRenderer(this, 37, 0);
		lSpike3c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike3c.addBox(-0.1F, 0.2F, -0.7F, 2, 1, 1, 0.0F);
		bSpike7e = new ModelRenderer(this, 39, 0);
		bSpike7e.setRotationPoint(0.0F, -1.2F, -0.2F);
		bSpike7e.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotation(bSpike7e, -0.18203784098300857F, 0.0F, 0.0F);
		lSpike0a = new ModelRenderer(this, 37, 0);
		lSpike0a.setRotationPoint(2.3F, 0.0F, -1.2F);
		lSpike0a.addBox(-0.1F, -0.3F, -0.7F, 2, 1, 1, 0.0F);
		setRotation(lSpike0a, 0.0F, -0.4553564018453205F, 0.0F);
		bSpike5c = new ModelRenderer(this, 39, 0);
		bSpike5c.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike5c.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		rSpike0c = new ModelRenderer(this, 37, 0);
		rSpike0c.mirror = true;
		rSpike0c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike0c.addBox(-2.1F, 0.2F, -0.8F, 2, 1, 1, 0.0F);
		bSpike6c = new ModelRenderer(this, 39, 0);
		bSpike6c.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike6c.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		bSpike1b = new ModelRenderer(this, 39, 0);
		bSpike1b.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike1b.addBox(-0.2F, -2.0F, -0.8F, 1, 1, 1, 0.0F);
		bSpike6a = new ModelRenderer(this, 39, 0);
		bSpike6a.setRotationPoint(0.0F, -1.1F, -1.2F);
		bSpike6a.addBox(-0.2F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		setRotation(bSpike6a, -0.40980330836826856F, 0.0F, 0.0F);
		rMandible2 = new ModelRenderer(this, 23, 6);
		rMandible2.mirror = true;
		rMandible2.setRotationPoint(0.0F, 0.1F, -3.6F);
		rMandible2.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
		setRotation(rMandible2, 0.0F, -0.31869712141416456F, 0.0F);
		bSpike4a = new ModelRenderer(this, 39, 0);
		bSpike4a.setRotationPoint(0.0F, -1.1F, 1.2F);
		bSpike4a.addBox(-0.2F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		setRotation(bSpike4a, -0.40980330836826856F, 0.0F, 0.0F);
		rSpike0b = new ModelRenderer(this, 37, 0);
		rSpike0b.mirror = true;
		rSpike0b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike0b.addBox(-2.1F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		lSpike2a = new ModelRenderer(this, 37, 0);
		lSpike2a.setRotationPoint(2.5F, 0.0F, 3.9F);
		lSpike2a.addBox(-0.1F, -0.3F, -0.7F, 2, 1, 1, 0.0F);
		setRotation(lSpike2a, 0.0F, -0.4553564018453205F, 0.0F);
		bSpike1d = new ModelRenderer(this, 39, 0);
		bSpike1d.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike1d.addBox(-0.7F, -2.0F, -0.8F, 1, 1, 1, 0.0F);
		segment4 = new ModelRenderer(this, 0, 0);
		segment4.setRotationPoint(0.0F, 0.0F, 4.9F);
		segment4.addBox(-3.0F, -1.5F, 0.0F, 6, 3, 5, 0.0F);
		shell3 = new ModelRenderer(this, 0, 10);
		shell3.setRotationPoint(0.0F, 0.0F, 2.5F);
		shell3.addBox(-3.5F, -2.1F, -1.8F, 7, 2, 5, 0.0F);
		setRotation(shell3, 0.18203784098300857F, 0.0F, 0.0F);
		bSpike7a = new ModelRenderer(this, 39, 0);
		bSpike7a.setRotationPoint(0.0F, -1.1F, 1.2F);
		bSpike7a.addBox(-0.2F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		setRotation(bSpike7a, -0.40980330836826856F, 0.0F, 0.0F);
		bSpike4c_1 = new ModelRenderer(this, 39, 0);
		bSpike4c_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike4c_1.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		bSpike1e = new ModelRenderer(this, 37, 0);
		bSpike1e.setRotationPoint(0.0F, -0.7F, -0.2F);
		bSpike1e.addBox(-0.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F);
		setRotation(bSpike1e, -0.18203784098300857F, 0.0F, 0.0F);
		rSpike3e = new ModelRenderer(this, 39, 0);
		rSpike3e.mirror = true;
		rSpike3e.setRotationPoint(-2.0F, 0.5F, 0.0F);
		rSpike3e.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		lSpike0b = new ModelRenderer(this, 37, 0);
		lSpike0b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike0b.addBox(-0.1F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		shell4 = new ModelRenderer(this, 0, 10);
		shell4.setRotationPoint(0.0F, 0.0F, 2.5F);
		shell4.addBox(-3.5F, -2.1F, -1.8F, 7, 2, 5, 0.0F);
		setRotation(shell4, 0.18203784098300857F, 0.0F, 0.0F);
		bSpike2a = new ModelRenderer(this, 39, 0);
		bSpike2a.setRotationPoint(0.0F, -0.8F, 1.2F);
		bSpike2a.addBox(-0.2F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		setRotation(bSpike2a, -0.40980330836826856F, 0.0F, 0.0F);
		rSpike3d = new ModelRenderer(this, 37, 0);
		rSpike3d.mirror = true;
		rSpike3d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike3d.addBox(-2.1F, 0.2F, -0.3F, 2, 1, 1, 0.0F);
		lSpike1b = new ModelRenderer(this, 39, 0);
		lSpike1b.setRotationPoint(1.6F, 0.5F, 0.0F);
		lSpike1b.addBox(0.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F);
		lSpike1c = new ModelRenderer(this, 39, 0);
		lSpike1c.setRotationPoint(0.9F, 0.2F, 0.0F);
		lSpike1c.addBox(0.0F, -0.7F, -0.5F, 1, 1, 1, 0.0F);
		setRotation(lSpike1c, 0.0F, -0.18203784098300857F, 0.0F);
		lSpike0c = new ModelRenderer(this, 37, 0);
		lSpike0c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike0c.addBox(-0.1F, 0.2F, -0.7F, 2, 1, 1, 0.0F);
		lSpike4d = new ModelRenderer(this, 37, 0);
		lSpike4d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike4d.addBox(-0.1F, 0.2F, -0.3F, 2, 1, 1, 0.0F);
		bSpike4a_2 = new ModelRenderer(this, 39, 0);
		bSpike4a_2.setRotationPoint(0.0F, -1.1F, 1.2F);
		bSpike4a_2.addBox(-0.2F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		setRotation(bSpike4a_2, -0.40980330836826856F, 0.0F, 0.0F);
		bSpike4b_1 = new ModelRenderer(this, 39, 0);
		bSpike4b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike4b_1.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		bSpike1c = new ModelRenderer(this, 39, 0);
		bSpike1c.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike1c.addBox(-0.7F, -2.0F, -0.3F, 1, 1, 1, 0.0F);
		rSpike2b = new ModelRenderer(this, 37, 0);
		rSpike2b.mirror = true;
		rSpike2b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike2b.addBox(-2.1F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		lSpike1a = new ModelRenderer(this, 37, 0);
		lSpike1a.setRotationPoint(2.4F, 0.0F, 1.5F);
		lSpike1a.addBox(-0.1F, -0.5F, -1.0F, 2, 2, 2, 0.0F);
		setRotation(lSpike1a, 0.0F, -0.4553564018453205F, 0.0F);
		bSpike2c = new ModelRenderer(this, 39, 0);
		bSpike2c.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike2c.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		bSpike7c = new ModelRenderer(this, 39, 0);
		bSpike7c.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike7c.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		lSpike3e = new ModelRenderer(this, 39, 0);
		lSpike3e.setRotationPoint(1.6F, 0.5F, 0.0F);
		lSpike3e.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		rSpike3b = new ModelRenderer(this, 37, 0);
		rSpike3b.mirror = true;
		rSpike3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike3b.addBox(-2.1F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		rSpike0d = new ModelRenderer(this, 37, 0);
		rSpike0d.mirror = true;
		rSpike0d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike0d.addBox(-2.1F, 0.2F, -0.3F, 2, 1, 1, 0.0F);
		head = new ModelRenderer(this, 0, 19);
		head.setRotationPoint(0.0F, 0.5F, -1.2F);
		head.addBox(-3.5F, -1.0F, -3.0F, 7, 2, 3, 0.0F);
		segment3 = new ModelRenderer(this, 0, 0);
		segment3.setRotationPoint(0.0F, 0.0F, 4.9F);
		segment3.addBox(-3.0F, -1.5F, 0.0F, 6, 3, 5, 0.0F);
		lSpike2c = new ModelRenderer(this, 37, 0);
		lSpike2c.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike2c.addBox(-0.1F, 0.2F, -0.7F, 2, 1, 1, 0.0F);
		bSpike3a = new ModelRenderer(this, 39, 0);
		bSpike3a.setRotationPoint(0.0F, -1.1F, -1.2F);
		bSpike3a.addBox(-0.2F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		setRotation(bSpike3a, -0.40980330836826856F, 0.0F, 0.0F);
		rSpike1b = new ModelRenderer(this, 39, 0);
		rSpike1b.mirror = true;
		rSpike1b.setRotationPoint(-2.1F, 0.5F, 0.0F);
		rSpike1b.addBox(-1.0F, -1.0F, -0.5F, 1, 2, 1, 0.0F);
		rSpike3c = new ModelRenderer(this, 37, 0);
		rSpike3c.mirror = true;
		rSpike3c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike3c.addBox(-2.1F, 0.2F, -0.8F, 2, 1, 1, 0.0F);
		shell2 = new ModelRenderer(this, 0, 10);
		shell2.setRotationPoint(0.0F, 0.0F, 2.5F);
		shell2.addBox(-3.5F, -2.1F, -1.8F, 7, 2, 5, 0.0F);
		setRotation(shell2, 0.18203784098300857F, 0.0F, 0.0F);
		rSpike4d = new ModelRenderer(this, 37, 0);
		rSpike4d.mirror = true;
		rSpike4d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike4d.addBox(-2.1F, 0.2F, -0.3F, 2, 1, 1, 0.0F);
		lMandible = new ModelRenderer(this, 23, 0);
		lMandible.setRotationPoint(2.5F, 0.0F, -2.6F);
		lMandible.addBox(-1.0F, -0.5F, -3.8F, 2, 1, 4, 0.0F);
		setRotation(lMandible, 0.0F, -0.27314402793711257F, 0.0F);
		bSpike6b = new ModelRenderer(this, 39, 0);
		bSpike6b.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike6b.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		rSpike1a = new ModelRenderer(this, 37, 0);
		rSpike1a.mirror = true;
		rSpike1a.setRotationPoint(-2.4F, 0.0F, 1.5F);
		rSpike1a.addBox(-2.1F, -0.5F, -1.0F, 2, 2, 2, 0.0F);
		setRotation(rSpike1a, 0.0F, 0.4553564018453205F, 0.0F);
		rSpike4b = new ModelRenderer(this, 37, 0);
		rSpike4b.mirror = true;
		rSpike4b.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike4b.addBox(-2.1F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		lSpike1aa = new ModelRenderer(this, 37, 0);
		lSpike1aa.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike1aa.addBox(-0.1F, -0.9F, -1.0F, 2, 1, 2, 0.0F);
		rSpike0a = new ModelRenderer(this, 37, 0);
		rSpike0a.mirror = true;
		rSpike0a.setRotationPoint(-2.0F, 0.0F, -1.2F);
		rSpike0a.addBox(-2.1F, -0.3F, -0.8F, 2, 1, 1, 0.0F);
		setRotation(rSpike0a, 0.0F, 0.4553564018453205F, 0.0F);
		rSpike2d = new ModelRenderer(this, 37, 0);
		rSpike2d.mirror = true;
		rSpike2d.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike2d.addBox(-2.1F, 0.2F, -0.3F, 2, 1, 1, 0.0F);
		lMandibleSpikes = new ModelRenderer(this, 19, 18);
		lMandibleSpikes.setRotationPoint(0.0F, 0.0F, 0.0F);
		lMandibleSpikes.addBox(-1.5F, 0.1F, -5.7F, 4, 0, 5, 0.0F);
		setRotation(lMandibleSpikes, 0.0F, 0.18203784098300857F, 0.0F);
		tail = new ModelRenderer(this, 36, 9);
		tail.setRotationPoint(0.0F, 0.5F, 4.8F);
		tail.addBox(-2.5F, -1.0F, 0.0F, 5, 2, 4, 0.0F);
		rSpike3a = new ModelRenderer(this, 37, 0);
		rSpike3a.mirror = true;
		rSpike3a.setRotationPoint(-2.4F, 0.0F, 3.5F);
		rSpike3a.addBox(-2.1F, -0.3F, -0.8F, 2, 1, 1, 0.0F);
		setRotation(rSpike3a, 0.0F, 0.4553564018453205F, 0.0F);
		bSpike4a_1 = new ModelRenderer(this, 39, 0);
		bSpike4a_1.setRotationPoint(0.0F, -1.1F, -1.2F);
		bSpike4a_1.addBox(-0.2F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		setRotation(bSpike4a_1, -0.40980330836826856F, 0.0F, 0.0F);
		bSpike3d = new ModelRenderer(this, 39, 0);
		bSpike3d.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike3d.addBox(-0.7F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		rSpike2e = new ModelRenderer(this, 39, 0);
		rSpike2e.mirror = true;
		rSpike2e.setRotationPoint(-2.0F, 0.5F, 0.0F);
		rSpike2e.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		bSpike4e_1 = new ModelRenderer(this, 38, 0);
		bSpike4e_1.setRotationPoint(0.0F, -1.6F, -0.2F);
		bSpike4e_1.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotation(bSpike4e_1, -0.18203784098300857F, 0.0F, 0.0F);
		segment2 = new ModelRenderer(this, 0, 0);
		segment2.setRotationPoint(0.0F, 0.0F, 2.4F);
		segment2.addBox(-3.0F, -1.5F, 0.0F, 6, 3, 5, 0.0F);
		lSpike4b = new ModelRenderer(this, 37, 0);
		lSpike4b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike4b.addBox(-0.1F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		bSpike3e = new ModelRenderer(this, 39, 0);
		bSpike3e.setRotationPoint(0.0F, -1.6F, -0.2F);
		bSpike3e.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotation(bSpike3e, -0.18203784098300857F, 0.0F, 0.0F);
		bSpike7b = new ModelRenderer(this, 39, 0);
		bSpike7b.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike7b.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		bSpike5d = new ModelRenderer(this, 39, 0);
		bSpike5d.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike5d.addBox(-0.7F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		bSpike4c = new ModelRenderer(this, 39, 0);
		bSpike4c.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike4c.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		rMandible = new ModelRenderer(this, 23, 0);
		rMandible.mirror = true;
		rMandible.setRotationPoint(-2.5F, 0.0F, -2.6F);
		rMandible.addBox(-1.0F, -0.5F, -3.8F, 2, 1, 4, 0.0F);
		setRotation(rMandible, 0.0F, 0.27314402793711257F, 0.0F);
		bSpike4e = new ModelRenderer(this, 39, 0);
		bSpike4e.setRotationPoint(0.0F, -1.2F, -0.2F);
		bSpike4e.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotation(bSpike4e, -0.18203784098300857F, 0.0F, 0.0F);
		lSpike2b = new ModelRenderer(this, 37, 0);
		lSpike2b.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike2b.addBox(-0.1F, -0.3F, -0.3F, 2, 1, 1, 0.0F);
		shell1 = new ModelRenderer(this, 0, 10);
		shell1.setRotationPoint(0.0F, 0.0F, 0.0F);
		shell1.addBox(-3.5F, -2.1F, -1.8F, 7, 2, 5, 0.0F);
		setRotation(shell1, 0.18203784098300857F, 0.0F, 0.0F);
		bSpike6e = new ModelRenderer(this, 39, 0);
		bSpike6e.setRotationPoint(0.0F, -1.6F, -0.2F);
		bSpike6e.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotation(bSpike6e, -0.18203784098300857F, 0.0F, 0.0F);
		bSpike4b_2 = new ModelRenderer(this, 39, 0);
		bSpike4b_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike4b_2.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		lSpike0e = new ModelRenderer(this, 39, 0);
		lSpike0e.setRotationPoint(1.6F, 0.5F, 0.0F);
		lSpike0e.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		lSpike0d = new ModelRenderer(this, 37, 0);
		lSpike0d.setRotationPoint(0.0F, 0.0F, 0.0F);
		lSpike0d.addBox(-0.1F, 0.2F, -0.3F, 2, 1, 1, 0.0F);
		rSpike2c = new ModelRenderer(this, 37, 0);
		rSpike2c.mirror = true;
		rSpike2c.setRotationPoint(0.0F, 0.0F, 0.0F);
		rSpike2c.addBox(-2.1F, 0.2F, -0.8F, 2, 1, 1, 0.0F);
		lSpike3a = new ModelRenderer(this, 37, 0);
		lSpike3a.setRotationPoint(2.5F, 0.0F, 3.9F);
		lSpike3a.addBox(-0.1F, -0.3F, -0.7F, 2, 1, 1, 0.0F);
		setRotation(lSpike3a, 0.0F, -0.4553564018453205F, 0.0F);
		lSpike2e = new ModelRenderer(this, 39, 0);
		lSpike2e.setRotationPoint(1.6F, 0.5F, 0.0F);
		lSpike2e.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		bSpike3b = new ModelRenderer(this, 39, 0);
		bSpike3b.setRotationPoint(0.0F, 0.0F, 0.0F);
		bSpike3b.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		bSpike5e = new ModelRenderer(this, 39, 0);
		bSpike5e.setRotationPoint(0.0F, -1.2F, -0.2F);
		bSpike5e.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		setRotation(bSpike5e, -0.18203784098300857F, 0.0F, 0.0F);
		rSpike4e = new ModelRenderer(this, 39, 0);
		rSpike4e.mirror = true;
		rSpike4e.setRotationPoint(-2.0F, 0.5F, 0.0F);
		rSpike4e.addBox(-1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
		rSpike0a.addChild(rSpike0e);
		lSpike3a.addChild(lSpike3d);
		bSpike4c.addChild(bSpike4d);
		bSpike3a.addChild(bSpike3c);
		segment4.addChild(rSpike4a);
		rSpike1b.addChild(rSpike1c);
		lSpike4a.addChild(lSpike4e);
		bSpike7c.addChild(bSpike7d);
		lMandible.addChild(lMandible2);
		rMandible.addChild(rMandibleSpikes);
		rSpike4a.addChild(rSpike4c);
		bSpike2a.addChild(bSpike2e);
		rSpike1a.addChild(rSpike1aa);
		lSpike4a.addChild(lSpike4c);
		bSpike2c.addChild(bSpike2d);
		segment2.addChild(rSpike2a);
		bSpike4a.addChild(bSpike4b);
		segment4.addChild(lSpike4a);
		bSpike6a.addChild(bSpike6d);
		bSpike2a.addChild(bSpike2b);
		lSpike2a.addChild(lSpike2d);
		shell1.addChild(bSpike1a);
		bSpike4a_1.addChild(bSpike4d_1);
		lSpike3a.addChild(lSpike3b);
		lSpike3a.addChild(lSpike3c);
		bSpike7a.addChild(bSpike7e);
		segment1.addChild(lSpike0a);
		bSpike4a_2.addChild(bSpike5c);
		rSpike0a.addChild(rSpike0c);
		bSpike6a.addChild(bSpike6c);
		bSpike1a.addChild(bSpike1b);
		shell4.addChild(bSpike6a);
		rMandible.addChild(rMandible2);
		shell2.addChild(bSpike4a);
		rSpike0a.addChild(rSpike0b);
		segment2.addChild(lSpike2a);
		bSpike1a.addChild(bSpike1d);
		segment3.addChild(segment4);
		segment3.addChild(shell3);
		shell4.addChild(bSpike7a);
		bSpike4a_1.addChild(bSpike4c_1);
		bSpike1a.addChild(bSpike1e);
		rSpike3a.addChild(rSpike3e);
		lSpike0a.addChild(lSpike0b);
		segment4.addChild(shell4);
		shell1.addChild(bSpike2a);
		rSpike3a.addChild(rSpike3d);
		lSpike1a.addChild(lSpike1b);
		lSpike1b.addChild(lSpike1c);
		lSpike0a.addChild(lSpike0c);
		lSpike4a.addChild(lSpike4d);
		shell3.addChild(bSpike4a_2);
		bSpike4a_1.addChild(bSpike4b_1);
		bSpike1a.addChild(bSpike1c);
		rSpike2a.addChild(rSpike2b);
		segment1.addChild(lSpike1a);
		bSpike2a.addChild(bSpike2c);
		bSpike7a.addChild(bSpike7c);
		lSpike3a.addChild(lSpike3e);
		rSpike3a.addChild(rSpike3b);
		rSpike0a.addChild(rSpike0d);
		segment1.addChild(head);
		segment2.addChild(segment3);
		lSpike2a.addChild(lSpike2c);
		shell2.addChild(bSpike3a);
		rSpike1a.addChild(rSpike1b);
		rSpike3a.addChild(rSpike3c);
		segment2.addChild(shell2);
		rSpike4a.addChild(rSpike4d);
		head.addChild(lMandible);
		bSpike6a.addChild(bSpike6b);
		segment1.addChild(rSpike1a);
		rSpike4a.addChild(rSpike4b);
		lSpike1a.addChild(lSpike1aa);
		segment1.addChild(rSpike0a);
		rSpike2a.addChild(rSpike2d);
		lMandible.addChild(lMandibleSpikes);
		segment4.addChild(tail);
		segment3.addChild(rSpike3a);
		shell3.addChild(bSpike4a_1);
		bSpike3a.addChild(bSpike3d);
		rSpike2a.addChild(rSpike2e);
		bSpike4a_1.addChild(bSpike4e_1);
		segment1.addChild(segment2);
		lSpike4a.addChild(lSpike4b);
		bSpike3a.addChild(bSpike3e);
		bSpike7a.addChild(bSpike7b);
		bSpike5c.addChild(bSpike5d);
		bSpike4a.addChild(bSpike4c);
		head.addChild(rMandible);
		bSpike4a.addChild(bSpike4e);
		lSpike2a.addChild(lSpike2b);
		segment1.addChild(shell1);
		bSpike6a.addChild(bSpike6e);
		bSpike4a_2.addChild(bSpike4b_2);
		lSpike0a.addChild(lSpike0e);
		lSpike0a.addChild(lSpike0d);
		rSpike2a.addChild(rSpike2c);
		segment3.addChild(lSpike3a);
		lSpike2a.addChild(lSpike2e);
		bSpike3a.addChild(bSpike3b);
		bSpike4a_2.addChild(bSpike5e);
		rSpike4a.addChild(rSpike4e);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
		segment1.render(f5);
	}
	
	@Override
   	public void render(Object obj) {
       	EntityLivingBase base = (EntityLivingBase) obj;
       	head.rotateAngleX = headPitch(obj) * 0.017453292F;
		head.rotateAngleY = headYaw(obj) * 0.017453292F;
		lSpike0a.rotateAngleY = MathHelper.sin(swingProgress(obj) * 1.1F) * 1 * swingProgressPrev(obj);
		lSpike1a.rotateAngleY = MathHelper.sin(swingProgress(obj) * 1.2F) * 1 * swingProgressPrev(obj);
		lSpike2a.rotateAngleY = MathHelper.sin(swingProgress(obj) * 1.3F) * 1 * swingProgressPrev(obj);
		lSpike3a.rotateAngleY = MathHelper.sin(swingProgress(obj) * 1.4F) * 1 * swingProgressPrev(obj);
		lSpike4a.rotateAngleY = MathHelper.sin(swingProgress(obj) * 1.5F) * 1 * swingProgressPrev(obj);
		rSpike0a.rotateAngleY = MathHelper.cos(swingProgress(obj) * 1.5F) * 1 * swingProgressPrev(obj);
		rSpike1a.rotateAngleY = MathHelper.cos(swingProgress(obj) * 1.4F) * 1 * swingProgressPrev(obj);
		rSpike2a.rotateAngleY = MathHelper.cos(swingProgress(obj) * 1.3F) * 1 * swingProgressPrev(obj);
		rSpike3a.rotateAngleY = MathHelper.cos(swingProgress(obj) * 1.2F) * 1 * swingProgressPrev(obj);
		rSpike4a.rotateAngleY = MathHelper.cos(swingProgress(obj) * 1.1F) * 1 * swingProgressPrev(obj);
		lMandible.rotateAngleY = (MathHelper.sin(swingProgress(obj) * 0.5F) / 4.1F) * 2.0F * swingProgressPrev(obj);
		rMandible.rotateAngleY = (MathHelper.sin(swingProgress(obj) * -0.5F) / 4.1F) * 2.0F * swingProgressPrev(obj);
   	}
}
