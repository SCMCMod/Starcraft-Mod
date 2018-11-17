package com.arpaesis.scmc.quests;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Nullable;

import com.arpaesis.scmc.Starcraft;
import com.arpaesis.scmc.quests.unlocks.QuestReward;
import com.arpaesis.scmc.quests.unlocks.QuestRewardItem;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Create custom rewards when completing advancements
 * 
 * @author CJMinecraft
 */
@Mod.EventBusSubscriber
public class Quests
{

	private static final List<Quest> QUESTS = new LinkedList<>();

	public static final Quest TEST = register(null, "terran/get_flamethrower", new QuestRewardItem(new ItemStack(Items.DIAMOND, 64)));

	@SubscribeEvent
	public static void onAdvancementComplete(AdvancementEvent event)
	{
		for (Quest quest : QUESTS)
		{
			if (quest.getAdvancement().getId().equals(event.getAdvancement().getId()))
			{
				quest.triggerComplete(event.getEntityPlayer());
				break;
			}
		}
	}

	public static Quest register(@Nullable Quest parent, String id, QuestReward... rewards)
	{
		return register(new Quest(parent, FMLCommonHandler.instance().getMinecraftServerInstance().getAdvancementManager().getAdvancement(new ResourceLocation(Starcraft.MOD_ID, id)), rewards));
	}

	public static Quest register(Quest quest)
	{
		QUESTS.add(quest);
		return quest;
	}
}
