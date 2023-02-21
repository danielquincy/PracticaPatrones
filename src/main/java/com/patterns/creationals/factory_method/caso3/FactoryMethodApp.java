package com.patterns.creationals.factory_method.caso3;

import java.math.BigDecimal;

public class FactoryMethodApp {

    public static void main(String...ars){

        Liquidar libros = new VentaLibros();
        libros.setMontoVenta(BigDecimal.valueOf(78000));
        libros.calcular();

        Liquidar zapatos = new VentaZapatos();
        zapatos.setMontoVenta(BigDecimal.valueOf(34000));
        zapatos.calcular();

    }
}
