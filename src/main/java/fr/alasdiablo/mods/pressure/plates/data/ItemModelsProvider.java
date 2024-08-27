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
        this.pressurePlate(PressurePlatesRegistries.OBSIDIAN_PRESSURE_PLATE, ResourceLocation.withDefaultNamespace("block/obsidian"));
        this.pressurePlate(PressurePlatesRegistries.SILENCE_OBSIDIAN_PRESSURE_PLATE, ResourceLocation.withDefaultNamespace("block/obsidian"));

        this.pressurePlate(PressurePlatesRegistries.MOSSY_COBBLESTONE_PRESSURE_PLATE, ResourceLocation.withDefaultNamespace("block/mossy_cobblestone"));
        this.pressurePlate(PressurePlatesRegistries.SILENCE_MOSSY_COBBLESTONE_PRESSURE_PLATE, ResourceLocation.withDefaultNamespace("block/mossy_cobblestone"));
    }
}
