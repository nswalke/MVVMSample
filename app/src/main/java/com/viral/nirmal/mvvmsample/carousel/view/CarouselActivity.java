package com.viral.nirmal.mvvmsample.carousel.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.viral.nirmal.mvvmsample.MyApplication;
import com.viral.nirmal.mvvmsample.R;
import com.viral.nirmal.mvvmsample.carousel.viewmodel.CarouselViewModel;
import com.viral.nirmal.mvvmsample.databinding.ActivityCarouselBinding;

public class CarouselActivity extends AppCompatActivity {

    private CarouselViewModel carouselViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCarouselBinding activityBinding = DataBindingUtil.setContentView(this, R.layout.activity_carousel, MyApplication.getInstance().getDataBindingComponent());
        carouselViewModel = new CarouselViewModel();
        activityBinding.setCarouselViewModel(carouselViewModel);
        carouselViewModel.onViewCreated(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        carouselViewModel.onViewVisible();
    }

    @Override
    protected void onStop() {
        super.onStop();
        carouselViewModel.onViewHidden();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        carouselViewModel.destroy();
    }
}
