package net.mrfrayon.frayonores.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.block.ModBlocks;
import net.mrfrayon.frayonores.block.custom.nonblocks.NonBlocksRegistry;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, FrayonOres.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.ALIMINIUM_BLOCK.get());
        simpleBlock(ModBlocks.LEAD_DEEPSLATE_ORE.get());
        simpleBlock(ModBlocks.LEAD_ORE.get());
        simpleBlock(ModBlocks.ALIMINIUM_NETHERRACK_ORE.get());
        simpleBlock(ModBlocks.ALIMINIUM_ORE.get());
        simpleBlock(ModBlocks.ALIMINIUM_DEEPSLATE_ORE.get());
        simpleBlock(ModBlocks.BOLARIUM_ORE.get());
        simpleBlock(ModBlocks.BOLARIUM_BLOCK.get());
        simpleBlock(ModBlocks.NICHOLER_BLOCK.get());
        simpleBlock(ModBlocks.NETHERRACK_NICHOLER_ORE.get());
        simpleBlock(ModBlocks.ENDSTONE_NICHOLER_ORE.get());
        simpleBlock(ModBlocks.NICHOLER_ORE.get());
        simpleBlock(ModBlocks.MUDDY_COAL_ORE.get());
        simpleBlock(ModBlocks.MUDDY_COPPER_ORE.get());
        simpleBlock(ModBlocks.MUDDY_IRON_ORE.get());
        simpleBlock(ModBlocks.MUDDY_DIAMOND_ORE.get());
        simpleBlock(ModBlocks.MUDDY_EMERALD_ORE.get());
        simpleBlock(ModBlocks.MUDDY_GOLD_ORE.get());
        simpleBlock(ModBlocks.MUDDY_REDSTONE_ORE.get());

        //WOODS
        logBlock((RotatedPillarBlock) ModBlocks.STONY_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.STONY_WOOD.get(), blockTexture(ModBlocks.STONY_LOG.get()), blockTexture(ModBlocks.STONY_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_STONY_LOG.get(), new ResourceLocation(FrayonOres.MODID, "block/stripped_stony_log"),
                new ResourceLocation(FrayonOres.MODID, "block/stripped_stony_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_STONY_WOOD.get(), new ResourceLocation(FrayonOres.MODID, "block/stripped_stony_log"),
                new ResourceLocation(FrayonOres.MODID, "block/stripped_stony_log_top"));
        simpleBlock(ModBlocks.LETACREATE_LEAVES.get());
        simpleBlock(ModBlocks.STONY_SAPLING.get(), models().cross(ModBlocks.STONY_SAPLING.get().getLootTable().getPath(),
                blockTexture(ModBlocks.STONY_SAPLING.get())));

        logBlock((RotatedPillarBlock) ModBlocks.SCULKY_MUSHROOM_GROWER.get());
        simpleBlock(ModBlocks.STONY_PLANK.get());

        buttonBlock((ButtonBlock) NonBlocksRegistry.STONY_BUTTON.get(), blockTexture(ModBlocks.STONY_PLANK.get()));
        pressurePlateBlock((PressurePlateBlock)NonBlocksRegistry.STONY_PRESSURE_PLATE.get(), blockTexture(ModBlocks.STONY_PLANK.get()));
        wallBlock((WallBlock) NonBlocksRegistry.STONY_WALL.get(), blockTexture(ModBlocks.STONY_PLANK.get()));
        fenceBlock((FenceBlock) NonBlocksRegistry.STONY_FENCE.get(), blockTexture(ModBlocks.STONY_PLANK.get()));

        fenceGateBlock((FenceGateBlock) NonBlocksRegistry.STONY_FENCE_GATE.get(), blockTexture(ModBlocks.STONY_PLANK.get()));
        slabBlock((SlabBlock) NonBlocksRegistry.STONY_SLAB.get(), blockTexture(ModBlocks.STONY_PLANK.get()),
                blockTexture(ModBlocks.STONY_PLANK.get()));
        stairsBlock((StairBlock) NonBlocksRegistry.STONY_STAIRS.get(), blockTexture(ModBlocks.STONY_PLANK.get()));

        simpleBlock(ModBlocks.SCULK_AMBUSH.get());

        simpleBlock(ModBlocks.SCULK_MUSHROOM.get(), models().cross(ModBlocks.SCULK_MUSHROOM.get().getLootTable().getPath(),
                blockTexture(ModBlocks.SCULK_MUSHROOM.get())));
        simpleBlock(ModBlocks.POTTED_SCULK_MUSHROOM.get(), flowerPotCross(ModBlocks.POTTED_SCULK_MUSHROOM.get().getLootTable().getPath()));
    }
    public ModelFile flowerPotCross(String name) {
        return models().withExistingParent(name, "flower_pot_cross");
    }
}
