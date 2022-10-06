package com.example.jsonprocessing.service;

import com.example.jsonprocessing.model.dto.bindingModel.seedDataDTOs.SuppliersSeedDataBindingModel;
import com.example.jsonprocessing.model.dto.viewModel.query3.LocalSupplierDTO;
import com.example.jsonprocessing.model.entity.Supplier;

import java.util.List;

public interface SupplierService {

    void saveAll(SuppliersSeedDataBindingModel[] suppliersDtos);

    Supplier findOneById(Long id);

    List<LocalSupplierDTO> getAllLocalSuppliers();
}

