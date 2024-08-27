package fr.alasdiablo.mods.pressure.plates;

import com.mojang.logging.LogUtils;
import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(PressurePlates.MOD_ID)
public class PressurePlates {
    public static final String MOD_ID = "dio_pressure_plates";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PressurePlates(@NotNull IEventBus modEventBus, ModContainer modContainer) {
        PressurePlatesBlocks.init(modEventBus);

        modEventBus.addListener(this::gatherData);
    }

    private void gatherData(@NotNull GatherDataEvent event) {
        PressurePlates.LOGGER.debug("Start data generator");
        final DataGenerator generator = event.getGenerator();
        final PackOutput output = generator.getPackOutput();
        final CompletableFuture<HolderLookup.Provider> lookup = event.getLookupProvider();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        PressurePlates.LOGGER.debug("Add Client Provider");

        PressurePlates.LOGGER.debug("Add Server Provider");
    }
}
