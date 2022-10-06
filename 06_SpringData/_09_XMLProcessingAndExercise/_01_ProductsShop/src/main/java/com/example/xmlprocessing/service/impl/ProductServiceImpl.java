package com.example.xmlprocessing.service.impl;

import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.ProductCreateBindingModel;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedProductsBindingModels.ProductSeedDataWrapper;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.ProductInRangeViewModel;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.UserWithSoldItemViewModel;
import com.example.xmlprocessing.model.entity.Category;
import com.example.xmlprocessing.model.entity.Product;
import com.example.xmlprocessing.model.entity.User;
import com.example.xmlprocessing.repository.ProductRepository;
import com.example.xmlprocessing.service.CategoryService;
import com.example.xmlprocessing.service.ProductService;
import com.example.xmlprocessing.service.UserService;
import com.example.xmlprocessing.util.modelMapper.DTOConverter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final UserService userService;
    private final ModelMapper modelMapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository,
                              CategoryService categoryService,
                              UserService userService,
                              ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void persist(Collection<ProductCreateBindingModel> models) {
        List<Product> products = models.stream()
                .map(m -> modelMapper.map(m,Product.class))
                .collect(Collectors.toList());
        products.forEach(this::setRandomCategory);
        this.productRepository.saveAll(products);
    }

    private void setRandomCategory(Product product) {
        Random random = new Random();
        long categoryID = 0L;
        do {
            categoryID = (long)random.nextInt(11);
        } while (categoryID == 0);
        Category category =
                DTOConverter.convert(this.categoryService.getCategoryById(categoryID), Category.class);
        Set<Category> categorySet= new HashSet<>();
        categorySet.add(category);
        product.setCategories(categorySet);
    }

    @Override
    public List<ProductInRangeViewModel> getAllByRangeWithoutBuyer(int from, int to) {
        return this.productRepository.getAllByRangeWithoutBuyer(new BigDecimal(from),new BigDecimal(to));
    }

    @Override
    public List<UserWithSoldItemViewModel> getAllUsersQuery2() {
        List<User> userList = this.productRepository.getAllUsersQuery2();
        List<UserWithSoldItemViewModel> viewModels =
                userList.stream().map(u -> DTOConverter.convert(u, UserWithSoldItemViewModel.class))
                        .collect(Collectors.toList());
        return viewModels;
    }

    @Override
    public void persistAllProducts(ProductSeedDataWrapper productWrapper) {
        List<Product> products =
                productWrapper.getProductDTOs().stream()
                        .map(p -> modelMapper.map(p, Product.class))
                        .collect(Collectors.toList());
        products.forEach(this::setRandomCategory);
        this.productRepository.saveAll(products);
    }
}
