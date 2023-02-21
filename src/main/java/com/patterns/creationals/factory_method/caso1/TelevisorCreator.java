package com.patterns.creationals.factory_method.caso1;

public class TelevisorCreator extends Creator {


    @Override
    Product createProduct() {
        return new Televisor();
    }
}
