package net.ordinaryrock.myfirstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MYFIRSTMOD_TAB = new CreativeModeTab("myfirstmod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.XEN_CRYSTAL_SHARD.get());
        }
    };
}
