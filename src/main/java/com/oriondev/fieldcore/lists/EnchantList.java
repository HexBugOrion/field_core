package com.oriondev.fieldcore.lists;

import com.oriondev.fieldcore.Main;
import com.oriondev.fieldcore.enchantments.VaultingEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantList {

    public static final DeferredRegister<Enchantment> ENCHANTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, Main.MOD_ID);

    public static final RegistryObject<Enchantment> VAULTING = ENCHANTS.register("vaulting", () -> new VaultingEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {

            EquipmentSlotType.FEET

    }));
}
