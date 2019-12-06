package br.com.gerenciamento_visitas.gerenciamento.teste;

import java.util.Date;
import br.com.gerenciamento_visitas.gerenciamento.model.Visita;

public class MockVisita {
	public Visita GetVisita() {
		return new Visita(1, new Date(), 1, "Edjaine", "Avenida Giovanni Attilio", (float) 10.0 );	
	}	
}
