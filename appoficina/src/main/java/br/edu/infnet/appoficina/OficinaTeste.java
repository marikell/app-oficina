package br.edu.infnet.appoficina;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Gerente;
import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.model.domain.Mecanica;
import br.edu.infnet.appoficina.model.domain.Oficina;
import br.edu.infnet.appoficina.model.domain.Pintura;
import br.edu.infnet.appoficina.model.domain.Servico;
import br.edu.infnet.appoficina.model.domain.TipoHigienizacao;
import br.edu.infnet.appoficina.model.domain.TipoLimpeza;
import br.edu.infnet.appoficina.model.domain.TipoManutencao;
import br.edu.infnet.appoficina.model.domain.TipoMassaAplicada;
import br.edu.infnet.appoficina.model.domain.TipoPintura;
import br.edu.infnet.appoficina.model.domain.TipoVeiculo;

@Component
public class OficinaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		
		Gerente gerente1 = new Gerente();
		
		gerente1.setCpf("46825182990");
		gerente1.setDataContratacao(Calendar.getInstance());
		gerente1.setEmail("marisilva@gmail.com");
		gerente1.setNome("Maria");
		
		Oficina oficina1 = new Oficina(gerente1);
		oficina1.setNome("Oficina do João");
		oficina1.setCidade("Santo André");
		oficina1.setEndereco("Rua santo andré");
		oficina1.setBairro("Bairro da luz");
		oficina1.setEstado("SP");		
		oficina1.setServicos(ObterServicosPrimeiraOficina());

		Oficina oficina2 = new Oficina(gerente1);
		oficina2.setNome("Oficina do Marco");
		oficina2.setCidade("São Paulo");
		oficina2.setEndereco("Rua são paulo");
		oficina2.setBairro("Bairro de SP");
		oficina2.setEstado("SP");	
		oficina2.setServicos(obterOutrosServicos());

		Oficina oficina3 = new Oficina();
		oficina3.setNome("Oficina do Paulo");
		oficina3.setCidade("Itu");
		oficina3.setEndereco("Rua itu");
		oficina3.setEstado("SP");
		oficina3.setBairro("Bairro de Itu");
		oficina3.setComplemento("Apt 231");
		oficina3.setServicos(obterOutrosServicos());

		exibir(oficina1);
		exibir(oficina2);
		exibir(oficina3);
	}
	
	private List<Servico> ObterServicosPrimeiraOficina(){
		Mecanica mecanica = new Mecanica();
		mecanica.setNome("Mecânica");
		mecanica.setTipoManutencao(TipoManutencao.SistemaFreios);
		mecanica.setValor(100);
		mecanica.setCodigo("002");
		mecanica.setTipoVeiculo(TipoVeiculo.Carro);
		mecanica.setPlaca("ABC456");
		
		List<Servico> servicos = new ArrayList<>();
		
		servicos.add(mecanica);
		
		return servicos;
	}
	
	private List<Servico> obterOutrosServicos(){
		Higienizacao higienizacao = new Higienizacao();
		higienizacao.setNome("Higienização");
		higienizacao.setTipoHigienizacao(TipoHigienizacao.Aspiracao);
		higienizacao.setValor(20);
		higienizacao.setCodigo("001");
		higienizacao.setNecessarioArmazenamentoItensVeiculo(true);
		higienizacao.setTipoLimpeza(TipoLimpeza.Media);

		Pintura pintura = new Pintura();
		pintura.setNome("Pintura");
		pintura.setValor(20);
		pintura.setTipoMassaAplicada(TipoMassaAplicada.Acrilica);
		pintura.setTipoPintura(TipoPintura.Metalica);
		pintura.setCodigo("003");
		pintura.setColor(new Color(255,200,100));
		
		List<Servico> servicos = new ArrayList<>();
		
		servicos.add(higienizacao);
		servicos.add(pintura);
		
		return servicos;
	}
	
	private void exibir(Oficina oficina) {
		System.out.println("Oficina - " + oficina);
	}
}
