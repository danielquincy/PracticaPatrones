package com.patterns.creationals.abstract_factory.caso4.computers;

public class Server extends Computer {

    @Override
    void encender() {
        System.out.println("Accion de encender un Servidor");
        System.out.println("Aca se espera que los fans hagan tanto ruido como una turbina de avion");
    }

    @Override
    public String toString() {
        return "Server{}";
    }
}
