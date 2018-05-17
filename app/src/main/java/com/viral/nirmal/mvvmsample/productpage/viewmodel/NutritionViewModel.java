package com.viral.nirmal.mvvmsample.productpage.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.viral.nirmal.mvvmsample.productpage.model.Nutrition;

public class NutritionViewModel extends BaseObservable {
    private Nutrition nutrition;

    public NutritionViewModel() {
        nutrition = new Nutrition();
        nutrition.setNutrition("Calories: 100, Fats: 40g, Proteins: 70g");
    }

    @Bindable
    public String getNutritionalValue() {
        return "Nutritional value: " + nutrition.getNutrition();
    }
}
