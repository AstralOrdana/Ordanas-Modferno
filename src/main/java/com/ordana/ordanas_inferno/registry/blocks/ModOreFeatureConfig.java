package com.ordana.ordanas_inferno.registry.blocks;

import com.ordana.ordanas_inferno.registry.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModOreFeatureConfig extends OreFeatureConfig {

    public static final class Rules {
        public static final RuleTest BASE_STONE_OVERWORLD;
        public static final RuleTest STONE_ORE_REPLACEABLES;
        public static final RuleTest DEEPSLATE_ORE_REPLACEABLES;
        public static final RuleTest NETHERRACK;
        public static final RuleTest BASE_STONE_NETHER;
        public static final RuleTest BASALT;
        public static final RuleTest BLACKSTONE;
        public static final RuleTest SOUL;

        public Rules() {
        }

        static {
            BASE_STONE_OVERWORLD = new TagMatchRuleTest(BlockTags.BASE_STONE_OVERWORLD);
            STONE_ORE_REPLACEABLES = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
            DEEPSLATE_ORE_REPLACEABLES = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
            NETHERRACK = new BlockMatchRuleTest(Blocks.NETHERRACK);
            BASE_STONE_NETHER = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
            BASALT = new BlockMatchRuleTest(Blocks.BASALT);
            BLACKSTONE = new BlockMatchRuleTest(Blocks.BLACKSTONE);
            SOUL = new BlockMatchRuleTest(Blocks.SOUL_SOIL);
        }
    }

    public ModOreFeatureConfig(List<Target> targets, int size, float discardOnAirChance) {
        super(targets, size, discardOnAirChance);
    }
}
