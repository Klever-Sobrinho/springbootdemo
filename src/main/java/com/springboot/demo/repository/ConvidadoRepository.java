package com.springboot.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.demo.models.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{

}
