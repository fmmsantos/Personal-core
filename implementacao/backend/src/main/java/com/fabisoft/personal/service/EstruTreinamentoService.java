package com.fabisoft.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabisoft.personal.domain.EstruturaTreinamento;
import com.fabisoft.personal.repository.EstruTreinamRepository;

@Service
public class EstruTreinamentoService {
	@Autowired private EstruTreinamRepository repository;
	
	public void salvar(EstruturaTreinamento entidade) {
		if(entidade.getNivel()==null)
			throw new RuntimeException("Não podemos salvar treinamento sem nivel");
		repository.save(entidade);
		
	}
	
}
