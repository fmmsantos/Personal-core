package com.fabisoft.personal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fabisoft.personal.domain.EstruturaTreinamento;
import com.fabisoft.personal.enuns.Divisao;
import com.fabisoft.personal.enuns.Metodo;

import com.fabisoft.personal.enuns.Sistema;
import com.fabisoft.personal.enuns.Velocidade;
import com.fabisoft.personal.repository.AlunoRepository;
import com.fabisoft.personal.service.EstruTreinamentoService;

@SpringBootApplication
@EnableJpaRepositories
public class PersonalApp {
	public static void main(String[] args) {
		SpringApplication.run(PersonalApp.class, args);
	}
	
}
