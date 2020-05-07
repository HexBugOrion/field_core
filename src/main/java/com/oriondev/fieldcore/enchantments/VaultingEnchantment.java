package com.oriondev.fieldcore.enchantments;

        import com.oriondev.fieldcore.Main;
        import net.minecraft.enchantment.Enchantment;
        import net.minecraft.enchantment.EnchantmentType;
        import net.minecraft.enchantment.Enchantments;
        import net.minecraft.entity.player.PlayerEntity;
        import net.minecraft.inventory.EquipmentSlotType;
        import net.minecraft.potion.EffectInstance;
        import net.minecraft.potion.Effects;
        import net.minecraft.world.World;
        import net.minecraftforge.event.TickEvent;
        import net.minecraftforge.eventbus.api.SubscribeEvent;
        import net.minecraftforge.fml.common.Mod;

public class VaultingEnchantment extends Enchantment {
    public VaultingEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
        super(rarityIn, typeIn, slots);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    protected boolean canApplyTogether(Enchantment ench) {
        return ench.equals(Enchantments.DEPTH_STRIDER) ? false : true;
    }

    @Mod.EventBusSubscriber(modid = Main.MOD_ID)
    public static class VaultingEquipped {

        @SubscribeEvent
        public static void vaultingEffects(TickEvent.PlayerTickEvent event) {

            PlayerEntity PlayerIn = event.player;
            World worldIn = PlayerIn.world;

            if (PlayerIn.isCrouching())
            if (PlayerIn.hasItemInSlot(EquipmentSlotType.FEET))
            {
                PlayerIn.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 20, 0));
            }
        }
    }
}
