package com.patterns.creationals.factory_method.caso3;

public class VentaLibros extends Liquidar{
    @Override
    Component obtenerComponent() {
        return new Descuento();
    }
}
