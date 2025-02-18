package com.bettercarrots.item;

import com.bettercarrots.Bettercarrotsreplanted;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> RILYNIUM = registerArmorMaterial("rilynium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Bettercarrotsreplanted.MOD_ID, "rilynium"))), 3f,0.2f));

    public static final RegistryEntry<ArmorMaterial> FIRE_RILYNIUM = registerArmorMaterial("fire_rilynium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 8);
                map.put(ArmorItem.Type.LEGGINGS, 14);
                map.put(ArmorItem.Type.CHESTPLATE, 18);
                map.put(ArmorItem.Type.HELMET, 8);
                map.put(ArmorItem.Type.BODY, 20);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Bettercarrotsreplanted.MOD_ID, "fire_rilynium"))), 3f,0.2f));

    public static final RegistryEntry<ArmorMaterial> WATER_RILYNIUM = registerArmorMaterial("water_rilynium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 8);
                map.put(ArmorItem.Type.LEGGINGS, 14);
                map.put(ArmorItem.Type.CHESTPLATE, 18);
                map.put(ArmorItem.Type.HELMET, 8);
                map.put(ArmorItem.Type.BODY, 20);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Bettercarrotsreplanted.MOD_ID, "water_rilynium"))), 3f,0.2f));

    public static final RegistryEntry<ArmorMaterial> WIND_RILYNIUM = registerArmorMaterial("wind_rilynium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 8);
                map.put(ArmorItem.Type.LEGGINGS, 14);
                map.put(ArmorItem.Type.CHESTPLATE, 18);
                map.put(ArmorItem.Type.HELMET, 8);
                map.put(ArmorItem.Type.BODY, 20);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Bettercarrotsreplanted.MOD_ID, "wind_rilynium"))), 3f,0.2f));

    public static final RegistryEntry<ArmorMaterial> ELECTRIC_RILYNIUM = registerArmorMaterial("electric_rilynium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 8);
                map.put(ArmorItem.Type.LEGGINGS, 14);
                map.put(ArmorItem.Type.CHESTPLATE, 18);
                map.put(ArmorItem.Type.HELMET, 8);
                map.put(ArmorItem.Type.BODY, 20);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.RILYNIUM_GEM),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Bettercarrotsreplanted.MOD_ID, "electric_rilynium"))), 3f,0.2f));

    public static final RegistryEntry<ArmorMaterial> EMERALD = registerArmorMaterial("emerald",
            () -> new ArmorMaterial(Util.make(new EnumMap(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.EMERALD),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Bettercarrotsreplanted.MOD_ID, "emerald"))), 2.75f,0.05f));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(Bettercarrotsreplanted.MOD_ID, name), material.get());
    }
}
