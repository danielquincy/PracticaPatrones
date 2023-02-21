package com.patterns.creationals.abstract_factory.caso2;

public class ConvenioLiquidacionFactory implements LiquidacionFactory {
    @Override
    public Liquidacion crearLiquidacion() {
        return new ConvenioLiquidacion();
    }
}
