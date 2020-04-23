package com.oriondev.fieldcore.events;


import com.oriondev.fieldcore.Main;
import com.oriondev.fieldcore.lists.ItemList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus =Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents
{

    public static final Logger LOGGER = Main.LOGGER;
    public static final String MOD_ID = Main.MOD_ID;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll
                (

                        ItemList.iron_ore_chunk = new Item(new Item.Properties().group
                                (ItemGroup.MISC)



                        ).setRegistryName(location("iron_ore_chunk"))

                );
        event.getRegistry().registerAll
                (

                        ItemList.gold_ore_chunk = new Item(new Item.Properties().group
                                (ItemGroup.MISC)



                        ).setRegistryName(location("gold_ore_chunk"))

                );

    }

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MOD_ID, name);
    }
}
