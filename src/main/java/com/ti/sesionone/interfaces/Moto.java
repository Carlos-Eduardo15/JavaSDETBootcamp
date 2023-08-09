package com.ti.sesionone.interfaces;

public class Moto implements Vehicle{
    int speed;
    @Override
    public String stop(int quantity) {
        speed -= quantity;
        return "The moto has stopped and is going "+ speed+" km/h";
    }

    @Override
    public String accelerate(int quantity) {
        String speeding="";
        speed+= quantity;
        if(speed>MAXIMUM_SPEED){
            speeding="Spedding";
            speeding+= "The moto has accelerated and id going "+ speed+" km/h";
        }else if (speed<0){
            speeding="the moto is stopped";
        }
            return speeding;
}

    @Override
    public void vehicleName(String name) {
        System.out.println("I'm a Mustang!");
    }
}
