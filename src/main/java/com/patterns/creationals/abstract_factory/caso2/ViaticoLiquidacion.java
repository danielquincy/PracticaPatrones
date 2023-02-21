package com.patterns.creationals.abstract_factory.caso2;

public class ViaticoLiquidacion extends Liquidacion{
    @Override
    void liquidar() {
        System.out.println("============================");
        System.out.println("Liquidacion de Viaticos!..");
        System.out.println("============================");
    }
}
