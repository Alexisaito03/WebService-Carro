package com.carros.domain;

import javax.persistence.*;

@Entity(name = "carro") //O name só é necessário caso a classe possua o nome diferente da tabela no banco
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Gerar um Id autoincrement automaticamente
    private Long id;

    @Column(name = "nome") // Seria necessário caso o nome do atributo fosse diferente do nome da coluna da tabela
    private String nome;

    public Carro(){

    }

    public Carro(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
