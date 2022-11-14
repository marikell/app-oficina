package br.edu.infnet.appoficina;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.model.domain.Oficina;
import br.edu.infnet.appoficina.model.domain.TipoHigienizacao;
import br.edu.infnet.appoficina.model.domain.TipoLimpeza;
import br.edu.infnet.appoficina.service.GerenteService;
import br.edu.infnet.appoficina.service.HigienizacaoService;
import br.edu.infnet.appoficina.service.OficinaService;

@Order(5)
@Component
public class HigienizacaoTeste implements ApplicationRunner {

	@Autowired
	private HigienizacaoService higienizacaoService;
	
	@Autowired
	private GerenteService gerenteService;
	
	@Autowired
	private OficinaService oficinaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
//		Gerente gerente1 = new Gerente();
//		gerente1.setNome("Marco Silva");
//		gerente1.setCpf("2324342321");
//		gerente1.setEmail("marco.silva@oficina.com.br");
//		gerente1.setDataContratacao(Calendar.getInstance());
//		
//		gerenteService.incluir(gerente1);
//		
//		Oficina oficina1 = new Oficina(gerente1);
//		oficina1.setNome("Oficina Auto");
//		
//		oficinaService.incluir(oficina1);
//		
//		Higienizacao higienizacao1 = new Higienizacao();
//		higienizacao1.setTipoHigienizacao(TipoHigienizacao.Aspiracao);
//		higienizacao1.setValor(20);
//		higienizacao1.setNecessarioArmazenamentoItensVeiculo(false);
//		higienizacao1.setTipoLimpeza(TipoLimpeza.Intensa);
//		higienizacao1.setOficina(oficina1);
//		
//		Higienizacao higienizacao2 = new Higienizacao();
//		higienizacao2.setTipoHigienizacao(TipoHigienizacao.Completa);
//		higienizacao2.setValor(100);
//		higienizacao2.setNecessarioArmazenamentoItensVeiculo(true);
//		higienizacao2.setTipoLimpeza(TipoLimpeza.Media);
//		higienizacao2.setOficina(oficina1);
//		
//		Higienizacao higienizacao3 = new Higienizacao();
//		higienizacao3.setTipoHigienizacao(TipoHigienizacao.EscovacaoTeto);
//		higienizacao3.setValor(44);
//		higienizacao3.setNecessarioArmazenamentoItensVeiculo(false);
//		higienizacao3.setTipoLimpeza(TipoLimpeza.Leve);
//		higienizacao3.setOficina(oficina1);
//		
//		higienizacaoService.incluir(higienizacao1);
//		higienizacaoService.incluir(higienizacao2);
//		higienizacaoService.incluir(higienizacao3);
	}
}
