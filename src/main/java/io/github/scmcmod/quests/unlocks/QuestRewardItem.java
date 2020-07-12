package io.github.scmcmod.quests.unlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class QuestRewardItem extends QuestReward
{

	protected ItemStack[] items;

	public QuestRewardItem(ItemStack... items)
	{
		this.items = items;
	}

	@Override
	public void reward(EntityPlayer player)
	{
		for (ItemStack stack : this.items)
		{
			player.inventory.addItemStackToInventory(stack);
		}
	}
}
