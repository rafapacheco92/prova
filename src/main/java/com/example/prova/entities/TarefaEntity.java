package com.example.prova.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class TarefaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @OneToOne
    @JoinColumn(name = "responsavel_id")
    private ResponsavelEntity responsavel;

    @OneToMany(mappedBy = "tarefa")
    private List<UsersEntity> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ResponsavelEntity getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelEntity responsavel) {
        this.responsavel = responsavel;
    }

    public List<UsersEntity> getUsers() {
        return users;
    }

    public void setBooks(List<UsersEntity> users){
        this.users = users;
    }

    
}
