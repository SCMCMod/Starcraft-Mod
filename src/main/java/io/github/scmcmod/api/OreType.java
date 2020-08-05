package io.github.scmcmod.api;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public enum OreType {
    COAL("coal", Blocks.COAL_ORE),
    IRON("iron", Blocks.IRON_ORE),
    GOLD("gold", Blocks.GOLD_ORE),
    REDSTONE("redstone", Blocks.REDSTONE_ORE),
    DIAMOND("diamond", Blocks.DIAMOND_ORE),
    LAPIS("lapis", Blocks.LAPIS_ORE),
    EMERALD("emerald", Blocks.EMERALD_ORE);

    private final String name;
    private final Block block;

    OreType(String name, Block block) {
        this.name = name;
        this.block = block;
    }

    public String getName() {
        return this.name;
    }

    public Block getBlock() {
        return this.block;
    }
}
