package com.patterns.creationals.prototype.caso2;

import java.util.ArrayList;
import java.util.List;

public class PrototypeApp {

    public static void main(String[] args) {

        List<Shape> shapeList = new ArrayList<>();
        Circle circle = new Circle();
        circle.x = 2;
        circle.y = 2;
        circle.color = "red";
        circle.radius = 8;

        System.out.print("ORIGINAL => ");
        System.out.println(circle);
        shapeList.add(circle);

        Circle cloneCircle = circle.clone();
        System.out.print("COPY => ");
        System.out.println(cloneCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "yellow";
        shapeList.add(rectangle);

        List<Shape> shapeList2 = new ArrayList<>();
        for(Shape obj : shapeList){
            shapeList2.add(obj.clone());
        }

        System.out.print("\n\nORIGINAL LIST => ");
        System.out.println(shapeList);

        System.out.print("CLONE LIST => ");
        System.out.println(shapeList2);

    }



}
