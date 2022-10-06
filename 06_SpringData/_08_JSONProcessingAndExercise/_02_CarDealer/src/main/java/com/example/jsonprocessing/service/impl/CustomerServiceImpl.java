package com.example.jsonprocessing.service.impl;

import com.example.jsonprocessing.model.dto.bindingModel.dtos.SaleDTO;
import com.example.jsonprocessing.model.dto.bindingModel.seedDataDTOs.CustomerSeedDataBindingModel;
import com.example.jsonprocessing.model.dto.viewModel.query1.CustomerViewModel;
import com.example.jsonprocessing.model.entity.Customer;
import com.example.jsonprocessing.model.entity.Sale;
import com.example.jsonprocessing.repository.CustomerRepository;
import com.example.jsonprocessing.service.CustomerService;
import com.example.jsonprocessing.utils.modelMapper.DTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void saveAll(CustomerSeedDataBindingModel[] customerDTOs) {
        Arrays.stream(customerDTOs)
                .map(c -> DTOConverter.convert(c, Customer.class))
                .forEach(this.customerRepository::saveAndFlush);
    }

    @Override
    public Customer oneById(Long customerID) {
        return this.customerRepository.getOne(customerID);
    }

    @Override
    public List<CustomerViewModel> allOrderedByBirthDate() {
        List<Customer> orderedCustomers =
                this.customerRepository.getAllByOrderByBirthDateAscYoungDriverDesc();

        List<CustomerViewModel> viewModel =
                orderedCustomers.stream().map(c -> {
                    CustomerViewModel model = new CustomerViewModel();
                    model.setId(c.getId());
                    model.setName(c.getName());
                    model.setBirthDate(c.getBirthDate());
                    model.setYoungDriver(c.isYoungDriver());

                    Set<SaleDTO> saleDTO = new HashSet<>();
                    c.getSales().stream().forEach(s -> {
                        SaleDTO dto = new SaleDTO();
                        dto.setId(s.getId());
                        saleDTO.add(dto);
                    });
                    model.setSales(saleDTO);
                    return model;
                }).collect(Collectors.toList());

//        List<CustomerViewModelQuery1> viewModel =
//                DtoConvertUtil.convert(orderedCustomers, CustomerViewModelQuery1.class);

        return viewModel;
    }

    @Override
    public List<com.example.jsonprocessing.model.dto.viewModel.query5.CustomerViewModel> getAllWithMinOneBoughtCar() {
        List<Customer> customerList = this.customerRepository.getAllWithMinOneBoughtCar();
        List<com.example.jsonprocessing.model.dto.viewModel.query5.CustomerViewModel> viewModel =
                customerList.stream().map(c -> {
                    com.example.jsonprocessing.model.dto.viewModel.query5.CustomerViewModel model = new com.example.jsonprocessing.model.dto.viewModel.query5.CustomerViewModel();
                    model.setFullName(c.getName());
                    model.setBoughtCars(c.getSales().size());
                    model.setSpentMoney(getSpendMoney(c));
                    return model;
                }).collect(Collectors.toList());
        return viewModel;
    }

    private BigDecimal getSpendMoney(Customer c) {
        BigDecimal spendMoney = BigDecimal.ZERO;

        for (Sale sale : c.getSales()) {
            double discount = sale.getDiscount() / 100.0;
            BigDecimal finalDiscount = BigDecimal.valueOf(discount);
            BigDecimal moneyDiscount = sale.getCar().getPrice().multiply(finalDiscount);
            spendMoney = spendMoney.add(sale.getCar().getPrice().subtract(moneyDiscount));
        }

        return spendMoney;
    }

}
