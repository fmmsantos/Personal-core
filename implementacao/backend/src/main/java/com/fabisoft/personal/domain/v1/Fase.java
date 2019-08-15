package com.fabisoft.personal.domain.v1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fabisoft.personal.enuns.Divisao;
import com.fabisoft.personal.enuns.Metodo;
import com.fabisoft.personal.enuns.Sistema;
import com.fabisoft.personal.enuns.Velocidade;
@Entity
public class Fase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 20,insertable = false)
	private String nome;
	@Column(insertable = false)
	private Repeticao numeroExercicios;
	@Column(insertable = false)
	private Repeticao series;
	@Enumerated(EnumType.STRING)
	private Metodo metodo;
	@Column(insertable = false)
	private Repeticao numeroSerie;
	@Column(insertable = false)
	private Repeticao repeticoes;
	@Column(insertable = false)
	private Repeticao intervalo;
	@Column(insertable = false)
	private Repeticao frequeSemanal;
	@Column(insertable = false)
	private Repeticao serieTotal;
	@Column(insertable = false)
	private Repeticao numeroTreino;
	@Column(insertable = false)
	private Repeticao numerosemana;
	@Enumerated(EnumType.STRING)
	private Divisao divisao;
	@Enumerated(EnumType.STRING)
	private Sistema sistema;
	@Enumerated(EnumType.STRING)
	private Velocidade velocidade;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Repeticao getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(Repeticao numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public Repeticao getRepeticoes() {
		return repeticoes;
	}
	public void setRepeticoes(Repeticao repeticoes) {
		this.repeticoes = repeticoes;
	}
	public Repeticao getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(Repeticao intervalo) {
		this.intervalo = intervalo;
	}
	public Repeticao getFrequeSemanal() {
		return frequeSemanal;
	}
	public void setFrequeSemanal(Repeticao frequeSemanal) {
		this.frequeSemanal = frequeSemanal;
	}
	public Repeticao getSerieTotal() {
		return serieTotal;
	}
	public void setSerieTotal(Repeticao serieTotal) {
		this.serieTotal = serieTotal;
	}
	public Repeticao getNumeroTreino() {
		return numeroTreino;
	}
	public void setNumeroTreino(Repeticao numeroTreino) {
		this.numeroTreino = numeroTreino;
	}
	public Repeticao getNumerosemana() {
		return numerosemana;
	}
	public void setNumerosemana(Repeticao numerosemana) {
		this.numerosemana = numerosemana;
	}
	public Divisao getDivisao() {
		return divisao;
	}
	public void setDivisao(Divisao divisao) {
		this.divisao = divisao;
	}
	public Sistema getSistema() {
		return sistema;
	}
	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}
	public Velocidade getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(Velocidade velocidade) {
		this.velocidade = velocidade;
	}
	
	public Metodo getMetodo() {
		return metodo;
	}
	public void setMetodo(Metodo metodo) {
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
				+ metodo + ", numeroSerie=" + numeroSerie + ", repeticoes=" + repeticoes + ", intervalo=" + intervalo
				+ ", frequeSemanal=" + frequeSemanal + ", serieTotal=" + serieTotal + ", numeroTreino=" + numeroTreino
				+ ", numerosemana=" + numerosemana + ", divisao=" + divisao + ", sistema=" + sistema + ", velocidade="
				+ velocidade + "]";
	}
	
	
	
}
