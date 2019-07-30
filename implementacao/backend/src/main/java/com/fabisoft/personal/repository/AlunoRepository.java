package com.fabisoft.personal.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fabisoft.personal.domain.Aluno;


@Repository
public class AlunoRepository {
	@PersistenceContext
	protected EntityManager em;
	
	public List<Aluno> listar(){
		String sql = "Select a from Aluno a";
		Query query = em.createQuery(sql, Aluno.class);
        List<Aluno> alunos = query.getResultList();
		return alunos;
	}
	
   
	@Transactional
	public Aluno gravar(Aluno aluno) {
		aluno = em.merge(aluno);
		return aluno;
	}
	@Transactional
	public void salvar(Object entidade) {
		em.persist(entidade);
	}
	public Aluno listarById(Long id) {
	String	jpqlid = "select a from Aluno a where a.id=:id";
	
	TypedQuery<Aluno> entityM = em.createQuery(jpqlid, Aluno.class);
	entityM.setParameter("id", id);
	Aluno aluno = entityM.getSingleResult();	
		return aluno;
	}

	public Aluno deleteById(Long id) {
		Aluno aluno = em.find(Aluno.class, id);
		em.remove(aluno);
		return aluno;
	}
}
