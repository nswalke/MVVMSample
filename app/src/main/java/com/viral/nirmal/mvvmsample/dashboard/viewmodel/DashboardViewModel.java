package com.viral.nirmal.mvvmsample.dashboard.viewmodel;

import android.databinding.Bindable;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;

import com.viral.nirmal.mvvmsample.BR;
import com.viral.nirmal.mvvmsample.dashboard.adapter.DashboardRecyclerAdapter;
import com.viral.nirmal.mvvmsample.dashboard.view.DashboardView;
import com.viral.nirmal.mvvmsample.view.BaseView;
import com.viral.nirmal.mvvmsample.viewmodel.BaseViewModel;

import java.util.ArrayList;
import java.util.List;

public class DashboardViewModel extends BaseViewModel {

    private DashboardView dashboardView;

    private boolean showProgress;

    private List<String> titles;

    private DashboardRecyclerAdapter dashboardRecyclerAdapter;

    public DashboardViewModel() {
        super();
        titles = new ArrayList<>();
        dashboardRecyclerAdapter = new DashboardRecyclerAdapter(titles);
        showProgress = false;
    }

    @Override
    public void onViewCreated(BaseView view) {
        super.onViewCreated(view);
        this.dashboardView = (DashboardView) view;
        showProgress();

        //simulate a delay, so that progress bar is visible for some time
        new Handler().postDelayed(new Runnable() {
            public void run() {
                titles.clear();
                titles.add("One");
                titles.add("Two");
                titles.add("Three");
                titles.add("Four");
                titles.add("Five");
                titles.add("Six");
                titles.add("Seven");
                titles.add("Eight");
                titles.add("Nine");
                titles.add("Ten");
                titles.add("Eleven");
                titles.add("Twelve");

                hideProgress();
                if (isViewVisible) {
                    dashboardRecyclerAdapter.notifyDataSetChanged();
                }
            }
        }, 6000);

    }

    @Override
    public void onViewVisible() {
        super.onViewVisible();
    }

    @Override
    public void onViewHidden() {
        super.onViewHidden();
    }

    @Bindable
    public boolean getShowProgress() {
        return showProgress;
    }

    @Bindable
    public String getDashboardHeader() {
        return "Dashboard Header";
    }

    @Bindable
    public DashboardRecyclerAdapter getDashboardRecyclerAdapter() {
        return dashboardRecyclerAdapter;
    }

    @Bindable
    public RecyclerView.LayoutManager getDashboardRecyclerViewLayoutManager() {
        return dashboardView.getDashboardRecyclerViewLayoutManager();
    }

    private void showProgress() {
        showProgress = true;
        notifyPropertyChanged(BR.showProgress);
    }

    private void hideProgress() {
        showProgress = false;
        notifyPropertyChanged(BR.showProgress);
    }
}
