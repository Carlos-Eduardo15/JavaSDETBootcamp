package com.ti.sesionone;

public enum WeekDays {
    MONDAY(2,"Work"),
    TUESDAY(3,"Go to the park"),
    WEDNSDAY(4, "play"),
    THRUSDAY(5,"play2"),
    FRIDAY(6,"play3"),
    SATURDAY(7,"play4"),
    SUNDAY(1,"play5");

    final int ranking;
    final String event;

    WeekDays(int ranking, String event) {
        this.event = event;
        this.ranking = ranking;
    }

}
