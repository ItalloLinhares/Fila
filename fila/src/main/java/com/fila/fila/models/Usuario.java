package com.fila.fila.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String nome;

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}
}
