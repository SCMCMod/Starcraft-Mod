package com.hypeirochus.scmc.log;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Handles all of the registry involved with the starcraft logs.
 * 
 * @author Ocelot5836
 */
public class LogRegistry {

	short						id	= 0;
	private Map<Integer, Log>	logs;

	public LogRegistry() {
		logs = new HashMap<Integer, Log>();
	}

	public void init(FMLInitializationEvent event) {
		this.registerLogs();
	}

	@SideOnly(Side.CLIENT)
	private void registerLogs() {
		register(new Log(id++, "test"));
		register(new Log(id++, "log.egonstetmann.protoss1"));
		register(new Log(id++, "log.egonstetmann.protoss2"));
		register(new Log(id++, "log.egonstetmann.protoss3"));
		register(new Log(id++, "log.egonstetmann.protoss4"));
		register(new Log(id++, "log.egonstetmann.protoss5"));
		register(new Log(id++, "log.egonstetmann.protoss6"));
		register(new Log(id++, "log.egonstetmann.zerg1"));
		register(new Log(id++, "log.egonstetmann.zerg2"));
		register(new Log(id++, "log.egonstetmann.zerg3"));
		register(new Log(id++, "log.egonstetmann.zerg4"));
		register(new Log(id++, "log.egonstetmann.zerg5"));
		register(new Log(id++, "log.egonstetmann.zerg6"));

		register(new Log(id++, "log.general.acropolis"));
		register(new Log(id++, "log.general.artofwar"));
		register(new Log(id++, "log.general.backwoods"));
		register(new Log(id++, "log.general.bengalaas"));
		register(new Log(id++, "log.general.brokenmesa"));
		register(new Log(id++, "log.general.charsurface"));
		register(new Log(id++, "log.general.chausara"));
		register(new Log(id++, "log.general.driftingplatforms"));
		register(new Log(id++, "log.general.heimdalliv"));
		register(new Log(id++, "log.general.polarisprime"));
		register(new Log(id++, "log.general.scantid"));
		register(new Log(id++, "log.general.shakurasterrain"));
		register(new Log(id++, "log.general.uileliv"));
		register(new Log(id++, "log.general.untamedwilds"));
		register(new Log(id++, "log.general.weatherpatterns"));
		register(new Log(id++, "log.general.wotanii"));
		register(new Log(id++, "log.general.zenn"));
		register(new Log(id++, "log.general.zephyrcove"));

		register(new Log(id++, "log.protoss.legacy"));
		register(new Log(id++, "log.protoss.alliance"));
		register(new Log(id++, "log.protoss.warpgates"));
		register(new Log(id++, "log.protoss.asari"));
		register(new Log(id++, "log.protoss.overview"));
		register(new Log(id++, "log.protoss.rassidan"));
		register(new Log(id++, "log.protoss.tenarsis"));
		register(new Log(id++, "log.protoss.eldritchspring"));
		register(new Log(id++, "log.protoss.protossproverb"));
		register(new Log(id++, "log.protoss.gardenofaiur"));
		register(new Log(id++, "log.protoss.provinggrounds"));
		register(new Log(id++, "log.protoss.summerstorms"));
		register(new Log(id++, "log.protoss.templartraining"));
		register(new Log(id++, "log.protoss.elderlands"));

		register(new Log(id++, "log.terran.aarenruth"));
		register(new Log(id++, "log.terran.alanjohnson"));
		register(new Log(id++, "log.terran.baziothurgood"));
		register(new Log(id++, "log.terran.bianari"));
		register(new Log(id++, "log.terran.biggame"));
		register(new Log(id++, "log.terran.bunkercommandii"));
		register(new Log(id++, "log.terran.confederatecorpad"));
		register(new Log(id++, "log.terran.corporalmaxredius"));
		register(new Log(id++, "log.terran.edmundduke"));
		register(new Log(id++, "log.terran.enigma"));
		register(new Log(id++, "log.terran.francismccauly"));
		register(new Log(id++, "log.terran.frontier"));
		register(new Log(id++, "log.terran.gemini"));
		register(new Log(id++, "log.terran.gpssurveyreport"));
		register(new Log(id++, "log.terran.korhalscorching"));
		register(new Log(id++, "log.terran.marine219xms87632"));
		register(new Log(id++, "log.terran.matthewmurdoch"));
		register(new Log(id++, "log.terran.mcalester"));
		register(new Log(id++, "log.terran.newgauntlet"));
		register(new Log(id++, "log.terran.newstation"));
		register(new Log(id++, "log.terran.nidhoggiii"));
		register(new Log(id++, "log.terran.normangoodfellow"));
		register(new Log(id++, "log.terran.norrisbailey"));
		register(new Log(id++, "log.terran.northvssouth"));
		register(new Log(id++, "log.terran.novasquad"));
		register(new Log(id++, "log.terran.rebellions"));
		register(new Log(id++, "log.terran.remotemining"));
		register(new Log(id++, "log.terran.richardwalker"));
		register(new Log(id++, "log.terran.rileybullhorn"));
		register(new Log(id++, "log.terran.robertolamas"));
		register(new Log(id++, "log.terran.spacestations"));
		register(new Log(id++, "log.terran.summeriastation"));
		register(new Log(id++, "log.terran.terranorigin"));
		register(new Log(id++, "log.terran.uedchar"));
		register(new Log(id++, "log.terran.uedcommandantlog"));
		register(new Log(id++, "log.terran.uednamingcommittee"));
		register(new Log(id++, "log.terran.urangolenko"));
		register(new Log(id++, "log.terran.wildlifeservices"));

		register(new Log(id++, "log.zerg.overview"));
		register(new Log(id++, "log.zerg.eruption"));

		register(new Log(id++, "log.science.planets.aiur0"));
		register(new Log(id++, "log.science.planets.braxis0"));
		register(new Log(id++, "log.science.planets.char0"));
		register(new Log(id++, "log.science.planets.kaldir0"));
		register(new Log(id++, "log.science.planets.korhal0"));
		register(new Log(id++, "log.science.planets.marsara0"));
		register(new Log(id++, "log.science.planets.moria0"));
		register(new Log(id++, "log.science.planets.newfolsom0"));
		register(new Log(id++, "log.science.planets.phaeton0"));
		register(new Log(id++, "log.science.planets.shiloh0"));
		register(new Log(id++, "log.science.planets.tarsonis0"));
		register(new Log(id++, "log.science.planets.umoja0"));
		register(new Log(id++, "log.science.planets.xt39323"));

		register(new Log(id++, "log.science.protoss.archon0"));
		register(new Log(id++, "log.science.protoss.archon1"));
		register(new Log(id++, "log.science.protoss.archon2"));
		register(new Log(id++, "log.science.protoss.archon3"));
		register(new Log(id++, "log.science.protoss.adept0"));
		register(new Log(id++, "log.science.protoss.carrier0"));
		register(new Log(id++, "log.science.protoss.carrier1"));
		register(new Log(id++, "log.science.protoss.carrier2"));
		register(new Log(id++, "log.science.protoss.carrier3"));
		register(new Log(id++, "log.science.protoss.colossus0"));
		register(new Log(id++, "log.science.protoss.colossus1"));
		register(new Log(id++, "log.science.protoss.colossus2"));
		register(new Log(id++, "log.science.protoss.colossus3"));
		register(new Log(id++, "log.science.protoss.darktemplar0"));
		register(new Log(id++, "log.science.protoss.darktemplar1"));
		register(new Log(id++, "log.science.protoss.darktemplar2"));
		register(new Log(id++, "log.science.protoss.darktemplar3"));
		register(new Log(id++, "log.science.protoss.disruptor0"));
		register(new Log(id++, "log.science.protoss.hightemplar0"));
		register(new Log(id++, "log.science.protoss.hightemplar1"));
		register(new Log(id++, "log.science.protoss.hightemplar2"));
		register(new Log(id++, "log.science.protoss.hightemplar3"));
		register(new Log(id++, "log.science.protoss.immortal0"));
		register(new Log(id++, "log.science.protoss.immortal1"));
		register(new Log(id++, "log.science.protoss.immortal2"));
		register(new Log(id++, "log.science.protoss.immortal3"));
		register(new Log(id++, "log.science.protoss.mothership0"));
		register(new Log(id++, "log.science.protoss.mothership1"));
		register(new Log(id++, "log.science.protoss.mothership2"));
		register(new Log(id++, "log.science.protoss.mothership3"));
		register(new Log(id++, "log.science.protoss.mothershipcore0"));
		register(new Log(id++, "log.science.protoss.mothershipcore1"));
		register(new Log(id++, "log.science.protoss.mothershipcore2"));
		register(new Log(id++, "log.science.protoss.mothershipcore3"));
		register(new Log(id++, "log.science.protoss.mothershipcore4"));
		register(new Log(id++, "log.science.protoss.observer0"));
		register(new Log(id++, "log.science.protoss.observer1"));
		register(new Log(id++, "log.science.protoss.observer2"));
		register(new Log(id++, "log.science.protoss.observer3"));
		register(new Log(id++, "log.science.protoss.oracle0"));
		register(new Log(id++, "log.science.protoss.oracle1"));
		register(new Log(id++, "log.science.protoss.oracle2"));
		register(new Log(id++, "log.science.protoss.oracle3"));
		register(new Log(id++, "log.science.protoss.oracle4"));
		register(new Log(id++, "log.science.protoss.phoenix0"));
		register(new Log(id++, "log.science.protoss.phoenix1"));
		register(new Log(id++, "log.science.protoss.phoenix2"));
		register(new Log(id++, "log.science.protoss.phoenix3"));
		register(new Log(id++, "log.science.protoss.phoenix4"));
		register(new Log(id++, "log.science.protoss.probe0"));
		register(new Log(id++, "log.science.protoss.probe1"));
		register(new Log(id++, "log.science.protoss.probe2"));
		register(new Log(id++, "log.science.protoss.probe3"));
		register(new Log(id++, "log.science.protoss.sentry0"));
		register(new Log(id++, "log.science.protoss.sentry1"));
		register(new Log(id++, "log.science.protoss.sentry2"));
		register(new Log(id++, "log.science.protoss.sentry3"));
		register(new Log(id++, "log.science.protoss.sentry4"));
		register(new Log(id++, "log.science.protoss.stalker0"));
		register(new Log(id++, "log.science.protoss.stalker1"));
		register(new Log(id++, "log.science.protoss.stalker2"));
		register(new Log(id++, "log.science.protoss.stalker3"));
		register(new Log(id++, "log.science.protoss.tempest0"));
		register(new Log(id++, "log.science.protoss.tempest1"));
		register(new Log(id++, "log.science.protoss.tempest2"));
		register(new Log(id++, "log.science.protoss.tempest3"));
		register(new Log(id++, "log.science.protoss.voidray0"));
		register(new Log(id++, "log.science.protoss.voidray1"));
		register(new Log(id++, "log.science.protoss.voidray2"));
		register(new Log(id++, "log.science.protoss.voidray3"));
		register(new Log(id++, "log.science.protoss.voidray4"));
		register(new Log(id++, "log.science.protoss.warpprism0"));
		register(new Log(id++, "log.science.protoss.warpprism1"));
		register(new Log(id++, "log.science.protoss.warpprism2"));
		register(new Log(id++, "log.science.protoss.warpprism3"));
		register(new Log(id++, "log.science.protoss.zealot0"));
		register(new Log(id++, "log.science.protoss.zealot1"));
		register(new Log(id++, "log.science.protoss.zealot2"));
		register(new Log(id++, "log.science.protoss.zealot3"));
		register(new Log(id++, "log.science.protoss.zealot4"));
		register(new Log(id++, "log.science.protoss.zealot5"));

		register(new Log(id++, "log.science.terran.banshee0"));
		register(new Log(id++, "log.science.terran.banshee1"));
		register(new Log(id++, "log.science.terran.banshee2"));
		register(new Log(id++, "log.science.terran.banshee3"));
		register(new Log(id++, "log.science.terran.banshee4"));
		register(new Log(id++, "log.science.terran.battlecruiser0"));
		register(new Log(id++, "log.science.terran.battlecruiser1"));
		register(new Log(id++, "log.science.terran.battlecruiser2"));
		register(new Log(id++, "log.science.terran.battlecruiser3"));
		register(new Log(id++, "log.science.terran.battlecruiser4"));
		register(new Log(id++, "log.science.terran.battlecruiser5"));
		register(new Log(id++, "log.science.terran.cyclone0"));
		register(new Log(id++, "log.science.terran.ghost0"));
		register(new Log(id++, "log.science.terran.ghost1"));
		register(new Log(id++, "log.science.terran.ghost2"));
		register(new Log(id++, "log.science.terran.ghost3"));
		register(new Log(id++, "log.science.terran.ghost4"));
		register(new Log(id++, "log.science.terran.hellbat0"));
		register(new Log(id++, "log.science.terran.hellbat1"));
		register(new Log(id++, "log.science.terran.hellbat2"));
		register(new Log(id++, "log.science.terran.hellbat3"));
		register(new Log(id++, "log.science.terran.hellbat4"));
		register(new Log(id++, "log.science.terran.hellbat5"));
		register(new Log(id++, "log.science.terran.hellion0"));
		register(new Log(id++, "log.science.terran.hellion1"));
		register(new Log(id++, "log.science.terran.hellion2"));
		register(new Log(id++, "log.science.terran.hellion3"));
		register(new Log(id++, "log.science.terran.hellion4"));
		register(new Log(id++, "log.science.terran.hellion5"));
		register(new Log(id++, "log.science.terran.liberator0"));
		register(new Log(id++, "log.science.terran.marauder0"));
		register(new Log(id++, "log.science.terran.marauder1"));
		register(new Log(id++, "log.science.terran.marauder2"));
		register(new Log(id++, "log.science.terran.marauder3"));
		register(new Log(id++, "log.science.terran.marauder4"));
		register(new Log(id++, "log.science.terran.marine0"));
		register(new Log(id++, "log.science.terran.marine1"));
		register(new Log(id++, "log.science.terran.marine2"));
		register(new Log(id++, "log.science.terran.marine3"));
		register(new Log(id++, "log.science.terran.marine4"));
		register(new Log(id++, "log.science.terran.medivac0"));
		register(new Log(id++, "log.science.terran.medivac1"));
		register(new Log(id++, "log.science.terran.medivac2"));
		register(new Log(id++, "log.science.terran.medivac3"));
		register(new Log(id++, "log.science.terran.medivac4"));
		register(new Log(id++, "log.science.terran.raven0"));
		register(new Log(id++, "log.science.terran.raven1"));
		register(new Log(id++, "log.science.terran.raven2"));
		register(new Log(id++, "log.science.terran.raven3"));
		register(new Log(id++, "log.science.terran.raven4"));
		register(new Log(id++, "log.science.terran.reaper0"));
		register(new Log(id++, "log.science.terran.reaper1"));
		register(new Log(id++, "log.science.terran.reaper2"));
		register(new Log(id++, "log.science.terran.reaper3"));
		register(new Log(id++, "log.science.terran.reaper4"));
		register(new Log(id++, "log.science.terran.reaper5"));
		register(new Log(id++, "log.science.terran.scv0"));
		register(new Log(id++, "log.science.terran.scv1"));
		register(new Log(id++, "log.science.terran.scv2"));
		register(new Log(id++, "log.science.terran.scv3"));
		register(new Log(id++, "log.science.terran.scv4"));
		register(new Log(id++, "log.science.terran.scv5"));
		register(new Log(id++, "log.science.terran.siegetank0"));
		register(new Log(id++, "log.science.terran.siegetank1"));
		register(new Log(id++, "log.science.terran.siegetank2"));
		register(new Log(id++, "log.science.terran.siegetank3"));
		register(new Log(id++, "log.science.terran.siegetank4"));
		register(new Log(id++, "log.science.terran.thor0"));
		register(new Log(id++, "log.science.terran.thor1"));
		register(new Log(id++, "log.science.terran.thor2"));
		register(new Log(id++, "log.science.terran.thor3"));
		register(new Log(id++, "log.science.terran.thor4"));
		register(new Log(id++, "log.science.terran.viking0"));
		register(new Log(id++, "log.science.terran.viking1"));
		register(new Log(id++, "log.science.terran.viking2"));
		register(new Log(id++, "log.science.terran.viking3"));
		register(new Log(id++, "log.science.terran.viking4"));
		register(new Log(id++, "log.science.terran.viking5"));
		register(new Log(id++, "log.science.terran.widowmine0"));
		register(new Log(id++, "log.science.terran.widowmine1"));
		register(new Log(id++, "log.science.terran.widowmine2"));
		register(new Log(id++, "log.science.terran.widowmine3"));
		register(new Log(id++, "log.science.terran.widowmine4"));

		register(new Log(id++, "log.science.zerg.baneling0"));
		register(new Log(id++, "log.science.zerg.baneling1"));
		register(new Log(id++, "log.science.zerg.baneling2"));
		register(new Log(id++, "log.science.zerg.baneling3"));
		register(new Log(id++, "log.science.zerg.baneling4"));
		register(new Log(id++, "log.science.zerg.broodlord0"));
		register(new Log(id++, "log.science.zerg.broodlord1"));
		register(new Log(id++, "log.science.zerg.broodlord2"));
		register(new Log(id++, "log.science.zerg.broodlord3"));
		register(new Log(id++, "log.science.zerg.broodlord4"));
		register(new Log(id++, "log.science.zerg.corruptor0"));
		register(new Log(id++, "log.science.zerg.corruptor1"));
		register(new Log(id++, "log.science.zerg.corruptor2"));
		register(new Log(id++, "log.science.zerg.corruptor3"));
		register(new Log(id++, "log.science.zerg.corruptor4"));
		register(new Log(id++, "log.science.zerg.drone0"));
		register(new Log(id++, "log.science.zerg.drone1"));
		register(new Log(id++, "log.science.zerg.drone2"));
		register(new Log(id++, "log.science.zerg.drone3"));
		register(new Log(id++, "log.science.zerg.drone4"));
		register(new Log(id++, "log.science.zerg.hydralisk0"));
		register(new Log(id++, "log.science.zerg.hydralisk1"));
		register(new Log(id++, "log.science.zerg.hydralisk2"));
		register(new Log(id++, "log.science.zerg.hydralisk3"));
		register(new Log(id++, "log.science.zerg.hydralisk4"));
		register(new Log(id++, "log.science.zerg.infestor0"));
		register(new Log(id++, "log.science.zerg.infestor1"));
		register(new Log(id++, "log.science.zerg.infestor2"));
		register(new Log(id++, "log.science.zerg.infestor3"));
		register(new Log(id++, "log.science.zerg.infestor4"));
		register(new Log(id++, "log.science.zerg.infestor5"));
		register(new Log(id++, "log.science.zerg.larva0"));
		register(new Log(id++, "log.science.zerg.larva1"));
		register(new Log(id++, "log.science.zerg.larva2"));
		register(new Log(id++, "log.science.zerg.larva3"));
		register(new Log(id++, "log.science.zerg.larva4"));
		register(new Log(id++, "log.science.zerg.lurker0"));
		register(new Log(id++, "log.science.zerg.mutalisk0"));
		register(new Log(id++, "log.science.zerg.mutalisk1"));
		register(new Log(id++, "log.science.zerg.mutalisk2"));
		register(new Log(id++, "log.science.zerg.mutalisk3"));
		register(new Log(id++, "log.science.zerg.mutalisk4"));
		register(new Log(id++, "log.science.zerg.mutalisk5"));
		register(new Log(id++, "log.science.zerg.nydusworm0"));
		register(new Log(id++, "log.science.zerg.nydusworm1"));
		register(new Log(id++, "log.science.zerg.nydusworm2"));
		register(new Log(id++, "log.science.zerg.nydusworm3"));
		register(new Log(id++, "log.science.zerg.nydusworm4"));
		register(new Log(id++, "log.science.zerg.nydusworm5"));
		register(new Log(id++, "log.science.zerg.overlord0"));
		register(new Log(id++, "log.science.zerg.overlord1"));
		register(new Log(id++, "log.science.zerg.overlord2"));
		register(new Log(id++, "log.science.zerg.overlord3"));
		register(new Log(id++, "log.science.zerg.overlord4"));
		register(new Log(id++, "log.science.zerg.overlord5"));
		register(new Log(id++, "log.science.zerg.overseer0"));
		register(new Log(id++, "log.science.zerg.overseer1"));
		register(new Log(id++, "log.science.zerg.overseer2"));
		register(new Log(id++, "log.science.zerg.overseer3"));
		register(new Log(id++, "log.science.zerg.overseer4"));
		register(new Log(id++, "log.science.zerg.queen0"));
		register(new Log(id++, "log.science.zerg.queen1"));
		register(new Log(id++, "log.science.zerg.queen2"));
		register(new Log(id++, "log.science.zerg.queen3"));
		register(new Log(id++, "log.science.zerg.queen4"));
		register(new Log(id++, "log.science.zerg.ravager0"));
		register(new Log(id++, "log.science.zerg.roach0"));
		register(new Log(id++, "log.science.zerg.roach1"));
		register(new Log(id++, "log.science.zerg.roach2"));
		register(new Log(id++, "log.science.zerg.roach3"));
		register(new Log(id++, "log.science.zerg.roach4"));
		register(new Log(id++, "log.science.zerg.roach5"));
		register(new Log(id++, "log.science.zerg.swarmhost0"));
		register(new Log(id++, "log.science.zerg.swarmhost1"));
		register(new Log(id++, "log.science.zerg.swarmhost2"));
		register(new Log(id++, "log.science.zerg.swarmhost3"));
		register(new Log(id++, "log.science.zerg.swarmhost4"));
		register(new Log(id++, "log.science.zerg.ultralisk0"));
		register(new Log(id++, "log.science.zerg.ultralisk1"));
		register(new Log(id++, "log.science.zerg.ultralisk2"));
		register(new Log(id++, "log.science.zerg.ultralisk3"));
		register(new Log(id++, "log.science.zerg.ultralisk4"));
		register(new Log(id++, "log.science.zerg.ultralisk5"));
		register(new Log(id++, "log.science.zerg.viper0"));
		register(new Log(id++, "log.science.zerg.viper1"));
		register(new Log(id++, "log.science.zerg.viper2"));
		register(new Log(id++, "log.science.zerg.viper3"));
		register(new Log(id++, "log.science.zerg.viper4"));
		register(new Log(id++, "log.science.zerg.viper5"));
		register(new Log(id++, "log.science.zerg.zergling0"));
		register(new Log(id++, "log.science.zerg.zergling1"));
		register(new Log(id++, "log.science.zerg.zergling2"));
		register(new Log(id++, "log.science.zerg.zergling3"));
		register(new Log(id++, "log.science.zerg.zergling4"));
		register(new Log(id++, "log.science.zerg.zergling5"));
		register(new Log(id++, "log.science.zerg.zergling6"));
	}

	public void register(Log log) {
		if (!this.logs.containsKey(log.getId())) {
			this.logs.put(log.getId(), log);
		} else {
			throw new RuntimeException("You cannot register two logs with the same id!");
		}
	}

	public Log getRegisteredLog(int id) {
		return this.logs.get(id);
	}

	public String getRegistryName(Log log) {
		return log.getRegistryName();
	}

	public Map<Integer, Log> getLogs() {
		return new HashMap<Integer, Log>(logs);
	}
}