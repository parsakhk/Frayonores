package net.mrfrayon.frayonores.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class SculkyAmbush extends Block {
    public static final BooleanProperty isStepped = BooleanProperty.create("stepped");

    public SculkyAmbush(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void stepOn(Level p_152431_, BlockPos p_152432_, BlockState p_152433_, Entity p_152434_) {
        if(!p_152431_.isClientSide()) {
            boolean currentState = p_152433_.getValue(isStepped);
            p_152431_.setBlock(p_152432_, p_152433_.setValue(isStepped, !currentState), 3);
        }

        super.stepOn(p_152431_,p_152432_,p_152433_,p_152434_);
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(isStepped);
    }
}
