package com.ti.sesionone;

public class SwitchStructure {
    static String hero = "Spider-Man";
    static String loki = "";
    public static void main(String[] args) {
        /*switch(hero){
            case "Iron-Man":
                loki = "Mandarin";
                break;
            case "Spider-Man":
                loki = "Venom";
                break;
            case "Hulk":
                loki = "Abobinaton";
                break;
            case "Daredevil":
                loki = "Kingpin";
                break;
            default:
                loki = "loki";
                break;
        }*/

        //arrow functions
        /*switch(hero){
            case "Iron-Man" -> { loki = "Mandarin"; }
            case "Spider-Man" -> { loki = "Venom"; }
            case "Hulk" -> { loki = "Abobination"; }
            case "Daredevil" -> { loki = "Kingpink"; }
            default -> {loki = "loki";}
        }*/

        //este nos podria servir para almacenar el valor y los case funcionaria como true's y el default como false
        loki = switch (hero){
            case "Iron-Man" -> "Mandarin";
            case "Spider-Man"-> "Venom";
            case "Hulk"-> "Abobination";
            case "Daredevil"-> "Kingpink";
            default -> "loki";
        };

        System.out.println(loki);
    }
}
