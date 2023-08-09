package com.ti.sesionone.polymorphism.inheritance.example;

public class Fork extends Cutlery{

    public void eat(){
        System.out.println("You can eat spaguetti");
    }

    @Override
    public void  utility(){
        eat();
    }
}
