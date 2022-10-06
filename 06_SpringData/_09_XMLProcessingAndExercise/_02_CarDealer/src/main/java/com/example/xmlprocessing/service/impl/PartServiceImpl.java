package com.example.xmlprocessing.service.impl;

import com.example.xmlprocessing.model.dto.bindingModel.seedDataDTOs.PartSeedDataBindingModel;
import com.example.xmlprocessing.model.entity.Part;
import com.example.xmlprocessing.model.entity.Supplier;
import com.example.xmlprocessing.repository.PartRepository;
import com.example.xmlprocessing.service.PartService;
import com.example.xmlprocessing.service.SupplierService;
import com.example.xmlprocessing.utils.modelMapper.DTOConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Random;

@Service
@Transactional
public class PartServiceImpl implements PartService {

    private final PartRepository partRepository;
    private final SupplierService supplierService;

    @Autowired
    public PartServiceImpl(PartRepository partRepository,
                           SupplierService supplierService) {
        this.partRepository = partRepository;
        this.supplierService = supplierService;
    }

    @Override
    public void saveAll(PartSeedDataBindingModel[] partsDtos) {
        for (PartSeedDataBindingModel partDto : partsDtos) {
            Part part = DTOConverter.convert(partDto, Part.class);
            setRandomSupplier(part);
            this.partRepository.saveAndFlush(part);
        }
    }

    @Override
    public Part getOneById(Long id) {
        return this.partRepository.getOne(id);
    }

    private void setRandomSupplier(Part part) {
        Random random = new Random();
        Integer id;
        do {
            id = random.nextInt(31);
        } while ((id == 0));
        Supplier supplier = this.supplierService.findOneById(Long.valueOf(id));
        String debug = "";
        part.setSupplier(supplier);
    }

}
