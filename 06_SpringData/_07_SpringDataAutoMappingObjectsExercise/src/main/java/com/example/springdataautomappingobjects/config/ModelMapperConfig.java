package com.example.springdataautomappingobjects.config;

import com.example.springdataautomappingobjects.model.dto.binding.AddGameBindingModel;
import com.example.springdataautomappingobjects.model.entity.Game;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class ModelMapperConfig {

    private final ModelMapper modelMapper;

    public ModelMapperConfig(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.initialize();
    }

    private void initialize() {
        this.gamesAddingMapping();
    }

    private void gamesAddingMapping() {
        PropertyMap<AddGameBindingModel, Game> orderMap = new PropertyMap<AddGameBindingModel, Game>() {
            @Override
            protected void configure() {
                map().setTitle(source.getTitle());
                map().setPrice(source.getPrice());
                map().setSize(source.getSize());
                map().setYoutubeId(source.getYoutubeId());
                map().setImageUrl(source.getImageUrl());
                map().setDescription(source.getDescription());
                map().setReleaseDate(source.getReleaseDate());
            }
        };
        modelMapper.addMappings(orderMap);
    }
}
