package com.bettercarrots.datagen;

import com.bettercarrots.item.ModBlocks;
import com.bettercarrots.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput){
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RILYNIUM_ORE, oreDrops(ModBlocks.RILYNIUM_ORE, ModItems.RILYNIUM_SHARD));
        addDrop(ModBlocks.DEEPSLATE_RILYNIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_RILYNIUM_ORE, ModItems.RILYNIUM_SHARD));
    }
}
