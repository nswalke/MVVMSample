package com.viral.nirmal.mvvmsample.carousel.viewmodel;

import android.app.Activity;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.v4.view.ViewPager;

import com.viral.nirmal.mvvmsample.BR;
import com.viral.nirmal.mvvmsample.carousel.adapter.CarouselPagerAdapter;
import com.viral.nirmal.mvvmsample.carousel.model.Carousel;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class CarouselViewModel extends BaseObservable implements CarouselPagerAdapter.OnCarouselClickListener, ViewPager.OnPageChangeListener {

    private List<Carousel> carousels;
    private CarouselPagerAdapter carouselPagerAdapter;
    private Activity activity;
    private boolean isViewAdded;
    private Timer carouselTimer;

    private int currentCarouselItemPosition;

    public CarouselViewModel() {
        currentCarouselItemPosition = 0;
        carousels = new ArrayList<>();
        carouselPagerAdapter = new CarouselPagerAdapter(this, carousels);
    }

    @Bindable
    public CarouselPagerAdapter getCarouselPagerAdapter() {
        return carouselPagerAdapter;
    }

    @Bindable
    public int getCurrentCarouselItemPosition() {
        return currentCarouselItemPosition;
    }

    public void setCurrentCarouselItemPosition(int currentCarouselItemPosition) {
        if (this.currentCarouselItemPosition != currentCarouselItemPosition) {
            this.currentCarouselItemPosition = currentCarouselItemPosition;
            notifyPropertyChanged(BR.currentCarouselItemPosition);
        }
    }

    @Override
    public void onClickCarousel(Carousel carousel) {

    }

    public void onViewCreated(Activity activity) {
        this.activity = activity;
        carousels.clear();
        Carousel carousel;
        for (int i = 0; i < 5; i++) {
            carousel = new Carousel();
            carousel.title = "Carousel Item: " + i;
            carousels.add(carousel);
        }
        carouselPagerAdapter.notifyDataSetChanged();
        if (carouselPagerAdapter.getCount() > 0) {
            carouselTimer = new Timer();
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        this.currentCarouselItemPosition = position;
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private class CarouselTimerTask extends TimerTask {

        @Override
        public void run() {
            if (isViewAdded && carouselPagerAdapter.getCount() > 0) {
                int itemPosition = getCurrentCarouselItemPosition();
                itemPosition++;
                if (itemPosition >= carouselPagerAdapter.getCount()) {
                    itemPosition = 0;
                }
                setCurrentCarouselItemPosition(itemPosition);
            }
        }
    }

    public void onViewVisible() {
        isViewAdded = true;
        if (carouselPagerAdapter.getCount() > 0) {
            carouselTimer.scheduleAtFixedRate(new CarouselTimerTask(), 3000, 3000);
        }
    }

    public void onViewHidden() {
        isViewAdded = false;
        if (carouselTimer != null) {
            carouselTimer.cancel();
        }
    }

    public void destroy() {
        activity = null;
    }
}
