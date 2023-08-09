package com.ti.sesionone.generics;

public class PrinterGeneric <T>{
    /*T thingToPrint;*/

    public <T> void print(T thingToPrint){
        System.out.println(thingToPrint);
    }
}
