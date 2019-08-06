package com.fabisoft.personal.enuns;

public enum Nivel {
	INIC("A",1),
	INTERM("B",2),
	AVANC("C",3);
	
	
	private Integer numeroSerie;
	public Integer getNumeroSerie() {
		return numeroSerie;
	}
	private String sigla;

	private Nivel(String sigla,Integer numeroSerie) {
		this.sigla = sigla;
		this.numeroSerie=numeroSerie;
	}

	public String getSigla() {
		return sigla;
	}

	
	
	
	
	

}
