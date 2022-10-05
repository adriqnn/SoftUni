package com.example.springdataadvancedquerying.services;

import com.example.springdataadvancedquerying.entities.Shampoo;
import com.example.springdataadvancedquerying.entities.Size;

import java.math.BigDecimal;
import java.util.List;

public interface ShampooService {
    List<Shampoo> selectBySize(Size size);

    List<Shampoo> selectBySizeOrLabel(Size size, int labelId);

    List<Shampoo> selectMoreExpensiveThan(BigDecimal price);

    int countPriceLowerThan(BigDecimal price);

    List<Shampoo> selectByIngredientsCount(int count);
}
