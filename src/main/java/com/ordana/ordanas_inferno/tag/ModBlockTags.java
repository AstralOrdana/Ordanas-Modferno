package com.ordana.ordanas_inferno.tag;

import net.minecraft.block.Block;
import net.minecraft.tag.RequiredTagList;
import net.minecraft.tag.RequiredTagListRegistry;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagGroup;
import net.minecraft.util.registry.Registry;

public final class ModBlockTags {
    protected static final RequiredTagList<Block> REQUIRED_TAGS;
    public static final Tag.Identified<Block> FERTILIZER;

    private ModBlockTags() {
    }

    private static Tag.Identified<Block> register(String id) {
        return REQUIRED_TAGS.add(id);
    }

    public static TagGroup<Block> getTagGroup() {
        return REQUIRED_TAGS.getGroup();
    }

    static{
        REQUIRED_TAGS = RequiredTagListRegistry.register(Registry.BLOCK_KEY, "tags/blocks");
        FERTILIZER = register("fertilizer");
    }
}
