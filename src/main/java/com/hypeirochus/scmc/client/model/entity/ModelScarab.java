package com.hypeirochus.scmc.client.model.entity;

import com.hypeirochus.api.client.render.model.Model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * reaverScarab2 - Cybercat5555 Created using Tabula 5.1.0
 */
public class ModelScarab extends Model {
	public ModelRenderer	part01;
	public ModelRenderer	part02;
	public ModelRenderer	part03;
	public ModelRenderer	part04;
	public ModelRenderer	node01;
	public ModelRenderer	node02;
	public ModelRenderer	node03;
	public ModelRenderer	node03_1;

	public ModelScarab() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.node03 = new ModelRenderer(this, 84, 10);
		this.node03.mirror = true;
		this.node03.setRotationPoint(0.0F, -0.3F, -5.5F);
		this.node03.addBox(0.0F, -2.0F, -2.0F, 1, 4, 4, 0.0F);
		this.setRotation(node03, 0.0F, 1.5707963267948966F, 0.0F);
		this.node01 = new ModelRenderer(this, 84, 0);
		this.node01.mirror = true;
		this.node01.setRotationPoint(5.5F, -0.3F, 0.0F);
		this.node01.addBox(0.0F, -2.0F, -2.0F, 1, 4, 4, 0.0F);
		this.part03 = new ModelRenderer(this, 0, 26);
		this.part03.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.part03.addBox(-5.0F, -4.0F, -5.0F, 10, 8, 10, 0.0F);
		this.node03_1 = new ModelRenderer(this, 84, 10);
		this.node03_1.mirror = true;
		this.node03_1.setRotationPoint(0.0F, -0.3F, 5.5F);
		this.node03_1.addBox(0.0F, -2.0F, -2.0F, 1, 4, 4, 0.0F);
		this.setRotation(node03_1, 0.0F, -1.5707963267948966F, 0.0F);
		this.part04 = new ModelRenderer(this, 46, 24);
		this.part04.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.part04.addBox(-5.5F, -3.0F, -5.5F, 11, 6, 11, 0.0F);
		this.part01 = new ModelRenderer(this, 0, 0);
		this.part01.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.part01.addBox(-4.0F, -6.0F, -4.0F, 8, 12, 8, 0.0F);
		this.part02 = new ModelRenderer(this, 35, 0);
		this.part02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.part02.addBox(-4.5F, -5.0F, -4.5F, 9, 10, 9, 0.0F);
		this.node02 = new ModelRenderer(this, 84, 0);
		this.node02.mirror = true;
		this.node02.setRotationPoint(-5.5F, -0.3F, 0.0F);
		this.node02.addBox(0.0F, -2.0F, -2.0F, 1, 4, 4, 0.0F);
		this.setRotation(node02, 0.0F, 3.141592653589793F, 0.0F);
		this.part04.addChild(this.node03);
		this.part04.addChild(this.node01);
		this.part02.addChild(this.part03);
		this.part04.addChild(this.node03_1);
		this.part03.addChild(this.part04);
		this.part01.addChild(this.part02);
		this.part04.addChild(this.node02);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.part01.render(f5);
	}
}
