package com.example.xmlprocessing.service;

import com.example.xmlprocessing.model.dto.binding.jsonBindingModel.UsersBindingModel;
import com.example.xmlprocessing.model.dto.binding.xmlBindingModel.seedUsersBindingModels.UserSeedDataWrapper;
import com.example.xmlprocessing.model.dto.view.jsonViewModels.UserViewModel;
import com.example.xmlprocessing.model.dto.view.usersAndProducts.UsersViewModelWrapper;
import com.example.xmlprocessing.model.entity.User;

public interface UserService {

    void persist(UsersBindingModel userDto);

    UserViewModel getUserById(Long sellerID);

    UsersViewModelWrapper getAllUsersWithSoldProduct();

    void persistAllUsers(UserSeedDataWrapper userWrapper);

    User userById(long buyer);
}
