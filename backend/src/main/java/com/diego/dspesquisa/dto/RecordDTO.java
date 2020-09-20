package com.diego.dspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.diego.dspesquisa.entities.Record;
import com.diego.dspesquisa.entities.enums.Platform;

public class RecordDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer age;
	private Instant moment;
	private String gameTitle;
	private Platform gamePlataform;
	private String genreName;
	
	
	public RecordDTO() {}
	
	public RecordDTO(Record record) {
		id = record.getId();
		name = record.getName();
		age = record.getAge();
		moment = record.getMoment();
		gameTitle = record.getGame().getTitle();
		gamePlataform = record.getGame().getPlatform();
		genreName = record.getGame().getGenre().getName();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public Platform getGamePlataform() {
		return gamePlataform;
	}

	public void setGamePlataform(Platform gamePlataform) {
		this.gamePlataform = gamePlataform;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}


	
}
