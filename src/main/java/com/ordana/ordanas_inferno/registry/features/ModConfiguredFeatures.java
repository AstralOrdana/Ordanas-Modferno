package com.ordana.ordanas_inferno.registry.features;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<?, ?> CRIMSON_FUNGI;
    public static final ConfiguredFeature<HugeFungusFeatureConfig, ?> CRIMSON_FUNGI_PLANTED;

    public ModConfiguredFeatures() {
    }

    static DataPool.Builder<BlockState> pool() {
        return DataPool.builder();
    }

    private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String id, ConfiguredFeature<FC, ?> configuredFeature) {
        return (ConfiguredFeature) Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, id, configuredFeature);
    }

    static {
        CRIMSON_FUNGI = register("crimson_fungi", Feature.HUGE_FUNGUS.configure(HugeFungusFeatureConfig.CRIMSON_FUNGUS_NOT_PLANTED_CONFIG).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(8))));
        CRIMSON_FUNGI_PLANTED = register("crimson_fungi_planted", Feature.HUGE_FUNGUS.configure(HugeFungusFeatureConfig.CRIMSON_FUNGUS_CONFIG));
    }

    public static final class States {
        protected static final BlockState CRIMSON_FUNGUS;

        public States() {
        }

        static{
            CRIMSON_FUNGUS = Blocks.CRIMSON_FUNGUS.getDefaultState();
        }
    }
}
