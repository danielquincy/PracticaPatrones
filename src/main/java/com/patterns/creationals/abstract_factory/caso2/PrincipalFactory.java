package com.patterns.creationals.abstract_factory.caso2;

public class PrincipalFactory implements Factory{
    @Override
    public LiquidacionFactory obtenerFactory(int tipo) {

        if( tipo == 1 ) return new PrestacionLiquidacionFactory();
        if(tipo == 2) return  new ViaticoLiquidacionFactory();
        if(tipo == 3) return new ConvenioLiquidacionFactory();

        throw new RuntimeException("Sin factory asociado!");
    }
}
