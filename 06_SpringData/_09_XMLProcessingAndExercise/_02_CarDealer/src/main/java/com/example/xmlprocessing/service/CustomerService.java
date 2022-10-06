package com.example.xmlprocessing.service;

import com.example.xmlprocessing.model.dto.bindingModel.seedDataDTOs.CustomerSeedDataBindingModel;
import com.example.xmlprocessing.model.dto.viewModel.query1.CustomerViewModel;
import com.example.xmlprocessing.model.entity.Customer;

import java.util.List;

public interface CustomerService {

    void saveAll(CustomerSeedDataBindingModel[] customerDTOs);

    Customer oneById(Long customerID);

    List<CustomerViewModel> allOrderedByBirthDate();

    List<com.example.xmlprocessing.model.dto.viewModel.query5.CustomerViewModel> getAllWithMinOneBoughtCar();
}
