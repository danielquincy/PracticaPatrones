package com.patterns.creationals.abstract_factory.caso4.printers;

public class Epson extends Printer{

    @Override
    void print() {
        System.out.println("Accion imprimir desde una impresora marca Epson");
    }

    @Override
    public String toString() {
        return "Epson{}";
    }
}
