package com.bettercarrots.datagen;

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

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RILYNIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_BOOTS));
    }
}
