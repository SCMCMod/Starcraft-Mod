package ga.scmc.client.renderer.model;

import hypeirochus.api.client.render.model.Model;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * mutalisk_glaiveworm - cybercat5555
 * Created using Tabula 6.0.0
 */
public class ModelMutaliskGlaiveWurm extends Model {
    public ModelRenderer base01;
    public ModelRenderer base02;
    public ModelRenderer spike01a;
    public ModelRenderer spike02a;
    public ModelRenderer spike03a;
    public ModelRenderer spike04;
    public ModelRenderer spike05;
    public ModelRenderer spike06;
    public ModelRenderer spike01b;
    public ModelRenderer spike01c;
    public ModelRenderer spike01d;
    public ModelRenderer spike02b;
    public ModelRenderer spike02c;
    public ModelRenderer spike02d;
    public ModelRenderer spike03b;
    public ModelRenderer spike03c;
    public ModelRenderer spike03d;

    public ModelMutaliskGlaiveWurm() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.spike05 = new ModelRenderer(this, 26, 7);
        this.spike05.mirror = true;
        this.spike05.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.spike05.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotation(spike05, -3.096039560112741F, 0.4553564018453205F, 0.045553093477052F);
        this.spike06 = new ModelRenderer(this, 26, 7);
        this.spike06.setRotationPoint(0.0F, -0.5F, -2.1F);
        this.spike06.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotation(spike06, 1.2292353921796064F, 0.4553564018453205F, 0.7740535232594852F);
        this.spike02a = new ModelRenderer(this, 19, 0);
        this.spike02a.setRotationPoint(0.0F, 1.3F, 1.3F);
        this.spike02a.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotation(spike02a, -2.1855012893472994F, 0.0F, 0.0F);
        this.spike02b = new ModelRenderer(this, 19, 0);
        this.spike02b.setRotationPoint(0.0F, -1.8F, -0.3F);
        this.spike02b.addBox(-0.5F, -3.0F, -0.6F, 1, 3, 1, 0.0F);
        this.setRotation(spike02b, -0.31869712141416456F, 0.0F, 0.0F);
        this.spike03c = new ModelRenderer(this, 19, 0);
        this.spike03c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike03c.addBox(-0.5F, -2.9F, 0.1F, 1, 3, 1, 0.0F);
        this.setRotation(spike03c, 0.136659280431156F, 0.0F, 0.0F);
        this.spike02c = new ModelRenderer(this, 19, 0);
        this.spike02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike02c.addBox(-0.5F, -2.9F, 0.1F, 1, 3, 1, 0.0F);
        this.setRotation(spike02c, 0.136659280431156F, 0.0F, 0.0F);
        this.base01 = new ModelRenderer(this, 0, 0);
        this.base01.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base01.addBox(-1.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F);
        this.spike01b = new ModelRenderer(this, 19, 0);
        this.spike01b.setRotationPoint(0.0F, -1.8F, -0.3F);
        this.spike01b.addBox(-0.5F, -3.0F, -0.6F, 1, 3, 1, 0.0F);
        this.setRotation(spike01b, -0.31869712141416456F, 0.0F, 0.0F);
        this.spike03a = new ModelRenderer(this, 19, 0);
        this.spike03a.setRotationPoint(0.0F, 1.3F, -1.0F);
        this.spike03a.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotation(spike03a, 2.1855012893472994F, 0.0F, 0.0F);
        this.spike01a = new ModelRenderer(this, 19, 0);
        this.spike01a.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.spike01a.addBox(-0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotation(spike01a, -0.136659280431156F, 0.0F, 0.0F);
        this.spike01c = new ModelRenderer(this, 19, 0);
        this.spike01c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike01c.addBox(-0.5F, -2.9F, 0.1F, 1, 3, 1, 0.0F);
        this.setRotation(spike01c, 0.136659280431156F, 0.0F, 0.0F);
        this.base02 = new ModelRenderer(this, 0, 10);
        this.base02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base02.addBox(-0.5F, -2.0F, -2.0F, 1, 4, 4, 0.0F);
        this.setRotation(base02, 0.7740535232594852F, 0.0F, 0.0F);
        this.spike04 = new ModelRenderer(this, 26, 7);
        this.spike04.setRotationPoint(0.0F, -0.5F, 2.1F);
        this.spike04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotation(spike04, -1.2292353921796064F, 0.4553564018453205F, -0.7740535232594852F);
        this.spike01d = new ModelRenderer(this, 19, 7);
        this.spike01d.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.spike01d.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotation(spike01d, -0.22759093446006054F, 0.7740535232594852F, -0.136659280431156F);
        this.spike03d = new ModelRenderer(this, 19, 7);
        this.spike03d.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.spike03d.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotation(spike03d, -0.22759093446006054F, 0.7740535232594852F, -0.136659280431156F);
        this.spike03b = new ModelRenderer(this, 19, 0);
        this.spike03b.setRotationPoint(0.0F, -1.8F, -0.3F);
        this.spike03b.addBox(-0.5F, -3.0F, -0.6F, 1, 3, 1, 0.0F);
        this.setRotation(spike03b, -0.31869712141416456F, 0.0F, 0.0F);
        this.spike02d = new ModelRenderer(this, 19, 7);
        this.spike02d.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.spike02d.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotation(spike02d, -0.22759093446006054F, 0.7740535232594852F, -0.136659280431156F);
        this.base01.addChild(this.spike05);
        this.base01.addChild(this.spike06);
        this.base01.addChild(this.spike02a);
        this.spike02a.addChild(this.spike02b);
        this.spike03b.addChild(this.spike03c);
        this.spike02b.addChild(this.spike02c);
        this.spike01a.addChild(this.spike01b);
        this.base01.addChild(this.spike03a);
        this.base01.addChild(this.spike01a);
        this.spike01b.addChild(this.spike01c);
        this.base01.addChild(this.base02);
        this.base01.addChild(this.spike04);
        this.spike01b.addChild(this.spike01d);
        this.spike03b.addChild(this.spike03d);
        this.spike03a.addChild(this.spike03b);
        this.spike02b.addChild(this.spike02d);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.base01.render(f5);
    }
}
