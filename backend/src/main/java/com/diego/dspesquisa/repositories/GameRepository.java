package com.diego.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
