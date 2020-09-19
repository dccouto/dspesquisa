package com.diego.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
