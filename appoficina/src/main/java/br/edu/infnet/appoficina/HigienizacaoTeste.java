package br.edu.infnet.appoficina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.model.domain.TipoHigienizacao;
import br.edu.infnet.appoficina.model.domain.TipoLimpeza;
import br.edu.infnet.appoficina.service.HigienizacaoService;

@Order(2)
@Component
public class HigienizacaoTeste implements ApplicationRunner {

	@Autowired
	private HigienizacaoService higienizacaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Higienizacao higienizacao1 = new Higienizacao();
		higienizacao1.setNome("Higienização");
		higienizacao1.setTipoHigienizacao(TipoHigienizacao.Aspiracao);
		higienizacao1.setValor(20);
		higienizacao1.setCodigo("001");
		higienizacao1.setNecessarioArmazenamentoItensVeiculo(false);
		higienizacao1.setTipoLimpeza(TipoLimpeza.Intensa);
		
		Higienizacao higienizacao2 = new Higienizacao();
		higienizacao2.setNome("Higienização");
		higienizacao2.setTipoHigienizacao(TipoHigienizacao.Completa);
		higienizacao2.setValor(100);
		higienizacao2.setCodigo("001");
		higienizacao2.setNecessarioArmazenamentoItensVeiculo(true);
		higienizacao2.setTipoLimpeza(TipoLimpeza.Media);

		Higienizacao higienizacao3 = new Higienizacao();
		higienizacao3.setNome("Higienização");
		higienizacao3.setTipoHigienizacao(TipoHigienizacao.EscovacaoTeto);
		higienizacao3.setValor(44);
		higienizacao3.setCodigo("001");
		higienizacao3.setNecessarioArmazenamentoItensVeiculo(false);
		higienizacao3.setTipoLimpeza(TipoLimpeza.Leve);

		higienizacaoService.incluir(higienizacao1);
		higienizacaoService.incluir(higienizacao2);
		higienizacaoService.incluir(higienizacao3);
	}
}
