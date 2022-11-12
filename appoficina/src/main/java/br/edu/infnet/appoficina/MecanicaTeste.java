package br.edu.infnet.appoficina;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.model.domain.Mecanica;
import br.edu.infnet.appoficina.model.domain.Oficina;
import br.edu.infnet.appoficina.model.domain.TipoManutencao;
import br.edu.infnet.appoficina.model.domain.TipoVeiculo;
import br.edu.infnet.appoficina.service.GerenteService;
import br.edu.infnet.appoficina.service.MecanicaService;
import br.edu.infnet.appoficina.service.OficinaService;

@Order(6)
@Component
public class MecanicaTeste implements ApplicationRunner {

	@Autowired
	private MecanicaService mecanicaService;
	
	@Autowired
	private GerenteService gerenteService;
	
	@Autowired
	private OficinaService oficinaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Pedro Silva");
		gerente1.setCpf("243232423");
		gerente1.setEmail("pedro.silva@oficina.com.br");
		gerente1.setDataContratacao(Calendar.getInstance());
		
		gerenteService.incluir(gerente1);
		
		Oficina oficina1 = new Oficina(gerente1);
		oficina1.setNome("Oficina Alto da Paz");
		oficina1.setCidade("São Roque");
		oficina1.setEndereco("Rua São Roque");
		oficina1.setBairro("Bairro de SR");
		oficina1.setEstado("SP");	
		
		oficinaService.incluir(oficina1);
		
		Mecanica mecanica1 = new Mecanica();
		mecanica1.setTipoManutencao(TipoManutencao.Motor);
		mecanica1.setValor(20);
		mecanica1.setTipoVeiculo(TipoVeiculo.Caminhao);
		mecanica1.setPlaca("ABC123");
		mecanica1.setOficina(oficina1);

		Mecanica mecanica2 = new Mecanica();
		mecanica2.setTipoManutencao(TipoManutencao.SistemaFreios);
		mecanica2.setValor(100);
		mecanica2.setTipoVeiculo(TipoVeiculo.Carro);
		mecanica2.setPlaca("ABC456");
		mecanica2.setOficina(oficina1);
		
		Mecanica mecanica3 = new Mecanica();
		mecanica3.setTipoManutencao(TipoManutencao.SistemaFreios);
		mecanica3.setValor(44);
		mecanica3.setTipoVeiculo(TipoVeiculo.Moto);
		mecanica3.setPlaca("ABC789");
		mecanica3.setOficina(oficina1);
		
		mecanicaService.incluir(mecanica1);
		mecanicaService.incluir(mecanica2);
		mecanicaService.incluir(mecanica3);
	}
}
