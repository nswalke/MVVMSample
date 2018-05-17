package com.viral.nirmal.mvvmsample.adapter;

import android.databinding.BindingAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class ViewPagerBindingAdapter {

    @BindingAdapter(value = {"app:pagerAdapter"}, requireAll = false)
    public void setPagerAdapter(ViewPager viewPager, FragmentStatePagerAdapter fragmentStatePagerAdapter) {
        viewPager.setAdapter(fragmentStatePagerAdapter);
    }
}
