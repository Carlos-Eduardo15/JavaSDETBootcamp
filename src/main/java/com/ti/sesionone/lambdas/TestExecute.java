package com.ti.sesionone.lambdas;

public class TestExecute {
    public static void main(String[] args) {
        //Cat cat = new Cat();
        //cat.print();
        //Printable lambdaPrint = n -> "Meow, my name is "+n;
        //printThing(lambdaPrint);
        //System.out.println(lambdaPrint.print("Kitty"));


        Calculator calculator = ((a,b)->{
           double result =a+b;
            System.out.println(result);
        });
        calculator.operation(2,3);//este funciona como el scanner osease que son los datos con los que trabajara
    }

    static void printThing(Printable printable, String name){
        printable.print(name);
    }
}
