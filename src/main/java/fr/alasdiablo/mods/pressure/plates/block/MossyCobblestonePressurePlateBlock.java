package fr.alasdiablo.mods.pressure.plates.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

public class MossyCobblestonePressurePlateBlock extends MuteablePressurePlateBlock {
    public MossyCobblestonePressurePlateBlock(boolean muted) {
        super(Properties.of()
                      .mapColor(MapColor.STONE)
                      .forceSolidOn()
                      .instrument(NoteBlockInstrument.BASEDRUM)
                      .requiresCorrectToolForDrops()
                      .noCollission()
                      .strength(2.0F, 6.0F)
                      .pushReaction(PushReaction.DESTROY), muted);
    }

    @Override
    protected int getSignalStrength(@NotNull Level level, @NotNull BlockPos pos) {
        return level.getEntitiesOfClass(
                LivingEntity.class,
                TOUCH_AABB.move(pos),
                EntitySelector.NO_SPECTATORS
                        .and(entity -> !entity.isIgnoringBlockTriggers())
                        .and(entity -> !(entity instanceof Player))
        ).isEmpty() ? 0 : 15;
    }
}
