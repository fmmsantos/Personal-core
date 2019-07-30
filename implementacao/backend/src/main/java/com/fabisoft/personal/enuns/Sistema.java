package com.fabisoft.personal.enuns;

public enum Sistema {
	
	seriesMultiplas("Series Multiplas"),
	seriesCombinadas("Series Combinadas"),
	piramides("Pirâmides"),
	biSet ("Bi-set"),
	triSet("Tri-set"),
	superSet("Super-set"),
	dropSet("Drop-set"),
	tripSet("Trip-set"),
	stripSet("Strip-set"),
	picoContracao("pico de Contração"),
	set21("set-21"),
	preExautao("Pré-Exautao"),
	exaustao("Exautão"),
	restPause("Rest pause"),
	fadigaExcentrica("Fadiga Excentrica"),
	repeticaoParcial("Repeticão Parcial"),
	seisVinte("6x20"),
	ExcentricaOuNegativa("Excentrica ou Negativa"),
	OclusaoVascular("Oclusão Vascular"),
	fst7("FST-7"),
	gvt("GVT");
	
	public String sistema;
	Sistema(String sistema){
		this.sistema=sistema;
		
	}
	
	
	
	
	

}
