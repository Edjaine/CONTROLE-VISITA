package br.com.gerenciamento_visitas.gerenciamento.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.gerenciamento_visitas.gerenciamento.controller.dto.VisitaDto;
import br.com.gerenciamento_visitas.gerenciamento.controller.form.VisitaForm;
import br.com.gerenciamento_visitas.gerenciamento.model.Visita;
import br.com.gerenciamento_visitas.gerenciamento.repository.VisitaRepository;


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
	public ResponseEntity<VisitaDto> cadastra(@RequestBody @Valid VisitaForm form, UriComponentsBuilder uriBuilder) {
		Visita visita = form.converter();
		visitaRepository.save(visita);
		URI uri = uriBuilder.path("/visita/{id}").buildAndExpand(visita.getId()).toUri();
		return ResponseEntity.created(uri).body(new VisitaDto(visita));
		
	}
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<VisitaDto> atualiza(@PathVariable long id, @RequestBody VisitaForm form, UriComponentsBuilder uriBuilder){
		
		Visita visita = form.atualizar(visitaRepository, id);
		return ResponseEntity.ok(new VisitaDto(visita));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remove(@PathVariable long id){
		visitaRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
