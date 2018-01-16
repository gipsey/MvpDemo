package org.davidd.mvpdemo.currentDay;

/**
 * @author David Debre on Jan 16, 2018.
 */
public class Day {

    int year;
    int month;
    int dayOfMonth;
    int dayOfWeek;

    public Day(int year, int month, int dayOfMonth, int dayOfWeek) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
    }
}
