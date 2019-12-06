package br.com.gerenciamento_visitas.gerenciamento.teste;

import java.util.*;
import java.util.Date;
import br.com.gerenciamento_visitas.gerenciamento.model.Visita;


public class MockVisita {
	public List<Visita> GetVisita() {
		List<Visita> visitas = new ArrayList<Visita>();; 
		visitas.add(new Visita(1, new Date(), 1, "Edjaine Oliveira", "Avenida Giovanni Attilio", (float) 10.0 ));
		return visitas;	
	}	
}
