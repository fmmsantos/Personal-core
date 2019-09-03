package com.fabisoft.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fabisoft.personal.domain.v1.Fase;
import com.fabisoft.personal.domain.v1.Treinamento;
import com.fabisoft.personal.repository.FaseRepository;

public class FaseServiceImp implements FaseService {
	
	@Autowired
	private FaseRepository faseRepo;
	

	@Transactional(readOnly = true)
	
	@Override
	public void  buscarId(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean faseTemTreinamento(Long id) {
	  
		
		return false;
	}

	

}
