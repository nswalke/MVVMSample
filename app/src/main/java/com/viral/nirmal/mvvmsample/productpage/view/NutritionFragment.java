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

import com.viral.nirmal.mvvmsample.databinding.FragmentNutritionBinding;
import com.viral.nirmal.mvvmsample.productpage.viewmodel.NutritionViewModel;

public class NutritionFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentNutritionBinding nutritionBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_nutrition, container, false);
        nutritionBinding.setNutritionViewModel(new NutritionViewModel());
        return nutritionBinding.getRoot();
    }
}
