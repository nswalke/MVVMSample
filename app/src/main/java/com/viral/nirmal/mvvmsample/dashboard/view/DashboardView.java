package com.viral.nirmal.mvvmsample.dashboard.view;

import android.support.v7.widget.RecyclerView;

import com.viral.nirmal.mvvmsample.view.BaseView;

public interface DashboardView extends BaseView {
    RecyclerView.LayoutManager getDashboardRecyclerViewLayoutManager();
}
