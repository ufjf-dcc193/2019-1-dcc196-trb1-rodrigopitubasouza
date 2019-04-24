package com.ufjf.dcc193.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String titulo;
    private String descricao;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataInicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataFim;
    private Integer horasAssistencial;
    private Integer horasJuridica;
    private Integer horasFinanceira;
    private Integer horasExecutiva;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sedeId", nullable = false)
    private Sede sede;

    public Atividade() {

    }

    public Atividade(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, Integer assistencial,
            Integer juridica, Integer financeira, Integer executiva, Sede sede) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horasAssistencial = assistencial;
        this.horasJuridica = juridica;
        this.horasFinanceira = financeira;
        this.horasExecutiva = executiva;
        this.sede = sede;
    }

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public Integer gethorasAssistencial() {
		return horasAssistencial;
	}

	public void sethorasAssistencial(Integer horasAssistencial) {
		this.horasAssistencial = horasAssistencial;
	}

	public Integer gethorasJuridica() {
		return horasJuridica;
	}

	public void sethorasJuridica(Integer horasJuridica) {
		this.horasJuridica = horasJuridica;
	}

	public Integer gethorasFinanceira() {
		return horasFinanceira;
	}

	public void sethorasFinanceira(Integer horasFinanceira) {
		this.horasFinanceira = horasFinanceira;
	}

	public Integer gethorasExecutiva() {
		return horasExecutiva;
	}

	public void sethorasExecutiva(Integer horasExecutiva) {
		this.horasExecutiva = horasExecutiva;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
}
