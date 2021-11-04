package com.ordana.ordanas_inferno.mixin;

import com.mojang.datafixers.util.Pair;
import com.ordana.ordanas_inferno.registry.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemUsageContext;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

@Mixin(HoeItem.class)
public abstract class HoeItemMixin {

    @Shadow
    public static Consumer<ItemUsageContext> createTillAction(BlockState result) {
        return null;
    }

    @Shadow @Final protected static Map<Block, Pair<Predicate<ItemUsageContext>, Consumer<ItemUsageContext>>> TILLING_ACTIONS;

    @Inject(
            method = "<clinit>",
            at = @At(
                    value = "FIELD",
                    target = "Lnet/minecraft/item/HoeItem;TILLING_ACTIONS:Ljava/util/Map;",
                    opcode = Opcodes.PUTSTATIC,
                    ordinal = 0,
                    shift = At.Shift.AFTER)
    )
    // https://discord.com/channels/507304429255393322/807617700734042122/834770651432747018
    private static void coolerMap(CallbackInfo ci){
        TILLING_ACTIONS.put(ModBlocks.UMBRA_NYLIUM, Pair.of(HoeItem::canTillFarmland, createTillAction(ModBlocks.NETHER_FARMLAND.getDefaultState())));
        TILLING_ACTIONS.put(ModBlocks.VILE_NYLIUM, Pair.of(HoeItem::canTillFarmland, createTillAction(ModBlocks.NETHER_FARMLAND.getDefaultState())));
        TILLING_ACTIONS.put(Blocks.CRIMSON_NYLIUM, Pair.of(HoeItem::canTillFarmland, createTillAction(ModBlocks.NETHER_FARMLAND.getDefaultState())));
        TILLING_ACTIONS.put(Blocks.WARPED_NYLIUM, Pair.of(HoeItem::canTillFarmland, createTillAction(ModBlocks.NETHER_FARMLAND.getDefaultState())));
    }
}
