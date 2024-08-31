package fr.alasdiablo.mods.pressure.plates.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.NotNull;

public class NetherrackPressurePlateBlock extends MuteablePressurePlateBlock {
    public NetherrackPressurePlateBlock(boolean muted) {
        super(Properties.of()
                      .mapColor(MapColor.NETHER)
                      .instrument(NoteBlockInstrument.BASEDRUM)
                      .requiresCorrectToolForDrops()
                      .strength(0.4F)
                      .sound(SoundType.NETHERRACK)
                      .pushReaction(PushReaction.DESTROY)
                      .noCollission()
                      .forceSolidOn(), muted);
        this.soundType = SoundType.NETHERRACK;
    }

    @Override
    protected int getSignalStrength(@NotNull Level level, @NotNull BlockPos pos) {
        return level.getEntitiesOfClass(
                LivingEntity.class,
                TOUCH_AABB.move(pos),
                EntitySelector.NO_SPECTATORS
                        .and(entity -> !entity.isIgnoringBlockTriggers())
                        .and(entity -> entity instanceof Enemy)
        ).isEmpty() ? 0 : 15;
    }
}
