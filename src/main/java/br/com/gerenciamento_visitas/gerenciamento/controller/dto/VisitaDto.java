package br.com.gerenciamento_visitas.gerenciamento.controller.dto;

import java.util.Date;

import br.com.gerenciamento_visitas.gerenciamento.model.Visita;

public class VisitaDto {
	public VisitaDto(Visita visita) {
		this.id = visita.getId();
		this.dataVisita = visita.getDataVisita();
		this.representanteId = visita.getRepresentanteId();
		this.nomeCliente = visita.getNomeCliente();
		this.enderecoCliente = visita.getEnderecoCliente();
		this.valorDeslocamento = visita.getValorDeslocamento();
	}
	private Long id ;
	private Date dataVisita ;
	private int representanteId;
	private String nomeCliente;
	private String enderecoCliente;
	private Float valorDeslocamento;

	public Long getId() {
		return id;
	}
	public Date getDataVisita() {
		return dataVisita;
	}
	public int getRepresentanteId() {
		return representanteId;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public Float getValorDeslocamento() {
		return valorDeslocamento;
	}
}
