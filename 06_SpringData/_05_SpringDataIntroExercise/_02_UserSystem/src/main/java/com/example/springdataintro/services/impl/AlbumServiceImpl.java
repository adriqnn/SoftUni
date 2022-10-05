package com.example.springdataintro.services.impl;

import com.example.springdataintro.repositories.AlbumRepository;
import com.example.springdataintro.services.interfaces.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;

    @Autowired
    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }
}