package com.example.springdataautomappingobjects.demo;

import com.example.springdataautomappingobjects.demo.dto.ManagerDTO;
import com.example.springdataautomappingobjects.demo.entities.Address;
import com.example.springdataautomappingobjects.demo.entities.Employee;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MapperMain {
    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();
        Address address = new Address("boris tri",3,"Sofia","Bulgaria");
        Employee manager = new Employee("Mr.","Manager", BigDecimal.TEN, LocalDate.now(),address,true);
        Employee first = new Employee("Mr.","Employee First", BigDecimal.TEN, LocalDate.now(),address,true);
        Employee second = new Employee("Mr.","Employee Second", BigDecimal.TEN, LocalDate.now(),address,true);

        manager.addEmployee(first);
        manager.addEmployee(second);

        ManagerDTO dto = modelMapper.map(manager, ManagerDTO.class);
        System.out.println(dto);
    }
}