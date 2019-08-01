package com.fabisoft.personal.enuns;

public enum Metodo {
	ALTER("Alternado por segmento corporal"),
	LOCALI("Localizado por articulação"),
	CIRC("Circuito"),
	AGANT("Agonista/Antagonista"),
	DIREC("Direcionado por grupamento Muscular");
	
	private String nome;
	Metodo(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

}
