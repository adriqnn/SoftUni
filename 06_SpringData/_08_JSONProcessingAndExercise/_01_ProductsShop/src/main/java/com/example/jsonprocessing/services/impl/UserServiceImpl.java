package com.example.jsonprocessing.services.impl;

import com.example.jsonprocessing.entities.products.ProductsSold;
import com.example.jsonprocessing.entities.products.SoldProducts;
import com.example.jsonprocessing.entities.users.*;
import com.example.jsonprocessing.repositories.UserRepository;
import com.example.jsonprocessing.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper mapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

        this.mapper = new ModelMapper();
    }

    @Override
    @Transactional
    public List<UserWithSoldProductsDTO> getUsersWithSoldProducts() {
        List<User> allWithSoldProducts = this.userRepository.findAllWithSoldProducts();

        return allWithSoldProducts.stream().map(user -> this.mapper.map(user,UserWithSoldProductsDTO.class)).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public UserSalesStats getUsersWithSoldProductsOrderByCount() {
        List<User> all = this.userRepository.findAllWithSoldProductsOrderByCount();
        List<UserSalesDTO> salesDTOs = all.stream().map(user -> this.mapper.map(user,UserSalesDTO.class)).collect(Collectors.toList());
        UserSalesStats userSalesStats = new UserSalesStats(salesDTOs.size(),salesDTOs);
        //all.get(0).getSellingItems().size();
        return userSalesStats;
    }

    @Override
    @Transactional
    public UserSalesStatsFinalJSON getUsersWithSoldProductsOrderByCountQ4() {
        List<User> users = this.userRepository.findAllWithSoldProductsOrderByCount();
        UserSalesStatsFinalJSON returnThis = new UserSalesStatsFinalJSON();

        returnThis.setUsersCount((long)users.size());
        List<UsersViewQ4> usersViewQ4 = new ArrayList<>();
        users.forEach(u -> setUsers(u,usersViewQ4));
        returnThis.setUsers(usersViewQ4);
        return returnThis;
    }

    private void setUsers(User u, List<UsersViewQ4> usersViewQ4) {
        UsersViewQ4 setViews = new UsersViewQ4();
        setViews.setAge(u.getAge());
        setViews.setFirstName(u.getFirstName());
        setViews.setLastName(u.getLastName());

        SoldProducts soldProducts = new SoldProducts();
        soldProducts.setCount((long) u.getSellingItems().size());
        List<ProductsSold> productsSold = u.getSellingItems().stream().map(p -> {
            ProductsSold ps = new ProductsSold();
            ps.setName(p.getName());
            ps.setPrice(p.getPrice());
            return ps;
        }).collect(Collectors.toList());
        soldProducts.setProducts(productsSold);
        setViews.setSoldProducts(soldProducts);
        usersViewQ4.add(setViews);
    }
}
