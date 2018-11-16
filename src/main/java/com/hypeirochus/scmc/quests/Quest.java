package com.hypeirochus.scmc.quests;

import java.util.List;

import javax.annotation.Nullable;

import com.hypeirochus.scmc.quests.unlocks.QuestReward;

import net.minecraft.advancements.Advancement;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.actors.threadpool.Arrays;

public class Quest {

    private Quest parent;
    private boolean completed;
    private Advancement advancement;
    private List<QuestReward> rewards;

    public Quest(@Nullable Quest parent, Advancement advancement, QuestReward... rewards) {
        this.parent = parent;
        this.advancement = advancement;
        this.completed = false;
        this.rewards = Arrays.<QuestReward>asList(rewards);
    }

    public void triggerComplete(EntityPlayer player) {
        if (this.parent == null || this.parent.isComplete()) {
            for (QuestReward unlock : this.rewards) {
                unlock.reward(player);
            }
            this.completed = true;
        }
    }

    public boolean isComplete() {
        return this.completed;
    }

    public Advancement getAdvancement() {
        return this.advancement;
    }

    public List<QuestReward> getRewards() {
        return this.rewards;
    }

    @Nullable
    public Quest getParent() {
        return this.parent;
    }

    public enum QuestCategory {
        GENERAL(ItemStack.EMPTY), TERRAN(ItemStack.EMPTY); // TODO add more quest categories. TODO choose items to represent categories

        private ItemStack categoryItem;

        QuestCategory(ItemStack categoryItem) {
            this.categoryItem = categoryItem;
        }

        public ItemStack getCategoryItem() {
            return categoryItem;
        }
    }

}
