package com.patterns.creationals.abstract_factory.caso4;
/**
 * Este ejercicio realiza un combo de quipos en base a una fabrica de computadora e impresora.
 */

import com.patterns.creationals.abstract_factory.caso4.computers.Computer;
import com.patterns.creationals.abstract_factory.caso4.printers.Printer;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        Computer pc = Factory.getComputer(new FactoryPersonal());
        Printer epson = Factory.getPrinter(new FactoryPersonal());

        System.out.println("Combo hogar");
        System.out.println("------------------------------------------------------");
        System.out.println("Factoria personal creando cmputadora Pc: "+ pc);
        System.out.println("Factoria personal creando impresora Epson: "+ epson);

        Computer server = Factory.getComputer(new FactoryEmpresarial());
        Printer xerox = Factory.getPrinter(new FactoryEmpresarial());

        System.out.println("\nCombo empresarial");
        System.out.println("------------------------------------------------------");
        System.out.println("Factoria Empresarial creando cmputadora Server: "+ server);
        System.out.println("Factoria Empresarial creando impresora Xerox: "+ xerox);
    }
}
