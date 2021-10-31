package com.ordana.ordanas_inferno.registry.materials;

import com.ordana.ordanas_inferno.OrdanasInferno;
import com.ordana.ordanas_inferno.registry.items.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AnirrumToolMaterial implements ToolMaterial {

    public static final AnirrumToolMaterial INSTANCE = new AnirrumToolMaterial();

    public int getDurability() {
        return 500;
    }


    public float getMiningSpeedMultiplier() {
        return 8f;
    }


    public float getAttackDamage() {
        return 1f;
    }


    public int getMiningLevel() {
        return 3;
    }


    public int getEnchantability() {
        return 20;
    }


    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.ANIRRUM_INGOT);
    }
}
