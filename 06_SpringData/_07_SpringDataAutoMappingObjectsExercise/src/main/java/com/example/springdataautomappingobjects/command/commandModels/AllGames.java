package com.example.springdataautomappingobjects.command.commandModels;

import com.example.springdataautomappingobjects.model.dto.view.ViewGameViewModel;
import com.example.springdataautomappingobjects.service.GameService;

import java.util.List;

public class AllGames implements Command {

    private final GameService gameService;

    public AllGames(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void apply(String[] tokens) {
        List<ViewGameViewModel> viewModels = this.gameService.findAllGames();
        viewModels.forEach( m ->
                System.out.println(String.format("%s %.2f", m.getTitle(), m.getPrice())));
    }
}
