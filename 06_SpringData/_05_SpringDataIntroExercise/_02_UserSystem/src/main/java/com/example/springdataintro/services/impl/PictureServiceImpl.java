package com.example.springdataintro.services.impl;

import com.example.springdataintro.repositories.PictureRepository;
import com.example.springdataintro.services.interfaces.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PictureServiceImpl implements PictureService {

    private final PictureRepository pictureRepository;

    @Autowired
    public PictureServiceImpl(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }
}
