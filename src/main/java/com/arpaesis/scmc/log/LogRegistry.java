package com.arpaesis.scmc.log;

import java.util.HashMap;
import java.util.Map;

import com.arpaesis.scmc.Starcraft;
import com.arpaesis.scmc.handlers.AccessHandler;
import com.arpaesis.scmc.registry.ISCRegistry;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Handles all of the registry involved with the starcraft logs.
 * 
 * @author Ocelot5836
 */
public class LogRegistry implements ISCRegistry<Integer, Log>
{

	int id = 0;
	private Map<Integer, Log> logs;

	public LogRegistry()
	{
		logs = new HashMap<Integer, Log>();
	}

	@SideOnly(Side.CLIENT)
	public void init()
	{
		register("test");
		register("log.egonstetmann.protoss1");
		register("log.egonstetmann.protoss2");
		register("log.egonstetmann.protoss3");
		register("log.egonstetmann.protoss4");
		register("log.egonstetmann.protoss5");
		register("log.egonstetmann.protoss6");
		register("log.egonstetmann.zerg1");
		register("log.egonstetmann.zerg2");
		register("log.egonstetmann.zerg3");
		register("log.egonstetmann.zerg4");
		register("log.egonstetmann.zerg5");
		register("log.egonstetmann.zerg6");

		register("log.general.acropolis");
		register("log.general.artofwar");
		register("log.general.backwoods");
		register("log.general.bengalaas");
		register("log.general.brokenmesa");
		register("log.general.charsurface");
		register("log.general.chausara");
		register("log.general.driftingplatforms");
		register("log.general.heimdalliv");
		register("log.general.polarisprime");
		register("log.general.scantid");
		register("log.general.shakurasterrain");
		register("log.general.uileliv");
		register("log.general.untamedwilds");
		register("log.general.weatherpatterns");
		register("log.general.wotanii");
		register("log.general.zenn");
		register("log.general.zephyrcove");

		register("log.protoss.legacy");
		register("log.protoss.alliance");
		register("log.protoss.warpgates");
		register("log.protoss.asari");
		register("log.protoss.overview");
		register("log.protoss.rassidan");
		register("log.protoss.tenarsis");
		register("log.protoss.eldritchspring");
		register("log.protoss.protossproverb");
		register("log.protoss.gardenofaiur");
		register("log.protoss.provinggrounds");
		register("log.protoss.summerstorms");
		register("log.protoss.templartraining");
		register("log.protoss.elderlands");

		register("log.terran.aarenruth");
		register("log.terran.alanjohnson");
		register("log.terran.baziothurgood");
		register("log.terran.bianari");
		register("log.terran.biggame");
		register("log.terran.bunkercommandii");
		register("log.terran.confederatecorpad");
		register("log.terran.corporalmaxredius");
		register("log.terran.edmundduke");
		register("log.terran.enigma");
		register("log.terran.francismccauly");
		register("log.terran.frontier");
		register("log.terran.gemini");
		register("log.terran.gpssurveyreport");
		register("log.terran.korhalscorching");
		register("log.terran.marine219xms87632");
		register("log.terran.matthewmurdoch");
		register("log.terran.mcalester");
		register("log.terran.newgauntlet");
		register("log.terran.newstation");
		register("log.terran.nidhoggiii");
		register("log.terran.normangoodfellow");
		register("log.terran.norrisbailey");
		register("log.terran.northvssouth");
		register("log.terran.novasquad");
		register("log.terran.rebellions");
		register("log.terran.remotemining");
		register("log.terran.richardwalker");
		register("log.terran.rileybullhorn");
		register("log.terran.robertolamas");
		register("log.terran.spacestations");
		register("log.terran.summeriastation");
		register("log.terran.terranorigin");
		register("log.terran.uedchar");
		register("log.terran.uedcommandantlog");
		register("log.terran.uednamingcommittee");
		register("log.terran.urangolenko");
		register("log.terran.wildlifeservices");

		register("log.zerg.overview");
		register("log.zerg.eruption");

		register("log.science.planets.aiur0");
		register("log.science.planets.braxis0");
		register("log.science.planets.char0");
		register("log.science.planets.kaldir0");
		register("log.science.planets.korhal0");
		register("log.science.planets.marsara0");
		register("log.science.planets.moria0");
		register("log.science.planets.newfolsom0");
		register("log.science.planets.phaeton0");
		register("log.science.planets.shiloh0");
		register("log.science.planets.tarsonis0");
		register("log.science.planets.umoja0");
		register("log.science.planets.xt39323");

		register("log.science.protoss.archon0");
		register("log.science.protoss.archon1");
		register("log.science.protoss.archon2");
		register("log.science.protoss.archon3");
		register("log.science.protoss.adept0");
		register("log.science.protoss.carrier0");
		register("log.science.protoss.carrier1");
		register("log.science.protoss.carrier2");
		register("log.science.protoss.carrier3");
		register("log.science.protoss.colossus0");
		register("log.science.protoss.colossus1");
		register("log.science.protoss.colossus2");
		register("log.science.protoss.colossus3");
		register("log.science.protoss.darktemplar0");
		register("log.science.protoss.darktemplar1");
		register("log.science.protoss.darktemplar2");
		register("log.science.protoss.darktemplar3");
		register("log.science.protoss.disruptor0");
		register("log.science.protoss.hightemplar0");
		register("log.science.protoss.hightemplar1");
		register("log.science.protoss.hightemplar2");
		register("log.science.protoss.hightemplar3");
		register("log.science.protoss.immortal0");
		register("log.science.protoss.immortal1");
		register("log.science.protoss.immortal2");
		register("log.science.protoss.immortal3");
		register("log.science.protoss.mothership0");
		register("log.science.protoss.mothership1");
		register("log.science.protoss.mothership2");
		register("log.science.protoss.mothership3");
		register("log.science.protoss.mothershipcore0");
		register("log.science.protoss.mothershipcore1");
		register("log.science.protoss.mothershipcore2");
		register("log.science.protoss.mothershipcore3");
		register("log.science.protoss.mothershipcore4");
		register("log.science.protoss.observer0");
		register("log.science.protoss.observer1");
		register("log.science.protoss.observer2");
		register("log.science.protoss.observer3");
		register("log.science.protoss.oracle0");
		register("log.science.protoss.oracle1");
		register("log.science.protoss.oracle2");
		register("log.science.protoss.oracle3");
		register("log.science.protoss.oracle4");
		register("log.science.protoss.phoenix0");
		register("log.science.protoss.phoenix1");
		register("log.science.protoss.phoenix2");
		register("log.science.protoss.phoenix3");
		register("log.science.protoss.phoenix4");
		register("log.science.protoss.probe0");
		register("log.science.protoss.probe1");
		register("log.science.protoss.probe2");
		register("log.science.protoss.probe3");
		register("log.science.protoss.sentry0");
		register("log.science.protoss.sentry1");
		register("log.science.protoss.sentry2");
		register("log.science.protoss.sentry3");
		register("log.science.protoss.sentry4");
		register("log.science.protoss.stalker0");
		register("log.science.protoss.stalker1");
		register("log.science.protoss.stalker2");
		register("log.science.protoss.stalker3");
		register("log.science.protoss.tempest0");
		register("log.science.protoss.tempest1");
		register("log.science.protoss.tempest2");
		register("log.science.protoss.tempest3");
		register("log.science.protoss.voidray0");
		register("log.science.protoss.voidray1");
		register("log.science.protoss.voidray2");
		register("log.science.protoss.voidray3");
		register("log.science.protoss.voidray4");
		register("log.science.protoss.warpprism0");
		register("log.science.protoss.warpprism1");
		register("log.science.protoss.warpprism2");
		register("log.science.protoss.warpprism3");
		register("log.science.protoss.zealot0");
		register("log.science.protoss.zealot1");
		register("log.science.protoss.zealot2");
		register("log.science.protoss.zealot3");
		register("log.science.protoss.zealot4");
		register("log.science.protoss.zealot5");

		register("log.science.terran.banshee0");
		register("log.science.terran.banshee1");
		register("log.science.terran.banshee2");
		register("log.science.terran.banshee3");
		register("log.science.terran.banshee4");
		register("log.science.terran.battlecruiser0");
		register("log.science.terran.battlecruiser1");
		register("log.science.terran.battlecruiser2");
		register("log.science.terran.battlecruiser3");
		register("log.science.terran.battlecruiser4");
		register("log.science.terran.battlecruiser5");
		register("log.science.terran.cyclone0");
		register("log.science.terran.ghost0");
		register("log.science.terran.ghost1");
		register("log.science.terran.ghost2");
		register("log.science.terran.ghost3");
		register("log.science.terran.ghost4");
		register("log.science.terran.hellbat0");
		register("log.science.terran.hellbat1");
		register("log.science.terran.hellbat2");
		register("log.science.terran.hellbat3");
		register("log.science.terran.hellbat4");
		register("log.science.terran.hellbat5");
		register("log.science.terran.hellion0");
		register("log.science.terran.hellion1");
		register("log.science.terran.hellion2");
		register("log.science.terran.hellion3");
		register("log.science.terran.hellion4");
		register("log.science.terran.hellion5");
		register("log.science.terran.liberator0");
		register("log.science.terran.marauder0");
		register("log.science.terran.marauder1");
		register("log.science.terran.marauder2");
		register("log.science.terran.marauder3");
		register("log.science.terran.marauder4");
		register("log.science.terran.marine0");
		register("log.science.terran.marine1");
		register("log.science.terran.marine2");
		register("log.science.terran.marine3");
		register("log.science.terran.marine4");
		register("log.science.terran.medivac0");
		register("log.science.terran.medivac1");
		register("log.science.terran.medivac2");
		register("log.science.terran.medivac3");
		register("log.science.terran.medivac4");
		register("log.science.terran.raven0");
		register("log.science.terran.raven1");
		register("log.science.terran.raven2");
		register("log.science.terran.raven3");
		register("log.science.terran.raven4");
		register("log.science.terran.reaper0");
		register("log.science.terran.reaper1");
		register("log.science.terran.reaper2");
		register("log.science.terran.reaper3");
		register("log.science.terran.reaper4");
		register("log.science.terran.reaper5");
		register("log.science.terran.scv0");
		register("log.science.terran.scv1");
		register("log.science.terran.scv2");
		register("log.science.terran.scv3");
		register("log.science.terran.scv4");
		register("log.science.terran.scv5");
		register("log.science.terran.siegetank0");
		register("log.science.terran.siegetank1");
		register("log.science.terran.siegetank2");
		register("log.science.terran.siegetank3");
		register("log.science.terran.siegetank4");
		register("log.science.terran.thor0");
		register("log.science.terran.thor1");
		register("log.science.terran.thor2");
		register("log.science.terran.thor3");
		register("log.science.terran.thor4");
		register("log.science.terran.viking0");
		register("log.science.terran.viking1");
		register("log.science.terran.viking2");
		register("log.science.terran.viking3");
		register("log.science.terran.viking4");
		register("log.science.terran.viking5");
		register("log.science.terran.widowmine0");
		register("log.science.terran.widowmine1");
		register("log.science.terran.widowmine2");
		register("log.science.terran.widowmine3");
		register("log.science.terran.widowmine4");

		register("log.science.zerg.baneling0");
		register("log.science.zerg.baneling1");
		register("log.science.zerg.baneling2");
		register("log.science.zerg.baneling3");
		register("log.science.zerg.baneling4");
		register("log.science.zerg.broodlord0");
		register("log.science.zerg.broodlord1");
		register("log.science.zerg.broodlord2");
		register("log.science.zerg.broodlord3");
		register("log.science.zerg.broodlord4");
		register("log.science.zerg.corruptor0");
		register("log.science.zerg.corruptor1");
		register("log.science.zerg.corruptor2");
		register("log.science.zerg.corruptor3");
		register("log.science.zerg.corruptor4");
		register("log.science.zerg.drone0");
		register("log.science.zerg.drone1");
		register("log.science.zerg.drone2");
		register("log.science.zerg.drone3");
		register("log.science.zerg.drone4");
		register("log.science.zerg.hydralisk0");
		register("log.science.zerg.hydralisk1");
		register("log.science.zerg.hydralisk2");
		register("log.science.zerg.hydralisk3");
		register("log.science.zerg.hydralisk4");
		register("log.science.zerg.infestor0");
		register("log.science.zerg.infestor1");
		register("log.science.zerg.infestor2");
		register("log.science.zerg.infestor3");
		register("log.science.zerg.infestor4");
		register("log.science.zerg.infestor5");
		register("log.science.zerg.larva0");
		register("log.science.zerg.larva1");
		register("log.science.zerg.larva2");
		register("log.science.zerg.larva3");
		register("log.science.zerg.larva4");
		register("log.science.zerg.lurker0");
		register("log.science.zerg.mutalisk0");
		register("log.science.zerg.mutalisk1");
		register("log.science.zerg.mutalisk2");
		register("log.science.zerg.mutalisk3");
		register("log.science.zerg.mutalisk4");
		register("log.science.zerg.mutalisk5");
		register("log.science.zerg.nydusworm0");
		register("log.science.zerg.nydusworm1");
		register("log.science.zerg.nydusworm2");
		register("log.science.zerg.nydusworm3");
		register("log.science.zerg.nydusworm4");
		register("log.science.zerg.nydusworm5");
		register("log.science.zerg.overlord0");
		register("log.science.zerg.overlord1");
		register("log.science.zerg.overlord2");
		register("log.science.zerg.overlord3");
		register("log.science.zerg.overlord4");
		register("log.science.zerg.overlord5");
		register("log.science.zerg.overseer0");
		register("log.science.zerg.overseer1");
		register("log.science.zerg.overseer2");
		register("log.science.zerg.overseer3");
		register("log.science.zerg.overseer4");
		register("log.science.zerg.queen0");
		register("log.science.zerg.queen1");
		register("log.science.zerg.queen2");
		register("log.science.zerg.queen3");
		register("log.science.zerg.queen4");
		register("log.science.zerg.ravager0");
		register("log.science.zerg.roach0");
		register("log.science.zerg.roach1");
		register("log.science.zerg.roach2");
		register("log.science.zerg.roach3");
		register("log.science.zerg.roach4");
		register("log.science.zerg.roach5");
		register("log.science.zerg.swarmhost0");
		register("log.science.zerg.swarmhost1");
		register("log.science.zerg.swarmhost2");
		register("log.science.zerg.swarmhost3");
		register("log.science.zerg.swarmhost4");
		register("log.science.zerg.ultralisk0");
		register("log.science.zerg.ultralisk1");
		register("log.science.zerg.ultralisk2");
		register("log.science.zerg.ultralisk3");
		register("log.science.zerg.ultralisk4");
		register("log.science.zerg.ultralisk5");
		register("log.science.zerg.viper0");
		register("log.science.zerg.viper1");
		register("log.science.zerg.viper2");
		register("log.science.zerg.viper3");
		register("log.science.zerg.viper4");
		register("log.science.zerg.viper5");
		register("log.science.zerg.zergling0");
		register("log.science.zerg.zergling1");
		register("log.science.zerg.zergling2");
		register("log.science.zerg.zergling3");
		register("log.science.zerg.zergling4");
		register("log.science.zerg.zergling5");
		register("log.science.zerg.zergling6");

		if (AccessHandler.isDeobfuscatedEnvironment())
		{
			Starcraft.logger().info("Logs Registered");
		}
	}

	private void register(String log)
	{
		this.register(id++, new Log(log));
	}

	@Override
	public void register(Integer id, Log log)
	{
		if (!this.logs.containsKey(id))
		{
			this.logs.put(id, log);
			log.setId(id);
		} else
		{
			throw new RuntimeException("Log \'" + log.getFileName() + "\' attempted to override existing log with id \'" + id + "\'");
		}
	}

	@Override
	public Log get(Integer id)
	{
		return this.logs.get(id);
	}

	public String getRegistryName(Log log)
	{
		return log.getRegistryName();
	}

	public Map<Integer, Log> getLogs()
	{
		return new HashMap<Integer, Log>(logs);
	}
}