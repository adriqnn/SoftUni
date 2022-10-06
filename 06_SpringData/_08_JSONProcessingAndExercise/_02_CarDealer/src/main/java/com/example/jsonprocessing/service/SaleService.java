package com.example.jsonprocessing.service;

import com.example.jsonprocessing.model.dto.bindingModel.seedDataDTOs.SaleSeedBindingModel;
import com.example.jsonprocessing.model.dto.viewModel.query6.SaleViewModel;

import java.util.List;

public interface SaleService {

    void saveAll(List<SaleSeedBindingModel> salesList);

    List<SaleViewModel> salesWithAppliedDiscount();
}
