package net.mrfrayon.frayonores.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.PlantType;

import java.util.function.Supplier;

public class ModSculkMushroomBlock extends FlowerBlock {
    private Supplier<Block> otherDirt;

    public ModSculkMushroomBlock(MobEffect effects, int effectDuration, Properties properties, Supplier<Block> otherDirt) {
        super(effects, effectDuration, properties);
        this.otherDirt = otherDirt;
    }

    @Override
    public boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(otherDirt.get());
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return PlantType.get("custom");
    }
}
