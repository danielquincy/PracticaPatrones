package com.patterns.creationals.builder.caso2;

public class ComputerBuilder{
    private String HDD;
    private String RAM;
    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    public ComputerBuilder(String hdd, String ram){
        this.HDD=hdd;
        this.RAM=ram;
    }
    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        return this;
    }
    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }

    public Computer build(){
        return new Computer(this);
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
}