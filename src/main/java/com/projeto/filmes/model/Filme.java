package com.projeto.filmes.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_filme")
@Inheritance(strategy = InheritanceType.JOINED)
public class Filme extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(length = 50)
	private String titulo;
	
	@Column(length = 4)
	private Integer ano;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_ator_id", unique = true)
	private List<Ator> ator;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public List<Ator> getAtor() {
		return ator;
	}

	public void setAtor(List<Ator> ator) {
		this.ator = ator;
	}


	


	
	
	
}