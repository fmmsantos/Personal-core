package com.fabisoft.personal.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabisoft.personal.domain.EstruturaTreinamento;
import com.fabisoft.personal.enuns.Divisao;
import com.fabisoft.personal.enuns.Metodo;

import com.fabisoft.personal.enuns.Velocidade;
import com.fabisoft.personal.repository.EstruTreinamRepository;

@Service
public class EstruTreinamentoService {
	//@Autowired private EstruTreinamRepository repository;
	// nivel
	public void salvar(EstruturaTreinamento entidade) {
		//if(entidade.getNivel()==null )
		//	throw new RuntimeException("Não podemos salvar treinamento sem nivel");
		
		 if(entidade.getDivisao()==null) 
			    throw new RuntimeException("Não podemos salvar treinamento sem divisão");
			   
	     if(entidade.getFrequeSemanal()==null) 
		       throw new RuntimeException("Não podemos salvar treinamento sem a frequencia semanal");		    
	     
	    if(entidade.getIntervalo()==null) 
	 		throw new RuntimeException("Não podemos salvar treinamento sem Intervalo");
	 		
	 	if(entidade.getMetodo()==null) {
	 		throw new RuntimeException("Não podemos salvar treinamento sem Método");
	 	    }
	   
	 	if(entidade.getNumeroExerc()==null) {
	 		throw new RuntimeException("Não podemos salvar treinamento sem numero de exercicios");
	 		}
	 	if(entidade.getNumerosemana()==null) {
	 		throw new RuntimeException("Não podemos salvar treinamento sem Numero Semanal");
	 		}
	 	if(entidade.getNumeroSerie()==null) {
	 		throw new RuntimeException("Não podemos salvar treinamento sem Numero de série");
	 		}
	 	if(entidade.getNumeroTreino()==null) {
	 		throw new RuntimeException("Não podemos salvar treinamento sem Numero de treino");
	 		}
	 	if(entidade.getRepeticoes()==null) {
	 		throw new RuntimeException("Não podemos salvar treinamento sem repeticoes");
	 		}
	 	 if(entidade.getSerieTotal()==null) {
	 		throw new RuntimeException("Não podemos salvar treinamento sem Séries totais");
	 		}
	 	 if(entidade.getSistema()==null) {
	 		throw new RuntimeException("Não podemos salvar treinamento sem Sistema");
	 		}
	 	 if(entidade.getVelocidade()==null) {
	 		throw new RuntimeException("Não podemos salvar treinamento sem Velocidade");
	 		
			    }
	 	// repository.save(entidade);
		 }
	
	public void nsei(EstruturaTreinamento entidade) {
	//	if(entidade.getDivisao()()==Divisao.AB) {
			entidade.setNumeroSerie(entidade.getFrequeSemanal());
			entidade.setIntervalo(1);
			entidade.setVelocidade(Velocidade.MOD);
			entidade.setFrequeSemanal(3);
			entidade.setDivisao(Divisao.GLOBAL);
			entidade.setMetodo(Metodo.ALTER);
			entidade.setNumeroTreino(12);
			entidade.setNumerosemana(4);
		}
		//repository.save(entidade);
	}
	
		

	
	
	

