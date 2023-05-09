package com.emarra.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emarra.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
