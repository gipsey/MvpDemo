package org.davidd.mvpdemo.mvp;

/**
 * @author David Debre on Jan 15, 2018.
 */
public interface MvpPresenter<V extends MvpView> {

    /**
     * setting up / releasing the view for the presenter
     */

    void attach(V view);

    void detach();
}
