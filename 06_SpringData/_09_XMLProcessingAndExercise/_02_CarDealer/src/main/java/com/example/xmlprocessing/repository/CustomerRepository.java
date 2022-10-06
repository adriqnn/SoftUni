package com.example.xmlprocessing.repository;

import com.example.xmlprocessing.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> getAllByOrderByBirthDateAscYoungDriverDesc();

    @Query("SELECT c FROM Customer c WHERE size(c.sales) > 0")
    List<Customer> getAllWithMinOneBoughtCar();
}
