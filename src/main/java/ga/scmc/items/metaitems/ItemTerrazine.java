package ga.scmc.items.metaitems;

import java.util.List;

import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.enums.EnumMetaItem;
import ga.scmc.enums.EnumMetaItem.TerrazineType;
import ga.scmc.handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * @author Ocelot5836
 */
public class ItemTerrazine extends Item {

	/**
	 * Default constructor just sets the unlocalized name and the registry name
	 */
	public ItemTerrazine() {
		setUnlocalizedName("terrazine");
		setRegistryName("terrazine");
		setHasSubtypes(true); // This just says the item has metadata
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}

	/**
	 * Adds all the different versions of the item
	 */
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> items) {
		for (int i = 0; i < TerrazineType.values().length; i++) {
			items.add(new ItemStack(item, 1, i));
		}
	}

	/**
	 * Gets the correct unlocalized name using the {@link TerrazineType} enum
	 */
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		for (int i = 0; i < TerrazineType.values().length; i++) {
			if (stack.getItemDamage() == i) {
				return getUnlocalizedName() + "." + TerrazineType.values()[i].getName();
			} else {
				continue;
			}
		}
		return getUnlocalizedName() + "." + TerrazineType.RAW.getName();
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer player,
			EnumHand hand) {
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 750));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 750));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 750));
		if(this.getMetadata(itemStackIn) == 1) {
			player.inventory.addItemStackToInventory(new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.PROTOSS.getID()));
		}else if(this.getMetadata(itemStackIn) == 2) {
			player.inventory.addItemStackToInventory(new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.TERRAN.getID()));
		}else if(this.getMetadata(itemStackIn) == 3) {
			player.inventory.addItemStackToInventory(new ItemStack(ItemHandler.GAS_CONTAINER, 1, EnumMetaItem.ContainerType.ZERG.getID()));
		}
		player.inventory.decrStackSize(player.inventory.getSlotFor(itemStackIn), 1);
		return super.onItemRightClick(itemStackIn, worldIn, player, hand);
	}
}