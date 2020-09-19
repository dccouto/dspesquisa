package com.diego.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diego.dspesquisa.dto.GameDTO;
import com.diego.dspesquisa.entities.Game;
import com.diego.dspesquisa.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	//para garantir que toda parte de banco de dados vai ser feita e finalizada nessa classe
	@Transactional(readOnly = true)
	public List<GameDTO> findAll(){
		List<Game> games = gameRepository.findAll();
		return games.stream().map(game -> new GameDTO(game)).collect(Collectors.toList());
	}
}
