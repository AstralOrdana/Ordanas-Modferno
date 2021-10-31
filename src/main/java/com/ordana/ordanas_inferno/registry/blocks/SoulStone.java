package com.ordana.ordanas_inferno.registry.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.Random;

public class SoulStone extends Block implements Fertilizable {
    public SoulStone(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        if (!world.getBlockState(pos.up()).isTranslucent(world, pos)) {
            return false;
        } else {
            Iterator var5 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

            BlockPos blockPos;
            do {
                if (!var5.hasNext()) {
                    return false;
                }

                blockPos = (BlockPos)var5.next();
            } while(!world.getBlockState(blockPos).isOf(ModBlocks.SPECTRE_SCLEROTIUM));

            return true;
        }
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        boolean bl = false;
        boolean bl2 = false;
        Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

        while(var7.hasNext()) {
            BlockPos blockPos = (BlockPos)var7.next();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(ModBlocks.SPECTRE_SCLEROTIUM)) {
                bl2 = true;
            }

            if (blockState.isOf(ModBlocks.SPECTRE_SCLEROTIUM)) {
                bl = true;
            }

            if (bl2 && bl) {
                break;
            }
        }

        if (bl2 && bl) {
            world.setBlockState(pos, random.nextBoolean() ? ModBlocks.SPECTRE_SCLEROTIUM.getDefaultState() : ModBlocks.SPECTRE_SCLEROTIUM.getDefaultState(), 3);
        } else if (bl2) {
            world.setBlockState(pos, ModBlocks.SPECTRE_SCLEROTIUM.getDefaultState(), 3);
        } else if (bl) {
            world.setBlockState(pos, ModBlocks.SPECTRE_SCLEROTIUM.getDefaultState(), 3);
        }

    }
}
