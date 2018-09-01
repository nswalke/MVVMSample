package com.viral.nirmal.mvvmsample.adapter;

import android.databinding.BindingAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class ViewPagerBindingAdapter {

    @BindingAdapter(value = {"app:pagerAdapter"}, requireAll = false)
    public void setPagerAdapter(ViewPager viewPager, PagerAdapter pagerAdapter) {
        viewPager.setAdapter(pagerAdapter);
    }

    @BindingAdapter(value = {"app:selectedItemPosition"}, requireAll = false)
    public void setSelectedItemPosition(ViewPager viewPager, int selectedItemPosition) {
        if (viewPager.getAdapter() != null) {
            int itemCount = viewPager.getAdapter().getCount();
            if (selectedItemPosition >= 0 && selectedItemPosition < itemCount && selectedItemPosition != viewPager.getCurrentItem()) {
                viewPager.setCurrentItem(selectedItemPosition, true);
            }
        }
    }

    @BindingAdapter(value = {"app:onPageChangeListener"}, requireAll = true)
    public void setSelectedItemPositionAttrChanged(ViewPager viewPager, ViewPager.OnPageChangeListener onPageChangeListener) {
        viewPager.addOnPageChangeListener(onPageChangeListener);
    }
}
