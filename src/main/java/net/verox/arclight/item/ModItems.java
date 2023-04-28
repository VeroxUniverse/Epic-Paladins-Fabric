package net.verox.arclight.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.verox.arclight.ArclightMod;
import net.verox.arclight.ModGroup;
import net.verox.arclight.entity.mob.EntityTypes;
import net.verox.arclight.item.custom.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModItems {

    //CopperTools
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER_TOOL, 3, -2.4f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COPPER_TOOL, 1, -2.8f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterials.COPPER_TOOL, 6, -3.1f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterials.COPPER_TOOL, -2, -1f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ModShovelItem(ModToolMaterials.COPPER_TOOL, 1, -2.8f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    //MoonlightTools
    public static final Item MOONLIGHT_SWORD = registerItem("moonlight_sword",
            new SwordItem(ModToolMaterials.MOONLIGHT_TOOL, 3, -2.4f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item MOONLIGHT_PICKAXE = registerItem("moonlight_pickaxe",
            new ModPickaxeItem(ModToolMaterials.MOONLIGHT_TOOL, 1, -2.8f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item MOONLIGHT_AXE = registerItem("moonlight_axe",
            new ModAxeItem(ModToolMaterials.MOONLIGHT_TOOL, 5, -3f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item MOONLIGHT_SHOVEL = registerItem("moonlight_shovel",
            new ModShovelItem(ModToolMaterials.MOONLIGHT_TOOL, 1, -2.8f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item MOONLIGHT_HOE = registerItem("moonlight_hoe",
            new ModHoeItem(ModToolMaterials.MOONLIGHT_TOOL, -3, 0f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    //JadeTools
    public static final Item JADE_SWORD = registerItem("jade_sword",
            new SwordItem(ModToolMaterials.JADE_TOOL, 3, -2.4f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item JADE_PICKAXE = registerItem("jade_pickaxe",
            new ModPickaxeItem(ModToolMaterials.JADE_TOOL, 1, -2.8f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item JADE_AXE = registerItem("jade_axe",
            new ModAxeItem(ModToolMaterials.JADE_TOOL, 5, -3f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item JADE_SHOVEL = registerItem("jade_shovel",
            new ModShovelItem(ModToolMaterials.JADE_TOOL, 1, -3f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item JADE_HOE = registerItem("jade_hoe",
            new ModHoeItem(ModToolMaterials.JADE_TOOL, -3, 0f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    //ArclightTools
    public static final Item ARCLIGHT_SWORD = registerItem("arclight_sword",
            new SwordItem(ModToolMaterials.ARCLIGHT_TOOL, 3, -2.4f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item ARCLIGHT_PICKAXE = registerItem("arclight_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ARCLIGHT_TOOL, 1, -2.8f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item ARCLIGHT_AXE = registerItem("arclight_axe",
            new ModAxeItem(ModToolMaterials.ARCLIGHT_TOOL, 5, -3f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item ARCLIGHT_SHOVEL = registerItem("arclight_shovel",
            new ModShovelItem(ModToolMaterials.ARCLIGHT_TOOL, 1, -3f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item ARCLIGHT_HOE = registerItem("arclight_hoe",
            new ModHoeItem(ModToolMaterials.ARCLIGHT_TOOL, -3, 0f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    //AlmandineTools
    public static final Item ALMANDINE_SWORD = registerItem("almandine_sword",
            new SwordItem(ModToolMaterials.ALMANDINE_TOOL, 3, -2.4f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item ALMANDINE_PICKAXE = registerItem("almandine_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ALMANDINE_TOOL, 1, -2.8f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item ALMANDINE_AXE = registerItem("almandine_axe",
            new ModAxeItem(ModToolMaterials.ALMANDINE_TOOL, 5, -3f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item ALMANDINE_SHOVEL = registerItem("almandine_shovel",
            new ModShovelItem(ModToolMaterials.ALMANDINE_TOOL, 1, -3f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    public static final Item ALMANDINE_HOE = registerItem("almandine_hoe",
            new ModHoeItem(ModToolMaterials.ALMANDINE_TOOL, -3, 0f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP)));

    //ArclightHalo
    public static final Item ANGEL_SPAWN = registerItem("angel_spawn",
            new AngelSpawnItem(new FabricItemSettings().group(ModGroup.ARCLIGHT_MOBS).maxDamage(1).rarity(Rarity.RARE)));

    //ScorpionHeart
    public static final Item HEART = registerItem("heart",
            new ScorpionSpawnItem(new FabricItemSettings().group(ModGroup.ARCLIGHT_MOBS).maxDamage(1).rarity(Rarity.RARE)));

    //ArclightGem
    public static final Item ARCLIGHT_GEM = registerItem("arclight_gem",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //ArclightIngot
    public static final Item ARCLIGHT_INGOT = registerItem("arclight_ingot",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //JadeShard
    public static final Item JADE_SHARD = registerItem("jade_shard",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //JadeIngot
    public static final Item JADE_INGOT = registerItem("jade_ingot",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //MoonlightCrystal
    public static final Item MOONLIGHT_CRYSTAL = registerItem("moonlight_crystal",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //MoonlightIngot
    public static final Item MOONLIGHT_INGOT = registerItem("moonlight_ingot",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //MoonlightCrystalized
    public static final Item MOONLIGHT_CRYSTALIZED = registerItem("moonlight_crystalized",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //MoonlightCrystalized
    public static final Item MOONLIGHT_JELLYBALL = registerItem("moonlight_jellyball",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //AlmandineShard
    public static final Item ALMANDINE_SHARD = registerItem("almandine_shard",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //AlmandineIngot

    public static final Item ALMANDINE_INGOT = registerItem("almandine_ingot",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES)));

    //ArclightArmor
    public static final Item ARCLIGHTS_HELMET = registerItem("arclight_helmet",
            new ArclightArmorItem(ModArmorMaterials.ARCLIGHT, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item ARCLIGHTS_CHESTLATE = registerItem("arclight_chestplate",
            new ArclightArmorItem(ModArmorMaterials.ARCLIGHT, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item ARCLIGHTS_LEGGINGS = registerItem("arclight_leggings",
            new ArclightArmorItem(ModArmorMaterials.ARCLIGHT, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item ARCLIGHTS_BOOTS = registerItem("arclight_boots",
            new ArclightArmorItem(ModArmorMaterials.ARCLIGHT, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    //HolyArmor
    public static final Item HOLYKNIGHT_HELMET = registerItem("holyknight_helmet",
            new HolyknightArmorItem(ModArmorMaterials.HOLYKNIGHT, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item HOLYKNIGHT_CHESTLATE = registerItem("holyknight_chestplate",
            new HolyknightArmorItem(ModArmorMaterials.HOLYKNIGHT, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item HOLYKNIGHT_LEGGINGS = registerItem("holyknight_leggings",
            new HolyknightArmorItem(ModArmorMaterials.HOLYKNIGHT, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item HOLYKNIGHT_BOOTS = registerItem("holyknight_boots",
            new HolyknightArmorItem(ModArmorMaterials.HOLYKNIGHT, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    //ShadowArmor
    public static final Item SHADOW_HELMET = registerItem("shadow_helmet",
            new ShadowArmorItem(ModArmorMaterials.SHADOW, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item SHADOW_CHESTPLATE = registerItem("shadow_chestplate",
            new ShadowArmorItem(ModArmorMaterials.SHADOW, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item SHADOW_LEGGINGS = registerItem("shadow_leggings",
            new ShadowArmorItem(ModArmorMaterials.SHADOW, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item SHADOW_BOOTS = registerItem("shadow_boots",
            new ShadowArmorItem(ModArmorMaterials.SHADOW, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    //MoonlightArmor
    public static final Item MOONLIGHT_HELMET = registerItem("moonlight_helmet",
            new MoonlightArmorItem(ModArmorMaterials.MOONLIGHT, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item MOONLIGHT_CHESTPLATE = registerItem("moonlight_chestplate",
            new MoonlightArmorItem(ModArmorMaterials.MOONLIGHT, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item MOONLIGHT_LEGGINGS = registerItem("moonlight_leggings",
            new MoonlightArmorItem(ModArmorMaterials.MOONLIGHT, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item MOONLIGHT_BOOTS = registerItem("moonlight_boots",
            new MoonlightArmorItem(ModArmorMaterials.MOONLIGHT, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    //ScorpionArmor
    public static final Item SCORPION_HELMET = registerItem("scorpion_helmet",
            new ScorpionArmorItem(ModArmorMaterials.SCORPIONSCALE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item SCORPION_CHESTPLATE = registerItem("scorpion_chestplate",
            new ScorpionArmorItem(ModArmorMaterials.SCORPIONSCALE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item SCORPION_LEGGINGS = registerItem("scorpion_leggings",
            new ScorpionArmorItem(ModArmorMaterials.SCORPIONSCALE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item SCORPION_BOOTS = registerItem("scorpion_boots",
            new ScorpionArmorItem(ModArmorMaterials.SCORPIONSCALE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    //FrozenArmor
    public static final Item FROZEN_HELMET = registerItem("frozen_helmet",
            new FrozenArmorItem(ModArmorMaterials.FROZEN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item FROZEN_CHESTPLATE = registerItem("frozen_chestplate",
            new FrozenArmorItem(ModArmorMaterials.FROZEN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item FROZEN_LEGGINGS = registerItem("frozen_leggings",
            new FrozenArmorItem(ModArmorMaterials.FROZEN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item FROZEN_BOOTS = registerItem("frozen_boots",
            new FrozenArmorItem(ModArmorMaterials.FROZEN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    //SteelArmor
    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new SteelArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new SteelArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new SteelArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new SteelArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    //AngelArmor
    public static final Item ANGEL_HELMET = registerItem("angel_helmet",
            new AngelArmorItem(ModArmorMaterials.ANGEL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.EPIC)));

    public static final Item ANGEL_CHESTLATE = registerItem("angel_chestplate",
            new AngelArmorItem(ModArmorMaterials.ANGEL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.EPIC)));

    public static final Item ANGEL_LEGGINGS = registerItem("angel_leggings",
            new AngelArmorItem(ModArmorMaterials.ANGEL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.EPIC)));

    public static final Item ANGEL_BOOTS = registerItem("angel_boots",
            new AngelArmorItem(ModArmorMaterials.ANGEL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.EPIC)));

    //SpawnAngel
    public static final Item ANGEL_SPAWN_EGG = registerItem("angel_spawn_egg",
            new SpawnEggItem(EntityTypes.ANGEL,0xE1EF05, 0x6FF2FA,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_MOBS)));

    //SpawnJelly
    public static final Item JELLY_SPAWN_EGG = registerItem("jelly_spawn_egg",
            new SpawnEggItem(EntityTypes.JELLY,0x09B2D9, 0xD1EFF6,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_MOBS)));

    //SpawnScorpion
    public static final Item SCORPION_SPAWN_EGG = registerItem("scorpion_spawn_egg",
            new SpawnEggItem(EntityTypes.SCORPION,0x280404, 0xF89918,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_MOBS)));


    //ArclightCore
    public static final Item ARCLIGHT_CORE = registerItem("arclight_core",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES).rarity(Rarity.RARE)));

    //MoonlightCore
    public static final Item MOONLIGHT_CORE = registerItem("moonlight_core",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES).rarity(Rarity.RARE)));

    //ShadowCore
    public static final Item SHADOW_CORE = registerItem("shadow_core",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES).rarity(Rarity.RARE)));

    //FrostedCore
    public static final Item FROSTED_CORE = registerItem("frosted_core",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES).rarity(Rarity.UNCOMMON)));

    //SteelCore
    //public static final Item STEEL_CORE = registerItem("steel_core",
    //        new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES).rarity(Rarity.UNCOMMON)));

    //AngelSword
    public static final Item ANGEL_SWORD = registerItem("angel_sword",
            new AngelSwordItem(ModToolMaterials.ARCLIGHT_TOOL, 7, -2.4f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.EPIC)));

    public static final Item MOONLIGHT_GLAIVE = registerItem("moonlight_glaive",
            new MoonlightGlaiveItem(ModToolMaterials.MOONLIGHT_TOOL, 5, -3.0f,
                    new FabricItemSettings().group(ModGroup.ARCLIGHT_GROUP).rarity(Rarity.UNCOMMON)));

    public static final Item SCORPION_SCALE = registerItem("scorpion_scale",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES).rarity(Rarity.EPIC)));

    public static final Item ANGEL_FEATHER = registerItem("angel_feather",
            new Item(new FabricItemSettings().group(ModGroup.ARCLIGHT_RESOURCES).rarity(Rarity.UNCOMMON)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ArclightMod.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        ArclightMod.LOGGER.debug("Registering Mod Items for " + ArclightMod.MOD_ID);
    }

}
