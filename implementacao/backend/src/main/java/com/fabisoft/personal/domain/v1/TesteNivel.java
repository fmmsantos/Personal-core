package com.fabisoft.personal.domain.v1;

public class TesteNivel {
	public static void main(String[] args) {
		Nivel nivel = new Nivel();
		nivel.setNome("INICIANTE");
		
		Fase fase = new Fase();
		fase.setNome("A1");
		fase.setNumeroExercicios(new Repeticao(5));
		fase.setSeries(new Repeticao(2,3));
	
		
		nivel.addFase(fase);
		
		nivel.getFases().forEach(f->{
			System.out.println(f);
			System.out.println(f.getSeries().getMaximo());
		});
		
	}
}
