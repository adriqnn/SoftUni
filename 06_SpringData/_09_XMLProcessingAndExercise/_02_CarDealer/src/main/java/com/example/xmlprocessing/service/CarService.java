package com.example.xmlprocessing.service;

import com.example.xmlprocessing.model.dto.bindingModel.seedDataDTOs.CarSeedDataBindingModel;
import com.example.xmlprocessing.model.dto.viewModel.query2.CarDTO;
import com.example.xmlprocessing.model.dto.viewModel.query4.CarViewModel;
import com.example.xmlprocessing.model.entity.Car;

import java.util.List;

public interface CarService {

    void saveAll(CarSeedDataBindingModel[] carDTOs);

    Car oneById(Long carID);

    List<CarDTO> getAllByMake(String make);

    List<CarViewModel> getAllCarsWithListOfParts();
}
