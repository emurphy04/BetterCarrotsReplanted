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

        //Iron
        entries.add(ModItems.IRON_CARROT);

        //Lapis
        entries.add(ModItems.LAPIS_CARROT);

        //Redstone
        entries.add(ModItems.REDSTONE_CARROT);

        //Emerald
        entries.add(ModItems.EMERALD_CARROT);

        //Netherite
        entries.add(ModItems.NETHERITE_CARROT);

        //Rilynium
        entries.add(ModItems.RILYNIUM_CARROT);

    }).build());

    public static void registerItemGroups(){
        Bettercarrotsreplanted.LOGGER.info("Registering Item Groups");
    }
}
