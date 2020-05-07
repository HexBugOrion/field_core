package com.oriondev.fieldcore.lists;

import com.oriondev.fieldcore.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> IRON_ORE_CHUNK = ITEMS.register("iron_ore_chunk", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> GOLD_ORE_CHUNK = ITEMS.register("gold_ore_chunk", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
}
