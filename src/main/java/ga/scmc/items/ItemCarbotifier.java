package ga.scmc.items;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import ocelot.api.utils.GuiUtils;

public class ItemCarbotifier extends Item {

	
	// Evrey 09cccfe400064879b3a99e2209dfab6e
	// Ocelot 86dc8a9f238e450280211d488095fd8a
	// Hype dc544f46721645cfa7b0aa65fec17f38
	// Cyber 403f2fd4f8a24608a0b8534da4184735
	public static final String USABLE_USER = GuiUtils.getPlayerName("09cccfe400064879b3a99e2209dfab6e");
	public static final String[] DEVS = new String[] { GuiUtils.getPlayerName("86dc8a9f238e450280211d488095fd8a"), GuiUtils.getPlayerName("dc544f46721645cfa7b0aa65fec17f38"), GuiUtils.getPlayerName("403f2fd4f8a24608a0b8534da4184735") };

	public ItemCarbotifier() {
		setRegistryName("carbotifier");
		setUnlocalizedName("carbotifier");
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return TextFormatting.YELLOW + super.getItemStackDisplayName(stack);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
		if (!world.isRemote) {
			if (isPlayerValid(player)) {
				player.sendStatusMessage(new TextComponentString("Username is valid"));
			} else {
				player.sendStatusMessage(new TextComponentString("You can't use this item"));
			}
		}
		setCreativeTab(StarcraftCreativeTabs.MISC);
		return super.onItemRightClick(itemStack, world, player, hand);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		tooltip.add("§dWinner: §5§o" + USABLE_USER);
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> subItems) {
		super.getSubItems(item, tab, subItems);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	public static boolean isPlayerValid(EntityPlayer player) {
		if (player.getName().equals(USABLE_USER))
			return true;
		for (int i = 0; i < DEVS.length; i++) {
			if (player.getName().equals(DEVS[i])) {
				return true;
			}
		}
		
		if(player.getGameProfile().getId().toString() == "86dc8a9f238e450280211d488095fd8a") {
			
		}

		return false;
	}
}