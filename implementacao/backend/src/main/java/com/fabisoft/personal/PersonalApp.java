package com.fabisoft.personal;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fabisoft.personal.domain.Aluno;
import com.fabisoft.personal.domain.RegistroAula;
import com.fabisoft.personal.repository.AlunoRepository;

@SpringBootApplication
@EnableJpaRepositories
public class PersonalApp {
	public static void main(String[] args) {
		SpringApplication.run(PersonalApp.class, args);
	}

	@Bean
	public CommandLineRunner run(AlunoRepository aRepository) {
		return args -> {
			/*
			Aluno a = new Aluno();
			a.setNome("FABIANA");
			aRepository.gravar(a);
			*/
			Aluno b = aRepository.listarById(2L);
			RegistroAula ra = new RegistroAula();
			ra.setAluno(b);
			ra.setData(new Date());
			if(ra.getResumoDia()==null)
				System.out.println("Informar o resumo do dia");
			ra.setResumoDia("CANSADO");
			aRepository.salvar(ra);
			System.exit(0);
		};
	};
	
}
