package ga.scmc.items;

import ga.scmc.Starcraft;
import ga.scmc.handlers.GuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import ocelot.api.utils.GuiUtils;

public class ItemTest extends Item {
	
	public ItemTest() {
		setUnlocalizedName("test.item");
		setRegistryName("test.item");
		setCreativeTab(null);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
		if (world.isRemote) {
			player.openGui(Starcraft.instance, GuiHandler.TEST_ID, world, (int) player.posX, (int) player.posY, (int) player.posZ);
		} else {
		}
		return super.onItemRightClick(itemStack, world, player, hand);
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
}