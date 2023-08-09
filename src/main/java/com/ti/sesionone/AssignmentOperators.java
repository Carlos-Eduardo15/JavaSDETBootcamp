package com.ti.sesionone;

import java.util.Scanner;

public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1 = 5;
        byte num2 = 3;

        num1 %= num2;

        System.out.println(num1);
    }
}
