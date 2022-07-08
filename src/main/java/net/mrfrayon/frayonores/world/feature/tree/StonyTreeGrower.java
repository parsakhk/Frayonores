package net.mrfrayon.frayonores.world.feature.tree;

import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.mrfrayon.frayonores.world.feature.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class StonyTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_204307_, boolean p_204308_) {
        return ModConfiguredFeatures.STONY_TREE;
    }
}
