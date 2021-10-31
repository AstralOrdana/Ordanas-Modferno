package com.ordana.ordanas_inferno.registry.materials;

import com.ordana.ordanas_inferno.registry.items.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class OrichalcumArmorMaterial implements ArmorMaterial {

    private static final int[] DURABILITY = {500, 520, 550, 380};
    private static final int[] PROTECTION = {2, 5, 7, 2};
    public static final OrichalcumArmorMaterial INSTANCE = new OrichalcumArmorMaterial();

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
        return 40;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.ORICHALCUM_INGOT);
    }

    @Override
    public String getName() {
        return "orichalcum";
    }

    @Override
    public float getToughness() {
        return 2f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
