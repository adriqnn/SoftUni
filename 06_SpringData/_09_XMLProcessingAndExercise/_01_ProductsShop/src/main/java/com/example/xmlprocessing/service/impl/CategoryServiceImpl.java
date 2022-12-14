package com.example.xmlprocessing.service.impl;

import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.CategoryBindingModel;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedCategoriesBindingModels.CategorySeedDataWrapper;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.CategoryByProductsCountViewModel;
import com.example.xmlprocessing.model.entity.Category;
import com.example.xmlprocessing.model.entity.Product;
import com.example.xmlprocessing.repository.CategoryRepository;
import com.example.xmlprocessing.service.CategoryService;
import com.example.xmlprocessing.util.modelMapper.DTOConverter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository,
                               ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void persist(CategoryBindingModel categoryBindingModel) {
        Category category = DTOConverter.convert(categoryBindingModel, Category.class);
        this.categoryRepository.save(category);
    }

    @Override
    public CategoryBindingModel getCategoryById(Long categoryID) {
        Category category = this.categoryRepository.getOne(categoryID);
        return DTOConverter.convert(category, CategoryBindingModel.class);
    }

    @Override
    public List<CategoryByProductsCountViewModel> categoriesByProductCount() {
        List<Category> categories = this.categoryRepository.categoriesByProductCount();

        List<CategoryByProductsCountViewModel> viewModels =
                categories.stream()
                        .map(this::mappModel)
                        .collect(Collectors.toList());

        return viewModels;
    }

    @Override
    public void persisAllCategories(CategorySeedDataWrapper categoryWrapper) {
        List<Category> categories =
                categoryWrapper.getCategories()
                        .stream()
                        .map(c -> DTOConverter.convert(c, Category.class))
                        .collect(Collectors.toList());
        this.categoryRepository.saveAll(categories);
    }

    private CategoryByProductsCountViewModel mappModel(Category c) {
        CategoryByProductsCountViewModel viewModel = new CategoryByProductsCountViewModel();
        viewModel.setId(c.getId());
        viewModel.setName(c.getName());
        viewModel.setProductsCount(c.getProducts().size());

        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Product product : c.getProducts()) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        BigDecimal count = BigDecimal.valueOf(c.getProducts().size());
        double result = Double.valueOf(String.valueOf(totalPrice))/Double.valueOf(String.valueOf(count));
        BigDecimal averagePrice = BigDecimal.valueOf(result).setScale(6, BigDecimal.ROUND_HALF_UP);
        viewModel.setAveragePrice(averagePrice);

        if (c.getProducts().size() > 0) {
            viewModel.setTotalRevenue(totalPrice);
        } else {
            viewModel.setTotalRevenue(BigDecimal.ZERO);
        }

        return viewModel;
    }

}
