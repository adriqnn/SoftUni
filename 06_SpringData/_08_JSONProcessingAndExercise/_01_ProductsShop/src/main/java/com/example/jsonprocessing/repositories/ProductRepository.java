package com.example.jsonprocessing.repositories;

import com.example.jsonprocessing.entities.categories.CategoryStatsDTO;
import com.example.jsonprocessing.entities.products.Product;
import com.example.jsonprocessing.entities.products.ProductWithoutBuyerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query("SELECT new com.example.jsonprocessing.entities.products.ProductWithoutBuyerDTO(" +
            "p.name, p.price, p.seller.firstName, p.seller.lastName) FROM Product p WHERE p.price > :rangeStart AND p.price < :rangeEnd AND p.buyer IS NULL" +
            " ORDER BY p.price ASC")
    List<ProductWithoutBuyerDTO> findAllByPriceBetweenAndBuyerIsNullOrderByPriceAsc(BigDecimal rangeStart, BigDecimal rangeEnd);

    @Query("SELECT new com.example.jsonprocessing.entities.categories.CategoryStatsDTO(c.name,count(p),avg(p.price),sum(p.price))" +
            " FROM Product p JOIN p.categories c GROUP BY c")
    List<CategoryStatsDTO> getCategoryStats();
}
