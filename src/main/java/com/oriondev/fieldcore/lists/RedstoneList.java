package com.oriondev.fieldcore.lists;

import com.oriondev.fieldcore.Main;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.block.Blocks.OBSIDIAN;

public class RedstoneList {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> OBSIDIAN_DOOR = BLOCKS.register("obsidian_door", () -> new ObsidianDoor(Block.Properties.from(Blocks.IRON_DOOR).hardnessAndResistance(50, 120)));
    public static final RegistryObject<Block> OBSIDIAN_BUTTON = BLOCKS.register("obsidian_button", () -> new ObsidianButton(Block.Properties.from(Blocks.STONE_BUTTON).hardnessAndResistance(50, 120)));
    public static final RegistryObject<Block> OBSIDIAN_PRESSURE_PLATE = BLOCKS.register("obsidian_pressure_plate", () -> new ObsidianPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(50, 120)));

}
