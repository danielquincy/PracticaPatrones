package com.patterns.creationals.factory_method.caso1;

public class PlanchaCreator extends Creator {

    @Override
    Product createProduct() {
        return new Plancha();
    }
}
