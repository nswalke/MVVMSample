package com.viral.nirmal.mvvmsample.productpage.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.viral.nirmal.mvvmsample.productpage.model.Review;

public class ReviewViewModel extends BaseObservable {
    private Review review;

    public ReviewViewModel() {
        review = new Review();
        review.setReview("Good tasty and healthy.\nSpicy.\nFun to eat.\nLightens up the mood.");
    }

    @Bindable
    public String getReviews() {
        return "Reviews: " + review.getReview();
    }
}
