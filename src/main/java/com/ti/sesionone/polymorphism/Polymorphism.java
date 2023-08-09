package com.ti.sesionone.polymorphism;

import com.ti.sesionone.polymorphism.coercion.TriplerNumber;
import com.ti.sesionone.polymorphism.inheritance.Airplane;
import com.ti.sesionone.polymorphism.inheritance.ElectricBicycle;
import com.ti.sesionone.polymorphism.inheritance.Vehicle;
import com.ti.sesionone.polymorphism.inheritance.example.Cutlery;
import com.ti.sesionone.polymorphism.inheritance.example.Fork;
import com.ti.sesionone.polymorphism.inheritance.example.Knife;
import com.ti.sesionone.polymorphism.inheritance.example.Spoon;
import com.ti.sesionone.polymorphism.overload.Robot;
import com.ti.sesionone.polymorphism.parametric.Persona;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args) {
        //overload
        Robot droide = new Robot();
        droide.hello();
        droide.hello("R2-D2");
        droide.hello("RC3-PO",200);


        //coercion
        TriplerNumber t = new TriplerNumber();
        double num1=2.5;
        int num2=5;

        System.out.println(t.tripler(num1));
        System.out.println(t.tripler(num2));
        System.out.println(t.tripler(1.5f));

        //parametric
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Luis", 32));
        personas.add(new Persona("Karen", 21));
        for(Persona persona:personas){
            persona.returnInformation();
        }

        //polimorfismo por parametros
        List<Robot> robot = new ArrayList<>();
        robot.add(new Robot());
        robot.add(new Robot());

        test(new Vehicle());
        test(new Airplane());
        test(new ElectricBicycle());
        test(new Cutlery());
        test(new Spoon());
        test(new Fork());
        test(new Knife());
    }
    public static void test(Vehicle v){
        v.turnOn();
    }

    public static void test(Cutlery cu){
        cu.utility();
    }
    public static void test(Spoon sp){
        sp.utility();
    }
    public static void test(Fork fo){
        fo.utility();
    }
    public static void test(Knife kn){
        kn.utility();
    }
}
