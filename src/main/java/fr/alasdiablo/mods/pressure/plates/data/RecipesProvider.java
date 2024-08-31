package fr.alasdiablo.mods.pressure.plates.data;

import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RecipesProvider extends RecipeProvider {
    public RecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {

        pressurePlate(recipeOutput, PressurePlatesBlocks.OBSIDIAN_PRESSURE_PLATE.get(), Blocks.OBSIDIAN);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_OBSIDIAN_PRESSURE_PLATE.get(), Blocks.OBSIDIAN);

        pressurePlate(recipeOutput, PressurePlatesBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), Blocks.MOSSY_COBBLESTONE);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), Blocks.MOSSY_COBBLESTONE);

        pressurePlate(recipeOutput, PressurePlatesBlocks.NETHERRACK_PRESSURE_PLATE.get(), Blocks.NETHERRACK);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_NETHERRACK_PRESSURE_PLATE.get(), Blocks.NETHERRACK);

        pressurePlate(recipeOutput, PressurePlatesBlocks.DIRT_PRESSURE_PLATE.get(), Blocks.DIRT);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_DIRT_PRESSURE_PLATE.get(), Blocks.DIRT);

        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_OAK_PRESSURE_PLATE.get(), Blocks.OAK_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_SPRUCE_PRESSURE_PLATE.get(), Blocks.SPRUCE_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_BIRCH_PRESSURE_PLATE.get(), Blocks.BIRCH_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_JUNGLE_PRESSURE_PLATE.get(), Blocks.JUNGLE_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_ACACIA_PRESSURE_PLATE.get(), Blocks.ACACIA_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_DARK_OAK_PRESSURE_PLATE.get(), Blocks.DARK_OAK_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_MANGROVE_PRESSURE_PLATE.get(), Blocks.MANGROVE_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_CHERRY_PRESSURE_PLATE.get(), Blocks.CHERRY_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_BAMBOO_PRESSURE_PLATE.get(), Blocks.BAMBOO_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_CRIMSON_PRESSURE_PLATE.get(), Blocks.CRIMSON_PLANKS);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_WARPED_PRESSURE_PLATE.get(), Blocks.WARPED_PLANKS);

        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_STONE_PRESSURE_PLATE.get(), Blocks.STONE);
        silentPressurePlate(recipeOutput, PressurePlatesBlocks.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE.get(), Blocks.POLISHED_BLACKSTONE);
    }

    private static void silentPressurePlate(RecipeOutput recipeOutput, ItemLike pressurePlate, ItemLike material) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pressurePlate)
                .define('P', material)
                .define('W', ItemTags.WOOL)
                .pattern("P")
                .pattern("W")
                .unlockedBy(getHasName(material), has(material))
                .save(recipeOutput);
    }
}
