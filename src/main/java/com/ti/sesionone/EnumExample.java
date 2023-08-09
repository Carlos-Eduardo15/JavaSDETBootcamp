package com.ti.sesionone;

public class EnumExample {
//el nombre de estas variables se acostumbrn en mayusculas
    static final String FIRE_FOX = "www.pagina.com";
    static final String CHROME = "www.pagina.com";


    public static void main(String[] args) {
        WeekDays today = WeekDays.WEDNSDAY;

        System.out.println(WeekDays.MONDAY.event);
        System.out.println(today);
    }

    private String selectBrowser(Browsers b){
        String browserSelected = switch (b){
            case EDGE -> "Opening Edge browser";
            case CHROME -> "Opening Chrome browseer";
            case FIRE_FOX -> "Opening Firefox browser";
            default -> "Bad option";
        };
        return browserSelected;
    }
}
