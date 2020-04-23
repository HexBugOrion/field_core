package com.oriondev.fieldcore.capabilities.LeptonUnit;

import com.oriondev.fieldcore.events.CapabilityHandler;
import net.minecraft.nbt.FloatNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jline.utils.InfoCmp;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class LeptonProvider implements ICapabilitySerializable<ICapabilityProvider> {
    public static final Capability<ILeptonUnits> LU_Cap = null;


    @Nonnull
    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {

    }

    @Override
    public ICapabilityProvider serializeNBT() {
        return null;
    }

    @Override
    public void deserializeNBT(ICapabilityProvider nbt) {

    }
}
