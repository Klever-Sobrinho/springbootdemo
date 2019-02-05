package com.springboot.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.demo.models.Convidado;
import com.springboot.demo.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByCodigo(long codigo);
}
