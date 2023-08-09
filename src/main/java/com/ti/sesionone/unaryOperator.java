package com.ti.sesionone;

import java.util.Scanner;

public class unaryOperator {
    public static void main(String[] args) {
        //imprimir el minus del numero que ingresamos, debemos incrementarlo con un pro y post incremento
        Scanner sc = new Scanner(System.in);
        //pido numero
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        System.out.println(num);

        int num1= num;
        int num2= num;
        int num3 = num;
        int num4 = num;

        System.out.println("plus");
        //plus
        int convP = +num1;
        System.out.println(convP);


        System.out.println("minus");
        //minus
        int convM = -num2;
        System.out.println(convM);

        //prefix

        System.out.println("prefix");
        //plus
        int conPP = num3;
        System.out.println(conPP);
        conPP++;
        System.out.println(conPP);
        //less
        int conPL = num3;
        System.out.println(conPL);
        conPL--;
        System.out.println(conPL);

        //postfix

        System.out.println("prefix");
        //plus
        int preP= num4;
        System.out.println(preP);
        ++preP;
        System.out.println(preP);
        //less
        int preL = num4;
        System.out.println(preL);
        --preL;
        System.out.println(preL);


    }
}
