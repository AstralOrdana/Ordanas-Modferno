package com.ordana.ordanas_inferno.registry.blocks;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class SpectreRoots extends RootsBlock implements Waterloggable {
    public static final BooleanProperty HANGING;
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape UP_SHAPE;
    protected static final VoxelShape DOWN_SHAPE;

    public SpectreRoots(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState) ((BlockState) ((BlockState) this.stateManager.getDefaultState()).with(HANGING, false)).with(WATERLOGGED, false));
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        Direction[] var3 = ctx.getPlacementDirections();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Direction direction = var3[var5];
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState blockState = (BlockState)this.getDefaultState().with(HANGING, direction == Direction.UP);
                if (blockState.canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) {
                    return (BlockState)blockState.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
                }
            }
        }

        return null;
    }


    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (Boolean)state.get(HANGING) ? DOWN_SHAPE : UP_SHAPE;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{HANGING, WATERLOGGED});
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = attachedDirection(state).getOpposite();
        return Block.sideCoversSmallSquare(world, pos.offset(direction), direction.getOpposite());
    }

    protected static Direction attachedDirection(BlockState state) {
        return (Boolean)state.get(HANGING) ? Direction.DOWN : Direction.UP;
    }

    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if ((Boolean)state.get(WATERLOGGED)) {
            world.getFluidTickScheduler().schedule(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return attachedDirection(state).getOpposite() == direction && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.SOUL_FIRE_BASE_BLOCKS) || floor.isOf(ModBlocks.SOUL_STONE) || super.canPlantOnTop(floor, world, pos);
    }

    public OffsetType getOffsetType() {
        return OffsetType.XZ;
    }

        static {
            HANGING = Properties.HANGING;
            WATERLOGGED = Properties.WATERLOGGED;
            DOWN_SHAPE = Block.createCuboidShape(2.0D, 3.0D, 2.0D, 14.0D, 16.0D, 14.0D);
            UP_SHAPE = Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
        }
    }

