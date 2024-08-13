package com.mua.mmencalendar;

public class DayItem {

    private String dayName;
    private int dayNumber;

    public DayItem(String dayName, int dayNumber) {
        this.dayName = dayName;
        this.dayNumber = dayNumber;
    }

    public String getDayName() {
        return dayName;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}
