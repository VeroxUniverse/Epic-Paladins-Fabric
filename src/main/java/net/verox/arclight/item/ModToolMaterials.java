package net.verox.arclight.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    ARCLIGHT_TOOL(MiningLevels.NETHERITE, 2500, 12.0f, 3.0f, 24, () -> Ingredient.ofItems(ModItems.ARCLIGHT_INGOT)),
    JADE_TOOL(MiningLevels.NETHERITE, 2500, 12.0f, 3.0f, 24, () -> Ingredient.ofItems(ModItems.JADE_INGOT)),
    COPPER_TOOL(MiningLevels.IRON, 250, 6.0f, 1.5f, 14, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    ALMANDINE_TOOL(MiningLevels.NETHERITE, 2500, 12.0f, 3.0f, 24, () -> Ingredient.ofItems(ModItems.ALMANDINE_INGOT)),
    MOONLIGHT_TOOL(MiningLevels.NETHERITE, 1700, 12.0f, 3.0f, 24, () -> Ingredient.ofItems(ModItems.MOONLIGHT_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
