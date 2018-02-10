package ga.scmc.container.slot;

import javax.annotation.Nullable;

import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * A slot which handles the furnace's output
 *
 * @author CJMinecraft
 */
public class SlotStarcraftFurnaceOutput extends SlotItemHandler {

	private final EntityPlayer	player;
	private int					removeCount;

	public SlotStarcraftFurnaceOutput(EntityPlayer player, IItemHandler inv, int slotIndex, int xPosition, int yPosition) {
		super(inv, slotIndex, xPosition, yPosition);
		this.player = player;
	}

	public boolean isItemValid(@Nullable ItemStack stack) {
		return false;
	}

	public ItemStack decrStackSize(int amount) {
		if (this.getHasStack()) {
			this.removeCount += Math.min(amount, this.getStack().stackSize);
		}

		return super.decrStackSize(amount);
	}

	public void onPickupFromSlot(EntityPlayer playerIn, ItemStack stack) {
		this.onCrafting(stack);
		super.onPickupFromSlot(playerIn, stack);
	}

	protected void onCrafting(ItemStack stack, int amount) {
		this.removeCount += amount;
		this.onCrafting(stack);
	}

	protected void onCrafting(ItemStack stack) {
		stack.onCrafting(this.player.world, this.player, this.removeCount);
		if (!this.player.world.isRemote) {
			int i = this.removeCount;
			float f = FurnaceRecipes.instance().getSmeltingExperience(stack);
			int j;
			if (f == 0.0F) {
				i = 0;
			} else if (f < 1.0F) {
				j = MathHelper.floor((float) i * f);
				if (j < MathHelper.ceil((float) i * f) && Math.random() < (double) ((float) i * f - (float) j)) {
					++j;
				}

				i = j;
			}

			while (i > 0) {
				j = EntityXPOrb.getXPSplit(i);
				i -= j;
				this.player.world.spawnEntity(new EntityXPOrb(this.player.world, this.player.posX, this.player.posY + 0.5D, this.player.posZ + 0.5D, j));
			}
		}

		this.removeCount = 0;
		FMLCommonHandler.instance().firePlayerSmeltedEvent(this.player, stack);
		if (stack.getItem() == Items.IRON_INGOT) {
			this.player.addStat(AchievementList.ACQUIRE_IRON);
		}

		if (stack.getItem() == Items.COOKED_FISH) {
			this.player.addStat(AchievementList.COOK_FISH);
		}

	}

}
