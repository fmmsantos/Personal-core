package com.fabisoft.personal.domain.v1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nivel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String nome;
	private List<Fase> fases;
	
	
	public Nivel() {
		this.fases=new ArrayList<Fase>();
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Fase> getFases() {
		return fases;
	}
	public void addFase(Fase fase) {
		this.fases.add(fase);
	}
	
}
