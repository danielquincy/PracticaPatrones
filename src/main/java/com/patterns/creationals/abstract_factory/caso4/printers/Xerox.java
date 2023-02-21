package com.patterns.creationals.abstract_factory.caso4.printers;

public class Xerox extends Printer {

    @Override
    void print() {
        System.out.println("Accion imprimir desde una impresora marca Xerox");
    }

    @Override
    public String toString() {
        return "Xerox{}";
    }
}
