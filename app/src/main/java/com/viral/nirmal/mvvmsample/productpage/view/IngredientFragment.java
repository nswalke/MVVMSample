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
import com.viral.nirmal.mvvmsample.databinding.FragmentIngredientsBinding;
import com.viral.nirmal.mvvmsample.productpage.viewmodel.IngredientViewModel;

public class IngredientFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentIngredientsBinding ingredientsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_ingredients, container, false);
        ingredientsBinding.setIngredientViewModel(new IngredientViewModel());
        return ingredientsBinding.getRoot();
    }
}
