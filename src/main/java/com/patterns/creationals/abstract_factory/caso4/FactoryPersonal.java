package com.patterns.creationals.abstract_factory.caso4;

import com.patterns.creationals.abstract_factory.caso4.computers.Computer;
import com.patterns.creationals.abstract_factory.caso4.computers.Pc;
import com.patterns.creationals.abstract_factory.caso4.printers.Epson;
import com.patterns.creationals.abstract_factory.caso4.printers.Printer;

public class FactoryPersonal implements AbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public Computer createComputer() {
        return new Pc();
    }

    @Override
    public Printer createPrinter() {
        return new Epson();
    }
}
