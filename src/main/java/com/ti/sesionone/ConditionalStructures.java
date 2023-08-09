package com.ti.sesionone;

public class ConditionalStructures {
    public static void main(String[] args) {
        String hero = "ron-man";//espacio en memoria
        /*String hero2 = "Iron-man";
        String hero3 = new String("Iron-man");//letras especificas*/
        String loki = "";

        if(hero == "Iron-man"){
            loki = "mandarin";
            System.out.println(loki);
        }else if(hero == "Spider-man") {
            loki= "venom";
        }else{
            loki = "loki";
        }

        System.out.println(loki);

        //if's en if
        /*if(){
            if(){
                hola="hola";
            } else{
                hola="adios";
            }
            loki="venom;"
        }else{

        }*/

        /*System.out.println(hero == hero2);
        System.out.println(hero == hero3);
        System.out.println(hero.equals(hero2));
        System.out.println(hero.equals(hero3));*/

        String hero5="Spider-Man";
        String loki2 = "";


        if(hero5.equals("Iron-Man")){
            loki2 = "Mandarin";
        }else {
            loki2 = "loki";
        }
        System.out.println(loki2);
        //ternario

        System.out.println(hero5.equals("Iron-Man")?"mandarin":"venom");

    }
}
