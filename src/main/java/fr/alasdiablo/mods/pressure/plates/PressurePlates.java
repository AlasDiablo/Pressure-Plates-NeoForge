package fr.alasdiablo.mods.pressure.plates;

import com.mojang.logging.LogUtils;
import fr.alasdiablo.mods.pressure.plates.data.lang.LanguagesProvider;
import fr.alasdiablo.mods.pressure.plates.data.loot.LootsTablesProvider;
import fr.alasdiablo.mods.pressure.plates.data.model.BlockModelProvider;
import fr.alasdiablo.mods.pressure.plates.data.recipe.RecipesProvider;
import fr.alasdiablo.mods.pressure.plates.data.tag.BlocksTagsProvider;
import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(PressurePlates.MOD_ID)
public class PressurePlates {
    public static final String MOD_ID = "dio_pressure_plates";
    public static final Logger LOGGER = LogUtils.getLogger();

    public PressurePlates(@NotNull IEventBus modEventBus, ModContainer modContainer) {
        PressurePlatesBlocks.init(modEventBus);

        modEventBus.addListener(this::gatherData);
        modEventBus.addListener(PressurePlatesBlocks::onCreativeModeTabEvent);
    }


    private void gatherData(@NotNull GatherDataEvent.Client event) {
        PressurePlates.LOGGER.debug("Start data generator");

        PressurePlates.LOGGER.debug("Add Client Provider");

        PressurePlates.LOGGER.debug("Add Block State and Block Model Provider");
        event.createProvider(BlockModelProvider::new);

        // PressurePlates.LOGGER.debug("Add Item Model Provider");
        // event.createProvider(ItemModelsProvider::new);

        PressurePlates.LOGGER.debug("Add Language Provider");
        event.createProvider(LanguagesProvider.French.Canada::new);
        event.createProvider(LanguagesProvider.French.France::new);

        event.createProvider(LanguagesProvider.English.Australia::new);
        event.createProvider(LanguagesProvider.English.Canada::new);
        event.createProvider(LanguagesProvider.English.NewZealand::new);
        event.createProvider(LanguagesProvider.English.UnitedKingdom::new);
        event.createProvider(LanguagesProvider.English.UnitedStates::new);

        PressurePlates.LOGGER.debug("Add Server Provider");

        PressurePlates.LOGGER.debug("Start server data generator");

        PressurePlates.LOGGER.debug("Add LootTable Provider");
        event.createProvider(LootsTablesProvider::new);

        PressurePlates.LOGGER.debug("Add Tags Provider");
        event.createProvider(BlocksTagsProvider::new);

        PressurePlates.LOGGER.debug("Add Recipes Provider");
        event.createProvider(RecipesProvider.Runner::new);
    }
}
