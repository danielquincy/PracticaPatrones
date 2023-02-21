package com.patterns.creationals.abstract_factory.caso3;

/**
 * Este ejercicio realiza la fabrica de una computadora con base a los componentes que se le pasen.
 */
public class AbstractFactoryApp {

    public static void main(String[] args) {
        Computer pc = Factory.getComputer(new PcFactory("16Gb","1Tb", "Intel® Core™ i9"));
        Computer server = Factory.getComputer(new ServerFactory("128Gb","1Tb", "Intel® Xeon® W-3200 "));

        System.out.println("Factory PC Config::"+ pc);
        System.out.println("Factory Server Config::"+ server);
    }
}
