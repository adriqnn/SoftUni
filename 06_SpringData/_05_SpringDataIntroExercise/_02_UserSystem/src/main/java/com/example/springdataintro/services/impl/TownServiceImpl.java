package com.example.springdataintro.services.impl;

import com.example.springdataintro.repositories.TownRepository;
import com.example.springdataintro.services.interfaces.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TownServiceImpl implements TownService {

    private final TownRepository townRepository;

    @Autowired
    public TownServiceImpl(TownRepository townRepository) {
        this.townRepository = townRepository;
    }
}
