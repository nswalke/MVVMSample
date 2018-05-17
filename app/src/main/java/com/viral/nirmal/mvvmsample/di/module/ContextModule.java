package com.viral.nirmal.mvvmsample.di.module;

import android.content.Context;

import com.viral.nirmal.mvvmsample.di.qualifier.ApplicationContext;
import com.viral.nirmal.mvvmsample.di.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private final Context applicationContext;

    public ContextModule(@ApplicationContext Context context) {
        this.applicationContext = context.getApplicationContext();
    }

    @Provides
    @ApplicationContext
    @ApplicationScope
    public Context getApplicationContext() {
        return applicationContext;
    }
}
