package com.example.xmlprocessing.service;

import com.example.xmlprocessing.model.dto.bindingModel.seedDataDTOs.SuppliersSeedDataBindingModel;
import com.example.xmlprocessing.model.dto.viewModel.query3.LocalSupplierDTO;
import com.example.xmlprocessing.model.entity.Supplier;

import java.util.List;

public interface SupplierService {

    void saveAll(SuppliersSeedDataBindingModel[] suppliersDtos);

    Supplier findOneById(Long id);

    List<LocalSupplierDTO> getAllLocalSuppliers();
}

