package com.ti.sesionone;

import java.util.Scanner;

public class RelationOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number");
        double num2 = sc.nextDouble();

        System.out.println("num1 > num2 is " + (num1>num2));
        System.out.println("num1 < num2 is " + (num1<num2));
        System.out.println("num1 >= num2 is " + (num1>=num2));
        System.out.println("num1 <= num2 is " + (num1<=num2));
        System.out.println("num1 == num2 is " + (num1==num2));
        System.out.println("num1 != num2 is " + (num1!=num2));
    }
}
