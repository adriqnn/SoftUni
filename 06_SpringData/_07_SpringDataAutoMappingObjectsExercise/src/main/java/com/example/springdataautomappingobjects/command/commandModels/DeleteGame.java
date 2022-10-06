package com.example.springdataautomappingobjects.command.commandModels;

import com.example.springdataautomappingobjects.model.dto.view.GameForDeleteViewModel;
import com.example.springdataautomappingobjects.service.GameService;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class DeleteGame implements Command {

    private final GameService gameService;

    public DeleteGame(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void apply(String[] tokens) {
        Long id = Long.parseLong(tokens[1]);
        if (this.gameService.checkForGame(id)) {
            GameForDeleteViewModel viewModel = this.gameService.findGame(id);
            this.gameService.deleteGame(id);
            System.out.println("Deleted " + viewModel.getTitle());
        } else {
            System.out.println("Game with that id do not exists.");
        }

    }
}
