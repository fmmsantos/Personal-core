package com.fabisoft.personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabisoft.personal.domain.v1.Treinamento;

public interface TreinamentoRepository extends JpaRepository<Treinamento, Long> {

}
