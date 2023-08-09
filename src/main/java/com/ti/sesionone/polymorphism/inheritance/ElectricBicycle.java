package com.ti.sesionone.polymorphism.inheritance;

public class ElectricBicycle extends Vehicle{

     public void energizeEngine(){
         System.out.println("Engine energized");
     }
    public void turnOnScreen(){
        System.out.println("Engine energized");
    }

    @Override
    public void turnOn(){
        energizeEngine();
        turnOnScreen();
    }
}
