package net.verox.arclight.item;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;
public enum ModArmorMaterials implements ArmorMaterial {
    ARCLIGHT("arclight", 45, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.0F,
            () -> {return Ingredient.ofItems(ModItems.ARCLIGHT_INGOT);
    }),

    ANGEL("angel", 120, new int[]{5, 9, 9, 5}, 30,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 0.225F,
            () -> {return Ingredient.ofItems(Items.PHANTOM_MEMBRANE);
            }),

    FROZEN("frozen", 30, new int[]{4, 5, 7, 4}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F,
            () -> {return Ingredient.ofItems(Blocks.BLUE_ICE);
            }),

    STEEL("frozen", 30, new int[]{3, 5, 7, 3}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F,
            () -> {return Ingredient.ofItems(Items.IRON_INGOT);
            }),

    MOONLIGHT("moonlight", 45, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.0F,
            () -> {return Ingredient.ofItems(ModItems.MOONLIGHT_INGOT);
    }),

    SHADOW("shadow", 50, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.0F,
            () -> {return Ingredient.ofItems(ModItems.JADE_INGOT);
    }),

    SCORPIONSCALE("scorpionscale", 50, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.0F,
            () -> {return Ingredient.ofItems(Items.NETHERITE_INGOT);
            }),

    HOLYKNIGHT("holyknight", 30, new int[]{3, 5, 7, 3}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F,
            () -> {return Ingredient.ofItems(Items.COPPER_INGOT);
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability,
                              SoundEvent equipSound, float toughness, float knockbackResistance,
                              Supplier repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
