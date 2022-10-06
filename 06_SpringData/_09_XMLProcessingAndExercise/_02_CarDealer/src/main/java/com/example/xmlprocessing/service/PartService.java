package com.example.xmlprocessing.service;


import com.example.xmlprocessing.model.dto.bindingModel.seedDataDTOs.PartSeedDataBindingModel;
import com.example.xmlprocessing.model.entity.Part;

public interface PartService {

    void saveAll(PartSeedDataBindingModel[] partsDtos);

    Part getOneById(Long id);
}
