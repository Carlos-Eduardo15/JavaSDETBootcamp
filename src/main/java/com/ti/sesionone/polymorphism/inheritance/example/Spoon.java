package com.ti.sesionone.polymorphism.inheritance.example;

public class Spoon extends Cutlery{
    //son

    public void eat(){
        System.out.println("You can eat soup");
    }

    @Override
    public void  utility(){
        eat();
    }
}
