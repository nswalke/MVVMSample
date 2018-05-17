package com.viral.nirmal.mvvmsample.productpage.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.viral.nirmal.mvvmsample.MyApplication;
import com.viral.nirmal.mvvmsample.R;
import com.viral.nirmal.mvvmsample.databinding.ActivityProductPageBinding;
import com.viral.nirmal.mvvmsample.productpage.adapter.ProductDetailsPagerAdapter;
import com.viral.nirmal.mvvmsample.productpage.viewmodel.ProductViewModel;

import java.util.Observable;
import java.util.Observer;

public class ProductPageActivity extends AppCompatActivity implements Observer {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityProductPageBinding productPageBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_product_page,
                        MyApplication.getInstance()
                                .getDataBindingComponent());
        ProductViewModel productViewModel = new ProductViewModel();
        productPageBinding.setProductViewModel(productViewModel);
        productPageBinding.setPagerAdapter(new ProductDetailsPagerAdapter(getSupportFragmentManager()));
    }


    @Override
    public void update(Observable o, Object arg) {

    }
}
