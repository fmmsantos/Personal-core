package com.fabisoft.personal.domain.v1;

import com.fabisoft.personal.enuns.Divisao;
import com.fabisoft.personal.enuns.Metodo;
import com.fabisoft.personal.enuns.Sistema;
import com.fabisoft.personal.enuns.Velocidade;

public class TesteNivel {
	public static void main(String[] args) {
		Nivel nivel = new Nivel();
		nivel.setNome("INICIANTE");
		
		
		Fase fase = new Fase();
		fase.setNome("A1");
		fase.setNumeroExercicios(new Repeticao(5));
		fase.setSeries(new Repeticao(2,3));
		fase.setDivisao(Divisao.AB);
		fase.setFrequeSemanal(new Repeticao(2,3));
		fase.setIntervalo(new Repeticao(1));
		fase.setMetodo(Metodo.CIRC);
		fase.setNumerosemana(new Repeticao(4,6));
		fase.setNumeroSerie(new Repeticao(10,12));
		fase.setSerieTotal(new Repeticao(20,25));
		fase.setSistema(Sistema.SM);
		fase.setVelocidade(Velocidade.MOD);
		fase.setNumeroTreino(new Repeticao(12,18));
		fase.setRepeticoes(new Repeticao(10,12));
	
	
		
		nivel.addFase(fase);
		
		nivel.getFases().forEach(f->{
			System.out.println(f);
			System.out.println(f.getSeries().getMaximo());
		});
		System.out.println(nivel.getNome());
		
	}
}
