package com.ti.sesionone.polymorphism.overload;

public class Robot {
    /*public static void main(String[] args) {
        System.out.println("Hello, i´m a republic robot");
    }*/
//siempre y cuando el acomodo de los parametros no sea igual al de otro metodo, este funcionara.

    public void hello(){
        System.out.println("Hello, i´m a republic robot");
    }


    public void hello(String name){
        System.out.println("Hello, my robot name is: "+name);
    }

    public void hello(String name, int age){
        System.out.println("Hello, my robot name is: "+name+" and my age is "+age);
    }

/*
    public void hello(int age, String name){

    }
*/

}
