package com.ti.sesionone.encapsulation;

public class Area {
    int lenght;
    int breadht;

    public Area(int lenght, int breadht) {
        this.lenght = lenght;
        this.breadht = breadht;
    }
    public void getArea(){
        int area= lenght+breadht;
        System.out.println("Area is: " + area);
    }
}
