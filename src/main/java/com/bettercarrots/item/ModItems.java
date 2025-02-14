package com.bettercarrots.item;

import com.bettercarrots.Bettercarrotsreplanted;
import com.bettercarrots.item.custom.RilyniumArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TEST = registerItem("test", new Item(new FabricItemSettings()));
    //diamond
    public static final Item DIAMOND_CARROT = registerItem("diamond_carrot", new Item(new FabricItemSettings()));
    public static final Item DIAMOND_NUGGET = registerItem("diamond_nugget", new Item(new FabricItemSettings()));

    //iron
    public static final Item IRON_CARROT = registerItem("iron_carrot", new Item(new FabricItemSettings()));

    //lapis
    public static final Item LAPIS_CARROT = registerItem("lapis_carrot", new Item(new FabricItemSettings()));
    public static final Item LAPIS_NUGGET = registerItem("lapis_nugget", new Item(new FabricItemSettings()));

    //redstone
    public static final Item REDSTONE_CARROT = registerItem("redstone_carrot", new Item(new FabricItemSettings()));
    public static final Item REDSTONE_NUGGET = registerItem("redstone_nugget", new Item(new FabricItemSettings()));

    //netherite
    public static final Item NETHERITE_CARROT = registerItem("netherite_carrot", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget", new Item(new FabricItemSettings()));

    //rilynium
    public static final Item RILYNIUM_CARROT = registerItem("rilynium_carrot", new Item(new FabricItemSettings()));
    public static final Item RILYNIUM_SHARD = registerItem("rilynium_shard", new Item(new FabricItemSettings()));
    public static final Item RILYNIUM_GEM = registerItem("rilynium_gem", new Item(new FabricItemSettings()));

    //rilynium armor
    public static final Item RILYNIUM_HELMET = registerItem("rilynium_helmet",
            new RilyniumArmorItem(ModArmorMaterials.RILYNIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RILYNIUM_CHESTPLATE = registerItem("rilynium_chestplate",
            new RilyniumArmorItem(ModArmorMaterials.RILYNIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RILYNIUM_LEGGINGS = registerItem("rilynium_leggings",
            new RilyniumArmorItem(ModArmorMaterials.RILYNIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RILYNIUM_BOOTS = registerItem("rilynium_boots",
            new RilyniumArmorItem(ModArmorMaterials.RILYNIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    //rilynium tools

    //emerald
    public static final Item EMERALD_CARROT = registerItem("emerald_carrot", new Item(new FabricItemSettings()));
    public static final Item EMERALD_NUGGET = registerItem("emerald_nugget", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Bettercarrotsreplanted.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Bettercarrotsreplanted.LOGGER.info("Registering Mod Items");
    }
}
