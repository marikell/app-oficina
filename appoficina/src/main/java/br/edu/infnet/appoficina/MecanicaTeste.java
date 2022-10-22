package br.edu.infnet.appoficina;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Mecanica;
import br.edu.infnet.appoficina.model.domain.TipoManutencao;

@Component
public class MecanicaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Mecanica m1 = new Mecanica();
		m1.nome = "Higienização";
		m1.tipoManutencao = TipoManutencao.Motor;
		m1.valor = 20;

		Mecanica m2 = new Mecanica();
		m2.nome = "Higienização";
		m2.tipoManutencao = TipoManutencao.SistemaFreios;
		m2.valor = 100;
		
		Mecanica m3 = new Mecanica();
		m3.nome = "Higienização";
		m3.tipoManutencao = TipoManutencao.SistemaFreios;
		m3.valor = 44;
		
		exibir(m1);
		exibir(m2);
		exibir(m3);
	}
	
	private void exibir(Mecanica mecanica) {
		System.out.println("Mecânica - " + mecanica);
	}
}
