package ga.scmc.items;

import ga.scmc.Starcraft;
import ga.scmc.client.gui.GuiPlayerMessage.EnumPlayerMessageType;
import ga.scmc.handlers.GuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemTest extends Item {

	public ItemTest() {
		setUnlocalizedName("test.item");
		setRegistryName("test.item");
		setCreativeTab(null);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
		if (world.isRemote) {
			player.openGui(Starcraft.instance, GuiHandler.PLAYER_MESSAGE, world, EnumPlayerMessageType.CONFIRMATION.ordinal(), -1, -1);
		} else {
		}
		return super.onItemRightClick(itemStack, world, player, hand);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
}