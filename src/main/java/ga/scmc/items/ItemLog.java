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
		SPAWN(TextFormatting.BLUE + "Spawn Log", new ResourceLocation(Library.RL_BASE + "texts/logs/log.test.txt"), 1), 
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
		ZERGOVERVIEW("Documentation: The Zerg", new ResourceLocation(Library.RL_BASE + "texts/logs/log.zerg.overview.txt"))
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