package com.viral.nirmal.mvvmsample.productpage.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.viral.nirmal.mvvmsample.productpage.model.Ingredient;

public class IngredientViewModel extends BaseObservable {

    private Ingredient ingredient;

    public IngredientViewModel() {
        ingredient = new Ingredient();
        ingredient.setIngredient("Pepper, salt, chillies, turmeric.");
    }

    @Bindable
    public String getIngredients() {
        return "Ingredients: " + ingredient.getIngredient();
    }
}
