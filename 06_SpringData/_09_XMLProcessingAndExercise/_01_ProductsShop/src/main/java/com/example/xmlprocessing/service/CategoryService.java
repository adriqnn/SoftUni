package com.example.xmlprocessing.service;

import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.CategoryBindingModel;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedCategoriesBindingModels.CategorySeedDataWrapper;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.CategoryByProductsCountViewModel;

import java.util.List;

public interface CategoryService {

    void persist(CategoryBindingModel categoryBindingModel);

    CategoryBindingModel getCategoryById(Long categoryID);

    List<CategoryByProductsCountViewModel> categoriesByProductCount();

    void persisAllCategories(CategorySeedDataWrapper categoryWrapper);
}