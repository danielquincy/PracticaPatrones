package com.patterns.creationals.abstract_factory.caso4;

import com.patterns.creationals.abstract_factory.caso4.computers.Computer;
import com.patterns.creationals.abstract_factory.caso4.printers.Printer;

public interface AbstractFactory {
    Computer createComputer();

    Printer createPrinter();
}
