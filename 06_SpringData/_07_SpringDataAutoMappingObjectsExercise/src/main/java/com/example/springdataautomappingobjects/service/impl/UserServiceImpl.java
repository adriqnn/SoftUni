package com.example.springdataautomappingobjects.service.impl;

import com.example.springdataautomappingobjects.model.dto.binding.UserLoginBindingModel;
import com.example.springdataautomappingobjects.model.dto.binding.UserLogoutBindingModel;
import com.example.springdataautomappingobjects.model.dto.binding.UserRegisterBindingModel;
import com.example.springdataautomappingobjects.model.dto.view.SuccessLoginUserViewModel;
import com.example.springdataautomappingobjects.model.dto.view.SuccessLogoutUserViewModel;
import com.example.springdataautomappingobjects.model.dto.view.UserGamesViewModel;
import com.example.springdataautomappingobjects.model.entity.Role;
import com.example.springdataautomappingobjects.model.entity.User;
import com.example.springdataautomappingobjects.repository.UserRepository;
import com.example.springdataautomappingobjects.service.RoleService;
import com.example.springdataautomappingobjects.service.UserService;
import com.example.springdataautomappingobjects.util.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RoleService roleService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           ModelMapper modelMapper,
                           RoleService roleService) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.roleService = roleService;
    }

    @Override
    public boolean register(UserRegisterBindingModel model) {
        User user = modelMapper.map(model, User.class);
        this.setUserRole(user);
        if (model.isPasswordMatch()) {
            user = this.userRepository.saveAndFlush(user);
        }
        return user.getId() != null;
    }

    @Override
    public SuccessLoginUserViewModel login(UserLoginBindingModel model) {
        User user = this.userRepository.findOneByEmail(model.getEmail());
        if (user != null) {
            if (user.getPassword().equals(model.getPassword())) {
                user.setLogged(true);
                return this.modelMapper.map(user, SuccessLoginUserViewModel.class);
            }
        }
        return null;
    }

    @Override
    public SuccessLogoutUserViewModel logout(UserLogoutBindingModel logoutModel) {
        User user = this.userRepository.findOneByEmail(logoutModel.getEmail());
        if (user.isLogged()) {
            user.setLogged(false);
            return this.modelMapper.map(user, SuccessLogoutUserViewModel.class);
        }
        return null;
    }

    @Override
    public Boolean isADMIN(String email) {
        Role role = this.userRepository.findUserRoleByEmail(email);
        return role.getName().equalsIgnoreCase("ADMIN");
    }

    @Override
    public UserLogoutBindingModel loginUser(String email) {
        User user = this.userRepository.findOneByEmail(email);
        return this.modelMapper.map(user, UserLogoutBindingModel.class);
    }

    @Override
    public UserGamesViewModel getUserGamesViewModel(String email) {
        User user = this.userRepository.findOneByEmail(email);
        UserGamesViewModel viewModel = ObjectMapper.map(user, UserGamesViewModel.class);
        return viewModel;
    }

    private void setUserRole(User user) {
        if (this.userRepository.count() > 0) {
            user.getRole().add(this.roleService.getRoleByName(RoleService.Roles.USER));
        } else {
            user.getRole().add(this.roleService.getRoleByName(RoleService.Roles.ADMIN));
        }
    }
}
