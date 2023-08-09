package com.ti.sesionone;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number");
         double num2 = sc.nextDouble();

         double sum =num1+num2;
         double sub = num1 - num2;
         double mult = num1 * num2;
         double div = num1 / num2;

        System.out.println("The sum of the two number es "+ sum);
        System.out.println(String.format("The difference of the two number is %f and the product is %f",sub,mult));
        System.out.println("The difference of the two number is "+ sub +" and the product is "+mult);
        System.out.println("The quotient of the numbers is " + div);
    }
}
