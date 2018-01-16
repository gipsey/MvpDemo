package org.davidd.mvpdemo.currentDay;

import java.util.Calendar;

/**
 * @author David Debre on Jan 16, 2018.
 */
public class GetCurrentDayInteractorImpl implements GetCurrentDayInteractor {

    private final Calendar calendar;

    public GetCurrentDayInteractorImpl(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public Day getCurrentDay() {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        return new Day(year, month, dayOfMonth, dayOfWeek);
    }
}
