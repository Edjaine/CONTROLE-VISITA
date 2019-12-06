package br.com.gerenciamento_visitas.gerenciamento.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciamento_visitas.gerenciamento.controller.dto.VisitaDto;
import br.com.gerenciamento_visitas.gerenciamento.model.Visita;
import br.com.gerenciamento_visitas.gerenciamento.repository.VisitaRepository;
import br.com.gerenciamento_visitas.gerenciamento.teste.MockVisita;

@RestController
public class visitaController {
	@Autowired
	private VisitaRepository visitaRepository;
	
	@RequestMapping("/")	
	public List<VisitaDto> get() {
		
		
		List<Visita> visitas = visitaRepository.findAll();
		List<VisitaDto> visitasDto = new ArrayList<VisitaDto>();
		
		visitas.forEach((v) -> {
			visitasDto.add(new VisitaDto(v));			
		});

		return visitasDto;

	}		
}
