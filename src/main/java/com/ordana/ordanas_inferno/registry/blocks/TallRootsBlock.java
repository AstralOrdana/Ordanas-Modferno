package com.ordana.ordanas_inferno.registry.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TallRootsBlock extends TallPlantBlock {
    public TallRootsBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.NYLIUM) || floor.isOf(ModBlocks.UMBRA_NYLIUM) || super.canPlantOnTop(floor, world, pos);
    }
}
