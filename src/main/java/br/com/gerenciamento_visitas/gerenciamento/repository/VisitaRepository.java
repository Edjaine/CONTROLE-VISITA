package br.com.gerenciamento_visitas.gerenciamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gerenciamento_visitas.gerenciamento.model.Visita;

public interface VisitaRepository extends JpaRepository<Visita, Long>{

}
