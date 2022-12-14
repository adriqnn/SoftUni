package com.example.xmlprocessing.repository;


import com.example.xmlprocessing.model.dto.viewModel.query3.LocalSupplierDTO;
import com.example.xmlprocessing.model.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    @Query("SELECT new com.example.xmlprocessing.model.dto.viewModel.query3.LocalSupplierDTO(s.id, s.name, count(p.id) ) " +
            "FROM Supplier AS s JOIN s.parts AS p " +
            "WHERE s.importer = FALSE " +
            "GROUP BY s.id")
    List<LocalSupplierDTO> selectAllLocalSuppliers();
}
