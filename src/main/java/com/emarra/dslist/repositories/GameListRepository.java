package com.emarra.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emarra.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
