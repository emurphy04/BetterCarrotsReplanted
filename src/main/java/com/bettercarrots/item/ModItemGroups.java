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

        entries.add(ModItems.TEST);
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

    }).build());

    public static void registerItemGroups(){
        Bettercarrotsreplanted.LOGGER.info("Registering Item Groups");
    }
}
