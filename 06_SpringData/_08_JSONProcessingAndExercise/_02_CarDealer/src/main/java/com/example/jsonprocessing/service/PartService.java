package com.example.jsonprocessing.service;


import com.example.jsonprocessing.model.dto.bindingModel.seedDataDTOs.PartSeedDataBindingModel;
import com.example.jsonprocessing.model.entity.Part;

public interface PartService {

    void saveAll(PartSeedDataBindingModel[] partsDtos);

    Part getOneById(Long id);
}
