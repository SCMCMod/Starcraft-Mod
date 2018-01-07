package ga.scmc.items;

import ga.scmc.Starcraft;
import ga.scmc.creativetabs.StarcraftCreativeTabs;
import ga.scmc.handlers.GuiHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemLog extends Item {

	public ItemLog() {
		setRegistryName("log");
		setUnlocalizedName("log");
		setCreativeTab(StarcraftCreativeTabs.MISC);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
		player.openGui(Starcraft.instance, GuiHandler.LOG, world, EnumLogType.TEST.getId(), -1, -1);
		return super.onItemRightClick(itemStack, world, player, hand);
	}
	
	public enum EnumLogType {
		TEST(0);
		
		private int id;
		
		private EnumLogType(int id) {
			this.id = id;
		}
		
		public int getId() {
			return id;
		}
	}
}