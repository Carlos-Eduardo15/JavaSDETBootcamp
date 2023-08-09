package com.ti.sesionone.interfaces;

public class Car implements Vehicle{
    int speed;


    @Override
    public String stop(int quantity) {
        speed -= quantity;
        return "The car has stopped ans is goind "+ speed +" km/h";
    }

    @Override
    public String accelerate(int quantity) {
        String speeding="";
        speed+= quantity;
        if(speed>MAXIMUM_SPEED){
            speeding="Spedding";
        speeding+= "The car has accelerated and id going "+ speed+" km/h";
        }else if (speed<0){
            speeding="the car is stopped";
        }
        return speeding;
    }


    @Override
    public void vehicleName(String name) {
        System.out.println("I'm a Mustang!");
    }
}
