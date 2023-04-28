package net.verox.arclight.world;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.verox.arclight.world.feature.ore.ModOreFeatures;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> MOON_PLACED = PlacedFeatures.register("moon_placed",
            ModConfiguredFeatures.MOON_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.05f, 1)));

    public static final RegistryEntry<PlacedFeature> JADE_PLACED = PlacedFeatures.register("jade_placed",
            ModConfiguredFeatures.JADE_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.05f, 1)));

    public static final RegistryEntry<PlacedFeature> SHADOW_PLACED = PlacedFeatures.register("shadow_placed",
            ModConfiguredFeatures.SHADOW_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.5f, 2)));

    public static final RegistryEntry<PlacedFeature> ARCLIGHT_ORE_PLACED = PlacedFeatures.register("arclight_ore_placed",
            ModConfiguredFeatures.ARCLIGHT_ORE, ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(74), YOffset.aboveBottom(94))));

    public static final RegistryEntry<PlacedFeature> CLOUDSTONE_PLACED = PlacedFeatures.register("cloudstone_placed",
            ModConfiguredFeatures.CLOUDSTONE, ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(74), YOffset.aboveBottom(150))));

    public static final RegistryEntry<PlacedFeature> MOONLIGHT_ORE_PLACED = PlacedFeatures.register("moonligt_ore_placed",
            ModConfiguredFeatures.MOONLIGHT_ORE, ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(10), YOffset.aboveBottom(40))));

    public static final RegistryEntry<PlacedFeature> ALMANDINE_ORE_PLACED = PlacedFeatures.register("almandine_ore_placed",
            ModConfiguredFeatures.ALMANDINE_ORE, ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(74), YOffset.aboveBottom(94))));

    public static final RegistryEntry<PlacedFeature> JADE_ORE_PLACED = PlacedFeatures.register("jade_ore_placed",
            ModConfiguredFeatures.JADE_ORE, ModOreFeatures.modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(40), YOffset.aboveBottom(120))));
}
