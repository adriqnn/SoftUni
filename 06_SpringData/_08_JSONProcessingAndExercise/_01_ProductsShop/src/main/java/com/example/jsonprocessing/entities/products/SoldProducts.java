package com.example.jsonprocessing.entities.products;

import java.util.List;

public class SoldProducts {
    private Long count;

    private List<ProductsSold> products;

    public SoldProducts(){
    }

    public SoldProducts(Long count, List<ProductsSold> products) {
        this.count = count;
        this.products = products;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<ProductsSold> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsSold> products) {
        this.products = products;
    }
}
