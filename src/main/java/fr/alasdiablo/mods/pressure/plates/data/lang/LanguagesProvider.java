package fr.alasdiablo.mods.pressure.plates.data.lang;

import fr.alasdiablo.mods.pressure.plates.PressurePlates;
import fr.alasdiablo.mods.pressure.plates.registry.PressurePlatesBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class LanguagesProvider {

    private static abstract class Global extends LanguageProvider {
        protected Global(PackOutput output, String locale) {
            super(output, PressurePlates.MOD_ID, locale);
        }
    }

    public static class English {
        private static class Common extends Global {
            protected Common(PackOutput output, String locale) {
                super(output, locale);
            }

            @Override
            protected void addTranslations() {
                this.add(PressurePlatesBlocks.OBSIDIAN_PRESSURE_PLATE.get(), "Obsidian Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_OBSIDIAN_PRESSURE_PLATE.get(), "Silent Obsidian Pressure Plate");

                this.add(PressurePlatesBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), "Mossy Cobblestone Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), "Silent Mossy Cobblestone Pressure Plate");

                this.add(PressurePlatesBlocks.NETHERRACK_PRESSURE_PLATE.get(), "Netherrack Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_NETHERRACK_PRESSURE_PLATE.get(), "Silent Netherrack Pressure Plate");

                this.add(PressurePlatesBlocks.DIRT_PRESSURE_PLATE.get(), "Dirt Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_DIRT_PRESSURE_PLATE.get(), "Silent Dirt Pressure Plate");

                this.add("block.dio_pressure_plates.obsidian_pressure_plate.hover_text", "Only detect players");
                this.add("block.dio_pressure_plates.mossy_cobblestone_pressure_plate.hover_text", "Only detect living entities");
                this.add("block.dio_pressure_plates.netherrack_pressure_plate.hover_text", "Only detect enemy entities");
                this.add("block.dio_pressure_plates.dirt_pressure_plate.hover_text", "Only detect passive entities");

                this.add(PressurePlatesBlocks.SILENT_OAK_PRESSURE_PLATE.get(), "Silent Oak Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_SPRUCE_PRESSURE_PLATE.get(), "Silent Spruce Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_BIRCH_PRESSURE_PLATE.get(), "Silent Birch Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_JUNGLE_PRESSURE_PLATE.get(), "Silent Jungle Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_ACACIA_PRESSURE_PLATE.get(), "Silent Acacia Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_DARK_OAK_PRESSURE_PLATE.get(), "Silent Dark Oak Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_MANGROVE_PRESSURE_PLATE.get(), "Silent Mangrove Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_CHERRY_PRESSURE_PLATE.get(), "Silent Cherry Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_BAMBOO_PRESSURE_PLATE.get(), "Silent Bamboo Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_CRIMSON_PRESSURE_PLATE.get(), "Silent Crimson Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_WARPED_PRESSURE_PLATE.get(), "Silent Warped Pressure Plate");

                this.add(PressurePlatesBlocks.SILENT_STONE_PRESSURE_PLATE.get(), "Silent Stone Pressure Plate");
                this.add(PressurePlatesBlocks.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE.get(), "Silent Polished Blackstone Pressure Plate");
            }
        }

        public static class UnitedKingdom extends Common {
            public UnitedKingdom(PackOutput output) {
                super(output, "en_gb");
            }
        }

        public static class UnitedStates extends Common {
            public UnitedStates(PackOutput output) {
                super(output, "en_us");
            }
        }

        public static class Canada extends Common {
            public Canada(PackOutput output) {
                super(output, "en_ca");
            }
        }

        public static class Australia extends Common {
            public Australia(PackOutput output) {
                super(output, "en_au");
            }
        }

        public static class NewZealand extends Common {
            public NewZealand(PackOutput output) {
                super(output, "en_nz");
            }
        }
    }

    public static class French {
        private static class Common extends Global {
            protected Common(PackOutput output, String locale) {
                super(output, locale);
            }

            @Override
            protected void addTranslations() {
                this.add(PressurePlatesBlocks.OBSIDIAN_PRESSURE_PLATE.get(), "Plaque de pression en obsidienne");
                this.add(PressurePlatesBlocks.SILENT_OBSIDIAN_PRESSURE_PLATE.get(), "Plaque de pression en obsidienne silencieuse");

                this.add(PressurePlatesBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), "Plaque de pression en pierres moussues");
                this.add(PressurePlatesBlocks.SILENT_MOSSY_COBBLESTONE_PRESSURE_PLATE.get(), "Plaque de pression en pierres moussues silencieuse");

                this.add(PressurePlatesBlocks.NETHERRACK_PRESSURE_PLATE.get(), "Plaque de pression en netherrack");
                this.add(PressurePlatesBlocks.SILENT_NETHERRACK_PRESSURE_PLATE.get(), "Plaque de pression en netherrack silencieuse");

                this.add(PressurePlatesBlocks.DIRT_PRESSURE_PLATE.get(), "Plaque de pression en terre");
                this.add(PressurePlatesBlocks.SILENT_DIRT_PRESSURE_PLATE.get(), "Plaque de pression en terre silencieuse");

                this.add("block.dio_pressure_plates.obsidian_pressure_plate.hover_text", "Détecter uniquement les joueurs");
                this.add("block.dio_pressure_plates.mossy_cobblestone_pressure_plate.hover_text", "Détecter uniquement les entités vivantes");
                this.add("block.dio_pressure_plates.netherrack_pressure_plate.hover_text", "Détecter uniquement les entités ennemies");
                this.add("block.dio_pressure_plates.dirt_pressure_plate.hover_text", "Détecter uniquement les entités passives");

                this.add(PressurePlatesBlocks.SILENT_OAK_PRESSURE_PLATE.get(), "Plaque de pression en chêne silencieuse");
                this.add(PressurePlatesBlocks.SILENT_SPRUCE_PRESSURE_PLATE.get(), "Plaque de pression en sapin silencieuse");
                this.add(PressurePlatesBlocks.SILENT_BIRCH_PRESSURE_PLATE.get(), "Plaque de pression en bouleau silencieuse");
                this.add(PressurePlatesBlocks.SILENT_JUNGLE_PRESSURE_PLATE.get(), "Plaque de pression en acajou silencieuse");
                this.add(PressurePlatesBlocks.SILENT_ACACIA_PRESSURE_PLATE.get(), "Plaque de pression en acacia silencieuse");
                this.add(PressurePlatesBlocks.SILENT_DARK_OAK_PRESSURE_PLATE.get(), "Plaque de pression en chêne noir silencieuse");
                this.add(PressurePlatesBlocks.SILENT_MANGROVE_PRESSURE_PLATE.get(), "Plaque de pression en palétuvier silencieuse");
                this.add(PressurePlatesBlocks.SILENT_CHERRY_PRESSURE_PLATE.get(), "Plaque de pression en cerisier silencieuse");
                this.add(PressurePlatesBlocks.SILENT_BAMBOO_PRESSURE_PLATE.get(), "Plaque de pression en bambou silencieuse");
                this.add(PressurePlatesBlocks.SILENT_CRIMSON_PRESSURE_PLATE.get(), "Plaque de pression en carmin silencieuse");
                this.add(PressurePlatesBlocks.SILENT_WARPED_PRESSURE_PLATE.get(), "Plaque de pression en biscornue silencieuse");

                this.add(PressurePlatesBlocks.SILENT_STONE_PRESSURE_PLATE.get(), "Plaque de pression en pierre silencieuse");
                this.add(PressurePlatesBlocks.SILENT_POLISHED_BLACKSTONE_PRESSURE_PLATE.get(), "Plaque de pression en pierre noire silencieuse");
            }
        }

        public static class France extends Common {
            public France(PackOutput output) {
                super(output, "fr_fr");
            }
        }

        public static class Canada extends Common {
            public Canada(PackOutput output) {
                super(output, "fr_ca");
            }
        }
    }
}
