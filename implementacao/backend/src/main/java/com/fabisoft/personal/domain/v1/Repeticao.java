package com.fabisoft.personal.domain.v1;

public class Repeticao {
	private Integer minimo;
	private Integer maximo;
	
	
	public Integer getMinimo() {
		return minimo;
	}
	public Integer getMaximo() {
		return maximo;
	}
	
	public Repeticao(Integer valor) {
		this.maximo=valor;
		this.minimo=valor;
	}
		
	
	public Repeticao(Integer minimo, Integer maximo) {
		this.minimo=minimo;
		this.maximo=maximo;
	}
	@Override
	public String toString() {
		return "[min=" + minimo + ", max=" + maximo + "]";
	}
	
}
