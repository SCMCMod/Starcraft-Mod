package io.github.scmcmod.client.model.block;

import io.github.scmcmod.handlers.CoreUtil;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * sc2flora_palm - cybercat5555 Created using Tabula 7.0.0
 */
public class ModelPalm extends ModelBase
{

	public ModelRenderer branch01a;
	public ModelRenderer branch02a;
	public ModelRenderer branch03a;
	public ModelRenderer branch04a;
	public ModelRenderer branch05a;
	public ModelRenderer branch06a;
	public ModelRenderer branch07a;
	public ModelRenderer branch08a;
	public ModelRenderer branch09a;
	public ModelRenderer branch10a;
	public ModelRenderer branch11a;
	public ModelRenderer branch12a;
	public ModelRenderer branch13a;
	public ModelRenderer branch14a;
	public ModelRenderer branch15a;
	public ModelRenderer branch16a;
	public ModelRenderer branch01b;
	public ModelRenderer branch02b;
	public ModelRenderer branch03b;
	public ModelRenderer branch04b;
	public ModelRenderer branch05b;
	public ModelRenderer branch06b;
	public ModelRenderer branch07b;
	public ModelRenderer branch08b;
	public ModelRenderer branch09b;
	public ModelRenderer branch10b;
	public ModelRenderer branch11b;
	public ModelRenderer branch12b;
	public ModelRenderer branch13b;
	public ModelRenderer branch14b;
	public ModelRenderer branch15b;
	public ModelRenderer branch16b;

	public ModelPalm()
	{
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.branch12b = new ModelRenderer(this, 28, 42);
		this.branch12b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch12b.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch12b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch06b = new ModelRenderer(this, 38, 0);
		this.branch06b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch06b.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch06b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch09a = new ModelRenderer(this, 38, 21);
		this.branch09a.setRotationPoint(2.0F, 24.2F, -9.1F);
		this.branch09a.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch09a, 0.0F, 0.22759093446006054F, 0.0F);
		this.branch12a = new ModelRenderer(this, 28, 42);
		this.branch12a.setRotationPoint(-9.4F, 24.0F, 0.3F);
		this.branch12a.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch12a, 0.0F, 0.5009094953223726F, 0.0F);
		this.branch02b = new ModelRenderer(this, 0, 0);
		this.branch02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch02b.addBox(-8.5F, -36.0F, 0.0F, 17, 36, 0, 0.0F);
		this.setRotateAngle(branch02b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch01a = new ModelRenderer(this, 0, 0);
		this.branch01a.setRotationPoint(6.1F, 24.1F, -5.0F);
		this.branch01a.addBox(-8.5F, -36.0F, 0.0F, 17, 36, 0, 0.0F);
		this.setRotateAngle(branch01a, 0.0F, -0.27314402793711257F, 0.0F);
		this.branch11b = new ModelRenderer(this, 14, 41);
		this.branch11b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch11b.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch11b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch14a = new ModelRenderer(this, 0, 41);
		this.branch14a.setRotationPoint(12.8F, 24.0F, 1.0F);
		this.branch14a.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.branch14b = new ModelRenderer(this, 0, 41);
		this.branch14b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch14b.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch14b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch16a = new ModelRenderer(this, 14, 41);
		this.branch16a.setRotationPoint(-3.2F, 24.0F, -11.1F);
		this.branch16a.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch16a, 0.0F, 0.27314402793711257F, 0.0F);
		this.branch08a = new ModelRenderer(this, 38, 0);
		this.branch08a.setRotationPoint(4.4F, 24.2F, 10.0F);
		this.branch08a.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch08a, 0.0F, 0.4553564018453205F, 0.0F);
		this.branch03a = new ModelRenderer(this, 0, 0);
		this.branch03a.setRotationPoint(7.9F, 24.1F, 6.4F);
		this.branch03a.addBox(-8.5F, -36.0F, 0.0F, 17, 36, 0, 0.0F);
		this.setRotateAngle(branch03a, 0.0F, 0.136659280431156F, 0.0F);
		this.branch01b = new ModelRenderer(this, 0, 0);
		this.branch01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch01b.addBox(-8.5F, -36.0F, 0.0F, 17, 36, 0, 0.0F);
		this.setRotateAngle(branch01b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch04b = new ModelRenderer(this, 38, 0);
		this.branch04b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch04b.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch04b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch16b = new ModelRenderer(this, 14, 41);
		this.branch16b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch16b.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch16b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch05b = new ModelRenderer(this, 38, 21);
		this.branch05b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch05b.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch05b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch10a = new ModelRenderer(this, 0, 41);
		this.branch10a.setRotationPoint(-5.8F, 24.0F, -7.5F);
		this.branch10a.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch10a, 0.0F, 0.5009094953223726F, 0.0F);
		this.branch06a = new ModelRenderer(this, 38, 21);
		this.branch06a.setRotationPoint(8.7F, 24.2F, 0.5F);
		this.branch06a.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch06a, 0.0F, 0.5918411493512771F, 0.0F);
		this.branch13a = new ModelRenderer(this, 14, 41);
		this.branch13a.setRotationPoint(-3.4F, 24.0F, 13.5F);
		this.branch13a.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch13a, 0.0F, 0.5009094953223726F, 0.0F);
		this.branch04a = new ModelRenderer(this, 38, 0);
		this.branch04a.setRotationPoint(-2.9F, 24.2F, -3.4F);
		this.branch04a.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.branch15b = new ModelRenderer(this, 28, 42);
		this.branch15b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch15b.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch15b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch08b = new ModelRenderer(this, 38, 0);
		this.branch08b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch08b.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch08b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch15a = new ModelRenderer(this, 28, 42);
		this.branch15a.setRotationPoint(12.8F, 24.0F, 9.2F);
		this.branch15a.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch15a, 0.0F, 0.27314402793711257F, 0.0F);
		this.branch05a = new ModelRenderer(this, 38, 21);
		this.branch05a.setRotationPoint(0.6F, 24.2F, 3.5F);
		this.branch05a.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch05a, 0.0F, 0.5462880558742251F, 0.0F);
		this.branch13b = new ModelRenderer(this, 14, 41);
		this.branch13b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch13b.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch13b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch02a = new ModelRenderer(this, 0, 0);
		this.branch02a.setRotationPoint(-5.6F, 24.1F, 2.4F);
		this.branch02a.addBox(-8.5F, -36.0F, 0.0F, 17, 36, 0, 0.0F);
		this.setRotateAngle(branch02a, 0.0F, 0.4553564018453205F, 0.0F);
		this.branch09b = new ModelRenderer(this, 38, 21);
		this.branch09b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch09b.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch09b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch11a = new ModelRenderer(this, 14, 41);
		this.branch11a.setRotationPoint(9.4F, 24.0F, -7.9F);
		this.branch11a.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch11a, 0.0F, -0.6373942428283291F, 0.0F);
		this.branch07a = new ModelRenderer(this, 38, 0);
		this.branch07a.setRotationPoint(-8.0F, 24.2F, 7.5F);
		this.branch07a.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch07a, 0.0F, -1.0016444577195458F, 0.0F);
		this.branch07b = new ModelRenderer(this, 38, 21);
		this.branch07b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch07b.addBox(-4.5F, -20.0F, 0.0F, 9, 20, 0, 0.0F);
		this.setRotateAngle(branch07b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch03b = new ModelRenderer(this, 0, 0);
		this.branch03b.setRotationPoint(0.0F, -0.0F, 0.0F);
		this.branch03b.addBox(-8.5F, -36.0F, 0.0F, 17, 36, 0, 0.0F);
		this.setRotateAngle(branch03b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch10b = new ModelRenderer(this, 0, 41);
		this.branch10b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.branch10b.addBox(-3.0F, -12.0F, 0.0F, 6, 12, 0, 0.0F);
		this.setRotateAngle(branch10b, 0.0F, 1.5707963267948966F, 0.0F);
		this.branch12a.addChild(this.branch12b);
		this.branch06a.addChild(this.branch06b);
		this.branch02a.addChild(this.branch02b);
		this.branch11a.addChild(this.branch11b);
		this.branch14a.addChild(this.branch14b);
		this.branch01a.addChild(this.branch01b);
		this.branch04a.addChild(this.branch04b);
		this.branch16a.addChild(this.branch16b);
		this.branch05a.addChild(this.branch05b);
		this.branch15a.addChild(this.branch15b);
		this.branch08a.addChild(this.branch08b);
		this.branch13a.addChild(this.branch13b);
		this.branch09a.addChild(this.branch09b);
		this.branch07a.addChild(this.branch07b);
		this.branch03a.addChild(this.branch03b);
		this.branch10a.addChild(this.branch10b);
	}

	public void render(float scale, float age)
	{
		GlStateManager.disableCull();
		this.setRotationAngles(age);
		this.branch09a.render(scale);
		this.branch12a.render(scale);
		this.branch01a.render(scale);
		this.branch14a.render(scale);
		this.branch16a.render(scale);
		this.branch08a.render(scale);
		this.branch03a.render(scale);
		this.branch10a.render(scale);
		this.branch06a.render(scale);
		this.branch13a.render(scale);
		this.branch04a.render(scale);
		this.branch15a.render(scale);
		this.branch05a.render(scale);
		this.branch02a.render(scale);
		this.branch11a.render(scale);
		this.branch07a.render(scale);
		GlStateManager.enableCull();
	}

	@SideOnly(Side.CLIENT)
	public void setRotationAngles(float ageIn)
	{
		if (ageIn != 0)
		{
			float age = ageIn + CoreUtil.getPartialTicks();
		}
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
