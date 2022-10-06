package com.example.springdataautomappingobjects.command.commandModels;

import com.example.springdataautomappingobjects.model.dto.binding.AddGameBindingModel;
import com.example.springdataautomappingobjects.service.GameService;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Transactional
@Component
public class AddGame implements Command {

    private final GameService gameService;

    public AddGame(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void apply(String[] tokens) {
        String title = tokens[1];
        BigDecimal price = new BigDecimal(tokens[2]);
        Double size = Double.parseDouble(tokens[3]);
        String youtubeId = tokens[4];
        String imageUrl = tokens[5];
        String description = tokens[6];
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date releaseDate = null;
        try {
            releaseDate = sdf.parse(tokens[7]);
        } catch (Exception ignored) {}

        AddGameBindingModel gameModel =
                new AddGameBindingModel(title, price, size, youtubeId, imageUrl, description, releaseDate);
        boolean isAdded = this.gameService.addGame(gameModel);

        if (isAdded) {
            System.out.println(String.format("Added %s%n", gameModel.getTitle()));
        }
    }
}