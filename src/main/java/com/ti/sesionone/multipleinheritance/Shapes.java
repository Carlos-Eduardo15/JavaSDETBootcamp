package com.ti.sesionone.multipleinheritance;

import java.util.LinkedList;

public class Shapes {
    private LinkedList<Shape> shapeLinkedList = new LinkedList<>();
    public void addShape(Shape shape){
        shapeLinkedList.add(shape);
    }/*
    public void list(){
        for(Shape shape:shapeLinkedList){
            System.out.println("shape name is: "+ shape.shapName());

            if(shape instanceof Sides){
                Sides s =(sid);
            }
        }
    }*/
}
