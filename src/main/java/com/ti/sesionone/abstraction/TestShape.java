package com.ti.sesionone.abstraction;

public class TestShape {
    public static void main(String[] args) {
        //rectangle
        double width = 5;
        double length=5;
        Shape rectangle = new Rectangle(width,length);
        System.out.println("Rectangle area: "+rectangle.area()+"\nRectnagle perimeter: "+ rectangle.perimeter());
        //circle
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle area: "+circle.area()+"\nCircle perimeter: "+ circle.perimeter());

        //triangle
        double a=5;
        double b=3;
        double c=4;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle area: "+triangle.area()+"\nTriangle perimeter: "+ triangle.perimeter());

    }
}
