package com.example.xmlprocessing.service;

import com.example.xmlprocessing.model.dto.bindingModel.seedDataDTOs.SaleSeedBindingModel;
import com.example.xmlprocessing.model.dto.viewModel.query6.SaleViewModel;

import java.util.List;

public interface SaleService {

    void saveAll(List<SaleSeedBindingModel> salesList);

    List<SaleViewModel> salesWithAppliedDiscount();
}
