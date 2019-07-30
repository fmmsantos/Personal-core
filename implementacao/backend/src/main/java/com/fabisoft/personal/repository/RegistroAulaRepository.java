package com.fabisoft.personal.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fabisoft.personal.domain.Aluno;
import com.fabisoft.personal.domain.RegistroAula;

@Repository
public class RegistroAulaRepository {
	@PersistenceContext
	protected EntityManager entity;
	
	// lista todos
	public List<RegistroAula> listar(){
		String sql= "select a from RegistroAula a";
		Query query = entity.createQuery(sql, RegistroAula.class);
		List<RegistroAula> aulas = query.getResultList();
		return aulas;
	}
	// salva todos
	@Transactional
	public RegistroAula salvar(RegistroAula aula) {
	RegistroAula a = entity.merge(aula);	
	return a;
	}
	// lista por id
	public RegistroAula listarById(Long id) {
	String	sql = "select a from RegistroAula a where a.id=:id";
	TypedQuery<RegistroAula> a = entity.createQuery(sql,RegistroAula.class);
	a.setParameter("id", id);
	RegistroAula aula = a.getSingleResult();	
	return aula;
			
	}
	//atualizar
	@Transactional
	public RegistroAula atualizer(RegistroAula aula) {
	RegistroAula a = entity.merge(aula);	
	return a;
	}
	
	// deletar
	@Transactional
	public RegistroAula deletebyId(Long id) {
	RegistroAula r = entity.find(RegistroAula.class, id);
	entity.remove(r);
	return r;
		
	}
	

}
