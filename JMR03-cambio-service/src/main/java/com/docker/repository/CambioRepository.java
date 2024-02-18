package com.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
	Cambio findByFromAndTo(String from, String to);
}
