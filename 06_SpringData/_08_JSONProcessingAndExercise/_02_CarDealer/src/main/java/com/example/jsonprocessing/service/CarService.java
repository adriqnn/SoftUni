package com.example.jsonprocessing.service;

import com.example.jsonprocessing.model.dto.bindingModel.seedDataDTOs.CarSeedDataBindingModel;
import com.example.jsonprocessing.model.dto.viewModel.query2.CarDTO;
import com.example.jsonprocessing.model.dto.viewModel.query4.CarViewModel;
import com.example.jsonprocessing.model.entity.Car;

import java.util.List;

public interface CarService {

    void saveAll(CarSeedDataBindingModel[] carDTOs);

    Car oneById(Long carID);

    List<CarDTO> getAllByMake(String make);

    List<CarViewModel> getAllCarsWithListOfParts();
}
