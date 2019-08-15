package com.fabisoft.personal.domain.v1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Treinamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Nivel nivel;
	private Fase faseAtual;
	
	
}
