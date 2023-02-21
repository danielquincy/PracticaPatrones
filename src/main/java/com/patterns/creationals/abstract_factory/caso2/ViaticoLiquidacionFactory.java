package com.patterns.creationals.abstract_factory.caso2;

public class ViaticoLiquidacionFactory implements LiquidacionFactory {
    @Override
    public Liquidacion crearLiquidacion() {
        return new ViaticoLiquidacion();
    }
}
