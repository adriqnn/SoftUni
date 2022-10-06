package com.example.jsonprocessing.service.impl;

import com.example.jsonprocessing.model.dto.bindingModel.seedDataDTOs.SuppliersSeedDataBindingModel;
import com.example.jsonprocessing.model.dto.viewModel.query3.LocalSupplierDTO;
import com.example.jsonprocessing.model.entity.Supplier;
import com.example.jsonprocessing.repository.SupplierRepository;
import com.example.jsonprocessing.service.SupplierService;
import com.example.jsonprocessing.utils.modelMapper.DTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public void saveAll(SuppliersSeedDataBindingModel[] suppliersDtos) {
        Arrays.stream(suppliersDtos)
                .map(s -> DTOConverter.convert(s, Supplier.class))
                .forEach(this.supplierRepository::saveAndFlush);
    }

    @Override
    public Supplier findOneById(Long id) {
        return this.supplierRepository.getOne(id);
    }

    @Override
    public List<LocalSupplierDTO> getAllLocalSuppliers() {
        List<LocalSupplierDTO> supplierDTOs = this.supplierRepository.selectAllLocalSuppliers();
        return supplierDTOs;
    }
}