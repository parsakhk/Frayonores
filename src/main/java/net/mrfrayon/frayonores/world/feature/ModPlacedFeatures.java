package net.mrfrayon.frayonores.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.config.FrayonModCommonConfigs;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, FrayonOres.MODID);

    public static final RegistryObject<PlacedFeature> NICHOLER_ORE_PLACED = PLACED_FEATURES.register("nicholer_ore_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.NICHOLER_ORE, ModOrePlacement.commonOrePlacement( FrayonModCommonConfigs.NICHOLER_ORE_VEINS_PER_CHUNK.get(),HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> END_NICHOLER_ORE_PLACED = PLACED_FEATURES.register("end_nicholer_ore_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.END_NICHOLER_ORE, ModOrePlacement.commonOrePlacement(7,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> NETHER_NICHOLER_ORE_PLACED = PLACED_FEATURES.register("nether_nicholer_ore_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.NETHER_NICHOLER_ORE, ModOrePlacement.commonOrePlacement(29,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> BOLARIUM_ORE_PLACED = PLACED_FEATURES.register("bolarium_ore_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.BOLARIUM_ORE, ModOrePlacement.commonOrePlacement(34,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120)))));
    public static final RegistryObject<PlacedFeature> ALLIMINIUM_ORE_PLACED = PLACED_FEATURES.register("aliminium_ore_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.ALLIMINIUM_ORE, ModOrePlacement.commonOrePlacement(54,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(-120)))));
    public static final RegistryObject<PlacedFeature> NETHER_ALIMINIUM_ORE_PLACED = PLACED_FEATURES.register("nether_aliminium_ore_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.ALIMINIUM_NETHERRACK_ORE_, ModOrePlacement.commonOrePlacement(29,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> LEAD_ORE_PLACED = PLACED_FEATURES.register("lead_ore_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.LEAD_ORE_, ModOrePlacement.commonOrePlacement(56,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120)))));


    public static final RegistryObject<PlacedFeature> SCULKY_AMBUSH_PLACED = PLACED_FEATURES.register("sculky_ambush_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.SCULKY_AMBUSH_VEIN, ModOrePlacement.commonOrePlacement(39,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120)))));
    public static final RegistryObject<PlacedFeature> SCULKY_PLANT_GROWER_PLACED = PLACED_FEATURES.register("sculky_plant_grower_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.SCULK_GROWER_BIG, ModOrePlacement.commonOrePlacement(49,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(-10)))));


    public static final RegistryObject<PlacedFeature> MUDDY_COAL_PLACED = PLACED_FEATURES.register("muddy_coal_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.MUDDY_COAL_VEIN, ModOrePlacement.commonOrePlacement(33,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(120), VerticalAnchor.aboveBottom(48)))));
    public static final RegistryObject<PlacedFeature> MUDDY_COPPER_PLACED = PLACED_FEATURES.register("muddy_copper_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.MUDDY_COPPER_VEIN, ModOrePlacement.commonOrePlacement(26,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(71), VerticalAnchor.aboveBottom(58)))));
    public static final RegistryObject<PlacedFeature> MUDDY_IRON_PLACED = PLACED_FEATURES.register("muddy_iron_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.MUDDY_IRON_VEIN, ModOrePlacement.commonOrePlacement(29,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(58), VerticalAnchor.aboveBottom(20)))));
    public static final RegistryObject<PlacedFeature> MUDDY_GOLD_PLACED = PLACED_FEATURES.register("muddy_gold_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.MUDDY_GOLD_VEIN, ModOrePlacement.commonOrePlacement(26,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(-80)))));
    public static final RegistryObject<PlacedFeature> MUDDY_REDSTONE_PLACED = PLACED_FEATURES.register("muddy_redstone_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.MUDDY_REDSTONE_VEIN, ModOrePlacement.commonOrePlacement(43,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120)))));
    public static final RegistryObject<PlacedFeature> MUDDY_LAPIS_PLACED = PLACED_FEATURES.register("muddy_lapis_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.MUDDY_LAPIS_VEIN, ModOrePlacement.commonOrePlacement(7,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120)))));
    public static final RegistryObject<PlacedFeature> MUDDY_DIAMOND_PLACED = PLACED_FEATURES.register("muddy_diamond_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.MUDDY_DIAMOND_VEIN, ModOrePlacement.commonOrePlacement(18,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(-40)))));
    public static final RegistryObject<PlacedFeature> MUDDY_EMERALD_PLACED = PLACED_FEATURES.register("muddy_emerald_placed",() -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>) ModConfiguredFeatures.MUDDY_EMERALD_VEIN, ModOrePlacement.commonOrePlacement(13,HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(120)))));



    public static final RegistryObject<PlacedFeature> SCULK_MUSHROOM_PLACED = PLACED_FEATURES.register("sculk_mushroom_placed",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
                    ModConfiguredFeatures.SCULK_MUSHROOM, List.of(RarityFilter.onAverageOnceEvery(3),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
