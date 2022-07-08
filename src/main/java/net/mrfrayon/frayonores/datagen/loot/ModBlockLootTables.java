package net.mrfrayon.frayonores.datagen.loot;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.mrfrayon.frayonores.block.ModBlocks;
import net.mrfrayon.frayonores.block.custom.nonblocks.NonBlocksRegistry;
import net.mrfrayon.frayonores.item.ModItems;

public class ModBlockLootTables extends BlockLoot {
    private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] { 0.05F, 0.0625F, 0.083333336F, 0.1F };

    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.ALIMINIUM_BLOCK.get());
        this.dropSelf(ModBlocks.NICHOLER_BLOCK.get());
        this.dropSelf(ModBlocks.BOLARIUM_BLOCK.get());

        this.add(ModBlocks.ALIMINIUM_ORE.get(), (Block) -> createOreDrop(ModBlocks.ALIMINIUM_ORE.get(), ModItems.ALIMINIUM_INGOT.get()));

        this.add(ModBlocks.ALIMINIUM_DEEPSLATE_ORE.get(), (Block) -> createOreDrop(ModBlocks.ALIMINIUM_DEEPSLATE_ORE.get(), ModItems.ALIMINIUM_INGOT.get()));
        this.add(ModBlocks.ALIMINIUM_NETHERRACK_ORE.get(), (Block) -> createOreDrop(ModBlocks.ALIMINIUM_NETHERRACK_ORE.get(), ModItems.ALIMINIUM_INGOT.get()));

        this.add(ModBlocks.NETHERRACK_NICHOLER_ORE.get(), (Block) -> createOreDrop(ModBlocks.NETHERRACK_NICHOLER_ORE.get(), ModItems.NICHOLER_DUST.get()));
        this.add(ModBlocks.NICHOLER_ORE.get(), (Block) -> createOreDrop(ModBlocks.NICHOLER_ORE.get(), ModItems.NICHOLER_DUST.get()));
        this.add(ModBlocks.ENDSTONE_NICHOLER_ORE.get(), (Block) -> createOreDrop(ModBlocks.ENDSTONE_NICHOLER_ORE.get(), ModItems.NICHOLER_DUST.get()));

        this.add(ModBlocks.BOLARIUM_ORE.get(), (Block) -> createOreDrop(ModBlocks.BOLARIUM_ORE.get(), ModItems.BOLARIUM_INGOT.get()));
        this.add(ModBlocks.LEAD_DEEPSLATE_ORE.get(), (Block) -> createOreDrop(ModBlocks.LEAD_DEEPSLATE_ORE.get(), ModItems.LEAD_INGOT.get()));
        this.add(ModBlocks.LEAD_ORE.get(), (Block) -> createOreDrop(ModBlocks.LEAD_ORE.get(), ModItems.LEAD_INGOT.get()));

        this.add(ModBlocks.MUDDY_COAL_ORE.get(), (Block) -> createOreDrop(ModBlocks.MUDDY_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.MUDDY_COPPER_ORE.get(), (Block) -> createOreDrop(ModBlocks.MUDDY_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.MUDDY_IRON_ORE.get(), (Block) -> createOreDrop(ModBlocks.MUDDY_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.MUDDY_LAPIS_ORE.get(), (Block) -> createOreDrop(ModBlocks.MUDDY_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
        this.add(ModBlocks.MUDDY_REDSTONE_ORE.get(), (Block) -> createOreDrop(ModBlocks.MUDDY_REDSTONE_ORE.get(), Items.REDSTONE));
        this.add(ModBlocks.MUDDY_DIAMOND_ORE.get(), (Block) -> createOreDrop(ModBlocks.MUDDY_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.MUDDY_EMERALD_ORE.get(), (Block) -> createOreDrop(ModBlocks.MUDDY_EMERALD_ORE.get(), Items.EMERALD));
        this.add(ModBlocks.MUDDY_GOLD_ORE.get(), (Block) -> createOreDrop(ModBlocks.MUDDY_GOLD_ORE.get(), Items.RAW_GOLD));

        this.dropSelf(ModBlocks.STONY_WOOD.get());
        this.dropSelf(ModBlocks.STONY_LOG.get());
        this.dropSelf(ModBlocks.STONY_PLANK.get());
        this.dropSelf(ModBlocks.STRIPPED_STONY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_STONY_WOOD.get());
        this.dropSelf(ModBlocks.STONY_SAPLING.get());
        this.dropSelf(ModBlocks.LEAD_PLANET.get());
        this.add(ModBlocks.LETACREATE_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.STONY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.SCULK_AMBUSH.get());
        this.dropSelf(ModBlocks.SCULKY_MUSHROOM_GROWER.get());

        this.dropSelf(ModBlocks.SCULK_MUSHROOM.get());
        this.add(ModBlocks.POTTED_SCULK_MUSHROOM.get(), BlockLoot::createPotFlowerItemTable);
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
