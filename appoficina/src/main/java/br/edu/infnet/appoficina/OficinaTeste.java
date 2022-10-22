package br.edu.infnet.appoficina;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Oficina;

@Component
public class OficinaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Oficina m1 = new Oficina();
		m1.nome = "Oficina do João";
		m1.cidade = "Santo André";
		m1.endereco = "Rua santo andré";
		m1.estado = "SP";		

		Oficina m2 = new Oficina();
		m2.nome = "Oficina do Marco";
		m2.cidade = "São Paulo";
		m2.endereco = "Rua são paulo";
		m2.estado = "SP";	
		
		Oficina m3 = new Oficina();
		m3.nome = "Oficina do Paulo";
		m3.cidade = "Itu";
		m3.endereco = "Rua itu";
		m3.estado = "SP";	
		
		exibir(m1);
		exibir(m2);
		exibir(m3);
	}
	
	private void exibir(Oficina oficina) {
		System.out.println("Oficina - " + oficina);
	}
}
