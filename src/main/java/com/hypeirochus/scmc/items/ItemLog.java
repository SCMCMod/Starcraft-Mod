package com.hypeirochus.scmc.items;

import com.hypeirochus.scmc.Starcraft;
import com.hypeirochus.scmc.creativetabs.StarcraftCreativeTabs;
import com.hypeirochus.scmc.handlers.ItemHandler;
import com.hypeirochus.scmc.items.override.LogOverride;
import com.hypeirochus.scmc.log.Log;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class ItemLog extends StarcraftItem {

	public ItemLog() {
		super("log");
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
				Log log = Starcraft.getLogRegistry().getRegisteredLog(nbt.getInteger("type"));
				if (log != null) {
					return log.getTitle();
				}
			}
		}
		return super.getItemStackDisplayName(stack);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		if (stack.hasTagCompound()) {
			NBTTagCompound nbt = stack.getTagCompound();
			if (nbt.hasKey("type")) {
				// player.openGui(Starcraft.instance, GuiHandler.LOG, world, Starcraft.getLogRegistry().getRegisteredLog(nbt.getInteger("type")).getId(), -1, -1);
			}
		}
		return super.onItemRightClick(world, player, hand);
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (isInCreativeTab(tab)) {
			for (int i : Starcraft.getLogRegistry().getLogs().keySet()) {
				items.add(getBook(Starcraft.getLogRegistry().getLogs().get(i)));
			}
		}
	}

	public static ItemStack getBook(Log log) {
		ItemStack stack = new ItemStack(ItemHandler.LOG, 1, 0);
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("type", log.getId());
		nbt.setInteger("skin", log.getSkinId());
		stack.setTagCompound(nbt);
		return stack;
	}

	// private String name;
	// private ResourceLocation text;
	// private int skinId;
	//
	// private EnumLogType(String name) {
	// this(name, new ResourceLocation(Library.RL_BASE +
	// "texts/logs/log.missing.txt"), 0);
	// }
	//
	// private EnumLogType(String name, ResourceLocation text) {
	// this(name, text, 0);
	// }
	//
	// private EnumLogType(String name, int skinId) {
	// this(name, new ResourceLocation(Library.RL_BASE +
	// "texts/logs/log.missing.txt"), skinId);
	// }
	//
	// private EnumLogType(String name, ResourceLocation text, int skinId) {
	// this.name = name;
	// this.text = text;
	// this.skinId = skinId;
	// }
	//
	// public String getName() {
	// return name;
	// }
	//
	// public List<String> getText() {
	// return Utils.loadTextFromFile(text);
	// }
	//
	// public int getSkinId() {
	// return skinId;
	// }
	//
	// public int getId() {
	// return this.ordinal();
	// }
	// }
}