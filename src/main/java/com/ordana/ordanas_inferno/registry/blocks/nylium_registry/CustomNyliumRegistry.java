package com.ordana.ordanas_inferno.registry.blocks.nylium_registry;

import com.ordana.ordanas_inferno.registry.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.HashSet;
import java.util.Set;

final public class CustomNyliumRegistry {

    public static final Set<Block> NYLIUM_BLOCKS = new HashSet<>(){{
        add(Blocks.CRIMSON_NYLIUM);
        add(Blocks.WARPED_NYLIUM);
    }};


    private static void registerNylium(Block block) {
        NYLIUM_BLOCKS.add(block);
    }

    public static void initNylium(){}


    static {
        registerNylium(ModBlocks.VILE_NYLIUM);
        registerNylium(ModBlocks.UMBRA_NYLIUM);
    }
}
