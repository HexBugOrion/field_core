package com.oriondev.fieldcore.events;


import com.oriondev.fieldcore.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus =Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents
{

    public static final Logger LOGGER = Main.LOGGER;
    public static final String MOD_ID = Main.MOD_ID;

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MOD_ID, name);
    }
}
