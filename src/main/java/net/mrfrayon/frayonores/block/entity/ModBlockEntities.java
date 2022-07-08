package net.mrfrayon.frayonores.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.block.ModBlocks;
import net.mrfrayon.frayonores.block.entity.custom.lead_planet.LeadPlanetBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, FrayonOres.MODID);

    public static final RegistryObject<BlockEntityType<LeadPlanetBlockEntity>> LEAD_PLANET_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("lead_planet_block_entity", () ->
                    BlockEntityType.Builder.of(LeadPlanetBlockEntity::new,
                            ModBlocks.LEAD_PLANET.get()).build(null));



    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
