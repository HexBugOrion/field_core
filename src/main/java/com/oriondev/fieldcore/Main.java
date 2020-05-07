package com.oriondev.fieldcore;


import com.oriondev.fieldcore.lists.RedstoneList;
import com.oriondev.fieldcore.lists.EnchantList;
import com.oriondev.fieldcore.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("fieldcore")
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main {

    public static Main instance;
    public static final String MOD_ID = "fieldcore";
    public static final Logger LOGGER = LogManager.getLogger();

    public Main()
    {
        instance = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::Setup);
        modEventBus.addListener(this::ClientSetup);

        EnchantList.ENCHANTS.register(modEventBus);
        ItemList.ITEMS.register(modEventBus);
        RedstoneList.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        RedstoneList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {

            final Item.Properties properties = new Item.Properties().group(ItemGroup.REDSTONE);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
             });

    }

    private void Setup(final FMLCommonSetupEvent event)
    {

    }

    private void ClientSetup(final FMLClientSetupEvent event)
    {

    }

    public void onServerStarting(FMLServerStartingEvent event)
    {

    }
}
