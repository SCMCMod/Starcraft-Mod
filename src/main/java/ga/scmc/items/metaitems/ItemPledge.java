package ga.scmc.items.metaitems;

import java.util.List;

import com.arisux.mdx.lib.world.entity.player.inventory.Inventories;

import ga.scmc.capabilities.ColorProvider;
import ga.scmc.capabilities.IColor;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem.PledgeType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemPledge extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemPledge() {
		setUnlocalizedName("pledge");
		setRegistryName("pledge");
		setHasSubtypes(true);
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < PledgeType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link PledgeType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < PledgeType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + PledgeType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + PledgeType.WHITE.getName();
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
		IColor color = playerIn.getCapability(ColorProvider.COLOR, null);
		color.set(itemStackIn.getItemDamage());
		String message = "Your team color is now " + color.getColor() + ".";
		playerIn.sendMessage(new TextComponentString(message));
		Inventories.consumeItem(playerIn, this);
		return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
	}
}