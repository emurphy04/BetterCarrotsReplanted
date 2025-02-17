package com.bettercarrots.item;

import com.bettercarrots.Bettercarrotsreplanted;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BETTERCARROTSGROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Bettercarrotsreplanted.MOD_ID, "bettercarrotsgroup"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bettercarrotsreplanted")).icon(() -> new ItemStack(ModItems.RILYNIUM_CARROT)).entries((displayContext, entries) -> {

        //Diamond
        entries.add(ModItems.DIAMOND_CARROT);
        entries.add(ModItems.DIAMOND_NUGGET);

        //Iron
        entries.add(ModItems.IRON_CARROT);

        //Lapis
        entries.add(ModItems.LAPIS_CARROT);
        entries.add(ModItems.LAPIS_NUGGET);

        //Redstone
        entries.add(ModItems.REDSTONE_CARROT);
        entries.add(ModItems.REDSTONE_NUGGET);

        //Emerald
        entries.add(ModItems.EMERALD_CARROT);
        entries.add(ModItems.EMERALD_NUGGET);
        entries.add(ModItems.EMERALD_HELMET);
        entries.add(ModItems.EMERALD_CHESTPLATE);
        entries.add(ModItems.EMERALD_LEGGINGS);
        entries.add(ModItems.EMERALD_BOOTS);

        //Netherite
        entries.add(ModItems.NETHERITE_CARROT);
        entries.add(ModItems.NETHERITE_NUGGET);

        //Rilynium
        entries.add(ModItems.RILYNIUM_CARROT);
        entries.add(ModItems.RILYNIUM_SHARD);
        entries.add(ModItems.RILYNIUM_GEM);
        entries.add(ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE);
        entries.add(ModItems.RILYNIUM_HELMET);
        entries.add(ModItems.RILYNIUM_CHESTPLATE);
        entries.add(ModItems.RILYNIUM_LEGGINGS);
        entries.add(ModItems.RILYNIUM_BOOTS);

        entries.add(ModItems.RILYNIUM_FIRE_HELMET);
        entries.add(ModItems.RILYNIUM_FIRE_CHESTPLATE);
        entries.add(ModItems.RILYNIUM_FIRE_LEGGINGS);
        entries.add(ModItems.RILYNIUM_FIRE_BOOTS);

        entries.add(ModItems.RILYNIUM_WATER_HELMET);
        entries.add(ModItems.RILYNIUM_WATER_CHESTPLATE);
        entries.add(ModItems.RILYNIUM_WATER_LEGGINGS);
        entries.add(ModItems.RILYNIUM_WATER_BOOTS);

        entries.add(ModItems.RILYNIUM_ELECTRIC_HELMET);
        entries.add(ModItems.RILYNIUM_ELECTRIC_CHESTPLATE);
        entries.add(ModItems.RILYNIUM_ELECTRIC_LEGGINGS);
        entries.add(ModItems.RILYNIUM_ELECTRIC_BOOTS);

        entries.add(ModItems.RILYNIUM_WIND_HELMET);
        entries.add(ModItems.RILYNIUM_WIND_CHESTPLATE);
        entries.add(ModItems.RILYNIUM_WIND_LEGGINGS);
        entries.add(ModItems.RILYNIUM_WIND_BOOTS);

        entries.add(ModBlocks.RILYNIUM_ORE);
        entries.add(ModBlocks.DEEPSLATE_RILYNIUM_ORE);

        entries.add(ModItems.BLANK_SMITHING_TEMPLATE);

    }).build());

    public static void registerItemGroups(){
        Bettercarrotsreplanted.LOGGER.info("Registering Item Groups");
    }
}
