package io.github.scmcmod.client.model.entity;

import io.github.scmcmod.SCConstants;
import io.github.scmcmod.Starcraft;
import net.rom.client.render.model.Model;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * SCMC_axe - XJustaguyX Created using Tabula 5.1.0
 */
public class ModelSolariteReaper extends Model
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(SCConstants.MODID, "textures/models/solaritereaper.png");
	public ModelRenderer shape1;
	public ModelRenderer shape2;
	public ModelRenderer shape3;
	public ModelRenderer shape4;
	public ModelRenderer shape5;
	public ModelRenderer shape6;
	public ModelRenderer shape7;
	public ModelRenderer shape8;
	public ModelRenderer shape9;
	public ModelRenderer shape0;
	public ModelRenderer shape18;
	public ModelRenderer shape19;
	public ModelRenderer shape10;
	public ModelRenderer shape16;

	public ModelSolariteReaper()
	{
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.shape0 = new ModelRenderer(this, 0, 23);
		this.shape0.setRotationPoint(0.0F, -11.0F, 0.0F);
		this.shape0.addBox(4.9F, -21.8F, -0.52F, 2, 4, 1, 0.0F);
		this.shape2 = new ModelRenderer(this, 7, 24);
		this.shape2.setRotationPoint(0.0F, 11.0F, 0.0F);
		this.shape2.addBox(-1.3F, 0.3F, -1.49F, 3, 1, 3, 0.0F);
		this.setRotation(shape2, 0.0F, 0.0F, 0.2617993877991494F);
		this.shape9 = new ModelRenderer(this, 29, 0);
		this.shape9.setRotationPoint(0.0F, -11.0F, 0.0F);
		this.shape9.addBox(-1.5F, -22.0F, -1.5F, 3, 8, 3, 0.0F);
		this.shape1 = new ModelRenderer(this, 42, 0);
		this.shape1.setRotationPoint(0.0F, -32.0F, 0.0F);
		this.shape1.addBox(-0.5F, -1.5F, -1.49F, 2, 2, 3, 0.0F);
		this.setRotation(shape1, 0.0F, 0.0F, -0.7853981633974483F);
		this.shape7 = new ModelRenderer(this, 0, 38);
		this.shape7.setRotationPoint(0.0F, -11.0F, 0.0F);
		this.shape7.addBox(0.9F, -31.8F, 0.0F, 10, 21, 0, 0.0F);
		this.shape18 = new ModelRenderer(this, 0, 0);
		this.shape18.setRotationPoint(0.0F, -11.0F, 0.0F);
		this.shape18.addBox(-10.9F, -31.8F, 0.0F, 10, 21, 0, 0.0F);
		this.shape3 = new ModelRenderer(this, 20, 0);
		this.shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shape3.addBox(-1.0F, -25.0F, -1.0F, 2, 37, 2, 0.0F);
		this.shape8 = new ModelRenderer(this, 7, 30);
		this.shape8.setRotationPoint(0.0F, -29.0F, 0.0F);
		this.shape8.addBox(2.5F, -5.0F, -0.51F, 2, 5, 1, 0.0F);
		this.setRotation(shape8, 0.0F, 0.0F, 0.45378560551852565F);
		this.shape10 = new ModelRenderer(this, 7, 30);
		this.shape10.setRotationPoint(0.0F, -29.0F, 0.0F);
		this.shape10.addBox(-4.5F, -5.0F, -0.51F, 2, 5, 1, 0.0F);
		this.setRotation(shape10, 0.0F, 0.0F, -0.45378560551852565F);
		this.shape5 = new ModelRenderer(this, 53, 0);
		this.shape5.setRotationPoint(0.0F, -11.0F, 0.0F);
		this.shape5.addBox(-1.5F, 23.0F, -1.5F, 3, 7, 3, 0.0F);
		this.shape16 = new ModelRenderer(this, 0, 30);
		this.shape16.setRotationPoint(0.0F, -29.0F, 0.0F);
		this.shape16.addBox(4.7F, -0.4F, -0.5F, 2, 6, 1, 0.0F);
		this.setRotation(shape16, 0.0F, 0.0F, 3.5953782591083185F);
		this.shape4 = new ModelRenderer(this, 0, 30);
		this.shape4.setRotationPoint(0.0F, -29.0F, 0.0F);
		this.shape4.addBox(-6.7F, -0.4F, -0.5F, 2, 6, 1, 0.0F);
		this.setRotation(shape4, 0.0F, 0.0F, -3.5953782591083185F);
		this.shape19 = new ModelRenderer(this, 0, 23);
		this.shape19.setRotationPoint(0.0F, -11.0F, 0.0F);
		this.shape19.addBox(-6.9F, -21.8F, -0.52F, 2, 4, 1, 0.0F);
		this.shape6 = new ModelRenderer(this, 7, 24);
		this.shape6.setRotationPoint(0.0F, 18.0F, 0.0F);
		this.shape6.addBox(-1.3F, 0.3F, -1.49F, 3, 1, 3, 0.0F);
		this.setRotation(shape6, 0.0F, 0.0F, 0.2617993877991494F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.shape0.render(f5);
		this.shape2.render(f5);
		this.shape9.render(f5);
		this.shape1.render(f5);
		this.shape7.render(f5);
		this.shape18.render(f5);
		this.shape3.render(f5);
		this.shape8.render(f5);
		this.shape10.render(f5);
		this.shape5.render(f5);
		this.shape16.render(f5);
		this.shape4.render(f5);
		this.shape19.render(f5);
		this.shape6.render(f5);
	}
}
