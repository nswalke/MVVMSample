package com.viral.nirmal.mvvmsample.adapter;

import android.databinding.BindingAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

public class TabLayoutBindingAdapter {

    @BindingAdapter(value = {"app:viewPager"}, requireAll = false)
    public void setViewPager(TabLayout tabLayout, ViewPager viewPager) {
        tabLayout.setupWithViewPager(viewPager, true);
    }
}
