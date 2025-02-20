package com.bettercarrots.datagen;

import com.bettercarrots.Bettercarrotsreplanted;
import com.bettercarrots.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter consumer) {
            //DIAMOND
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_CARROT, 1)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', ModItems.DIAMOND_NUGGET)
                    .input('Y', Items.CARROT)
                    .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "diamond_carrot"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_NUGGET, 9)
                    .input(Items.DIAMOND)
                    .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "diamond_nugget"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.DIAMOND, 1)
                    .input(ModItems.DIAMOND_NUGGET, 9)
                    .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "diamond_from_diamond_nugget"));
            // EMERALD
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_CARROT, 1)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', ModItems.EMERALD_NUGGET)
                    .input('Y', Items.CARROT)
                    .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "emerald_carrot"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_NUGGET, 9)
                    .input(Items.EMERALD)
                    .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "emerald_nugget"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.EMERALD, 1)
                    .input(ModItems.EMERALD_NUGGET, 9)
                    .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "emerald_from_emerald_nugget"));

            // REDSTONE
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REDSTONE_CARROT, 1)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', ModItems.REDSTONE_NUGGET)
                    .input('Y', Items.CARROT)
                    .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "redstone_carrot"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REDSTONE_NUGGET, 9)
                    .input(Items.REDSTONE)
                    .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "redstone_nugget"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.REDSTONE, 1)
                    .input(ModItems.REDSTONE_NUGGET, 9)
                    .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "redstone_from_redstone_nugget"));

            // LAPIS
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LAPIS_CARROT, 1)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', ModItems.LAPIS_NUGGET)
                    .input('Y', Items.CARROT)
                    .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "lapis_carrot"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LAPIS_NUGGET, 9)
                    .input(Items.LAPIS_LAZULI)
                    .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "lapis_nugget"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LAPIS_LAZULI, 1)
                    .input(ModItems.LAPIS_NUGGET, 9)
                    .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "lapis_from_lapis_nugget"));

            // IRON
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_CARROT, 1)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', Items.IRON_NUGGET)
                    .input('Y', Items.CARROT)
                    .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "iron_carrot"));

            // NETHERITE
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_CARROT, 1)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', ModItems.NETHERITE_NUGGET)
                    .input('Y', Items.CARROT)
                    .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "netherite_carrot"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_NUGGET, 9)
                    .input(Items.NETHERITE_INGOT)
                    .criterion(hasItem(ModItems.NETHERITE_NUGGET), conditionsFromItem(ModItems.NETHERITE_NUGGET))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "netherite_nugget"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHERITE_INGOT, 1)
                    .input(ModItems.NETHERITE_NUGGET, 9)
                    .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.DIAMOND))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "netherite_from_netherite_nugget"));

            // RILYNIUM
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RILYNIUM_CARROT, 1)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', ModItems.RILYNIUM_SHARD)
                    .input('Y', Items.CARROT)
                    .criterion(hasItem(ModItems.RILYNIUM_SHARD), conditionsFromItem(ModItems.RILYNIUM_SHARD))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "rilynium_carrot"));

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RILYNIUM_GEM, 1)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', ModItems.RILYNIUM_SHARD)
                    .input('Y', Items.DIAMOND)
                    .criterion(hasItem(ModItems.RILYNIUM_SHARD), conditionsFromItem(ModItems.RILYNIUM_SHARD))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "rilynium_gem"));

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLANK_SMITHING_TEMPLATE, 1)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', ModItems.NETHERITE_NUGGET)
                    .input('Y', Items.POLISHED_DIORITE)
                    .criterion(hasItem(ModItems.NETHERITE_NUGGET), conditionsFromItem(ModItems.NETHERITE_NUGGET))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "blank_smithing_template"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.RILYNIUM_GEM)
                .input('Y', ModItems.BLANK_SMITHING_TEMPLATE)
                .criterion(hasItem(ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "rilynium_upgrade_smithing_template_from_blank"));

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE, 2)
                    .pattern("XXX")
                    .pattern("XYX")
                    .pattern("XXX")
                    .input('X', ModItems.RILYNIUM_GEM)
                    .input('Y', ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE)
                    .criterion(hasItem(ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "rilynium_upgrade_smithing_template"));
            //Emerald Armor
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_HELMET, 1)
                    .pattern("XXX")
                    .pattern("X X")
                    .pattern("   ")
                    .input('X', Items.EMERALD)
                    .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "emerald_helmet"));

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_CHESTPLATE, 1)
                    .pattern("X X")
                    .pattern("XXX")
                    .pattern("XXX")
                    .input('X', Items.EMERALD)
                    .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "emerald_chestplate"));

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_LEGGINGS, 1)
                    .pattern("XXX")
                    .pattern("X X")
                    .pattern("X X")
                    .input('X', Items.EMERALD)
                    .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "emerald_leggings"));

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.EMERALD, 1)
                    .pattern("   ")
                    .pattern("X X")
                    .pattern("X X")
                    .input('X', Items.EMERALD)
                    .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                    .offerTo(consumer, Identifier.of(Bettercarrotsreplanted.MOD_ID, "emerald_boots"));
    }
}

