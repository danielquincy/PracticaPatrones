package com.patterns.creationals.builder.caso2;

/**
 * Este equipo muestra como armar un set de3 computadora con patron builder.
 */
public class BuilderApp {

    public static void main(String[] args) {

        Computer comp = new ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

        System.out.println(comp);
    }
}
