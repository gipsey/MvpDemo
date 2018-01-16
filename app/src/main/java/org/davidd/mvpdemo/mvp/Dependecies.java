package org.davidd.mvpdemo.mvp;

import org.davidd.mvpdemo.currentDay.CurrentDayPresenter;
import org.davidd.mvpdemo.currentDay.CurrentDayPresenterImpl;
import org.davidd.mvpdemo.currentDay.GetCurrentDayInteractor;
import org.davidd.mvpdemo.currentDay.GetCurrentDayInteractorImpl;

import java.util.Calendar;

/**
 * @author David Debre on Jan 16, 2018.
 */
public class Dependecies {

    public static CurrentDayPresenter provideCurrentDayPresenter() {
        Calendar calendar = Calendar.getInstance();
        GetCurrentDayInteractor interactor = new GetCurrentDayInteractorImpl(calendar);
        return new CurrentDayPresenterImpl(interactor);
    }
}
