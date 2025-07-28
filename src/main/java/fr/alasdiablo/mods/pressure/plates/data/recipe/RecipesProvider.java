package fr.alasdiablo.mods.pressure.plates.data.recipe;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class RecipesProvider extends RecipeProvider {
    public RecipesProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        this.pressurePlate(PressurePlatesBlocks.OBSIDIAN_PRESSURE_PLATE.get(), Blocks.OBSIDIAN);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_OBSIDIAN_PRESSURE_PLATE.get(), Blocks.OBSIDIAN);

        this.pressurePlate(PressurePlatesBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), Blocks.MOSSY_COBBLESTONE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), Blocks.MOSSY_COBBLESTONE);

        this.pressurePlate(PressurePlatesBlocks.NETHERRACK_PRESSURE_PLATE.get(), Blocks.NETHERRACK);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_NETHERRACK_PRESSURE_PLATE.get(), Blocks.NETHERRACK);

        this.pressurePlate(PressurePlatesBlocks.DIRT_PRESSURE_PLATE.get(), Blocks.DIRT);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_DIRT_PRESSURE_PLATE.get(), Blocks.DIRT);

        this.silentPressurePlate(PressurePlatesBlocks.SILENT_OAK_PRESSURE_PLATE.get(), Blocks.OAK_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_SPRUCE_PRESSURE_PLATE.get(), Blocks.SPRUCE_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_BIRCH_PRESSURE_PLATE.get(), Blocks.BIRCH_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_JUNGLE_PRESSURE_PLATE.get(), Blocks.JUNGLE_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_ACACIA_PRESSURE_PLATE.get(), Blocks.ACACIA_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_DARK_OAK_PRESSURE_PLATE.get(), Blocks.DARK_OAK_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_MANGROVE_PRESSURE_PLATE.get(), Blocks.MANGROVE_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_CHERRY_PRESSURE_PLATE.get(), Blocks.CHERRY_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_BAMBOO_PRESSURE_PLATE.get(), Blocks.BAMBOO_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_CRIMSON_PRESSURE_PLATE.get(), Blocks.CRIMSON_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_WARPED_PRESSURE_PLATE.get(), Blocks.WARPED_PRESSURE_PLATE);

        this.silentPressurePlate(PressurePlatesBlocks.SILENT_STONE_PRESSURE_PLATE.get(), Blocks.STONE_PRESSURE_PLATE);
        this.silentPressurePlate(PressurePlatesBlocks.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE.get(), Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE);
    }

    private void silentPressurePlate(ItemLike pressurePlate, ItemLike material) {
        this.shaped(RecipeCategory.REDSTONE, pressurePlate)
                .define('P', material)
                .define('W', ItemTags.WOOL)
                .pattern("P")
                .pattern("W")
                .unlockedBy(getHasName(material), has(material))
                .save(this.output);

        this.shapeless(RecipeCategory.REDSTONE, material)
                .requires(pressurePlate)
                .unlockedBy(getHasName(pressurePlate), has(pressurePlate))
                .save(
                        this.output,
                        ResourceLocation.fromNamespaceAndPath(
                                PressurePlates.MOD_ID,
                                getItemName(material)
                        ).toString()
                );
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider provider, @NotNull RecipeOutput output) {
            return new RecipesProvider(provider, output);
        }

        @Override
        public @NotNull String getName() {
            return "Dio's Pressure Plates Recipes Provider";
        }
    }
}
