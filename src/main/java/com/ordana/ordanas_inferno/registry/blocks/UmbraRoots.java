package com.ordana.ordanas_inferno.registry.blocks;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class UmbraRoots extends RootsBlock implements Fertilizable{
    protected UmbraRoots(BlockState defaultState, Settings settings) {
        super(settings);
    }

    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        TallPlantBlock tallPlantBlock = (TallPlantBlock)(state.isOf(ModBlocks.UMBRA_ROOTS) ? ModBlocks.TALL_UMBRA_ROOTS : ModBlocks.TALL_UMBRA_ROOTS);
        if (tallPlantBlock.getDefaultState().canPlaceAt(world, pos) && world.isAir(pos.up())) {
            TallPlantBlock.placeAt(world, tallPlantBlock.getDefaultState(), pos, 2);
        }

    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.NYLIUM) || floor.isOf(ModBlocks.UMBRA_NYLIUM) || super.canPlantOnTop(floor, world, pos);
    }
}
