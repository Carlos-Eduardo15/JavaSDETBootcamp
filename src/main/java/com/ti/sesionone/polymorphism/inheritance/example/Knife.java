package com.ti.sesionone.polymorphism.inheritance.example;

public class Knife extends Cutlery{
    public void eat(){
        System.out.println("You can eat meat");
    }

    @Override
    public void  utility(){
        eat();
    }
}
