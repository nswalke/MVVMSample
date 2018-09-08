package com.viral.nirmal.mvvmsample.dashboard.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.viral.nirmal.mvvmsample.MyApplication;
import com.viral.nirmal.mvvmsample.R;
import com.viral.nirmal.mvvmsample.dashboard.viewmodel.DashboardViewModel;
import com.viral.nirmal.mvvmsample.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity implements DashboardView {

    private DashboardViewModel dashboardViewModel = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null || dashboardViewModel == null) {
            dashboardViewModel = new DashboardViewModel();
        }
        ActivityDashboardBinding dashboardBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_dashboard, MyApplication.getInstance().getDataBindingComponent());
        dashboardBinding.setDashboardViewModel(dashboardViewModel);
        dashboardViewModel.onViewCreated(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        dashboardViewModel.onViewVisible();
    }

    @Override
    protected void onStop() {
        super.onStop();
        dashboardViewModel.onViewHidden();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dashboardViewModel.destroy();
    }

    @Override
    public RecyclerView.LayoutManager getDashboardRecyclerViewLayoutManager() {
        return new LinearLayoutManager(this);
    }
}
