package com.patterns.creationals.factory_method.caso3;

import java.math.BigDecimal;

public class Impuesto implements Component{
    final BigDecimal IVA = BigDecimal.valueOf(0.15);

    @Override
    public void calcular(Liquidar entity) {

        entity.setMontoImpuestos(entity.getMontoVenta().multiply(IVA));
        System.out.println("zapatos calculo");
        System.out.println("---------------------------------------------------------------");
        System.out.println("MONTO VENTA             = " + entity.getMontoVenta());
        System.out.println("MONTO IMPUESTO          = " + entity.getMontoImpuestos());
        System.out.println("TOTAL NETO              = " + entity.getMontoVenta().add(entity.getMontoImpuestos()));
        System.out.println("---------------------------------------------------------------");
    }
}
