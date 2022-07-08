package net.mrfrayon.frayonores.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.mrfrayon.frayonores.FrayonOres;
import net.mrfrayon.frayonores.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, FrayonOres.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModItems.LEAD_INGOT);
        simpleItem(ModItems.ANTINOMY);
        simpleItem(ModItems.NICHOLER_DUST);
        simpleItem(ModItems.ALIMINIUM_INGOT);
        simpleItem(ModItems.TERRACOTA_STICK);
        simpleItem(ModItems.ORE_BELL);
        simpleItem(ModItems.RAW_BOLARIUM);
        simpleItem(ModItems.BOLARIUM_INGOT);
        handheldItem(ModItems.BOLARIUM_AXE);
        handheldItem(ModItems.BOLARIUM_HOE);
        handheldItem(ModItems.BOLARIUM_PICKAXE);
        handheldItem(ModItems.BOLARIUM_SHOVEL);
        handheldItem(ModItems.BOLARIUM_SWORD);
        handheldItem(ModItems.WARDEN_ABOMINATION);
        handheldItem(ModItems.SCULK_BOOTS);
        handheldItem(ModItems.SCULK_LEGGINGS);
        handheldItem(ModItems.SCULK_CHESTPLATE);
        handheldItem(ModItems.SCULK_HELMET);

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FrayonOres.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(FrayonOres.MODID,"item/" + item.getId().getPath()));
    }
}
