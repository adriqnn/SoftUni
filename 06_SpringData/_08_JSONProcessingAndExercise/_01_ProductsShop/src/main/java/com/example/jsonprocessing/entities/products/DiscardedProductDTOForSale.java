package com.example.jsonprocessing.entities.products;

import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public interface DiscardedProductDTOForSale {
    String getName();
    BigDecimal getPrice();

    @Value("#{target.seller.firstName + ' ' + target.seller.lastName}")
    String getSeller();
}
