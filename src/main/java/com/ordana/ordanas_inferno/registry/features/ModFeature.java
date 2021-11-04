package com.ordana.ordanas_inferno.registry.features;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.HugeFungusFeature;
import net.minecraft.world.gen.feature.HugeFungusFeatureConfig;

public abstract class ModFeature<FC extends FeatureConfig>{
    public static final Feature<HugeFungusFeatureConfig> HUGE_FUNGUS;

    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return (F) Registry.register(Registry.FEATURE, name, feature);
    }

    static{
        HUGE_FUNGUS = register("huge_fungus", new HugeFungusFeature(HugeFungusFeatureConfig.CODEC));
    }
}
