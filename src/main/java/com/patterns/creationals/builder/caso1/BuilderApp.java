package com.patterns.creationals.builder.caso1;

/**
 * Este ejemplo realiza la fabrica de dos tipos de vehiculos con el patron builder.
 */
public class BuilderApp {

    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car car = carBuilder.getProducto();

        System.out.println(car);

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSedanCar(manualBuilder);
        Manual manual = manualBuilder.getProducto();
        System.out.println(manual);

    }
}
