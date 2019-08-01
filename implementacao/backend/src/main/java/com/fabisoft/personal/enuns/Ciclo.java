package com.fabisoft.personal.enuns;

public enum Ciclo {
	MICROC("Microciclo"),
	MESO("Mesociclo"),
	MACRO("Macrociclo");
	
	private String nome;
	Ciclo(String nome){
		this.nome = nome;
		
	}
	public String getNome() {
		return nome;
	}
	

}
