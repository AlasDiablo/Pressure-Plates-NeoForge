package fr.alasdiablo.mods.pressure.plates.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class MuteablePressurePlateBlock extends PressurePlateBlock {
    private final boolean muted;

    public MuteablePressurePlateBlock(BlockBehaviour.Properties properties, boolean muted) {
        super(BlockSetType.STONE, properties);
        this.muted = muted;
    }

    @Override
    protected abstract int getSignalStrength(@NotNull Level level, @NotNull BlockPos pos);

    @Override
    public void checkPressed(
            @Nullable Entity entity,
            @NotNull Level level,
            @NotNull BlockPos pos,
            @NotNull BlockState state,
            int currentSignal
    ) {
        int signalStrength = this.getSignalStrength(level, pos);
        boolean isOutputtingSignal = currentSignal > 0;
        boolean needOutputSignal = signalStrength > 0;

        if (currentSignal != signalStrength) {
            BlockState blockstate = this.setSignalForState(state, signalStrength);
            level.setBlock(pos, blockstate, 2);
            this.updateNeighbours(level, pos);
            level.setBlocksDirty(pos, state, blockstate);
        }

        if (!needOutputSignal && isOutputtingSignal) {
            if (!this.muted) {
                level.playSound(null, pos, this.type.pressurePlateClickOff(), SoundSource.BLOCKS);
            }
            level.gameEvent(entity, GameEvent.BLOCK_DEACTIVATE, pos);
        } else if (needOutputSignal && !isOutputtingSignal) {
            if (!this.muted) {
                level.playSound(null, pos, this.type.pressurePlateClickOn(), SoundSource.BLOCKS);
            }
            level.gameEvent(entity, GameEvent.BLOCK_ACTIVATE, pos);
        }

        if (needOutputSignal) {
            level.scheduleTick(new BlockPos(pos), this, this.getPressedTime());
        }
    }
}
