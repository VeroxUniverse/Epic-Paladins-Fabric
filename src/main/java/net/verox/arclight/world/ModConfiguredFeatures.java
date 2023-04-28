package net.verox.arclight.world;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.DarkOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.verox.arclight.ArclightMod;
import net.verox.arclight.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> MOON_TREE =
            ConfiguredFeatures.register("moon_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.MOON_LOG),
                    new ForkingTrunkPlacer(3, 5, 4),
                    BlockStateProvider.of(ModBlocks.MOON_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> MOON_CHECKED =
            PlacedFeatures.register("moon_checked", MOON_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.MOON_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> MOON_SPAWN =
            ConfiguredFeatures.register("moon_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(MOON_CHECKED, 0.05f)),
                            MOON_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> JADE_TREE =
            ConfiguredFeatures.register("jade_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.JADE_LOG),
                    new ForkingTrunkPlacer(3, 5, 4),
                    BlockStateProvider.of(ModBlocks.JADE_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> JADE_CHECKED =
            PlacedFeatures.register("jade_checked", JADE_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.JADE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> JADE_SPAWN =
            ConfiguredFeatures.register("jade_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(JADE_CHECKED, 0.05f)),
                            JADE_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SHADOW_TREE =
            ConfiguredFeatures.register("shadow_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.SHADOW_LOG),
                    new ForkingTrunkPlacer(3, 5, 4),
                    BlockStateProvider.of(ModBlocks.SHADOW_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> SHADOW_CHECKED =
            PlacedFeatures.register("shadow_checked", SHADOW_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.SHADOW_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> SHADOW_SPAWN =
            ConfiguredFeatures.register("shadow_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(SHADOW_CHECKED, 0.05f)),
                            SHADOW_CHECKED));


    public static final List<OreFeatureConfig.Target> OVERWORLD_ARCLIGHT_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ARCLIGHT_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ARCLIGHT_ORE =
            ConfiguredFeatures.register("arclight_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_ARCLIGHT_ORE, 5));

    public static final List<OreFeatureConfig.Target> OVERWORLD_ALMANDINE_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ALMANDINE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ALMANDINE_ORE =
            ConfiguredFeatures.register("almandine_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_ALMANDINE_ORE, 6));


    public static final List<OreFeatureConfig.Target> OVERWORLD_CLOUDSTONE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.CLOUDSTONE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> CLOUDSTONE =
            ConfiguredFeatures.register("cloudstone", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_CLOUDSTONE, 37));

    public static final List<OreFeatureConfig.Target> NETHER_MOONLIGHT_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER,
                    ModBlocks.MOONLIGHT_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MOONLIGHT_ORE =
            ConfiguredFeatures.register("moonlight_ore", Feature.ORE,
                    new OreFeatureConfig(NETHER_MOONLIGHT_ORE, 6));

    public static final List<OreFeatureConfig.Target> END_JADE_ORE = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.JADE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JADE_ORE =
            ConfiguredFeatures.register("jade_ore", Feature.ORE,
                    new OreFeatureConfig(END_JADE_ORE, 6));


    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + ArclightMod.MOD_ID);
    }
}
