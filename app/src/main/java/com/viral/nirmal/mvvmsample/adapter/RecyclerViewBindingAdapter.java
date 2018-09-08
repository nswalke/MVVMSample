package com.viral.nirmal.mvvmsample.adapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerViewBindingAdapter {

    @BindingAdapter(value = {"app:recyclerAdapter", "app:recyclerLayoutManager"}, requireAll = false)
    public void setRecyclerAdapter(RecyclerView recyclerView, RecyclerView.Adapter adapter, RecyclerView.LayoutManager layoutManager) {
        if (layoutManager != null) {
            recyclerView.setLayoutManager(layoutManager);
        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        if (adapter != null) {
            recyclerView.setAdapter(adapter);
        }
    }
}
