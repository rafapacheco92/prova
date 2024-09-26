package com.example.prova.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prova.entities.UsersEntity;

public interface UsersRepository extends JpaRepository<UsersEntity, Long>{
    
}
