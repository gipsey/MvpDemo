package org.davidd.mvpdemo.currentDay;

import org.davidd.mvpdemo.mvp.MvpPresenter;

/**
 * @author David Debre on Jan 15, 2018.
 */
public interface CurrentDayPresenter extends MvpPresenter<CurrentDayView> {

    void onCurrentDayButtonTap();
}
