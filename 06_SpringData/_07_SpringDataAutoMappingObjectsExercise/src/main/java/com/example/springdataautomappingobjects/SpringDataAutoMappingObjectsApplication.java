package com.example.springdataautomappingobjects;

import com.example.springdataautomappingobjects.config.ModelMapperConfig;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataAutoMappingObjectsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataAutoMappingObjectsApplication.class, args);
    }

    @Bean
    public ModelMapper getMapper() {
        ModelMapper modelMapper = new ModelMapper();
        ModelMapperConfig config = new ModelMapperConfig(modelMapper);
        return modelMapper;
    }

}
