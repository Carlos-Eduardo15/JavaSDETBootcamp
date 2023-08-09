package com.ti.sesionone;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n1 =5;
        byte n2 = 10;
        int res;

        if(n1 > n2){
            System.out.println(n1 + n2);
        }else{
            System.out.println(n1 - n2);
        }

        //System.out.println((n1 > n2)?( n1 + n2):(n1 - n2));

        res = (n1>n2)?(n1+n2):(n1-n2);

        System.out.println("Result = "+res);
    }
}
