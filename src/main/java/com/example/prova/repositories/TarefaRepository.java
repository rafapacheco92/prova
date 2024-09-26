package com.example.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prova.entities.TarefaEntity;

public interface TarefaRepository extends JpaRepository<TarefaEntity, Long>{
    
}
