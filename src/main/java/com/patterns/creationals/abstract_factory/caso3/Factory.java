package com.patterns.creationals.abstract_factory.caso3;

public class Factory {

    public static Computer getComputer(AbstractFactory factory){
        return factory.createComputer();
    }
}
