package com.projeto.filmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_filme")
@Inheritance(strategy = InheritanceType.JOINED)
public class Filme extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_titulo", length = 50)
	private String titulo;
	
	@Column(name = "dt_Ano", length = 4)
	private Integer ano;
	
	@ManyToMany
	private Ator ator;

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

	public Ator getAtor() {
		return ator;
	}

	public void setAtor(Ator ator) {
		this.ator = ator;
	}
	
	
	
}