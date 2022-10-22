package br.edu.infnet.appoficina;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Higienizacao;
import br.edu.infnet.appoficina.model.domain.TipoHigienizacao;

@Component
public class HigienizacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Higienizacao h1 = new Higienizacao();
		h1.nome = "Higienização";
		h1.tipoHigienizacao = TipoHigienizacao.Aspiracao;
		h1.valor = 20;

		Higienizacao h2 = new Higienizacao();
		h2.nome = "Higienização";
		h2.tipoHigienizacao = TipoHigienizacao.Completa;
		h2.valor = 100;
		
		Higienizacao h3 = new Higienizacao();
		h3.nome = "Higienização";
		h3.tipoHigienizacao = TipoHigienizacao.EscovacaoTeto;
		h3.valor = 44;
		
		exibir(h1);
		exibir(h2);
		exibir(h3);
	}
	
	private void exibir(Higienizacao higienizacao) {
		System.out.println("Higienização - " + higienizacao);
	}
}
