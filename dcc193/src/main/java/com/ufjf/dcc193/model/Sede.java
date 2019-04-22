package com.ufjf.dcc193.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SEDE")
public class Sede {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long sedeId;
	
	private String nomeFantasia;
	private String estado;
    private String cidade;
    private String bairro;
    private String telefone;
    
	public Sede() {
	}
	
	public Sede(Long sedeId, String nomeFantasia, String estado, String cidade, String bairro, String telefone) {
		this.sedeId = sedeId;
		this.nomeFantasia = nomeFantasia;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.telefone = telefone;
	}
	
	public Long getSedeId() {
		return sedeId;
	}
	public void setSedeId(Long sedeId) {
		this.sedeId = sedeId;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}