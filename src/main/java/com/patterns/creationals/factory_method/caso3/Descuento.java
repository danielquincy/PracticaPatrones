package com.patterns.creationals.factory_method.caso3;

import java.math.BigDecimal;

public class Descuento implements Component{

    final BigDecimal PORCENTAJE_MAYOR_50000 = BigDecimal.valueOf(0.01);
    final BigDecimal PORCENTAJE_MAYOR_70000 = BigDecimal.valueOf(0.02);
    final BigDecimal PORCENTAJE_MAYOR_80000 = BigDecimal.valueOf(0.03);

    @Override
    public void calcular(Liquidar entity) {

        if( entity.getMontoVenta().compareTo(BigDecimal.valueOf(50000)) > 0){
            entity.setPorcentajeDescuentoAplicado(PORCENTAJE_MAYOR_50000);
        }else if( entity.getMontoVenta().compareTo(BigDecimal.valueOf(70000)) > 0){
            entity.setPorcentajeDescuentoAplicado(PORCENTAJE_MAYOR_70000);
        }else if( entity.getMontoVenta().compareTo(BigDecimal.valueOf(80000)) > 0){
            entity.setPorcentajeDescuentoAplicado(PORCENTAJE_MAYOR_80000);
        }

        entity.setMontoDescuento(entity.getMontoVenta().multiply(entity.getPorcentajeDescuentoAplicado()));

        System.out.println("libros calculo");
        System.out.println("---------------------------------------------------------------");
        System.out.println("MONTO VENTA             = " + entity.getMontoVenta());
        System.out.println("PORCENTAJE DESCUENTO    = " + entity.getPorcentajeDescuentoAplicado());
        System.out.println("MONTO DESCUENTO         = " + entity.getMontoDescuento());
        System.out.println("TOTAL NETO              = " + entity.getMontoVenta().subtract(entity.getMontoDescuento()));
        System.out.println("---------------------------------------------------------------");

    }
}
