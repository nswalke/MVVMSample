package com.viral.nirmal.mvvmsample.carousel.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viral.nirmal.mvvmsample.MyApplication;
import com.viral.nirmal.mvvmsample.R;
import com.viral.nirmal.mvvmsample.carousel.model.Carousel;
import com.viral.nirmal.mvvmsample.carousel.viewmodel.CarouselItemViewModel;
import com.viral.nirmal.mvvmsample.databinding.LayoutCarouselItemBinding;

import java.util.List;

public class CarouselPagerAdapter extends PagerAdapter {

    public interface OnCarouselClickListener {
        void onClickCarousel(Carousel carousel);
    }

    private OnCarouselClickListener onCarouselClickListener = null;
    private List<Carousel> carousels = null;

    public CarouselPagerAdapter(@Nullable OnCarouselClickListener onCarouselClickListener, @Nullable List<Carousel> carousels) {
        this.onCarouselClickListener = onCarouselClickListener;
        this.carousels = carousels;
    }

    @Override
    public int getCount() {
        return null == carousels ? 0 : carousels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutCarouselItemBinding itemBinding =
                DataBindingUtil.inflate(LayoutInflater.from(container.getContext()),
                        R.layout.layout_carousel_item,
                        container,
                        false,
                        MyApplication.getInstance().getDataBindingComponent());
        itemBinding.setCarouselItemViewModel(new CarouselItemViewModel(carousels.get(position), onCarouselClickListener));
        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(itemBinding.getRoot(), 0);
        return itemBinding.getRoot();
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem(container, position, object);
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
