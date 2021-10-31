package com.ordana.ordanas_inferno.mixin;

import com.ordana.ordanas_inferno.registry.blocks.nylium_registry.CustomNyliumRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherrackBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

@Mixin(NetherrackBlock.class)
public class NetherrackBlockMixin {

    @Overwrite
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        Set<Block> growers = new HashSet<>();

        // used enhanced for loop since that is what IntelliJ suggested
        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockState = world.getBlockState(blockPos);
            if (CustomNyliumRegistry.NYLIUM_BLOCKS.contains(blockState.getBlock())) {
                growers.add(blockState.getBlock());
            }

            if (growers.size() == CustomNyliumRegistry.NYLIUM_BLOCKS.size()) {
                break;
            }
        }

        if (!growers.isEmpty()) {

            // don't like this
            // see https://stackoverflow.com/questions/124671/picking-a-random-element-from-a-set?page=1&tab=votes#tab-top
            int index = random.nextInt(growers.size());
            Block selected;
            Iterator<Block> iter = growers.iterator();
            for (int i = 0; i < index; i++) {
                iter.next();
            }
            selected = iter.next();

            world.setBlockState(pos, selected.getDefaultState(), 3);
        }
    }
}
