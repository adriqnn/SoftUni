package com.example.springdataautomappingobjects.command.commandModels;

import com.example.springdataautomappingobjects.model.dto.binding.UserRegisterBindingModel;
import com.example.springdataautomappingobjects.service.UserService;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class RegisterUser implements Command {

    private final UserService userService;

    public RegisterUser(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void apply(String tokens[]) {
        UserRegisterBindingModel registerModel =
                new UserRegisterBindingModel(tokens[1], tokens[2], tokens[3], tokens[4]);
        boolean isRegistered = this.userService.register(registerModel);

        if (isRegistered) {
            System.out.println(registerModel.getFullName() + " was registered");
        }
    }
}
