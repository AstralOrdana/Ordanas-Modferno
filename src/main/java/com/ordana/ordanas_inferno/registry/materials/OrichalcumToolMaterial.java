package com.ordana.ordanas_inferno.registry.materials;

import com.ordana.ordanas_inferno.OrdanasInferno;
import com.ordana.ordanas_inferno.registry.items.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OrichalcumToolMaterial implements ToolMaterial {

    public static final OrichalcumToolMaterial INSTANCE = new OrichalcumToolMaterial();

    public int getDurability() {
        return 1900;
    }


    public float getMiningSpeedMultiplier() {
        return 9f;
    }


    public float getAttackDamage() {
        return 1f;
    }


    public int getMiningLevel() {
        return 4;
    }


    public int getEnchantability() {
        return 30;
    }


    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.ORICHALCUM_INGOT);
    }
}
