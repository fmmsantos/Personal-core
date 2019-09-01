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
	
	//private Nivel nivel;
	@ManyToOne
	@JoinColumn(name = "cd_fase")
	private Fase faseAtual;
	
	
}
