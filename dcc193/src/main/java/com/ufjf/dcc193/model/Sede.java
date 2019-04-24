package com.ufjf.dcc193.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    private String site;
	@OneToMany(
			mappedBy = "sede", 
			targetEntity = Sede.class, 
			fetch = FetchType.LAZY, 
			cascade = CascadeType.ALL
			)
	private List<Membro> membroList;
    
	public Sede() {
	}
	
	public Sede(Long sedeId, String nomeFantasia, String estado, String cidade, String bairro, String telefone,
			String site, List<Membro> membroList) {
		super();
		this.sedeId = sedeId;
		this.nomeFantasia = nomeFantasia;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.telefone = telefone;
		this.site = site;
		this.membroList = membroList;
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
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public List<Membro> getMembroList() {
		return membroList;
	}
	public void setMembroList(List<Membro> membroList) {
		this.membroList = membroList;
	}
}
