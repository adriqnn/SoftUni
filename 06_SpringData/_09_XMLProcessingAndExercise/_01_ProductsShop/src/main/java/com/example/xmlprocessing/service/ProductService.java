package com.example.xmlprocessing.service;

import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.ProductCreateBindingModel;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedProductsBindingModels.ProductSeedDataWrapper;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.ProductInRangeViewModel;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.UserWithSoldItemViewModel;

import java.util.Collection;
import java.util.List;

public interface ProductService {

    void persist(Collection<ProductCreateBindingModel> models);

    List<ProductInRangeViewModel> getAllByRangeWithoutBuyer(int from, int to);

    List<UserWithSoldItemViewModel> getAllUsersQuery2();

    void persistAllProducts(ProductSeedDataWrapper productWrapper);
}
