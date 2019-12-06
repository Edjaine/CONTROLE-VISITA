package br.com.gerenciamento_visitas.gerenciamento.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Visita {
	public Visita(int id, Date dataVisita, int representanteId, String nomeCliente, String enderecoCliente,
			Float valorDeslocamento) {
		Id = id;
		DataVisita = dataVisita;
		RepresentanteId = representanteId;
		NomeCliente = nomeCliente;
		EnderecoCliente = enderecoCliente;
		ValorDeslocamento = valorDeslocamento;
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id ;
	private Date DataVisita ;
	private int RepresentanteId;
	private String NomeCliente;
	private String EnderecoCliente;
	private Float ValorDeslocamento;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDataVisita() {
		return DataVisita;
	}
	public void setDataVisita(Date dataVisita) {
		DataVisita = dataVisita;
	}
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

}
