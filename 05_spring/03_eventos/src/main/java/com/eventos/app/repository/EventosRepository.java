package com.eventos.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventos.app.models.Evento;

public interface EventosRepository extends CrudRepository<Evento, String> {
    Evento findByIdEvento(long idEvento);
}