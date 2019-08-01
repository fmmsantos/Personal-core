package com.fabisoft.personal.enuns;

public enum Divisao {
	GLOBAL("Global"),
	AB("A/B"),
	ABC("A/B/C");
	
	private String nome;
	Divisao(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

}
