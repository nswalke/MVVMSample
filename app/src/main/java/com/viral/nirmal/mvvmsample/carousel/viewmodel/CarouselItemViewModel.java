package com.viral.nirmal.mvvmsample.carousel.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.Nullable;

import com.viral.nirmal.mvvmsample.carousel.adapter.CarouselPagerAdapter;
import com.viral.nirmal.mvvmsample.carousel.model.Carousel;

public class CarouselItemViewModel extends BaseObservable {
    private Carousel carousel;

    private CarouselPagerAdapter.OnCarouselClickListener carouselClickListener;

    public CarouselItemViewModel(@Nullable Carousel carousel, @Nullable CarouselPagerAdapter.OnCarouselClickListener carouselClickListener) {
        this.carousel = carousel;
        this.carouselClickListener = carouselClickListener;
    }

    @Bindable
    public String getTitle() {
        return null == carousel || null == carousel.title ? "" : carousel.title;
    }

    public void onClickCarousel() {
        if (carouselClickListener != null && carousel != null) {
            carouselClickListener.onClickCarousel(carousel);
        }
    }
}
