package br.com.gerenciamento_visitas.gerenciamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciamento_visitas.gerenciamento.controller.dto.VisitaDto;
import br.com.gerenciamento_visitas.gerenciamento.controller.form.VisitaForm;
import br.com.gerenciamento_visitas.gerenciamento.model.Visita;
import br.com.gerenciamento_visitas.gerenciamento.repository.VisitaRepository;
import br.com.gerenciamento_visitas.gerenciamento.teste.MockVisita;

@RestController
@RequestMapping("/visita")	
public class visitaController {
	@Autowired
	private VisitaRepository visitaRepository;
	
	@GetMapping
	public List<VisitaDto> consultaVisitas() {		
		
		List<Visita> visitas = visitaRepository.findAll();
		List<VisitaDto> visitasDto = new ArrayList<VisitaDto>();
		
		visitas.forEach((v) -> {
			visitasDto.add(new VisitaDto(v));			
		});

		return visitasDto;

	}	
	
	@PostMapping	
	public void cadastra(@RequestBody VisitaForm form) {
		Visita visita = form.converter();
		visitaRepository.save(visita);
	}
}
