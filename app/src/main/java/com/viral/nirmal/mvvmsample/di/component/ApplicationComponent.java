package com.viral.nirmal.mvvmsample.di.component;

import com.viral.nirmal.mvvmsample.di.module.ContextModule;
import com.viral.nirmal.mvvmsample.di.scope.ApplicationScope;
import com.viral.nirmal.mvvmsample.productpage.view.ProductPageActivity;

import dagger.Component;

@Component(modules = {ContextModule.class})
@ApplicationScope
public interface ApplicationComponent {

    void inject(ProductPageActivity target); //inject dependencies into target

}
