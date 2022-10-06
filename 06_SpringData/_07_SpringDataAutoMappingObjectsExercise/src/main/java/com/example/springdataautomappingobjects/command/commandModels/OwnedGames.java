package com.example.springdataautomappingobjects.command.commandModels;

import com.example.springdataautomappingobjects.model.dto.view.UserGamesViewModel;
import com.example.springdataautomappingobjects.model.entity.Game;
import com.example.springdataautomappingobjects.service.UserService;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class OwnedGames implements Command {

    private final UserService userService;

    public OwnedGames(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void apply(String[] token) {
        String email = token[1];
        UserGamesViewModel viewModel = this.userService.getUserGamesViewModel(email);
        for (Game game : viewModel.getGames()) {
            System.out.println(game.getTitle());
        }
    }
}
