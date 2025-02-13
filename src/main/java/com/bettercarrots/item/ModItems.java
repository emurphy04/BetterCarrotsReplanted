package com.bettercarrots.item;

import com.bettercarrots.Bettercarrotsreplanted;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
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

    //iron
    public static final Item IRON_CARROT = registerItem("iron_carrot", new Item(new FabricItemSettings()));

    //lapis
    public static final Item LAPIS_CARROT = registerItem("lapis_carrot", new Item(new FabricItemSettings()));

    //redstone
    public static final Item REDSTONE_CARROT = registerItem("redstone_carrot", new Item(new FabricItemSettings()));

    //netherite
    public static final Item NETHERITE_CARROT = registerItem("netherite_carrot", new Item(new FabricItemSettings()));

    //rilynium
    public static final Item RILYNIUM_CARROT = registerItem("rilynium_carrot", new Item(new FabricItemSettings()));

    //emerald
    public static final Item EMERALD_CARROT = registerItem("emerald_carrot", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Bettercarrotsreplanted.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Bettercarrotsreplanted.LOGGER.info("Registering Mod Items");
    }
}
