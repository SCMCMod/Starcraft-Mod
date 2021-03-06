package io.github.scmcmod.worldgen.dimaiur;

import io.github.scmcmod.SCConstants;
import io.github.scmcmod.Starcraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.rom.client.render.Texture;
import net.rom.client.render.world.StormProvider;
import net.rom.utils.Worlds;

@EventBusSubscriber
public class StormProviderAiur extends StormProvider
{
	public static final Texture STORM_TEXTURE = new Texture(SCConstants.MODID, "textures/world/blizzard.png");
	public static final PotionEffect POTION_EFFECT = new PotionEffect(MobEffects.SLOWNESS);

	@Override
	public void updateStorm(World world)
	{
		if (world != null && this.isStormActive(world))
		{
			for (Object o : world.loadedEntityList.toArray())
			{
				if (o instanceof Entity)
				{
					Entity entity = (Entity) o;

					if (entity.world.provider instanceof WorldProviderAiur)
					{
						if (this.apply(entity) && Worlds.canSeeSky(new BlockPos(entity), world))
						{
							entity.fallDistance = 0F;

							if (entity instanceof EntityLivingBase)
							{
								((EntityLivingBase) entity).addPotionEffect(POTION_EFFECT);
							}
						}
					}
				}
			}
		}
	}

	@Override
	public boolean isStormActive(World world)
	{
		return world.getWorldTime() >= 3000 && world.getWorldTime() <= 4000;
	}

	@Override
	public boolean isStormVisibleInBiome(Biome biome)
	{
		return true;
	}

	@Override
	public float getStormDownfallSpeed()
	{
		return 14.0F;
	}

	@Override
	public float getStormWindSpeed()
	{
		return 24.0F;
	}

	@Override
	public boolean doesLightingApply()
	{
		return false;
	}

	@Override
	public float getStormDirection()
	{
		return 90F;
	}

	@Override
	public Texture getStormTexture(World world, Biome biome)
	{
		return STORM_TEXTURE;
	}

	@Override
	public int getStormSize()
	{
		return 32;
	}

	@Override
	public boolean isStormApplicableTo(WorldProvider provider)
	{
		return provider instanceof WorldProviderAiur;
	}

	@Override
	public void spawnParticleOnGround(World world, double pX, double pY, double pZ)
	{
		world.spawnParticle(EnumParticleTypes.SNOW_SHOVEL, pX, pY, pZ, 0.0D, 0.0D, 0.0D, new int[0]);
	}
}
