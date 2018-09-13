package com.viral.nirmal.mvvmsample.dashboard.viewmodel;

import android.databinding.Bindable;

import com.viral.nirmal.mvvmsample.viewmodel.BaseItemViewModel;

public class DashboardItemViewModel extends BaseItemViewModel {

    private String title;

    public DashboardItemViewModel() {
        this.title = "";
    }

    @Bindable
    public String getTitle() {
        return String.valueOf(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
