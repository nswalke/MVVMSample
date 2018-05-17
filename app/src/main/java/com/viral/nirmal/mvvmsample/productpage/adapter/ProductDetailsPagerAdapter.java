package com.viral.nirmal.mvvmsample.productpage.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.viral.nirmal.mvvmsample.productpage.view.IngredientFragment;
import com.viral.nirmal.mvvmsample.productpage.view.NutritionFragment;
import com.viral.nirmal.mvvmsample.productpage.view.ReviewFragment;

import java.util.ArrayList;

public class ProductDetailsPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;

    public ProductDetailsPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<>();
        fragments.add(new IngredientFragment());
        fragments.add(new NutritionFragment());
        fragments.add(new ReviewFragment());

        titles = new ArrayList<>();
        titles.add("Ingredients");
        titles.add("Nutrition");
        titles.add("Reviews");
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
