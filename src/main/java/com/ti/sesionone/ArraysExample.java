package com.ti.sesionone;

public class ArraysExample {
    public static void main(String[] args) {
        /*int[] arr;
        arr = new int [5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //arr[5] = 60; //este es uno que no debe de por que empezo con 0 y solo tiene 5 lugares

        for(int i = 0; i < arr.length; i++){
            System.out.println("Element at index: " + i + ": " + arr[i]);
        }*/




        int[] arr1 = {2,7,9};
        int[] arr2 = {3,6,1};
        int[] arr3 = {7,4,2};
        int[] arr4 = {5,3,0};

        int[][] arra= {
                arr1,
                arr2,
                arr3,
                arr4
        };

        for (int i = 0; i< arra.length; i++){
            for(int j=0; j<3; j++){
                System.out.println(arra[i][j]);
            }
        }


        int[][] arr = {
                {2,7,9},
                {3,6,1},
                {7,4,2},
                {5,3,0}
        };

        for (int i = 0; i< arr.length; i++){
            for(int j=0; j<3; j++){
                System.out.println(arr[i][j]);
            }
        }

        int[] intArray = new int[20];//este fija el tamaño del 0 al 19
    }
}
