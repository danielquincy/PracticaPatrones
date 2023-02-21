package com.patterns.creationals.abstract_factory.caso3;

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
