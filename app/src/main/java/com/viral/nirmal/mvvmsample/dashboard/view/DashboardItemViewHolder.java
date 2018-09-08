package com.viral.nirmal.mvvmsample.dashboard.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.viral.nirmal.mvvmsample.dashboard.viewmodel.DashboardItemViewModel;
import com.viral.nirmal.mvvmsample.databinding.LayoutDashboardItemBinding;

public class DashboardItemViewHolder extends RecyclerView.ViewHolder {

    private LayoutDashboardItemBinding itemBinding = null;

    public DashboardItemViewHolder(View itemView) {
        super(itemView);
        bind();
    }

    public void bind() {
        if (itemBinding == null) {
            itemBinding = DataBindingUtil.bind(itemView);
        }
    }

    public void setItemViewModel(DashboardItemViewModel itemViewModel) {
        if (itemBinding != null) {
            itemBinding.setItemViewModel(itemViewModel);
        }
    }

    public void unBind() {
        if (itemBinding != null) {
            itemBinding.unbind();
        }
    }
}
