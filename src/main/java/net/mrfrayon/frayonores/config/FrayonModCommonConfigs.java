package net.mrfrayon.frayonores.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class FrayonModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> NICHOLER_ORE_VEINS_PER_CHUNK;
    public static final ForgeConfigSpec.ConfigValue<Integer> NICHOLER_ORE_VEIN_SIZE;

    static {
        BUILDER.push("Configs for Tutorial Mod");

        NICHOLER_ORE_VEINS_PER_CHUNK = BUILDER.comment("How many Citrine Ore Veins spawn per chunk!")
                .define("Veins Per Chunk", 43);
        NICHOLER_ORE_VEIN_SIZE = BUILDER.comment("How many Citrine Ore Blocks spawn in one Vein!")
                .defineInRange("Vein Size",9, 3, 20);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
