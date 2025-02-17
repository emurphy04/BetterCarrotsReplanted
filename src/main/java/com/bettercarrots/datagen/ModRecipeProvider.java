package com.bettercarrots.datagen;

import com.bettercarrots.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        //DIAMOND
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_CARROT, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.DIAMOND_NUGGET)
                .input('Y', Items.CARROT)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.DIAMOND_CARROT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_NUGGET, 9)
                .input(Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.DIAMOND_NUGGET)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.DIAMOND, 1)
                .input(ModItems.DIAMOND_NUGGET, 9)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(consumer, new Identifier(getRecipeName(Items.DIAMOND)));
        //EMERALD
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_CARROT, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.EMERALD_NUGGET)
                .input('Y', Items.CARROT)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.EMERALD_CARROT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EMERALD_NUGGET, 9)
                .input(Items.EMERALD)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.EMERALD_NUGGET)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.EMERALD, 1)
                .input(ModItems.EMERALD_NUGGET, 9)
                .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                .offerTo(consumer, new Identifier(getRecipeName(Items.EMERALD)));
        //REDSTONE
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REDSTONE_CARROT, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.REDSTONE_NUGGET)
                .input('Y', Items.CARROT)
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.REDSTONE_CARROT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REDSTONE_NUGGET, 9)
                .input(Items.REDSTONE)
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.REDSTONE_NUGGET)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.REDSTONE, 1)
                .input(ModItems.REDSTONE_NUGGET, 9)
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(consumer, new Identifier(getRecipeName(Items.REDSTONE)));
        //LAPIS
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LAPIS_CARROT, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.LAPIS_NUGGET)
                .input('Y', Items.CARROT)
                .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.LAPIS_CARROT)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LAPIS_NUGGET, 9)
                .input(Items.LAPIS_LAZULI)
                .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.LAPIS_NUGGET)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LAPIS_LAZULI, 1)
                .input(ModItems.LAPIS_NUGGET, 9)
                .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                .offerTo(consumer, new Identifier(getRecipeName(Items.LAPIS_LAZULI)));
        //IRON
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_CARROT, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', Items.IRON_NUGGET)
                .input('Y', Items.CARROT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.IRON_CARROT)));
        //NETHERITE
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_CARROT, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.NETHERITE_NUGGET)
                .input('Y', Items.CARROT)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.NETHERITE_CARROT)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NETHERITE_NUGGET, 9)
                .input(Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.NETHERITE_NUGGET), conditionsFromItem(ModItems.NETHERITE_NUGGET))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.NETHERITE_NUGGET)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHERITE_INGOT, 1)
                .input(ModItems.NETHERITE_NUGGET, 9)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.DIAMOND))
                .offerTo(consumer, new Identifier(getRecipeName(Items.NETHERITE_INGOT)));
        //RILYNIUM
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RILYNIUM_CARROT, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.RILYNIUM_SHARD)
                .input('Y', Items.CARROT)
                .criterion(hasItem(ModItems.RILYNIUM_SHARD), conditionsFromItem(ModItems.RILYNIUM_SHARD))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RILYNIUM_CARROT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RILYNIUM_GEM, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.RILYNIUM_SHARD)
                .input('Y', Items.DIAMOND)
                .criterion(hasItem(ModItems.RILYNIUM_SHARD), conditionsFromItem(ModItems.RILYNIUM_SHARD))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RILYNIUM_GEM)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLANK_SMITHING_TEMPLATE, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.NETHERITE_NUGGET)
                .input('Y', Items.POLISHED_DIORITE)
                .criterion(hasItem(ModItems.NETHERITE_NUGGET), conditionsFromItem(ModItems.NETHERITE_NUGGET))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.BLANK_SMITHING_TEMPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE, 2)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.RILYNIUM_GEM)
                .input('Y', ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RILYNIUM_UPGRADE_SMITHING_TEMPLATE)));
    }
}
