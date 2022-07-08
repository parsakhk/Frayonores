package net.mrfrayon.frayonores.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BORALIUM = new ForgeTier(3, 1900, 8.5f,
            3f, 2239, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.BOLARIUM_INGOT.get()));
}