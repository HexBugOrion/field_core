package com.oriondev.fieldcore.capabilities.LeptonUnit;

import net.minecraft.command.arguments.NBTTagArgument;
import net.minecraft.nbt.FloatNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;

import net.minecraftforge.common.capabilities.Capability;




public class LeptonStorage implements Capability.IStorage<LeptonUnit> {


    @Override
    public INBT writeNBT(Capability<LeptonUnit> capability, LeptonUnit instance, Direction side) {

        return FloatNBT.valueOf(instance.getUnits());

    }

    @Override
    public void readNBT(Capability<LeptonUnit> capability, LeptonUnit instance, Direction side, INBT nbt) {
    instance.setUnits(((FloatNBT)nbt).getFloat() );
    }
}
