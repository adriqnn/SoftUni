package com.example.springdataadvancedquerying.services.impl;

import com.example.springdataadvancedquerying.entities.Shampoo;
import com.example.springdataadvancedquerying.entities.Size;
import com.example.springdataadvancedquerying.repositories.ShampooRepository;
import com.example.springdataadvancedquerying.services.ShampooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ShampooServiceImpl implements ShampooService {

    @Autowired
    private ShampooRepository shampooRepository;

    @Override
    public List<Shampoo> selectBySize(Size size) {
        return this.shampooRepository.findBySize(size);
    }

    @Override
    public List<Shampoo> selectBySizeOrLabel(Size size, int labelId) {
        //Label label = this.labelRepository.findById(labelId); - if its not possible to get information from nested operation

        //query by nested properties
        return this.shampooRepository.findBySizeOrLabelIdOrderByPriceAsc(size,labelId);
    }

    @Override
    public List<Shampoo> selectMoreExpensiveThan(BigDecimal price) {
        return this.shampooRepository.findByPriceGreaterThanOrderByPriceDesc(price);
    }

    @Override
    public int countPriceLowerThan(BigDecimal price) {
        return this.shampooRepository.countByPriceLessThan(price);
    }

    @Override
    public List<Shampoo> selectByIngredientsCount(int count){
        return this.shampooRepository.findByIngredientCountLessThan(count);
    }
}
