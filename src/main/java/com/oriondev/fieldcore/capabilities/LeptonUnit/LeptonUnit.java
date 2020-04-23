package com.oriondev.fieldcore.capabilities.LeptonUnit;

public class LeptonUnit implements  ILeptonUnits
{
    private float LU = 0;
    @Override
    public void addUnits(float amount){
        this.LU =+ amount;
    }

    @Override
    public void removeUnits(float amount) {
        this.LU =- amount;
    }

    @Override
    public void setUnits(float amount) {
        this.LU = amount;
    }

    @Override
    public float getUnits() {
        return this.LU;
    }
}
