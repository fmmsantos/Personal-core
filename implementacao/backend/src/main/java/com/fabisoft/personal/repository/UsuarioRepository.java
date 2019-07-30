package com.fabisoft.personal.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {
	@PersistenceContext
	protected EntityManager entity;
	
	
	
	
}

