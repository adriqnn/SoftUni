package com.example.springdataautomappingobjects.command.commandModels;

import com.example.springdataautomappingobjects.model.dto.binding.UserLoginBindingModel;
import com.example.springdataautomappingobjects.model.dto.view.SuccessLoginUserViewModel;
import com.example.springdataautomappingobjects.service.UserService;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class LoginUser implements Command {

    private final UserService userService;

    public LoginUser(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void apply(String[] tokens) {
        UserLoginBindingModel loginModel = new UserLoginBindingModel(tokens[1], tokens[2]);
        SuccessLoginUserViewModel successLoginUserViewModel = this.userService.login(loginModel);

        if (successLoginUserViewModel != null) {
            System.out.println("Successfully logged in " + successLoginUserViewModel.getFullName());
        }
    }
}
