package com.patterns.creationals.prototype.caso2;

public abstract class Shape {
    int x;
    int y;
    String color;

    public Shape() {
    }

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.x;
        this.color = source.color;
    }

    public abstract Shape clone();
}
