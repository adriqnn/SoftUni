package com.example.springdataintro.services;

import com.example.springdataintro.entities.Category;
import com.example.springdataintro.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> getRandomCategories() {
        long size = this.categoryRepository.count();
        Random random = new Random();

        int categoriesCount = random.nextInt((int) size) + 1;

        Set<Integer> categoriesIDs = new HashSet<>();
        for (int i = 0; i < categoriesCount; i++) {
            int nextID = random.nextInt((int) size) + 1;
            categoriesIDs.add(nextID);
        }

        List<Category> allById = this.categoryRepository.findAllById(categoriesIDs);
        //return (Set<Category>) this.categoryRepository.findAllById(categoriesIDs);
        return new HashSet<>(allById);
    }
}

