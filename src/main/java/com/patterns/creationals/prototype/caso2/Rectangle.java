package com.patterns.creationals.prototype.caso2;

import java.util.Objects;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", hash=" + hashCode() +
                '}';
    }



    @Override
    public int hashCode() {
        return Objects.hash(width, height, super.x, super.y, super.color);
    }
}
