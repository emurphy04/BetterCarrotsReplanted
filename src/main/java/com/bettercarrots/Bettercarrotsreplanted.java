package com.bettercarrots;

import com.bettercarrots.datagen.ModWorldGenerator;
import com.bettercarrots.item.ModBlocks;
import com.bettercarrots.item.ModItemGroups;
import com.bettercarrots.item.ModItems;
import com.bettercarrots.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bettercarrotsreplanted implements ModInitializer {
	public static final String MOD_ID = "bettercarrotsreplanted";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();
	}
}