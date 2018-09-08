package com.viral.nirmal.mvvmsample.di.component;

import android.databinding.DataBindingComponent;

import com.viral.nirmal.mvvmsample.adapter.RecyclerViewBindingAdapter;
import com.viral.nirmal.mvvmsample.adapter.TabLayoutBindingAdapter;
import com.viral.nirmal.mvvmsample.adapter.ViewPagerBindingAdapter;
import com.viral.nirmal.mvvmsample.di.module.BindingAdapterModule;
import com.viral.nirmal.mvvmsample.di.scope.ApplicationScope;

import dagger.Component;

@Component(modules = {BindingAdapterModule.class})
@ApplicationScope
public interface MyDataBindingComponent extends DataBindingComponent {

    ViewPagerBindingAdapter exposeViewPagerBindingAdapter();

    TabLayoutBindingAdapter exposeTabLayoutBindingAdapter();

    RecyclerViewBindingAdapter exposeRecyclerViewBindingAdapter();
}
