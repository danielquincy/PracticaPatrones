package com.patterns.creationals.factory_method.caso4;

public class FactoryMethodApp {

    public static void main(String[] args) {
        Computer pc = Factory.getComputer("PC","16Gb","1Tb", "Intel® Core™ i9");
        Computer server = Factory.getComputer("Server","128Gb","1Tb", "Intel® Xeon® W-3200 ");

        System.out.println("Factory PC Config::"+ pc);
        System.out.println("Factory Server Config::"+ server);
    }
}
