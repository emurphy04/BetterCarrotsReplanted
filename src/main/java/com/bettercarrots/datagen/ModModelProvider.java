package com.bettercarrots.datagen;

import com.bettercarrots.item.ModBlocks;
import com.bettercarrots.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RILYNIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RILYNIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DIAMOND_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPIS_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDSTONE_CARROT, Models.GENERATED);

        itemModelGenerator.register(ModItems.DIAMOND_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAPIS_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDSTONE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RILYNIUM_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RILYNIUM_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RILYNIUM_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLANK_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_ELECTRIC_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_ELECTRIC_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_ELECTRIC_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_ELECTRIC_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_FIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_FIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_FIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_FIRE_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_WATER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_WATER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_WATER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_WATER_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_WIND_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_WIND_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_WIND_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_WIND_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_BOOTS));


    }
}
