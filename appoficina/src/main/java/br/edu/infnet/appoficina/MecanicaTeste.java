package br.edu.infnet.appoficina;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Mecanica;
import br.edu.infnet.appoficina.model.domain.TipoManutencao;
import br.edu.infnet.appoficina.model.domain.TipoVeiculo;

@Component
public class MecanicaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Mecanica mecanica1 = new Mecanica();
		mecanica1.setNome("Mecânica");
		mecanica1.setTipoManutencao(TipoManutencao.Motor);
		mecanica1.setValor(20);
		mecanica1.setCodigo("002");
		mecanica1.setTipoVeiculo(TipoVeiculo.Caminhão);
		mecanica1.setPlaca("ABC123");

		Mecanica mecanica2 = new Mecanica();
		mecanica2.setNome("Mecânica");
		mecanica2.setTipoManutencao(TipoManutencao.SistemaFreios);
		mecanica2.setValor(100);
		mecanica2.setCodigo("002");
		mecanica2.setTipoVeiculo(TipoVeiculo.Carro);
		mecanica2.setPlaca("ABC456");
		
		Mecanica mecanica3 = new Mecanica();
		mecanica3.setNome("Mecânica");
		mecanica3.setTipoManutencao(TipoManutencao.SistemaFreios);
		mecanica3.setValor(44);
		mecanica3.setCodigo("002");
		mecanica3.setTipoVeiculo(TipoVeiculo.Moto);
		mecanica3.setPlaca("ABC789");
		
		exibir(mecanica1);
		exibir(mecanica2);
		exibir(mecanica3);
	}
	
	private void exibir(Mecanica mecanica) {
		System.out.println("Mecânica - " + mecanica);
	}
}
