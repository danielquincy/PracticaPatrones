package com.patterns.creationals.builder.caso1;

public class ManualBuilder implements Builder{

    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(boolean gps) {
        this.manual.setGps(gps);
    }

    public Manual getProducto(){
        Manual producto = this.manual;
        this.reset();
        return producto;
    }

}
