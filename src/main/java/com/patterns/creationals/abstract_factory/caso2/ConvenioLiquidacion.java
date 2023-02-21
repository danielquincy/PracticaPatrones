package com.patterns.creationals.abstract_factory.caso2;

public class ConvenioLiquidacion extends Liquidacion{
    @Override
    void liquidar() {
        System.out.println("============================");
        System.out.println("Liquidacion de convenio!..");
        System.out.println("============================");
    }
}
