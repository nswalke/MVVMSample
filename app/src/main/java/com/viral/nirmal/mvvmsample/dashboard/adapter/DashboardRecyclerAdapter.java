package com.viral.nirmal.mvvmsample.dashboard.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.viral.nirmal.mvvmsample.R;
import com.viral.nirmal.mvvmsample.dashboard.view.DashboardItemViewHolder;
import com.viral.nirmal.mvvmsample.dashboard.viewmodel.DashboardItemViewModel;

import java.util.List;

public class DashboardRecyclerAdapter extends RecyclerView.Adapter<DashboardItemViewHolder> {
    private List<String> titles = null;

    public DashboardRecyclerAdapter(@Nullable List<String> titles) {
        this.titles = titles;
    }

    @NonNull
    @Override
    public DashboardItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DashboardItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_dashboard_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardItemViewHolder holder, int position) {
        holder.setItemViewModel(new DashboardItemViewModel(titles.get(position)));
    }

    @Override
    public void onViewAttachedToWindow(@NonNull DashboardItemViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NonNull DashboardItemViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unBind();
    }

    @Override
    public boolean onFailedToRecycleView(@NonNull DashboardItemViewHolder holder) {
        holder.itemView.clearAnimation();
        return super.onFailedToRecycleView(holder);
    }

    @Override
    public int getItemCount() {
        return null == titles ? 0 : titles.size();
    }
}
