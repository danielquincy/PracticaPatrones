package com.patterns.creationals.abstract_factory.caso4.computers;

public class Pc extends Computer {

    @Override
    void encender() {
        System.out.println("Accion de encender un Pc de esctorio");
    }

    @Override
    public String toString() {
        return "Pc{}";
    }
}