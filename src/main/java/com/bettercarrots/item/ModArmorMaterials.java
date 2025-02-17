package com.bettercarrots.item;

import com.bettercarrots.Bettercarrotsreplanted;
import net.minecraft.client.sound.Sound;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    ELECTRIC_RILYNIUM("electric_rilynium", 55, new int[] {10, 15, 13, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5f, 0.2f, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM)),
    FIRE_RILYNIUM("fire_rilynium", 55, new int[] {10, 15, 13, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5f, 0.2f, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM)),
    WATER_RILYNIUM("water_rilynium", 55, new int[] {10, 15, 13, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5f, 0.2f, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM)),
    WIND_RILYNIUM("wind_rilynium", 55, new int[] {10, 15, 13, 10}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5f, 0.2f, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM)),
    RILYNIUM("rilynium", 50, new int[] {9, 14, 12, 9}, 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3f, 0.1f, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM)),
    EMERALD("emerald", 35, new int[] {3, 8, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.0f, () -> Ingredient.ofItems(Items.EMERALD));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Bettercarrotsreplanted.MOD_ID+":"+this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
