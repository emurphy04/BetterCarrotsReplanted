package com.bettercarrots.item;

import com.bettercarrots.Bettercarrotsreplanted;
import com.bettercarrots.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.item.*;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;


public class ModItems {

    //diamond
    public static final Item DIAMOND_CARROT = registerItem("diamond_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.DIAMOND_CARROT)));
    public static final Item DIAMOND_NUGGET = registerItem("diamond_nugget", new Item(new FabricItemSettings()));

    //iron
    public static final Item IRON_CARROT = registerItem("iron_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.IRON_CARROT)));

    //lapis
    public static final Item LAPIS_CARROT = registerItem("lapis_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.LAPIS_CARROT)));
    public static final Item LAPIS_NUGGET = registerItem("lapis_nugget", new Item(new FabricItemSettings()));

    //redstone
    public static final Item REDSTONE_CARROT = registerItem("redstone_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.REDSTONE_CARROT)));
    public static final Item REDSTONE_NUGGET = registerItem("redstone_nugget", new Item(new FabricItemSettings()));

    //netherite
    public static final Item NETHERITE_CARROT = registerItem("netherite_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.NETHERITE_CARROT)));
    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget", new Item(new FabricItemSettings()));

    //rilynium
    public static final Item RILYNIUM_CARROT = registerItem("rilynium_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.RILYNIUM_CARROT)));
    public static final Item RILYNIUM_SHARD = registerItem("rilynium_shard", new Item(new FabricItemSettings()));
    public static final Item RILYNIUM_GEM = registerItem("rilynium_gem", new Item(new FabricItemSettings()));

    //rilynium armor
    //base
    public static final Item RILYNIUM_HELMET = registerItem("rilynium_helmet",
            new RilyniumArmorItem(ModArmorMaterials.RILYNIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RILYNIUM_CHESTPLATE = registerItem("rilynium_chestplate",
            new RilyniumArmorItem(ModArmorMaterials.RILYNIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RILYNIUM_LEGGINGS = registerItem("rilynium_leggings",
            new RilyniumArmorItem(ModArmorMaterials.RILYNIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RILYNIUM_BOOTS = registerItem("rilynium_boots",
            new RilyniumArmorItem(ModArmorMaterials.RILYNIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RILYNIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("rilynium_upgrade_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.bettercarrotsreplanted.rilynium_upgrade_smithing_template.applies_to"), // Tooltip text
                    Text.translatable("item.bettercarrotsreplanted.rilynium_upgrade_smithing_template.ingredients"), // Tooltip text
                    Text.translatable("item.bettercarrotsreplanted.rilynium_upgrade_smithing_template.description"), // Tooltip text
                    Text.translatable("item.bettercarrotsreplanted.rilynium_upgrade_smithing_template.base_slot_description"), // Tooltip text
                    Text.translatable("item.bettercarrotsreplanted.rilynium_upgrade_smithing_template.additions_slot_description"), // Tooltip text
                    List.of(), // Base items allowed (optional)
                    List.of()  // Addition items allowed (optional)
            )
    );
    public static final Item BLANK_SMITHING_TEMPLATE = registerItem("blank_smithing_template",
            new SmithingTemplateItem(
                    Text.translatable("item.bettercarrotsreplanted.blank_smithing_template.applies_to"), // Tooltip text
                    Text.translatable("item.bettercarrotsreplanted.blank_smithing_template.ingredients"), // Tooltip text
                    Text.translatable("item.bettercarrotsreplanted.blank_smithing_template.description"), // Tooltip text
                    Text.translatable("item.bettercarrotsreplanted.blank_smithing_template.base_slot_description"), // Tooltip text
                    Text.translatable("item.bettercarrotsreplanted.blank_smithing_template.additions_slot_description"), // Tooltip text
                    List.of(), // Base items allowed (optional)
                    List.of()  // Addition items allowed (optional)
            )
    );

    //fire
    public static final Item RILYNIUM_FIRE_HELMET = registerItem("rilynium_fire_helmet",
            new RilyniumFireArmorItem(ModArmorMaterials.FIRE_RILYNIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RILYNIUM_FIRE_CHESTPLATE = registerItem("rilynium_fire_chestplate",
            new RilyniumFireArmorItem(ModArmorMaterials.FIRE_RILYNIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RILYNIUM_FIRE_LEGGINGS = registerItem("rilynium_fire_leggings",
            new RilyniumFireArmorItem(ModArmorMaterials.FIRE_RILYNIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RILYNIUM_FIRE_BOOTS = registerItem("rilynium_fire_boots",
            new RilyniumFireArmorItem(ModArmorMaterials.FIRE_RILYNIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //wind
    public static final Item RILYNIUM_WIND_HELMET = registerItem("rilynium_wind_helmet",
            new RilyniumWindArmorItem(ModArmorMaterials.WIND_RILYNIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RILYNIUM_WIND_CHESTPLATE = registerItem("rilynium_wind_chestplate",
            new RilyniumWindArmorItem(ModArmorMaterials.WIND_RILYNIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RILYNIUM_WIND_LEGGINGS = registerItem("rilynium_wind_leggings",
            new RilyniumWindArmorItem(ModArmorMaterials.WIND_RILYNIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RILYNIUM_WIND_BOOTS = registerItem("rilynium_wind_boots",
            new RilyniumWindArmorItem(ModArmorMaterials.WIND_RILYNIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //water
    public static final Item RILYNIUM_WATER_HELMET = registerItem("rilynium_water_helmet",
            new RilyniumWaterArmorItem(ModArmorMaterials.WATER_RILYNIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RILYNIUM_WATER_CHESTPLATE = registerItem("rilynium_water_chestplate",
            new RilyniumWaterArmorItem(ModArmorMaterials.WATER_RILYNIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RILYNIUM_WATER_LEGGINGS = registerItem("rilynium_water_leggings",
            new RilyniumWaterArmorItem(ModArmorMaterials.WATER_RILYNIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RILYNIUM_WATER_BOOTS = registerItem("rilynium_water_boots",
            new RilyniumWaterArmorItem(ModArmorMaterials.WATER_RILYNIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //electric
    public static final Item RILYNIUM_ELECTRIC_HELMET = registerItem("rilynium_electric_helmet",
            new RilyniumElectricArmorItem(ModArmorMaterials.ELECTRIC_RILYNIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RILYNIUM_ELECTRIC_CHESTPLATE = registerItem("rilynium_electric_chestplate",
            new RilyniumElectricArmorItem(ModArmorMaterials.ELECTRIC_RILYNIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RILYNIUM_ELECTRIC_LEGGINGS = registerItem("rilynium_electric_leggings",
            new RilyniumElectricArmorItem(ModArmorMaterials.ELECTRIC_RILYNIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RILYNIUM_ELECTRIC_BOOTS = registerItem("rilynium_electric_boots",
            new RilyniumElectricArmorItem(ModArmorMaterials.ELECTRIC_RILYNIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //rilynium tools

    //emerald
    public static final Item EMERALD_CARROT = registerItem("emerald_carrot", new Item(new FabricItemSettings().food(ModFoodComponents.EMERALD_CARROT)));
    public static final Item EMERALD_NUGGET = registerItem("emerald_nugget", new Item(new FabricItemSettings()));
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET,new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE,new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS,new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS,new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Bettercarrotsreplanted.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Bettercarrotsreplanted.LOGGER.info("Registering Mod Items");
    }
}
