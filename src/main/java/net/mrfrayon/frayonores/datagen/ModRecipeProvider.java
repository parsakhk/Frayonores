package net.mrfrayon.frayonores.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.mrfrayon.frayonores.block.ModBlocks;
import net.mrfrayon.frayonores.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> p_176532_) {

        ShapedRecipeBuilder.shaped(ModBlocks.ALIMINIUM_BLOCK.get()).define('E', ModItems.ALIMINIUM_INGOT.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_aliminium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ALIMINIUM_INGOT.get()).build())).save(p_176532_);
        ShapelessRecipeBuilder.shapeless(ModItems.ALIMINIUM_INGOT.get()).requires(ModBlocks.ALIMINIUM_BLOCK.get()).unlockedBy("has_aliminium_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ALIMINIUM_BLOCK.get()).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModItems.BOLARIUM_AXE.get()).define('C', Items.STICK).define('Y', ModItems.BOLARIUM_INGOT.get()).pattern("YY ").pattern("YC ").pattern(" C ").unlockedBy("has_bolarium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BOLARIUM_INGOT.get()).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModItems.BOLARIUM_PICKAXE.get()).define('C', Items.STICK).define('Y', ModItems.BOLARIUM_INGOT.get()).pattern("YYY").pattern(" C ").pattern(" C ").unlockedBy("has_bolarium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BOLARIUM_INGOT.get()).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModItems.BOLARIUM_SHOVEL.get()).define('C', Items.STICK).define('Y', ModItems.BOLARIUM_INGOT.get()).pattern("Y").pattern("C").pattern("C").unlockedBy("has_bolarium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BOLARIUM_INGOT.get()).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModItems.BOLARIUM_HOE.get()).define('C', Items.STICK).define('Y', ModItems.BOLARIUM_INGOT.get()).pattern("YY ").pattern(" C ").pattern(" C ").unlockedBy("has_bolarium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BOLARIUM_INGOT.get()).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModItems.BOLARIUM_SWORD.get()).define('C', Items.STICK).define('Y', ModItems.BOLARIUM_INGOT.get()).pattern(" Y ").pattern(" Y ").pattern(" C ").unlockedBy("has_bolarium_ingot", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BOLARIUM_INGOT.get()).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModItems.TERRACOTA_STICK.get()).define('E', Items.TERRACOTTA).pattern("E").pattern("E").pattern("E").unlockedBy("has_nicholer_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.NICHOLER_DUST.get()).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModBlocks.NICHOLER_BLOCK.get()).define('E', ModItems.NICHOLER_DUST.get()).pattern("EEE").pattern("EEE").pattern("EEE").unlockedBy("has_nicholer_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.NICHOLER_DUST.get()).build())).save(p_176532_);
        ShapelessRecipeBuilder.shapeless(ModItems.NICHOLER_DUST.get()).requires(ModBlocks.NICHOLER_BLOCK.get()).unlockedBy("has_nicholer_block", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.NICHOLER_BLOCK.get()).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModBlocks.LEAD_PLANET.get()).define('E', ModItems.LEAD_INGOT.get()).define('O', Items.OBSIDIAN).define('A', Items.ACACIA_PLANKS).pattern("OOO").pattern("OEO").pattern("AAA").unlockedBy("has_nicholer_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.NICHOLER_DUST.get()).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModBlocks.SCULKY_MUSHROOM_GROWER.get()).define('E', Blocks.DEEPSLATE).define('O', Blocks.SCULK).define('A', Blocks.SCULK_SENSOR).pattern("OAO").pattern(" E ").unlockedBy("has_sculk", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SCULK).build())).save(p_176532_);
        ShapedRecipeBuilder.shaped(ModBlocks.SCULK_MUSHROOM.get()).define('E', Blocks.BROWN_MUSHROOM).define('O', Blocks.SCULK).define('A', Blocks.SCULK_SENSOR).pattern("OAO").pattern("AEA").pattern("OAO").unlockedBy("has_sculk", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.SCULK).build())).save(p_176532_);

    }
}
