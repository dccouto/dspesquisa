package com.diego.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diego.dspesquisa.dto.RecordDTO;
import com.diego.dspesquisa.dto.RecordInsertDTO;
import com.diego.dspesquisa.entities.Record;
import com.diego.dspesquisa.repositories.GameRepository;
import com.diego.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		var record = new Record();
		record.setAge(dto.getAge());
		record.setGame(gameRepository.getOne(dto.getGameId()));
		record.setMoment(Instant.now());
		record.setName(dto.getName());
		
		return new RecordDTO(recordRepository.save(record));
	}

}
