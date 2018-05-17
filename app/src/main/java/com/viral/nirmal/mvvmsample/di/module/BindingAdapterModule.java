package com.viral.nirmal.mvvmsample.di.module;

import com.viral.nirmal.mvvmsample.adapter.TabLayoutBindingAdapter;
import com.viral.nirmal.mvvmsample.adapter.ViewPagerBindingAdapter;
import com.viral.nirmal.mvvmsample.di.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class BindingAdapterModule {

    @Provides
    @ApplicationScope
    public ViewPagerBindingAdapter viewPagerBindingAdapter() {
        return new ViewPagerBindingAdapter();
    }

    @Provides
    @ApplicationScope
    public TabLayoutBindingAdapter tabLayoutBindingAdapter(){
        return new TabLayoutBindingAdapter();
    }
}
