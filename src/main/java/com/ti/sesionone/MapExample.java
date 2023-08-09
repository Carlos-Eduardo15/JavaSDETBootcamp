package com.ti.sesionone;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        /*Map<String,Integer> numsMap = new HashMap<>();

        numsMap.put("a", 100);
        numsMap.put("b", 200);
        numsMap.put("c", 300);
        numsMap.put("d", 400);

        System.out.println(numsMap.size());

        for(Map.Entry<String,Integer> subMapNum:numsMap.entrySet()){
            System.out.println(subMapNum.getKey() + ": " + subMapNum.getValue());
        }*/


        //imprime usuarios pero el admin le agrega algo de mas
        /*Map<String,String> users = new HashMap<>();

        users.put("Admin","AdminUser");
        users.put("normalUser","Pepito");
        users.put("SuperUser","Don ramón");
        users.put("Guest","Doña Florinda");

        for(Map.Entry<String,String> user: users.entrySet()){
            if(user.getKey().equals("Admin")){

                System.out.println("The admin value es : " + user.getValue());
            }
            System.out.println(user.getKey());
        }*/

        /*Map<Integer,Double> gamePrices = new LinkedHashMap<>();

        gamePrices.put(1,30.00);
        gamePrices.put(2,43.50);
        gamePrices.put(3,55.99);
        gamePrices.put(4,12.25);
        gamePrices.put(5,0.00);
        gamePrices.put(6,100.00);
        gamePrices.put(6,100.00);//este al reproducirlo, no lo pondre, no lo repetira

        for(Map.Entry<Integer,Double> gamePrice : gamePrices.entrySet()){
            System.out.println("The primary key in the DB is: " + gamePrice.getKey() + " and the price is $" + gamePrice.getValue());
        }*/

        Map<String, List<String>> dropDownInfo = new LinkedHashMap<>();
        List<String> lstFruit = new ArrayList<>();
        lstFruit.add("PineApple");
        lstFruit.add("Banana");
        lstFruit.add("Apple");
        lstFruit.add("Blueberry");

        dropDownInfo.put("Fruits", lstFruit);

        for(Map.Entry<String, List<String>> fruit: dropDownInfo.entrySet()){
            System.out.println("My " + fruit.getKey() + " contains " + fruit.getValue());
            //fruit.getValue().forEach(System.out::println);
            fruit.getValue().forEach(x->{
                if(x.equals("Banana")){
                    System.out.println("I found the Banana");
                }
            });
        }

    }
}
