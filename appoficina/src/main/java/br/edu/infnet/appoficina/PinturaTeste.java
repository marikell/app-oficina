package br.edu.infnet.appoficina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appoficina.model.domain.Pintura;
import br.edu.infnet.appoficina.model.domain.TipoMassaAplicada;
import br.edu.infnet.appoficina.model.domain.TipoPintura;
import br.edu.infnet.appoficina.service.PinturaService;

@Order(7)
@Component
public class PinturaTeste implements ApplicationRunner {

	@Autowired
	private PinturaService pinturaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.criar();
	}

	private void criar() {
		Pintura pintura1 = new Pintura();
		pintura1.setCorTexto("#FFFFFF");
		pintura1.setValor(20);
		pintura1.setTipoMassaAplicada(TipoMassaAplicada.Acrilica);
		pintura1.setTipoPintura(TipoPintura.Metalica);
		
		Pintura pintura2 = new Pintura();		
		pintura2.setValor(10);
		pintura2.setTipoMassaAplicada(TipoMassaAplicada.Poliester);
		pintura2.setTipoPintura(TipoPintura.Solida);
		pintura2.setCorTexto("#FFFFFF");

		Pintura pintura3 = new Pintura();		
		pintura3.setValor(44);
		pintura3.setTipoMassaAplicada(TipoMassaAplicada.Plastica);
		pintura3.setTipoPintura(TipoPintura.Perolizada);		
		pintura3.setCorTexto("#FFFFFF");

		pinturaService.incluir(pintura1);
		pinturaService.incluir(pintura2);
		pinturaService.incluir(pintura3);
	}
}
