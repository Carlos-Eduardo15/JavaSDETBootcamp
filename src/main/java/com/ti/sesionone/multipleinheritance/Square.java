package com.ti.sesionone.multipleinheritance;

public class Square extends Shape implements Sides {
    private double side;
/*
    @Override
    public Square(double side) {
        this.side=side;
    }
    @Override
    public double calcularArea() {
        return side*side;
    }
    @Override
    public String shapName() {
        return "square";
    }*/

    @Override
    public int numSides() {
        return 4;
    }
}
