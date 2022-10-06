package com.example.springdataautomappingobjects.service;

import com.example.springdataautomappingobjects.model.dto.binding.UserLoginBindingModel;
import com.example.springdataautomappingobjects.model.dto.binding.UserLogoutBindingModel;
import com.example.springdataautomappingobjects.model.dto.binding.UserRegisterBindingModel;
import com.example.springdataautomappingobjects.model.dto.view.SuccessLoginUserViewModel;
import com.example.springdataautomappingobjects.model.dto.view.SuccessLogoutUserViewModel;
import com.example.springdataautomappingobjects.model.dto.view.UserGamesViewModel;

public interface UserService {

    boolean register(UserRegisterBindingModel model);

    SuccessLoginUserViewModel login(UserLoginBindingModel model);

    SuccessLogoutUserViewModel logout(UserLogoutBindingModel logoutModel);

    Boolean isADMIN(String email);

    UserLogoutBindingModel loginUser(String email);

    UserGamesViewModel getUserGamesViewModel(String email);
}
