package com.example.springdataautomappingobjects.command.commandModels;

import com.example.springdataautomappingobjects.model.dto.binding.UserLogoutBindingModel;
import com.example.springdataautomappingobjects.model.dto.view.SuccessLogoutUserViewModel;
import com.example.springdataautomappingobjects.service.UserService;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class LogoutUser implements Command {

    private final UserService userService;

    public LogoutUser(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void apply(String[] tokens) {
        UserLogoutBindingModel logoutModel = new UserLogoutBindingModel(tokens[1]);
        SuccessLogoutUserViewModel suvModel = this.userService.logout(logoutModel);
        if (suvModel != null) {
            System.out.println("User " + suvModel.getFullName() + " successfully logged out");
        } else {
            System.out.println("Cannot log out. No user was logged in.");
        }
    }
}
