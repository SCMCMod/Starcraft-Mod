package com.hypeirochus.scmc.worldgen.dimchar;

import com.hypeirochus.api.client.render.Texture;
import com.hypeirochus.api.client.render.world.StormProvider;
import com.hypeirochus.api.world.Worlds;
import com.hypeirochus.scmc.lib.Library;
import com.hypeirochus.scmc.worldgen.dimkaldir.WorldProviderKaldir;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;

public class StormProviderChar extends StormProvider {
	@Override
	public void updateStorm(World world) {
		if (world != null && this.isStormActive(world)) {
			for (Object o : world.loadedEntityList.toArray()) {
				if (o instanceof Entity) {
					Entity entity = (Entity) o;

					if (entity.world.provider instanceof WorldProviderKaldir) {
						if (this.apply(entity) && Worlds.canSeeSky(new BlockPos(entity), world)) {
							entity.fallDistance = 0F;

							if (entity instanceof EntityLivingBase) {
								entity.setFire(5);
							}
						}
					}
				}
			}
		}
	}

	public static final Texture STORM_TEXTURE = new Texture(Library.MODID, "textures/world/hellfire.png");

	public boolean isStormActive(World world) {
		return world.getWorldTime() >= 3000 && world.getWorldTime() <= 4000;
	}

	@Override
	public boolean isStormVisibleInBiome(Biome biome) {
		return true;
	}

	@Override
	public float getStormDownfallSpeed() {
		return 14.0F;
	}

	@Override
	public float getStormWindSpeed() {
		return 4.0F;
	}

	@Override
	public boolean doesLightingApply() {
		return false;
	}

	@Override
	public float getStormDirection() {
		return 90F;
	}

	@Override
	public Texture getStormTexture(World world, Biome biome) {
		return STORM_TEXTURE;
	}

	@Override
	public int getStormSize() {
		return 32;
	}

	@Override
	public boolean isStormApplicableTo(WorldProvider provider) {
		return provider instanceof WorldProviderChar;
	}
}
