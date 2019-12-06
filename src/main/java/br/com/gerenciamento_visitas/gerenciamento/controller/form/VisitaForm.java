package br.com.gerenciamento_visitas.gerenciamento.controller.form;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import br.com.gerenciamento_visitas.gerenciamento.model.Visita;
import br.com.gerenciamento_visitas.gerenciamento.repository.VisitaRepository;

public class VisitaForm {
	
	private int RepresentanteId;
	@NotNull @NotEmpty
	private String NomeCliente;
	@NotNull @NotEmpty
	private String EnderecoCliente;
	private Float ValorDeslocamento;

	public int getRepresentanteId() {
		return RepresentanteId;
	}
	public void setRepresentanteId(int representanteId) {
		RepresentanteId = representanteId;
	}
	public String getNomeCliente() {
		return NomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		NomeCliente = nomeCliente;
	}
	public String getEnderecoCliente() {
		return EnderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		EnderecoCliente = enderecoCliente;
	}
	public Float getValorDeslocamento() {
		return ValorDeslocamento;
	}
	public void setValorDeslocamento(Float valorDeslocamento) {
		ValorDeslocamento = valorDeslocamento;
	}
	
	
	public Visita converter() {		
		return new Visita(this);
	}
	
	public Visita atualizar(VisitaRepository visitaRepository, @Valid long id) {
		
		Visita visita = visitaRepository.getOne(id);
		visita.setEnderecoCliente(this.EnderecoCliente);
		visita.setNomeCliente(this.NomeCliente);
		visita.setRepresentanteId(this.RepresentanteId);
		visita.setValorDeslocamento(this.ValorDeslocamento);		
		
		return visita;
	}
}
