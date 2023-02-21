package com.patterns.creationals.abstract_factory.caso2;

/**
 * Este ejemplo realiza la fabricación de 3 pasos:
 * Obtener el tipo de Liquidación: Prestacion, Viatico, Convenio.
 * Crear la Loquidación
 * Realizar la Liquidación
 */
public class AbstractFactoryApp {

    int tipo = 3;

    public static void main(String[] args) {
        AbstractFactoryApp app = new AbstractFactoryApp();
        app.liquidar();
    }

    private void liquidar(){
        Factory factory = new PrincipalFactory();
        LiquidacionFactory liquidacionFactory = factory.obtenerFactory(tipo);
        Liquidacion liquidacion = liquidacionFactory.crearLiquidacion();
        liquidacion.liquidar();
    }


}
