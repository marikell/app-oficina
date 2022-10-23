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
		Oficina oficina1 = new Oficina();
		oficina1.setNome("Oficina do João");
		oficina1.setCidade("Santo André");
		oficina1.setEndereco("Rua santo andré");
		oficina1.setBairro("Bairro da luz");
		oficina1.setEstado("SP");		

		Oficina oficina2 = new Oficina();
		oficina2.setNome("Oficina do Marco");
		oficina2.setCidade("São Paulo");
		oficina2.setEndereco("Rua são paulo");
		oficina2.setBairro("Bairro de SP");
		oficina2.setEstado("SP");	
		
		Oficina oficina3 = new Oficina();
		oficina3.setNome("Oficina do Paulo");
		oficina3.setCidade("Itu");
		oficina3.setEndereco("Rua itu");
		oficina3.setEstado("SP");
		oficina3.setBairro("Bairro de Itu");
		oficina3.setComplemento("Apt 231");
		
		exibir(oficina1);
		exibir(oficina2);
		exibir(oficina3);
	}
	
	private void exibir(Oficina oficina) {
		System.out.println("Oficina - " + oficina);
	}
}
