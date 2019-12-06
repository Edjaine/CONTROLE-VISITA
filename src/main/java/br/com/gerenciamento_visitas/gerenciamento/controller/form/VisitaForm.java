package br.com.gerenciamento_visitas.gerenciamento.controller.form;

import java.util.Date;

import br.com.gerenciamento_visitas.gerenciamento.model.Visita;

public class VisitaForm {
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
	private int RepresentanteId;
	private String NomeCliente;
	private String EnderecoCliente;
	private Float ValorDeslocamento;
	public Visita converter() {		
		return new Visita(this);
	}
}
