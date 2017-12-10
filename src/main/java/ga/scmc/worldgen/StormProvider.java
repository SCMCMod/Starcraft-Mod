package ga.scmc.worldgen;

import org.lwjgl.opengl.GL11;

import com.arisux.mdx.lib.client.render.Draw;
import com.arisux.mdx.lib.client.render.OpenGL;
import com.arisux.mdx.lib.game.Game;
import com.arisux.mdx.lib.world.Pos;
import com.arisux.mdx.lib.world.Worlds;
import com.google.common.base.Predicate;

import ga.scmc.handlers.BiomeHandler;
import ga.scmc.worldgen.dimchar.WorldProviderChar;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StormProvider implements Predicate<Entity>
{
    private float[] stormX = null;
    private float[] stormZ = null;

    public void update(World world)
    {
        if (world != null && this.isStormActive(world))
        {
            for (Object o : world.loadedEntityList.toArray())
            {
                if (o instanceof Entity)
                {
                    Entity entity = (Entity) o;

                    if (entity.world.provider instanceof WorldProviderChar)
                    {
                        if (this.apply(entity) && Worlds.canSeeSky(new Pos(entity), world))
                        {
                            entity.motionZ += 0.03F;
                            entity.motionY += MathHelper.sin(world.getWorldTime() * 0.4F) * 0.1F;
                            entity.fallDistance = 0F;
                            entity.attackEntityFrom(DamageSource.lava, 0.5F);
                        }
                    }
                }
            }

            if (world.isRemote)
            {
                this.updateClient(world);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void updateClient(World world)
    {
        int i = 32;

        if (stormX == null || stormZ == null)
        {
            stormX = new float[i * i];
            stormZ = new float[i * i];

            for (int zCoord = 0; zCoord < i; ++zCoord)
            {
                for (int xCoord = 0; xCoord < i; ++xCoord)
                {
                    float x = xCoord - 16;
                    float z = zCoord - 16;
                    float sq = MathHelper.sqrt(x * x + z * z);
                    stormX[zCoord << 5 | xCoord] = -z / sq;
                    stormZ[zCoord << 5 | xCoord] = x / sq;
                }
            }
        }
    }

    public boolean isStormActive(World world)
    {
        return world.getWorldTime() >= getStormStartTime() && world.getWorldTime() <= getStormEndTime();
    }

    public int getStormStartTime()
    {
        return 3000;
    }

    public int getStormEndTime()
    {
        return 4000;
    }

    @SideOnly(Side.CLIENT)
    public void render(float partialTicks)
    {
        if (stormX == null || stormZ == null)
        {
            return;
        }

        Entity renderViewEntity = Game.minecraft().getRenderViewEntity();
        WorldClient worldclient = Game.minecraft().world;
        int posX = MathHelper.floor(renderViewEntity.posX);
        int posY = MathHelper.floor(renderViewEntity.posY);
        int posZ = MathHelper.floor(renderViewEntity.posZ);
        double renderPartialX = renderViewEntity.lastTickPosX + (renderViewEntity.posX - renderViewEntity.lastTickPosX) * partialTicks;
        double renderPartialY = renderViewEntity.lastTickPosY + (renderViewEntity.posY - renderViewEntity.lastTickPosY) * partialTicks;
        double renderPartialZ = renderViewEntity.lastTickPosZ + (renderViewEntity.posZ - renderViewEntity.lastTickPosZ) * partialTicks;
        int renderYFloor = MathHelper.floor(renderPartialY);

        Game.minecraft().entityRenderer.enableLightmap();
        GlStateManager.disableCull();
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        OpenGL.enable(GL11.GL_BLEND);
        OpenGlHelper.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
        OpenGL.color(1.0F, 1.0F, 1.0F, 1.0F);
        Draw.bindTexture(new ResourceLocation("textures/world/hellfire.png"));

        for (int vZ = posZ - 16; vZ < posZ + 16; ++vZ)
        {
            for (int vX = posX - 16; vX < posX + 16; ++vX)
            {
                int idx = (vZ - posZ + 16) * 32 + vX - posX + 16;

                BlockPos pos = new BlockPos(vX, 0, vZ);
                float rX = stormX[idx] * 0.5F;
                float rZ = stormZ[idx] * 0.5F;

                Biome b = worldclient.getBiome(pos);

                if (b == BiomeHandler.biomeCharCreepInfestation)
                {
                    int stormHeight = worldclient.getPrecipitationHeight(pos).getY();
                    int minY = posY - (Game.minecraft().gameSettings.fancyGraphics ? 64 : 16);
                    int maxY = posY + (Game.minecraft().gameSettings.fancyGraphics ? 64 : 16);

                    if (minY < stormHeight)
                        minY = stormHeight;

                    if (maxY < stormHeight)
                        maxY = stormHeight;

                    int vY = stormHeight;

                    if (stormHeight < renderYFloor)
                        vY = renderYFloor;

                    if (maxY >= worldclient.provider.getCloudHeight())
                        maxY = (int) worldclient.provider.getCloudHeight();

                    if (minY != maxY)
                    {
                        pos = new BlockPos(vX, vY, vZ);
                        float size = 0.5F;
                        float o = (((Game.minecraft().world.getWorldTime() + (vX * vX) + vX + (vZ * vZ) + vZ) & 31) + partialTicks) / 2;

                        Draw.startQuads();
                        // Tessellator.instance.setBrightness(worldclient.getLightBrightness(pos));
                        Draw.buffer().color(0.3F, 0.3F, 0.3F, 1F);
                        Draw.buffer().setTranslation(-renderPartialX * 1.0D, -renderPartialY * 1.0D, -renderPartialZ * 1.0D);
                        Draw.vertex(vX - rX, minY, (vZ - rZ + o), 0.0F * size, minY * size / 4.0F + o * size).endVertex();
                        Draw.vertex(vX + rX, minY, (vZ + rZ + o), 1.0F * size, minY * size / 4.0F + o * size).endVertex();
                        Draw.vertex(vX + rX, maxY, (vZ + rZ + o), 1.0F * size, maxY * size / 4.0F + o * size).endVertex();
                        Draw.vertex(vX - rX, maxY, (vZ - rZ + o), 0.0F * size, maxY * size / 4.0F + o * size).endVertex();
                        Draw.buffer().setTranslation(0.0D, 0.0D, 0.0D);
                        Draw.tessellate();
                    }
                }
            }
        }

        OpenGL.enable(GL11.GL_CULL_FACE);
        OpenGL.disable(GL11.GL_BLEND);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.1F);
        Game.minecraft().entityRenderer.disableLightmap();
    }

    @Override
    public boolean apply(Entity entity)
    {
        if (entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) entity;

            if (player.capabilities.isCreativeMode)
            {
                return false;
            }
        }

        return true;
    }
}