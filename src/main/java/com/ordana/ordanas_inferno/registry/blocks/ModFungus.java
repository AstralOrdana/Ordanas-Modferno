package com.ordana.ordanas_inferno.registry.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.HugeFungusFeatureConfig;

import java.util.Random;
import java.util.function.Supplier;

public class ModFungus extends PlantBlock implements Fertilizable {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 9.0D, 12.0D);
    private static final double GROW_CHANCE = 0.4D;
    private final Supplier<ConfiguredFeature<HugeFungusFeatureConfig, ?>> feature;

    protected ModFungus(Settings settings, Supplier<ConfiguredFeature<HugeFungusFeatureConfig, ?>> feature) {
        super(settings);
        this.feature = feature;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.NYLIUM) || floor.isOf(Blocks.MYCELIUM) || floor.isOf(Blocks.SOUL_SOIL) || super.canPlantOnTop(floor, world, pos);
    }

    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        Block block = ((HugeFungusFeatureConfig)((ConfiguredFeature)this.feature.get()).config).validBaseBlock.getBlock();
        BlockState blockState = world.getBlockState(pos.down());
        return blockState.isOf(block);
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return (double)random.nextFloat() < 0.4D;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        ((ConfiguredFeature)this.feature.get()).generate(world, world.getChunkManager().getChunkGenerator(), random, pos);
    }
}