package io.github.scmcmod.quests.unlocks;

import io.github.scmcmod.capabilities.LockedItemsProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class QuestRewardItemUnlock extends QuestRewardItem
{

	@Override
	public void reward(EntityPlayer player)
	{
		for (ItemStack item : this.items)
			player.getCapability(LockedItemsProvider.LOCKED_ITEMS, null).unlockItem(item);
	}

}
