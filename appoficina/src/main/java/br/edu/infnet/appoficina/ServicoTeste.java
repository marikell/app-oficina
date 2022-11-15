package br.edu.infnet.appoficina;

import java.awt.Color;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.model.domain.Mecanica;
import br.edu.infnet.appoficina.model.domain.Oficina;
import br.edu.infnet.appoficina.model.domain.Pintura;
import br.edu.infnet.appoficina.model.domain.TipoHigienizacao;
import br.edu.infnet.appoficina.model.domain.TipoLimpeza;
import br.edu.infnet.appoficina.model.domain.TipoManutencao;
import br.edu.infnet.appoficina.model.domain.TipoMassaAplicada;
import br.edu.infnet.appoficina.model.domain.TipoPintura;
import br.edu.infnet.appoficina.model.domain.TipoVeiculo;
import br.edu.infnet.appoficina.service.GerenteService;
import br.edu.infnet.appoficina.service.OficinaService;
import br.edu.infnet.appoficina.service.ServicoService;

@Order(4)
@Component
public class ServicoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}
	
	@Autowired
	private ServicoService servicoService;
	
	@Autowired
	private OficinaService oficinaService;
	
	@Autowired
	private GerenteService gerenteService;

	private void criar() {
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Pablo Silva");
		gerente1.setCpf("11324231");
		gerente1.setEmail("pablo.silva@oficina.com.br");
		gerente1.setDataContratacao(Calendar.getInstance());
		
		gerenteService.incluir(gerente1);

		Oficina oficina1 = new Oficina(gerente1);
		oficina1.setNome("Oficina do Leoncio");
		
		oficinaService.incluir(oficina1);
		
		Higienizacao higienizacao = new Higienizacao();
		higienizacao.setTipoHigienizacao(TipoHigienizacao.Aspiracao);
		higienizacao.setValor(20);
		higienizacao.setNecessarioArmazenamentoItensVeiculo(true);
		higienizacao.setTipoLimpeza(TipoLimpeza.Media);
		higienizacao.setOficina(oficina1);
		
		Mecanica mecanica = new Mecanica();
		mecanica.setTipoManutencao(TipoManutencao.SistemaFreios);
		mecanica.setValor(100);
		mecanica.setTipoVeiculo(TipoVeiculo.Carro);
		mecanica.setPlaca("ABC456");
		mecanica.setOficina(oficina1);
		
		Pintura pintura = new Pintura();
		pintura.setValor(20);
		pintura.setTipoMassaAplicada(TipoMassaAplicada.Acrilica);
		pintura.setTipoPintura(TipoPintura.Metalica);
		pintura.setCor(new Color(255,200,100));
		pintura.setOficina(oficina1);
		
		servicoService.incluir(pintura);
		servicoService.incluir(mecanica);
		servicoService.incluir(higienizacao);
	}
}
