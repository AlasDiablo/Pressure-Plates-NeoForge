package fr.alasdiablo.mods.pressure.plates.data.model;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.resources.Identifier;

import java.util.Optional;

public class ModModelTemplates {
    public static final ModelTemplate SILENT_PRESSURE_PLATE_UP = create("silent_pressure_plate_up", TextureSlot.TEXTURE);
    public static final ModelTemplate SILENT_PRESSURE_PLATE_DOWN = create("silent_pressure_plate_down", "_down", TextureSlot.TEXTURE);

    public static ModelTemplate create(String name, TextureSlot... requiredSlots) {
        Identifier location = Identifier.fromNamespaceAndPath(PressurePlates.MOD_ID, name).withPrefix("block/");
        return new ModelTemplate(Optional.of(location), Optional.empty(), requiredSlots);
    }

    public static ModelTemplate create(String name, String suffix, TextureSlot... requiredSlots) {
        Identifier location = Identifier.fromNamespaceAndPath(PressurePlates.MOD_ID, name).withPrefix("block/");
        return new ModelTemplate(Optional.of(location), Optional.of(suffix), requiredSlots);
    }
}
