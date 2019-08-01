package com.fabisoft.personal.enuns;

public enum Velocidade {
	LEVE("Leve"),
	MOD("Moderada"),
	INTEN("Intenso");
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	Velocidade(String nome){
		this.nome = nome;
		
	}

}
