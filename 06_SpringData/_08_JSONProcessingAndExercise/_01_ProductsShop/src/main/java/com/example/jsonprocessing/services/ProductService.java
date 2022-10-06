package com.example.jsonprocessing.services;

import com.example.jsonprocessing.entities.categories.CategoryStatsDTO;
import com.example.jsonprocessing.entities.products.ProductWithoutBuyerDTO;

import java.util.List;

public interface ProductService {
    List<ProductWithoutBuyerDTO> getProductsInPriceRangeForSell(double from, double to);

    List<CategoryStatsDTO> getCategoryStatistics();
}
