package com.ordana.ordanas_inferno.registry.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NyliumBlock;
import net.minecraft.block.RootsBlock;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class CinderRoots extends RootsBlock {
    protected CinderRoots(BlockState defaultState, Settings settings) {
        super(settings);
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.BLACK_SAND) || super.canPlantOnTop(floor, world, pos);
    }
}
