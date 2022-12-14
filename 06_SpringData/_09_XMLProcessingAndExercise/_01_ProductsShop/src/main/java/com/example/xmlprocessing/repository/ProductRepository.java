package com.example.xmlprocessing.repository;

import com.example.xmlprocessing.model.dto.view.jsonViewModels.ProductInRangeViewModel;
import com.example.xmlprocessing.model.entity.Product;
import com.example.xmlprocessing.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT new com.example.xmlprocessing.model.dto.view.jsonViewModels.ProductInRangeViewModel(" +
            "p.name,p.price, TRIM(CONCAT(COALESCE(p.seller.firstName,'') ,' ',p.seller.lastName)) )" +
            " FROM Product AS p " +
            "WHERE (p.price BETWEEN :from AND :to) AND p.buyer IS NULL " +
            "ORDER BY p.price ASC")
    List<ProductInRangeViewModel> getAllByRangeWithoutBuyer(@Param("from") BigDecimal from, @Param("to") BigDecimal to);

    @Query("SELECT p.seller FROM Product p WHERE p.buyer IS NOT NULL")
    List<User> getAllUsersQuery2();
}
































