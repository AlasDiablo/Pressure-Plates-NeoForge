package fr.alasdiablo.mods.pressure.plates.block;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

public class NetherrackPressurePlateBlock extends MuteablePressurePlateBlock {
    public static final String HOVER_TEXT_KEY = "block.dio_pressure_plates.netherrack_pressure_plate.hover_text";

    public NetherrackPressurePlateBlock(boolean muted, ResourceKey<Block> id) {
        super(Properties.of()
                .setId(id)
                      .mapColor(MapColor.NETHER)
                      .instrument(NoteBlockInstrument.BASEDRUM)
                      .requiresCorrectToolForDrops()
                      .strength(0.4F)
                      .sound(SoundType.NETHERRACK)
                      .pushReaction(PushReaction.DESTROY)
                      .noCollision()
                      .forceSolidOn(), muted);
        this.soundType = SoundType.NETHERRACK;
    }

    @Override
    protected int getSignalStrength(@NotNull Level level, @NotNull BlockPos pos) {
        return level.getEntitiesOfClass(
                Monster.class,
                TOUCH_AABB.move(pos),
                EntitySelector.NO_SPECTATORS
                        .and(entity -> !entity.isIgnoringBlockTriggers())
        ).isEmpty() ? 0 : 15;
    }
}
