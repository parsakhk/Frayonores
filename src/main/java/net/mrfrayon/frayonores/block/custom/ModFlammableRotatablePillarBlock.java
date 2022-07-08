package net.mrfrayon.frayonores.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolAction;
import net.mrfrayon.frayonores.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatablePillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatablePillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return false;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {

        if(context.getItemInHand().getItem() instanceof PickaxeItem) {
            if(state.is(ModBlocks.STONY_LOG.get())) {
                return ModBlocks.STRIPPED_STONY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModBlocks.STONY_WOOD.get())) {
                return ModBlocks.STRIPPED_STONY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }


        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}



