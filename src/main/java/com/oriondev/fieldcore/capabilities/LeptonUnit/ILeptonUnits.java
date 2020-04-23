package com.oriondev.fieldcore.capabilities.LeptonUnit;

public interface ILeptonUnits {
    //Basic Functions For Adding and removing LU from a block
    public void addUnits(float amount);
    public void removeUnits(float amount);
    public void setUnits(float amount);
//Shows the amount of LU in a given thing
    public float getUnits();
}
