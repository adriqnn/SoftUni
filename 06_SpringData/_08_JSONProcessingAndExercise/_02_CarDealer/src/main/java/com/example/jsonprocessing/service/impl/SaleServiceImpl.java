package com.example.jsonprocessing.service.impl;


import com.example.jsonprocessing.model.dto.bindingModel.seedDataDTOs.SaleSeedBindingModel;
import com.example.jsonprocessing.model.dto.viewModel.query6.CarViewModel;
import com.example.jsonprocessing.model.dto.viewModel.query6.SaleViewModel;
import com.example.jsonprocessing.model.entity.Car;
import com.example.jsonprocessing.model.entity.Customer;
import com.example.jsonprocessing.model.entity.Sale;
import com.example.jsonprocessing.repository.SaleRepository;
import com.example.jsonprocessing.service.CarService;
import com.example.jsonprocessing.service.CustomerService;
import com.example.jsonprocessing.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;
    private final CarService carService;
    private final CustomerService customerService;

    @Autowired
    public SaleServiceImpl(SaleRepository saleRepository,
                           CarService carService,
                           CustomerService customerService) {
        this.saleRepository = saleRepository;
        this.carService = carService;
        this.customerService = customerService;
    }

    @Override
    public void saveAll(List<SaleSeedBindingModel> salesList) {
        List<Sale> saleList = new ArrayList<>();
        salesList.forEach(s -> {
            Car car = carService.oneById(s.getCarID());
            Customer customer = customerService.oneById(s.getCustomerID());
            Sale sale = new Sale(car, customer, s.getDiscount());
            saleList.add(sale);
        });
        this.saleRepository.saveAll(saleList);
    }

    @Override
    public List<SaleViewModel> salesWithAppliedDiscount() {
        List<Sale> sales = this.saleRepository.findAll();
        List<SaleViewModel> viewModels =
                sales.stream().map(s -> {
                    SaleViewModel model = new SaleViewModel();
                    model.setCar(getCarViewModel(s));
                    model.setCustomerName(s.getCustomer().getName());
                    double discount = s.getDiscount() / 100.0;
                    model.setDiscount(discount);
                    model.setPrice(s.getCar().getPrice());
                    model.setPriceWithDiscount(getPriceWithDiscount(s, discount));
                    return model;
                }).collect(Collectors.toList());

        return viewModels;
    }

    private BigDecimal getPriceWithDiscount(Sale s, double d) {
        BigDecimal discountPercent = BigDecimal.valueOf(d);
        BigDecimal carPrice = s.getCar().getPrice();
        BigDecimal discountMoney = s.getCar().getPrice().multiply(discountPercent);

        return carPrice.subtract(discountMoney);
    }

    private CarViewModel getCarViewModel(Sale s) {
        CarViewModel carModel = new CarViewModel();
        carModel.setMake(s.getCar().getMake());
        carModel.setModel(s.getCar().getModel());
        carModel.setTravelledDistance(s.getCar().getTravelledDistance());
        return carModel;
    }
}
