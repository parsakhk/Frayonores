package net.mrfrayon.frayonores.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.mrfrayon.frayonores.block.ModBlocks;
import net.mrfrayon.frayonores.config.FrayonModCommonConfigs;

import java.util.List;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> STONY_TREE =
            FeatureUtils.register("ebony", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.STONY_LOG.get()),
                    new GiantTrunkPlacer(13, 7, 5),
                    BlockStateProvider.simple(ModBlocks.LETACREATE_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(3, 0, 4))
                    .dirt(BlockStateProvider.simple(Blocks.STONE)).build());

    public static final Holder<PlacedFeature> STONY_CHECKED = PlacementUtils.register("ebony_checked", STONY_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.STONY_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> STONY_SPAWN =
            FeatureUtils.register("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(STONY_CHECKED,
                            0.5F)), STONY_CHECKED));


    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_NICHOLER_ORES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.NICHOLER_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> END_NICHOLER_ORES = List.of(OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDSTONE_NICHOLER_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> NETHER_NICHOLER_ORES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHERRACK_NICHOLER_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> BOLARIUM = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BOLARIUM_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ALLIMINIUM_ORES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALIMINIUM_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ALIMINIUM_DEEPSLATE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> NETHER_ALIMINIUM_ORES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.ALIMINIUM_NETHERRACK_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_LEAD_ORES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LEAD_ORE.get().defaultBlockState()), OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.LEAD_DEEPSLATE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> SCULKY_AMBUSH_DEEP_DARK = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.SCULK_AMBUSH.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> SCULKY_PLANT_GROWER_DEEP_DARK = List.of(OreConfiguration.target(new BlockMatchTest(Blocks.SCULK), ModBlocks.SCULKY_MUSHROOM_GROWER.get().defaultBlockState()));


    //MUDDY ORES
    public static final List<OreConfiguration.TargetBlockState> MUDDY_LAPIS_ORE = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MUDDY_LAPIS_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> MUDDY_REDSTONE_ORE = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MUDDY_REDSTONE_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> MUDDY_IRON_ORE = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MUDDY_IRON_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> MUDDY_GOLD_ORE = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MUDDY_GOLD_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> MUDDY_EMERALD_ORE = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MUDDY_EMERALD_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> MUDDY_DIAMOND_ORE = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MUDDY_DIAMOND_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> MUDDY_COAL_ORE = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MUDDY_COAL_ORE.get().defaultBlockState()));
    public static final List<OreConfiguration.TargetBlockState> MUDDY_COPPER_ORE = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MUDDY_COPPER_ORE.get().defaultBlockState()));
    //End of Muddy Ores


    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NICHOLER_ORE = FeatureUtils.register("nicholer_ore", Feature.ORE, new OreConfiguration(OVERWORLD_NICHOLER_ORES, FrayonModCommonConfigs.NICHOLER_ORE_VEIN_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_NICHOLER_ORE = FeatureUtils.register("_nicholer_endstone_ore", Feature.ORE, new OreConfiguration(END_NICHOLER_ORES, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_NICHOLER_ORE = FeatureUtils.register("nicholer_netherrack_ore", Feature.ORE, new OreConfiguration(NETHER_NICHOLER_ORES, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BOLARIUM_ORE = FeatureUtils.register("bolarium_ore", Feature.ORE, new OreConfiguration(BOLARIUM, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALLIMINIUM_ORE = FeatureUtils.register("aliminium_ore", Feature.ORE, new OreConfiguration(OVERWORLD_ALLIMINIUM_ORES, 6));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LEAD_ORE_ = FeatureUtils.register("lead_ore", Feature.ORE, new OreConfiguration(OVERWORLD_LEAD_ORES, 8));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALIMINIUM_NETHERRACK_ORE_ = FeatureUtils.register("aliminium_netherrack_ore", Feature.ORE, new OreConfiguration(NETHER_ALIMINIUM_ORES, 7));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SCULKY_AMBUSH_VEIN = FeatureUtils.register("sculky_ambush_vein", Feature.ORE, new OreConfiguration(SCULKY_AMBUSH_DEEP_DARK, 44));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SCULK_GROWER_BIG = FeatureUtils.register("sculky_grower_big", Feature.ORE, new OreConfiguration(SCULKY_PLANT_GROWER_DEEP_DARK, 56));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> SCULK_MUSHROOM = FeatureUtils.register("sculk_mushroom_mushroom", Feature.FLOWER,new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SCULK_MUSHROOM.get())))));

    //MUDDY ORES
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MUDDY_LAPIS_VEIN = FeatureUtils.register("muddy_lapis_vein", Feature.ORE, new OreConfiguration(MUDDY_LAPIS_ORE, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MUDDY_REDSTONE_VEIN = FeatureUtils.register("muddy_redstone_vein", Feature.ORE, new OreConfiguration(MUDDY_REDSTONE_ORE, 14));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MUDDY_IRON_VEIN = FeatureUtils.register("muddy_iron_vein", Feature.ORE, new OreConfiguration(MUDDY_IRON_ORE, 7));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MUDDY_GOLD_VEIN = FeatureUtils.register("muddy_gold_vein", Feature.ORE, new OreConfiguration(MUDDY_GOLD_ORE, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MUDDY_EMERALD_VEIN = FeatureUtils.register("muddy_emerald_vein", Feature.ORE, new OreConfiguration(MUDDY_EMERALD_ORE, 3));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MUDDY_DIAMOND_VEIN = FeatureUtils.register("muddy_diamond_vein", Feature.ORE, new OreConfiguration(MUDDY_DIAMOND_ORE, 6));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MUDDY_COPPER_VEIN = FeatureUtils.register("muddy_copper_vein", Feature.ORE, new OreConfiguration(MUDDY_COPPER_ORE, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MUDDY_COAL_VEIN = FeatureUtils.register("muddy_coal_vein", Feature.ORE, new OreConfiguration(MUDDY_COAL_ORE, 8));
    // End of Muddy Ores!
}
