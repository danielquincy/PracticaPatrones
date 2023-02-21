package com.patterns.creationals.abstract_factory.caso4;

import com.patterns.creationals.abstract_factory.caso4.computers.Computer;
import com.patterns.creationals.abstract_factory.caso4.printers.Printer;

public class Factory {

    public static Computer getComputer(AbstractFactory factory){
        return factory.createComputer();
    }

    public static Printer getPrinter(AbstractFactory factory){
        return factory.createPrinter();
    }
}
