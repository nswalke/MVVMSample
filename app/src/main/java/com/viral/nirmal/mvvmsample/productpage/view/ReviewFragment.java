package com.viral.nirmal.mvvmsample.productpage.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viral.nirmal.mvvmsample.R;
import com.viral.nirmal.mvvmsample.databinding.FragmentReviewsBinding;
import com.viral.nirmal.mvvmsample.productpage.viewmodel.ReviewViewModel;

public class ReviewFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentReviewsBinding reviewsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_reviews, container, false);
        reviewsBinding.setReviewsViewModel(new ReviewViewModel());
        return reviewsBinding.getRoot();
    }
}
