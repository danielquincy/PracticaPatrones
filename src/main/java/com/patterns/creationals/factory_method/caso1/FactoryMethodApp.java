package com.patterns.creationals.factory_method.caso1;

public class FactoryMethodApp {
    static Creator creator;
    static int tipo = 9;

    public static void main(String...ars){

        if(tipo == 1) creator = new AvanicoCreator();
        else if(tipo == 2) creator = new PlanchaCreator();
        else creator = new TelevisorCreator();

        creator.funcionar();
    }
}
