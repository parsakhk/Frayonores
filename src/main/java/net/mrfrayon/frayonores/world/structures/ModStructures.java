package net.mrfrayon.frayonores.world.structures;

import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.world.structures.str.SkyStructures;

public class ModStructures {

    public static final DeferredRegister<StructureType<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(Registry.STRUCTURE_TYPE_REGISTRY, FrayonOres.MODID);


    public static final RegistryObject<StructureType<?>> SKY_STRUCTURES =
            DEFERRED_REGISTRY_STRUCTURE.register("sky_structures", () -> typeConvert(SkyStructures.CODEC));

    private static <S extends Structure> StructureType<S> typeConvert(Codec<S> codec) {
        return () -> codec;
    }


    public static void register(IEventBus bus) {
        DEFERRED_REGISTRY_STRUCTURE.register(bus);
    }
}
