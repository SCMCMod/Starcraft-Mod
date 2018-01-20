package ga.scmc.items;

import java.util.List;

import ga.scmc.Starcraft;
import ga.scmc.api.Utils;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.GuiHandler;
import ga.scmc.handlers.ItemHandler;
import ga.scmc.lib.Library;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemLog extends Item {

	public ItemLog() {
		setRegistryName("log");
		setUnlocalizedName("log");
		setMaxStackSize(1);
		setCreativeTab(StarcraftCreativeTabs.BOOKS);
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
		stack.setTagCompound(nbt);
		return stack;
	}

	public enum EnumLogType {
		SPAWN("Spawn Log"), EGONLOGP1("Log 2133", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss1.txt")), EGONLOGP2("Log 2142", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss2.txt")), EGONLOGP3("Log 2204", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss3.txt")), EGONLOGP4("Log 2299", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss4.txt")), EGONLOGP5("Log 2318", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss5.txt")), EGONLOGP6("Log 2977", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.protoss6.txt")), EGONLOGZ1("Log 2103", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg1.txt")), EGONLOGZ2("Log 2139", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg2.txt")), EGONLOGZ3("Log 2247", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg3.txt")), EGONLOGZ4("Log 2297", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg4.txt")), EGONLOGZ5("Log 2354", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg5.txt")), EGONLOGZ6("Log 2384", new ResourceLocation(Library.RL_BASE + "texts/logs/log.egonstetmann.zerg6.txt"));

		private String name;
		private ResourceLocation text;

		private EnumLogType(String name) {
			this(name, new ResourceLocation(Library.RL_BASE + "texts/logs/log.missing.txt"));
		}

		private EnumLogType(String name, ResourceLocation text) {
			this.name = name;
			this.text = text;
		}

		public String getName() {
			return name;
		}

		public List<String> getText() {
			return Utils.loadTextFromFile(text);
		}

		public int getId() {
			return this.ordinal();
		}
	}
}