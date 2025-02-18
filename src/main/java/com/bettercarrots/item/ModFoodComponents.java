package com.bettercarrots.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DIAMOND_CARROT = new FoodComponent.Builder().alwaysEdible().nutrition(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2000, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000, 2), 1f)
            .build();
    public static final FoodComponent REDSTONE_CARROT = new FoodComponent.Builder().alwaysEdible().nutrition(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1), 1f)
            .build();
    public static final FoodComponent NETHERITE_CARROT = new FoodComponent.Builder().alwaysEdible().nutrition(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000, 5), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2000, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000, 5), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 800, 2), 1f)
            .build();
    public static final FoodComponent IRON_CARROT = new FoodComponent.Builder().alwaysEdible().nutrition(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 800, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 800, 2), 1f)
            .build();
    public static final FoodComponent LAPIS_CARROT = new FoodComponent.Builder().alwaysEdible().nutrition(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 800, 1), 1f)
            .build();
    public static final FoodComponent EMERALD_CARROT = new FoodComponent.Builder().alwaysEdible().nutrition(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 800, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 800, 3), 1f)
            .build();
    public static final FoodComponent RILYNIUM_CARROT = new FoodComponent.Builder().alwaysEdible().nutrition(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2000, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 800, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 800, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 800, 2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 800, 1), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 800, 3), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 800, 1), 1f)
            .build();
}
