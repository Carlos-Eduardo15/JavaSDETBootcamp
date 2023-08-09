package com.ti.sesionone.polymorphism.inheritance;

public class Airplane extends Vehicle{
    public void fuelMix(){
        System.out.println("Fuel mixed!");
    }
    public void injectFuel(){
        System.out.println("inyec the fuel");
    }

    @Override
    public void turnOn(){
        fuelMix();
        injectFuel();
    }
}
