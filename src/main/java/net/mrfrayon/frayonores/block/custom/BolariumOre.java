package net.mrfrayon.frayonores.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.mrfrayon.frayonores.particle.ModParticles;

public class BolariumOre extends Block {
    public BolariumOre(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void stepOn(Level world, BlockPos block, BlockState bstate, Entity entity) {
        if(entity.isCrouching() != true) {
            double xc = entity.getX();
            double yc = entity.getY();
            double zc = entity.getZ();

            entity.teleportTo(xc,yc,zc);
            entity.setDeltaMovement(0.75, 0.75, 0.75);
        } else {

        }
    }
}
