package com.fabisoft.personal.domain.v1;

public class Fase {
	private String nome;
	private Repeticao numeroExercicios;
	private Repeticao series;
	private Repeticao metodo;
	
	public Repeticao getMetodo() {
		return metodo;
	}
	public void setMetodo(Repeticao metodo) {
		this.metodo = metodo;
	}
	public Repeticao getNumeroExercicios() {
		return numeroExercicios;
	}
	public Repeticao getSeries() {
		return series;
	}public void setNumeroExercicios(Repeticao numeroExercicios) {
		this.numeroExercicios = numeroExercicios;
	}
	public void setSeries(Repeticao series) {
		this.series = series;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Fase [nome=" + nome + ", numeroExercicios=" + numeroExercicios + ", series=" + series + ", metodo="
				+ metodo + "]";
	}
	
	
}
