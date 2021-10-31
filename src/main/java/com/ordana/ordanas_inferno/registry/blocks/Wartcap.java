package com.ordana.ordanas_inferno.registry.blocks;

import com.ordana.ordanas_inferno.registry.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CaveVines;
import net.minecraft.block.Fertilizable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class Wartcap extends Block implements Fertilizable {
    public Wartcap(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(WARTY, false));
    }

    public static final BooleanProperty WARTY = BooleanProperty.of("warty");

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(WARTY);
    }


    static ActionResult pickWarts(BlockState state, World world, BlockPos pos) {
        if ((Boolean)state.get(WARTY)) {
            Block.dropStack(world, pos, new ItemStack(ModItems.WART_BUNDLE, 1));
            float f = MathHelper.nextBetween(world.random, 0.8F, 1.2F);
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_CAVE_VINES_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, f);
            world.setBlockState(pos, (BlockState)state.with(WARTY, false), 2);
            return ActionResult.success(world.isClient);
        } else {
            return ActionResult.PASS;
        }
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return Wartcap.pickWarts(state, world, pos);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return !(Boolean)state.get(WARTY);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(pos, (BlockState)state.with(WARTY, true), 2);
    }
}
