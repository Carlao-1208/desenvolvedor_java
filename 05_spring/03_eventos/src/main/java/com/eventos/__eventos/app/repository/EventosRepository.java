package com.eventos.__eventos.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.__eventos.app.models.Evento;

public interface EventosRepository extends CrudRepository<Evento, String> {
    

}

