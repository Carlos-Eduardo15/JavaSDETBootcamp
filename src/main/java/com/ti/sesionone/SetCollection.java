package com.ti.sesionone;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> country = new HashSet<>();

        country.add("Mexico");
        country.add("Canada");
        country.add("Australia");

        country.add("Mexico");
        System.out.println(country);
        //imprime el tamaño de la construcción.
        System.out.println(country.size());

        //remove of a construction
        country.remove("Australia");
        System.out.println("Set after removing Australia " + country);

        Iterator<String>  i = country.iterator();
        //imprimirlos por una lista
        while (i.hasNext())
            System.out.println(i.next());
    }
}
