package com.ordana.ordanas_inferno.to_be_mixins;

import com.ordana.ordanas_inferno.registry.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherrackBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Deprecated
@Mixin(NetherrackBlock.class)
public class MixinNetherrack {

    @Deprecated
    @Inject(at = @At(value = "INVOKE",
            target = "Lnet/minecraft/server/world/ServerWorld;setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;I)Z"),
            method = "Lnet/minecraft/block/NetherrackBlock;grow(Lnet/minecraft/server/world/ServerWorld;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;)V",
            cancellable = true)
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state, CallbackInfo ci) {
        boolean bl = false;
        boolean bl2 = false;

        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(ModBlocks.UMBRA_NYLIUM)) {
                bl2 = true;
            }

            if (blockState.isOf(ModBlocks.VILE_NYLIUM)) {
                bl = true;
            }

            if (bl2 && bl) {
                break;
            }
        }

        // also capture bl bl2 of mojang and check for those
        if (bl2 && bl) {
            world.setBlockState(pos, random.nextBoolean() ? ModBlocks.UMBRA_NYLIUM.getDefaultState() : ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
            ci.cancel();
        } else if (bl2) {
            world.setBlockState(pos, ModBlocks.UMBRA_NYLIUM.getDefaultState(), 3);
            ci.cancel();
        } else if (bl) {
            world.setBlockState(pos, ModBlocks.VILE_NYLIUM.getDefaultState(), 3);
            ci.cancel();
        }
    }
}
