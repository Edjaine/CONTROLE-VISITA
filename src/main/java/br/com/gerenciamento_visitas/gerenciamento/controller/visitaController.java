package br.com.gerenciamento_visitas.gerenciamento.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciamento_visitas.gerenciamento.controller.dto.VisitaDto;
import br.com.gerenciamento_visitas.gerenciamento.model.Visita;
import br.com.gerenciamento_visitas.gerenciamento.teste.MockVisita;

@RestController
public class visitaController {
	
	@RequestMapping("/")	
	public VisitaDto get() {
		Visita visita = new MockVisita().GetVisita();
		return new VisitaDto(visita);
	}		
}
