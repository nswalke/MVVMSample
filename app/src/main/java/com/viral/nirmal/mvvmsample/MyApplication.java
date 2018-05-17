package com.viral.nirmal.mvvmsample;

import android.app.Application;

import com.viral.nirmal.mvvmsample.di.component.ApplicationComponent;
import com.viral.nirmal.mvvmsample.di.component.DaggerApplicationComponent;
import com.viral.nirmal.mvvmsample.di.component.DaggerMyDataBindingComponent;
import com.viral.nirmal.mvvmsample.di.component.MyDataBindingComponent;
import com.viral.nirmal.mvvmsample.di.module.ContextModule;

public class MyApplication extends Application {

    private static MyApplication myApplication;

    private ApplicationComponent applicationComponent;

    private MyDataBindingComponent dataBindingComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        applicationComponent = DaggerApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        dataBindingComponent = DaggerMyDataBindingComponent.builder()
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public MyDataBindingComponent getDataBindingComponent() {
        return dataBindingComponent;
    }

    public static MyApplication getInstance() {
        return myApplication;
    }
}
