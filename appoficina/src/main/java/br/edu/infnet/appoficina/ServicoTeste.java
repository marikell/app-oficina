package br.edu.infnet.appoficina;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Servico;

@Component
public class ServicoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Servico s1 = new Servico();
		s1.nome = "Serviço";
		s1.valor = 20;

		Servico s2 = new Servico();
		s2.nome = "Serviço";
		s2.valor = 10;

		Servico s3 = new Servico();
		s3.nome = "Serviço";
		s3.valor = 44;	
		
		exibir(s1);
		exibir(s2);
		exibir(s3);
	}
	
	private void exibir(Servico servico) {
		System.out.println("Serviço - " + servico);
	}
}
