package com.patterns.creationals.abstract_factory.caso4;

import com.patterns.creationals.abstract_factory.caso4.computers.Computer;
import com.patterns.creationals.abstract_factory.caso4.computers.Server;
import com.patterns.creationals.abstract_factory.caso4.printers.Printer;
import com.patterns.creationals.abstract_factory.caso4.printers.Xerox;

public class FactoryEmpresarial implements AbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;


    @Override
    public Computer createComputer() {
        return new Server();
    }

    @Override
    public Printer createPrinter() {
        return new Xerox();
    }
}
