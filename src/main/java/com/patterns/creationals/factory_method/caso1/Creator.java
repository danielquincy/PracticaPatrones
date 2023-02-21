package com.patterns.creationals.factory_method.caso1;

public abstract class Creator {

    public void funcionar(){
        Product product = createProduct();
        product.encender();
    }

    abstract Product createProduct();

}
