package com.viral.nirmal.mvvmsample.dashboard.view;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.viral.nirmal.mvvmsample.dashboard.viewmodel.DashboardItemViewModel;
import com.viral.nirmal.mvvmsample.databinding.LayoutDashboardItemBinding;

public class DashboardItemViewHolder extends RecyclerView.ViewHolder {


    private DashboardItemViewModel itemViewModel;

    public DashboardItemViewHolder(View itemView, DashboardItemViewModel itemViewModel) {
        super(itemView);
        this.itemViewModel = itemViewModel;
        LayoutDashboardItemBinding itemBinding = DataBindingUtil.bind(itemView);
        if (itemBinding != null) {
            itemBinding.setItemViewModel(itemViewModel);
        }
    }

    public void bind(@NonNull String title) {
        if (itemViewModel != null) {
            //update data in the viewModel
            itemViewModel.setTitle(title);
            //update the view which is observing this viewModel
            itemViewModel.notifyChange();
        }
    }
}
