package com.fabisoft.personal.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabisoft.personal.domain.v1.Fase;
import com.fabisoft.personal.repository.FaseRepository;

@RestController
@RequestMapping("/fases")
public class FaseResource {
	
	@Autowired
	private FaseRepository faseRepo;
	
	@GetMapping
	public List<Fase> listarTodos(){
		List<Fase> fases = faseRepo.findAll();
		return fases; 
	}
	@GetMapping("/{id}")
	public Fase buscarId(@PathVariable Long id) {
		Optional<Fase> resultado= faseRepo.findById(id);
		return resultado.isPresent()?resultado.get():null;
			
	}
	
	@PostMapping
	public Fase save(@RequestBody Fase fase) {
	 fase = faseRepo.save(fase)	;
	 return fase;
	}
	
	 @DeleteMapping("/{id}")
	 public void remove(@PathVariable Long id){
		Optional<Fase> resultado = faseRepo.findById(id);
		//if(resultado.isPresent()) {
			//faseRepo.delete(resultado.get());
			//outra opcap
			Fase fase = resultado.get();
			fase.setExcluido(true);
			faseRepo.save(fase);
			
	 }
	 @PutMapping("/{id}")
	 public Fase editar(@RequestBody Fase fase ) {
		 return  faseRepo.save(fase);
	 }

}

