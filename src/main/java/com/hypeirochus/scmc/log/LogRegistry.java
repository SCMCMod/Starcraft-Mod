package com.hypeirochus.scmc.log;

import java.util.HashMap;
import java.util.Map;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.handlers.AccessHandler;
import com.hypeirochus.scmc.registry.IStarcraftRegistry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Handles all of the registry involved with the starcraft logs.
 * 
 * @author Ocelot5836
 */
public class LogRegistry implements IStarcraftRegistry<Integer, Log> {

	int id = 0;
	private Map<Integer, Log> logs;

	public LogRegistry() {
		logs = new HashMap<Integer, Log>();
	}

	@SideOnly(Side.CLIENT)
	public void init() {
		register(id++, new Log("test"));
		register(id++, new Log("log.egonstetmann.protoss1"));
		register(id++, new Log("log.egonstetmann.protoss2"));
		register(id++, new Log("log.egonstetmann.protoss3"));
		register(id++, new Log("log.egonstetmann.protoss4"));
		register(id++, new Log("log.egonstetmann.protoss5"));
		register(id++, new Log("log.egonstetmann.protoss6"));
		register(id++, new Log("log.egonstetmann.zerg1"));
		register(id++, new Log("log.egonstetmann.zerg2"));
		register(id++, new Log("log.egonstetmann.zerg3"));
		register(id++, new Log("log.egonstetmann.zerg4"));
		register(id++, new Log("log.egonstetmann.zerg5"));
		register(id++, new Log("log.egonstetmann.zerg6"));

		register(id++, new Log("log.general.acropolis"));
		register(id++, new Log("log.general.artofwar"));
		register(id++, new Log("log.general.backwoods"));
		register(id++, new Log("log.general.bengalaas"));
		register(id++, new Log("log.general.brokenmesa"));
		register(id++, new Log("log.general.charsurface"));
		register(id++, new Log("log.general.chausara"));
		register(id++, new Log("log.general.driftingplatforms"));
		register(id++, new Log("log.general.heimdalliv"));
		register(id++, new Log("log.general.polarisprime"));
		register(id++, new Log("log.general.scantid"));
		register(id++, new Log("log.general.shakurasterrain"));
		register(id++, new Log("log.general.uileliv"));
		register(id++, new Log("log.general.untamedwilds"));
		register(id++, new Log("log.general.weatherpatterns"));
		register(id++, new Log("log.general.wotanii"));
		register(id++, new Log("log.general.zenn"));
		register(id++, new Log("log.general.zephyrcove"));

		register(id++, new Log("log.protoss.legacy"));
		register(id++, new Log("log.protoss.alliance"));
		register(id++, new Log("log.protoss.warpgates"));
		register(id++, new Log("log.protoss.asari"));
		register(id++, new Log("log.protoss.overview"));
		register(id++, new Log("log.protoss.rassidan"));
		register(id++, new Log("log.protoss.tenarsis"));
		register(id++, new Log("log.protoss.eldritchspring"));
		register(id++, new Log("log.protoss.protossproverb"));
		register(id++, new Log("log.protoss.gardenofaiur"));
		register(id++, new Log("log.protoss.provinggrounds"));
		register(id++, new Log("log.protoss.summerstorms"));
		register(id++, new Log("log.protoss.templartraining"));
		register(id++, new Log("log.protoss.elderlands"));

		register(id++, new Log("log.terran.aarenruth"));
		register(id++, new Log("log.terran.alanjohnson"));
		register(id++, new Log("log.terran.baziothurgood"));
		register(id++, new Log("log.terran.bianari"));
		register(id++, new Log("log.terran.biggame"));
		register(id++, new Log("log.terran.bunkercommandii"));
		register(id++, new Log("log.terran.confederatecorpad"));
		register(id++, new Log("log.terran.corporalmaxredius"));
		register(id++, new Log("log.terran.edmundduke"));
		register(id++, new Log("log.terran.enigma"));
		register(id++, new Log("log.terran.francismccauly"));
		register(id++, new Log("log.terran.frontier"));
		register(id++, new Log("log.terran.gemini"));
		register(id++, new Log("log.terran.gpssurveyreport"));
		register(id++, new Log("log.terran.korhalscorching"));
		register(id++, new Log("log.terran.marine219xms87632"));
		register(id++, new Log("log.terran.matthewmurdoch"));
		register(id++, new Log("log.terran.mcalester"));
		register(id++, new Log("log.terran.newgauntlet"));
		register(id++, new Log("log.terran.newstation"));
		register(id++, new Log("log.terran.nidhoggiii"));
		register(id++, new Log("log.terran.normangoodfellow"));
		register(id++, new Log("log.terran.norrisbailey"));
		register(id++, new Log("log.terran.northvssouth"));
		register(id++, new Log("log.terran.novasquad"));
		register(id++, new Log("log.terran.rebellions"));
		register(id++, new Log("log.terran.remotemining"));
		register(id++, new Log("log.terran.richardwalker"));
		register(id++, new Log("log.terran.rileybullhorn"));
		register(id++, new Log("log.terran.robertolamas"));
		register(id++, new Log("log.terran.spacestations"));
		register(id++, new Log("log.terran.summeriastation"));
		register(id++, new Log("log.terran.terranorigin"));
		register(id++, new Log("log.terran.uedchar"));
		register(id++, new Log("log.terran.uedcommandantlog"));
		register(id++, new Log("log.terran.uednamingcommittee"));
		register(id++, new Log("log.terran.urangolenko"));
		register(id++, new Log("log.terran.wildlifeservices"));

		register(id++, new Log("log.zerg.overview"));
		register(id++, new Log("log.zerg.eruption"));

		register(id++, new Log("log.science.planets.aiur0"));
		register(id++, new Log("log.science.planets.braxis0"));
		register(id++, new Log("log.science.planets.char0"));
		register(id++, new Log("log.science.planets.kaldir0"));
		register(id++, new Log("log.science.planets.korhal0"));
		register(id++, new Log("log.science.planets.marsara0"));
		register(id++, new Log("log.science.planets.moria0"));
		register(id++, new Log("log.science.planets.newfolsom0"));
		register(id++, new Log("log.science.planets.phaeton0"));
		register(id++, new Log("log.science.planets.shiloh0"));
		register(id++, new Log("log.science.planets.tarsonis0"));
		register(id++, new Log("log.science.planets.umoja0"));
		register(id++, new Log("log.science.planets.xt39323"));

		register(id++, new Log("log.science.protoss.archon0"));
		register(id++, new Log("log.science.protoss.archon1"));
		register(id++, new Log("log.science.protoss.archon2"));
		register(id++, new Log("log.science.protoss.archon3"));
		register(id++, new Log("log.science.protoss.adept0"));
		register(id++, new Log("log.science.protoss.carrier0"));
		register(id++, new Log("log.science.protoss.carrier1"));
		register(id++, new Log("log.science.protoss.carrier2"));
		register(id++, new Log("log.science.protoss.carrier3"));
		register(id++, new Log("log.science.protoss.colossus0"));
		register(id++, new Log("log.science.protoss.colossus1"));
		register(id++, new Log("log.science.protoss.colossus2"));
		register(id++, new Log("log.science.protoss.colossus3"));
		register(id++, new Log("log.science.protoss.darktemplar0"));
		register(id++, new Log("log.science.protoss.darktemplar1"));
		register(id++, new Log("log.science.protoss.darktemplar2"));
		register(id++, new Log("log.science.protoss.darktemplar3"));
		register(id++, new Log("log.science.protoss.disruptor0"));
		register(id++, new Log("log.science.protoss.hightemplar0"));
		register(id++, new Log("log.science.protoss.hightemplar1"));
		register(id++, new Log("log.science.protoss.hightemplar2"));
		register(id++, new Log("log.science.protoss.hightemplar3"));
		register(id++, new Log("log.science.protoss.immortal0"));
		register(id++, new Log("log.science.protoss.immortal1"));
		register(id++, new Log("log.science.protoss.immortal2"));
		register(id++, new Log("log.science.protoss.immortal3"));
		register(id++, new Log("log.science.protoss.mothership0"));
		register(id++, new Log("log.science.protoss.mothership1"));
		register(id++, new Log("log.science.protoss.mothership2"));
		register(id++, new Log("log.science.protoss.mothership3"));
		register(id++, new Log("log.science.protoss.mothershipcore0"));
		register(id++, new Log("log.science.protoss.mothershipcore1"));
		register(id++, new Log("log.science.protoss.mothershipcore2"));
		register(id++, new Log("log.science.protoss.mothershipcore3"));
		register(id++, new Log("log.science.protoss.mothershipcore4"));
		register(id++, new Log("log.science.protoss.observer0"));
		register(id++, new Log("log.science.protoss.observer1"));
		register(id++, new Log("log.science.protoss.observer2"));
		register(id++, new Log("log.science.protoss.observer3"));
		register(id++, new Log("log.science.protoss.oracle0"));
		register(id++, new Log("log.science.protoss.oracle1"));
		register(id++, new Log("log.science.protoss.oracle2"));
		register(id++, new Log("log.science.protoss.oracle3"));
		register(id++, new Log("log.science.protoss.oracle4"));
		register(id++, new Log("log.science.protoss.phoenix0"));
		register(id++, new Log("log.science.protoss.phoenix1"));
		register(id++, new Log("log.science.protoss.phoenix2"));
		register(id++, new Log("log.science.protoss.phoenix3"));
		register(id++, new Log("log.science.protoss.phoenix4"));
		register(id++, new Log("log.science.protoss.probe0"));
		register(id++, new Log("log.science.protoss.probe1"));
		register(id++, new Log("log.science.protoss.probe2"));
		register(id++, new Log("log.science.protoss.probe3"));
		register(id++, new Log("log.science.protoss.sentry0"));
		register(id++, new Log("log.science.protoss.sentry1"));
		register(id++, new Log("log.science.protoss.sentry2"));
		register(id++, new Log("log.science.protoss.sentry3"));
		register(id++, new Log("log.science.protoss.sentry4"));
		register(id++, new Log("log.science.protoss.stalker0"));
		register(id++, new Log("log.science.protoss.stalker1"));
		register(id++, new Log("log.science.protoss.stalker2"));
		register(id++, new Log("log.science.protoss.stalker3"));
		register(id++, new Log("log.science.protoss.tempest0"));
		register(id++, new Log("log.science.protoss.tempest1"));
		register(id++, new Log("log.science.protoss.tempest2"));
		register(id++, new Log("log.science.protoss.tempest3"));
		register(id++, new Log("log.science.protoss.voidray0"));
		register(id++, new Log("log.science.protoss.voidray1"));
		register(id++, new Log("log.science.protoss.voidray2"));
		register(id++, new Log("log.science.protoss.voidray3"));
		register(id++, new Log("log.science.protoss.voidray4"));
		register(id++, new Log("log.science.protoss.warpprism0"));
		register(id++, new Log("log.science.protoss.warpprism1"));
		register(id++, new Log("log.science.protoss.warpprism2"));
		register(id++, new Log("log.science.protoss.warpprism3"));
		register(id++, new Log("log.science.protoss.zealot0"));
		register(id++, new Log("log.science.protoss.zealot1"));
		register(id++, new Log("log.science.protoss.zealot2"));
		register(id++, new Log("log.science.protoss.zealot3"));
		register(id++, new Log("log.science.protoss.zealot4"));
		register(id++, new Log("log.science.protoss.zealot5"));

		register(id++, new Log("log.science.terran.banshee0"));
		register(id++, new Log("log.science.terran.banshee1"));
		register(id++, new Log("log.science.terran.banshee2"));
		register(id++, new Log("log.science.terran.banshee3"));
		register(id++, new Log("log.science.terran.banshee4"));
		register(id++, new Log("log.science.terran.battlecruiser0"));
		register(id++, new Log("log.science.terran.battlecruiser1"));
		register(id++, new Log("log.science.terran.battlecruiser2"));
		register(id++, new Log("log.science.terran.battlecruiser3"));
		register(id++, new Log("log.science.terran.battlecruiser4"));
		register(id++, new Log("log.science.terran.battlecruiser5"));
		register(id++, new Log("log.science.terran.cyclone0"));
		register(id++, new Log("log.science.terran.ghost0"));
		register(id++, new Log("log.science.terran.ghost1"));
		register(id++, new Log("log.science.terran.ghost2"));
		register(id++, new Log("log.science.terran.ghost3"));
		register(id++, new Log("log.science.terran.ghost4"));
		register(id++, new Log("log.science.terran.hellbat0"));
		register(id++, new Log("log.science.terran.hellbat1"));
		register(id++, new Log("log.science.terran.hellbat2"));
		register(id++, new Log("log.science.terran.hellbat3"));
		register(id++, new Log("log.science.terran.hellbat4"));
		register(id++, new Log("log.science.terran.hellbat5"));
		register(id++, new Log("log.science.terran.hellion0"));
		register(id++, new Log("log.science.terran.hellion1"));
		register(id++, new Log("log.science.terran.hellion2"));
		register(id++, new Log("log.science.terran.hellion3"));
		register(id++, new Log("log.science.terran.hellion4"));
		register(id++, new Log("log.science.terran.hellion5"));
		register(id++, new Log("log.science.terran.liberator0"));
		register(id++, new Log("log.science.terran.marauder0"));
		register(id++, new Log("log.science.terran.marauder1"));
		register(id++, new Log("log.science.terran.marauder2"));
		register(id++, new Log("log.science.terran.marauder3"));
		register(id++, new Log("log.science.terran.marauder4"));
		register(id++, new Log("log.science.terran.marine0"));
		register(id++, new Log("log.science.terran.marine1"));
		register(id++, new Log("log.science.terran.marine2"));
		register(id++, new Log("log.science.terran.marine3"));
		register(id++, new Log("log.science.terran.marine4"));
		register(id++, new Log("log.science.terran.medivac0"));
		register(id++, new Log("log.science.terran.medivac1"));
		register(id++, new Log("log.science.terran.medivac2"));
		register(id++, new Log("log.science.terran.medivac3"));
		register(id++, new Log("log.science.terran.medivac4"));
		register(id++, new Log("log.science.terran.raven0"));
		register(id++, new Log("log.science.terran.raven1"));
		register(id++, new Log("log.science.terran.raven2"));
		register(id++, new Log("log.science.terran.raven3"));
		register(id++, new Log("log.science.terran.raven4"));
		register(id++, new Log("log.science.terran.reaper0"));
		register(id++, new Log("log.science.terran.reaper1"));
		register(id++, new Log("log.science.terran.reaper2"));
		register(id++, new Log("log.science.terran.reaper3"));
		register(id++, new Log("log.science.terran.reaper4"));
		register(id++, new Log("log.science.terran.reaper5"));
		register(id++, new Log("log.science.terran.scv0"));
		register(id++, new Log("log.science.terran.scv1"));
		register(id++, new Log("log.science.terran.scv2"));
		register(id++, new Log("log.science.terran.scv3"));
		register(id++, new Log("log.science.terran.scv4"));
		register(id++, new Log("log.science.terran.scv5"));
		register(id++, new Log("log.science.terran.siegetank0"));
		register(id++, new Log("log.science.terran.siegetank1"));
		register(id++, new Log("log.science.terran.siegetank2"));
		register(id++, new Log("log.science.terran.siegetank3"));
		register(id++, new Log("log.science.terran.siegetank4"));
		register(id++, new Log("log.science.terran.thor0"));
		register(id++, new Log("log.science.terran.thor1"));
		register(id++, new Log("log.science.terran.thor2"));
		register(id++, new Log("log.science.terran.thor3"));
		register(id++, new Log("log.science.terran.thor4"));
		register(id++, new Log("log.science.terran.viking0"));
		register(id++, new Log("log.science.terran.viking1"));
		register(id++, new Log("log.science.terran.viking2"));
		register(id++, new Log("log.science.terran.viking3"));
		register(id++, new Log("log.science.terran.viking4"));
		register(id++, new Log("log.science.terran.viking5"));
		register(id++, new Log("log.science.terran.widowmine0"));
		register(id++, new Log("log.science.terran.widowmine1"));
		register(id++, new Log("log.science.terran.widowmine2"));
		register(id++, new Log("log.science.terran.widowmine3"));
		register(id++, new Log("log.science.terran.widowmine4"));

		register(id++, new Log("log.science.zerg.baneling0"));
		register(id++, new Log("log.science.zerg.baneling1"));
		register(id++, new Log("log.science.zerg.baneling2"));
		register(id++, new Log("log.science.zerg.baneling3"));
		register(id++, new Log("log.science.zerg.baneling4"));
		register(id++, new Log("log.science.zerg.broodlord0"));
		register(id++, new Log("log.science.zerg.broodlord1"));
		register(id++, new Log("log.science.zerg.broodlord2"));
		register(id++, new Log("log.science.zerg.broodlord3"));
		register(id++, new Log("log.science.zerg.broodlord4"));
		register(id++, new Log("log.science.zerg.corruptor0"));
		register(id++, new Log("log.science.zerg.corruptor1"));
		register(id++, new Log("log.science.zerg.corruptor2"));
		register(id++, new Log("log.science.zerg.corruptor3"));
		register(id++, new Log("log.science.zerg.corruptor4"));
		register(id++, new Log("log.science.zerg.drone0"));
		register(id++, new Log("log.science.zerg.drone1"));
		register(id++, new Log("log.science.zerg.drone2"));
		register(id++, new Log("log.science.zerg.drone3"));
		register(id++, new Log("log.science.zerg.drone4"));
		register(id++, new Log("log.science.zerg.hydralisk0"));
		register(id++, new Log("log.science.zerg.hydralisk1"));
		register(id++, new Log("log.science.zerg.hydralisk2"));
		register(id++, new Log("log.science.zerg.hydralisk3"));
		register(id++, new Log("log.science.zerg.hydralisk4"));
		register(id++, new Log("log.science.zerg.infestor0"));
		register(id++, new Log("log.science.zerg.infestor1"));
		register(id++, new Log("log.science.zerg.infestor2"));
		register(id++, new Log("log.science.zerg.infestor3"));
		register(id++, new Log("log.science.zerg.infestor4"));
		register(id++, new Log("log.science.zerg.infestor5"));
		register(id++, new Log("log.science.zerg.larva0"));
		register(id++, new Log("log.science.zerg.larva1"));
		register(id++, new Log("log.science.zerg.larva2"));
		register(id++, new Log("log.science.zerg.larva3"));
		register(id++, new Log("log.science.zerg.larva4"));
		register(id++, new Log("log.science.zerg.lurker0"));
		register(id++, new Log("log.science.zerg.mutalisk0"));
		register(id++, new Log("log.science.zerg.mutalisk1"));
		register(id++, new Log("log.science.zerg.mutalisk2"));
		register(id++, new Log("log.science.zerg.mutalisk3"));
		register(id++, new Log("log.science.zerg.mutalisk4"));
		register(id++, new Log("log.science.zerg.mutalisk5"));
		register(id++, new Log("log.science.zerg.nydusworm0"));
		register(id++, new Log("log.science.zerg.nydusworm1"));
		register(id++, new Log("log.science.zerg.nydusworm2"));
		register(id++, new Log("log.science.zerg.nydusworm3"));
		register(id++, new Log("log.science.zerg.nydusworm4"));
		register(id++, new Log("log.science.zerg.nydusworm5"));
		register(id++, new Log("log.science.zerg.overlord0"));
		register(id++, new Log("log.science.zerg.overlord1"));
		register(id++, new Log("log.science.zerg.overlord2"));
		register(id++, new Log("log.science.zerg.overlord3"));
		register(id++, new Log("log.science.zerg.overlord4"));
		register(id++, new Log("log.science.zerg.overlord5"));
		register(id++, new Log("log.science.zerg.overseer0"));
		register(id++, new Log("log.science.zerg.overseer1"));
		register(id++, new Log("log.science.zerg.overseer2"));
		register(id++, new Log("log.science.zerg.overseer3"));
		register(id++, new Log("log.science.zerg.overseer4"));
		register(id++, new Log("log.science.zerg.queen0"));
		register(id++, new Log("log.science.zerg.queen1"));
		register(id++, new Log("log.science.zerg.queen2"));
		register(id++, new Log("log.science.zerg.queen3"));
		register(id++, new Log("log.science.zerg.queen4"));
		register(id++, new Log("log.science.zerg.ravager0"));
		register(id++, new Log("log.science.zerg.roach0"));
		register(id++, new Log("log.science.zerg.roach1"));
		register(id++, new Log("log.science.zerg.roach2"));
		register(id++, new Log("log.science.zerg.roach3"));
		register(id++, new Log("log.science.zerg.roach4"));
		register(id++, new Log("log.science.zerg.roach5"));
		register(id++, new Log("log.science.zerg.swarmhost0"));
		register(id++, new Log("log.science.zerg.swarmhost1"));
		register(id++, new Log("log.science.zerg.swarmhost2"));
		register(id++, new Log("log.science.zerg.swarmhost3"));
		register(id++, new Log("log.science.zerg.swarmhost4"));
		register(id++, new Log("log.science.zerg.ultralisk0"));
		register(id++, new Log("log.science.zerg.ultralisk1"));
		register(id++, new Log("log.science.zerg.ultralisk2"));
		register(id++, new Log("log.science.zerg.ultralisk3"));
		register(id++, new Log("log.science.zerg.ultralisk4"));
		register(id++, new Log("log.science.zerg.ultralisk5"));
		register(id++, new Log("log.science.zerg.viper0"));
		register(id++, new Log("log.science.zerg.viper1"));
		register(id++, new Log("log.science.zerg.viper2"));
		register(id++, new Log("log.science.zerg.viper3"));
		register(id++, new Log("log.science.zerg.viper4"));
		register(id++, new Log("log.science.zerg.viper5"));
		register(id++, new Log("log.science.zerg.zergling0"));
		register(id++, new Log("log.science.zerg.zergling1"));
		register(id++, new Log("log.science.zerg.zergling2"));
		register(id++, new Log("log.science.zerg.zergling3"));
		register(id++, new Log("log.science.zerg.zergling4"));
		register(id++, new Log("log.science.zerg.zergling5"));
		register(id++, new Log("log.science.zerg.zergling6"));

		if (AccessHandler.isDeobfuscatedEnvironment()) {
			Starcraft.logger().info("Logs Registered");
		}
	}

	@Override
	public void register(Integer id, Log log) {
		if (!this.logs.containsKey(id)) {
			this.logs.put(id, log);
			log.setId(id);
		} else {
			throw new RuntimeException("You cannot register two logs with the same id!");
		}
	}

	@Override
	public Log get(Integer id) {
		return this.logs.get(id);
	}

	public String getRegistryName(Log log) {
		return log.getRegistryName();
	}

	public Map<Integer, Log> getLogs() {
		return new HashMap<Integer, Log>(logs);
	}
}