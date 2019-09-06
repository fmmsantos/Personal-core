package com.fabisoft.personal.domain.v1;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fabisoft.personal.enuns.Ciclo;
import com.fabisoft.personal.enuns.Divisao;
import com.fabisoft.personal.enuns.Metodo;
import com.fabisoft.personal.enuns.Sistema;
import com.fabisoft.personal.enuns.Velocidade;

@Entity
public class Fase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 20, insertable = false)
	private String nome;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "minimo", column = @Column(name = "nexerc_min")),
			@AttributeOverride(name = "maximo", column = @Column(name = "nexerc_max")) })
	private Repeticao numeroExercicios;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "minimo", column = @Column(name = "ser_min")),
			@AttributeOverride(name = "maximo", column = @Column(name = "ser_max")) })
	private Repeticao series;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "minimo", column = @Column(name = "ns_min")),
			@AttributeOverride(name = "maximo", column = @Column(name = "ns_max")) })
	private Repeticao numeroSerie;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "minimo", column = @Column(name = "rep_min")),
			@AttributeOverride(name = "maximo", column = @Column(name = "rep_max")) })
	private Repeticao repeticoes;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "minimo", column = @Column(name = "interval_min")),
			@AttributeOverride(name = "maximo", column = @Column(name = "interval_max")) })
	private Repeticao intervalo;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "minimo", column = @Column(name = "fs_min")),
			@AttributeOverride(name = "maximo", column = @Column(name = "fs_max")) })
	private Repeticao frequeSemanal;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "minimo", column = @Column(name = "st_min")),
			@AttributeOverride(name = "maximo", column = @Column(name = "st_max")) })
	private Repeticao serieTotal;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "minimo", column = @Column(name = "nt_min")),
			@AttributeOverride(name = "maximo", column = @Column(name = "nt_max")) })
	private Repeticao numeroTreino;
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "minimo", column = @Column(name = "nrsem_min")),
			@AttributeOverride(name = "maximo", column = @Column(name = "nrsem_max")) })
	
	// ENUNS
	private Repeticao numerosemana;
	
	@Enumerated(EnumType.STRING)
	private Divisao divisao;
	
	@Enumerated(EnumType.STRING)
	private Sistema sistema;
	
	@Enumerated(EnumType.STRING)
	private Velocidade velocidade;
	
	@Enumerated(EnumType.STRING)
	private Ciclo ciclo;
	
	@Enumerated(EnumType.STRING)
	private Metodo metodo;

	private boolean excluido;

	public boolean isExcluido() {
		return excluido;
	}

	public void setExcluido(boolean excluido) {
		this.excluido = excluido;
	}

	public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	}

	public void setNumeroExercicios(Repeticao numeroExercicios) {
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
