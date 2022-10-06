package com.example.springdataautomappingobjects.service;

import com.example.springdataautomappingobjects.model.dto.binding.AddGameBindingModel;
import com.example.springdataautomappingobjects.model.dto.binding.EditGameBindingModel;
import com.example.springdataautomappingobjects.model.dto.view.DetailGameViewModel;
import com.example.springdataautomappingobjects.model.dto.view.GameForDeleteViewModel;
import com.example.springdataautomappingobjects.model.dto.view.ViewGameViewModel;

import java.util.List;

public interface GameService {

    Boolean addGame(AddGameBindingModel model);

    boolean checkForGame(Long id);

    String editGame(EditGameBindingModel editModel);

    void deleteGame(Long id);

    GameForDeleteViewModel findGame(Long id);

    List<ViewGameViewModel> findAllGames();

    DetailGameViewModel getDetailGame(String title);
}
