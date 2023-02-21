package com.patterns.creationals.factory_method.caso1;

public class AvanicoCreator extends Creator {
    @Override
    Product createProduct() {
        return new Avanico();
    }
}
