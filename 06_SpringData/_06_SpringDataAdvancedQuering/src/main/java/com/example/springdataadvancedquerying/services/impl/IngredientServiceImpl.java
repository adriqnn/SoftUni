package com.example.springdataadvancedquerying.services.impl;

import com.example.springdataadvancedquerying.entities.Ingredient;
import com.example.springdataadvancedquerying.repositories.IngredientRepository;
import com.example.springdataadvancedquerying.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public List<Ingredient> selectNameStartsWith(String start) {
        return this.ingredientRepository.findByNameStartingWith(start);
    }

    @Override
    public List<Ingredient> selectInNames(List<String> names) {
        return this.ingredientRepository.findByNameInOrderByPriceAsc(names);
    }

    @Override
    public int deleteByName(String name) {
        return this.ingredientRepository.deleteByName(name);
    }

    @Override
    public void increasePriceByPercentage(double percent) {
        BigDecimal actualPercent = new BigDecimal(percent);
        this.ingredientRepository.increasePriceBy(actualPercent);
    }
}