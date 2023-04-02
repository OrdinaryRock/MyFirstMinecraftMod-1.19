package net.ordinaryrock.myfirstmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ordinaryrock.myfirstmod.MyFirstMod;
import net.ordinaryrock.myfirstmod.item.ModCreativeModeTab;
import net.ordinaryrock.myfirstmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MyFirstMod.MOD_ID);
    public static final RegistryObject<Block> GLUON_CRYSTAL_BLOCK =
            registerBlock("gluon_crystal_block",
                                () -> new Block(BlockBehaviour.Properties
                                        .of(Material.SNOW)
                                        .strength(6f)
                                        .requiresCorrectToolForDrops()),
                                ModCreativeModeTab.MYFIRSTMOD_TAB);
    public static final RegistryObject<Block> GLUON_ORE =
            registerBlock("gluon_ore",
                                () -> new DropExperienceBlock(BlockBehaviour.Properties
                                        .of(Material.STONE)
                                        .strength(6f)
                                        .requiresCorrectToolForDrops(),
                                        UniformInt.of(3, 7)
                                        ),
                                ModCreativeModeTab.MYFIRSTMOD_TAB);
    public static final RegistryObject<Block> DEEPSLATE_GLUON_ORE =
            registerBlock("deepslate_gluon_ore",
                                () -> new DropExperienceBlock(BlockBehaviour.Properties
                                        .of(Material.STONE)
                                        .strength(6f)
                                        .requiresCorrectToolForDrops(),
                                        UniformInt.of(3, 7)
                                        ),
                                ModCreativeModeTab.MYFIRSTMOD_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> registeredBlock = BLOCKS.register(name, block);
        registerBlockItem(name, registeredBlock, tab);
        return registeredBlock;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
