package com.patterns.creationals.builder.caso1;

public interface Builder {
    void reset();
    void setSeats(int seats);

    void setEngine(Engine engine);
    void setTripComputer(boolean tripComputer);
    void setGps(boolean gps);
}
