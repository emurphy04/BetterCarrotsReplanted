package com.bettercarrots.datagen;

import com.bettercarrots.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
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
        //REDSTONE
        //LAPIS
        //GOLD
        //IRON
        //NETHERITE
        //RILYNIUM
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RILYNIUM_GEM, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', ModItems.RILYNIUM_SHARD)
                .input('Y', Items.DIAMOND)
                .criterion(hasItem(ModItems.RILYNIUM_SHARD), conditionsFromItem(ModItems.RILYNIUM_SHARD))
                .offerTo(consumer, new Identifier(getRecipeName(ModItems.RILYNIUM_SHARD)));
    }
}
