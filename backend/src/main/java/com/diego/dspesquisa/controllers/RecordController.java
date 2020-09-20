package com.diego.dspesquisa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.dspesquisa.dto.RecordDTO;
import com.diego.dspesquisa.dto.RecordInsertDTO;
import com.diego.dspesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordController {
	
	@Autowired
	private RecordService service;
	
	@PostMapping
	public ResponseEntity<RecordDTO> save(@RequestBody RecordInsertDTO dto){
		return ResponseEntity.ok().body(service.insert(dto));
	}
	
	
}
