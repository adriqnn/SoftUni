package com.example.springdataautomappingobjects.command.commandModels;

import com.example.springdataautomappingobjects.model.dto.view.DetailGameViewModel;
import com.example.springdataautomappingobjects.service.GameService;

public class DetailsGame implements Command {

    private final GameService gameService;

    public DetailsGame(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void apply(String[] tokens) {
        String title = tokens[1];
        DetailGameViewModel viewModel = this.gameService.getDetailGame(title);
        if (viewModel != null) {
            System.out.println(viewModel);
        } else {
            System.out.println("Don't exist game with this title.DetailGame|Overwatch");
        }
    }
}
