package com.example.springdataadvancedquerying.services;

import com.example.springdataadvancedquerying.entities.Ingredient;

import java.util.List;

public interface IngredientService {
    List<Ingredient> selectNameStartsWith(String start);

    List<Ingredient> selectInNames(List<String> names);

    int deleteByName(String name);

    void increasePriceByPercentage(double percent);
}

