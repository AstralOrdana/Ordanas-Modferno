package com.ordana.ordanas_inferno.registry.blocks;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.Random;

public class ModNetherrack extends Block implements Fertilizable {
    public ModNetherrack(Settings settings) {
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
            } while(!world.getBlockState(blockPos).isIn(BlockTags.NYLIUM));

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
        boolean bl3 = false;
        boolean bl4 = false;
        Iterator var7 = BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1)).iterator();

        while(var7.hasNext()) {
            BlockPos blockPos = (BlockPos)var7.next();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(Blocks.CRIMSON_NYLIUM)) {
                bl = true;
            }

            if (blockState.isOf(Blocks.WARPED_NYLIUM)) {
                bl2 = true;
            }

            if (blockState.isOf(ModBlocks.UMBRA_NYLIUM)) {
                bl3 = true;
            }

            if (blockState.isOf(ModBlocks.VILE_NYLIUM)) {
                bl4 = true;
            }

            if (bl && bl2) {
            }
            if (bl && bl3) {
            }
            if (bl && bl4) {
            }
            if (bl2 && bl3) {
            }
            if (bl2 && bl4) {
            }
            if (bl3 && bl4) {
            }

            if (bl && bl2 && bl3) {
            }
            if (bl2 && bl3 && bl4) {
            }
            if (bl3 && bl4 && bl) {
            }
            if (bl4 && bl && bl2) {
            }

            if (bl && bl2 && bl3 && bl4) {
                break;
            }
        }

        if (bl && bl2) {
            world.setBlockState(pos, random.nextBoolean() ? Blocks.CRIMSON_NYLIUM.getDefaultState() : Blocks.WARPED_NYLIUM.getDefaultState(), 3);
        } else if (bl) {
            world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
        } else if (bl2) {
            world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 3);
        }

        if (bl && bl3) {
            world.setBlockState(pos, random.nextBoolean() ? Blocks.CRIMSON_NYLIUM.getDefaultState() : ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
        } else if (bl) {
            world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
        } else if (bl3) {
            world.setBlockState(pos, ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
        }

        if (bl && bl4) {
            world.setBlockState(pos, random.nextBoolean() ? Blocks.CRIMSON_NYLIUM.getDefaultState() : ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
        } else if (bl) {
            world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
        } else if (bl4) {
            world.setBlockState(pos, ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
        }

        if (bl2 && bl3) {
            world.setBlockState(pos, random.nextBoolean() ? Blocks.WARPED_NYLIUM.getDefaultState() : ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
        } else if (bl2) {
            world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 3);
        } else if (bl3) {
            world.setBlockState(pos, ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
        }

        if (bl2 && bl4) {
            world.setBlockState(pos, random.nextBoolean() ? Blocks.WARPED_NYLIUM.getDefaultState() : ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
        } else if (bl2) {
            world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 3);
        } else if (bl4) {
            world.setBlockState(pos, ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
        }

        if (bl3 && bl4) {
            world.setBlockState(pos, random.nextBoolean() ? ModBlocks.UMBRA_NYLIUM.getDefaultState() : ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
        } else if (bl3) {
            world.setBlockState(pos, ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
        } else if (bl4) {
            world.setBlockState(pos, ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
        }

        if (bl && bl2 && bl3) {
            switch (random.nextInt(3)) {
                case 1:
                    world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
                    break;
                case 2:
                    world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 3);
                    break;
                case 3:
                    world.setBlockState(pos, ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
            }
        }

        if (bl4 && bl2 && bl3) {
            switch (random.nextInt(3)) {
                case 1:
                    world.setBlockState(pos, ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
                    break;
                case 2:
                    world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 3);
                    break;
                case 3:
                    world.setBlockState(pos, ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
            }
        }

        if (bl && bl4 && bl3) {
            switch (random.nextInt(3)) {
                case 1:
                    world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
                    break;
                case 2:
                    world.setBlockState(pos, ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
                    break;
                case 3:
                    world.setBlockState(pos, ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
            }
        }

        if (bl4 && bl2 && bl) {
            switch (random.nextInt(3)) {
                case 1:
                    world.setBlockState(pos, ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
                    break;
                case 2:
                    world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 3);
                    break;
                case 3:
                    world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
            }
        }

        if (bl && bl2 && bl3 && bl4) {
            switch (random.nextInt(3)) {
                case 1:
                    world.setBlockState(pos, Blocks.CRIMSON_NYLIUM.getDefaultState(), 3);
                    break;
                case 2:
                    world.setBlockState(pos, Blocks.WARPED_NYLIUM.getDefaultState(), 3);
                    break;
                case 3:
                    world.setBlockState(pos, ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
                    break;
                case 4:
                    world.setBlockState(pos, ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
            }
        }
    }
}
