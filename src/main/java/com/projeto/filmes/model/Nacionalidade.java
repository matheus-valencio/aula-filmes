package com.projeto.filmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_nacionalidade")
public class Nacionalidade extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_pais", length = 50)
	private String pais;

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
}
