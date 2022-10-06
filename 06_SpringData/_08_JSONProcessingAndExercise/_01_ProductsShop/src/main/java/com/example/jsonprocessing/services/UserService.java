package com.example.jsonprocessing.services;

import com.example.jsonprocessing.entities.users.UserSalesStats;
import com.example.jsonprocessing.entities.users.UserSalesStatsFinalJSON;
import com.example.jsonprocessing.entities.users.UserWithSoldProductsDTO;

import java.util.List;

public interface UserService {
    List<UserWithSoldProductsDTO> getUsersWithSoldProducts();

    UserSalesStats getUsersWithSoldProductsOrderByCount();

    UserSalesStatsFinalJSON getUsersWithSoldProductsOrderByCountQ4();
}