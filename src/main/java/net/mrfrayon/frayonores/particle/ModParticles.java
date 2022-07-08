package net.mrfrayon.frayonores.particle;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrfrayon.frayonores.FrayonOres;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
                DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, FrayonOres.MODID);

    public static final RegistryObject<SimpleParticleType> BOLARIUM_PARTICLES =
            PARTICLE_TYPES.register("bolarium_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> BOLARIUM_POWER_PARTICLES =
            PARTICLE_TYPES.register("bolarium_power_particles", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
