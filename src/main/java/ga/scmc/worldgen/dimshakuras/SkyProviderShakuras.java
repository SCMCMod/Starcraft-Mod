package ga.scmc.worldgen.dimshakuras;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import com.arisux.mdx.lib.client.render.Color;
import com.arisux.mdx.lib.client.render.Draw;
import com.arisux.mdx.lib.client.render.OpenGL;
import com.arisux.mdx.lib.game.Game;

import ga.scmc.worldgen.DimensionUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.IRenderHandler;
import ocelot.api.utils.TextureUtils;

public class SkyProviderShakuras extends IRenderHandler
{
    private Color   skyColor       = new Color(1F, 0.225F, 0.265F, 1F);
    protected Color cloudColor     = new Color(0.075F, 0.1F, 0.15F, 0.75F);
    public int      starGLCallList = GLAllocation.generateDisplayLists(3);

    public SkyProviderShakuras()
    {
        this.generateStars();
    }

    private void generateStars()
    {
        Tessellator tessellator = Tessellator.getInstance();
        VertexBuffer vertexbuffer = tessellator.getBuffer();

        if (this.starGLCallList >= 0)
        {
            GLAllocation.deleteDisplayLists(this.starGLCallList);
            this.starGLCallList = -1;
        }

        this.starGLCallList = GLAllocation.generateDisplayLists(1);
        GlStateManager.pushMatrix();
        GlStateManager.glNewList(this.starGLCallList, 4864);
        this.renderStars(vertexbuffer);
        GlStateManager.glEndList();
        GlStateManager.popMatrix();

        this.starGLCallList += 1;
    }

    private void renderStars(VertexBuffer buffer)
    {
        Random random = new Random(10842L);
        buffer.begin(7, DefaultVertexFormats.POSITION);

        for (int i = 0; i < 1500; ++i)
        {
            double d0 = (double) (random.nextFloat() * 2.0F - 1.0F);
            double d1 = (double) (random.nextFloat() * 2.0F - 1.0F);
            double d2 = (double) (random.nextFloat() * 2.0F - 1.0F);
            double d3 = (double) (0.15F + random.nextFloat() * 0.1F);
            double d4 = d0 * d0 + d1 * d1 + d2 * d2;

            if (d4 < 1.0D && d4 > 0.01D)
            {
                d4 = 1.0D / Math.sqrt(d4);
                d0 = d0 * d4;
                d1 = d1 * d4;
                d2 = d2 * d4;
                double d5 = d0 * 100.0D;
                double d6 = d1 * 100.0D;
                double d7 = d2 * 100.0D;
                double d8 = Math.atan2(d0, d2);
                double d9 = Math.sin(d8);
                double d10 = Math.cos(d8);
                double d11 = Math.atan2(Math.sqrt(d0 * d0 + d2 * d2), d1);
                double d12 = Math.sin(d11);
                double d13 = Math.cos(d11);
                double d14 = random.nextDouble() * Math.PI * 2.0D;
                double d15 = Math.sin(d14);
                double d16 = Math.cos(d14);

                for (int j = 0; j < 4; ++j)
                {
                    double d18 = (double) ((j & 2) - 1) * d3;
                    double d19 = (double) ((j + 1 & 2) - 1) * d3;
                    double d21 = d18 * d16 - d19 * d15;
                    double d22 = d19 * d16 + d18 * d15;
                    double d23 = d21 * d12 + 0.0D * d13;
                    double d24 = 0.0D * d12 - d21 * d13;
                    double d25 = d24 * d9 - d22 * d10;
                    double d26 = d22 * d9 + d24 * d10;
                    buffer.pos(d5 + d25, d6 + d23, d7 + d26).endVertex();
                }
            }
        }
        Tessellator.getInstance().draw();
    }

    @Override
    public void render(float partialTicks, WorldClient world, Minecraft mc)
    {
        if (world.provider instanceof WorldProviderShakuras)
        {
        	WorldProviderShakuras provider = (WorldProviderShakuras) world.provider;

        	GlStateManager.disableTexture2D();
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            GlStateManager.depthMask(false);
            GlStateManager.enableFog();
            GL11.glColor3f(skyColor.r, skyColor.g, skyColor.b);

            /** Render Sky **/
            GlStateManager.disableFog();
            GlStateManager.disableAlpha();
            GlStateManager.enableBlend();
            OpenGL.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            OpenGL.color(1.0F, 1.0F, 1.0F, provider.getStarBrightness(partialTicks) * 2);

            /** Render Stars **/
            this.renderStars(Tessellator.getInstance().getBuffer());

            GlStateManager.enableTexture2D();
            OpenGL.blendFunc(GL11.GL_SRC_ALPHA, 1);

            OpenGL.pushMatrix();
            {
                float scale = 20.0F;
                OpenGL.translate(30F, 0F, 0F);
                OpenGL.rotate(DimensionUtil.calculateCelestialAngle(world.getWorldTime(), partialTicks) * 360.0F, 0.0F, 1.0F, 0.0F);
                OpenGL.color(1.0F, 1.0F, 1.0F, 1.0F);
                OpenGL.rotate(DimensionUtil.calculateCelestialAngle(world.getWorldTime(), partialTicks) * 360.0F, 10.0F, -6.0F, -20.0F);
                OpenGL.rotate(135F, 0.0F, 1.0F, 0.0F);
        		TextureUtils.bindTexture("textures/world/rajal.png");
                Draw.startQuads();
                Draw.vertex(-scale, 150.0D, -scale, 0.0D, 0.0D).endVertex();
                Draw.vertex(scale, 150.0D, -scale, 1.0D, 0.0D).endVertex();
                Draw.vertex(scale, 150.0D, scale, 1.0D, 1.0D).endVertex();
                Draw.vertex(-scale, 150.0D, scale, 0.0D, 1.0D).endVertex();
                Draw.tessellate();
            }
            OpenGL.popMatrix();
            
            OpenGL.blendClear();
            GlStateManager.disableBlend();
            GlStateManager.enableAlpha();
            GlStateManager.enableTexture2D();
            GlStateManager.depthMask(true);

            if (Game.minecraft().gameSettings.shouldRenderClouds() == 1)
            {
                OpenGL.pushMatrix();
                {
                    if (Game.minecraft().gameSettings.fancyGraphics)
                    {
                    	GlStateManager.enableFog();
                    }

                    this.renderClouds(partialTicks);
                    GlStateManager.disableFog();
                }
                OpenGL.popMatrix();
            }
        }
    }

    public void renderClouds(float renderPartialTicks)
    {
        for (int cloudPass = 1; cloudPass > 0; cloudPass--)
        {
            float relativeHeight = (float) (Game.minecraft().getRenderViewEntity().lastTickPosY + (Game.minecraft().getRenderViewEntity().posY - Game.minecraft().getRenderViewEntity().lastTickPosY) * renderPartialTicks);
            float cloudSpan = 18.0F;
            float cloudHeight = 7.0F * cloudPass;
            float cloudSpeed = 10;
            double time = Game.minecraft().world.getWorldTime() * cloudSpeed + renderPartialTicks;
            double viewX = (Game.minecraft().getRenderViewEntity().prevPosX + (Game.minecraft().getRenderViewEntity().posX - Game.minecraft().getRenderViewEntity().prevPosX) * renderPartialTicks + time * 0.029999999329447746D) / cloudSpan;
            double viewZ = (Game.minecraft().getRenderViewEntity().prevPosZ + (Game.minecraft().getRenderViewEntity().posZ - Game.minecraft().getRenderViewEntity().prevPosZ) * renderPartialTicks) / cloudSpan + 0.33000001311302185D;
            float cloudY = Game.minecraft().world.provider.getCloudHeight() - relativeHeight;
            viewX -= (MathHelper.floor(viewX / 2048.0D)) * 2048;
            viewZ -= (MathHelper.floor(viewZ / 2048.0D)) * 2048;
            float scaleUV = 0.00390625F;
            float offsetU = MathHelper.floor(viewX) * scaleUV;
            float offsetV = MathHelper.floor(viewZ) * scaleUV;
            byte dist = (byte) (Game.minecraft().gameSettings.renderDistanceChunks);
            byte cloudSections = 2;

            OpenGL.disableCullFace();
    		TextureUtils.bindTexture("textures/world/varda-clouds.png");
            OpenGL.enableBlend();
            OpenGlHelper.glBlendFunc(GL11.GL_ONE_MINUS_DST_COLOR, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
            OpenGL.scale(cloudSpan, 1.0F, cloudSpan);

            for (int pass = 0; pass < 2; pass++)
            {
                if (pass == 0)
                {
                    GL11.glColorMask(false, false, false, false);
                }
                else
                {
                    GL11.glColorMask(true, true, true, true);
                }

                for (int x = -cloudSections + 1; x <= cloudSections; ++x)
                {
                    for (int z = -cloudSections + 1; z <= cloudSections; ++z)
                    {
                        float cloudU = x * dist;
                        float cloudV = z * dist;
                        float cloudX = cloudU - ((float) (viewX - MathHelper.floor(viewX)));
                        float cloudZ = cloudV - ((float) (viewZ - MathHelper.floor(viewZ)));

                        Draw.startQuads();

                        if (cloudY > -cloudHeight - 1.0F)
                        {
                            Draw.buffer().color(cloudColor.r * 0.7F, cloudColor.g * 0.7F, cloudColor.b * 0.7F, cloudColor.a + 0.1F);
                            Draw.buffer().normal(0.0F, -1.0F, 0.0F);
                            Draw.vertex(cloudX + 0.0F, cloudY + 0.0F, cloudZ + dist, (cloudU + 0.0F) * scaleUV + offsetU, (cloudV + dist) * scaleUV + offsetV).endVertex();
                            Draw.vertex(cloudX + dist, cloudY + 0.0F, cloudZ + dist, (cloudU + dist) * scaleUV + offsetU, (cloudV + dist) * scaleUV + offsetV).endVertex();
                            Draw.vertex(cloudX + dist, cloudY + 0.0F, cloudZ + 0.0F, (cloudU + dist) * scaleUV + offsetU, (cloudV + 0.0F) * scaleUV + offsetV).endVertex();
                            Draw.vertex(cloudX + 0.0F, cloudY + 0.0F, cloudZ + 0.0F, (cloudU + 0.0F) * scaleUV + offsetU, (cloudV + 0.0F) * scaleUV + offsetV).endVertex();
                        }

                        if (cloudY <= cloudHeight + 1.0F)
                        {
                            Draw.buffer().color(cloudColor.r, cloudColor.g, cloudColor.b, cloudColor.a + 0.15F);
                            Draw.buffer().normal(0.0F, 1.0F, 0.0F);
                            Draw.vertex(cloudX + 0.0F, cloudY + cloudHeight, cloudZ + dist, (cloudU + 0.0F) * scaleUV + offsetU, (cloudV + dist) * scaleUV + offsetV).endVertex();
                            Draw.vertex(cloudX + dist, cloudY + cloudHeight, cloudZ + dist, (cloudU + dist) * scaleUV + offsetU, (cloudV + dist) * scaleUV + offsetV).endVertex();
                            Draw.vertex(cloudX + dist, cloudY + cloudHeight, cloudZ + 0.0F, (cloudU + dist) * scaleUV + offsetU, (cloudV + 0.0F) * scaleUV + offsetV).endVertex();
                            Draw.vertex(cloudX + 0.0F, cloudY + cloudHeight, cloudZ + 0.0F, (cloudU + 0.0F) * scaleUV + offsetU, (cloudV + 0.0F) * scaleUV + offsetV).endVertex();
                        }

                        Draw.buffer().color(cloudColor.r * 0.9F, cloudColor.g * 0.9F, cloudColor.b * 0.9F, cloudColor.a);

                        if (x > -1)
                        {
                            Draw.buffer().normal(-1.0F, 0.0F, 0.0F);

                            for (int size = 0; size < dist; ++size)
                            {
                                Draw.vertex(cloudX + size + 0.0F, cloudY + 0.0F, cloudZ + dist, (cloudU + size + 0.5F) * scaleUV + offsetU, (cloudV + dist) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + size + 0.0F, cloudY + cloudHeight, cloudZ + dist, (cloudU + size + 0.5F) * scaleUV + offsetU, (cloudV + dist) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + size + 0.0F, cloudY + cloudHeight, cloudZ + 0.0F, (cloudU + size + 0.5F) * scaleUV + offsetU, (cloudV + 0.0F) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + size + 0.0F, cloudY + 0.0F, cloudZ + 0.0F, (cloudU + size + 0.5F) * scaleUV + offsetU, (cloudV + 0.0F) * scaleUV + offsetV).endVertex();
                            }
                        }

                        if (x <= 1)
                        {
                            Draw.buffer().normal(1.0F, 0.0F, 0.0F);

                            for (int size = 0; size < dist; ++size)
                            {
                                Draw.vertex(cloudX + size + 1.0F, cloudY + 0.0F, cloudZ + dist, (cloudU + size + 0.5F) * scaleUV + offsetU, (cloudV + dist) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + size + 1.0F, cloudY + cloudHeight, cloudZ + dist, (cloudU + size + 0.5F) * scaleUV + offsetU, (cloudV + dist) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + size + 1.0F, cloudY + cloudHeight, cloudZ + 0.0F, (cloudU + size + 0.5F) * scaleUV + offsetU, (cloudV + 0.0F) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + size + 1.0F, cloudY + 0.0F, cloudZ + 0.0F, (cloudU + size + 0.5F) * scaleUV + offsetU, (cloudV + 0.0F) * scaleUV + offsetV).endVertex();
                            }
                        }

                        Draw.buffer().color(cloudColor.r * 0.8F, cloudColor.g * 0.8F, cloudColor.b * 0.8F, 0.8F);

                        if (z > -1)
                        {
                            Draw.buffer().normal(0.0F, 0.0F, -1.0F);

                            for (int size = 0; size < dist; ++size)
                            {
                                Draw.vertex(cloudX + 0.0F, cloudY + cloudHeight, cloudZ + size + 0.0F, (cloudU + 0.0F) * scaleUV + offsetU, (cloudV + size + 0.5F) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + dist, cloudY + cloudHeight, cloudZ + size + 0.0F, (cloudU + dist) * scaleUV + offsetU, (cloudV + size + 0.5F) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + dist, cloudY + 0.0F, cloudZ + size + 0.0F, (cloudU + dist) * scaleUV + offsetU, (cloudV + size + 0.5F) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + 0.0F, cloudY + 0.0F, cloudZ + size + 0.0F, (cloudU + 0.0F) * scaleUV + offsetU, (cloudV + size + 0.5F) * scaleUV + offsetV).endVertex();
                            }
                        }

                        if (z <= 1)
                        {
                            Draw.buffer().normal(0.0F, 0.0F, 1.0F);

                            for (int size = 0; size < dist; ++size)
                            {
                                Draw.vertex(cloudX + 0.0F, cloudY + cloudHeight, cloudZ + size + 1.0F, (cloudU + 0.0F) * scaleUV + offsetU, (cloudV + size + 0.5F) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + dist, cloudY + cloudHeight, cloudZ + size + 1.0F, (cloudU + dist) * scaleUV + offsetU, (cloudV + size + 0.5F) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + dist, cloudY + 0.0F, cloudZ + size + 1.0F, (cloudU + dist) * scaleUV + offsetU, (cloudV + size + 0.5F) * scaleUV + offsetV).endVertex();
                                Draw.vertex(cloudX + 0.0F, cloudY + 0.0F, cloudZ + size + 1.0F, (cloudU + 0.0F) * scaleUV + offsetU, (cloudV + size + 0.5F) * scaleUV + offsetV).endVertex();
                            }
                        }

                        Draw.tessellate();
                    }
                }
            }

            OpenGL.color(1.0F, 1.0F, 1.0F, 1.0F);
            GlStateManager.disableBlend();
            GlStateManager.enableCull();
        }
    }
}