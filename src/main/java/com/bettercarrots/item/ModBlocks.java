package com.bettercarrots.item;

import com.bettercarrots.Bettercarrotsreplanted;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RILYNIUM_ORE = registerBlock("rilynium_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_RILYNIUM_ORE = registerBlock("deepslate_rilynium_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Bettercarrotsreplanted.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Bettercarrotsreplanted.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Bettercarrotsreplanted.LOGGER.info("Registering Blocks");
    }

}
