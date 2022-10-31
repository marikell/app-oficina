package br.edu.infnet.appoficina;

import java.awt.Color;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.controller.ServicoController;
import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.model.domain.Mecanica;
import br.edu.infnet.appoficina.model.domain.Pintura;
import br.edu.infnet.appoficina.model.domain.TipoHigienizacao;
import br.edu.infnet.appoficina.model.domain.TipoLimpeza;
import br.edu.infnet.appoficina.model.domain.TipoManutencao;
import br.edu.infnet.appoficina.model.domain.TipoMassaAplicada;
import br.edu.infnet.appoficina.model.domain.TipoPintura;
import br.edu.infnet.appoficina.model.domain.TipoVeiculo;

@Component
public class ServicoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Higienizacao higienizacao = new Higienizacao();
		higienizacao.setNome("Higienização");
		higienizacao.setTipoHigienizacao(TipoHigienizacao.Aspiracao);
		higienizacao.setValor(20);
		higienizacao.setCodigo("001");
		higienizacao.setNecessarioArmazenamentoItensVeiculo(true);
		higienizacao.setTipoLimpeza(TipoLimpeza.Media);
		
		Mecanica mecanica = new Mecanica();
		mecanica.setNome("Mecânica");
		mecanica.setTipoManutencao(TipoManutencao.SistemaFreios);
		mecanica.setValor(100);
		mecanica.setCodigo("002");
		mecanica.setTipoVeiculo(TipoVeiculo.Carro);
		mecanica.setPlaca("ABC456");
		
		Pintura pintura = new Pintura();
		pintura.setNome("Pintura");
		pintura.setValor(20);
		pintura.setTipoMassaAplicada(TipoMassaAplicada.Acrilica);
		pintura.setTipoPintura(TipoPintura.Metalica);
		pintura.setCodigo("003");
		pintura.setCor(new Color(255,200,100));
		
		ServicoController.incluir(pintura);
		ServicoController.incluir(mecanica);
		ServicoController.incluir(higienizacao);
	}
}
