package com.ordana.ordanas_inferno.mixin;

import com.ordana.ordanas_inferno.registry.blocks.ModBlocks;
import com.ordana.ordanas_inferno.registry.blocks.nylium_registry.CustomNyliumRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NetherrackBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

@Mixin(NetherrackBlock.class)
public class NetherrackBlockMixin {

//    @Deprecated
//    @Overwrite
//    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
//        Set<Block> growers = new HashSet<>();
//
//        // used enhanced for loop since that is what IntelliJ suggested
//        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
//            BlockState blockState = world.getBlockState(blockPos);
//            if (CustomNyliumRegistry.NYLIUM_BLOCKS.contains(blockState.getBlock())) {
//                growers.add(blockState.getBlock());
//            }
//
//            if (growers.size() == CustomNyliumRegistry.NYLIUM_BLOCKS.size()) {
//                break;
//            }
//        }
//
//        if (!growers.isEmpty()) {
//
//            // see https://stackoverflow.com/questions/124671/picking-a-random-element-from-a-set?page=1&tab=votes#tab-top
//            int index = random.nextInt(growers.size());
//            Block selected;
//            Iterator<Block> iter = growers.iterator();
//            for (int i = 0; i < index; i++) {
//                iter.next();
//            }
//            selected = iter.next();
//
//            world.setBlockState(pos, selected.getDefaultState(), 3);
//        }
//    }

    // this works if no one mixed in an if code... we could also use slice
    @Inject(method = "grow",
            at = @At(value = "JUMP", opcode = Opcodes.IFEQ, ordinal = 5),
            locals = LocalCapture.CAPTURE_FAILSOFT,
            cancellable = true)
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state, CallbackInfo ci, boolean bl, boolean bl2) {
        Set<Block> growers = new HashSet<>();

        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(ModBlocks.UMBRA_NYLIUM)) {
                growers.add(blockState.getBlock());
            }

            if (blockState.isOf(ModBlocks.VILE_NYLIUM)) {
                growers.add(blockState.getBlock());
            }


            if (growers.size() == 2) {
                break;
            }
        }

        if (bl2) {
            growers.add(Blocks.WARPED_NYLIUM);
        }

        if (bl) {
            growers.add(Blocks.CRIMSON_NYLIUM);
        }

        if (!growers.isEmpty()) {

            // see https://stackoverflow.com/questions/124671/picking-a-random-element-from-a-set?page=1&tab=votes#tab-top
            int index = random.nextInt(growers.size());
            Block selected;
            Iterator<Block> iter = growers.iterator();
            for (int i = 0; i < index; i++) {
                iter.next();
            }
            selected = iter.next();

            world.setBlockState(pos, selected.getDefaultState(), 3);

            ci.cancel();
        }

    }
}
