package com.diego.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
