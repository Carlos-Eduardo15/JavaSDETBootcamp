package com.ti.sesionone.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printer(10);
        //p.print();

        PrinterString ps = new PrinterString();
        ps.printer(("Printing"));
        //ps.print();


        PrinterGeneric<Integer> pg = new PrinterGeneric<>();
        pg.print("my t is String");

        PrinterGeneric<Double> pd = new PrinterGeneric<>();
        pg.print(100.00);

        List<String> ls = new ArrayList<String>();
    }
}
