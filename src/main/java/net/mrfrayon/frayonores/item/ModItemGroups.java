package net.mrfrayon.frayonores.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab FRAYON_ORE_TAB = new CreativeModeTab("frayonores") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LEAD_INGOT.get());
        }
    };
}
