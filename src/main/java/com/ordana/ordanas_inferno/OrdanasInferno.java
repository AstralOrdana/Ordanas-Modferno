package com.ordana.ordanas_inferno;

import com.ordana.ordanas_inferno.registry.blocks.ModBlocks;
import com.ordana.ordanas_inferno.registry.blocks.ModOreFeatureConfig;
import com.ordana.ordanas_inferno.registry.features.ModMoonstone;
import com.ordana.ordanas_inferno.registry.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.GlowstoneBlobFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.TrapezoidHeightProvider;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrdanasInferno implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("ordanas_inferno");

    public static final String MOD_ID = "ordanas_inferno";
    public static final ItemGroup INFERNO_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "inferno_blocks"),() -> new ItemStack(ModItems.SCORIA));
    public static final ItemGroup INFERNO_ORGANICS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "inferno_organics"),() -> new ItemStack(ModItems.CRIMSON_WARTCAP));
    public static final ItemGroup INFERNO_MATERIALS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "inferno_materials"),() -> new ItemStack(ModItems.MAGMATIC_ROCK));
    public static final ItemGroup INFERNO_GEAR = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "inferno_gear"),() -> new ItemStack(ModItems.ANIRRUM_PICKAXE));

    private static ConfiguredFeature<?, ?> ORE_SCORIA = Feature.ORE
            .configure(new OreFeatureConfig(
                    ModOreFeatureConfig.Rules.NETHERRACK,
                    ModBlocks.SCORIA.getDefaultState(),
                    64))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(35))))
            .spreadHorizontally()
            .repeat(128);

    private static ConfiguredFeature<?, ?> ORE_CARNELIUM_BASALT = Feature.ORE
            .configure(new OreFeatureConfig(
                    ModOreFeatureConfig.Rules.BASALT,
                    ModBlocks.BASALTIC_CARNELIUM_ORE.getDefaultState(),
                    16))
            .range(new RangeDecoratorConfig(
                    TrapezoidHeightProvider.create(YOffset.fixed(-256), YOffset.fixed(256))))
            .spreadHorizontally()
            .repeat(32);

    private static ConfiguredFeature<?, ?> ORE_CARNELIUM_BLACKSTONE = Feature.ORE
            .configure(new OreFeatureConfig(
                    ModOreFeatureConfig.Rules.BLACKSTONE,
                    ModBlocks.CARNELIUM_ORE.getDefaultState(),
                    8))
            .range(new RangeDecoratorConfig(
                    TrapezoidHeightProvider.create(YOffset.fixed(-256), YOffset.fixed(256))))
            .spreadHorizontally()
            .repeat(32);

    private static ConfiguredFeature<?, ?> ORE_ANIRRUM = Feature.ORE
            .configure(new OreFeatureConfig(
                    ModOreFeatureConfig.Rules.SOUL,
                    ModBlocks.ANIRRUM_ORE.getDefaultState(),
                    10))
            .range(new RangeDecoratorConfig(
                    TrapezoidHeightProvider.create(YOffset.fixed(0), YOffset.fixed(128))))
            .spreadHorizontally()
            .repeat(32);



    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        FuelRegistry.INSTANCE.add(ModItems.MAGMATIC_ROCK, 1600);

        LOGGER.info("Hello Fabric world!");

        RegistryKey<ConfiguredFeature<?, ?>> oreScoria = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("ordanas_inferno", "ore_scoria"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreScoria.getValue(), ORE_SCORIA);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreScoria);

        RegistryKey<ConfiguredFeature<?, ?>> oreCarneliumBasalt = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("ordanas_inferno", "ore_carnelium_basalt"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCarneliumBasalt.getValue(), ORE_CARNELIUM_BASALT);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarneliumBasalt);

        RegistryKey<ConfiguredFeature<?, ?>> oreCarneliumBlackstone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("ordanas_inferno", "ore_carnelium_blackstone"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCarneliumBlackstone.getValue(), ORE_CARNELIUM_BLACKSTONE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreCarneliumBlackstone);

        RegistryKey<ConfiguredFeature<?, ?>> oreAnirrum = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("ordanas_inferno", "ore_anirrum"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAnirrum.getValue(), ORE_ANIRRUM);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreAnirrum);
    }
}
