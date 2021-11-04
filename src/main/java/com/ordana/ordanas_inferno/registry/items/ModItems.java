package com.ordana.ordanas_inferno.registry.items;

import com.ordana.ordanas_inferno.OrdanasInferno;
import com.ordana.ordanas_inferno.registry.blocks.ModBlocks;
import com.ordana.ordanas_inferno.registry.materials.AnirrumArmorMaterial;
import com.ordana.ordanas_inferno.registry.materials.AnirrumToolMaterial;
import com.ordana.ordanas_inferno.registry.materials.OrichalcumArmorMaterial;
import com.ordana.ordanas_inferno.registry.materials.OrichalcumToolMaterial;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items

    //plants
    public static final Item WARPED_PARSNIP = new AliasedBlockItem(ModBlocks.WARPED_PARSNIPS, (new Item.Settings()).group(OrdanasInferno.INFERNO_MATERIALS).food(FoodComponents.CARROT));
    public static final Item CRIMSON_YAM = new AliasedBlockItem(ModBlocks.CRIMSON_YAMS, (new Item.Settings()).group(OrdanasInferno.INFERNO_MATERIALS).food(FoodComponents.POTATO));
    public static final Item UMBRA_FENNEL = new AliasedBlockItem(ModBlocks.UMBRA_FENNELS, (new Item.Settings()).group(OrdanasInferno.INFERNO_MATERIALS).food(FoodComponents.BEETROOT));

    //materials
    public static final Item RAW_CARNELIUM = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));
    public static final Item CARNELIUM_INGOT = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));
    public static final Item CARNELIUM_NUGGET = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));

    public static final Item RAW_ANIRRUM = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));
    public static final Item ANIRRUM_INGOT = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));
    public static final Item ANIRRUM_NUGGET = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));

    public static final Item RAW_ORICHALCUM = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));
    public static final Item ORICHALCUM_INGOT = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));

    public static final Item SULFUR = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));
    public static final Item MAGMATIC_ROCK = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));
    public static final Item WART_BUNDLE = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));
    public static final Item DEMON_QUARTZ = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));
    public static final Item RUBBER_BALL = new Item(new Item.Settings().group(OrdanasInferno.INFERNO_MATERIALS));

    //gear
    public static final ToolItem ANIRRUM_SHOVEL = new ShovelItem(AnirrumToolMaterial.INSTANCE, 2.5f, -3f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ToolItem ANIRRUM_SWORD = new SwordItem(AnirrumToolMaterial.INSTANCE, 5, -2.4f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ToolItem ANIRRUM_AXE = new AnirrumAxe(AnirrumToolMaterial.INSTANCE, 7, -3f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ToolItem ANIRRUM_PICKAXE = new AnirrumPickaxe(AnirrumToolMaterial.INSTANCE, 2, -2.8f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ToolItem ANIRRUM_HOE = new AnirrumHoe(AnirrumToolMaterial.INSTANCE, 0, 0f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));

    public static final ArmorItem ANIRRUM_HELMET = new ArmorItem(AnirrumArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ArmorItem ANIRRUM_CHESTPLATE = new ArmorItem(AnirrumArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ArmorItem ANIRRUM_LEGGINGS = new ArmorItem(AnirrumArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ArmorItem ANIRRUM_BOOTS = new ArmorItem(AnirrumArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));

    public static final ToolItem ORICHALCUM_SHOVEL = new ShovelItem(OrichalcumToolMaterial.INSTANCE, 5.5f, -2.8f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ToolItem ORICHALCUM_SWORD = new SwordItem(OrichalcumToolMaterial.INSTANCE, 8, -2.2f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ToolItem ORICHALCUM_AXE = new OrichalcumAxe(OrichalcumToolMaterial.INSTANCE, 11, -3.8f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ToolItem ORICHALCUM_PICKAXE = new OrichalcumPickaxe(OrichalcumToolMaterial.INSTANCE, 5, -2.6f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ToolItem ORICHALCUM_HOE = new OrichalcumHoe(OrichalcumToolMaterial.INSTANCE, 4, 0.2f, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));

    public static final ArmorItem ORICHALCUM_HELMET = new ArmorItem(OrichalcumArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ArmorItem ORICHALCUM_CHESTPLATE = new ArmorItem(OrichalcumArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ArmorItem ORICHALCUM_LEGGINGS = new ArmorItem(OrichalcumArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));
    public static final ArmorItem ORICHALCUM_BOOTS = new ArmorItem(OrichalcumArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(OrdanasInferno.INFERNO_GEAR));


    //blocks

    //metal
    public static final BlockItem CARNELIUM_ORE = new BlockItem(ModBlocks.CARNELIUM_ORE, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem BASALTIC_CARNELIUM_ORE = new BlockItem(ModBlocks.BASALTIC_CARNELIUM_ORE, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem RAW_CARNELIUM_BLOCK = new BlockItem(ModBlocks.RAW_CARNELIUM_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem CARNELIUM_BLOCK = new BlockItem(ModBlocks.CARNELIUM_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem CARNELIUM_BARS = new BlockItem(ModBlocks.CARNELIUM_BARS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem CARNELIUM_CHAIN = new BlockItem(ModBlocks.CARNELIUM_CHAIN, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem CARNELIUM_DOOR = new BlockItem(ModBlocks.CARNELIUM_DOOR, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem CARNELIUM_TRAPDOOR = new BlockItem(ModBlocks.CARNELIUM_TRAPDOOR, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem CARNELIUM_PIPE = new BlockItem(ModBlocks.CARNELIUM_PIPE, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));

    public static final BlockItem ANIRRUM_ORE = new BlockItem(ModBlocks.ANIRRUM_ORE, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem RAW_ANIRRUM_BLOCK = new BlockItem(ModBlocks.RAW_ANIRRUM_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem ANIRRUM_BLOCK = new BlockItem(ModBlocks.ANIRRUM_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem ANIRRUM_BARS = new BlockItem(ModBlocks.ANIRRUM_BARS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem ANIRRUM_CHAIN = new BlockItem(ModBlocks.ANIRRUM_CHAIN, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));

    public static final BlockItem ORICHALCUM_ORE = new BlockItem(ModBlocks.ORICHALCUM_ORE, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem RAW_ORICHALCUM_BLOCK = new BlockItem(ModBlocks.RAW_ORICHALCUM_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem ORICHALCUM_BLOCK = new BlockItem(ModBlocks.ORICHALCUM_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));

    //misc
    public static final BlockItem BASALT_GRAVEL = new BlockItem(ModBlocks.BASALT_GRAVEL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem BASALT_PILLAR = new BlockItem(ModBlocks.BASALT_PILLAR, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem ASH_BLOCK = new BlockItem(ModBlocks.ASH_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POWDERED_SULFUR = new BlockItem(ModBlocks.POWDERED_SULFUR, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem BLACK_SAND = new BlockItem(ModBlocks.BLACK_SAND, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));

    public static final BlockItem MOONSTONE_CLUSTER_BLOCK = new BlockItem(ModBlocks.MOONSTONE_CLUSTER_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem DEMON_QUARTZ_BLOCK = new BlockItem(ModBlocks.DEMON_QUARTZ_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));

    public static final BlockItem RUBBER_BLOCK = new BlockItem(ModBlocks.RUBBER_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem BLOOD_BLOCK = new BlockItem(ModBlocks.BLOOD_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));

    //stone
    public static final BlockItem LIMESTONE = new BlockItem(ModBlocks.LIMESTONE, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem LIMESTONE_SLAB = new BlockItem(ModBlocks.LIMESTONE_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem LIMESTONE_STAIRS = new BlockItem(ModBlocks.LIMESTONE_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem LIMESTONE_WALL = new BlockItem(ModBlocks.LIMESTONE_WALL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_LIMESTONE = new BlockItem(ModBlocks.POLISHED_LIMESTONE, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_LIMESTONE_SLAB = new BlockItem(ModBlocks.POLISHED_LIMESTONE_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_LIMESTONE_STAIRS = new BlockItem(ModBlocks.POLISHED_LIMESTONE_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_LIMESTONE_WALL = new BlockItem(ModBlocks.POLISHED_LIMESTONE_WALL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_LIMESTONE_BRICKS = new BlockItem(ModBlocks.POLISHED_LIMESTONE_BRICKS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_LIMESTONE_BRICK_SLAB = new BlockItem(ModBlocks.POLISHED_LIMESTONE_BRICK_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_LIMESTONE_BRICK_STAIRS = new BlockItem(ModBlocks.POLISHED_LIMESTONE_BRICK_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_LIMESTONE_BRICK_WALL = new BlockItem(ModBlocks.POLISHED_LIMESTONE_BRICK_WALL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));

    public static final BlockItem SCORIA = new BlockItem(ModBlocks.SCORIA, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem SCORIA_SLAB = new BlockItem(ModBlocks.SCORIA_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem SCORIA_STAIRS = new BlockItem(ModBlocks.SCORIA_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem SCORIA_WALL = new BlockItem(ModBlocks.SCORIA_WALL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SCORIA = new BlockItem(ModBlocks.POLISHED_SCORIA, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SCORIA_SLAB = new BlockItem(ModBlocks.POLISHED_SCORIA_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SCORIA_STAIRS = new BlockItem(ModBlocks.POLISHED_SCORIA_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SCORIA_WALL = new BlockItem(ModBlocks.POLISHED_SCORIA_WALL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SCORIA_BRICKS = new BlockItem(ModBlocks.POLISHED_SCORIA_BRICKS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SCORIA_BRICK_SLAB = new BlockItem(ModBlocks.POLISHED_SCORIA_BRICK_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SCORIA_BRICK_STAIRS = new BlockItem(ModBlocks.POLISHED_SCORIA_BRICK_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SCORIA_BRICK_WALL = new BlockItem(ModBlocks.POLISHED_SCORIA_BRICK_WALL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));

    public static final BlockItem SOUL_STONE = new BlockItem(ModBlocks.SOUL_STONE, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem SOUL_STONE_SLAB = new BlockItem(ModBlocks.SOUL_STONE_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem SOUL_STONE_STAIRS = new BlockItem(ModBlocks.SOUL_STONE_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem SOUL_STONE_WALL = new BlockItem(ModBlocks.SOUL_STONE_WALL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SOUL_STONE = new BlockItem(ModBlocks.POLISHED_SOUL_STONE, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SOUL_STONE_SLAB = new BlockItem(ModBlocks.POLISHED_SOUL_STONE_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SOUL_STONE_STAIRS = new BlockItem(ModBlocks.POLISHED_SOUL_STONE_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SOUL_STONE_WALL = new BlockItem(ModBlocks.POLISHED_SOUL_STONE_WALL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SOUL_STONE_BRICKS = new BlockItem(ModBlocks.POLISHED_SOUL_STONE_BRICKS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SOUL_STONE_BRICK_SLAB = new BlockItem(ModBlocks.POLISHED_SOUL_STONE_BRICK_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SOUL_STONE_BRICK_STAIRS = new BlockItem(ModBlocks.POLISHED_SOUL_STONE_BRICK_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));
    public static final BlockItem POLISHED_SOUL_STONE_BRICK_WALL = new BlockItem(ModBlocks.POLISHED_SOUL_STONE_BRICK_WALL, new Item.Settings().group(OrdanasInferno.INFERNO_BLOCKS));

    //wood
    public static final BlockItem CINDER_ROOT_BALE = new BlockItem(ModBlocks.CINDER_ROOT_BALE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_ROOTS = new BlockItem(ModBlocks.CINDER_ROOTS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_STEM = new BlockItem(ModBlocks.CINDER_STEM, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem STRIPPED_CINDER_STEM = new BlockItem(ModBlocks.STRIPPED_CINDER_STEM, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_HYPHAE = new BlockItem(ModBlocks.CINDER_HYPHAE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem STRIPPED_CINDER_HYPHAE = new BlockItem(ModBlocks.STRIPPED_CINDER_HYPHAE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_PLANKS = new BlockItem(ModBlocks.CINDER_PLANKS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_SLAB = new BlockItem(ModBlocks.CINDER_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_STAIRS = new BlockItem(ModBlocks.CINDER_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_FENCE = new BlockItem(ModBlocks.CINDER_FENCE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_FENCE_GATE = new BlockItem(ModBlocks.CINDER_FENCE_GATE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_BUTTON = new BlockItem(ModBlocks.CINDER_BUTTON, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_PRESSURE_PLATE = new BlockItem(ModBlocks.CINDER_PRESSURE_PLATE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_DOOR = new BlockItem(ModBlocks.CINDER_DOOR, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CINDER_TRAPDOOR = new BlockItem(ModBlocks.CINDER_TRAPDOOR, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));

    public static final BlockItem SPECTRE_ROOT_BALE = new BlockItem(ModBlocks.SPECTRE_ROOT_BALE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_ROOTS = new BlockItem(ModBlocks.SPECTRE_ROOTS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_STEM = new BlockItem(ModBlocks.SPECTRE_STEM, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem STRIPPED_SPECTRE_STEM = new BlockItem(ModBlocks.STRIPPED_SPECTRE_STEM, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_HYPHAE = new BlockItem(ModBlocks.SPECTRE_HYPHAE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem STRIPPED_SPECTRE_HYPHAE = new BlockItem(ModBlocks.STRIPPED_SPECTRE_HYPHAE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_PLANKS = new BlockItem(ModBlocks.SPECTRE_PLANKS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_SLAB = new BlockItem(ModBlocks.SPECTRE_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_STAIRS = new BlockItem(ModBlocks.SPECTRE_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_FENCE = new BlockItem(ModBlocks.SPECTRE_FENCE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_FENCE_GATE = new BlockItem(ModBlocks.SPECTRE_FENCE_GATE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_BUTTON = new BlockItem(ModBlocks.SPECTRE_BUTTON, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_PRESSURE_PLATE = new BlockItem(ModBlocks.SPECTRE_PRESSURE_PLATE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_DOOR = new BlockItem(ModBlocks.SPECTRE_DOOR, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_TRAPDOOR = new BlockItem(ModBlocks.SPECTRE_TRAPDOOR, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem SPECTRE_SCLEROTIUM = new BlockItem(ModBlocks.SPECTRE_SCLEROTIUM, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));

    public static final BlockItem UMBRA_ROOT_BALE = new BlockItem(ModBlocks.UMBRA_ROOT_BALE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_ROOTS = new BlockItem(ModBlocks.UMBRA_ROOTS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem TALL_UMBRA_ROOTS = new BlockItem(ModBlocks.TALL_UMBRA_ROOTS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_STEM = new BlockItem(ModBlocks.UMBRA_STEM, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem STRIPPED_UMBRA_STEM = new BlockItem(ModBlocks.STRIPPED_UMBRA_STEM, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_HYPHAE = new BlockItem(ModBlocks.UMBRA_HYPHAE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem STRIPPED_UMBRA_HYPHAE = new BlockItem(ModBlocks.STRIPPED_UMBRA_HYPHAE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_PLANKS = new BlockItem(ModBlocks.UMBRA_PLANKS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_SLAB = new BlockItem(ModBlocks.UMBRA_SLAB, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_STAIRS = new BlockItem(ModBlocks.UMBRA_STAIRS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_FENCE = new BlockItem(ModBlocks.UMBRA_FENCE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_FENCE_GATE = new BlockItem(ModBlocks.UMBRA_FENCE_GATE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_BUTTON = new BlockItem(ModBlocks.UMBRA_BUTTON, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_PRESSURE_PLATE = new BlockItem(ModBlocks.UMBRA_PRESSURE_PLATE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_DOOR = new BlockItem(ModBlocks.UMBRA_DOOR, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_TRAPDOOR = new BlockItem(ModBlocks.UMBRA_TRAPDOOR, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_NYLIUM = new BlockItem(ModBlocks.UMBRA_NYLIUM, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem NETHER_FARMLAND = new BlockItem(ModBlocks.NETHER_FARMLAND, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_FUNGUS = new BlockItem(ModBlocks.UMBRA_FUNGUS, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem UMBRA_WARTCAP = new BlockItem(ModBlocks.UMBRA_WARTCAP, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));

    public static final BlockItem CRIMSON_ROOT_BALE = new BlockItem(ModBlocks.CRIMSON_ROOT_BALE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem CRIMSON_WARTCAP = new BlockItem(ModBlocks.CRIMSON_WARTCAP, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));

    public static final BlockItem WARPED_ROOT_BALE = new BlockItem(ModBlocks.WARPED_ROOT_BALE, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem WARPED_WARTCAP = new BlockItem(ModBlocks.WARPED_WARTCAP, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));

    public static final BlockItem VILE_NYLIUM = new BlockItem(ModBlocks.VILE_NYLIUM, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem LIMESTONE_NEST = new BlockItem(ModBlocks.LIMESTONE_NEST, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));
    public static final BlockItem VILE_WAX_BLOCK = new BlockItem(ModBlocks.VILE_WAX_BLOCK, new Item.Settings().group(OrdanasInferno.INFERNO_ORGANICS));

    public static void registerItems() {

        //blocks

        //metal
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "carnelium_ore"), CARNELIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "basaltic_carnelium_ore"), BASALTIC_CARNELIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "raw_carnelium_block"), RAW_CARNELIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "carnelium_block"), CARNELIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "carnelium_bars"), CARNELIUM_BARS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "carnelium_chain"), CARNELIUM_CHAIN);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "carnelium_door"), CARNELIUM_DOOR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "carnelium_trapdoor"), CARNELIUM_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "carnelium_pipe"), CARNELIUM_PIPE);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_ore"), ANIRRUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "raw_anirrum_block"), RAW_ANIRRUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_block"), ANIRRUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_bars"), ANIRRUM_BARS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_chain"), ANIRRUM_CHAIN);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_ore"), ORICHALCUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "raw_orichalcum_block"), RAW_ORICHALCUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_block"), ORICHALCUM_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "moonstone_cluster_block"), MOONSTONE_CLUSTER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "demon_quartz_block"), DEMON_QUARTZ_BLOCK);

        //misc
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "basalt_gravel"), BASALT_GRAVEL);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "basalt_pillar"), BASALT_PILLAR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "ash_block"), ASH_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "powdered_sulfur"), POWDERED_SULFUR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "black_sand"), BLACK_SAND);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "rubber_block"), RUBBER_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "blood_block"), BLOOD_BLOCK);

        //stone
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "limestone"), LIMESTONE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "limestone_slab"), LIMESTONE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "limestone_stairs"), LIMESTONE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "limestone_wall"), LIMESTONE_WALL);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone"), POLISHED_LIMESTONE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_slab"), POLISHED_LIMESTONE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_stairs"), POLISHED_LIMESTONE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_wall"), POLISHED_LIMESTONE_WALL);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_bricks"), POLISHED_LIMESTONE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_brick_slab"), POLISHED_LIMESTONE_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_brick_stairs"), POLISHED_LIMESTONE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_limestone_brick_wall"), POLISHED_LIMESTONE_BRICK_WALL);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "scoria"), SCORIA);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "scoria_slab"), SCORIA_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "scoria_stairs"), SCORIA_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "scoria_wall"), SCORIA_WALL);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria"), POLISHED_SCORIA);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_slab"), POLISHED_SCORIA_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_stairs"), POLISHED_SCORIA_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_wall"), POLISHED_SCORIA_WALL);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_bricks"), POLISHED_SCORIA_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_brick_slab"), POLISHED_SCORIA_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_brick_stairs"), POLISHED_SCORIA_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_scoria_brick_wall"), POLISHED_SCORIA_BRICK_WALL);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "soul_stone"), SOUL_STONE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "soul_stone_slab"), SOUL_STONE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "soul_stone_stairs"), SOUL_STONE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "soul_stone_wall"), SOUL_STONE_WALL);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone"), POLISHED_SOUL_STONE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_slab"), POLISHED_SOUL_STONE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_stairs"), POLISHED_SOUL_STONE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_wall"), POLISHED_SOUL_STONE_WALL);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_bricks"), POLISHED_SOUL_STONE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_brick_slab"), POLISHED_SOUL_STONE_BRICK_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_brick_stairs"), POLISHED_SOUL_STONE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "polished_soul_stone_brick_wall"), POLISHED_SOUL_STONE_BRICK_WALL);

        //wood
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "crimson_root_bale"), CRIMSON_ROOT_BALE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "crimson_wartcap"), CRIMSON_WARTCAP);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "warped_root_bale"), WARPED_ROOT_BALE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "warped_wartcap"), WARPED_WARTCAP);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_root_bale"), CINDER_ROOT_BALE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_roots"), CINDER_ROOTS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_stem"), CINDER_STEM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "stripped_cinder_stem"), STRIPPED_CINDER_STEM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_hyphae"), CINDER_HYPHAE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "stripped_cinder_hyphae"), STRIPPED_CINDER_HYPHAE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_planks"), CINDER_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_slab"), CINDER_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_stairs"), CINDER_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_fence"), CINDER_FENCE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_fence_gate"), CINDER_FENCE_GATE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_button"), CINDER_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_pressure_plate"), CINDER_PRESSURE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_door"), CINDER_DOOR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_trapdoor"), CINDER_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "cinder_sign"), (new SignItem(new Item.Settings().maxCount(16).group(OrdanasInferno.INFERNO_ORGANICS), ModBlocks.CINDER_SIGN, ModBlocks.CINDER_WALL_SIGN)));

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_root_bale"), SPECTRE_ROOT_BALE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_roots"), SPECTRE_ROOTS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_stem"), SPECTRE_STEM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "stripped_spectre_stem"), STRIPPED_SPECTRE_STEM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_hyphae"), SPECTRE_HYPHAE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "stripped_spectre_hyphae"), STRIPPED_SPECTRE_HYPHAE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_planks"), SPECTRE_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_slab"), SPECTRE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_stairs"), SPECTRE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_fence"), SPECTRE_FENCE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_fence_gate"), SPECTRE_FENCE_GATE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_button"), SPECTRE_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_pressure_plate"), SPECTRE_PRESSURE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_door"), SPECTRE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_trapdoor"), SPECTRE_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_sclerotium"), SPECTRE_SCLEROTIUM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "spectre_sign"), (new SignItem(new Item.Settings().maxCount(16).group(OrdanasInferno.INFERNO_ORGANICS), ModBlocks.SPECTRE_SIGN, ModBlocks.SPECTRE_WALL_SIGN)));

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_root_bale"), UMBRA_ROOT_BALE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_roots"), UMBRA_ROOTS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "tall_umbra_roots"), TALL_UMBRA_ROOTS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_stem"), UMBRA_STEM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "stripped_umbra_stem"), STRIPPED_UMBRA_STEM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_hyphae"), UMBRA_HYPHAE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "stripped_umbra_hyphae"), STRIPPED_UMBRA_HYPHAE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_planks"), UMBRA_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_slab"), UMBRA_SLAB);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_stairs"), UMBRA_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_fence"), UMBRA_FENCE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_fence_gate"), UMBRA_FENCE_GATE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_button"), UMBRA_BUTTON);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_pressure_plate"), UMBRA_PRESSURE_PLATE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_door"), UMBRA_DOOR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_trapdoor"), UMBRA_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_nylium"), UMBRA_NYLIUM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "nether_farmland"), NETHER_FARMLAND);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_sign"), (new SignItem(new Item.Settings().maxCount(16).group(OrdanasInferno.INFERNO_ORGANICS), ModBlocks.UMBRA_SIGN, ModBlocks.UMBRA_WALL_SIGN)));
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_fungus"), UMBRA_FUNGUS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_wartcap"), UMBRA_WARTCAP);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "vile_nylium"), VILE_NYLIUM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "limestone_nest"), LIMESTONE_NEST);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "vile_wax_block"), VILE_WAX_BLOCK);

        //items

        //plants
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "warped_parsnip"), WARPED_PARSNIP);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "crimson_yam"), CRIMSON_YAM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "umbra_fennel"), UMBRA_FENNEL);

        //materials
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "raw_carnelium"), RAW_CARNELIUM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "carnelium_ingot"), CARNELIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "carnelium_nugget"), CARNELIUM_NUGGET);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "raw_anirrum"), RAW_ANIRRUM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_ingot"), ANIRRUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_nugget"), ANIRRUM_NUGGET);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "raw_orichalcum"), RAW_ORICHALCUM);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_ingot"), ORICHALCUM_INGOT);

        //misc
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "sulfur"), SULFUR);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "magmatic_rock"), MAGMATIC_ROCK);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "wart_bundle"), WART_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "demon_quartz"), DEMON_QUARTZ);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "rubber_ball"), RUBBER_BALL);

        //gear
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_sword"), ANIRRUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_shovel"), ANIRRUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_pickaxe"), ANIRRUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_axe"), ANIRRUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_hoe"), ANIRRUM_HOE);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_helmet"), ANIRRUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_chestplate"), ANIRRUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_leggings"), ANIRRUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "anirrum_boots"), ANIRRUM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_sword"), ORICHALCUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_shovel"), ORICHALCUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_pickaxe"), ORICHALCUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_axe"), ORICHALCUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_hoe"), ORICHALCUM_HOE);

        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_helmet"), ORICHALCUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_chestplate"), ORICHALCUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_leggings"), ORICHALCUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(OrdanasInferno.MOD_ID, "orichalcum_boots"), ORICHALCUM_BOOTS);
    }
}
