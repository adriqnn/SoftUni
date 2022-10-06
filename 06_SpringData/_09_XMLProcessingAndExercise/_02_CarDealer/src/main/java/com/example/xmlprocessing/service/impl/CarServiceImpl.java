package com.example.xmlprocessing.service.impl;

import com.example.xmlprocessing.model.dto.bindingModel.seedDataDTOs.CarSeedDataBindingModel;
import com.example.xmlprocessing.model.dto.viewModel.query2.CarDTO;
import com.example.xmlprocessing.model.dto.viewModel.query4.CarViewModel;
import com.example.xmlprocessing.model.entity.Car;
import com.example.xmlprocessing.model.entity.Part;
import com.example.xmlprocessing.repository.CarRepository;
import com.example.xmlprocessing.service.CarService;
import com.example.xmlprocessing.service.PartService;
import com.example.xmlprocessing.utils.modelMapper.DTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final PartService partService;

    @Autowired
    public CarServiceImpl(CarRepository carRepository,
                          PartService partService) {
        this.carRepository = carRepository;
        this.partService = partService;
    }

    @Override
    public void saveAll(CarSeedDataBindingModel[] carDTOs) {
        for (CarSeedDataBindingModel carDTO : carDTOs) {
            Car car = DTOConverter.convert(carDTO, Car.class);
            seedRandomParts(car);
            this.carRepository.saveAndFlush(car);
        }
    }

    @Override
    public Car oneById(Long carID) {
        return this.carRepository.getOne(carID);
    }

    @Override
    public List<CarDTO> getAllByMake(String make) {
        List<CarDTO> cars = this.carRepository.findAllByMakeOrderByModel(make);
        return cars;
    }

    @Override
    public List<CarViewModel> getAllCarsWithListOfParts() {
        List<Car> carList = this.carRepository.findAll();
        List<CarViewModel> viewModels = DTOConverter.convert(carList, CarViewModel.class);
        return viewModels;
    }

    private void seedRandomParts(Car car) {
        List<Part> partsSet = new ArrayList<>();
        Random random = new Random();
        int partsCount;
        do {
            partsCount = random.nextInt(20);
        } while (partsCount < 10);

        for (int i = 1; i <= partsCount; i++) {
            int partID;
            do {
                partID = random.nextInt(131);
            } while (partID == 0);
            Part part = this.partService.getOneById((long) partID);
            partsSet.add(part);
        }
        String debug = "";
        car.setParts(partsSet);
    }
}
