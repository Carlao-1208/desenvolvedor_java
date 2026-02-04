package com.eventos.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eventos.app.models.Evento;
import com.eventos.app.repository.EventosRepository;

@Controller
public class EventosController {
    @Autowired
    private EventosRepository csr;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
    public String cadastrarEvento() {
        return "cadastrar-evento";
    }

    @RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
    public String cadastrarEvento(Evento evento) {
        csr.save(evento);
        return "redirect:/cadastroSucesso";
    }

    @RequestMapping("/cadastroSucesso")
    public String cadastroSucesso() {
        return "cadastro-sucesso";
    }
}
