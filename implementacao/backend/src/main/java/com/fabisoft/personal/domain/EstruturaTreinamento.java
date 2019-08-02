package com.fabisoft.personal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fabisoft.personal.enuns.Divisao;
import com.fabisoft.personal.enuns.Metodo;
import com.fabisoft.personal.enuns.Nivel;
import com.fabisoft.personal.enuns.Sistema;
import com.fabisoft.personal.enuns.Velocidade;
@Entity
@Table(name = "tb_estruTrein")
public class EstruturaTreinamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false,unique = false)
	private Integer numeroExerc;
	private Integer numeroSerie;
	private Integer repeticoes;
	private Integer intervalo;
	private Integer frequeSemanal;
	private Integer serieTotal;
	private Integer numeroTreino;
	private Integer numerosemana;
	@Enumerated(EnumType.STRING)
	private Divisao divisao;
	@Enumerated(EnumType.STRING)
	private Metodo metodo;
	@Enumerated(EnumType.STRING)
	private Nivel nivel;
	@Enumerated(EnumType.STRING)
	private Sistema sistema;
	@Enumerated(EnumType.STRING)
	private Velocidade velocidade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumeroExerc() {
		return numeroExerc;
	}
	public void setNumeroExerc(int numeroExerc) {
		this.numeroExerc = numeroExerc;
	}
	public int getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public int getRepeticoes() {
		return repeticoes;
	}
	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}
	public int getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}
	public int getFrequeSemanal() {
		return frequeSemanal;
	}
	public void setFrequeSemanal(int frequeSemanal) {
		this.frequeSemanal = frequeSemanal;
	}
	public int getSerieTotal() {
		return serieTotal;
	}
	public void setSerieTotal(int serieTotal) {
		this.serieTotal = serieTotal;
	}
	public int getNumeroTreino() {
		return numeroTreino;
	}
	public void setNumeroTreino(int numeroTreino) {
		this.numeroTreino = numeroTreino;
	}
	public int getNumerosemana() {
		return numerosemana;
	}
	public void setNumerosemana(int numerosemana) {
		this.numerosemana = numerosemana;
	}
	public Divisao getDivisao() {
		return divisao;
	}
	public void setDivisao(Divisao divisao) {
		this.divisao = divisao;
	}
	public Metodo getMetodo() {
		return metodo;
	}
	public void setMetodo(Metodo metodo) {
		this.metodo = metodo;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstruturaTreinamento other = (EstruturaTreinamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
