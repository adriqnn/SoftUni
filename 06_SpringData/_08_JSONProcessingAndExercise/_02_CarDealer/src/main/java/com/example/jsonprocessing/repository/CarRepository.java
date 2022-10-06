package com.example.jsonprocessing.repository;

import com.example.jsonprocessing.model.dto.viewModel.query2.CarDTO;
import com.example.jsonprocessing.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT new com.example.jsonprocessing.model.dto.viewModel.query2.CarDTO(c.id, c.make, c.model, c.travelledDistance) " +
            "FROM Car c WHERE c.make LIKE :make ORDER BY c.model ASC, c.travelledDistance DESC")
    List<CarDTO> findAllByMakeOrderByModel(@Param("make") String make);

}
