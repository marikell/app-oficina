package br.edu.infnet.appoficina;

import java.awt.Color;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.controller.PinturaController;
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
		Pintura pintura1 = new Pintura();
		pintura1.setNome("Pintura");
		pintura1.setValor(20);
		pintura1.setTipoMassaAplicada(TipoMassaAplicada.Acrilica);
		pintura1.setTipoPintura(TipoPintura.Metalica);
		pintura1.setCodigo("003");
		pintura1.setCor(new Color(255, 255, 255));
		
		Pintura pintura2 = new Pintura();
		pintura2.setNome("Pintura");
		pintura2.setValor(10);
		pintura2.setTipoMassaAplicada(TipoMassaAplicada.Poliester);
		pintura2.setTipoPintura(TipoPintura.Solida);
		pintura2.setCodigo("003");
		pintura2.setCor(new Color(200, 255, 255));

		Pintura pintura3 = new Pintura();
		pintura3.setNome("Pintura");
		pintura3.setValor(44);
		pintura3.setTipoMassaAplicada(TipoMassaAplicada.Plastica);
		pintura3.setTipoPintura(TipoPintura.Perolizada);		
		pintura3.setCodigo("003");
		pintura3.setCor(new Color(159, 255, 255));

		PinturaController.incluir(pintura1);
		PinturaController.incluir(pintura2);
		PinturaController.incluir(pintura3);
	}
}
