package com.patterns.creationals.abstract_factory.caso2;

public class PrestacionLiquidacion extends Liquidacion{
    @Override
    void liquidar() {
        System.out.println("============================");
        System.out.println("Liquidacion de prestaciones");
        System.out.println("============================");
    }
}
