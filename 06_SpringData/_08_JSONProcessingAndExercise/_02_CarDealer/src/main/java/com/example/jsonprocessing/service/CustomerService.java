package com.example.jsonprocessing.service;

import com.example.jsonprocessing.model.dto.bindingModel.seedDataDTOs.CustomerSeedDataBindingModel;
import com.example.jsonprocessing.model.dto.viewModel.query1.CustomerViewModel;
import com.example.jsonprocessing.model.entity.Customer;

import java.util.List;

public interface CustomerService {

    void saveAll(CustomerSeedDataBindingModel[] customerDTOs);

    Customer oneById(Long customerID);

    List<CustomerViewModel> allOrderedByBirthDate();

    List<com.example.jsonprocessing.model.dto.viewModel.query5.CustomerViewModel> getAllWithMinOneBoughtCar();
}
