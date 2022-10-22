package br.edu.infnet.appoficina;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Pintura;
import br.edu.infnet.appoficina.model.domain.TipoMassaAplicada;
import br.edu.infnet.appoficina.model.domain.TipoPintura;

@Component
public class PinturaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Pintura p1 = new Pintura();
		p1.nome = "Pintura";
		p1.valor = 20;
		p1.tipoMassaAplicada = TipoMassaAplicada.Acrilica;
		p1.tipoPintura = TipoPintura.Metalica;

		Pintura p2 = new Pintura();
		p2.nome = "Pintura";
		p2.valor = 10;
		p2.tipoMassaAplicada = TipoMassaAplicada.Poliester;
		p2.tipoPintura = TipoPintura.Solida;
		
		Pintura p3 = new Pintura();
		p3.nome = "Pintura";
		p3.valor = 44;
		p3.tipoMassaAplicada = TipoMassaAplicada.Plastica;
		p3.tipoPintura = TipoPintura.Perolizada;		
		
		exibir(p1);
		exibir(p2);
		exibir(p3);
	}
	
	private void exibir(Pintura pintura) {
		System.out.println("Pintura - " + pintura);
	}
}
