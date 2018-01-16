package org.davidd.mvpdemo.currentDay;

/**
 * @author David Debre on Jan 15, 2018.
 */
public class CurrentDayPresenterImpl implements CurrentDayPresenter {

    private final GetCurrentDayInteractor getCurrentDayInteractor;
    private CurrentDayView view;

    public CurrentDayPresenterImpl(GetCurrentDayInteractor getCurrentDayInteractor) {
        this.getCurrentDayInteractor = getCurrentDayInteractor;
    }

    @Override
    public void attach(CurrentDayView view) {
        this.view = view;
    }

    @Override
    public void detach() {
        view = null;
    }

    @Override
    public void onCurrentDayButtonTap() {
        Day currentDay = getCurrentDayInteractor.getCurrentDay();
        String dayName;

        switch (currentDay.dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "unknown";
        }

        if (view != null) {
            view.showCurrentDay(dayName);
        }
    }
}
