package com.example.springdataautomappingobjects.repository;

import com.example.springdataautomappingobjects.model.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    Game findByTitle(String title);
}
