package ga.scmc.client.renderer.model;

import ga.scmc.lib.Library;
import hypeirochus.api.client.render.model.Model;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Gauss Rifle Bayonet - SCMCDevTeam
 * Created using Tabula 5.1.0
 */
public class ModelC14GaussRifle extends Model {
	public static final ResourceLocation TEXTURE = new ResourceLocation(Library.MODID, "textures/models/c14GaussRifle.png");
	
    public ModelRenderer main2;
    public ModelRenderer main4;
    public ModelRenderer main5;
    public ModelRenderer main6;
    public ModelRenderer main7;
    public ModelRenderer main8;
    public ModelRenderer main11;
    public ModelRenderer main12;
    public ModelRenderer main13;
    public ModelRenderer main14;
    public ModelRenderer main15;
    public ModelRenderer main16;
    public ModelRenderer main17;
    public ModelRenderer main18;
    public ModelRenderer main19;
    public ModelRenderer main20;
    public ModelRenderer main21;
    public ModelRenderer main22;
    public ModelRenderer main23;
    public ModelRenderer main24;
    public ModelRenderer main25;
    public ModelRenderer main26;
    public ModelRenderer main27;
    public ModelRenderer main28;
    public ModelRenderer main33;
    public ModelRenderer main34;
    public ModelRenderer main35;
    public ModelRenderer main36;
    public ModelRenderer main37;
    public ModelRenderer main39;
    public ModelRenderer main40;
    public ModelRenderer main41;
    public ModelRenderer main42;
    public ModelRenderer main43;
    public ModelRenderer main44;
    public ModelRenderer main45;
    public ModelRenderer main46;
    public ModelRenderer main48;
    public ModelRenderer main49;
    public ModelRenderer main50;
    public ModelRenderer main51;
    public ModelRenderer main52;
    public ModelRenderer main53;
    public ModelRenderer main54;
    public ModelRenderer main1;
    public ModelRenderer main24_1;
    public ModelRenderer main24_2;
    public ModelRenderer main3;

    public ModelC14GaussRifle() {
        this.textureWidth = 400;
        this.textureHeight = 200;
        this.main42 = new ModelRenderer(this, 21, 13);
        this.main42.setRotationPoint(-2.5F, 11.3F, 42.5F);
        this.main42.addBox(-0.01F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        this.setRotation(main42, 0.8196066167365371F, 0.0F, 0.0F);
        this.main45 = new ModelRenderer(this, 12, 8);
        this.main45.setRotationPoint(-2.0F, 8.1F, 41.0F);
        this.main45.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
        this.main40 = new ModelRenderer(this, 134, 43);
        this.main40.setRotationPoint(-3.5F, 0.8F, 47.0F);
        this.main40.addBox(-0.02F, 0.2F, 0.0F, 7, 5, 8, 0.0F);
        this.setRotation(main40, -0.4553564018453205F, 0.0F, 0.0F);
        this.main51 = new ModelRenderer(this, 22, 8);
        this.main51.setRotationPoint(-2.5F, 4.0F, -10.0F);
        this.main51.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.main17 = new ModelRenderer(this, 0, 32);
        this.main17.setRotationPoint(0.83F, 0.77F, -9.0F);
        this.main17.addBox(0.0F, 0.0F, 0.0F, 1, 2, 55, 0.0F);
        this.setRotation(main17, 0.0F, 0.00471238898038469F, -0.9190903841002138F);
        this.main13 = new ModelRenderer(this, 115, 91);
        this.main13.setRotationPoint(-3.5F, 2.0F, 15.0F);
        this.main13.addBox(-0.01F, 0.0F, 0.0F, 7, 3, 34, 0.0F);
        this.setRotation(main13, 0.0F, 0.0F, 0.0017453292519943296F);
        this.main16 = new ModelRenderer(this, 0, 32);
        this.main16.setRotationPoint(-1.5F, -0.0F, -9.0F);
        this.main16.addBox(0.0F, 0.0F, 0.0F, 1, 2, 55, 0.0F);
        this.setRotation(main16, 0.0F, 0.0F, 0.9560913642424937F);
        this.main33 = new ModelRenderer(this, 41, 3);
        this.main33.setRotationPoint(-1.5F, 12.2F, 44.3F);
        this.main33.addBox(-0.01F, 0.0F, 0.0F, 3, 2, 7, 0.0F);
        this.setRotation(main33, -1.3203415791337103F, 0.0F, 0.0F);
        this.main3 = new ModelRenderer(this, 240, 35);
        this.main3.setRotationPoint(-3.5F, 7.0F, -6.0F);
        this.main3.addBox(-0.01F, 0.0F, 0.0F, 7, 5, 46, 0.0F);
        this.main25 = new ModelRenderer(this, 135, 0);
        this.main25.setRotationPoint(-2.5F, 12.0F, 29.9F);
        this.main25.addBox(0.0F, 0.0F, 0.0F, 5, 7, 9, 0.0F);
        this.main34 = new ModelRenderer(this, 45, 7);
        this.main34.setRotationPoint(-1.5F, 17.5F, 44.1F);
        this.main34.addBox(0.0F, -0.1F, 0.21F, 3, 2, 3, 0.0F);
        this.setRotation(main34, 0.22759093446006054F, 0.0F, 0.0F);
        this.main24 = new ModelRenderer(this, 138, 34);
        this.main24.setRotationPoint(-2.5F, 12.2F, 27.7F);
        this.main24.addBox(-0.01F, -2.1F, 0.0F, 5, 1, 7, 0.0F);
        this.setRotation(main24, -1.1383037381507017F, 0.0F, 0.0F);
        this.main4 = new ModelRenderer(this, 175, 0);
        this.main4.setRotationPoint(-2.5F, 7.7F, -3.7F);
        this.main4.addBox(-0.01F, 0.0F, 0.0F, 5, 10, 2, 0.0F);
        this.setRotation(main4, -0.6373942428283291F, 0.0F, 0.0F);
        this.main36 = new ModelRenderer(this, 102, 37);
        this.main36.setRotationPoint(-2.5F, 3.5F, 42.5F);
        this.main36.addBox(0.0F, 0.0F, 0.0F, 5, 9, 10, 0.0F);
        this.setRotation(main36, 0.045553093477052F, 0.0F, 0.0F);
        this.main46 = new ModelRenderer(this, 3, 9);
        this.main46.setRotationPoint(-2.0F, 9.3F, 41.3F);
        this.main46.addBox(-0.01F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.setRotation(main46, -0.8196066167365371F, 0.0F, 0.0F);
        this.main24_1 = new ModelRenderer(this, 138, 34);
        this.main24_1.setRotationPoint(-2.5F, 12.2F, 27.7F);
        this.main24_1.addBox(-0.01F, -0.1F, 0.0F, 5, 1, 7, 0.0F);
        this.setRotation(main24_1, -1.1383037381507017F, 0.0F, 0.0F);
        this.main19 = new ModelRenderer(this, 3, 13);
        this.main19.setRotationPoint(-3.5F, 7.1F, 24.4F);
        this.main19.addBox(-0.02F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.setRotation(main19, 0.8196066167365371F, 0.0F, 0.0F);
        this.main49 = new ModelRenderer(this, 147, 29);
        this.main49.setRotationPoint(-3.5F, 5.0F, -11.0F);
        this.main49.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.main1 = new ModelRenderer(this, 190, 0);
        this.main1.setRotationPoint(-2.5F, 5.9F, -10.0F);
        this.main1.addBox(0.0F, 0.0F, 0.0F, 5, 14, 2, 0.0F);
        this.main18 = new ModelRenderer(this, 261, 4);
        this.main18.setRotationPoint(-3.5F, 5.0F, 25.0F);
        this.main18.addBox(0.0F, 0.0F, 0.0F, 7, 4, 25, 0.0F);
        this.main53 = new ModelRenderer(this, 22, 8);
        this.main53.setRotationPoint(-2.0F, 4.0F, -10.0F);
        this.main53.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.main54 = new ModelRenderer(this, 22, 8);
        this.main54.setRotationPoint(1.0F, 4.0F, -10.0F);
        this.main54.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.main8 = new ModelRenderer(this, 101, 129);
        this.main8.setRotationPoint(-3.5F, 1.0F, -8.0F);
        this.main8.addBox(0.0F, 0.0F, -1.01F, 7, 1, 56, 0.0F);
        this.main11 = new ModelRenderer(this, 0, 90);
        this.main11.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.main11.addBox(0.0F, 0.0F, 0.0F, 3, 1, 53, 0.0F);
        this.main52 = new ModelRenderer(this, 22, 8);
        this.main52.setRotationPoint(1.5F, 4.0F, -10.0F);
        this.main52.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.main50 = new ModelRenderer(this, 5, 17);
        this.main50.setRotationPoint(-2.5F, 3.0F, -10.0F);
        this.main50.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        this.main20 = new ModelRenderer(this, 3, 13);
        this.main20.setRotationPoint(-3.5F, 4.2F, 25.2F);
        this.main20.addBox(-0.01F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.setRotation(main20, -0.8196066167365371F, 0.0F, 0.0F);
        this.main22 = new ModelRenderer(this, 167, 35);
        this.main22.setRotationPoint(-3.67F, 11.77F, 8.0F);
        this.main22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F);
        this.setRotation(main22, 0.0F, 0.0F, 1.0016444577195458F);
        this.main43 = new ModelRenderer(this, 19, 13);
        this.main43.setRotationPoint(-3.5F, 8.1F, 40.0F);
        this.main43.addBox(0.01F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.setRotation(main43, -0.8196066167365371F, 0.0F, 0.0F);
        this.main14 = new ModelRenderer(this, 3, 13);
        this.main14.setRotationPoint(-3.5F, 7.1F, 14.2F);
        this.main14.addBox(-0.02F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.setRotation(main14, 0.8196066167365371F, 0.0F, 0.0F);
        this.main39 = new ModelRenderer(this, 95, 25);
        this.main39.setRotationPoint(-1.5F, 2.2F, 52.5F);
        this.main39.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotation(main39, -1.5025539530419183F, 0.0F, 0.0F);
        this.main24_2 = new ModelRenderer(this, 138, 34);
        this.main24_2.setRotationPoint(-2.5F, 12.2F, 27.7F);
        this.main24_2.addBox(-0.01F, -1.1F, 0.0F, 5, 1, 7, 0.0F);
        this.setRotation(main24_2, -1.1383037381507017F, 0.0F, 0.0F);
        this.main5 = new ModelRenderer(this, 175, 0);
        this.main5.setRotationPoint(-2.5F, 4.5F, -3.7F);
        this.main5.addBox(-0.01F, 0.0F, 0.0F, 5, 10, 2, 0.0F);
        this.setRotation(main5, -0.6373942428283291F, 0.0F, 0.0F);
        this.main6 = new ModelRenderer(this, 261, 87);
        this.main6.setRotationPoint(-3.5F, 2.0F, -9.0F);
        this.main6.addBox(0.0F, 0.0F, 0.0F, 7, 5, 24, 0.0F);
        this.main7 = new ModelRenderer(this, 175, 0);
        this.main7.setRotationPoint(-2.5F, 1.2F, -3.7F);
        this.main7.addBox(-0.02F, 0.0F, 0.0F, 5, 10, 2, 0.0F);
        this.setRotation(main7, -0.6373942428283291F, 0.0F, 0.0F);
        this.main37 = new ModelRenderer(this, 97, 2);
        this.main37.setRotationPoint(-1.5F, -2.6F, 42.4F);
        this.main37.addBox(-0.01F, 0.0F, 0.0F, 3, 3, 11, 0.0F);
        this.setRotation(main37, -0.4553564018453205F, 0.0F, 0.0F);
        this.main27 = new ModelRenderer(this, 97, 2);
        this.main27.setRotationPoint(-1.5F, 0.0F, 23.0F);
        this.main27.addBox(0.0F, -0.4F, -4.0F, 3, 3, 11, 0.0F);
        this.setRotation(main27, 0.31869712141416456F, 0.0F, 0.0F);
        this.main28 = new ModelRenderer(this, 95, 0);
        this.main28.setRotationPoint(-1.5F, -1.5F, 28.0F);
        this.main28.addBox(0.0F, -1.09F, 1.5F, 3, 3, 13, 0.0F);
        this.main21 = new ModelRenderer(this, 120, 65);
        this.main21.setRotationPoint(-4.5F, 8.5F, 8.0F);
        this.main21.addBox(0.0F, -0.2F, 0.0F, 9, 4, 20, 0.0F);
        this.main23 = new ModelRenderer(this, 167, 35);
        this.main23.setRotationPoint(3.65F, 11.75F, 8.0F);
        this.main23.addBox(0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F);
        this.setRotation(main23, 0.0F, 0.0F, 0.5462880558742251F);
        this.main48 = new ModelRenderer(this, 147, 29);
        this.main48.setRotationPoint(2.5F, 5.0F, -11.0F);
        this.main48.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.main44 = new ModelRenderer(this, 21, 13);
        this.main44.setRotationPoint(-2.5F, 8.1F, 43.1F);
        this.main44.addBox(-0.01F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
        this.setRotation(main44, -0.8196066167365371F, 0.0F, 0.0F);
        this.main15 = new ModelRenderer(this, 3, 13);
        this.main15.setRotationPoint(-3.5F, 4.2F, 15.0F);
        this.main15.addBox(-0.01F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.setRotation(main15, -0.8196066167365371F, 0.0F, 0.0F);
        this.main2 = new ModelRenderer(this, 175, 0);
        this.main2.setRotationPoint(-2.5F, 10.8F, -3.7F);
        this.main2.addBox(-0.01F, 0.0F, 0.0F, 5, 10, 2, 0.0F);
        this.setRotation(main2, -0.6373942428283291F, 0.0F, 0.0F);
        this.main26 = new ModelRenderer(this, 138, 34);
        this.main26.setRotationPoint(-2.5F, 12.2F, 40.0F);
        this.main26.addBox(-0.01F, 0.0F, -0.1F, 5, 1, 7, 0.0F);
        this.setRotation(main26, -1.730144887501979F, 0.0F, 0.0F);
        this.main12 = new ModelRenderer(this, 11, 148);
        this.main12.setRotationPoint(-4.0F, 11.12F, 8.0F);
        this.main12.addBox(0.0F, 0.0F, 0.0F, 8, 2, 36, 0.0F);
        this.main35 = new ModelRenderer(this, 39, 1);
        this.main35.setRotationPoint(-1.5F, 17.7F, 46.0F);
        this.main35.addBox(-0.01F, -0.15F, 0.0F, 3, 2, 9, 0.0F);
        this.setRotation(main35, 1.0016444577195458F, 0.0F, 0.0F);
        this.main41 = new ModelRenderer(this, 19, 13);
        this.main41.setRotationPoint(-3.5F, 11.3F, 39.3F);
        this.main41.addBox(0.01F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
        this.setRotation(main41, 0.8196066167365371F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.main42.render(f5);
        this.main45.render(f5);
        this.main40.render(f5);
        this.main51.render(f5);
        this.main17.render(f5);
        this.main13.render(f5);
        this.main16.render(f5);
        this.main33.render(f5);
        this.main3.render(f5);
        this.main25.render(f5);
        this.main34.render(f5);
        this.main24.render(f5);
        this.main4.render(f5);
        this.main36.render(f5);
        this.main46.render(f5);
        this.main24_1.render(f5);
        this.main19.render(f5);
        this.main49.render(f5);
        this.main1.render(f5);
        this.main18.render(f5);
        this.main53.render(f5);
        this.main54.render(f5);
        this.main8.render(f5);
        this.main11.render(f5);
        this.main52.render(f5);
        this.main50.render(f5);
        this.main20.render(f5);
        this.main22.render(f5);
        this.main43.render(f5);
        this.main14.render(f5);
        this.main39.render(f5);
        this.main24_2.render(f5);
        this.main5.render(f5);
        this.main6.render(f5);
        this.main7.render(f5);
        this.main37.render(f5);
        this.main27.render(f5);
        this.main28.render(f5);
        this.main21.render(f5);
        this.main23.render(f5);
        this.main48.render(f5);
        this.main44.render(f5);
        this.main15.render(f5);
        this.main2.render(f5);
        this.main26.render(f5);
        this.main12.render(f5);
        this.main35.render(f5);
        this.main41.render(f5);
    }
}
