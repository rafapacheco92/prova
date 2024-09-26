package com.example.prova.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prova.entities.ResponsavelEntity;
import com.example.prova.repositories.TarefaRepository;

@Service
public class TarefaService {
    
    @Autowired
    TarefaRepository tarefaRepository;

    public List<Tarefa> listarTodos(){
        return tarefaRepository.findAll();
    }

    public Tarefa salvar(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }
}
