package com.ti.sesionone;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("Audi");
        car.add("Porshe");
        car.add("Mercedez");
        car.add("HOla");
        //si no se hubiera especificado el tipo estos habran jalado
        /*car.add(1);
        car.add(11.89);*/

        //imprime el tamaño de la lista
        System.out.println(car.size());
        //imprime la lista en una linea
        System.out.println(car);

        //podemos reemplazar
        car.set(4,"Jaguar");
        System.out.println(car);

        //encuentra una coincidencia en la lista y guarda la posicion
        int index = car.indexOf("BMW");
        System.out.println("The fisrt ocurrence oe BME is at index "+ index);

        int lastIndex = car.lastIndexOf("Porshe");
        System.out.println("The last ocurrence of proshe us at index " + lastIndex);

        //este lo que hara es mostrarte de atras para adelante la lista escribiendo minimo -1
        System.out.println(car.get(car.size()-2));

        //foreach(funciona unicamente con el mismo tipo de variables)
        for(String cars:car){
            System.out.println("The car is: "+ cars);
        }

        for(int i=0; i< car.size(); i++){
            System.out.println("The car with normal dor is: "+ car.get(i));
    }
}
}
