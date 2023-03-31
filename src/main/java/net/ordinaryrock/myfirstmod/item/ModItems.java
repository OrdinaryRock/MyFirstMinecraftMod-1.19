package net.ordinaryrock.myfirstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ordinaryrock.myfirstmod.MyFirstMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstMod.MOD_ID);

    public static final RegistryObject<Item> XEN_CRYSTAL_SHARD = ITEMS.register("xen_crystal_shard",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> XEN_CRYSTAL = ITEMS.register("xen_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
