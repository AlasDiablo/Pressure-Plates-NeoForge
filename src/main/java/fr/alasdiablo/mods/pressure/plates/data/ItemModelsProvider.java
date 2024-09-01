package fr.alasdiablo.mods.pressure.plates.data;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.PressurePlatesRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemModelsProvider extends ItemModelProvider {
    public ItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PressurePlates.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.pressurePlate(
                PressurePlatesRegistries.OBSIDIAN_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/obsidian")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_OBSIDIAN_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/obsidian")
        );

        this.pressurePlate(
                PressurePlatesRegistries.MOSSY_COBBLESTONE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/mossy_cobblestone")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/mossy_cobblestone")
        );

        this.pressurePlate(
                PressurePlatesRegistries.NETHERRACK_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/netherrack")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_NETHERRACK_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/netherrack")
        );

        this.pressurePlate(
                PressurePlatesRegistries.DIRT_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/dirt")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_DIRT_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/dirt")
        );

        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_OAK_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/oak_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_SPRUCE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/spruce_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_BIRCH_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/birch_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_JUNGLE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/jungle_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_ACACIA_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/acacia_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_OAK_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/oak_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_DARK_OAK_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/dark_oak_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_MANGROVE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/mangrove_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_CHERRY_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/cherry_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_BAMBOO_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/bamboo_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_CRIMSON_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/crimson_planks")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_WARPED_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/warped_planks")
        );

        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_STONE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/stone")
        );
        this.silentPressurePlate(
                PressurePlatesRegistries.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE,
                ResourceLocation.withDefaultNamespace("block/polished_blackstone")
        );
    }

    private void silentPressurePlate(String name, ResourceLocation texture) {
        singleTexture(name, modLoc("block/silent_pressure_plate_up"), texture);
    }
}
