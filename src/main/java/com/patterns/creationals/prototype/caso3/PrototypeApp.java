package com.patterns.creationals.prototype.caso3;

public class PrototypeApp{

    public static void main(String[] args) throws CloneNotSupportedException{
        String moviePrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
        System.out.println(moviePrototype);

        String albumPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM).toString();
        System.out.println(albumPrototype);

        String showPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW).toString();
        System.out.println(showPrototype);
    }
}
