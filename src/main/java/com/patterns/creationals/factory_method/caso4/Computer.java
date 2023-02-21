package com.patterns.creationals.factory_method.caso4;

public abstract class Computer {
    abstract String getRam();
    abstract String getHdd();
    abstract String getCpu();

    @Override
    public String toString() {
        return "Computer{ "
                + "RAM: "+ this.getRam()
                + ", HDD: " + this.getHdd()
                + ", CPU: " + this.getCpu()
                + "}";
    }
}
