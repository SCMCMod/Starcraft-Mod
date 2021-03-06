package io.github.scmcmod.items;

import java.util.List;
import java.util.UUID;

import io.github.scmcmod.creativetabs.SCCreativeTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemCarbotifier extends Item {

	// Evrey 09cccfe400064879b3a99e2209dfab6e
	// Ocelot 86dc8a9f238e450280211d488095fd8a
	// Hype dc544f46721645cfa7b0aa65fec17f38
	// Cyber 403f2fd4f8a24608a0b8534da4184735
	// TODO: Was this ever finished, ocelot? yes, we just never added the entities
	public static final UUID USABLE_USER = UUID.fromString("09cccfe400064879b3a99e2209dfab6e");
	public static final UUID[] DEVS = { UUID.fromString("86dc8a9f238e450280211d488095fd8a"),
			UUID.fromString("dc544f46721645cfa7b0aa65fec17f38"), UUID.fromString("403f2fd4f8a24608a0b8534da4184735") };

	public ItemCarbotifier() {
		setRegistryName("carbotifier");
		setTranslationKey("carbotifier");
		setCreativeTab(SCCreativeTabs.MISC);
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return TextFormatting.YELLOW + super.getItemStackDisplayName(stack);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if (!world.isRemote) {
			if (isPlayerValid(player)) {
				player.sendStatusMessage(new TextComponentString("Username is valid"), true);
			} else {
				player.sendStatusMessage(new TextComponentString("You can't use this item"), true);
			}
		}
		setCreativeTab(SCCreativeTabs.MISC);
		return super.onItemRightClick(world, player, hand);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("�dWinner: �5�o" + USABLE_USER);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	public static boolean isPlayerValid(EntityPlayer player) {
		if (player.getUniqueID().equals(USABLE_USER))
			return true;
		for (int i = 0; i < DEVS.length; i++) {
			if (player.getUniqueID().equals(DEVS[i])) {
				return true;
			}
		}

		return false;
	}
}