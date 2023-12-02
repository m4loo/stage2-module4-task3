package com.mjc.stage2;

import java.util.List;
import java.util.ArrayList;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> executeFilteringStrategy(FilteringStrategy filteringStrategy) {
        List<Product> filtererProductList = new ArrayList<>();
        for (Product product : productList) {
            if (filteringStrategy.filter(product)) {
                filtererProductList.add(product);
            }
        }
        return filtererProductList;
    }
}
