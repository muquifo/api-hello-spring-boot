package com.mmc.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mmc.hello.model.Hello;

@Repository 
public interface HelloRepository extends JpaRepository<Hello, Long>{
	
	Hello findByIdioma(String idioma);
	Hello findBySiglaIdioma(String siglaIdioma);
	
}
