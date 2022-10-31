package br.edu.infnet.appoficina;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.controller.HigienizacaoController;
import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.model.domain.TipoHigienizacao;
import br.edu.infnet.appoficina.model.domain.TipoLimpeza;

@Component
public class HigienizacaoTeste implements ApplicationRunner {

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

		HigienizacaoController.incluir(higienizacao1);
		HigienizacaoController.incluir(higienizacao2);
		HigienizacaoController.incluir(higienizacao3);
	}
}
