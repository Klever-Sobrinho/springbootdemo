package com.springboot.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.demo.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo (long codigo);
}
