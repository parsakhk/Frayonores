package net.mrfrayon.frayonores.block.entity.custom.lead_planet;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.mrfrayon.frayonores.block.ModBlocks;
import net.mrfrayon.frayonores.block.entity.ModBlockEntities;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class LeadPlanetBlockEntity extends BlockEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public LeadPlanetBlockEntity(BlockPos p_155229_, BlockState p_155230_) {
        super(ModBlockEntities.LEAD_PLANET_BLOCK_ENTITY.get(), p_155229_, p_155230_);
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<LeadPlanetBlockEntity>
                (this, "controller", 0, this::predicate));
    }
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.lead_planet.idle", true));

        return PlayState.CONTINUE;
    }


    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
