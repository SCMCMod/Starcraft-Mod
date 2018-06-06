package com.hypeirochus.scmc.handlers;

import com.hypeirochus.scmc.Starcraft;

import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

/**
 * <em><b>Copyright (c) 2017 The Starcraft Minecraft (SCMC) Mod Team.</b></em>
 * 
 * <br>
 * </br>
 * 
 * Creates and registers the sounds for the mod.
 */
public class SoundHandler {

	public static SoundEvent	ENTITY_BROODLING_DEATH;
	public static SoundEvent	ENTITY_BROODLING_HURT;
	public static SoundEvent	ENTITY_BROODLING_LIVE1;

	public static SoundEvent	ENTITY_BRUTALISK_DEATH;
	public static SoundEvent	ENTITY_BRUTALISK_HURT;
	public static SoundEvent	ENTITY_BRUTALISK_LIVE1;
	public static SoundEvent	ENTITY_BRUTALISK_STEP;

	public static SoundEvent	ENTITY_DARKTEMPLAR_DEATH;
	public static SoundEvent	ENTITY_DARKTEMPLAR_HURT;
	public static SoundEvent	ENTITY_DARKTEMPLAR_LIVE1;
	public static SoundEvent	ENTITY_DARKTEMPLAR_LIVE2;

	public static SoundEvent	ENTITY_HYDRALISK_DEATH;
	public static SoundEvent	ENTITY_HYDRALISK_HURT;
	public static SoundEvent	ENTITY_HYDRALISK_LIVE1;
	public static SoundEvent	ENTITY_HYDRALISK_LIVE2;
	public static SoundEvent	ENTITY_HYDRALISK_LIVE3;
	public static SoundEvent	ENTITY_HYDRALISK_LIVE4;
	public static SoundEvent	FX_HYDRALISK_FIRE;

	public static SoundEvent	ENTITY_LARVA_DEATH;
	public static SoundEvent	ENTITY_LARVA_HURT;
	public static SoundEvent	ENTITY_LARVA_LIVE1;

	public static SoundEvent	ENTITY_PREAVER_DEATH;
	public static SoundEvent	ENTITY_PREAVER_HURT;
	public static SoundEvent	ENTITY_PREAVER_LIVE1;
	public static SoundEvent	ENTITY_PREAVER_LIVE2;
	public static SoundEvent	ENTITY_PREAVER_LIVE3;
	public static SoundEvent	ENTITY_PREAVER_LIVE4;
	public static SoundEvent	ENTITY_PREAVER_LIVE5;

	public static SoundEvent	ENTITY_PREDATOR_DEATH;
	public static SoundEvent	ENTITY_PREDATOR_HURT;
	public static SoundEvent	ENTITY_PREDATOR_LIVE1;
	public static SoundEvent	ENTITY_PREDATOR_LIVE2;

	public static SoundEvent	ENTITY_PROBE_DEATH;
	public static SoundEvent	ENTITY_PROBE_HURT;
	public static SoundEvent	ENTITY_PROBE_LIVE1;

	public static SoundEvent	ENTITY_ZEALOT_DEATH;
	public static SoundEvent	ENTITY_ZEALOT_HURT;
	public static SoundEvent	ENTITY_ZEALOT_LIVE1;
	public static SoundEvent	ENTITY_ZEALOT_LIVE2;
	public static SoundEvent	ENTITY_ZEALOT_LIVE3;
	public static SoundEvent	ENTITY_ZEALOT_LIVE4;

	public static SoundEvent	ENTITY_ZERGCOCOON_DEATH;
	public static SoundEvent	ENTITY_ZERGCOCOON_HURT;
	public static SoundEvent	ENTITY_ZERGCOCOON_LIVE1;

	public static SoundEvent	ENTITY_ZERGLING_DEATH;
	public static SoundEvent	ENTITY_ZERGLING_HURT;
	public static SoundEvent	ENTITY_ZERGLING_LIVE1;
	public static SoundEvent	ENTITY_ZERGLING_LIVE2;
	public static SoundEvent	ENTITY_ZERGLING_LIVE3;
	public static SoundEvent	ENTITY_ZERGLING_LIVE4;

	public static SoundEvent	ENTITY_INFESTEDCIVILIAN_DEATH;
	public static SoundEvent	ENTITY_INFESTEDCIVILIAN_HURT;
	public static SoundEvent	ENTITY_INFESTEDCIVILIAN_LIVE1;

	public static SoundEvent	STRUC_CYBERNETICSCORE_BIRTH;
	public static SoundEvent	STRUC_GATEWAY_BIRTH;
	public static SoundEvent	STRUC_PYLON_BIRTH;

	public static SoundEvent	FX_PSIBLADE_ATTACK;
	public static SoundEvent	FX_WARPBLADE_ATTACK;
	public static SoundEvent	FX_C14GAUSSRIFLE_FIRING;
	public static SoundEvent	FX_C14GAUSSRIFLE_OUT;

	public static SoundEvent	FX_SCOUT_FIRING;
	
	public static SoundEvent	FX_WRAITH_FIRING;

	public static SoundEvent	ENTITY_KAKARU_LIVE1;
	public static SoundEvent	ENTITY_KAKARU_LIVE2;
	public static SoundEvent	ENTITY_KAKARU_HURT;
	public static SoundEvent	ENTITY_KAKARU_DEATH;

	public static SoundEvent	ENTITY_URSADON_LIVE1;
	public static SoundEvent	ENTITY_URSADON_LIVE2;
	public static SoundEvent	ENTITY_URSADON_HURT;
	public static SoundEvent	ENTITY_URSADON_DEATH;

	public static SoundEvent	ENTITY_QUEEN_LIVE1;
	public static SoundEvent	ENTITY_QUEEN_LIVE2;
	public static SoundEvent	ENTITY_QUEEN_HURT;
	public static SoundEvent	ENTITY_QUEEN_DEATH;

	public static SoundEvent	ENTITY_MUTALISK_LIVE1;
	public static SoundEvent	ENTITY_MUTALISK_LIVE2;
	public static SoundEvent	ENTITY_MUTALISK_HURT;
	public static SoundEvent	ENTITY_MUTALISK_DEATH;
	public static SoundEvent	FX_MUTALISK_FIRE;

	public static SoundEvent	ENTITY_MARINE_LIVE1;
	public static SoundEvent	ENTITY_MARINE_HURT;
	public static SoundEvent	ENTITY_MARINE_DEATH;

	/** @author Ocelot5836 */
	public static SoundEvent	BLOCK_FLESH_BREAK;
	/** @author Ocelot5836 */
	public static SoundEvent	BLOCK_FLESH_STEP;
	/** @author Ocelot5836 */
	public static SoundEvent	BLOCK_FLESH_PLACE;
	/** @author Ocelot5836 */
	public static SoundEvent	BLOCK_FLESH_HIT;
	/** @author Ocelot5836 */
	public static SoundEvent	BLOCK_FLESH_FALL;

	public static SoundEvent	BLOCK_GAS_COLLECTOR_PROTOSS;
	public static SoundEvent	BLOCK_GAS_COLLECTOR_TERRAN;
	public static SoundEvent	BLOCK_GAS_COLLECTOR_ZERG;

	public static void pre(FMLPreInitializationEvent event) {
		registerSounds();
		SoundTypes.register();
	}

	public static class SoundTypes {
		
		/** @author Ocelot5836 */
		public static SoundType FLESH;

		private static void register() {
			FLESH = new SoundType(0.5f, 1.0f, SoundHandler.BLOCK_FLESH_BREAK, SoundHandler.BLOCK_FLESH_STEP, SoundHandler.BLOCK_FLESH_PLACE, SoundHandler.BLOCK_FLESH_HIT, SoundHandler.BLOCK_FLESH_FALL);
		}
	}

	private static void registerSounds() {
		ENTITY_ZERGLING_LIVE1 = registerSound("mob.zergling.live1");
		ENTITY_ZERGLING_LIVE2 = registerSound("mob.zergling.live2");
		ENTITY_ZERGLING_LIVE3 = registerSound("mob.zergling.live3");
		ENTITY_ZERGLING_LIVE4 = registerSound("mob.zergling.live4");
		ENTITY_ZERGLING_HURT = registerSound("mob.zergling.hurt");
		ENTITY_ZERGLING_DEATH = registerSound("mob.zergling.death");

		ENTITY_HYDRALISK_LIVE1 = registerSound("mob.hydralisk.live1");
		ENTITY_HYDRALISK_LIVE2 = registerSound("mob.hydralisk.live2");
		ENTITY_HYDRALISK_LIVE3 = registerSound("mob.hydralisk.live3");
		ENTITY_HYDRALISK_LIVE4 = registerSound("mob.hydralisk.live4");
		ENTITY_HYDRALISK_HURT = registerSound("mob.hydralisk.hurt");
		ENTITY_HYDRALISK_DEATH = registerSound("mob.hydralisk.death");
		FX_HYDRALISK_FIRE = registerSound("fx.hydralisk.fire");

		ENTITY_LARVA_LIVE1 = registerSound("mob.larva.live1");
		ENTITY_LARVA_HURT = registerSound("mob.larva.hurt");
		ENTITY_LARVA_DEATH = registerSound("mob.larva.death");

		ENTITY_ZERGCOCOON_LIVE1 = registerSound("mob.zergcocoon.live1");
		ENTITY_ZERGCOCOON_HURT = registerSound("mob.zergcocoon.hurt");
		ENTITY_ZERGCOCOON_DEATH = registerSound("mob.zergcocoon.death");

		ENTITY_ZEALOT_LIVE1 = registerSound("mob.zealot.live1");
		ENTITY_ZEALOT_LIVE2 = registerSound("mob.zealot.live2");
		ENTITY_ZEALOT_LIVE3 = registerSound("mob.zealot.live3");
		ENTITY_ZEALOT_LIVE4 = registerSound("mob.zealot.live4");
		ENTITY_ZEALOT_HURT = registerSound("mob.zealot.hurt");
		ENTITY_ZEALOT_DEATH = registerSound("mob.zealot.death");

		ENTITY_DARKTEMPLAR_LIVE1 = registerSound("mob.darktemplar.live1");
		ENTITY_DARKTEMPLAR_LIVE2 = registerSound("mob.darktemplar.live2");
		ENTITY_DARKTEMPLAR_HURT = registerSound("mob.darktemplar.hurt");
		ENTITY_DARKTEMPLAR_DEATH = registerSound("mob.darktemplar.death");

		ENTITY_PREAVER_LIVE1 = registerSound("mob.reaver.live1");
		ENTITY_PREAVER_LIVE2 = registerSound("mob.reaver.live2");
		ENTITY_PREAVER_LIVE3 = registerSound("mob.reaver.live3");
		ENTITY_PREAVER_LIVE4 = registerSound("mob.reaver.live4");
		ENTITY_PREAVER_LIVE5 = registerSound("mob.reaver.live5");
		ENTITY_PREAVER_HURT = registerSound("mob.reaver.hurt");
		ENTITY_PREAVER_DEATH = registerSound("mob.reaver.death");

		ENTITY_PROBE_LIVE1 = registerSound("mob.probe.live1");
		ENTITY_PROBE_HURT = registerSound("mob.probe.hurt");
		ENTITY_PROBE_DEATH = registerSound("mob.probe.death");

		ENTITY_BRUTALISK_LIVE1 = registerSound("mob.brutalisk.live1");
		ENTITY_BRUTALISK_HURT = registerSound("mob.brutalisk.hurt");
		ENTITY_BRUTALISK_DEATH = registerSound("mob.brutalisk.death");
		ENTITY_BRUTALISK_STEP = registerSound("mob.brutalisk.step");

		ENTITY_BROODLING_LIVE1 = registerSound("mob.broodling.live1");
		ENTITY_BROODLING_HURT = registerSound("mob.broodling.hurt");
		ENTITY_BROODLING_DEATH = registerSound("mob.broodling.death");

		ENTITY_PREDATOR_LIVE1 = registerSound("mob.predator.live1");
		ENTITY_PREDATOR_LIVE2 = registerSound("mob.predator.live2");
		ENTITY_PREDATOR_HURT = registerSound("mob.predator.hurt");
		ENTITY_PREDATOR_DEATH = registerSound("mob.predator.death");

		ENTITY_INFESTEDCIVILIAN_LIVE1 = registerSound("mob.infestedcivilian.live1");
		ENTITY_INFESTEDCIVILIAN_HURT = registerSound("mob.infestedcivilian.hurt");
		ENTITY_INFESTEDCIVILIAN_DEATH = registerSound("mob.infestedcivilian.death");

		STRUC_GATEWAY_BIRTH = registerSound("struc.gateway.birth");
		STRUC_CYBERNETICSCORE_BIRTH = registerSound("struc.cyberneticscore.birth");
		STRUC_PYLON_BIRTH = registerSound("struc.pylon.birth");

		FX_PSIBLADE_ATTACK = registerSound("fx.psiblade.attack");
		FX_WARPBLADE_ATTACK = registerSound("fx.warpblade.attack");
		FX_C14GAUSSRIFLE_FIRING = registerSound("fx.c14gaussrifle.firing");
		FX_C14GAUSSRIFLE_OUT = registerSound("fx.c14gaussrifle.out");

		FX_SCOUT_FIRING = registerSound("fx.scout.firing");
		
		FX_WRAITH_FIRING = registerSound("fx.wraith.firing");

		BLOCK_FLESH_BREAK = registerSound("block.flesh.break");
		BLOCK_FLESH_STEP = registerSound("block.flesh.step");
		BLOCK_FLESH_PLACE = registerSound("block.flesh.place");
		BLOCK_FLESH_HIT = registerSound("block.flesh.hit");
		BLOCK_FLESH_FALL = registerSound("block.flesh.fall");

		ENTITY_KAKARU_LIVE1 = registerSound("mob.kakaru.live1");
		ENTITY_KAKARU_LIVE2 = registerSound("mob.kakaru.live2");
		ENTITY_KAKARU_HURT = registerSound("mob.kakaru.hurt");
		ENTITY_KAKARU_DEATH = registerSound("mob.kakaru.death");

		ENTITY_URSADON_LIVE1 = registerSound("mob.ursadon.live1");
		ENTITY_URSADON_LIVE2 = registerSound("mob.ursadon.live2");
		ENTITY_URSADON_HURT = registerSound("mob.ursadon.hurt");
		ENTITY_URSADON_DEATH = registerSound("mob.ursadon.death");

		ENTITY_QUEEN_LIVE1 = registerSound("mob.queen.live1");
		ENTITY_QUEEN_LIVE2 = registerSound("mob.queen.live2");
		ENTITY_QUEEN_HURT = registerSound("mob.queen.hurt");
		ENTITY_QUEEN_DEATH = registerSound("mob.queen.death");

		ENTITY_MUTALISK_LIVE1 = registerSound("mob.mutalisk.live1");
		ENTITY_MUTALISK_LIVE2 = registerSound("mob.mutalisk.live2");
		ENTITY_MUTALISK_HURT = registerSound("mob.mutalisk.hurt");
		ENTITY_MUTALISK_DEATH = registerSound("mob.mutalisk.death");
		FX_MUTALISK_FIRE = registerSound("fx.mutalisk.fire");

		ENTITY_MARINE_LIVE1 = registerSound("mob.marine.live1");
		ENTITY_MARINE_HURT = registerSound("mob.marine.hurt");
		ENTITY_MARINE_DEATH = registerSound("mob.marine.death");

		BLOCK_GAS_COLLECTOR_PROTOSS = registerSound("block.gas_collector.protoss");
		BLOCK_GAS_COLLECTOR_TERRAN = registerSound("block.gas_collector.terran");
		BLOCK_GAS_COLLECTOR_ZERG = registerSound("block.gas_collector.zerg");
	}

	private static SoundEvent registerSound(String soundName) {
		ResourceLocation soundID = new ResourceLocation(Starcraft.MOD_ID, soundName);
		SoundEvent event = new SoundEvent(soundID);
		ForgeRegistries.SOUND_EVENTS.register(event.setRegistryName(soundID));
		return event;
	}
}