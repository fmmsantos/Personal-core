package com.fabisoft.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fabisoft.personal.domain.EstruturaTreinamento;
import com.fabisoft.personal.domain.v1.Fase;
import com.fabisoft.personal.domain.v1.Repeticao;
import com.fabisoft.personal.enuns.Ciclo;
import com.fabisoft.personal.enuns.Divisao;
import com.fabisoft.personal.enuns.Metodo;

import com.fabisoft.personal.enuns.Sistema;
import com.fabisoft.personal.enuns.Velocidade;
import com.fabisoft.personal.repository.AlunoRepository;
import com.fabisoft.personal.repository.FaseRepository;
import com.fabisoft.personal.service.EstruTreinamentoService;

@SpringBootApplication
@EnableJpaRepositories
public class PersonalApp {
	
	@Autowired
	private FaseRepository faseRep;
	
	public static void main(String[] args) {
		SpringApplication.run(PersonalApp.class, args);		
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
        return args -> {
        	
        	Fase fase = new Fase();
        	fase.setCiclo(Ciclo.MACRO);
        	fase.setDivisao(Divisao.AB);
        	fase.setFrequeSemanal(new Repeticao(10,15));
        	fase.setIntervalo(new Repeticao(1,3));
        	fase.setMetodo(Metodo.CIRC);
        	fase.setNome("A");
        	fase.setNumeroExercicios(new Repeticao(15,20));
        	fase.setNumerosemana(new Repeticao (4,6));
        	fase.setNumeroSerie(new Repeticao(2,3));
        	fase.setNumeroTreino(new Repeticao(16,20));
        	fase.setRepeticoes(new Repeticao(10,12));
        	fase.setSerieTotal(new Repeticao(15,20));
        	fase.setSistema(Sistema.SM);
        	fase.setVelocidade(Velocidade.MOD);
        	
        	//faseRep.save(fase);
        	
        
};
	}
}

