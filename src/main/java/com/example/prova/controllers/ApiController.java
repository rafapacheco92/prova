package com.example.prova.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prova.services.TarefaService;

@RestController
@RequestMapping
public class ApiController {
    
    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/tarefa")
    public ResponseEntity<Tarefa> listarTodos(){
        return TarefaService.listarTodos();
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa){
        return tarefaService.salvar(tarefa);
    }
}
