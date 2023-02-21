package com.patterns.creationals.abstract_factory.caso2;

public class PrestacionLiquidacionFactory implements LiquidacionFactory {
    @Override
    public Liquidacion crearLiquidacion() {
        return new PrestacionLiquidacion();
    }
}
