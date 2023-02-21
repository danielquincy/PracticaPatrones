package com.patterns.creationals.builder.caso1;

public class CarBuilder implements Builder{

    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(boolean gps) {
        this.car.setGps(gps);
    }

    public Car getProducto(){
        Car producto = this.car;
        this.reset();
        return producto;
    }

}
