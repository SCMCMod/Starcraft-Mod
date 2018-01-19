package ga.scmc.items;

import java.util.List;

import ga.scmc.Starcraft;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.GuiHandler;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
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
				return type.getName() + " " + super.getItemStackDisplayName(stack);
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
		TEST("Testing"), 
		SPAWN("Spawn"), 
		EGONLOGP1("Log 2133"),
		EGONLOGP2("Log 2142"),
		EGONLOGP3("Log 2204"),
		EGONLOGP4("Log 2299"),
		EGONLOGP5("Log 2318"),
		EGONLOGP6("Log 2977"),
		EGONLOGZ1("Log 2103"),
		EGONLOGZ2("Log 2139"),
		EGONLOGZ3("Log 2247"),
		EGONLOGZ4("Log 2297"),
		EGONLOGZ5("Log 2354"),
		EGONLOGZ6("Log 2384");

		private String name;

		private EnumLogType(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public int getId() {
			return this.ordinal();
		}
	}
}