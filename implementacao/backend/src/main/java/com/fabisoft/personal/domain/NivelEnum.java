package com.fabisoft.personal.domain;

import java.util.ArrayList;
import java.util.List;

public class NivelEnum {
	private Integer codigo;
	private String nome;
	private NivelEnum pai;
	private List<NivelEnum> subniveis; // exemplo
	
	public NivelEnum () {
		this.subniveis = new ArrayList<NivelEnum>();
	}
	public void addSubnivel(NivelEnum nivel) {
		nivel.pai=this;
		subniveis.add(nivel);
	}
	public NivelEnum getPai() {
		return pai;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<NivelEnum> getSubniveis() {
		return subniveis;
	}
	public static void main(String[] args) {
		NivelEnum subA1 = new NivelEnum();
		subA1.setCodigo(1); // pode ser o proprio nome o nivel A1 por exemplo para ir para o banco
		subA1.setNome("A1");
		NivelEnum subA2 = new NivelEnum();
		subA2.setCodigo(2);
		subA2.setNome("A2");
		NivelEnum subA3 = new NivelEnum();
		subA3.setNome("A3");
		subA3.setCodigo(3);
		
		
		NivelEnum nivelA =new NivelEnum();
		nivelA.setNome("Nivel A");
		nivelA.addSubnivel(subA1);
		nivelA.addSubnivel(subA2);
		nivelA.addSubnivel(subA3);
		
		nivelA.getSubniveis().forEach(n->{
			System.out.println(n.toString());
		});
		
	
		
	}
	@Override
	public String toString() {
		return "Nivel [codigo=" + codigo + ", nome=" + nome + "] - PAI " + pai.getNome();
	}
	
}
