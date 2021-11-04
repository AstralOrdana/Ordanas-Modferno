package com.ordana.ordanas_inferno.registry.blocks;

import com.ordana.ordanas_inferno.OrdanasInferno;
import com.ordana.ordanas_inferno.mixin.SignTypeAccessor;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeatures;

import java.util.function.ToIntFunction;

public class ModBlocks {

    //stones
    public static final ModBasaltPillar BASALT_PILLAR = new ModBasaltPillar(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().ticksRandomly().strength(3f, 6f).sounds(BlockSoundGroup.BASALT).dynamicBounds().nonOpaque());

    public static final Block LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final SlabBlock LIMESTONE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final StairsBlock LIMESTONE_STAIRS = new ModStairs(LIMESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final WallBlock LIMESTONE_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final Block POLISHED_LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final SlabBlock POLISHED_LIMESTONE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final StairsBlock POLISHED_LIMESTONE_STAIRS = new ModStairs(LIMESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final WallBlock POLISHED_LIMESTONE_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final Block POLISHED_LIMESTONE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final SlabBlock POLISHED_LIMESTONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final StairsBlock POLISHED_LIMESTONE_BRICK_STAIRS = new ModStairs(LIMESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final WallBlock POLISHED_LIMESTONE_BRICK_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));
    public static final Block CHISELED_POLISHED_LIMESTONE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.CALCITE));

    public static final Block SCORIA = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final SlabBlock SCORIA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final StairsBlock SCORIA_STAIRS = new ModStairs(SCORIA.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final WallBlock SCORIA_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final Block POLISHED_SCORIA = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final SlabBlock POLISHED_SCORIA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final StairsBlock POLISHED_SCORIA_STAIRS = new ModStairs(SCORIA.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final WallBlock POLISHED_SCORIA_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final Block POLISHED_SCORIA_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final SlabBlock POLISHED_SCORIA_BRICK_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final StairsBlock POLISHED_SCORIA_BRICK_STAIRS = new ModStairs(SCORIA.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final WallBlock POLISHED_SCORIA_BRICK_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));
    public static final Block CHISELED_POLISHED_SCORIA = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.TUFF));

    public static final Block SOUL_STONE = new SoulStone(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final SlabBlock SOUL_STONE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final StairsBlock SOUL_STONE_STAIRS = new ModStairs(SOUL_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final WallBlock SOUL_STONE_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final Block POLISHED_SOUL_STONE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final SlabBlock POLISHED_SOUL_STONE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final StairsBlock POLISHED_SOUL_STONE_STAIRS = new ModStairs(SOUL_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final WallBlock POLISHED_SOUL_STONE_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final Block POLISHED_SOUL_STONE_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final SlabBlock POLISHED_SOUL_STONE_BRICK_SLAB = new SlabBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final StairsBlock POLISHED_SOUL_STONE_BRICK_STAIRS = new ModStairs(SOUL_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final WallBlock POLISHED_SOUL_STONE_BRICK_WALL = new WallBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));
    public static final Block CHISELED_POLISHED_SOUL_STONE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(3f, 6f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK));

    public static final Block MOONSTONE_CLUSTER_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).strength(3f, 6f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block DEMON_QUARTZ_BLOCK = new TintedGlassBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).strength(3f, 6f).sounds(BlockSoundGroup.GLASS).luminance(3).nonOpaque());


    //woods
    public static final HayBlock CINDER_ROOT_BALE = new HayBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHEARS).strength(0f, 0f).sounds(BlockSoundGroup.NETHER_SPROUTS));
    public static final CinderRoots CINDER_ROOTS = new CinderRoots(CINDER_ROOT_BALE.getDefaultState(), FabricBlockSettings.of(Material.NETHER_SHOOTS).breakByTool(FabricToolTags.SHEARS).strength(0f, 0f).dynamicBounds().nonOpaque().noCollision().sounds(BlockSoundGroup.ROOTS));
    public static final PillarBlock CINDER_STEM = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final PillarBlock CINDER_HYPHAE = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final PillarBlock STRIPPED_CINDER_STEM = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final PillarBlock STRIPPED_CINDER_HYPHAE = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block CINDER_PLANKS = new Block(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock CINDER_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final StairsBlock CINDER_STAIRS = new ModStairs (CINDER_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final FenceBlock CINDER_FENCE = new FenceBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final FenceGateBlock CINDER_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final WoodenButtonBlock CINDER_BUTTON = new ModWoodButtons(CINDER_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final PressurePlateBlock CINDER_PRESSURE_PLATE = new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final DoorBlock CINDER_DOOR = new ModDoor(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).nonOpaque());
    public static final TrapdoorBlock CINDER_TRAPDOOR = new ModTrapdoor(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).nonOpaque());
    public static final SignType CINDER_SIGN_TYPE = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cinder"));
    public static final Block CINDER_SIGN = new SignBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).noCollision(), CINDER_SIGN_TYPE);
    public static final Block CINDER_WALL_SIGN = new WallSignBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).noCollision().dropsLike(CINDER_SIGN), CINDER_SIGN_TYPE);


    public static final Block SPECTRE_ROOT_BALE = new HayBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHEARS).strength(0f, 0f).sounds(BlockSoundGroup.NETHER_SPROUTS));
    public static final Block SPECTRE_ROOTS = new SpectreRoots(FabricBlockSettings.of(Material.NETHER_SHOOTS).breakByTool(FabricToolTags.SHEARS).strength(0f, 0f).dynamicBounds().nonOpaque().noCollision().sounds(BlockSoundGroup.ROOTS));
    public static final Block SPECTRE_STEM = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block SPECTRE_HYPHAE = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block STRIPPED_SPECTRE_STEM = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block STRIPPED_SPECTRE_HYPHAE = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block SPECTRE_PLANKS = new Block(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPECTRE_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPECTRE_STAIRS = new ModStairs (SPECTRE_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPECTRE_FENCE = new FenceBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPECTRE_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPECTRE_BUTTON = new ModWoodButtons(SPECTRE_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPECTRE_PRESSURE_PLATE = new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPECTRE_DOOR = new ModDoor(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).nonOpaque());
    public static final Block SPECTRE_TRAPDOOR = new ModTrapdoor(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).nonOpaque());
    public static final Block SPECTRE_SCLEROTIUM = new ModNylium(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).strength(2f, 3f).sounds(BlockSoundGroup.NYLIUM));
    public static final SignType SPECTRE_SIGN_TYPE = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("spectre"));
    public static final Block SPECTRE_SIGN = new SignBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).noCollision(), SPECTRE_SIGN_TYPE);
    public static final Block SPECTRE_WALL_SIGN = new WallSignBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).noCollision().dropsLike(SPECTRE_SIGN), SPECTRE_SIGN_TYPE);


    public static final HayBlock UMBRA_ROOT_BALE = new HayBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHEARS).strength(0f, 0f).sounds(BlockSoundGroup.NETHER_SPROUTS));
    public static final UmbraRoots UMBRA_ROOTS = new UmbraRoots(UMBRA_ROOT_BALE.getDefaultState(), FabricBlockSettings.of(Material.NETHER_SHOOTS).breakByTool(FabricToolTags.SHEARS).strength(0f, 0f).dynamicBounds().nonOpaque().noCollision().sounds(BlockSoundGroup.ROOTS));
    public static final TallRootsBlock TALL_UMBRA_ROOTS = new TallRootsBlock(AbstractBlock.Settings.of(Material.REPLACEABLE_PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS));
    public static final PillarBlock UMBRA_STEM = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final PillarBlock UMBRA_HYPHAE = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final PillarBlock STRIPPED_UMBRA_STEM = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final PillarBlock STRIPPED_UMBRA_HYPHAE = new PillarBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block UMBRA_PLANKS = new Block(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final SlabBlock UMBRA_SLAB = new SlabBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final StairsBlock UMBRA_STAIRS = new ModStairs (UMBRA_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final FenceBlock UMBRA_FENCE = new FenceBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final FenceGateBlock UMBRA_FENCE_GATE = new FenceGateBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final WoodenButtonBlock UMBRA_BUTTON = new ModWoodButtons(UMBRA_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final PressurePlateBlock UMBRA_PRESSURE_PLATE = new ModPressurePlate(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD));
    public static final DoorBlock UMBRA_DOOR = new ModDoor(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).nonOpaque());
    public static final TrapdoorBlock UMBRA_TRAPDOOR = new ModTrapdoor(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).nonOpaque());
    public static final Block UMBRA_NYLIUM = new ModNylium(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).ticksRandomly().strength(2f, 3f).sounds(BlockSoundGroup.NYLIUM));
    public static final SignType UMBRA_SIGN_TYPE = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("umbra"));
    public static final Block UMBRA_SIGN = new SignBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).noCollision(), UMBRA_SIGN_TYPE);
    public static final Block UMBRA_WALL_SIGN = new WallSignBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakByTool(FabricToolTags.AXES).strength(2f, 3f).sounds(BlockSoundGroup.WOOD).noCollision().dropsLike(UMBRA_SIGN), UMBRA_SIGN_TYPE);
    public static final Block UMBRA_FUNGUS = new ModFungus(AbstractBlock.Settings.of(Material.PLANT, MapColor.DARK_RED).breakInstantly().noCollision().sounds(BlockSoundGroup.FUNGUS), () -> {return ConfiguredFeatures.CRIMSON_FUNGI_PLANTED;});
    public static final Block UMBRA_WARTCAP = new Wartcap(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES).luminance(wartLight(5)).strength(2f, 3f).sounds(BlockSoundGroup.WART_BLOCK));
    public static final Block UMBRA_FENNELS = new FennelsBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.NETHER_SPROUTS));

    public static final HayBlock CRIMSON_ROOT_BALE = new HayBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHEARS).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_SPROUTS));
    public static final Block CRIMSON_WARTCAP = new Wartcap(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES).luminance(wartLight(5)).strength(2f, 3f).sounds(BlockSoundGroup.WART_BLOCK));
    public static final Block CRIMSON_YAMS = new YamsBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.NETHER_SPROUTS));

    public static final HayBlock WARPED_ROOT_BALE = new HayBlock(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.SHEARS).strength(2f, 3f).sounds(BlockSoundGroup.NETHER_SPROUTS));
    public static final Block WARPED_WARTCAP = new Wartcap(FabricBlockSettings.of(Material.SOLID_ORGANIC).breakByTool(FabricToolTags.HOES).luminance(wartLight(5)).strength(2f, 3f).sounds(BlockSoundGroup.WART_BLOCK));
    public static final Block WARPED_PARSNIPS = new ParsnipsBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.NETHER_SPROUTS));

    private static ToIntFunction<BlockState> wartLight(int litLevel) {
        return (state) -> {
            return (Boolean)state.get(Wartcap.WARTY) ? litLevel : 0;
        };
    }

    public static final Block NETHER_FARMLAND = new NetherFarmland(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).ticksRandomly().strength(2f, 3f).sounds(BlockSoundGroup.NYLIUM));

    public static final Block VILE_NYLIUM = new ModNylium(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).ticksRandomly().strength(2f, 3f).sounds(BlockSoundGroup.NYLIUM));
    public static final Block LIMESTONE_NEST = new InfestedBlock(LIMESTONE, FabricBlockSettings.of(Material.ORGANIC_PRODUCT).breakByTool(FabricToolTags.PICKAXES).strength(2f, 3f).sounds(BlockSoundGroup.CALCITE));
    public static final Block VILE_WAX_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).strength(2f, 3f).sounds(BlockSoundGroup.HONEY));

    //metals
    public static final Block CARNELIUM_ORE = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.BASALT));
    public static final Block BASALTIC_CARNELIUM_ORE = new BasalticCarnelium(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.BASALT));
    public static final Block RAW_CARNELIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.COPPER));
    public static final Block CARNELIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.COPPER));
    public static final Block CARNELIUM_BARS = new ModPane(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.COPPER).nonOpaque());
    public static final Block CARNELIUM_CHAIN = new ChainBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.COPPER).nonOpaque());
    public static final Block CARNELIUM_DOOR = new ModDoor(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.COPPER).nonOpaque());
    public static final Block CARNELIUM_TRAPDOOR = new ModTrapdoor(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.COPPER).nonOpaque());
    public static final Block CARNELIUM_PIPE = new PillarBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.COPPER));

    public static final Block ANIRRUM_ORE = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.SHOVELS, 2).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.SOUL_SOIL));
    public static final Block RAW_ANIRRUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.METAL));
    public static final Block ANIRRUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.METAL));
    public static final Block ANIRRUM_BARS = new ModPane(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.METAL).nonOpaque());
    public static final Block ANIRRUM_CHAIN = new ChainBlock(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.METAL).nonOpaque());

    public static final Block ORICHALCUM_ORE = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.NETHERITE));
    public static final Block RAW_ORICHALCUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.NETHERITE));
    public static final Block ORICHALCUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(30f, 1200f).sounds(BlockSoundGroup.NETHERITE));

    //misc
    public static final GravelBlock BASALT_GRAVEL = new GravelBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.SHOVELS, 0).strength(0.6f, 0.6f).sounds(BlockSoundGroup.GRAVEL));
    public static final GravelBlock ASH_BLOCK = new GravelBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.SHOVELS, 0).strength(0.2f, 0.2f).sounds(BlockSoundGroup.SAND));
    public static final GravelBlock POWDERED_SULFUR = new GravelBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.SHOVELS, 0).strength(0.2f, 0.2f).sounds(BlockSoundGroup.SAND));
    public static final GravelBlock BLACK_SAND = new GravelBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.SHOVELS, 0).strength(0.4f, 0.4f).sounds(BlockSoundGroup.SAND));

    public static final SlimeBlock RUBBER_BLOCK = new SlimeBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.SHOVELS, 0).strength(0.1f, 0.1f).sounds(BlockSoundGroup.SLIME));
    public static final HoneyBlock BLOOD_BLOCK = new HoneyBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.SHOVELS, 0).strength(0.1f, 0.1f).sounds(BlockSoundGroup.HONEY));



    public static void registerBlocks() {
        //metal
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "carnelium_ore"), CARNELIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "basaltic_carnelium_ore"), BASALTIC_CARNELIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "raw_carnelium_block"), RAW_CARNELIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "carnelium_block"), CARNELIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "carnelium_bars"), CARNELIUM_BARS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "carnelium_chain"), CARNELIUM_CHAIN);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "carnelium_door"), CARNELIUM_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "carnelium_trapdoor"), CARNELIUM_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "carnelium_pipe"), CARNELIUM_PIPE);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "anirrum_ore"), ANIRRUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "raw_anirrum_block"), RAW_ANIRRUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "anirrum_block"), ANIRRUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "anirrum_bars"), ANIRRUM_BARS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "anirrum_chain"), ANIRRUM_CHAIN);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_ore"), ORICHALCUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "raw_orichalcum_block"), RAW_ORICHALCUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_block"), ORICHALCUM_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "moonstone_cluster_block"), MOONSTONE_CLUSTER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "demon_quartz_block"), DEMON_QUARTZ_BLOCK);

        //misc
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "basalt_gravel"), BASALT_GRAVEL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "basalt_pillar"), BASALT_PILLAR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "ash_block"), ASH_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "powdered_sulfur"), POWDERED_SULFUR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "black_sand"), BLACK_SAND);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "rubber_block"), RUBBER_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "blood_block"), BLOOD_BLOCK);

        //stone
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "limestone"), LIMESTONE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "limestone_slab"), LIMESTONE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "limestone_stairs"), LIMESTONE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "limestone_wall"), LIMESTONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone"), POLISHED_LIMESTONE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_slab"), POLISHED_LIMESTONE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_stairs"), POLISHED_LIMESTONE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_wall"), POLISHED_LIMESTONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_bricks"), POLISHED_LIMESTONE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_brick_slab"), POLISHED_LIMESTONE_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_brick_stairs"), POLISHED_LIMESTONE_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_brick_wall"), POLISHED_LIMESTONE_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "chiseled_polished_limestone"), CHISELED_POLISHED_LIMESTONE);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "scoria"), SCORIA);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "scoria_slab"), SCORIA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "scoria_stairs"), SCORIA_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "scoria_wall"), SCORIA_WALL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria"), POLISHED_SCORIA);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_slab"), POLISHED_SCORIA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_stairs"), POLISHED_SCORIA_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_wall"), POLISHED_SCORIA_WALL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_bricks"), POLISHED_SCORIA_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_brick_slab"), POLISHED_SCORIA_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_brick_stairs"), POLISHED_SCORIA_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_brick_wall"), POLISHED_SCORIA_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "chiseled_polished_scoria"), CHISELED_POLISHED_SCORIA);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "soul_stone"), SOUL_STONE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "soul_stone_slab"), SOUL_STONE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "soul_stone_stairs"), SOUL_STONE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "soul_stone_wall"), SOUL_STONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone"), POLISHED_SOUL_STONE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_slab"), POLISHED_SOUL_STONE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_stairs"), POLISHED_SOUL_STONE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_wall"), POLISHED_SOUL_STONE_WALL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_bricks"), POLISHED_SOUL_STONE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_brick_slab"), POLISHED_SOUL_STONE_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_brick_stairs"), POLISHED_SOUL_STONE_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_brick_wall"), POLISHED_SOUL_STONE_BRICK_WALL);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "chiseled_polished_soul_stone"), CHISELED_POLISHED_SOUL_STONE);

        //wood
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_root_bale"), CINDER_ROOT_BALE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_roots"), CINDER_ROOTS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_stem"), CINDER_STEM);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "stripped_cinder_stem"), STRIPPED_CINDER_STEM);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_hyphae"), CINDER_HYPHAE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "stripped_cinder_hyphae"), STRIPPED_CINDER_HYPHAE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_planks"), CINDER_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_slab"), CINDER_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_stairs"), CINDER_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_fence"), CINDER_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_fence_gate"), CINDER_FENCE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_button"), CINDER_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_pressure_plate"), CINDER_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_door"), CINDER_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_trapdoor"), CINDER_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_sign"), CINDER_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "cinder_wall_sign"), CINDER_WALL_SIGN);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_root_bale"), SPECTRE_ROOT_BALE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_roots"), SPECTRE_ROOTS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_stem"), SPECTRE_STEM);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "stripped_spectre_stem"), STRIPPED_SPECTRE_STEM);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_hyphae"), SPECTRE_HYPHAE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "stripped_spectre_hyphae"), STRIPPED_SPECTRE_HYPHAE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_planks"), SPECTRE_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_slab"), SPECTRE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_stairs"), SPECTRE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_fence"), SPECTRE_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_fence_gate"), SPECTRE_FENCE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_button"), SPECTRE_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_pressure_plate"), SPECTRE_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_door"), SPECTRE_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_trapdoor"), SPECTRE_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_sclerotium"), SPECTRE_SCLEROTIUM);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_sign"), SPECTRE_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "spectre_wall_sign"), SPECTRE_WALL_SIGN);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_root_bale"), UMBRA_ROOT_BALE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_roots"), UMBRA_ROOTS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "tall_umbra_roots"), TALL_UMBRA_ROOTS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_stem"), UMBRA_STEM);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "stripped_umbra_stem"), STRIPPED_UMBRA_STEM);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_hyphae"), UMBRA_HYPHAE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "stripped_umbra_hyphae"), STRIPPED_UMBRA_HYPHAE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_planks"), UMBRA_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_slab"), UMBRA_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_stairs"), UMBRA_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_fence"), UMBRA_FENCE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_fence_gate"), UMBRA_FENCE_GATE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_button"), UMBRA_BUTTON);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_pressure_plate"), UMBRA_PRESSURE_PLATE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_door"), UMBRA_DOOR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_trapdoor"), UMBRA_TRAPDOOR);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_nylium"), UMBRA_NYLIUM);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "nether_farmland"), NETHER_FARMLAND);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_sign"), UMBRA_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_wall_sign"), UMBRA_WALL_SIGN);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_fungus"), UMBRA_FUNGUS);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_wartcap"), UMBRA_WARTCAP);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "umbra_fennels"), UMBRA_FENNELS);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "vile_nylium"), VILE_NYLIUM);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "limestone_nest"), LIMESTONE_NEST);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "vile_wax_block"), VILE_WAX_BLOCK);

        //fungi
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "crimson_wartcap"), CRIMSON_WARTCAP);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "crimson_root_bale"), CRIMSON_ROOT_BALE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "crimson_yams"), CRIMSON_YAMS);

        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "warped_wartcap"), WARPED_WARTCAP);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "warped_root_bale"), WARPED_ROOT_BALE);
        Registry.register(Registry.BLOCK, new Identifier(OrdanasInferno.MOD_ID, "warped_parsnips"), WARPED_PARSNIPS);
    }
}
