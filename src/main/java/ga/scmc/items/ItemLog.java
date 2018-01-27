package ga.scmc.items;

import java.util.List;

import ga.scmc.Starcraft;
import ga.scmc.api.Utils;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.GuiHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.items.override.LogOverride;
import ga.scmc.lib.Library;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class ItemLog extends Item {

	public static final int DEFAULT_SKIN = 0;
	public static final int TEST_SKIN = 1;
	
	public ItemLog() {
		setRegistryName("log");
		setUnlocalizedName("log");
		setMaxStackSize(1);
		setCreativeTab(StarcraftCreativeTabs.BOOKS);
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
			this.addPropertyOverride(new ResourceLocation("skin"), new LogOverride());
		}
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		if (stack.hasTagCompound()) {
			NBTTagCompound nbt = stack.getTagCompound();
			if (nbt.hasKey("type")) {
				EnumLogType type = EnumLogType.values()[nbt.getInteger("type")];
				return type.getName();
			}
		}
		return super.getItemStackDisplayName(stack);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
		if (stack.hasTagCompound()) {
			NBTTagCompound nbt = stack.getTagCompound();
			if (nbt.hasKey("type")) {
				player.openGui(Starcraft.instance, GuiHandler.LOG, world, EnumLogType.values()[nbt.getInteger("type")].getId(), -1, -1);
			}
		}
		return super.onItemRightClick(stack, world, player, hand);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> subItems) {
		for (int i = 0; i < EnumLogType.values().length; i++) {
			subItems.add(getBook(EnumLogType.values()[i]));
		}
	}

	public static ItemStack getBook(EnumLogType type) {
		ItemStack stack = new ItemStack(ItemHandler.LOG, 1, 0);
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("type", type.getId());
		nbt.setInteger("skin", type.getSkinId());
		stack.setTagCompound(nbt);
		return stack;
	}

	public enum EnumLogType {
		SPAWN(TextFormatting.BLUE + "Spawn Log", new ResourceLocation(Library.RL_BASE + "texts/logs/log.test.txt"), TEST_SKIN), 
		EGONLOGP1("Log 2133", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss1.txt")), 
		EGONLOGP2("Log 2142", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss2.txt")), 
		EGONLOGP3("Log 2204", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss3.txt")), 
		EGONLOGP4("Log 2299", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss4.txt")), 
		EGONLOGP5("Log 2318", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss5.txt")), 
		EGONLOGP6("Log 2977", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss6.txt")), 
		EGONLOGZ1("Log 2103", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg1.txt")), 
		EGONLOGZ2("Log 2139", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg2.txt")), 
		EGONLOGZ3("Log 2247", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg3.txt")), 
		EGONLOGZ4("Log 2297", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg4.txt")), 
		EGONLOGZ5("Log 2354", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg5.txt")),
		EGONLOGZ6("Log 2384", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg6.txt")),
		ACROPOLIS("Acropolis", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.acropolis.txt")),
		ARTOFWAR("Art Of War", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.artofwar.txt")),
		BACKWOODS("Backwoods", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.backwoods.txt")),
		BENGALAAS("Bengalaas", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.bengalaas.txt")),
		BROKENMESA("Broken Mesa", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.brokenmesa.txt")),
		CHARSURFACE("The Surface Of Char", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.charsurface.txt")),
		CHAUSARA("The Ghost Town", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.chausara.txt")),
		DRIFTINGPLATFORMS("Drifting Platforms", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.driftingplatforms.txt")),
		HEIMDALLIV("Heimdall IV", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.heimdalliv.txt")),
		POLARISPRIME("Polaris Prime", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.polarisprime.txt")),
		SCANTID("Scantids", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.scantid.txt")),
		SHAKURASTERRAIN("The Twilight Zone", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.shakurasterrain.txt")),
		UILELIV("Uilel IV", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.uileliv.txt")),
		UNTAMEDWILDS("Untamed Wilds", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.untamedwilds.txt")),
		WEATHERPATTERNS("Weather Patterns", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.weatherpatterns.txt")),
		WOTANII("Wotan II", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.wotanii.txt")),
		ZENN("Zenn", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.zenn.txt")),
		ZEPHYRCOVE("Zephyr Cove", new ResourceLocation(Library.RL_BASE + "texts/logs/log.general.zephyrcove.txt")),
		ALLIANCE("Unification", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.alliance.txt")),
		ASARI("Asari", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.asari.txt")),
		ELDERLANDS("Elder Lands", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.elderlands.txt")),
		ELDRITCHSPRING("Eldritch Spring", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.eldritchspring.txt")),
		GARDENOFAIUR("Garden Of Aiur", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.gardenofaiur.txt")),
		INVASIONOFAIUR("Invasion Of Aiur", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.invasionofaiur.txt")),
		LEGACY("A Legacy", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.legacy.txt")),
		PROTOSSOVERVIEW("Documentation: The Protoss", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.overview.txt")),
		PROVERB("The Legend Of The Crossroads", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.protossproverb.txt")),
		PROVINGROUNDS("The Proving Grounds", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.provinggrounds.txt")),
		RASSIDAN("The Destruction Of Aiur", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.rassidan.txt")),
		SUMMERSTORMS("The Summer Storms Of Aiur", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.summerstorms.txt")),
		TEMPLARTRAINING1("Templar Training", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.templartraining.txt")),
		TENARSIS("\"The Letters of Tenarsis\" Excerpt", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.tenarsis.txt")),
		WARPGATES("Ancient Warp Gates", new ResourceLocation(Library.RL_BASE + "texts/logs/log.protoss.warpgates.txt")),
		AARENRUTH("Data Entry 1027AM0440", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.aarenruth.txt")),
		ALANJOHNSON("Big Sky Inc. Advertisement", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.alanjohnson.txt")),
		BAZIOTHURGOOD("Protoss Warp Gate Technology", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.baziothurgood.txt")),
		BIANARI("Partial Transcript Of Bian Ari's Report", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.bianari.txt")),
		BIGGAME("The Hunt For Big Game Resources", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.biggame.txt")),
		BUNKERCOMMANDII("Bunker Command II", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.bunkercommandii.txt")),
		CONFEDERATECORPORATEAD("Join the Confederate Marine Corps!", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.confederatecorpad.txt")),
		CORPORALMAXREDIUS("Hell Frozen Over", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.corporalmaxredius.txt")),
		EDMUNDDUKE("Recruit Testing", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.edmundduke.txt")),
		ENIGMA("Strange Geometries Since 17th Century", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.enigma.txt")),
		FRANCISMCCAULY("Recruit Testing On Braxis", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.francismccauly.txt")),
		FRONTIER("The Terran Frontier", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.frontier.txt")),
		GEMINI("The Gemini Series", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.gemini.txt")),
		GPSSURVEYREPORT("Kel-Morian Combine GPS Survey Report", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.gpssurveyreport.txt")),
		KORHALSCORCHING("The Sorching Of Korhal", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.korhalscorching.txt")),
		MARINE219XMS8632("Diary Of Terran Marine 219XMS87632", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.marine219xms87632.txt")),
		MATTHEWMURDOCH("Urthos III", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.matthewmurdoch.txt")),
		MCALESTER("The Interstellar Escape", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.mcalester.txt")),
		NEWGAUNTLET("The New Guantlet", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.newguantlet.txt")),
		NEWSTATION("Catwalk Alley", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.newstation.txt")),
		NIDHOGGIII("Nidhogg III", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.nidhoggiii.txt")),
		NORMANGOODFELLOW("Detractor Complaints", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.normangoodfellow.txt")),
		NORRISBAILEY("Personal Entry Of First Mate Norris Bailey", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.norrisbailey.txt")),
		NORTHVSSOUTH("The North Vs South", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.northvssouth.txt")),
		NOVASQUAD("Nova Squadron", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.novasquad.txt")),
		REBELLIONS("The Colonial Liberation Army", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.rebellions.txt")),
		REMOTEMINING("Kel-Morian Combine Remote World Mining", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.remotemining.txt")),
		RICHARDWALKER("Nukes Away", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.richardwalker.txt")),
		RILEYBULLHORN("Orbital Platform Damage", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.rileybullhorn.txt")),
		ROBERTOLAMAS("Pirates And The Kel-Morian Combine", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.robertolamas.txt")),
		SPACESTATIONS("Abandoned Space Stations", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.spacestations.txt")),
		SUMMERIASTATION("Summeria Station", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.summerianstation.txt")),
		TERRANORIGIN("Excerpt From \"On The Origin Of Terran\"", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.terranorigin.txt")),
		UEDCHAR("The UED And Char", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.uedchar.txt")),
		UEDCOMMANDANTLOG("UED Military Academy Commandant's Log", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.uedcommandantlog.txt")),
		UEDMARINEBRIEFING("Debriefing of UED Marine 384DTA47631", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.uedmarinedebriefing.txt")),
		UEDNAMINGCOMMITTEE("Excerpt From UED Naming Committee", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.uednamincommittee.txt")),
		URANGOLENKO("Helioc III", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.urangolenko.txt")),
		WILDLIFESERVICES("Grand Opening Of The Creek", new ResourceLocation(Library.RL_BASE + "texts/logs/log.terran.wildlifeservices.txt")),
		ERUPTION("Zerg Presence On Char", new ResourceLocation(Library.RL_BASE + "texts/logs/log.zerg.eruption.txt")),
		ZERGOVERVIEW("Documentation: The Zerg", new ResourceLocation(Library.RL_BASE + "texts/logs/log.zerg.overview.txt")),
		ARCHON1("Archon: Archon Warp", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.archon1.txt")),
		ARCHON2("Archon: Physical Form", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.archon2.txt")),
		ARCHON3("Archon: Psionic Shockwave", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.archon3.txt")),
		CARRIER1("Carrier: Graviton Catapult", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.carrier1.txt")),
		CARRIER2("Carrier: Hardened Hull", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.carrier2.txt")),
		CARRIER3("Carrier: Interceptors", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.carrier3.txt")),
		COLOSSUS1("Colossus: Targeting System", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.colossus1.txt")),
		COLOSSUS2("Colossus: Thermal Lances", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.colossus2.txt")),
		COLOSSUS3("Colossus: Insectile Legs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.colossus3.txt")),
		DARKTEMPLAR1("Dark Templar: Void Energy", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.darktemplar1.txt")),
		DARKTEMPLAR2("Dark Templar: Stealth", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.darktemplar2.txt")),
		DARKTEMPLAR3("Dark Templar: Warp Blade", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.darktemplar3.txt")),
		HIGHTEMPLAR1("High Templar: Psionic Mastery", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.hightemplar1.txt")),
		HIGHTEMPLAR2("High Templar: Vestments", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.hightemplar2.txt")),
		HIGHTEMPLAR3("High Templar: Energy Manipulation", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.hightemplar3.txt")),
		IMMORTAL1("Immortal: Phase Disruptors", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.immortal1.txt")),
		IMMORTAL2("Immortal: Hardened Shields", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.immortal2.txt")),
		IMMORTAL3("Immortal: Life Support", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.immortal3.txt")),
		MOTHERSHIP1("Mothership: Purifier Beam", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.mothership1.txt")),
		MOTHERSHIP2("Mothership: Cloaking Field", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.mothership2.txt")),
		MOTHERSHIP3("Mothership: Hull", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.mothership3.txt")),
		MOTHERSHIPCORE1("Mothership Core: Repulsor Cannon", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.mothershipcore1.txt")),
		MOTHERSHIPCORE2("Mothership Core: Photon Overcharge", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.mothershipcore2.txt")),
		MOTHERSHIPCORE3("Mothership Core: Time Warp", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.mothershipcore3.txt")),
		MOTHERSHIPCORE4("Mothership Core: Mass Recall", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.mothershipcore4.txt")),
		OBSERVER1("Observer: Cloaking Field", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.observer1.txt")),
		OBSERVER2("Observer: Sensor Matrix", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.observer2.txt")),
		OBSERVER3("Observer: Thruster", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.observer3.txt")),
		ORACLE1("Oracle: Cloaking Field", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.oracle1.txt")),
		ORACLE2("Oracle: Warp Torrent", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.oracle2.txt")),
		ORACLE3("Oracle: Pulsar Beam", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.oracle3.txt")),
		ORACLE4("Oracle: Precognition", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.oracle4.txt")),
		PHOENIX1("Phoenix: Graviton Beam", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.phoenix1.txt")),
		PHOENIX2("Phoenix: Ion Cannons", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.phoenix2.txt")),
		PHOENIX3("Phoenix: Energy Weave", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.phoenix3.txt")),
		PHOENIX4("Phoenix: Inertial Drive", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.phoenix4.txt")),
		PROBE1("Probe: Warp Beacons", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.probe1.txt")),
		PROBE2("Probe: Outer Shell", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.probe2.txt")),
		PROBE3("Probe: Particle Beam", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.probe3.txt")),
		SENTRY1("Sentry: Holo-Projector", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.sentry1.txt")),
		SENTRY2("Sentry: Disruption Beam", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.sentry2.txt")),
		SENTRY3("Sentry: Force Field", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.sentry3.txt")),
		SENTRY4("Sentry: Guardian Shield", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.sentry4.txt")),
		STALKER1("Stalker: Void Displacer", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.stalker1.txt")),
		STALKER2("Stalker: Shadow Essence", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.stalker2.txt")),
		STALKER3("Stalker: Particle Disruptors", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.stalker3.txt")),
		TEMPEST1("Tempest: Ordnance", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.tempest1.txt")),
		TEMPEST2("Tempest: Cockpit", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.tempest2.txt")),
		TEMPEST3("Tempest: Propulsion System", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.tempest3.txt")),
		VOIDRAY1("Void Ray: Prismatic Core", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.voidray1.txt")),
		VOIDRAY2("Void Ray: Adaptive Plating", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.voidray2.txt")),
		VOIDRAY3("Void Ray: Prismatic Beam", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.voidray3.txt")),
		VOIDRAY4("Void Ray: Phase Crystals", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.voidray4.txt")),
		WARPPRISM1("Warp Prism: Phasing Mode", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.warpprism1.txt")),
		WARPPRISM2("Warp Prism: Hull", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.warpprism2.txt")),
		WARPPRISM3("Warp Prism: Robotic Mind", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.warpprism3.txt")),
		ZEALOT1("Zealot: Psi-Blade Focusers", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.zealot1.txt")),
		ZEALOT2("Zealot: Power Suit", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.zealot2.txt")),
		ZEALOT3("Zealot: Crystal Matrices", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.zealot3.txt")),
		ZEALOT4("Zealot: Leg Enhancements", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.zealot4.txt")),
		ZEALOT5("Zealot: Training", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.protoss.zealot5.txt")),
		BANELING1("Baneling: Leathery Carapace", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.baneling1.txt")),
		BANELING2("Baneling: Ambulatory Legs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.baneling2.txt")),
		BANELING3("Baneling: Sonar", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.baneling3.txt")),
		BANELING4("Baneling: Organ Mutation", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.baneling4.txt")),
		BROODLORD1("Brood Lord: Broodling Sacs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.broodlord1.txt")),
		BROODLORD2("Brood Lord: Barbed Tail", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.broodlord2.txt")),
		BROODLORD3("Brood Lord: Deadly Offspring", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.broodlord3.txt")),
		BROODLORD4("Brood Lord: Sensory Organs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.broodlord4.txt")),
		CORRUPTOR1("Corruptor: Tentacles", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.corruptor1.txt")),
		CORRUPTOR2("Corruptor: Neuronal Armor", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.corruptor2.txt")),
		CORRUPTOR3("Corruptor: Ink Sacs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.corruptor3.txt")),
		CORRUPTOR4("Corruptor: Statocyst", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.corruptor4.txt")),
		DRONE1("Drone: Pincers", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.drone1.txt")),
		DRONE2("Drone: Stabilizer Membrane", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.drone2.txt")),
		DRONE3("Drone: Nest DNA", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.drone3.txt")),
		DRONE4("Drone: Float Bladder", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.drone4.txt")),
		HYDRALISK1("Hydralisk: Serrated Mandibles", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.hydralisk1.txt")),
		HYDRALISK2("Hydralisk: Needle Spines", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.hydralisk2.txt")),
		HYDRALISK3("Hydralisk: Claws", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.hydralisk3.txt")),
		HYDRALISK4("Hydralisk: Hyperaccelerated Metabolism", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.hydralisk4.txt")),
		INFESTOR1("Infestor: Parasitic Stinger", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.infestor1.txt")),
		INFESTOR2("Infestor: Fungal Carapace", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.infestor2.txt")),
		INFESTOR3("Infestor: Fossorial Legs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.infestor3.txt")),
		INFESTOR4("Infestor: Storage Sacs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.infestor4.txt")),
		INFESTOR5("Infestor: Sensory Tentacles", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.infestor5.txt")),
		LARVA1("Larva: Segmented Body", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.larva1.txt")),
		LARVA2("Larva: Unyielding Shell", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.larva2.txt")),
		LARVA3("Larva: Shared DNA", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.larva3.txt")),
		LARVA4("Larva: Dermis", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.larva4.txt")),
		MUTALISK1("Mutalisk: Living Weaponry", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.mutalisk1.txt")),
		MUTALISK2("Mutalisk: Collapsible Structure", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.mutalisk2.txt")),
		MUTALISK3("Mutalisk: Wings", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.mutalisk3.txt")),
		MUTALISK4("Mutalisk: Musk", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.mutalisk4.txt")),
		MUTALISK5("Mutalisk: Chemosynthesis", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.mutalisk5.txt")),
		NYDUSWORM1("Nydus Worm: Crusher Fangs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.nydusworm1.txt")),
		NYDUSWORM2("Nydus Worm: Latching Spikes", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.nydusworm2.txt")),
		NYDUSWORM3("Nydus Worm: Chemical Receptors", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.nydusworm3.txt")),
		NYDUSWORM4("Nydus Worm: Tissue Replication", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.nydusworm4.txt")),
		NYDUSWORM5("Nydus Worm: Creep Glands", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.nydusworm5.txt")),
		OVERLORD1("Overlord: Legs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.overlord1.txt")),
		OVERLORD2("Overlord: Hermetic Carapace", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.overlord2.txt")),
		OVERLORD3("Overlord: Helium Synthesis", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.overlord3.txt")),
		OVERLORD4("Overlord: Adapatable Organs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.overlord4.txt")),
		OVERLORD5("Overlord: Central Nervous System", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.overlord5.txt")),
		OVERSEER1("Overseer: Multi-Spectrum Ocelli", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.overseer1.txt")),
		OVERSEER2("Overseer: Sensory Tendrils", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.overseer2.txt")),
		OVERSEER3("Overseer: DNA Splicing", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.overseer3.txt")),
		OVERSEER4("Overseer: Expanding Matter", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.overseer4.txt")),
		QUEEN1("Queen: Skating Legs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.queen1.txt")),
		QUEEN2("Queen: Mutated Ovipositor", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.queen2.txt")),
		QUEEN3("Queen: Mitotic Enzymes", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.queen3.txt")),
		QUEEN4("Queen: Brain Mass", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.queen4.txt")),
		ROACH1("Roach: Osmotic Epithelium", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.roach1.txt")),
		ROACH2("Roach: Armored Shell", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.roach2.txt")),
		ROACH3("Roach: High-Density Claws", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.roach3.txt")),
		ROACH4("Roach: Salivary Glands", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.roach4.txt")),
		ROACH5("Roach: Caustic Metabolism", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.roach5.txt")),
		SWARMHOST1("Swarm Host: Incubator", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.swarmhost1.txt")),
		SWARMHOST2("Swarm Host: Grinder Legs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.swarmhost2.txt")),
		SWARMHOST3("Swarm Host: Bone Stabilizers", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.swarmhost3.txt")),
		SWARMHOST4("Swarm Host: Blood Symbiotes", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.swarmhost4.txt")),
		ULTRALISK1("Ultralisk: Imperviousness", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.ultralisk1.txt")),
		ULTRALISK2("Ultralisk: Mono-Molecular Blades", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.ultralisk2.txt")),
		ULTRALISK3("Ultralisk: Organ Redundancy", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.ultralisk3.txt")),
		ULTRALISK4("Ultralisk: Sensorimotor Control", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.ultralisk4.txt")),
		ULTRALISK5("Ultralisk: Heightened Immune System", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.ultralisk5.txt")),
		VIPER1("Viper: Flexible Tail", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.viper1.txt")),
		VIPER2("Viper: Jagged Forelegs", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.viper2.txt")),
		VIPER3("Viper: Plagued Blood", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.viper3.txt")),
		VIPER4("Viper: Prehensile Proboscis", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.viper4.txt")),
		VIPER5("Viper: Tissue Absorption", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.viper5.txt")),
		ZERGLING1("Zergling: Spiked Tail", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.zerling1.txt")),
		ZERGLING2("Zergling: Toughened Skin", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.zerling2.txt")),
		ZERGLING3("Zergling: Low Light Vision", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.zerling3.txt")),
		ZERGLING4("Zergling: Basic DNA", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.zerling4.txt")),
		ZERGLING5("Zergling: Adrenal System", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.zerling5.txt")),
		ZERGLING6("Zergling: Nutrient Synthesis", new ResourceLocation(Library.RL_BASE + "texts/logs/log.science.zerg.zerling6.txt"))
		; 

		private String name;
		private ResourceLocation text;
		private int skinId;

		private EnumLogType(String name) {
			this(name, new ResourceLocation(Library.RL_BASE + "texts/logs/log.missing.txt"), 0);
		}

		private EnumLogType(String name, ResourceLocation text) {
			this(name, text, 0);
		}

		private EnumLogType(String name, int skinId) {
			this(name, new ResourceLocation(Library.RL_BASE + "texts/logs/log.missing.txt"), skinId);
		}

		private EnumLogType(String name, ResourceLocation text, int skinId) {
			this.name = name;
			this.text = text;
			this.skinId = skinId;
		}

		public String getName() {
			return name;
		}

		public List<String> getText() {
			return Utils.loadTextFromFile(text);
		}

		public int getSkinId() {
			return skinId;
		}

		public int getId() {
			return this.ordinal();
		}
	}
}