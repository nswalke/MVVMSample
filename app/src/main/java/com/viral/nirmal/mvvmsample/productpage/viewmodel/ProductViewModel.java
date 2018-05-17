package com.viral.nirmal.mvvmsample.productpage.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.viral.nirmal.mvvmsample.productpage.model.Product;

public class ProductViewModel extends BaseObservable {

    private Product product;

    public ProductViewModel() {
        product = new Product();
        product.setName("Burger");
        product.setPrice(100);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Bindable
    public String getProductName() {
        return "Product name: " + String.valueOf(product.getName());
    }

    @Bindable
    public String getProductPrice() {
        return "Product price: " + String.valueOf(product.getPrice());
    }
}
