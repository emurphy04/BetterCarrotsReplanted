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

    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries){
        entries.add(TEST);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Bettercarrotsreplanted.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Bettercarrotsreplanted.LOGGER.info("Registering Mod Items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }
}
