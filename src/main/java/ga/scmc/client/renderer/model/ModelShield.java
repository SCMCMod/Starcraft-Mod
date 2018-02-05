package ga.scmc.client.renderer.model;

import org.lwjgl.opengl.GL11;

import com.arisux.mdx.lib.client.render.Color;
import com.arisux.mdx.lib.client.render.Draw;
import com.arisux.mdx.lib.client.render.OpenGL;
import com.arisux.mdx.lib.client.render.Vertex;

import hypeirochus.api.client.render.model.Model;

public class ModelShield extends Model {
	private Color color;
	private float scale;
	public boolean drawInternalVertices = true;

	private Vertex t1 = new Vertex(1.0F, 0.0F, 0.0F).normalize();
	private Vertex t2 = new Vertex(0.0F, 1.0F, 0.0F).normalize();
	private Vertex t3 = new Vertex(0.0F, 0.0F, 1.0F).normalize();
	private Vertex t4 = new Vertex(0.5F, 0.5F, 0.0F).normalize();
	private Vertex t5 = new Vertex(0.0F, 0.5F, 0.5F).normalize();
	private Vertex t6 = new Vertex(0.5F, 0.0F, 0.5F).normalize();
	private Vertex t7 = new Vertex(0.75F, 0.25F, 0.0F).normalize();
	private Vertex t8 = new Vertex(0.5F, 0.25F, 0.25F).normalize();
	private Vertex t9 = new Vertex(0.75F, 0.0F, 0.25F).normalize();
	private Vertex t10 = new Vertex(0.0F, 0.75F, 0.25F).normalize();
	private Vertex t11 = new Vertex(0.25F, 0.5F, 0.25F).normalize();
	private Vertex t12 = new Vertex(0.25F, 0.75F, 0.0F).normalize();
	private Vertex t13 = new Vertex(0.25F, 0.0F, 0.75F).normalize();
	private Vertex t14 = new Vertex(0.25F, 0.25F, 0.5F).normalize();
	private Vertex t15 = new Vertex(0.0F, 0.25F, 0.75F).normalize();

	private void triangle(Vertex vertex1, Vertex vertex2, Vertex vertex3) {
		Draw.triangle(vertex1, vertex2, vertex3, this.drawInternalVertices);
	}

	@Override
	public void render(Object obj) {
		OpenGL.pushMatrix();
		{
			OpenGL.scale(scale, scale, scale);
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			OpenGL.disableLightMapping();
			OpenGL.disableLight();
			OpenGL.enableBlend();
			OpenGL.blendFunc(GL11.GL_ONE_MINUS_SRC_ALPHA, GL11.GL_ONE);

			for (int rZ = 0; rZ < 2; ++rZ) {
				OpenGL.rotate(rZ * 180, 0.0F, 0.0F, 1.0F);

				for (int rY = 0; rY < 4; ++rY) {
					OpenGL.pushMatrix();
					{
						OpenGL.rotate(rY * 90, 0.0F, 1.0F, 0.0F);
						OpenGL.color(this.color.r, this.color.g, this.color.b, this.color.a);
						this.triangle(t2, t10, t12);
						this.triangle(t10, t5, t11);
						this.triangle(t12, t11, t4);
						this.triangle(t10, t11, t12);
						this.triangle(t1, t7, t9);
						this.triangle(t7, t4, t8);
						this.triangle(t9, t8, t6);
						this.triangle(t7, t8, t9);
						this.triangle(t3, t13, t15);
						this.triangle(t13, t6, t14);
						this.triangle(t15, t14, t5);
						this.triangle(t13, t14, t15);
						this.triangle(t5, t14, t11);
						this.triangle(t4, t11, t8);
						this.triangle(t6, t8, t14);
						this.triangle(t8, t11, t14);
					}
					OpenGL.popMatrix();
				}
			}
			OpenGL.enableLight();
			OpenGL.enableLightMapping();
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			OpenGL.disableBlend();
		}
		OpenGL.popMatrix();
	}

	public ModelShield setColor(Color color) {
		this.color = color;
		return this;
	}

	public Color getColor() {
		return color;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}
}