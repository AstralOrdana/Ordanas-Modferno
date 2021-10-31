package com.ordana.ordanas_inferno.registry.materials;

import com.ordana.ordanas_inferno.registry.items.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class AnirrumArmorMaterial implements ArmorMaterial {

    private static final int[] DURABILITY = {390, 450, 480, 330};
    private static final int[] PROTECTION = {3, 6, 8, 3};
    public static final AnirrumArmorMaterial INSTANCE = new AnirrumArmorMaterial();

    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.ANIRRUM_INGOT);
    }

    @Override
    public String getName() {
        return "anirrum";
    }

    @Override
    public float getToughness() {
        return 1.5f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.5f;
    }
}
