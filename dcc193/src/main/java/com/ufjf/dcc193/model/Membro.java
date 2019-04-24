package com.ufjf.dcc193.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long membroId;

    private String nome;
    private String funcao;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataEntrada;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataSaida;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sedeId", nullable = false)
    private Sede sede;

    public Membro() {
    }

    public Membro(String nome, String funcao, String email, LocalDate dataEntrada, LocalDate dataSaida, Sede sede) {
        this.nome = nome;
        this.funcao = funcao;
        this.email = email;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.sede = sede;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return membroId;
    }

    public void setId(Long membroId) {
        this.membroId = membroId;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }


}