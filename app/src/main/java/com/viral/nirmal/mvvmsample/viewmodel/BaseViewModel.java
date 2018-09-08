package com.viral.nirmal.mvvmsample.viewmodel;

import android.databinding.BaseObservable;

import com.viral.nirmal.mvvmsample.view.BaseView;

public class BaseViewModel extends BaseObservable {

    protected BaseView view;
    protected boolean isViewVisible;

    public void onViewCreated(BaseView view) {
        this.view = view;
    }

    public void onViewVisible() {
        this.isViewVisible = true;
    }

    public void onViewHidden() {
        this.isViewVisible = false;
    }

    public void destroy() {
        this.isViewVisible = false;
        this.view = null;
    }
}
