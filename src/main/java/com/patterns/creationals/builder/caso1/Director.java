package com.patterns.creationals.builder.caso1;

public class Director {

    void constructSportCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGps(true);
    }


    void constructSedanCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SedanEngine());
        builder.setTripComputer(true);
        builder.setGps(true);
    }
}
