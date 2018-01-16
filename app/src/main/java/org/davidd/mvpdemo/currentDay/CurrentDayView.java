package org.davidd.mvpdemo.currentDay;

import org.davidd.mvpdemo.mvp.MvpView;

/**
 * @author David Debre on Jan 15, 2018.
 */
public interface CurrentDayView extends MvpView {

    void showCurrentDay(String currentDay);
}
