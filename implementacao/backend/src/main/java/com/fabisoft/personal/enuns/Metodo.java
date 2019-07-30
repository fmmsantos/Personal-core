package com.fabisoft.personal.enuns;

public enum Metodo {
	ALTERNADO("Alternado por segmento corporal"),
	LOCALIZADO("Localizado por articulação"),
	CIRCUITO("Circuito"),
	AGANT("Agonista/Antagonista"),
	DIRECIONADO("Direcionado por grupamento Muscular");
	
	public String metodo;
	Metodo(String metodo){
		this.metodo = metodo;
	}

}
