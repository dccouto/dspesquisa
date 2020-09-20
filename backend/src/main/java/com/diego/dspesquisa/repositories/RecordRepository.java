package com.diego.dspesquisa.repositories;

import java.time.Instant;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diego.dspesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

	@Query("SELECT record FROM Record record WHERE "
			+ "(coalesce(:min, null) IS NULL OR record.moment >= :min) AND "
			+ "(coalesce(:max, null) IS NULL OR record.moment <= :max)")
	Page<Record> findByMoments(Instant min, Instant max, Pageable pageable);

}
