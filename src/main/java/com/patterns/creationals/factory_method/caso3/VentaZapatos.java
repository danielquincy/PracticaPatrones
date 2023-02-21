package com.patterns.creationals.factory_method.caso3;

public class VentaZapatos extends Liquidar{
    @Override
    Component obtenerComponent() {
        return new Impuesto();
    }
}
