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
    private Long atividadeId;
    
    private String titulo;
    private String descricao;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataInicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataFim;
    private long horasAssistencial;
    private long horasJuridica;
    private long horasFinanceira;
    private long horasExecutiva;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sedeId", nullable = false)
    private Sede sede;

    public Atividade() {

    }

	public Atividade(Long atividadeId, String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim,
			long horasAssistencial, long horasJuridica, long horasFinanceira, long horasExecutiva,
			Sede sede) {
		super();
		this.atividadeId = atividadeId;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.horasAssistencial = horasAssistencial;
		this.horasJuridica = horasJuridica;
		this.horasFinanceira = horasFinanceira;
		this.horasExecutiva = horasExecutiva;
		this.sede = sede;
	}
	
	
	public Atividade(Sede sede, long horasAssistencial, long horasJuridica, long horasFinanceira, long horasExecutiva) {
		this.horasAssistencial = horasAssistencial;
		this.horasJuridica = horasJuridica;
		this.horasFinanceira = horasFinanceira;
		this.horasExecutiva = horasExecutiva;
		this.sede = sede;
	}

	public Long getAtividadeId() {
		return atividadeId;
	}

	public void setAtividadeId(Long id) {
		this.atividadeId = id;
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

	public long getHorasAssistencial() {
		return horasAssistencial;
	}

	public void setHorasAssistencial(long horasAssistencial) {
		this.horasAssistencial = horasAssistencial;
	}

	public long getHorasJuridica() {
		return horasJuridica;
	}

	public void setHorasJuridica(long horasJuridica) {
		this.horasJuridica = horasJuridica;
	}

	public long getHorasFinanceira() {
		return horasFinanceira;
	}

	public void setHorasFinanceira(long horasFinanceira) {
		this.horasFinanceira = horasFinanceira;
	}

	public long getHorasExecutiva() {
		return horasExecutiva;
	}

	public void setHorasExecutiva(long horasExecutiva) {
		this.horasExecutiva = horasExecutiva;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
}
