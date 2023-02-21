package com.patterns.creationals.factory_method.caso3;

import java.math.BigDecimal;

public abstract class Liquidar {

    BigDecimal montoVenta;
    BigDecimal porcentajeDescuentoAplicado;
    BigDecimal montoDescuento;
    BigDecimal montoImpuestos;


    public void calcular(){
        Component algoritmo = obtenerComponent();
        algoritmo.calcular(this);
    }

    abstract Component obtenerComponent();

    public BigDecimal getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(BigDecimal montoVenta) {
        this.montoVenta = montoVenta;
    }

    public BigDecimal getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(BigDecimal montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public BigDecimal getMontoImpuestos() {
        return montoImpuestos;
    }

    public void setMontoImpuestos(BigDecimal montoImpuestos) {
        this.montoImpuestos = montoImpuestos;
    }

    public BigDecimal getPorcentajeDescuentoAplicado() {
        return porcentajeDescuentoAplicado;
    }

    public void setPorcentajeDescuentoAplicado(BigDecimal porcentajeDescuentoAplicado) {
        this.porcentajeDescuentoAplicado = porcentajeDescuentoAplicado;
    }
}
