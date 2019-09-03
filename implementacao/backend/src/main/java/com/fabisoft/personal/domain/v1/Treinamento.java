package com.fabisoft.personal.domain.v1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Treinamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "cd_fase")
	private Fase faseAtual;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Fase getFaseAtual() {
		return faseAtual;
	}
	public void setFaseAtual(Fase faseAtual) {
		this.faseAtual = faseAtual;
	}
	
	
}
