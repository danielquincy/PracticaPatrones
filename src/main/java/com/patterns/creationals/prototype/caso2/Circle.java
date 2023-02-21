package com.patterns.creationals.prototype.caso2;

import java.util.Objects;

public class Circle extends Shape{

    int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", hash=" + hashCode() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, super.x, super.y, super.color);
    }
}
